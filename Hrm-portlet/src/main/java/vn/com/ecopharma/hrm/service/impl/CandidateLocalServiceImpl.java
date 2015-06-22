package vn.com.ecopharma.hrm.service.impl;

import java.sql.Date;
import java.util.List;

import com.liferay.portal.NoSuchUserException;
import com.liferay.portal.kernel.dao.orm.Criterion;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.RestrictionsFactoryUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.portlet.PortletClassLoaderUtil;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.model.User;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portlet.documentlibrary.model.DLFileEntry;
import com.liferay.portlet.documentlibrary.service.persistence.DLFileEntryUtil;

import vn.com.ecopharma.hrm.NoSuchCandidateException;
import vn.com.ecopharma.hrm.NoSuchInterviewScheduleException;
import vn.com.ecopharma.hrm.NoSuchVacancyCandidateException;
import vn.com.ecopharma.hrm.NoSuchVacancyException;
import vn.com.ecopharma.hrm.constant.CandidateStatus;
import vn.com.ecopharma.hrm.constant.VacancyCandidateStatus;
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
		c.setCandidate_status(v_id != null ? CandidateStatus.APPLICATION_INITIATED
				.toString() : null);
		c.setGroup_id(serviceContext.getScopeGroupId());
		if (v_id != null) {
			vacancyCandidateLocalService.create(v_id, c_id, user_id,
					serviceContext);
			candidateHistoryLocalService.create(c_id, v_id, -1,
					user.getUserId(),
					"Candidate is INITIATED by " + user.getLastName(),
					new Date(System.currentTimeMillis()), "",
					CandidateStatus.APPLICATION_INITIATED.toString(),
					user.getUserId(), serviceContext);
		}

		c = candidatePersistence.update(c);
		resourceLocalService.addResources(user.getCompanyId(),
				serviceContext.getScopeGroupId(), user.getUserId(),
				Candidate.class.getName(), c_id, false, true, true);
		return c;
	}

	public Candidate edit(long user_id, long candidateId, String first_name,
			String middle_name, String last_name, String email,
			String contact_number, String comment, int mode_of_application,
			Date date_of_application, long cv_file_id, boolean isDeleteOrNotAddResume, String cv_text_version,
			int added_person, Long v_id, ServiceContext serviceContext)
			throws SystemException, PortalException {
		Candidate c = candidatePersistence.findByPrimaryKey(candidateId);
		c.setFirst_name(first_name);
		c.setMiddle_name(middle_name);
		c.setLast_name(last_name);
		c.setEmail(email);
		c.setComment(comment);
		c.setContact_number(contact_number);
		c.setDate_of_application(date_of_application);
		
		if (isDeleteOrNotAddResume) {
			if (c.getCv_file_id() != -1) {
				DLFileEntryUtil.remove(c.getCv_file_id());
			}
			c.setCv_file_id(cv_file_id);
		}
		
		c.setCv_text_version(cv_text_version);
		if (v_id != null) {
			/*
			 * c.setCandidate_status(c.getCandidate_status() != null ? c
			 * .getCandidate_status() : CandidateStatus.APPLICATION_INITIATED
			 * .toString());
			 */
			/* Do NOTHING if the Vacancy for this Candidate has already existed */
			if (vacancyCandidatePersistence.fetchByV_Id_And_C_Id(v_id,
					candidateId) == null) {
				// Set all previous CANDIDATE's Vacancy to INVALID
				final List<VacancyCandidate> VCs = vacancyCandidateLocalService
						.findByCandidate(candidateId);
				final VacancyCandidate prevVC = vacancyCandidateLocalService
						.findByCandidate_And_VALID_Status(candidateId);
				for (VacancyCandidate vc : VCs) {
					vc.setVc_status(VacancyCandidateStatus.INVALID.toString());
					vacancyCandidateLocalService.updateVacancyCandidate(vc);
				}
				vacancyCandidateLocalService.create(v_id, candidateId, user_id,
						serviceContext);
				c.setCandidate_status(CandidateStatus.APPLICATION_INITIATED
						.toString());
				if (prevVC != null) {
					final String prevVacancy = vacancyLocalService.getVacancy(
							prevVC.getV_id()).getName();
					final String currVacancy = vacancyLocalService.getVacancy(v_id)
							.getName();
	
					candidateHistoryLocalService.create(candidateId, v_id, 0l,
							user_id, "VACANCY is changed from " + prevVacancy
									+ " to " + currVacancy,
							new Date(System.currentTimeMillis()), "",
							"VACANCY CHANGED", user_id, serviceContext);
				} else {
					final String currVacancy = vacancyLocalService.getVacancy(v_id)
							.getName();
					candidateHistoryLocalService.create(candidateId, v_id, 0l,
							user_id, "VACANCY is set "
									+ " to " + currVacancy,
							new Date(System.currentTimeMillis()), "",
							"VACANCY CHANGED", user_id, serviceContext);
				}
			}
		}
		candidatePersistence.update(c);
		return c;
	}

	public Candidate changeCandidateStatus(long candidateId, long vacancyId,
			long userId, CandidateStatus status, ServiceContext serviceContext)
			throws SystemException, PortalException {
		Candidate c = this.getCandidate(candidateId);
		final User user = userLocalService.fetchUserById(userId);
		final String oldStatus = c.getCandidate_status();
		c.setCandidate_status(status.toString());
		c = this.updateCandidate(c);

		candidateHistoryLocalService.create(candidateId, vacancyId, -1,
				user.getUserId(), "Status changed " + oldStatus + " to "
						+ status.toString() + " by " + user.getLastName(),
				new Date(System.currentTimeMillis()), "", status.toString(),
				user.getUserId(), serviceContext);
		return c;
	}

	public void delele(long c_id) throws NoSuchCandidateException,
			SystemException, NoSuchVacancyCandidateException,
			NoSuchInterviewScheduleException {
		List<VacancyCandidate> VCs = vacancyCandidateLocalService
				.findByCandidate(c_id);
		for (VacancyCandidate vc : VCs) {
			vacancyCandidateLocalService.delete(vc.getVacancyCandidateId());
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

	public List<Candidate> filterCandidates(String globStr, String name,
			String email, String contact_number, String candidate_status,
			String vacancy_name, String date_from, String date_to,
			String sortColumnName, String sortDirection, int start, int end) {

		return CandidateFinderUtil.filterCandidates(globStr, name, email,
				contact_number, candidate_status, vacancy_name, date_from,
				date_to, sortColumnName, sortDirection, start, end);
	}

	public int getFilterCandidatesSize(String globStr, String name,
			String email, String contact_number, String candidate_status,
			String vacancy_name, String date_from, String date_to, String sortColName, String sortDirection) {
		return CandidateFinderUtil.getFilterCandidatesSize(globStr, name,
				email, contact_number, candidate_status, vacancy_name,
				date_from, date_to, sortColName, sortDirection);
	}

	@SuppressWarnings("unchecked")
	public List<Candidate> dynamicQueryTest(String s, int start, int end) {
		DynamicQuery candidateQuery = DynamicQueryFactoryUtil.forClass(
				Candidate.class, PortletClassLoaderUtil.getClassLoader());
		Criterion crit = null;
		crit = RestrictionsFactoryUtil.like("first_name", s);
		crit = RestrictionsFactoryUtil.or(crit,
				RestrictionsFactoryUtil.like("middle_name", s));
		crit = RestrictionsFactoryUtil.or(crit,
				RestrictionsFactoryUtil.like("last_name", s));

		candidateQuery.add(crit);

		candidateQuery.setLimit(start, end);
		return (List<Candidate>) candidateQuery.list();
	}

}
