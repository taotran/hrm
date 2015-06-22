package vn.com.ecopharma.hrm.customModel;

public class VacancyReport {
	private String jobTitle;
	private int number_of_pos;
	private int number_of_shortlist;
	private int number_of_hired;
	public String getJobTitle() {
		return jobTitle;
	}
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}
	public int getNumber_of_pos() {
		return number_of_pos;
	}
	public void setNumber_of_pos(int number_of_pos) {
		this.number_of_pos = number_of_pos;
	}
	public int getNumber_of_shortlist() {
		return number_of_shortlist;
	}
	public void setNumber_of_shortlist(int number_of_shortlist) {
		this.number_of_shortlist = number_of_shortlist;
	}
	public int getNumber_of_hired() {
		return number_of_hired;
	}
	public void setNumber_of_hired(int number_of_hired) {
		this.number_of_hired = number_of_hired;
	}
}
