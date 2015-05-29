package vn.com.ecopharma.hrm.exceptions;

public class VacancyCandidateNotFoundException extends Exception{

	public VacancyCandidateNotFoundException() {
		super("VacancyCandidate not found");
	}
	
	public VacancyCandidateNotFoundException(String message) {
		super(message);
	}
}
