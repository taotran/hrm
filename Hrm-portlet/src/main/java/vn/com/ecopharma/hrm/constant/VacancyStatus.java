package vn.com.ecopharma.hrm.constant;

public enum VacancyStatus {

	NEW,
	PUBLISH,
	UNPUBLISH;

	@Override
	public String toString() {
		return this.name();
	}
}
