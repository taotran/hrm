package vn.com.ecopharma.hrm.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Employee}.
 * </p>
 *
 * @author tvt
 * @see Employee
 * @generated
 */
public class EmployeeWrapper implements Employee, ModelWrapper<Employee> {
    private Employee _employee;

    public EmployeeWrapper(Employee employee) {
        _employee = employee;
    }

    @Override
    public Class<?> getModelClass() {
        return Employee.class;
    }

    @Override
    public String getModelClassName() {
        return Employee.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("employeeId", getEmployeeId());
        attributes.put("emp_code", getEmp_code());
        attributes.put("contact_number", getContact_number());
        attributes.put("birthday", getBirthday());
        attributes.put("jobtitleId", getJobtitleId());
        attributes.put("joined_date", getJoined_date());
        attributes.put("subUnitId", getSubUnitId());
        attributes.put("titlesId", getTitlesId());
        attributes.put("levelId", getLevelId());
        attributes.put("promoted_date", getPromoted_date());
        attributes.put("labour_contract_signed_date",
            getLabour_contract_signed_date());
        attributes.put("labour_contract_expired_date",
            getLabour_contract_expired_date());
        attributes.put("labour_contract_type", getLabour_contract_type());
        attributes.put("gender", getGender());
        attributes.put("place_of_birth", getPlace_of_birth());
        attributes.put("education", getEducation());
        attributes.put("education_specialize", getEducation_specialize());
        attributes.put("universityId", getUniversityId());
        attributes.put("marital_status", getMarital_status());
        attributes.put("identityCardNo", getIdentityCardNo());
        attributes.put("issued_date", getIssued_date());
        attributes.put("issued_place", getIssued_place());
        attributes.put("addressId", getAddressId());
        attributes.put("company_email", getCompany_email());
        attributes.put("personal_tax_code", getPersonal_tax_code());
        attributes.put("number_of_dependents", getNumber_of_dependents());
        attributes.put("dependent_names", getDependent_names());
        attributes.put("social_insurance_no", getSocial_insurance_no());
        attributes.put("health_insurance_no", getHealth_insurance_no());
        attributes.put("bank_account_no", getBank_account_no());
        attributes.put("bank_branch_name", getBank_branch_name());
        attributes.put("base_wage_rates", getBase_wage_rates());
        attributes.put("position_wage_rates", getPosition_wage_rates());
        attributes.put("capacity_salary", getCapacity_salary());
        attributes.put("total_salary", getTotal_salary());
        attributes.put("bonus", getBonus());
        attributes.put("resigned_date", getResigned_date());
        attributes.put("employee_userId", getEmployee_userId());
        attributes.put("groupId", getGroupId());
        attributes.put("companyId", getCompanyId());
        attributes.put("userId", getUserId());
        attributes.put("createDate", getCreateDate());
        attributes.put("modifiedDate", getModifiedDate());
        attributes.put("isDeleted", getIsDeleted());
        attributes.put("companyEmailAddress", getCompanyEmailAddress());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long employeeId = (Long) attributes.get("employeeId");

        if (employeeId != null) {
            setEmployeeId(employeeId);
        }

        String emp_code = (String) attributes.get("emp_code");

        if (emp_code != null) {
            setEmp_code(emp_code);
        }

        String contact_number = (String) attributes.get("contact_number");

        if (contact_number != null) {
            setContact_number(contact_number);
        }

        Date birthday = (Date) attributes.get("birthday");

        if (birthday != null) {
            setBirthday(birthday);
        }

        Long jobtitleId = (Long) attributes.get("jobtitleId");

        if (jobtitleId != null) {
            setJobtitleId(jobtitleId);
        }

        Date joined_date = (Date) attributes.get("joined_date");

        if (joined_date != null) {
            setJoined_date(joined_date);
        }

        Long subUnitId = (Long) attributes.get("subUnitId");

        if (subUnitId != null) {
            setSubUnitId(subUnitId);
        }

        Long titlesId = (Long) attributes.get("titlesId");

        if (titlesId != null) {
            setTitlesId(titlesId);
        }

        Long levelId = (Long) attributes.get("levelId");

        if (levelId != null) {
            setLevelId(levelId);
        }

        Date promoted_date = (Date) attributes.get("promoted_date");

        if (promoted_date != null) {
            setPromoted_date(promoted_date);
        }

        Date labour_contract_signed_date = (Date) attributes.get(
                "labour_contract_signed_date");

        if (labour_contract_signed_date != null) {
            setLabour_contract_signed_date(labour_contract_signed_date);
        }

        Date labour_contract_expired_date = (Date) attributes.get(
                "labour_contract_expired_date");

        if (labour_contract_expired_date != null) {
            setLabour_contract_expired_date(labour_contract_expired_date);
        }

        String labour_contract_type = (String) attributes.get(
                "labour_contract_type");

        if (labour_contract_type != null) {
            setLabour_contract_type(labour_contract_type);
        }

        String gender = (String) attributes.get("gender");

        if (gender != null) {
            setGender(gender);
        }

        String place_of_birth = (String) attributes.get("place_of_birth");

        if (place_of_birth != null) {
            setPlace_of_birth(place_of_birth);
        }

        String education = (String) attributes.get("education");

        if (education != null) {
            setEducation(education);
        }

        String education_specialize = (String) attributes.get(
                "education_specialize");

        if (education_specialize != null) {
            setEducation_specialize(education_specialize);
        }

        Long universityId = (Long) attributes.get("universityId");

        if (universityId != null) {
            setUniversityId(universityId);
        }

        String marital_status = (String) attributes.get("marital_status");

        if (marital_status != null) {
            setMarital_status(marital_status);
        }

        String identityCardNo = (String) attributes.get("identityCardNo");

        if (identityCardNo != null) {
            setIdentityCardNo(identityCardNo);
        }

        Date issued_date = (Date) attributes.get("issued_date");

        if (issued_date != null) {
            setIssued_date(issued_date);
        }

        String issued_place = (String) attributes.get("issued_place");

        if (issued_place != null) {
            setIssued_place(issued_place);
        }

        Long addressId = (Long) attributes.get("addressId");

        if (addressId != null) {
            setAddressId(addressId);
        }

        String company_email = (String) attributes.get("company_email");

        if (company_email != null) {
            setCompany_email(company_email);
        }

        String personal_tax_code = (String) attributes.get("personal_tax_code");

        if (personal_tax_code != null) {
            setPersonal_tax_code(personal_tax_code);
        }

        Integer number_of_dependents = (Integer) attributes.get(
                "number_of_dependents");

        if (number_of_dependents != null) {
            setNumber_of_dependents(number_of_dependents);
        }

        String dependent_names = (String) attributes.get("dependent_names");

        if (dependent_names != null) {
            setDependent_names(dependent_names);
        }

        String social_insurance_no = (String) attributes.get(
                "social_insurance_no");

        if (social_insurance_no != null) {
            setSocial_insurance_no(social_insurance_no);
        }

        String health_insurance_no = (String) attributes.get(
                "health_insurance_no");

        if (health_insurance_no != null) {
            setHealth_insurance_no(health_insurance_no);
        }

        String bank_account_no = (String) attributes.get("bank_account_no");

        if (bank_account_no != null) {
            setBank_account_no(bank_account_no);
        }

        String bank_branch_name = (String) attributes.get("bank_branch_name");

        if (bank_branch_name != null) {
            setBank_branch_name(bank_branch_name);
        }

        Double base_wage_rates = (Double) attributes.get("base_wage_rates");

        if (base_wage_rates != null) {
            setBase_wage_rates(base_wage_rates);
        }

        Double position_wage_rates = (Double) attributes.get(
                "position_wage_rates");

        if (position_wage_rates != null) {
            setPosition_wage_rates(position_wage_rates);
        }

        Double capacity_salary = (Double) attributes.get("capacity_salary");

        if (capacity_salary != null) {
            setCapacity_salary(capacity_salary);
        }

        Double total_salary = (Double) attributes.get("total_salary");

        if (total_salary != null) {
            setTotal_salary(total_salary);
        }

        Double bonus = (Double) attributes.get("bonus");

        if (bonus != null) {
            setBonus(bonus);
        }

        Date resigned_date = (Date) attributes.get("resigned_date");

        if (resigned_date != null) {
            setResigned_date(resigned_date);
        }

        Long employee_userId = (Long) attributes.get("employee_userId");

        if (employee_userId != null) {
            setEmployee_userId(employee_userId);
        }

        Long groupId = (Long) attributes.get("groupId");

        if (groupId != null) {
            setGroupId(groupId);
        }

        Long companyId = (Long) attributes.get("companyId");

        if (companyId != null) {
            setCompanyId(companyId);
        }

        Long userId = (Long) attributes.get("userId");

        if (userId != null) {
            setUserId(userId);
        }

        Date createDate = (Date) attributes.get("createDate");

        if (createDate != null) {
            setCreateDate(createDate);
        }

        Date modifiedDate = (Date) attributes.get("modifiedDate");

        if (modifiedDate != null) {
            setModifiedDate(modifiedDate);
        }

        Boolean isDeleted = (Boolean) attributes.get("isDeleted");

        if (isDeleted != null) {
            setIsDeleted(isDeleted);
        }

        String companyEmailAddress = (String) attributes.get(
                "companyEmailAddress");

        if (companyEmailAddress != null) {
            setCompanyEmailAddress(companyEmailAddress);
        }
    }

    /**
    * Returns the primary key of this employee.
    *
    * @return the primary key of this employee
    */
    @Override
    public long getPrimaryKey() {
        return _employee.getPrimaryKey();
    }

    /**
    * Sets the primary key of this employee.
    *
    * @param primaryKey the primary key of this employee
    */
    @Override
    public void setPrimaryKey(long primaryKey) {
        _employee.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the employee ID of this employee.
    *
    * @return the employee ID of this employee
    */
    @Override
    public long getEmployeeId() {
        return _employee.getEmployeeId();
    }

    /**
    * Sets the employee ID of this employee.
    *
    * @param employeeId the employee ID of this employee
    */
    @Override
    public void setEmployeeId(long employeeId) {
        _employee.setEmployeeId(employeeId);
    }

    /**
    * Returns the emp_code of this employee.
    *
    * @return the emp_code of this employee
    */
    @Override
    public java.lang.String getEmp_code() {
        return _employee.getEmp_code();
    }

    /**
    * Sets the emp_code of this employee.
    *
    * @param emp_code the emp_code of this employee
    */
    @Override
    public void setEmp_code(java.lang.String emp_code) {
        _employee.setEmp_code(emp_code);
    }

    /**
    * Returns the contact_number of this employee.
    *
    * @return the contact_number of this employee
    */
    @Override
    public java.lang.String getContact_number() {
        return _employee.getContact_number();
    }

    /**
    * Sets the contact_number of this employee.
    *
    * @param contact_number the contact_number of this employee
    */
    @Override
    public void setContact_number(java.lang.String contact_number) {
        _employee.setContact_number(contact_number);
    }

    /**
    * Returns the birthday of this employee.
    *
    * @return the birthday of this employee
    */
    @Override
    public java.util.Date getBirthday() {
        return _employee.getBirthday();
    }

    /**
    * Sets the birthday of this employee.
    *
    * @param birthday the birthday of this employee
    */
    @Override
    public void setBirthday(java.util.Date birthday) {
        _employee.setBirthday(birthday);
    }

    /**
    * Returns the jobtitle ID of this employee.
    *
    * @return the jobtitle ID of this employee
    */
    @Override
    public long getJobtitleId() {
        return _employee.getJobtitleId();
    }

    /**
    * Sets the jobtitle ID of this employee.
    *
    * @param jobtitleId the jobtitle ID of this employee
    */
    @Override
    public void setJobtitleId(long jobtitleId) {
        _employee.setJobtitleId(jobtitleId);
    }

    /**
    * Returns the joined_date of this employee.
    *
    * @return the joined_date of this employee
    */
    @Override
    public java.util.Date getJoined_date() {
        return _employee.getJoined_date();
    }

    /**
    * Sets the joined_date of this employee.
    *
    * @param joined_date the joined_date of this employee
    */
    @Override
    public void setJoined_date(java.util.Date joined_date) {
        _employee.setJoined_date(joined_date);
    }

    /**
    * Returns the sub unit ID of this employee.
    *
    * @return the sub unit ID of this employee
    */
    @Override
    public long getSubUnitId() {
        return _employee.getSubUnitId();
    }

    /**
    * Sets the sub unit ID of this employee.
    *
    * @param subUnitId the sub unit ID of this employee
    */
    @Override
    public void setSubUnitId(long subUnitId) {
        _employee.setSubUnitId(subUnitId);
    }

    /**
    * Returns the titles ID of this employee.
    *
    * @return the titles ID of this employee
    */
    @Override
    public long getTitlesId() {
        return _employee.getTitlesId();
    }

    /**
    * Sets the titles ID of this employee.
    *
    * @param titlesId the titles ID of this employee
    */
    @Override
    public void setTitlesId(long titlesId) {
        _employee.setTitlesId(titlesId);
    }

    /**
    * Returns the level ID of this employee.
    *
    * @return the level ID of this employee
    */
    @Override
    public long getLevelId() {
        return _employee.getLevelId();
    }

    /**
    * Sets the level ID of this employee.
    *
    * @param levelId the level ID of this employee
    */
    @Override
    public void setLevelId(long levelId) {
        _employee.setLevelId(levelId);
    }

    /**
    * Returns the promoted_date of this employee.
    *
    * @return the promoted_date of this employee
    */
    @Override
    public java.util.Date getPromoted_date() {
        return _employee.getPromoted_date();
    }

    /**
    * Sets the promoted_date of this employee.
    *
    * @param promoted_date the promoted_date of this employee
    */
    @Override
    public void setPromoted_date(java.util.Date promoted_date) {
        _employee.setPromoted_date(promoted_date);
    }

    /**
    * Returns the labour_contract_signed_date of this employee.
    *
    * @return the labour_contract_signed_date of this employee
    */
    @Override
    public java.util.Date getLabour_contract_signed_date() {
        return _employee.getLabour_contract_signed_date();
    }

    /**
    * Sets the labour_contract_signed_date of this employee.
    *
    * @param labour_contract_signed_date the labour_contract_signed_date of this employee
    */
    @Override
    public void setLabour_contract_signed_date(
        java.util.Date labour_contract_signed_date) {
        _employee.setLabour_contract_signed_date(labour_contract_signed_date);
    }

    /**
    * Returns the labour_contract_expired_date of this employee.
    *
    * @return the labour_contract_expired_date of this employee
    */
    @Override
    public java.util.Date getLabour_contract_expired_date() {
        return _employee.getLabour_contract_expired_date();
    }

    /**
    * Sets the labour_contract_expired_date of this employee.
    *
    * @param labour_contract_expired_date the labour_contract_expired_date of this employee
    */
    @Override
    public void setLabour_contract_expired_date(
        java.util.Date labour_contract_expired_date) {
        _employee.setLabour_contract_expired_date(labour_contract_expired_date);
    }

    /**
    * Returns the labour_contract_type of this employee.
    *
    * @return the labour_contract_type of this employee
    */
    @Override
    public java.lang.String getLabour_contract_type() {
        return _employee.getLabour_contract_type();
    }

    /**
    * Sets the labour_contract_type of this employee.
    *
    * @param labour_contract_type the labour_contract_type of this employee
    */
    @Override
    public void setLabour_contract_type(java.lang.String labour_contract_type) {
        _employee.setLabour_contract_type(labour_contract_type);
    }

    /**
    * Returns the gender of this employee.
    *
    * @return the gender of this employee
    */
    @Override
    public java.lang.String getGender() {
        return _employee.getGender();
    }

    /**
    * Sets the gender of this employee.
    *
    * @param gender the gender of this employee
    */
    @Override
    public void setGender(java.lang.String gender) {
        _employee.setGender(gender);
    }

    /**
    * Returns the place_of_birth of this employee.
    *
    * @return the place_of_birth of this employee
    */
    @Override
    public java.lang.String getPlace_of_birth() {
        return _employee.getPlace_of_birth();
    }

    /**
    * Sets the place_of_birth of this employee.
    *
    * @param place_of_birth the place_of_birth of this employee
    */
    @Override
    public void setPlace_of_birth(java.lang.String place_of_birth) {
        _employee.setPlace_of_birth(place_of_birth);
    }

    /**
    * Returns the education of this employee.
    *
    * @return the education of this employee
    */
    @Override
    public java.lang.String getEducation() {
        return _employee.getEducation();
    }

    /**
    * Sets the education of this employee.
    *
    * @param education the education of this employee
    */
    @Override
    public void setEducation(java.lang.String education) {
        _employee.setEducation(education);
    }

    /**
    * Returns the education_specialize of this employee.
    *
    * @return the education_specialize of this employee
    */
    @Override
    public java.lang.String getEducation_specialize() {
        return _employee.getEducation_specialize();
    }

    /**
    * Sets the education_specialize of this employee.
    *
    * @param education_specialize the education_specialize of this employee
    */
    @Override
    public void setEducation_specialize(java.lang.String education_specialize) {
        _employee.setEducation_specialize(education_specialize);
    }

    /**
    * Returns the university ID of this employee.
    *
    * @return the university ID of this employee
    */
    @Override
    public long getUniversityId() {
        return _employee.getUniversityId();
    }

    /**
    * Sets the university ID of this employee.
    *
    * @param universityId the university ID of this employee
    */
    @Override
    public void setUniversityId(long universityId) {
        _employee.setUniversityId(universityId);
    }

    /**
    * Returns the marital_status of this employee.
    *
    * @return the marital_status of this employee
    */
    @Override
    public java.lang.String getMarital_status() {
        return _employee.getMarital_status();
    }

    /**
    * Sets the marital_status of this employee.
    *
    * @param marital_status the marital_status of this employee
    */
    @Override
    public void setMarital_status(java.lang.String marital_status) {
        _employee.setMarital_status(marital_status);
    }

    /**
    * Returns the identity card no of this employee.
    *
    * @return the identity card no of this employee
    */
    @Override
    public java.lang.String getIdentityCardNo() {
        return _employee.getIdentityCardNo();
    }

    /**
    * Sets the identity card no of this employee.
    *
    * @param identityCardNo the identity card no of this employee
    */
    @Override
    public void setIdentityCardNo(java.lang.String identityCardNo) {
        _employee.setIdentityCardNo(identityCardNo);
    }

    /**
    * Returns the issued_date of this employee.
    *
    * @return the issued_date of this employee
    */
    @Override
    public java.util.Date getIssued_date() {
        return _employee.getIssued_date();
    }

    /**
    * Sets the issued_date of this employee.
    *
    * @param issued_date the issued_date of this employee
    */
    @Override
    public void setIssued_date(java.util.Date issued_date) {
        _employee.setIssued_date(issued_date);
    }

    /**
    * Returns the issued_place of this employee.
    *
    * @return the issued_place of this employee
    */
    @Override
    public java.lang.String getIssued_place() {
        return _employee.getIssued_place();
    }

    /**
    * Sets the issued_place of this employee.
    *
    * @param issued_place the issued_place of this employee
    */
    @Override
    public void setIssued_place(java.lang.String issued_place) {
        _employee.setIssued_place(issued_place);
    }

    /**
    * Returns the address ID of this employee.
    *
    * @return the address ID of this employee
    */
    @Override
    public long getAddressId() {
        return _employee.getAddressId();
    }

    /**
    * Sets the address ID of this employee.
    *
    * @param addressId the address ID of this employee
    */
    @Override
    public void setAddressId(long addressId) {
        _employee.setAddressId(addressId);
    }

    /**
    * Returns the company_email of this employee.
    *
    * @return the company_email of this employee
    */
    @Override
    public java.lang.String getCompany_email() {
        return _employee.getCompany_email();
    }

    /**
    * Sets the company_email of this employee.
    *
    * @param company_email the company_email of this employee
    */
    @Override
    public void setCompany_email(java.lang.String company_email) {
        _employee.setCompany_email(company_email);
    }

    /**
    * Returns the personal_tax_code of this employee.
    *
    * @return the personal_tax_code of this employee
    */
    @Override
    public java.lang.String getPersonal_tax_code() {
        return _employee.getPersonal_tax_code();
    }

    /**
    * Sets the personal_tax_code of this employee.
    *
    * @param personal_tax_code the personal_tax_code of this employee
    */
    @Override
    public void setPersonal_tax_code(java.lang.String personal_tax_code) {
        _employee.setPersonal_tax_code(personal_tax_code);
    }

    /**
    * Returns the number_of_dependents of this employee.
    *
    * @return the number_of_dependents of this employee
    */
    @Override
    public int getNumber_of_dependents() {
        return _employee.getNumber_of_dependents();
    }

    /**
    * Sets the number_of_dependents of this employee.
    *
    * @param number_of_dependents the number_of_dependents of this employee
    */
    @Override
    public void setNumber_of_dependents(int number_of_dependents) {
        _employee.setNumber_of_dependents(number_of_dependents);
    }

    /**
    * Returns the dependent_names of this employee.
    *
    * @return the dependent_names of this employee
    */
    @Override
    public java.lang.String getDependent_names() {
        return _employee.getDependent_names();
    }

    /**
    * Sets the dependent_names of this employee.
    *
    * @param dependent_names the dependent_names of this employee
    */
    @Override
    public void setDependent_names(java.lang.String dependent_names) {
        _employee.setDependent_names(dependent_names);
    }

    /**
    * Returns the social_insurance_no of this employee.
    *
    * @return the social_insurance_no of this employee
    */
    @Override
    public java.lang.String getSocial_insurance_no() {
        return _employee.getSocial_insurance_no();
    }

    /**
    * Sets the social_insurance_no of this employee.
    *
    * @param social_insurance_no the social_insurance_no of this employee
    */
    @Override
    public void setSocial_insurance_no(java.lang.String social_insurance_no) {
        _employee.setSocial_insurance_no(social_insurance_no);
    }

    /**
    * Returns the health_insurance_no of this employee.
    *
    * @return the health_insurance_no of this employee
    */
    @Override
    public java.lang.String getHealth_insurance_no() {
        return _employee.getHealth_insurance_no();
    }

    /**
    * Sets the health_insurance_no of this employee.
    *
    * @param health_insurance_no the health_insurance_no of this employee
    */
    @Override
    public void setHealth_insurance_no(java.lang.String health_insurance_no) {
        _employee.setHealth_insurance_no(health_insurance_no);
    }

    /**
    * Returns the bank_account_no of this employee.
    *
    * @return the bank_account_no of this employee
    */
    @Override
    public java.lang.String getBank_account_no() {
        return _employee.getBank_account_no();
    }

    /**
    * Sets the bank_account_no of this employee.
    *
    * @param bank_account_no the bank_account_no of this employee
    */
    @Override
    public void setBank_account_no(java.lang.String bank_account_no) {
        _employee.setBank_account_no(bank_account_no);
    }

    /**
    * Returns the bank_branch_name of this employee.
    *
    * @return the bank_branch_name of this employee
    */
    @Override
    public java.lang.String getBank_branch_name() {
        return _employee.getBank_branch_name();
    }

    /**
    * Sets the bank_branch_name of this employee.
    *
    * @param bank_branch_name the bank_branch_name of this employee
    */
    @Override
    public void setBank_branch_name(java.lang.String bank_branch_name) {
        _employee.setBank_branch_name(bank_branch_name);
    }

    /**
    * Returns the base_wage_rates of this employee.
    *
    * @return the base_wage_rates of this employee
    */
    @Override
    public double getBase_wage_rates() {
        return _employee.getBase_wage_rates();
    }

    /**
    * Sets the base_wage_rates of this employee.
    *
    * @param base_wage_rates the base_wage_rates of this employee
    */
    @Override
    public void setBase_wage_rates(double base_wage_rates) {
        _employee.setBase_wage_rates(base_wage_rates);
    }

    /**
    * Returns the position_wage_rates of this employee.
    *
    * @return the position_wage_rates of this employee
    */
    @Override
    public double getPosition_wage_rates() {
        return _employee.getPosition_wage_rates();
    }

    /**
    * Sets the position_wage_rates of this employee.
    *
    * @param position_wage_rates the position_wage_rates of this employee
    */
    @Override
    public void setPosition_wage_rates(double position_wage_rates) {
        _employee.setPosition_wage_rates(position_wage_rates);
    }

    /**
    * Returns the capacity_salary of this employee.
    *
    * @return the capacity_salary of this employee
    */
    @Override
    public double getCapacity_salary() {
        return _employee.getCapacity_salary();
    }

    /**
    * Sets the capacity_salary of this employee.
    *
    * @param capacity_salary the capacity_salary of this employee
    */
    @Override
    public void setCapacity_salary(double capacity_salary) {
        _employee.setCapacity_salary(capacity_salary);
    }

    /**
    * Returns the total_salary of this employee.
    *
    * @return the total_salary of this employee
    */
    @Override
    public double getTotal_salary() {
        return _employee.getTotal_salary();
    }

    /**
    * Sets the total_salary of this employee.
    *
    * @param total_salary the total_salary of this employee
    */
    @Override
    public void setTotal_salary(double total_salary) {
        _employee.setTotal_salary(total_salary);
    }

    /**
    * Returns the bonus of this employee.
    *
    * @return the bonus of this employee
    */
    @Override
    public double getBonus() {
        return _employee.getBonus();
    }

    /**
    * Sets the bonus of this employee.
    *
    * @param bonus the bonus of this employee
    */
    @Override
    public void setBonus(double bonus) {
        _employee.setBonus(bonus);
    }

    /**
    * Returns the resigned_date of this employee.
    *
    * @return the resigned_date of this employee
    */
    @Override
    public java.util.Date getResigned_date() {
        return _employee.getResigned_date();
    }

    /**
    * Sets the resigned_date of this employee.
    *
    * @param resigned_date the resigned_date of this employee
    */
    @Override
    public void setResigned_date(java.util.Date resigned_date) {
        _employee.setResigned_date(resigned_date);
    }

    /**
    * Returns the employee_user ID of this employee.
    *
    * @return the employee_user ID of this employee
    */
    @Override
    public long getEmployee_userId() {
        return _employee.getEmployee_userId();
    }

    /**
    * Sets the employee_user ID of this employee.
    *
    * @param employee_userId the employee_user ID of this employee
    */
    @Override
    public void setEmployee_userId(long employee_userId) {
        _employee.setEmployee_userId(employee_userId);
    }

    /**
    * Returns the group ID of this employee.
    *
    * @return the group ID of this employee
    */
    @Override
    public long getGroupId() {
        return _employee.getGroupId();
    }

    /**
    * Sets the group ID of this employee.
    *
    * @param groupId the group ID of this employee
    */
    @Override
    public void setGroupId(long groupId) {
        _employee.setGroupId(groupId);
    }

    /**
    * Returns the company ID of this employee.
    *
    * @return the company ID of this employee
    */
    @Override
    public long getCompanyId() {
        return _employee.getCompanyId();
    }

    /**
    * Sets the company ID of this employee.
    *
    * @param companyId the company ID of this employee
    */
    @Override
    public void setCompanyId(long companyId) {
        _employee.setCompanyId(companyId);
    }

    /**
    * Returns the user ID of this employee.
    *
    * @return the user ID of this employee
    */
    @Override
    public long getUserId() {
        return _employee.getUserId();
    }

    /**
    * Sets the user ID of this employee.
    *
    * @param userId the user ID of this employee
    */
    @Override
    public void setUserId(long userId) {
        _employee.setUserId(userId);
    }

    /**
    * Returns the user uuid of this employee.
    *
    * @return the user uuid of this employee
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.lang.String getUserUuid()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _employee.getUserUuid();
    }

    /**
    * Sets the user uuid of this employee.
    *
    * @param userUuid the user uuid of this employee
    */
    @Override
    public void setUserUuid(java.lang.String userUuid) {
        _employee.setUserUuid(userUuid);
    }

    /**
    * Returns the create date of this employee.
    *
    * @return the create date of this employee
    */
    @Override
    public java.util.Date getCreateDate() {
        return _employee.getCreateDate();
    }

    /**
    * Sets the create date of this employee.
    *
    * @param createDate the create date of this employee
    */
    @Override
    public void setCreateDate(java.util.Date createDate) {
        _employee.setCreateDate(createDate);
    }

    /**
    * Returns the modified date of this employee.
    *
    * @return the modified date of this employee
    */
    @Override
    public java.util.Date getModifiedDate() {
        return _employee.getModifiedDate();
    }

    /**
    * Sets the modified date of this employee.
    *
    * @param modifiedDate the modified date of this employee
    */
    @Override
    public void setModifiedDate(java.util.Date modifiedDate) {
        _employee.setModifiedDate(modifiedDate);
    }

    /**
    * Returns the is deleted of this employee.
    *
    * @return the is deleted of this employee
    */
    @Override
    public boolean getIsDeleted() {
        return _employee.getIsDeleted();
    }

    /**
    * Returns <code>true</code> if this employee is is deleted.
    *
    * @return <code>true</code> if this employee is is deleted; <code>false</code> otherwise
    */
    @Override
    public boolean isIsDeleted() {
        return _employee.isIsDeleted();
    }

    /**
    * Sets whether this employee is is deleted.
    *
    * @param isDeleted the is deleted of this employee
    */
    @Override
    public void setIsDeleted(boolean isDeleted) {
        _employee.setIsDeleted(isDeleted);
    }

    /**
    * Returns the company email address of this employee.
    *
    * @return the company email address of this employee
    */
    @Override
    public java.lang.String getCompanyEmailAddress() {
        return _employee.getCompanyEmailAddress();
    }

    /**
    * Sets the company email address of this employee.
    *
    * @param companyEmailAddress the company email address of this employee
    */
    @Override
    public void setCompanyEmailAddress(java.lang.String companyEmailAddress) {
        _employee.setCompanyEmailAddress(companyEmailAddress);
    }

    @Override
    public boolean isNew() {
        return _employee.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _employee.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _employee.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _employee.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _employee.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _employee.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _employee.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _employee.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _employee.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _employee.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _employee.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new EmployeeWrapper((Employee) _employee.clone());
    }

    @Override
    public int compareTo(vn.com.ecopharma.hrm.model.Employee employee) {
        return _employee.compareTo(employee);
    }

    @Override
    public int hashCode() {
        return _employee.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<vn.com.ecopharma.hrm.model.Employee> toCacheModel() {
        return _employee.toCacheModel();
    }

    @Override
    public vn.com.ecopharma.hrm.model.Employee toEscapedModel() {
        return new EmployeeWrapper(_employee.toEscapedModel());
    }

    @Override
    public vn.com.ecopharma.hrm.model.Employee toUnescapedModel() {
        return new EmployeeWrapper(_employee.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _employee.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _employee.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _employee.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof EmployeeWrapper)) {
            return false;
        }

        EmployeeWrapper employeeWrapper = (EmployeeWrapper) obj;

        if (Validator.equals(_employee, employeeWrapper._employee)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public Employee getWrappedEmployee() {
        return _employee;
    }

    @Override
    public Employee getWrappedModel() {
        return _employee;
    }

    @Override
    public void resetOriginalValues() {
        _employee.resetOriginalValues();
    }
}
