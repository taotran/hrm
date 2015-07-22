package vn.com.taotv.primefaces.modelView;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.event.ActionEvent;

import org.primefaces.context.RequestContext;
import org.primefaces.event.FlowEvent;

import vn.com.ecopharma.hrm.model.Employee;
import vn.com.ecopharma.hrm.model.JTitle;
import vn.com.ecopharma.hrm.model.Level;
import vn.com.ecopharma.hrm.model.SubUnit;
import vn.com.ecopharma.hrm.model.Titles;
import vn.com.ecopharma.hrm.model.University;
import vn.com.ecopharma.hrm.service.EmployeeLocalServiceUtil;
import vn.com.ecopharma.hrm.service.JTitleLocalServiceUtil;
import vn.com.ecopharma.hrm.service.LevelLocalServiceUtil;
import vn.com.ecopharma.hrm.service.SubUnitLocalServiceUtil;
import vn.com.ecopharma.hrm.service.TitlesLocalServiceUtil;
import vn.com.ecopharma.hrm.service.UniversityLocalServiceUtil;

import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.faces.portal.context.LiferayFacesContext;
import com.liferay.faces.util.logging.Logger;
import com.liferay.faces.util.logging.LoggerFactory;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.User;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.service.UserLocalServiceUtil;

@ManagedBean(name = "employeeWizard")
@ViewScoped
public class EmployeeWizard implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private static Logger LOGGER = LoggerFactory.getLogger(EmployeeWizard.class);
	
	private String currentStep;

	private User user;
	private Employee employee;

	private String userName;
	private String userPassword1;
	private String userPassword2;

	private List<JTitle> jtitles;
	private List<SubUnit> subUnits;
	private List<Titles> titlesList;
	private List<Level> levels;
	private List<University> universities;
	
	private JTitle selectedJtitle;
	private SubUnit selectedSubUnit;
	private Titles selectedTitles;
	private Level selectedLevel;
	private University selectedUniversity;
	

	private boolean skip;

	@PostConstruct
	public void init() {
		try {
			currentStep = "personal";
			user = UserLocalServiceUtil.createUser(CounterLocalServiceUtil
					.increment());
			employee = EmployeeLocalServiceUtil
					.createEmployee(CounterLocalServiceUtil.increment());
			subUnits = SubUnitLocalServiceUtil.findAll();

			titlesList = TitlesLocalServiceUtil.findAll();
			levels = LevelLocalServiceUtil.findAll();

			universities = UniversityLocalServiceUtil.findAll();

		} catch (SystemException e) {
			e.printStackTrace();
		}

	}

	public String onFlowProcess(FlowEvent event) {
		/*
		 * if (skip) { skip = false; return "confirm"; } else { return
		 * event.getNewStep(); }
		 */
		System.out.println("currentStep " + currentStep);
		if (skip) {
			skip = false;
			return "confirm";
		} else {
			currentStep = event.getOldStep();
			return event.getNewStep();
		}
	}

	public void save(ActionEvent event) {
		LiferayFacesContext liferayFacesContext = LiferayFacesContext
				.getInstance();
		final ServiceContext serviceContext = liferayFacesContext
				.getServiceContext();
		employee.setJobtitleId(selectedJtitle.getJobtitleId());
		employee.setSubUnitId(selectedSubUnit.getSubUnitId());
		employee.setUniversityId(selectedUniversity.getUniversityId());
		employee.setTitlesId(selectedTitles.getTitlesId());
		employee.setLevelId(selectedLevel.getLevelId());
		employee.setGroupId(serviceContext.getScopeGroupId());
		employee.setCompanyId(serviceContext.getCompanyId());
		
		/*try {
			EmployeeLocalServiceUtil.addEmployee(employee, serviceContext
					.getUserId(), serviceContext.getCompanyId(), false,
					userPassword1, userPassword2, false, userName, user
							.getEmailAddress(), 0, "", LocaleUtil.getDefault(),
					user.getFirstName(), user.getMiddleName(), user
							.getLastName(), 0, 0, employee.getGender()
							.equalsIgnoreCase("male") ? true : false, 10, 10,
					1988, new long[] { 20192 }, null, new long[] { 20165 },
					null, false, 0, serviceContext);
			FacesMessage msg = new FacesMessage("Create employee successfully",
					"Employee " + user.getFullName() + " has been created");
			FacesContext.getCurrentInstance().addMessage(null, msg);
		} catch (SystemException e) {
			e.printStackTrace();
		} catch (PortalException e) {
			e.printStackTrace();
		}*/
		
	}
	
	public void handleClose() {
		LOGGER.info("ON handleClose");
		LiferayFacesContext liferayFacesContext = LiferayFacesContext
				.getInstance();
		currentStep = "personal";
		liferayFacesContext.resetView();
	}

	public void onCloseOrFinish() {
		System.out.println("ON CLOSE DIALOG");
		RequestContext context = RequestContext.getCurrentInstance();
		context.reset("newEmployeeForm");
	}

	public String getCurrentStep() {
		return currentStep;
	}

	public void setCurrentStep(String currentStep) {
		this.currentStep = currentStep;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public boolean isSkip() {
		return skip;
	}

	public void setSkip(boolean skip) {
		this.skip = skip;
	}

	public JTitle getSelectedJtitle() {
		return selectedJtitle;
	}

	public void setSelectedJtitle(JTitle selectedJtitle) {
		this.selectedJtitle = selectedJtitle;
	}

	public List<JTitle> getJtitles() {
		return jtitles = JTitleLocalServiceUtil.findAll();
	}

	public void setJtitles(List<JTitle> jtitles) {
		this.jtitles = jtitles;
	}

	public List<SubUnit> getSubUnits() {
		return subUnits;
	}

	public void setSubUnits(List<SubUnit> subUnits) {
		this.subUnits = subUnits;
	}

	public SubUnit getSelectedSubUnit() {
		return selectedSubUnit;
	}

	public void setSelectedSubUnit(SubUnit selectedSubUnit) {
		this.selectedSubUnit = selectedSubUnit;
	}

	public University getSelectedUniversity() {
		return selectedUniversity;
	}

	public void setSelectedUniversity(University selectedUniversity) {
		this.selectedUniversity = selectedUniversity;
	}

	public List<University> getUniversities() {
		return universities;
	}

	public void setUniversities(List<University> universities) {
		this.universities = universities;
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

	public List<Titles> getTitlesList() {
		return titlesList;
	}

	public void setTitlesList(List<Titles> titlesList) {
		this.titlesList = titlesList;
	}

	public List<Level> getLevels() {
		return levels;
	}

	public void setLevels(List<Level> levels) {
		this.levels = levels;
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
}
