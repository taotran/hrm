package vn.com.taotv.primefaces.modelView;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;

import org.primefaces.event.SelectEvent;

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
import vn.com.taotv.primefaces.modelView.item.EmployeeIndexedItem;
import vn.com.taotv.primefaces.modelView.item.EmployeeInfoItem;

import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.faces.portal.context.LiferayFacesContext;
import com.liferay.faces.util.logging.Logger;
import com.liferay.faces.util.logging.LoggerFactory;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.search.SearchException;
import com.liferay.portal.kernel.util.LocaleUtil;
import com.liferay.portal.model.Country;
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
	
	private EmployeeInfoItem modifyEmployeeInfoItem;
	private EmployeeInfoItem selectedEmployeeInfoItem;

	private List<Country> countries;
	
	private boolean switchToModifyMode = false;

	private boolean showUserTab = false;

	private String deletedEmployeeId;

	@PostConstruct
	public void init() {
		LOGGER.info("On Loading Employees");
		try {
			countries = CountryServiceUtil.getCountries(true);
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
	public void editEmployee(String employeeId) {
		try {
			switchToModifyMode = true;
			modifyEmployeeInfoItem = new EmployeeInfoItem(
					EmployeeLocalServiceUtil.getEmployee(Long
							.valueOf(employeeId)));
			showUserTab = false;
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (PortalException e) {
			e.printStackTrace();
		} catch (SystemException e) {
			e.printStackTrace();
		}

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
		try {
			System.out.println("on Row Double Click");
			switchToModifyMode = true;
			final EmployeeIndexedItem employeeIndexedItem = (EmployeeIndexedItem) event
					.getObject();
			modifyEmployeeInfoItem = new EmployeeInfoItem(
					EmployeeLocalServiceUtil.getEmployee(Long
							.valueOf(employeeIndexedItem.getEmployeeDocument()
									.getField(EmployeeField.EMPLOYEE_ID)
									.getValue())));
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (PortalException e) {
			e.printStackTrace();
		} catch (SystemException e) {
			e.printStackTrace();
		}
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
	public void setDeleteEmployee() {
		try {
			EmployeeLocalServiceUtil.markDeletedEmployee(Long
					.valueOf(deletedEmployeeId));
		} catch (SystemException e) {
			e.printStackTrace();
		} catch (SearchException e) {
			e.printStackTrace();
		} catch (PortalException e) {
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

	public EmployeeInfoItem getSelectedEmployeeInfoItem() {
		return selectedEmployeeInfoItem;
	}

	public void setSelectedEmployeeInfoItem(
			EmployeeInfoItem selectedEmployeeInfoItem) {
		this.selectedEmployeeInfoItem = selectedEmployeeInfoItem;
	}

	public String getDeletedEmployeeId() {
		return deletedEmployeeId;
	}

	public void setDeletedEmployeeId(String deletedEmployeeId) {
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