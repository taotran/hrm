package vn.com.ecopharma.hrm.service.impl;

import java.sql.Date;
import java.util.List;

import com.liferay.portal.NoSuchUserException;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.model.User;
import com.liferay.portal.service.ServiceContext;

import vn.com.ecopharma.hrm.NoSuchCandidateException;
import vn.com.ecopharma.hrm.NoSuchInterviewScheduleException;
import vn.com.ecopharma.hrm.NoSuchVacancyCandidateException;
import vn.com.ecopharma.hrm.NoSuchVacancyException;
import vn.com.ecopharma.hrm.constant.CandidateStatus;
import vn.com.ecopharma.hrm.model.Candidate;
import vn.com.ecopharma.hrm.model.VacancyCandidate;
import vn.com.ecopharma.hrm.service.base.CandidateLocalServiceBaseImpl;
import vn.com.ecopharma.hrm.service.persistence.CandidateFinderUtil;

/**
 * The implementation of the candidate local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are
 * added, rerun ServiceBuilder to copy their definitions into the
 * {@link vn.com.ecopharma.hrm.service.CandidateLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security
 * checks based on the propagated JAAS credentials because this service can only
 * be accessed from within the same VM.
 * </p>
 *
 * @author tvt
 * @see vn.com.ecopharma.hrm.service.base.CandidateLocalServiceBaseImpl
 * @see vn.com.ecopharma.hrm.service.CandidateLocalServiceUtil
 */
/**
 * @author TaoTran_ECO
 *
 */
public class CandidateLocalServiceImpl extends CandidateLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 * 
	 * Never reference this interface directly. Always use {@link
	 * vn.com.ecopharma.hrm.service.CandidateLocalServiceUtil} to access the
	 * candidate local service.
	 */

	public List<Candidate> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS);
	}

	public List<Candidate> findAll(int start, int end) throws SystemException {
		return findAll(start, end, null);
	}

	public List<Candidate> findAll(int start, int end,
			OrderByComparator orderByComparator) throws SystemException {
		return candidatePersistence.findAll(start, end, orderByComparator);
	}

	public List<Candidate> searchCandidates(long id, String first_name,
			String middle_name, String last_name, String email, int start,
			int end) throws SystemException {
		return candidatePersistence.filterFindByfilterCandidate(first_name,
				middle_name, last_name, email, start, end);
	}

	public List<Candidate> searchCandidates(long id, String first_name,
			String middle_name, String last_name, String email, int start,
			int end, OrderByComparator order) throws SystemException {
		return candidatePersistence.filterFindByfilterCandidate(first_name,
				middle_name, last_name, email, start, end, order);
	}

	/*
	 * public List<Vacancy> getVacanciesByCandidate(long c_id) { try { return
	 * candidatePersistence.getVacancies(c_id); } catch (SystemException e) { //
	 * TODO Auto-generated catch block e.printStackTrace(); } return null; }
	 */

	public Candidate create(long user_id, String first_name,
			String middle_name, String last_name, String email,
			String contact_number, String comment, int mode_of_application,
			Date date_of_application, long cv_file_id, String cv_text_version,
			int added_person, Long v_id, ServiceContext serviceContext)
			throws PortalException, SystemException {
		User user = userPersistence.findByPrimaryKey(user_id);
		long c_id = counterLocalService.increment();
		Candidate c = candidatePersistence.create(c_id);
		c.setFirst_name(first_name);
		c.setMiddle_name(middle_name);
		c.setLast_name(last_name);
		c.setEmail(email);
		// candidatePersistence.addVacancies(c_id, vacancies);
		c.setComment(comment);
		c.setContact_number(contact_number);
		c.setDate_of_application(date_of_application);
		c.setCv_file_id(cv_file_id);
		c.setCv_text_version(cv_text_version);
		c.setUser_id(user.getUserId());
		c.setCandidate_status(v_id != null ? CandidateStatus.APPLICATION_INITIATED.toString() : null);
		c.setGroup_id(serviceContext.getScopeGroupId());
		if (v_id != null) {
			vacancyCandidateLocalService.create(v_id, c_id, user_id,
					serviceContext);
		}
		candidateHistoryLocalService.create(c_id, v_id, -1, user.getUserId(), "Candidate is INITIATED by " + user.getLastName(), "", CandidateStatus.APPLICATION_INITIATED.toString(), user.getUserId(), serviceContext);
		candidatePersistence.update(c);
		resourceLocalService.addResources(user.getCompanyId(),
				serviceContext.getScopeGroupId(), user.getUserId(),
				Candidate.class.getName(), c_id, false, true, true);
		return c;
	}

	public Candidate edit(long user_id, long candidateId, String first_name,
			String middle_name, String last_name, String email,
			String contact_number, String comment, int mode_of_application,
			Date date_of_application, long cv_file_id, String cv_text_version,
			int added_person, Long v_id, ServiceContext serviceContext)
			throws NoSuchVacancyException, NoSuchCandidateException,
			SystemException, NoSuchUserException {
		Candidate c = candidatePersistence.findByPrimaryKey(candidateId);
		c.setCandidate_status(c.getCandidate_status() != null ? c
				.getCandidate_status() : CandidateStatus.APPLICATION_INITIATED
				.toString());
		c.setFirst_name(first_name);
		c.setMiddle_name(middle_name);
		c.setLast_name(last_name);
		c.setEmail(email);
		c.setComment(comment);
		c.setContact_number(contact_number);
		c.setDate_of_application(date_of_application);
		c.setCv_file_id(cv_file_id);
		c.setCv_text_version(cv_text_version);
		if (v_id != null) {
			vacancyCandidateLocalService.create(v_id, candidateId, user_id,
					serviceContext);
			c.setCandidate_status(CandidateStatus.APPLICATION_INITIATED
					.toString());
		}
		candidatePersistence.update(c);
		return c;
	}

	public void delele(long c_id) throws NoSuchCandidateException,
			SystemException, NoSuchVacancyCandidateException, NoSuchInterviewScheduleException {
		VacancyCandidate vc = vacancyCandidateLocalService
				.findByCandidate(c_id);
		if (vc != null) {
			long v_id = vc.getV_id();
			vacancyCandidateLocalService
					.deleteByVacancyAndCandidate(v_id, c_id);
		}
		candidatePersistence.remove(c_id);
	}

	public List<Candidate> findCandidates(String first_name,
			String middle_name, String last_name, String email)
			throws SystemException {

		return candidatePersistence.filterFindByfilterCandidate(first_name,
				middle_name, last_name, email);
	}

	public List<Candidate> findCandidates(String first_name,
			String middle_name, String last_name, String email, int start,
			int end) throws SystemException {

		return candidatePersistence.filterFindByfilterCandidate(first_name,
				middle_name, last_name, email, start, end);
	}

	public int countAll() throws SystemException {
		return candidatePersistence.countAll();
	}

	public List<Candidate> filterCandidates(String filterString) {
		return CandidateFinderUtil.filterCandidates(filterString);
	}

	public List<Candidate> filterCandidateByGlobalString(String filterString) {
		return CandidateFinderUtil.filterCandidateByGlobalString(filterString);
	}

	public Long findVacancyByCandidate(long c_id) {
		return CandidateFinderUtil.findVacancyByCandidate(c_id);
	}

}
