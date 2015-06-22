package vn.com.ecopharma.hrm.constant;

import java.util.Arrays;

public enum VacancyStatus {

	NEW, //
 	PUBLISHED, //
	UNPUBLISHED; //

	@Override
	public String toString() {
		return this.name().toUpperCase();
	}
	
	public String getLocalizedName() {
		// TODO: get localized name for status, TEMPORARY using this way
		return this.name().toUpperCase();
	}
	
	public static java.util.List<VacancyStatus> getAllStatuses() {
		return Arrays.asList(NEW, PUBLISHED, UNPUBLISHED);
	}
	
	public static java.util.List<VacancyStatus> getAvailableStatuses(VacancyStatus status) {
		switch (status) {
		case NEW:
			return Arrays.asList(PUBLISHED, UNPUBLISHED);
		case PUBLISHED: 
			return Arrays.asList(UNPUBLISHED);
		case UNPUBLISHED: 
			return Arrays.asList(PUBLISHED);
		default:
			return new java.util.ArrayList<VacancyStatus>();
		}
	}
	
	public String getCssClass() {
		switch (this) {
		case NEW:
			return "status-yellow";
		case PUBLISHED:
			return "status-green";
		case UNPUBLISHED:
			return "status-red";
		default:
			return "";
		}
	}
}
