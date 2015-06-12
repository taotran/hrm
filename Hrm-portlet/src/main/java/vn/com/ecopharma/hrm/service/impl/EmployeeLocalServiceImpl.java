package vn.com.ecopharma.hrm.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.liferay.portal.NoSuchModelException;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.service.ServiceContext;

import vn.com.ecopharma.hrm.NoSuchVacancyCandidateException;
import vn.com.ecopharma.hrm.model.Candidate;
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
	
	public Employee create(String emp_code, String firstname, String middle_name, String lastname, String email, String contact_number, String nickname, Date birthday, String gender, long jobTitleId, Date joined_date, long userId, ServiceContext serviceContext) throws SystemException {
		Employee emp = employeePersistence.create(counterLocalService.increment());
		emp.setEmp_code(emp_code);
		emp.setFirstname(firstname);
		emp.setMiddle_name(middle_name);
		emp.setLastname(lastname);
		emp.setEmail(email);
		emp.setContact_number(contact_number);
		emp.setNickname(nickname);
		emp.setBirthday(birthday);
		emp.setGender(gender);
		emp.setJobtitleId(jobTitleId);
		emp.setJoined_date(joined_date);
		emp.setUserId(userId);
		emp.setGroupId(serviceContext.getScopeGroupId());
		emp = employeePersistence.update(emp);
		return emp;
	}
	
	@Deprecated
	public Employee tranferCandidate(Candidate candidate, String emp_code, String nickname, Date birthday, long jobTitleId, Date joined_date) throws SystemException {
		Employee emp = employeePersistence.create(counterLocalService.increment());
		emp.setEmp_code(emp_code);
		/* Transfer information from Candidate */
		emp.setFirstname(candidate.getFirst_name());
		emp.setMiddle_name(candidate.getMiddle_name());
		emp.setLastname(candidate.getLast_name());
		emp.setBirthday(birthday);
		emp.setEmail(candidate.getEmail());
		/*####*/
		
		emp.setNickname(nickname);
		emp.setJobtitleId(jobTitleId);
		emp.setJoined_date(joined_date);
		emp = employeePersistence.update(emp);
		return emp;
	}
	
	public void delete(long employeeId) throws SystemException, NoSuchVacancyCandidateException, NoSuchModelException {
		
		/* DELETE all associated EmployeeInterviewSchedules */
		for (final EmployeeInterviewSchedule eis: employeeInterviewSchedulePersistence.findByEmpId(employeeId)) {
			employeeInterviewScheduleLocalService.delete(eis.getEmployeeInterviewScheduleId());
		}
		
		/* DELETE Employee */
		employeePersistence.remove(employeeId);
	}
	
	public String getListInterviewersStringByIds(List<Long> ids) throws PortalException, SystemException {
		return this.getListInterviewersStringByEmps(findByIds(ids));
	}
	
	public String getListInterviewersStringByEmps(List<Employee> emps) {
		String s = "";
		int count = 0;
		for (Employee emp: emps) {
			if (count < emps.size()) {
				s+=emp.getLastname() + ",";
				count++;
			} else {
				s+=emp.getLastname();
			}
		}
		return s;
	}
	
	public List<Employee> findByIds(List<Long> ids) throws PortalException, SystemException {
		final List<Employee> emps = new ArrayList<Employee>(ids.size());
		for(Long id: ids) {
			emps.add(this.getEmployee(id));
		}
		return emps;
	}
	
	public List<Employee> filterByName(String term) throws SystemException {
		return employeePersistence.findByName(term, term, term);
	}
	
}
