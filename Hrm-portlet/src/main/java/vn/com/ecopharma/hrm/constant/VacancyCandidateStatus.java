package vn.com.ecopharma.hrm.constant;

public enum VacancyCandidateStatus {
	EMPLOYED, //
	VALID, //
	INVALID //
;

	@Override
	public String toString() {
		return this.name().toUpperCase();
	}
	
	
}
