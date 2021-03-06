package vn.com.ecopharma.hrm.service.impl;

import java.sql.Date;
import java.util.List;

import com.liferay.portal.NoSuchModelException;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.service.ServiceContext;

import vn.com.ecopharma.hrm.NoSuchVacancyCandidateException;
import vn.com.ecopharma.hrm.constant.CandidateStatus;
import vn.com.ecopharma.hrm.exceptions.InterviewScheduleExistedException;
import vn.com.ecopharma.hrm.exceptions.VacancyCandidateNotFoundException;
import vn.com.ecopharma.hrm.model.Candidate;
import vn.com.ecopharma.hrm.model.EmployeeInterviewSchedule;
import vn.com.ecopharma.hrm.model.InterviewSchedule;
import vn.com.ecopharma.hrm.model.VacancyCandidate;
import vn.com.ecopharma.hrm.service.CandidateHistoryLocalServiceUtil;
import vn.com.ecopharma.hrm.service.InterviewLocalServiceUtil;
import vn.com.ecopharma.hrm.service.base.InterviewScheduleLocalServiceBaseImpl;

/**
 * The implementation of the interview schedule local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are
 * added, rerun ServiceBuilder to copy their definitions into the
 * {@link vn.com.ecopharma.hrm.service.InterviewScheduleLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security
 * checks based on the propagated JAAS credentials because this service can only
 * be accessed from within the same VM.
 * </p>
 *
 * @author tvt
 * @see vn.com.ecopharma.hrm.service.base.InterviewScheduleLocalServiceBaseImpl
 * @see vn.com.ecopharma.hrm.service.InterviewScheduleLocalServiceUtil
 */
public class InterviewScheduleLocalServiceImpl extends
		InterviewScheduleLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 * 
	 * Never reference this interface directly. Always use {@link
	 * vn.com.ecopharma.hrm.service.InterviewScheduleLocalServiceUtil} to access
	 * the interview schedule local service.
	 */

	public InterviewSchedule create(long interviewId, long vacancyId,
			long candidateId, List<Long> emps, Date interviewDate,
			String interviewTime, long userId, ServiceContext serviceContext)
			throws SystemException, VacancyCandidateNotFoundException,
			PortalException, InterviewScheduleExistedException {
		final VacancyCandidate vacancyCandidate = vacancyCandidateLocalService
				.findByVacancyAndCandidate(vacancyId, candidateId);
		if (vacancyCandidate == null) {
			throw new VacancyCandidateNotFoundException();
		}
		if (interviewSchedulePersistence.fetchByInterview_And_VacancyCandidate(interviewId, vacancyCandidate.getVacancyCandidateId(), true) != null) {
			throw new InterviewScheduleExistedException();
		}
		InterviewSchedule is = interviewSchedulePersistence
				.create(counterLocalService.increment());
		is.setInterviewId(interviewId);
	
		is.setVacancyCandidateId(vacancyCandidate.getVacancyCandidateId());
		is.setInterviewDate(interviewDate);
		is.setInterviewTime(interviewTime);
		is.setUserId(userId);
		is.setGroupId(serviceContext.getScopeGroupId());
		/* Insert data to EmployeeInterviewSchedule */
		for (Long id : emps) {
			employeeInterviewScheduleLocalService.create(id,
					is.getInterviewScheduleId(), userId, serviceContext);
		}

		/* Update Candidate Status to INTERVIEW_SCHEDULE */
		final Candidate candidate = candidateLocalService
				.getCandidate(candidateId);
		candidate.setCandidate_status(CandidateStatus.INTERVIEW_SCHEDULED
				.toString());
		candidatePersistence.update(candidate);

		is = interviewSchedulePersistence.update(is);
		
		/* WRITE log to CandidateHistory */
		CandidateHistoryLocalServiceUtil.create(candidateId, vacancyId, interviewId, userId, "Schedule Interview: " + InterviewLocalServiceUtil.getInterview(interviewId).getName(), new Date(System.currentTimeMillis()), employeeLocalService.getListInterviewersStringByIds(emps), "INTERVIEW_SCHEDULE", userId, serviceContext);
		
		return is;
	}

	public void delete(long interviewScheduleId) throws SystemException,
			NoSuchVacancyCandidateException, NoSuchModelException {
		/* DELETE all associated EmployeeInterviewSchedules */
		final List<EmployeeInterviewSchedule> eises = employeeInterviewSchedulePersistence
				.findByInterviewScheduleId(interviewScheduleId);
		if (eises != null && eises.size() > 0) {
			for (EmployeeInterviewSchedule eis : employeeInterviewSchedulePersistence
					.findByInterviewScheduleId(interviewScheduleId)) {
				employeeInterviewScheduleLocalService.delete(eis
						.getEmployeeInterviewScheduleId());
			}
		}

		/* DELETE InterviewSchedule */
		interviewSchedulePersistence.remove(interviewScheduleId);
	}

}
