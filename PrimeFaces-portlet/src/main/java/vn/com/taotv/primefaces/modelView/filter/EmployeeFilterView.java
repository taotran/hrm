package vn.com.taotv.primefaces.modelView.filter;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import org.apache.commons.lang3.StringUtils;

import vn.com.ecopharma.hrm.model.JTitle;
import vn.com.ecopharma.hrm.search.EmployeeField;
import vn.com.ecopharma.hrm.service.JTitleLocalServiceUtil;

@ManagedBean(name = "empFilterBean")
@ViewScoped
public class EmployeeFilterView implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private String globalString = StringUtils.EMPTY;
	private String emp_code = StringUtils.EMPTY;
	private String fullName = StringUtils.EMPTY;
	private String gender = StringUtils.EMPTY;
	private Date joined_date_from;
	private Date joined_date_to;
	
	private List<JTitle> allJTitles;
	private List<JTitle> selectedJTitles;
	
	private List<String> selectedGenders;
	
	@PostConstruct
	public void init() {
		allJTitles = JTitleLocalServiceUtil.findAll();
	}
	
	public void resetJoinedDateFrom() {
		joined_date_from = null;
	}
	
	public void resetJoinedDateTo() {
		joined_date_to = null;
	}
	
	public String getGlobalString() {
		return globalString;
	}

	public void setGlobalString(String globalString) {
		this.globalString = globalString;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}


	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public List<JTitle> getAllJTitles() {
		return allJTitles;
	}

	public void setAllJTitles(List<JTitle> allJTitles) {
		this.allJTitles = allJTitles;
	}

	public List<JTitle> getSelectedJTitles() {
		return selectedJTitles;
	}

	public void setSelectedJTitles(List<JTitle> selectedJTitles) {
		this.selectedJTitles = selectedJTitles;
	}

	public String getEmp_code() {
		return emp_code;
	}

	public void setEmp_code(String emp_code) {
		this.emp_code = emp_code;
	}

	public Date getJoined_date_from() {
		return joined_date_from;
	}

	public void setJoined_date_from(Date joined_date_from) {
		this.joined_date_from = joined_date_from;
	}

	public Date getJoined_date_to() {
		return joined_date_to;
	}

	public void setJoined_date_to(Date joined_date_to) {
		this.joined_date_to = joined_date_to;
	}
	
	public List<String> getSelectedGenders() {
		return selectedGenders;
	}

	public void setSelectedGenders(List<String> selectedGenders) {
		this.selectedGenders = selectedGenders;
	}

	/* For Order */
	public String getJoined_date() {
		return EmployeeField.JOINED_DATE;
	}

	public String getJobTitle() {
		return EmployeeField.JOB_TITLE;
	}

	public String getBirthDay() {
		return EmployeeField.BIRTHDAY;
	}
	
}
