package vn.com.ecopharma.hrm.exceptions;

public class InterviewScheduleExistedException extends Exception {

	public InterviewScheduleExistedException() {
		super("InterviewSchedule already exist with same Interview & VacancyCandidate");
	}

	public InterviewScheduleExistedException(String message) {
		super(message);
	}

	
}
