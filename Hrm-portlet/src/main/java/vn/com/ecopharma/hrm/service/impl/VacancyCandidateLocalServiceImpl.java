package vn.com.ecopharma.hrm.service.impl;

import java.sql.Date;
import java.util.List;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.User;
import com.liferay.portal.service.ServiceContext;

import vn.com.ecopharma.hrm.NoSuchVacancyException;
import vn.com.ecopharma.hrm.constant.CandidateStatus;
import vn.com.ecopharma.hrm.model.Candidate;
import vn.com.ecopharma.hrm.model.VacancyCandidate;
import vn.com.ecopharma.hrm.service.base.VacancyCandidateLocalServiceBaseImpl;

/**
 * The implementation of the vacancy candidate local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link vn.com.ecopharma.hrm.service.VacancyCandidateLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author tvt
 * @see vn.com.ecopharma.hrm.service.base.VacancyCandidateLocalServiceBaseImpl
 * @see vn.com.ecopharma.hrm.service.VacancyCandidateLocalServiceUtil
 */
public class VacancyCandidateLocalServiceImpl
    extends VacancyCandidateLocalServiceBaseImpl {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never reference this interface directly. Always use {@link vn.com.ecopharma.hrm.service.VacancyCandidateLocalServiceUtil} to access the vacancy candidate local service.
     */
	
	public VacancyCandidate create(long v_id, long c_id, long user_id,
			ServiceContext serviceContext) throws NoSuchVacancyException {
		try {
			User user = userPersistence.findByPrimaryKey(user_id);
			long vc_id = counterLocalService.increment();
			VacancyCandidate vc = vacancyCandidatePersistence.create(vc_id);
			vc.setC_id(c_id);
			vc.setV_id(v_id);
			//c.set_vacancies(vacancies);
			vc.setUserId(user.getUserId());
			vc.setGroupId(serviceContext.getScopeGroupId());
			vacancyCandidatePersistence.update(vc);
			
			return vc;
		} catch (SystemException e) {
			e.printStackTrace();
		} catch (PortalException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public VacancyCandidate findByCandidate(long c_id) {
		try {
			return vacancyCandidatePersistence.findByC_Id(c_id).get(0);
		} catch (SystemException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public List<VacancyCandidate> findByVacancy(long v_id) {
		try {
			return vacancyCandidatePersistence.findByV_Id(v_id);
		} catch (SystemException e) {
			e.printStackTrace();
		}
		return null;
	}
}
