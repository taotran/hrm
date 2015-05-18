package vn.com.ecopharma.hrm.service.impl;

import java.sql.Date;
import java.util.List;

import com.liferay.portal.kernel.exception.SystemException;

import vn.com.ecopharma.hrm.NoSuchCandidateException;
import vn.com.ecopharma.hrm.NoSuchVacancyException;
import vn.com.ecopharma.hrm.model.Candidate;
import vn.com.ecopharma.hrm.model.Vacancy;
import vn.com.ecopharma.hrm.service.base.CandidateLocalServiceBaseImpl;

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
	
	public List<Candidate> findCandidates(int start, int end) throws SystemException {
		return candidatePersistence.findAll(start, end);
	}

	public Candidate createCandidate(String first_name, String middle_name,
			String last_name, String email, String contact_number,
			String comment, int mode_of_application, Date date_of_application,
			long cv_file_id, String cv_text_version, int added_person,
			List<Vacancy> vacancies) throws NoSuchVacancyException {
		try {
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
			candidatePersistence.update(c);

			return c;
		} catch (SystemException e) {
			// TODO Auto-generated catch block
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
	
	public int countAll(){
		try {
			return candidatePersistence.countAll();
		} catch (SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}
}
