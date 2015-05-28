package vn.com.ecopharma.hrm.constant;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public enum CandidateStatus {
	/*
	 * Indicates status of current candidate Example: when candidate first
	 * created -> status would be APPLICATION_INITIATED... Use comment on each
	 * enum item to prevent formatting code :)
	 */
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

	public static List<CandidateStatus> getAvailableStatus(
			CandidateStatus status) {
		switch (status) {
		case APPLICATION_INITIATED:
			return Arrays.asList(REJECT, SHORTLIST);
		case INTERVIEW_SCHEDULED:
			return Arrays.asList(REJECT, MARK_INTERVIEW_FAIL,
					MARK_INTERVIEW_PASS);
		case SHORTLIST:
			return Arrays.asList(REJECT, INTERVIEW_SCHEDULED);
		case MARK_INTERVIEW_PASS:
			return Arrays.asList(JOB_OFFERED, INTERVIEW_SCHEDULED, REJECT);
		case MARK_INTERVIEW_FAIL:
			return Arrays.asList(REJECT);
		case JOB_OFFERED:
			return Arrays.asList(DECLINE_OFFERED, HIRE, REJECT);
		case REJECT:
			return new ArrayList<CandidateStatus>();
		default:
			return new ArrayList<CandidateStatus>();
		}
	}

	@Override
	public String toString() {
		return this.name().toUpperCase();
	}

	public String getLocalizedName() {
		// TODO: get localized name for status, TEMPORARY using this way
		return this.name().toUpperCase();
	}

}
