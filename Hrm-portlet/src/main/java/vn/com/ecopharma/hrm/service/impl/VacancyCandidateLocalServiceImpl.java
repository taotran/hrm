package vn.com.ecopharma.hrm.service.impl;

import java.util.List;

import com.liferay.portal.NoSuchUserException;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.User;
import com.liferay.portal.service.ServiceContext;

import vn.com.ecopharma.hrm.NoSuchInterviewScheduleException;
import vn.com.ecopharma.hrm.NoSuchVacancyCandidateException;
import vn.com.ecopharma.hrm.NoSuchVacancyException;
import vn.com.ecopharma.hrm.model.InterviewSchedule;
import vn.com.ecopharma.hrm.model.VacancyCandidate;
import vn.com.ecopharma.hrm.service.base.VacancyCandidateLocalServiceBaseImpl;

/**
 * The implementation of the vacancy candidate local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are
 * added, rerun ServiceBuilder to copy their definitions into the
 * {@link vn.com.ecopharma.hrm.service.VacancyCandidateLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security
 * checks based on the propagated JAAS credentials because this service can only
 * be accessed from within the same VM.
 * </p>
 *
 * @author tvt
 * @see vn.com.ecopharma.hrm.service.base.VacancyCandidateLocalServiceBaseImpl
 * @see vn.com.ecopharma.hrm.service.VacancyCandidateLocalServiceUtil
 */
public class VacancyCandidateLocalServiceImpl extends
		VacancyCandidateLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 * 
	 * Never reference this interface directly. Always use {@link
	 * vn.com.ecopharma.hrm.service.VacancyCandidateLocalServiceUtil} to access
	 * the vacancy candidate local service.
	 */

	public VacancyCandidate create(long v_id, long c_id, long user_id,
			ServiceContext serviceContext) throws NoSuchVacancyException,
			SystemException, NoSuchUserException {
		User user = userPersistence.findByPrimaryKey(user_id);
		long vc_id = counterLocalService.increment();
		VacancyCandidate vc = vacancyCandidatePersistence.create(vc_id);
		vc.setC_id(c_id);
		vc.setV_id(v_id);
		vc.setUserId(user.getUserId());
		vc.setGroupId(serviceContext.getScopeGroupId());
		vacancyCandidatePersistence.update(vc);

		return vc;
	}

	public VacancyCandidate findByCandidate(long c_id) throws SystemException {
		return vacancyCandidatePersistence.fetchByC_Id(c_id);
	}

	public List<VacancyCandidate> findByVacancy(long v_id)
			throws SystemException {
		return vacancyCandidatePersistence.findByV_Id(v_id);
	}

	public VacancyCandidate findByVacancyAndCandidate(long v_id, long c_id)
			throws NoSuchVacancyCandidateException, SystemException {
		return vacancyCandidatePersistence.findByV_Id_And_C_Id(v_id, c_id);
	}

	public void deleteByVacancyAndCandidate(long v_id, long c_id)
			throws NoSuchVacancyCandidateException, SystemException, NoSuchInterviewScheduleException {
		final VacancyCandidate vc = findByVacancyAndCandidate(v_id, c_id);
		if (vc != null) {
			delete(vc.getVacancyCandidateId());
		}
	}

	public void deleteByVacancy(long v_id) throws SystemException, NoSuchVacancyCandidateException, NoSuchInterviewScheduleException {
		List<VacancyCandidate> vcList = findByVacancy(v_id);
		if (vcList != null && vcList.size() > 0) {
			for (VacancyCandidate vc : vcList) {
				delete(vc.getVacancyCandidateId());
			}
		}
	}
	
	public void delete(long vacancyCandidateId) throws NoSuchInterviewScheduleException, SystemException, NoSuchVacancyCandidateException {
		VacancyCandidate vc = vacancyCandidatePersistence.findByPrimaryKey(vacancyCandidateId);
		final InterviewSchedule is = interviewSchedulePersistence.fetchByVacancyCandidate(vacancyCandidateId, true);
		if (is != null) {
			interviewSchedulePersistence.remove(is.getInterviewScheduleId());
		}
		vacancyCandidatePersistence.remove(vc.getVacancyCandidateId());
	}

}
