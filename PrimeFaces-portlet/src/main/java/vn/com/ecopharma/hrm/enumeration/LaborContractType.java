package vn.com.ecopharma.hrm.enumeration;

public enum LaborContractType {

	UNLIMITED_TIME, INDEFINITE_TERMS, SEASONAL_EMPLOYMENT_CONTRACT;

	@Override
	public String toString() {
		return this.name();
	}

	public String getLocalizedString() {
		return "employeeInfo.labor_contract_type." + this.name().toLowerCase();
	}

}
