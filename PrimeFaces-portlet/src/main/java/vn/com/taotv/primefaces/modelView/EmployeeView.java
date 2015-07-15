package vn.com.taotv.primefaces.modelView;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.el.ELContext;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.portlet.PortletRequest;

import org.apache.commons.lang3.StringUtils;
import org.primefaces.event.SelectEvent;
import org.primefaces.model.LazyDataModel;
import org.primefaces.model.SortOrder;

import vn.com.ecopharma.hrm.model.Employee;
import vn.com.ecopharma.hrm.model.JTitle;
import vn.com.ecopharma.hrm.model.Level;
import vn.com.ecopharma.hrm.model.SubUnit;
import vn.com.ecopharma.hrm.model.Titles;
import vn.com.ecopharma.hrm.model.University;
import vn.com.ecopharma.hrm.service.EmployeeLocalServiceUtil;
import vn.com.taotv.primefaces.modelView.item.AddressObjectItem;
import vn.com.taotv.primefaces.modelView.item.EmployeeInfoItem;
import vn.com.taotv.primefaces.modelView.lazyDataModel.EmployeeLazyDataModel;

import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.faces.portal.context.LiferayFacesContext;
import com.liferay.faces.util.logging.Logger;
import com.liferay.faces.util.logging.LoggerFactory;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.search.SearchContext;
import com.liferay.portal.kernel.search.SearchContextFactory;
import com.liferay.portal.kernel.search.SearchEngineUtil;
import com.liferay.portal.kernel.search.TermQuery;
import com.liferay.portal.kernel.search.TermQueryFactoryUtil;
import com.liferay.portal.kernel.util.LocaleUtil;
import com.liferay.portal.model.Country;
import com.liferay.portal.model.Region;
import com.liferay.portal.service.CountryServiceUtil;
import com.liferay.portal.service.RegionServiceUtil;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.service.UserLocalServiceUtil;

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

	private JTitle selectedJtitle;
	private SubUnit selectedSubUnit;
	private Titles selectedTitles;
	private Level selectedLevel;
	private University selectedUniversity;

	private List<Country> countries;

	private String userName;
	private String userPassword1;
	private String userPassword2;

	private String searchInputText;

	private boolean switchToModifyMode = false;

	private boolean disableModifyButton = true;

	private boolean showUserTab = false;

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

	private EmployeeLazyDataModel lazyDataModel;

	public LazyDataModel<EmployeeInfoItem> getLazyDataModel() {
		return lazyDataModel;
	}

	@PostConstruct
	public void init() {
		try {
			countries = CountryServiceUtil.getCountries(true);
		} catch (SystemException e) {
			e.printStackTrace();
		}
		lazyDataModel = new EmployeeLazyDataModel() {

			private static final long serialVersionUID = 1L;

			@Override
			public List<EmployeeInfoItem> load(int first, int pageSize,
					String sortField, SortOrder sortOrder,
					Map<String, Object> filters) {

				LOGGER.info("SORT BY " + sortField + " - "
						+ sortOrder.toString());
				final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
				final ELContext elContext = FacesContext.getCurrentInstance()
						.getELContext();
				EmployeeView empView = (EmployeeView) FacesContext
						.getCurrentInstance().getApplication().getELResolver()
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
	}

	public void addOneAddress() {
		modifyEmployeeInfoItem.getAddresses().add(new AddressObjectItem());
	}
	
	public void removeOneAddress(int index) {
		System.out.println("ON DELETE ONE ADDRESS; INDEX: " + index );
		
		modifyEmployeeInfoItem.getAddresses().remove(index);
		//modifyEmployeeInfoItem.getAddresses().get(index).setUIDeleted(true);
	}

	public boolean isSwitchToModifyMode() {
		return switchToModifyMode;
	}

	public void setSwitchToModifyMode(boolean switchToModifyMode) {
		this.switchToModifyMode = switchToModifyMode;
	}

	public void editEmployee(EmployeeInfoItem employeeInfo) {
		modifyEmployeeInfoItem = employeeInfo;
	}

	public void switchNow(boolean isCreateNew, EmployeeInfoItem employeeInfoItem) {
		System.out.println("switchToModifyMode " + switchToModifyMode);
		switchToModifyMode = !switchToModifyMode;
		System.out.println("switchToModifyMode " + switchToModifyMode);
		if (switchToModifyMode) {
			if (isCreateNew) {
				showUserTab = true;
				try {
					modifyEmployeeInfoItem = new EmployeeInfoItem(
							EmployeeLocalServiceUtil
									.createEmployee(CounterLocalServiceUtil
											.increment()));
					// set default "Male" for employee
					modifyEmployeeInfoItem.getEmployee().setGender("Male");
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
			} else {
				modifyEmployeeInfoItem = employeeInfoItem;
			}
		}
	}

	public void save(ActionEvent event) {
		LiferayFacesContext liferayFacesContext = LiferayFacesContext
				.getInstance();
		final ServiceContext serviceContext = liferayFacesContext
				.getServiceContext();
		if (showUserTab) {
			Employee employee = modifyEmployeeInfoItem.getEmployee();

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
						userPassword1, userPassword2, false, userName,
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
				FacesMessage msg = new FacesMessage(
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

				System.out.println(modifyEmployeeInfoItem.getAddresses().get(0)
						.getStreet1());

				EmployeeLocalServiceUtil.update(
						modifyEmployeeInfoItem.getEmployee(),
						modifyEmployeeInfoItem.getUser(),
						modifyEmployeeInfoItem.getjTitle(),
						modifyEmployeeInfoItem.getSubUnit(),
						modifyEmployeeInfoItem.getTitles(),
						modifyEmployeeInfoItem.getLevel(),
						modifyEmployeeInfoItem.getUniversity(),
						modifyEmployeeInfoItem.getAddresses(), serviceContext);
			} catch (SystemException e) {
				e.printStackTrace();
			} catch (PortalException e) {
				e.printStackTrace();
			}
		}
//		modifyEmployeeInfoItem = null;
		/*
		 * UIViewRoot root = liferayFacesContext.getViewRoot();
		 * 
		 * CommandButton cancelBtn =
		 * (CommandButton)root.findComponent("cancelBtn"); ActionEvent
		 * actionEvent = new ActionEvent(cancelBtn);
		 */
	}

	/**
	 * usage Set delete flag for employee
	 * 
	 * @param employeeInfoItem
	 */
	public void setDeleteEmployee(EmployeeInfoItem employeeInfoItem) {

		employeeInfoItem.getEmployee().setIsDeleted(true);
		try {
			EmployeeLocalServiceUtil.updateEmployee(employeeInfoItem
					.getEmployee());
		} catch (SystemException e) {
			e.printStackTrace();
		}
	}

	public void search() {
		LiferayFacesContext liferayFacesContext = LiferayFacesContext
				.getInstance();
		PortletRequest request = (PortletRequest)liferayFacesContext.getExternalContext().getRequest();
		
		/*SearchContext searchContext = new SearchContextFactory().getInstance(request);*/

		/*TermQuery termQuery = TermQueryFactoryUtil.create(searchContext, field, value)*/
		
/*		LiferayFacesContext liferayFacesContext = LiferayFacesContext
				.getInstance();
		PortletRequest portletRequest = (PortletRequest)liferayFacesContext.getExternalContext().getRequest();
		SearchContext searchContext = SearchContextFactory.getInstance(portletRequest)*/
	}

	public void onRowSelect(SelectEvent event) {
		disableModifyButton = false;
	}

	public void countryChange(int index) {
		try {
			modifyEmployeeInfoItem.getAddresses().get(index).setRegions(RegionServiceUtil.getRegions(modifyEmployeeInfoItem
					.getAddresses().get(index).getCountry().getCountryId()));
		} catch (SystemException e) {
			e.printStackTrace();
		}
	}

	public EmployeeInfoItem getModifyEmployeeInfoItem() {
		return modifyEmployeeInfoItem;
	}

	public void setModifyEmployeeInfoItem(
			EmployeeInfoItem modifyEmployeeInfoItem) {
		this.modifyEmployeeInfoItem = modifyEmployeeInfoItem;
	}

	public EmployeeInfoItem getSelectedEmployeeInfoItem() {
		return selectedEmployeeInfoItem;
	}

	public void setSelectedEmployeeInfoItem(
			EmployeeInfoItem selectedEmployeeInfoItem) {
		this.selectedEmployeeInfoItem = selectedEmployeeInfoItem;
	}

	public JTitle getSelectedJtitle() {
		return selectedJtitle;
	}

	public void setSelectedJtitle(JTitle selectedJtitle) {
		this.selectedJtitle = selectedJtitle;
	}

	public SubUnit getSelectedSubUnit() {
		return selectedSubUnit;
	}

	public void setSelectedSubUnit(SubUnit selectedSubUnit) {
		this.selectedSubUnit = selectedSubUnit;
	}

	public Titles getSelectedTitles() {
		return selectedTitles;
	}

	public void setSelectedTitles(Titles selectedTitles) {
		this.selectedTitles = selectedTitles;
	}

	public Level getSelectedLevel() {
		return selectedLevel;
	}

	public void setSelectedLevel(Level selectedLevel) {
		this.selectedLevel = selectedLevel;
	}

	public University getSelectedUniversity() {
		return selectedUniversity;
	}

	public void setSelectedUniversity(University selectedUniversity) {
		this.selectedUniversity = selectedUniversity;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPassword1() {
		return userPassword1;
	}

	public void setUserPassword1(String userPassword1) {
		this.userPassword1 = userPassword1;
	}

	public String getUserPassword2() {
		return userPassword2;
	}

	public void setUserPassword2(String userPassword2) {
		this.userPassword2 = userPassword2;
	}

	public boolean isDisableModifyButton() {
		return disableModifyButton;
	}

	public void setDisableModifyButton(boolean disableModifyButton) {
		this.disableModifyButton = disableModifyButton;
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
}