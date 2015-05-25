package vn.com.ecopharma.hrm.constant;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public enum CandidateStatus {
	/* 
	 * Indicates status of current candidate
	 * Example: when candidate first created -> status would be APPLICATION_INITIATED...
	 * Use comment on each enum item to prevent formatting code :)
	 * 
	 * */
	APPLICATION_INITIATED, // initiated
	REJECT, // reject
	SHORTLIST, // shorted list
	INTERVIEW_SCHEDULED, // schedule for interviewing
	JOB_OFFERED, // offer job
	DECLINE_OFFERED, // decline
	HIRE, // hire
	INTERVIEW_FAILED, // failed interview
	MARK_INTERVIEW_PASS, // mark pass
	MARK_INTERVIEW_FAIL; // mark fail

	public List<CandidateStatus> getAvailableStatus(CandidateStatus status) {
		switch (status) {
		case APPLICATION_INITIATED:
			Arrays.asList(REJECT, SHORTLIST);
			break;
		case INTERVIEW_SCHEDULED:
			Arrays.asList(REJECT, MARK_INTERVIEW_FAIL, MARK_INTERVIEW_PASS);
			break;
		case SHORTLIST:
			Arrays.asList(REJECT, INTERVIEW_SCHEDULED);
			break;
		case MARK_INTERVIEW_PASS:
			Arrays.asList(JOB_OFFERED, INTERVIEW_SCHEDULED, REJECT);
			break;
		case MARK_INTERVIEW_FAIL:
			Arrays.asList(REJECT);
			break;
		case JOB_OFFERED:
			Arrays.asList(DECLINE_OFFERED, HIRE, REJECT);
			break;
		case REJECT:
			new ArrayList<CandidateStatus>();
			break;
		default:
			break;
		}
		return null;
	}

	@Override
	public String toString() {
		return this.name().toUpperCase();
	}

	public String getLocalizedName() {
		// TODO: get resource name for status, TEMPORARY using this way
		return this.name().toUpperCase();
	}

}
