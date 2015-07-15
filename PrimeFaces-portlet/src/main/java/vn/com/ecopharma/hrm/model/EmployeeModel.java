package vn.com.ecopharma.hrm.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the Employee service. Represents a row in the &quot;pf_Employee&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link vn.com.ecopharma.hrm.model.impl.EmployeeModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link vn.com.ecopharma.hrm.model.impl.EmployeeImpl}.
 * </p>
 *
 * @author tvt
 * @see Employee
 * @see vn.com.ecopharma.hrm.model.impl.EmployeeImpl
 * @see vn.com.ecopharma.hrm.model.impl.EmployeeModelImpl
 * @generated
 */
public interface EmployeeModel extends BaseModel<Employee> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. All methods that expect a employee model instance should use the {@link Employee} interface instead.
     */

    /**
     * Returns the primary key of this employee.
     *
     * @return the primary key of this employee
     */
    public long getPrimaryKey();

    /**
     * Sets the primary key of this employee.
     *
     * @param primaryKey the primary key of this employee
     */
    public void setPrimaryKey(long primaryKey);

    /**
     * Returns the employee ID of this employee.
     *
     * @return the employee ID of this employee
     */
    public long getEmployeeId();

    /**
     * Sets the employee ID of this employee.
     *
     * @param employeeId the employee ID of this employee
     */
    public void setEmployeeId(long employeeId);

    /**
     * Returns the emp_code of this employee.
     *
     * @return the emp_code of this employee
     */
    @AutoEscape
    public String getEmp_code();

    /**
     * Sets the emp_code of this employee.
     *
     * @param emp_code the emp_code of this employee
     */
    public void setEmp_code(String emp_code);

    /**
     * Returns the contact_number of this employee.
     *
     * @return the contact_number of this employee
     */
    @AutoEscape
    public String getContact_number();

    /**
     * Sets the contact_number of this employee.
     *
     * @param contact_number the contact_number of this employee
     */
    public void setContact_number(String contact_number);

    /**
     * Returns the birthday of this employee.
     *
     * @return the birthday of this employee
     */
    public Date getBirthday();

    /**
     * Sets the birthday of this employee.
     *
     * @param birthday the birthday of this employee
     */
    public void setBirthday(Date birthday);

    /**
     * Returns the jobtitle ID of this employee.
     *
     * @return the jobtitle ID of this employee
     */
    public long getJobtitleId();

    /**
     * Sets the jobtitle ID of this employee.
     *
     * @param jobtitleId the jobtitle ID of this employee
     */
    public void setJobtitleId(long jobtitleId);

    /**
     * Returns the joined_date of this employee.
     *
     * @return the joined_date of this employee
     */
    public Date getJoined_date();

    /**
     * Sets the joined_date of this employee.
     *
     * @param joined_date the joined_date of this employee
     */
    public void setJoined_date(Date joined_date);

    /**
     * Returns the sub unit ID of this employee.
     *
     * @return the sub unit ID of this employee
     */
    public long getSubUnitId();

    /**
     * Sets the sub unit ID of this employee.
     *
     * @param subUnitId the sub unit ID of this employee
     */
    public void setSubUnitId(long subUnitId);

    /**
     * Returns the titles ID of this employee.
     *
     * @return the titles ID of this employee
     */
    public long getTitlesId();

    /**
     * Sets the titles ID of this employee.
     *
     * @param titlesId the titles ID of this employee
     */
    public void setTitlesId(long titlesId);

    /**
     * Returns the level ID of this employee.
     *
     * @return the level ID of this employee
     */
    public long getLevelId();

    /**
     * Sets the level ID of this employee.
     *
     * @param levelId the level ID of this employee
     */
    public void setLevelId(long levelId);

    /**
     * Returns the promoted_date of this employee.
     *
     * @return the promoted_date of this employee
     */
    public Date getPromoted_date();

    /**
     * Sets the promoted_date of this employee.
     *
     * @param promoted_date the promoted_date of this employee
     */
    public void setPromoted_date(Date promoted_date);

    /**
     * Returns the labour_contract_signed_date of this employee.
     *
     * @return the labour_contract_signed_date of this employee
     */
    public Date getLabour_contract_signed_date();

    /**
     * Sets the labour_contract_signed_date of this employee.
     *
     * @param labour_contract_signed_date the labour_contract_signed_date of this employee
     */
    public void setLabour_contract_signed_date(Date labour_contract_signed_date);

    /**
     * Returns the labour_contract_expired_date of this employee.
     *
     * @return the labour_contract_expired_date of this employee
     */
    public Date getLabour_contract_expired_date();

    /**
     * Sets the labour_contract_expired_date of this employee.
     *
     * @param labour_contract_expired_date the labour_contract_expired_date of this employee
     */
    public void setLabour_contract_expired_date(
        Date labour_contract_expired_date);

    /**
     * Returns the labour_contract_type of this employee.
     *
     * @return the labour_contract_type of this employee
     */
    @AutoEscape
    public String getLabour_contract_type();

    /**
     * Sets the labour_contract_type of this employee.
     *
     * @param labour_contract_type the labour_contract_type of this employee
     */
    public void setLabour_contract_type(String labour_contract_type);

    /**
     * Returns the gender of this employee.
     *
     * @return the gender of this employee
     */
    @AutoEscape
    public String getGender();

    /**
     * Sets the gender of this employee.
     *
     * @param gender the gender of this employee
     */
    public void setGender(String gender);

    /**
     * Returns the place_of_birth of this employee.
     *
     * @return the place_of_birth of this employee
     */
    @AutoEscape
    public String getPlace_of_birth();

    /**
     * Sets the place_of_birth of this employee.
     *
     * @param place_of_birth the place_of_birth of this employee
     */
    public void setPlace_of_birth(String place_of_birth);

    /**
     * Returns the education of this employee.
     *
     * @return the education of this employee
     */
    @AutoEscape
    public String getEducation();

    /**
     * Sets the education of this employee.
     *
     * @param education the education of this employee
     */
    public void setEducation(String education);

    /**
     * Returns the education_specialize of this employee.
     *
     * @return the education_specialize of this employee
     */
    @AutoEscape
    public String getEducation_specialize();

    /**
     * Sets the education_specialize of this employee.
     *
     * @param education_specialize the education_specialize of this employee
     */
    public void setEducation_specialize(String education_specialize);

    /**
     * Returns the university ID of this employee.
     *
     * @return the university ID of this employee
     */
    public long getUniversityId();

    /**
     * Sets the university ID of this employee.
     *
     * @param universityId the university ID of this employee
     */
    public void setUniversityId(long universityId);

    /**
     * Returns the marital_status of this employee.
     *
     * @return the marital_status of this employee
     */
    @AutoEscape
    public String getMarital_status();

    /**
     * Sets the marital_status of this employee.
     *
     * @param marital_status the marital_status of this employee
     */
    public void setMarital_status(String marital_status);

    /**
     * Returns the identity card no of this employee.
     *
     * @return the identity card no of this employee
     */
    @AutoEscape
    public String getIdentityCardNo();

    /**
     * Sets the identity card no of this employee.
     *
     * @param identityCardNo the identity card no of this employee
     */
    public void setIdentityCardNo(String identityCardNo);

    /**
     * Returns the issued_date of this employee.
     *
     * @return the issued_date of this employee
     */
    public Date getIssued_date();

    /**
     * Sets the issued_date of this employee.
     *
     * @param issued_date the issued_date of this employee
     */
    public void setIssued_date(Date issued_date);

    /**
     * Returns the issued_place of this employee.
     *
     * @return the issued_place of this employee
     */
    @AutoEscape
    public String getIssued_place();

    /**
     * Sets the issued_place of this employee.
     *
     * @param issued_place the issued_place of this employee
     */
    public void setIssued_place(String issued_place);

    /**
     * Returns the address ID of this employee.
     *
     * @return the address ID of this employee
     */
    public long getAddressId();

    /**
     * Sets the address ID of this employee.
     *
     * @param addressId the address ID of this employee
     */
    public void setAddressId(long addressId);

    /**
     * Returns the company_email of this employee.
     *
     * @return the company_email of this employee
     */
    @AutoEscape
    public String getCompany_email();

    /**
     * Sets the company_email of this employee.
     *
     * @param company_email the company_email of this employee
     */
    public void setCompany_email(String company_email);

    /**
     * Returns the personal_tax_code of this employee.
     *
     * @return the personal_tax_code of this employee
     */
    @AutoEscape
    public String getPersonal_tax_code();

    /**
     * Sets the personal_tax_code of this employee.
     *
     * @param personal_tax_code the personal_tax_code of this employee
     */
    public void setPersonal_tax_code(String personal_tax_code);

    /**
     * Returns the number_of_dependents of this employee.
     *
     * @return the number_of_dependents of this employee
     */
    public int getNumber_of_dependents();

    /**
     * Sets the number_of_dependents of this employee.
     *
     * @param number_of_dependents the number_of_dependents of this employee
     */
    public void setNumber_of_dependents(int number_of_dependents);

    /**
     * Returns the dependent_names of this employee.
     *
     * @return the dependent_names of this employee
     */
    @AutoEscape
    public String getDependent_names();

    /**
     * Sets the dependent_names of this employee.
     *
     * @param dependent_names the dependent_names of this employee
     */
    public void setDependent_names(String dependent_names);

    /**
     * Returns the social_insurance_no of this employee.
     *
     * @return the social_insurance_no of this employee
     */
    @AutoEscape
    public String getSocial_insurance_no();

    /**
     * Sets the social_insurance_no of this employee.
     *
     * @param social_insurance_no the social_insurance_no of this employee
     */
    public void setSocial_insurance_no(String social_insurance_no);

    /**
     * Returns the health_insurance_no of this employee.
     *
     * @return the health_insurance_no of this employee
     */
    @AutoEscape
    public String getHealth_insurance_no();

    /**
     * Sets the health_insurance_no of this employee.
     *
     * @param health_insurance_no the health_insurance_no of this employee
     */
    public void setHealth_insurance_no(String health_insurance_no);

    /**
     * Returns the bank_account_no of this employee.
     *
     * @return the bank_account_no of this employee
     */
    @AutoEscape
    public String getBank_account_no();

    /**
     * Sets the bank_account_no of this employee.
     *
     * @param bank_account_no the bank_account_no of this employee
     */
    public void setBank_account_no(String bank_account_no);

    /**
     * Returns the bank_branch_name of this employee.
     *
     * @return the bank_branch_name of this employee
     */
    @AutoEscape
    public String getBank_branch_name();

    /**
     * Sets the bank_branch_name of this employee.
     *
     * @param bank_branch_name the bank_branch_name of this employee
     */
    public void setBank_branch_name(String bank_branch_name);

    /**
     * Returns the base_wage_rates of this employee.
     *
     * @return the base_wage_rates of this employee
     */
    public double getBase_wage_rates();

    /**
     * Sets the base_wage_rates of this employee.
     *
     * @param base_wage_rates the base_wage_rates of this employee
     */
    public void setBase_wage_rates(double base_wage_rates);

    /**
     * Returns the position_wage_rates of this employee.
     *
     * @return the position_wage_rates of this employee
     */
    public double getPosition_wage_rates();

    /**
     * Sets the position_wage_rates of this employee.
     *
     * @param position_wage_rates the position_wage_rates of this employee
     */
    public void setPosition_wage_rates(double position_wage_rates);

    /**
     * Returns the capacity_salary of this employee.
     *
     * @return the capacity_salary of this employee
     */
    public double getCapacity_salary();

    /**
     * Sets the capacity_salary of this employee.
     *
     * @param capacity_salary the capacity_salary of this employee
     */
    public void setCapacity_salary(double capacity_salary);

    /**
     * Returns the total_salary of this employee.
     *
     * @return the total_salary of this employee
     */
    public double getTotal_salary();

    /**
     * Sets the total_salary of this employee.
     *
     * @param total_salary the total_salary of this employee
     */
    public void setTotal_salary(double total_salary);

    /**
     * Returns the bonus of this employee.
     *
     * @return the bonus of this employee
     */
    public double getBonus();

    /**
     * Sets the bonus of this employee.
     *
     * @param bonus the bonus of this employee
     */
    public void setBonus(double bonus);

    /**
     * Returns the resigned_date of this employee.
     *
     * @return the resigned_date of this employee
     */
    public Date getResigned_date();

    /**
     * Sets the resigned_date of this employee.
     *
     * @param resigned_date the resigned_date of this employee
     */
    public void setResigned_date(Date resigned_date);

    /**
     * Returns the employee_user ID of this employee.
     *
     * @return the employee_user ID of this employee
     */
    public long getEmployee_userId();

    /**
     * Sets the employee_user ID of this employee.
     *
     * @param employee_userId the employee_user ID of this employee
     */
    public void setEmployee_userId(long employee_userId);

    /**
     * Returns the group ID of this employee.
     *
     * @return the group ID of this employee
     */
    public long getGroupId();

    /**
     * Sets the group ID of this employee.
     *
     * @param groupId the group ID of this employee
     */
    public void setGroupId(long groupId);

    /**
     * Returns the company ID of this employee.
     *
     * @return the company ID of this employee
     */
    public long getCompanyId();

    /**
     * Sets the company ID of this employee.
     *
     * @param companyId the company ID of this employee
     */
    public void setCompanyId(long companyId);

    /**
     * Returns the user ID of this employee.
     *
     * @return the user ID of this employee
     */
    public long getUserId();

    /**
     * Sets the user ID of this employee.
     *
     * @param userId the user ID of this employee
     */
    public void setUserId(long userId);

    /**
     * Returns the user uuid of this employee.
     *
     * @return the user uuid of this employee
     * @throws SystemException if a system exception occurred
     */
    public String getUserUuid() throws SystemException;

    /**
     * Sets the user uuid of this employee.
     *
     * @param userUuid the user uuid of this employee
     */
    public void setUserUuid(String userUuid);

    /**
     * Returns the create date of this employee.
     *
     * @return the create date of this employee
     */
    public Date getCreateDate();

    /**
     * Sets the create date of this employee.
     *
     * @param createDate the create date of this employee
     */
    public void setCreateDate(Date createDate);

    /**
     * Returns the modified date of this employee.
     *
     * @return the modified date of this employee
     */
    public Date getModifiedDate();

    /**
     * Sets the modified date of this employee.
     *
     * @param modifiedDate the modified date of this employee
     */
    public void setModifiedDate(Date modifiedDate);

    /**
     * Returns the is deleted of this employee.
     *
     * @return the is deleted of this employee
     */
    public boolean getIsDeleted();

    /**
     * Returns <code>true</code> if this employee is is deleted.
     *
     * @return <code>true</code> if this employee is is deleted; <code>false</code> otherwise
     */
    public boolean isIsDeleted();

    /**
     * Sets whether this employee is is deleted.
     *
     * @param isDeleted the is deleted of this employee
     */
    public void setIsDeleted(boolean isDeleted);

    @Override
    public boolean isNew();

    @Override
    public void setNew(boolean n);

    @Override
    public boolean isCachedModel();

    @Override
    public void setCachedModel(boolean cachedModel);

    @Override
    public boolean isEscapedModel();

    @Override
    public Serializable getPrimaryKeyObj();

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj);

    @Override
    public ExpandoBridge getExpandoBridge();

    @Override
    public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

    @Override
    public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

    @Override
    public void setExpandoBridgeAttributes(ServiceContext serviceContext);

    @Override
    public Object clone();

    @Override
    public int compareTo(Employee employee);

    @Override
    public int hashCode();

    @Override
    public CacheModel<Employee> toCacheModel();

    @Override
    public Employee toEscapedModel();

    @Override
    public Employee toUnescapedModel();

    @Override
    public String toString();

    @Override
    public String toXmlString();
}
