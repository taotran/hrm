package vn.com.taotv.primefaces.modelView.filter;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import vn.com.ecopharma.hrm.model.JTitle;
import vn.com.ecopharma.hrm.service.JTitleLocalServiceUtil;

@ManagedBean(name = "empFilterView")
@RequestScoped
public class EmployeeFilterView implements Serializable{
	private static final long serialVersionUID = 1L;
	private String fullName;
	private String sex;
	private String jobTitle;
	
	private List<JTitle> allJTitles;
	private List<JTitle> selectedJTitles;
	
	@PostConstruct
	public void init() {
		allJTitles = JTitleLocalServiceUtil.findAll();
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
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
	
	
}
