package vn.com.ecopharma.hrm.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import org.json.JSONArray;

import com.liferay.portal.NoSuchModelException;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.model.User;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.service.UserLocalServiceUtil;

import vn.com.ecopharma.hrm.NoSuchVacancyCandidateException;
import vn.com.ecopharma.hrm.model.Candidate;
import vn.com.ecopharma.hrm.model.Employee;
import vn.com.ecopharma.hrm.model.EmployeeInterviewSchedule;
import vn.com.ecopharma.hrm.service.base.EmployeeLocalServiceBaseImpl;
import vn.com.ecopharma.hrm.service.persistence.EmployeeFinderUtil;

/**
 * The implementation of the employee local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are
 * added, rerun ServiceBuilder to copy their definitions into the
 * {@link vn.com.ecopharma.hrm.service.EmployeeLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security
 * checks based on the propagated JAAS credentials because this service can only
 * be accessed from within the same VM.
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
	 * Never reference this interface directly. Always use {@link
	 * vn.com.ecopharma.hrm.service.EmployeeLocalServiceUtil} to access the
	 * employee local service.
	 */
	public List<Employee> findAll() throws SystemException {
		return employeePersistence
				.findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS);
	}

	public List<Employee> findAll(int start, int end) throws SystemException {
		return employeePersistence.findAll(start, end, null);
	}

	public List<Employee> findAll(int start, int end,
			OrderByComparator orderByComparator) throws SystemException {
		return employeePersistence.findAll(start, end, orderByComparator);
	}

	public Employee create1(String emp_code, String firstname,
			String middle_name, String lastname, String email,
			String contact_number, String nickname, Date birthday,
			String gender, long jobTitleId, Date joined_date, long userId,
			ServiceContext serviceContext) throws SystemException {
		Employee emp = employeePersistence.create(counterLocalService
				.increment());
		emp.setEmp_code(emp_code);
		emp.setContact_number(contact_number);
		emp.setBirthday(birthday);
		emp.setGender(gender);
		emp.setJobtitleId(jobTitleId);
		emp.setJoined_date(joined_date);
		emp.setUserId(userId);
		emp.setGroupId(serviceContext.getScopeGroupId());
		emp = employeePersistence.update(emp);
		return emp;
	}

	public Employee addEmployee(long creatorUserId, long companyId,
				boolean autoPassword, String password1, String password2,
				boolean autoScreenName, String screenName, String emailAddress,
				long facebookId, String openId, Locale locale, String firstName,
				String middleName, String lastName, int prefixId,
				int suffixId, boolean male, int birthdayMonth, int birthdayDay,
				int birthdayYear, long[] groupIds,
				long[] organizationIds, long[] roleIds, long[] userGroupIds,
				boolean sendEmail, //End user part
				String emp_code, String contact_number, long jobtitleId, Date joined_date, //
				long subUnitId, long titles_id, long level_id, Date promoted_date,  //
				Date labour_contract_signed_date, Date labour_contract_expired_date, String labour_contract_type, //
				String gender, String place_of_birth, String education, String education_specialize, long universityId, //
				String marital_status, String identityCardNo, Date issued_date, String issued_place, long addressId, //
				String company_email, String personal_tax_code, int number_of_dependents, String dependent_names,  // tax & dependents
				String social_insurance_no, String health_insurance_no, String bank_account_no, String bank_branch_name, // banking & insurances
				double base_wage_rates, double position_wage_rates, double capacity_salary, double total_salary, double bonus, // salary
				Date resigned_date, long emp_userId, ServiceContext serviceContext
			) throws SystemException, PortalException {
		final long empId = counterLocalService.increment();
		Employee e = employeePersistence.create(empId);
		e.setEmp_code(emp_code);
		e.setContact_number(contact_number);
		e.setJobtitleId(jobtitleId);
		e.setJoined_date(joined_date);
		e.setLabour_contract_signed_date(labour_contract_signed_date);
		e.setLabour_contract_expired_date(labour_contract_expired_date);
		e.setLabour_contract_type(labour_contract_type);
		e.setGender(gender);
		e.setPlace_of_birth(place_of_birth);
		e.setEducation(education_specialize);
		e.setEducation_specialize(education_specialize);
		e.setUniversityId(universityId);
		e.setMarital_status(marital_status);
		e.setIdentityCardNo(identityCardNo);
		e.setIssued_date(issued_date);
		e.setIssued_place(issued_place);
		e.setAddressId(addressId);
		e.setCompany_email(company_email);
		e.setPersonal_tax_code(personal_tax_code);
		e.setNumber_of_dependents(number_of_dependents);
		e.setDependent_names(dependent_names);
		e.setSocial_insurance_no(social_insurance_no);
		e.setHealth_insurance_no(health_insurance_no);
		e.setBank_account_no(bank_account_no);
		e.setBank_branch_name(bank_branch_name);
		e.setBase_wage_rates(base_wage_rates);
		e.setPosition_wage_rates(position_wage_rates);
		e.setCapacity_salary(capacity_salary);
		e.setTotal_salary(total_salary);
		e.setBonus(bonus);
		e.setResigned_date(resigned_date);
		e.setUserId(serviceContext.getUserId());
		e.setGroupId(serviceContext.getScopeGroupId());
		e = employeePersistence.update(e);
		
		//Add User Part
		User user = UserLocalServiceUtil.addUser(creatorUserId, companyId, autoPassword, password1, password2, autoScreenName, 
				screenName, emailAddress, facebookId, openId, locale, firstName, middleName, lastName, 
				prefixId, suffixId, male, birthdayMonth, birthdayDay, birthdayYear, jTitleLocalService.getJTitle(jobtitleId).getTitle(), 
				groupIds, organizationIds, roleIds, userGroupIds, sendEmail, serviceContext);

		e.setEmployee_userId(user.getUserId());
		
		return employeePersistence.update(e);
	}

	@Deprecated
	public Employee tranferCandidate(Candidate candidate, String emp_code,
			String nickname, Date birthday, long jobTitleId, Date joined_date)
			throws SystemException {
		Employee emp = employeePersistence.create(counterLocalService
				.increment());
		emp.setEmp_code(emp_code);
		/* Transfer information from Candidate */
		emp.setBirthday(birthday);
		/* #### */

		emp.setJobtitleId(jobTitleId);
		emp.setJoined_date(joined_date);
		emp = employeePersistence.update(emp);
		return emp;
	}

	public void delete(long employeeId) throws SystemException,
			NoSuchVacancyCandidateException, NoSuchModelException {

		/* DELETE all associated EmployeeInterviewSchedules */
		for (final EmployeeInterviewSchedule eis : employeeInterviewSchedulePersistence
				.findByEmpId(employeeId)) {
			employeeInterviewScheduleLocalService.delete(eis
					.getEmployeeInterviewScheduleId());
		}

		/* DELETE Employee */
		employeePersistence.remove(employeeId);
	}

	public String getListInterviewersStringByIds(List<Long> ids)
			throws PortalException, SystemException {
		return this.getListInterviewersStringByEmps(findByIds(ids));
	}

	public String getListInterviewersStringByEmps(List<Employee> emps) {
		String s = "";
		int count = 0;
		for (Employee emp : emps) {
			if (count < emps.size()) {
				// s+=emp.getLastname() + ",";
				count++;
			} else {
				// s+=emp.getLastname();
			}
		}
		return s;
	}

	public List<Employee> findByIds(List<Long> ids) throws PortalException,
			SystemException {
		final List<Employee> emps = new ArrayList<Employee>(ids.size());
		for (Long id : ids) {
			emps.add(this.getEmployee(id));
		}
		return emps;
	}

	public int filterEmployeeByTermSize(String term) {
		return EmployeeFinderUtil.filterEmployeeByTermSize(term);
	}

	public JSONArray filterEmployeeByTerm(String term, int start, int end) {
		return EmployeeFinderUtil.filterEmployeeByTerm(term, start, end);
	}

	public int countAll() throws SystemException {
		return employeePersistence.countAll();
	}

}
