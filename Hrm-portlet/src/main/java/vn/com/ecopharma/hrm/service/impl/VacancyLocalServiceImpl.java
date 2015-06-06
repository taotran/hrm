package vn.com.ecopharma.hrm.service.impl;

import java.util.Date;
import java.util.List;

import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.model.User;
import com.liferay.portal.service.ServiceContext;

import vn.com.ecopharma.hrm.NoSuchCandidateException;
import vn.com.ecopharma.hrm.NoSuchEmployeeVacancyException;
import vn.com.ecopharma.hrm.NoSuchInterviewScheduleException;
import vn.com.ecopharma.hrm.NoSuchVacancyCandidateException;
import vn.com.ecopharma.hrm.NoSuchVacancyException;
import vn.com.ecopharma.hrm.model.EmployeeVacancy;
import vn.com.ecopharma.hrm.model.Vacancy;
import vn.com.ecopharma.hrm.model.VacancyCandidate;
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
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS);
	}

	public List<Vacancy> findAll(int start, int end) throws SystemException {
		return findAll(start, end, null);
	}

	public List<Vacancy> findAll(int start, int end,
			OrderByComparator orderByComparator) throws SystemException {
		return vacancyPersistence.findAll(start, end, orderByComparator);
	}

	public Vacancy create(long user_id, long jTitle_id, long locationId, List<Long> emps, String name, String description,
			int no_of_positions, String vacancy_status, String job_posting,
			ServiceContext serviceContext) throws PortalException,
			SystemException {
		User user = userPersistence.findByPrimaryKey(user_id);
		final long v_id = counterLocalService.increment();
		final Vacancy v = vacancyPersistence.create(v_id);
		final Date now = new Date(System.currentTimeMillis());
		v.setJobtitleId(jTitle_id);
		v.setLocationId(locationId);
		v.setName(name);
		v.setDescription(description);
		v.setNo_of_positions(no_of_positions);
		v.setVacancy_status(vacancy_status);
		v.setInsert_date(now);
		v.setUpdate_date(now);
		v.setUser_id(user.getUserId());
		v.setGroup_id(serviceContext.getScopeGroupId());
		/* update new vacancy managers */
		for (long id: emps) {
			employeeVacancyLocalService.create(id, v_id, user.getUserId(), serviceContext);
		}
		resourceLocalService.addResources(user.getCompanyId(),
				serviceContext.getScopeGroupId(), user.getUserId(),
				Vacancy.class.getName(), v_id, false, true, true);
		vacancyPersistence.update(v);
		return v;
	}

	public Vacancy edit(long v_id, long jtitle_id, long locationId, List<Long> emps, String name, String description,
			int number_of_positions, String job_posting, ServiceContext serviceContext)
			throws SystemException, NoSuchVacancyException {
		Vacancy vacancy = vacancyPersistence.findByPrimaryKey(v_id);
		vacancy.setJobtitleId(jtitle_id);
		vacancy.setLocationId(locationId);
		vacancy.setName(name);
		vacancy.setDescription(description);
		vacancy.setNo_of_positions(number_of_positions);
		vacancy.setUpdate_date(new Date(System.currentTimeMillis()));
		/* update new vacancy managers */
		for (long employeeId: emps) {
			if (employeeVacancyPersistence.fetchByVacancyId_EmployeeId(v_id, employeeId) == null) {
				employeeVacancyLocalService.create(employeeId, v_id, serviceContext.getUserId(), serviceContext);
			}
		}
		vacancyPersistence.update(vacancy);
		return vacancy;
	}

	public void delete(long v_id) throws NoSuchVacancyException,
			SystemException, NoSuchVacancyCandidateException,
			NoSuchInterviewScheduleException, NoSuchCandidateException, NoSuchEmployeeVacancyException {
		vacancyPersistence.remove(v_id);
		final List<VacancyCandidate> vacancyCandidates = vacancyCandidateLocalService
				.findByVacancy(v_id);
		if (vacancyCandidates != null && vacancyCandidates.size() > 0) {
			/* CLEAR associated candidates' status */
			for (VacancyCandidate vc : vacancyCandidates) {
				candidatePersistence.findByPrimaryKey(vc.getC_id());
			}
			vacancyCandidateLocalService.deleteByVacancy(v_id);
		}
		
		/* DELETE associated EmployeeVacancy */
		final List<EmployeeVacancy> employeeVacancies = employeeVacancyPersistence.findByVacancyId(v_id);
		if (employeeVacancies != null && employeeVacancies.size() > 0) {
			for (EmployeeVacancy ev: employeeVacancies) {
				employeeVacancyPersistence.remove(ev.getEmployeeVacancyId());
			}
		}
		
	}
}
