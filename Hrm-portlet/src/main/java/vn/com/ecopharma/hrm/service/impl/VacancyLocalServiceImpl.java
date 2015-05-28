package vn.com.ecopharma.hrm.service.impl;

import java.util.Date;
import java.util.List;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.User;
import com.liferay.portal.service.ServiceContext;

import vn.com.ecopharma.hrm.NoSuchVacancyException;
import vn.com.ecopharma.hrm.model.Candidate;
import vn.com.ecopharma.hrm.model.Vacancy;
import vn.com.ecopharma.hrm.service.base.VacancyLocalServiceBaseImpl;

/**
 * The implementation of the vacancy local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are
 * added, rerun ServiceBuilder to copy their definitions into the
 * {@link vn.com.ecopharma.hrm.service.VacancyLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security
 * checks based on the propagated JAAS credentials because this service can only
 * be accessed from within the same VM.
 * </p>
 *
 * @author tvt
 * @see vn.com.ecopharma.hrm.service.base.VacancyLocalServiceBaseImpl
 * @see vn.com.ecopharma.hrm.service.VacancyLocalServiceUtil
 */
public class VacancyLocalServiceImpl extends VacancyLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 * 
	 * Never reference this interface directly. Always use {@link
	 * vn.com.ecopharma.hrm.service.VacancyLocalServiceUtil} to access the
	 * vacancy local service.
	 */

	public List<Vacancy> findAll() throws SystemException {
		return vacancyPersistence.findAll();
	}

	public Vacancy create(long user_id, long jTitle_id,
			long hiring_mananager_id, String name, String description,
			int no_of_positions, String vacancy_status,
			 ServiceContext serviceContext) throws NoSuchVacancyException {
		try {
			User user = userPersistence.findByPrimaryKey(user_id);
			final long v_id = counterLocalService.increment();
			final Vacancy v = vacancyPersistence.create(v_id);
			final Date now = new Date(System.currentTimeMillis());
			v.setJobtitleId(jTitle_id);
			v.setHiring_manager_id(hiring_mananager_id);
			v.setName(name);
			v.setDescription(description);
			v.setNo_of_positions(no_of_positions);
			v.setVacancy_status(vacancy_status);
			v.setInsert_date(now);
			v.setUpdate_date(now);
			v.setUser_id(user.getUserId());
			v.setGroup_id(serviceContext.getScopeGroupId());
			resourceLocalService.addResources(user.getCompanyId(), serviceContext.getScopeGroupId(),
					user.getUserId(), Vacancy.class.getName(), v_id, false,
					true, true);
			vacancyPersistence.update(v);
			return v;
		} catch (SystemException e) {
			e.printStackTrace();
		} catch (PortalException e) {
			e.printStackTrace();

		}
		return null;
	}

	public Vacancy edit(long id, long jtitle_id, long hiring_manager_id,
			String name, String description, int number_of_positions) {
		Vacancy vacancy;
		try {
			vacancy = vacancyPersistence.findByPrimaryKey(id);
			vacancy.setJobtitleId(jtitle_id);
			vacancy.setHiring_manager_id(hiring_manager_id);
			vacancy.setName(name);
			vacancy.setDescription(description);
			vacancy.setNo_of_positions(number_of_positions);
			/*vacancy.setVacancy_status(vacancy_status);*/
			vacancy.setUpdate_date(new Date(System.currentTimeMillis()));
			vacancyPersistence.update(vacancy);
			return vacancy;
		} catch (NoSuchVacancyException e) {
			e.printStackTrace();
		} catch (SystemException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public void delete(long v_id) {
		try {
			vacancyPersistence.remove(v_id);
			vacancyCandidateLocalService.deleteByVacancy(v_id);
		} catch (NoSuchVacancyException e) {
			e.printStackTrace();
		} catch (SystemException e) {
			e.printStackTrace();
		}
	}
}
