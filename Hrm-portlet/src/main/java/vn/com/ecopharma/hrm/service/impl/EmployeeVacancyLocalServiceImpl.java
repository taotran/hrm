package vn.com.ecopharma.hrm.service.impl;

import java.util.Date;
import java.util.List;

import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.service.ServiceContext;

import vn.com.ecopharma.hrm.NoSuchEmployeeVacancyException;
import vn.com.ecopharma.hrm.model.EmployeeVacancy;
import vn.com.ecopharma.hrm.service.base.EmployeeVacancyLocalServiceBaseImpl;

/**
 * The implementation of the employee vacancy local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are
 * added, rerun ServiceBuilder to copy their definitions into the
 * {@link vn.com.ecopharma.hrm.service.EmployeeVacancyLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security
 * checks based on the propagated JAAS credentials because this service can only
 * be accessed from within the same VM.
 * </p>
 *
 * @author tvt
 * @see vn.com.ecopharma.hrm.service.base.EmployeeVacancyLocalServiceBaseImpl
 * @see vn.com.ecopharma.hrm.service.EmployeeVacancyLocalServiceUtil
 */
public class EmployeeVacancyLocalServiceImpl extends
		EmployeeVacancyLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 * 
	 * Never reference this interface directly. Always use {@link
	 * vn.com.ecopharma.hrm.service.EmployeeVacancyLocalServiceUtil} to access
	 * the employee vacancy local service.
	 */

	public List<EmployeeVacancy> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS);
	}

	public List<EmployeeVacancy> findAll(int start, int end) throws SystemException {
		return findAll(start, end, null);
	}

	public List<EmployeeVacancy> findAll(int start, int end,
			OrderByComparator orderByComparator) throws SystemException {
		return employeeVacancyPersistence
				.findAll(start, end, orderByComparator);
	}
	
	public List<EmployeeVacancy> findByVacancy(long vacancyId) throws SystemException {
		return employeeVacancyPersistence.findByVacancyId(vacancyId);
	}
	
	public List<EmployeeVacancy> findByEmployee(long employeeId) throws SystemException {
		return employeeVacancyPersistence.findByEmployeeId(employeeId);
	}

	public EmployeeVacancy create(long employeeId, long vacancyId, long userId,
			ServiceContext serviceContext) throws SystemException {
		final EmployeeVacancy employeeVacancy = employeeVacancyPersistence
				.create(counterLocalService.increment());

		employeeVacancy.setEmployeeId(employeeId);
		employeeVacancy.setV_id(vacancyId);
		employeeVacancy.setUserId(userId);
		employeeVacancy.setGroupId(serviceContext.getScopeGroupId());
		employeeVacancy.setCreateDate(new Date(System.currentTimeMillis()));
		employeeVacancyPersistence.update(employeeVacancy);
		return employeeVacancy;
	}
	
	public void delete(long employeeVacancyId) throws NoSuchEmployeeVacancyException, SystemException {
		employeeVacancyPersistence.remove(employeeVacancyId);
	}
}
