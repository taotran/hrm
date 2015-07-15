package vn.com.ecopharma.hrm.bean;

import java.util.List;

import javax.faces.bean.ManagedBean;

import vn.com.ecopharma.hrm.model.JTitle;
import vn.com.ecopharma.hrm.model.Level;
import vn.com.ecopharma.hrm.model.SubUnit;
import vn.com.ecopharma.hrm.model.Titles;
import vn.com.ecopharma.hrm.model.University;
import vn.com.taotv.primefaces.modelView.item.EmployeeInfoItem;

@ManagedBean(name = "employeeInfoItemBean")
public class EmployeeInfoItemBean {

	private EmployeeInfoItem employeeInfoItem;

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

	public EmployeeInfoItem getEmployeeInfoItem() {
		return employeeInfoItem;
	}

	public void setEmployeeInfoItem(EmployeeInfoItem employeeInfoItem) {
		this.employeeInfoItem = employeeInfoItem;
	}

	public List<JTitle> getJtitles() {
		return jtitles;
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

	public List<University> getUniversities() {
		return universities;
	}

	public void setUniversities(List<University> universities) {
		this.universities = universities;
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
}
