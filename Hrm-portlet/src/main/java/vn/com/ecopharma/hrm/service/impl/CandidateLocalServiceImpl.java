package vn.com.ecopharma.hrm.service.impl;

import java.sql.Date;
import java.util.List;

import com.liferay.portal.kernel.dao.orm.OrderFactoryUtil;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.OrderByComparatorFactoryUtil;
import com.liferay.portal.model.User;
import com.liferay.portal.service.ServiceContext;
import com.liferay.util.dao.orm.CustomSQLUtil;

import vn.com.ecopharma.hrm.NoSuchCandidateException;
import vn.com.ecopharma.hrm.NoSuchVacancyException;
import vn.com.ecopharma.hrm.model.Candidate;
import vn.com.ecopharma.hrm.model.Vacancy;
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
		return candidatePersistence.findAll();
	}

	public List<Candidate> findAll(int start, int end) {
		try {
			return candidatePersistence.findAll(start, end);
		} catch (SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public List<Candidate> findCandidates(int start, int end)
			throws SystemException {
		return candidatePersistence.findAll(start, end);
	}

	public List<Candidate> searchCandidates(long id, String first_name,
			String middle_name, String last_name, String email, int start,
			int end) {
		try {
			return candidatePersistence.filterFindByfilterCandidate(first_name,
					middle_name, last_name, email, start, end);
		} catch (SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;

	}
	
	public List<Candidate> searchCandidates(long id, String first_name,
			String middle_name, String last_name, String email, int start,
			int end, OrderByComparator order) {
		try {
			return candidatePersistence.filterFindByfilterCandidate(first_name,
					middle_name, last_name, email, start, end, order);
		} catch (SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;

	}
	
	public List<Vacancy> getVacanciesByCandidate(long c_id) {
		try {
			return candidatePersistence.getVacancies(c_id);
		} catch (SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	

	public Candidate createCandidate(long user_id, String first_name,
			String middle_name, String last_name, String email,
			String contact_number, String comment, int mode_of_application,
			Date date_of_application, long cv_file_id, String cv_text_version,
			int added_person, List<Vacancy> vacancies,
			ServiceContext serviceContext) throws NoSuchVacancyException {
		try {
			User user = userPersistence.findByPrimaryKey(user_id);
			long c_id = counterLocalService.increment();
			Candidate c = candidatePersistence.create(c_id);
			c.setFirst_name(first_name);
			c.setMiddle_name(middle_name);
			c.setLast_name(last_name);
			c.setEmail(email);
			candidatePersistence.addVacancies(c_id, vacancies);
			c.setComment(comment);
			c.setContact_number(contact_number);
			c.setDate_of_application(date_of_application);
			c.setCv_file_id(cv_file_id);
			c.setCv_text_version(cv_text_version);
			c.set_vacancies(vacancies);
			c.setUser_id(user.getUserId());
			c.setGroup_id(serviceContext.getScopeGroupId());
			candidatePersistence.update(c);
			resourceLocalService.addResources(user.getCompanyId(),
					serviceContext.getScopeGroupId(), user.getUserId(),
					Candidate.class.getName(), c_id, false, true, true);
			return c;
		} catch (SystemException e) {
			e.printStackTrace();
		} catch (PortalException e) {
			e.printStackTrace();
		}
		return null;
	}

	public Candidate editCandidate(long candidateId, String first_name,
			String middle_name, String last_name, String email,
			String contact_number, String comment, int mode_of_application,
			Date date_of_application, long cv_file_id, String cv_text_version,
			int added_person, List<Vacancy> vacancies)
			throws NoSuchVacancyException {
		try {
			Candidate c;
			try {
				c = candidatePersistence.findByPrimaryKey(candidateId);
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
				// c.set_vacancies(vacancies);
				candidatePersistence.update(c);
				return c;
			} catch (NoSuchCandidateException e) {
				e.printStackTrace();
			}
		} catch (SystemException e) {
			e.printStackTrace();
		}
		return null;
	}

	public void delele(long c_id) {
		try {
			candidatePersistence.remove(c_id);
		} catch (NoSuchCandidateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public List<Candidate> findCandidates(String first_name,
			String middle_name, String last_name, String email) {

		try {
			return candidatePersistence.filterFindByfilterCandidate(first_name,
					middle_name, last_name, email);
		} catch (SystemException e) {
			e.printStackTrace();
		}
		return null;
	}

	public List<Candidate> findCandidates(String first_name,
			String middle_name, String last_name, String email, int start,
			int end) {

		try {
			return candidatePersistence.filterFindByfilterCandidate(first_name, middle_name, last_name, email, start, end);
		} catch (SystemException e) {
			e.printStackTrace();
		}
		return null;
	}

	public int countAll() {
		try {
			return candidatePersistence.countAll();
		} catch (SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}
	
	public List<Candidate> filterCandidates(String filterString) {
		return CandidateFinderUtil.filterCandidates(filterString);
	}
	
	public List<Candidate> filterCandidates(String filterString, int start, int end) {
		return CandidateFinderUtil.filterCandidates(filterString, start, end);
	}
}
