package vn.com.ecopharma.hrm.service.impl;

import java.util.List;

import com.liferay.portal.NoSuchModelException;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;

import vn.com.ecopharma.hrm.NoSuchVacancyCandidateException;
import vn.com.ecopharma.hrm.model.Employee;
import vn.com.ecopharma.hrm.model.EmployeeInterviewSchedule;
import vn.com.ecopharma.hrm.service.base.EmployeeLocalServiceBaseImpl;

/**
 * The implementation of the employee local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link vn.com.ecopharma.hrm.service.EmployeeLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author tvt
 * @see vn.com.ecopharma.hrm.service.base.EmployeeLocalServiceBaseImpl
 * @see vn.com.ecopharma.hrm.service.EmployeeLocalServiceUtil
 */
public class EmployeeLocalServiceImpl extends EmployeeLocalServiceBaseImpl {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never reference this interface directly. Always use {@link vn.com.ecopharma.hrm.service.EmployeeLocalServiceUtil} to access the employee local service.
     */
	public List<Employee> findAll() throws SystemException {
		return employeePersistence.findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS);
	}
	
	public List<Employee> findAll(int start, int end) throws SystemException {
		return employeePersistence.findAll(start, end, null);
	}
	
	public List<Employee> findAll(int start, int end, OrderByComparator orderByComparator) throws SystemException {
		return employeePersistence.findAll(start, end, orderByComparator);
	}
	
	public void delete(long employeeId) throws SystemException, NoSuchVacancyCandidateException, NoSuchModelException {
		
		/* DELETE all associated EmployeeInterviewSchedules */
		for (final EmployeeInterviewSchedule eis: employeeInterviewSchedulePersistence.findByEmpId(employeeId)) {
			employeeInterviewScheduleLocalService.delete(eis.getEmployeeInterviewScheduleId());
		}
		
		/* DELETE Employee */
		employeePersistence.remove(employeeId);
	}
	
}
