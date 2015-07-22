package vn.com.taotv.primefaces.modelView;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.ResourceBundle;

import javax.annotation.PostConstruct;
import javax.el.ELContext;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.portlet.ResourceRequest;
import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.StringUtils;
import org.primefaces.context.RequestContext;
import org.primefaces.event.SelectEvent;
import org.primefaces.model.LazyDataModel;
import org.primefaces.model.SortOrder;

import vn.com.ecopharma.hrm.enumeration.LaborContractType;
import vn.com.ecopharma.hrm.model.Employee;
import vn.com.ecopharma.hrm.model.JTitle;
import vn.com.ecopharma.hrm.model.Level;
import vn.com.ecopharma.hrm.model.SubUnit;
import vn.com.ecopharma.hrm.model.Titles;
import vn.com.ecopharma.hrm.model.University;
import vn.com.ecopharma.hrm.search.EmployeeField;
import vn.com.ecopharma.hrm.service.EmployeeLocalServiceUtil;
import vn.com.ecopharma.hrm.service.JTitleLocalServiceUtil;
import vn.com.ecopharma.hrm.service.LevelLocalServiceUtil;
import vn.com.ecopharma.hrm.service.SubUnitLocalServiceUtil;
import vn.com.ecopharma.hrm.service.TitlesLocalServiceUtil;
import vn.com.ecopharma.hrm.service.UniversityLocalServiceUtil;
import vn.com.taotv.primefaces.modelView.item.AddressObjectItem;
import vn.com.taotv.primefaces.modelView.item.EmployeeInfoItem;
import vn.com.taotv.primefaces.modelView.lazyDataModel.EmployeeLazyDataModel;

import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.faces.portal.context.LiferayFacesContext;
import com.liferay.faces.util.logging.Logger;
import com.liferay.faces.util.logging.LoggerFactory;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.search.BooleanClause;
import com.liferay.portal.kernel.search.BooleanClauseFactoryUtil;
import com.liferay.portal.kernel.search.BooleanClauseOccur;
import com.liferay.portal.kernel.search.BooleanQuery;
import com.liferay.portal.kernel.search.BooleanQueryFactoryUtil;
import com.liferay.portal.kernel.search.Document;
import com.liferay.portal.kernel.search.Field;
import com.liferay.portal.kernel.search.Hits;
import com.liferay.portal.kernel.search.ParseException;
import com.liferay.portal.kernel.search.Query;
import com.liferay.portal.kernel.search.SearchContext;
import com.liferay.portal.kernel.search.SearchContextFactory;
import com.liferay.portal.kernel.search.SearchEngineUtil;
import com.liferay.portal.kernel.search.SearchException;
import com.liferay.portal.kernel.search.StringQueryFactoryUtil;
import com.liferay.portal.kernel.search.TermRangeQuery;
import com.liferay.portal.kernel.search.TermRangeQueryFactoryUtil;
import com.liferay.portal.kernel.search.facet.collector.TermCollector;
import com.liferay.portal.kernel.util.LocaleUtil;
import com.liferay.portal.model.Country;
import com.liferay.portal.service.CountryServiceUtil;
import com.liferay.portal.service.RegionServiceUtil;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.service.UserLocalServiceUtil;
import com.liferay.portal.util.PortalUtil;

@ManagedBean(name = "empView")
@ViewScoped
public class EmployeeView implements Serializable {

	private static final long serialVersionUID = 1L;
	private static final Logger LOGGER = LoggerFactory
			.getLogger(EmployeeView.class);

	private Date dateFrom;
	private Date dateTo;

	private EmployeeInfoItem modifyEmployeeInfoItem;
	private EmployeeInfoItem selectedEmployeeInfoItem;

	private List<Country> countries;

	private String searchInputText;

	private boolean switchToModifyMode = false;

	private boolean showUserTab = false;

	private long deletedEmployeeId;

	private EmployeeLazyDataModel lazyDataModel;

	public LazyDataModel<EmployeeInfoItem> getLazyDataModel() {
		return lazyDataModel;
	}

	@PostConstruct
	public void init() {
		LOGGER.info("On Loading Employees");
		try {

			FacesContext context = FacesContext.getCurrentInstance();
			LiferayFacesContext liferayFacesContext = LiferayFacesContext
					.getInstance();

			System.out.println("CURRENT LOCALE "
					+ context.getViewRoot().getLocale().getCountry());

			System.out.println("CURRENT LOCALE1 "
					+ liferayFacesContext.getLocale().getCountry());
			countries = CountryServiceUtil.getCountries(true);

			lazyDataModel = new EmployeeLazyDataModel() {

				private static final long serialVersionUID = 1L;

				@Override
				public List<EmployeeInfoItem> load(int first, int pageSize,
						String sortField, SortOrder sortOrder,
						Map<String, Object> filters) {

					final SimpleDateFormat sdf = new SimpleDateFormat(
							"dd/MM/yyyy");
					final ELContext elContext = FacesContext
							.getCurrentInstance().getELContext();
					EmployeeView empView = (EmployeeView) FacesContext
							.getCurrentInstance().getApplication()
							.getELResolver()
							.getValue(elContext, null, "empView");
					String dateFromStr = empView.getDateFrom() != null ? sdf
							.format(empView.getDateFrom()) : "";
					String dateToStr = empView.getDateTo() != null ? sdf
							.format(empView.getDateTo()) : "";
					if (dateFromStr != StringUtils.EMPTY) {
						filters.put("joined_dateFrom", dateFromStr);
					}
					if (dateToStr != StringUtils.EMPTY) {
						filters.put("joined_dateTo", dateToStr);
					}
					return super.load(first, pageSize, sortField, sortOrder,
							filters);
				}

			};
			FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO,
					"Load employees", "Employees loaded");

			FacesContext.getCurrentInstance().addMessage(null, message);

			RequestContext.getCurrentInstance().update("growl");
		} catch (SystemException e) {
			e.printStackTrace();
		}
	}

	public void addOneAddress() {
		modifyEmployeeInfoItem.getAddresses().add(new AddressObjectItem());
	}

	public void removeOneAddress(int index) {
		modifyEmployeeInfoItem.getAddresses().get(index).setUIDeleted(true);
	}

	public boolean isSwitchToModifyMode() {
		return switchToModifyMode;
	}

	public void setSwitchToModifyMode(boolean switchToModifyMode) {
		this.switchToModifyMode = switchToModifyMode;
	}

	/**
	 * @param employeeInfoItem
	 */
	public void editEmployee(EmployeeInfoItem employeeInfoItem) {
		switchToModifyMode = true;
		modifyEmployeeInfoItem = employeeInfoItem;
		showUserTab = false;
	}

	/**
	 * on Adding New Employee
	 */
	public void addNewEmployee() {
		switchToModifyMode = true;
		modifyEmployeeInfoItem = null;
		showUserTab = true;
		try {
			modifyEmployeeInfoItem = new EmployeeInfoItem(
					EmployeeLocalServiceUtil
							.createEmployee(CounterLocalServiceUtil.increment()));
			// set default "Male" for employee
			modifyEmployeeInfoItem.getEmployee().setGender("Male");
			modifyEmployeeInfoItem.getEmployee().setLabour_contract_type(
					LaborContractType.UNLIMITED_TIME.toString());
			modifyEmployeeInfoItem.setUser(UserLocalServiceUtil
					.createUser(CounterLocalServiceUtil.increment()));

			modifyEmployeeInfoItem.setjTitle(null);
			modifyEmployeeInfoItem.setLevel(null);
			modifyEmployeeInfoItem.setSubUnit(null);
			modifyEmployeeInfoItem.setTitles(null);
			modifyEmployeeInfoItem.setUniversity(null);
		} catch (SystemException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Cancel modification and switch back to Employee List
	 */
	public void cancelModification() {
		switchToModifyMode = false;
		modifyEmployeeInfoItem = null;
	}

	public void onRowDblSelect(SelectEvent event) {
		System.out.println("on Row Double Click");
		switchToModifyMode = true;
		modifyEmployeeInfoItem = (EmployeeInfoItem) event.getObject();
		showUserTab = false;
	}

	/**
	 * @param event
	 */
	public void save(ActionEvent event) {
		LiferayFacesContext liferayFacesContext = LiferayFacesContext
				.getInstance();
		final ServiceContext serviceContext = liferayFacesContext
				.getServiceContext();
		FacesMessage msg = null;
		if (showUserTab) {
			final Employee employee = modifyEmployeeInfoItem.getEmployee();

			employee.setJobtitleId(modifyEmployeeInfoItem.getjTitle()
					.getJobtitleId());
			employee.setSubUnitId(modifyEmployeeInfoItem.getSubUnit()
					.getSubUnitId());
			employee.setUniversityId(modifyEmployeeInfoItem.getUniversity()
					.getUniversityId());
			employee.setTitlesId(modifyEmployeeInfoItem.getTitles()
					.getTitlesId());
			employee.setLevelId(modifyEmployeeInfoItem.getLevel().getLevelId());
			employee.setGroupId(serviceContext.getScopeGroupId());
			employee.setCompanyId(serviceContext.getCompanyId());

			try {
				final Calendar cal = Calendar.getInstance();
				cal.setTime(employee.getBirthday());
				int day = cal.get(Calendar.DAY_OF_MONTH);
				int month = cal.get(Calendar.MONTH);
				int year = cal.get(Calendar.YEAR);

				EmployeeLocalServiceUtil.addEmployee(employee, serviceContext
						.getUserId(), serviceContext.getCompanyId(), false,
						modifyEmployeeInfoItem.getUserPassword1(),
						modifyEmployeeInfoItem.getUserPassword2(), false,
						modifyEmployeeInfoItem.getUserName(),
						modifyEmployeeInfoItem.getUser().getEmailAddress(), 0,
						"", LocaleUtil.getDefault(), modifyEmployeeInfoItem
								.getUser().getFirstName(),
						modifyEmployeeInfoItem.getUser().getMiddleName(),
						modifyEmployeeInfoItem.getUser().getLastName(), 0, 0,
						employee.getGender().equalsIgnoreCase("male") ? true
								: false, month, day, year,
						new long[] { 20192 }, null, new long[] { 20165 }, null,
						false, 0, modifyEmployeeInfoItem.getAddresses(),
						serviceContext);
				msg = new FacesMessage(FacesMessage.SEVERITY_INFO,
						"Create employee successfully", "Employee "
								+ modifyEmployeeInfoItem.getUser()
										.getFullName() + " has been created");
				FacesContext.getCurrentInstance().addMessage(null, msg);
			} catch (SystemException e) {
				e.printStackTrace();
			} catch (PortalException e) {
				e.printStackTrace();
			}
		} else {
			try {
				System.out.println("SAVE UPDATE Employee");
				EmployeeLocalServiceUtil.update(
						modifyEmployeeInfoItem.getEmployee(),
						modifyEmployeeInfoItem.getUser(),
						modifyEmployeeInfoItem.getjTitle(),
						modifyEmployeeInfoItem.getSubUnit(),
						modifyEmployeeInfoItem.getTitles(),
						modifyEmployeeInfoItem.getLevel(),
						modifyEmployeeInfoItem.getUniversity(),
						modifyEmployeeInfoItem.getAddresses(), serviceContext);
				msg = new FacesMessage(FacesMessage.SEVERITY_INFO,
						"Update employee successfully", "Employee "
								+ modifyEmployeeInfoItem.getUser()
										.getFullName() + " has been updated");
				FacesContext.getCurrentInstance().addMessage(null, msg);
			} catch (SystemException e) {
				e.printStackTrace();
			} catch (PortalException e) {
				e.printStackTrace();
			}
		}
		modifyEmployeeInfoItem = null;
		switchToModifyMode = false;
	}

	/**
	 * usage Set delete flag for employee
	 * 
	 * @param employeeInfoItem
	 */
	/*
	 * public void setDeleteEmployee(EmployeeInfoItem employeeInfoItem) {
	 * 
	 * employeeInfoItem.getEmployee().setIsDeleted(true); try {
	 * EmployeeLocalServiceUtil.markDeletedEmployee(employeeInfoItem
	 * .getEmployee()); } catch (SystemException e) { e.printStackTrace(); }
	 * catch (SearchException e) { e.printStackTrace(); } }
	 */

	public void setDeleteEmployee() {
		try {
			EmployeeLocalServiceUtil.markDeletedEmployee(deletedEmployeeId);
		} catch (SystemException e) {
			e.printStackTrace();
		} catch (SearchException e) {
			e.printStackTrace();
		} catch (PortalException e) {
			e.printStackTrace();
		}
	}

	public void search1() {
		LiferayFacesContext liferayFacesContext = LiferayFacesContext
				.getInstance();

		ResourceRequest req = (ResourceRequest) liferayFacesContext
				.getExternalContext().getRequest();

		HttpServletRequest httpServletRequest = PortalUtil
				.getOriginalServletRequest(PortalUtil
						.getHttpServletRequest(req));

		SearchContext searchContext = SearchContextFactory
				.getInstance(httpServletRequest);

		searchContext.setKeywords("a");
		searchContext.setPortletIds(new String[] { "Primefaces-portlet" });
		searchContext.setEntryClassNames(new String[] { Employee.class
				.getName() });

		TermRangeQuery termRangeQuery = TermRangeQueryFactoryUtil.create(
				searchContext, "modified", "201507040000000",
				"201512040000000", true, true);

		/*
		 * Query stringQuery = StringQueryFactoryUtil
		 * .create("entryClassName: vn.com.ecopharma.hrm.modal.Employee");
		 * 
		 * BooleanClause clause = BooleanClauseFactoryUtil.create(searchContext,
		 * stringQuery, BooleanClauseOccur.MUST.getName());
		 * 
		 * searchContext.setBooleanClauses(new BooleanClause[] { clause });
		 */

		try {
			Hits hits = SearchEngineUtil.search(searchContext, termRangeQuery);

			List<Document> docs = hits.toList();

			System.out.println(docs.size());
			for (Document doc : docs) {
				System.out.println("PORTLET ID " + doc.getPortletId());
				String emp_code = doc.getField("emp_code") != null ? doc
						.getField("emp_code").getValue() : "";
				System.out.println("EMP CODE  " + emp_code);
			}
		} catch (SearchException e) {
			e.printStackTrace();
		}
	}

	public void search2() {

		final String[] entryClasses = new String[] { Employee.class.getName() };

		final LiferayFacesContext liferayFacesContext = LiferayFacesContext
				.getInstance();

		final ResourceRequest req = (ResourceRequest) liferayFacesContext
				.getExternalContext().getRequest();

		final HttpServletRequest httpServletRequest = PortalUtil
				.getOriginalServletRequest(PortalUtil
						.getHttpServletRequest(req));

		final SearchContext searchContext = SearchContextFactory
				.getInstance(httpServletRequest);

		searchContext.setEntryClassNames(entryClasses);

		/*
		 * Facet assetEntriesFacet = new AssetEntriesFacet(searchContext);
		 * assetEntriesFacet.setStatic(true);
		 * searchContext.addFacet(assetEntriesFacet);
		 * 
		 * Facet scopeFacet = new ScopeFacet(searchContext);
		 * scopeFacet.setStatic(true); searchContext.addFacet(scopeFacet);
		 * 
		 * searchContext.setGroupIds(new long[] {20182L}) ;
		 */

		TermRangeQuery termRangeQuery = TermRangeQueryFactoryUtil.create(
				searchContext, "modified", "201507040000000",
				"201512040000000", true, true);

		/*
		 * TermQuery termQuery = TermQueryFactoryUtil.create(searchContext,
		 * "emp_code", "1");
		 */

		/*
		 * Query stringQuery = StringQueryFactoryUtil
		 * .create("entryClassName: vn.com.ecopharma.hrm.modal.Employee");
		 * 
		 * BooleanClause clause = BooleanClauseFactoryUtil.create(searchContext,
		 * stringQuery, BooleanClauseOccur.MUST.getName());
		 * 
		 * searchContext.setBooleanClauses(new BooleanClause[] { clause });
		 */

		try {

			// Hits hits = SearchEngineUtil.search(searchContext,
			// termRangeQuery);
			// Hits hits = SearchEngineUtil.search(searchContext,
			// termRangeQuery);
			/*
			 * Hits hits = SearchEngineUtil.search(
			 * SearchEngineUtil.getDefaultSearchEngineId(), 20155l,
			 * termRangeQuery, 0, 10);
			 */

			Hits hits = SearchEngineUtil.search(
					SearchEngineUtil.getDefaultSearchEngineId(), 20155l,
					termRangeQuery, QueryUtil.ALL_POS, QueryUtil.ALL_POS);

			final List<Document> docs = hits.toList();

			System.out.println("SEARCH SIZE: " + docs.size());

			for (Document doc : docs) {
				System.out.println("PORTLET ID " + doc.getPortletId());
				String emp_code = doc.getField("emp_code") != null ? doc
						.getField("emp_code").getValue() : "";
				String fullName = doc.getField(EmployeeField.FULL_NAME) != null ? doc
						.getField(EmployeeField.FULL_NAME).getValue() : "";
				long emp_id = doc.getField(EmployeeField.EMPLOYEE_ID) != null ? Long
						.valueOf(doc.getField(EmployeeField.EMPLOYEE_ID)
								.getValue()) : 0l;
				System.out.println("EMP ID  " + emp_id);
				System.out.println("EMP CODE  " + emp_code);
				System.out.println("FULL NAME " + fullName);
			}

			FacesContext context = FacesContext.getCurrentInstance();

			context.addMessage(null, new FacesMessage("Successful",
					"Search results shown"));

		} catch (SearchException e) {
			e.printStackTrace();
		}
	}

	public void search() {
		System.out.println(searchInputText);
		final String[] entryClassNames = new String[] { Employee.class
				.getName() };

		final LiferayFacesContext liferayFacesContext = LiferayFacesContext
				.getInstance();
		final ResourceRequest req = (ResourceRequest) liferayFacesContext
				.getExternalContext().getRequest();

		final HttpServletRequest httpServletRequest = PortalUtil
				.getOriginalServletRequest(PortalUtil
						.getHttpServletRequest(req));

		final SearchContext searchContext = SearchContextFactory
				.getInstance(httpServletRequest);

		searchContext.setEntryClassNames(entryClassNames);
		searchContext.setPortletIds(new String[] { "Primefaces-portlet" });
		// Query query =
		// StringQueryFactoryUtil.getStringQueryFactory().create("");
		Query stringQuery = StringQueryFactoryUtil
				.create("entryClassName: vn.com.ecopharma.hrm.modal.Employee");
		BooleanClause clause = BooleanClauseFactoryUtil.create(searchContext,
				stringQuery, BooleanClauseOccur.MUST.getName());
		/*searchContext.setBooleanClauses(new BooleanClause[] { clause });*/
		BooleanQuery fullQuery = BooleanQueryFactoryUtil.create(searchContext);
		BooleanQuery booleanQuery = BooleanQueryFactoryUtil
				.create(searchContext);
		/*
		 * BooleanQuery booleanQuery2 = BooleanQueryFactoryUtil
		 * .create(searchContext);
		 */
		TermRangeQuery termRangeQuery = TermRangeQueryFactoryUtil.create(
				searchContext, EmployeeField.BIRTHDAY, "201505010000000",
				"201512040000000", true, true);
		try {
//			booleanQuery.addTerm(EmployeeField.FULL_NAME, "a", true);
			booleanQuery.addRequiredTerm(Field.ENTRY_CLASS_NAME, Employee.class.getName());
			/* booleanQuery2.addTerm(EmployeeField.FULL_NAME, "a", true); */

			fullQuery.add(booleanQuery, BooleanClauseOccur.MUST);
			// fullQuery.add(booleanQuery2, BooleanClauseOccur.MUST);
//			fullQuery.add(termRangeQuery, BooleanClauseOccur.MUST);

			Hits hits = SearchEngineUtil.search(
					SearchEngineUtil.getDefaultSearchEngineId(), 20155l,
					fullQuery, QueryUtil.ALL_POS, QueryUtil.ALL_POS);

			List<Document> docs = hits.toList();

			LOGGER.info("SEARCH RESULT SIZE " + hits.toList().size());

			for (Document doc : docs) {
				for (String s : doc.getFields().keySet()) {
					System.out.println(s + " "
							+ doc.getFields().get(s).getValue());
				}
				System.out.println("____________________________________");
			}
			

		} catch (ParseException e) {
			e.printStackTrace();
		} catch (SearchException e) {
			e.printStackTrace();
		}

	}

	public void onCountryChange(int index) {
		try {
			modifyEmployeeInfoItem
					.getAddresses()
					.get(index)
					.setRegions(
							RegionServiceUtil.getRegions(modifyEmployeeInfoItem
									.getAddresses().get(index).getCountry()
									.getCountryId()));
		} catch (SystemException e) {
			e.printStackTrace();
		}
	}

	public void onNumberOfDependentsChanged() {
		System.out.println("onNumberOfDependentsChanged");
		System.out.println(modifyEmployeeInfoItem.getEmployee()
				.getNumber_of_dependents());
		modifyEmployeeInfoItem.getDependentNames().add("a");
	}

	public EmployeeInfoItem getModifyEmployeeInfoItem() {
		return modifyEmployeeInfoItem;
	}

	public void setModifyEmployeeInfoItem(
			EmployeeInfoItem modifyEmployeeInfoItem) {
		this.modifyEmployeeInfoItem = modifyEmployeeInfoItem;
	}

	public boolean isShowUserTab() {
		return showUserTab;
	}

	public void setShowUserTab(boolean showUserTab) {
		this.showUserTab = showUserTab;
	}

	public List<Country> getCountries() {
		return countries;
	}

	public void setCountries(List<Country> countries) {
		this.countries = countries;
	}

	public String getSearchInputText() {
		return searchInputText;
	}

	public void setSearchInputText(String searchInputText) {
		this.searchInputText = searchInputText;
	}

	public Date getDateFrom() {
		return dateFrom;
	}

	public void setDateFrom(Date dateFrom) {
		this.dateFrom = dateFrom;
	}

	public Date getDateTo() {
		return dateTo;
	}

	public void setDateTo(Date dateTo) {
		this.dateTo = dateTo;
	}

	public EmployeeInfoItem getSelectedEmployeeInfoItem() {
		return selectedEmployeeInfoItem;
	}

	public void setSelectedEmployeeInfoItem(
			EmployeeInfoItem selectedEmployeeInfoItem) {
		this.selectedEmployeeInfoItem = selectedEmployeeInfoItem;
	}

	public long getDeletedEmployeeId() {
		return deletedEmployeeId;
	}

	public void setDeletedEmployeeId(long deletedEmployeeId) {
		this.deletedEmployeeId = deletedEmployeeId;
	}

	public List<JTitle> getJtitles() {
		return JTitleLocalServiceUtil.findAll();
	}

	public List<SubUnit> getSubUnits() {
		return SubUnitLocalServiceUtil.findAll();
	}

	public List<Titles> getTitlesList() {
		return TitlesLocalServiceUtil.findAll();
	}

	public List<Level> getLevels() {
		return LevelLocalServiceUtil.findAll();
	}

	public List<University> getUniversities() {
		return UniversityLocalServiceUtil.findAll();
	}

	public List<String> getLaborContractTypes() {
		final List<String> results = new ArrayList<String>();
		for (LaborContractType laborContractType : LaborContractType.values()) {
			results.add(laborContractType.toString());
		}
		return results;
	}

}