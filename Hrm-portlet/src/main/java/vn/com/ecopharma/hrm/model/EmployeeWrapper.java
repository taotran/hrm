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
        attributes.put("groupId", getGroupId());
        attributes.put("companyId", getCompanyId());
        attributes.put("userId", getUserId());
        attributes.put("userName", getUserName());
        attributes.put("createDate", getCreateDate());
        attributes.put("modifiedDate", getModifiedDate());
        attributes.put("emp_code", getEmp_code());
        attributes.put("firstname", getFirstname());
        attributes.put("middle_name", getMiddle_name());
        attributes.put("lastname", getLastname());
        attributes.put("email", getEmail());
        attributes.put("nickname", getNickname());
        attributes.put("birthday", getBirthday());
        attributes.put("gender", getGender());
        attributes.put("marital_status", getMarital_status());
        attributes.put("status", getStatus());
        attributes.put("jobtitleId", getJobtitleId());
        attributes.put("joined_date", getJoined_date());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long employeeId = (Long) attributes.get("employeeId");

        if (employeeId != null) {
            setEmployeeId(employeeId);
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

        String userName = (String) attributes.get("userName");

        if (userName != null) {
            setUserName(userName);
        }

        Date createDate = (Date) attributes.get("createDate");

        if (createDate != null) {
            setCreateDate(createDate);
        }

        Date modifiedDate = (Date) attributes.get("modifiedDate");

        if (modifiedDate != null) {
            setModifiedDate(modifiedDate);
        }

        String emp_code = (String) attributes.get("emp_code");

        if (emp_code != null) {
            setEmp_code(emp_code);
        }

        String firstname = (String) attributes.get("firstname");

        if (firstname != null) {
            setFirstname(firstname);
        }

        String middle_name = (String) attributes.get("middle_name");

        if (middle_name != null) {
            setMiddle_name(middle_name);
        }

        String lastname = (String) attributes.get("lastname");

        if (lastname != null) {
            setLastname(lastname);
        }

        String email = (String) attributes.get("email");

        if (email != null) {
            setEmail(email);
        }

        String nickname = (String) attributes.get("nickname");

        if (nickname != null) {
            setNickname(nickname);
        }

        Date birthday = (Date) attributes.get("birthday");

        if (birthday != null) {
            setBirthday(birthday);
        }

        String gender = (String) attributes.get("gender");

        if (gender != null) {
            setGender(gender);
        }

        String marital_status = (String) attributes.get("marital_status");

        if (marital_status != null) {
            setMarital_status(marital_status);
        }

        String status = (String) attributes.get("status");

        if (status != null) {
            setStatus(status);
        }

        Long jobtitleId = (Long) attributes.get("jobtitleId");

        if (jobtitleId != null) {
            setJobtitleId(jobtitleId);
        }

        Date joined_date = (Date) attributes.get("joined_date");

        if (joined_date != null) {
            setJoined_date(joined_date);
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
    * Returns the user name of this employee.
    *
    * @return the user name of this employee
    */
    @Override
    public java.lang.String getUserName() {
        return _employee.getUserName();
    }

    /**
    * Sets the user name of this employee.
    *
    * @param userName the user name of this employee
    */
    @Override
    public void setUserName(java.lang.String userName) {
        _employee.setUserName(userName);
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
    * Returns the firstname of this employee.
    *
    * @return the firstname of this employee
    */
    @Override
    public java.lang.String getFirstname() {
        return _employee.getFirstname();
    }

    /**
    * Sets the firstname of this employee.
    *
    * @param firstname the firstname of this employee
    */
    @Override
    public void setFirstname(java.lang.String firstname) {
        _employee.setFirstname(firstname);
    }

    /**
    * Returns the middle_name of this employee.
    *
    * @return the middle_name of this employee
    */
    @Override
    public java.lang.String getMiddle_name() {
        return _employee.getMiddle_name();
    }

    /**
    * Sets the middle_name of this employee.
    *
    * @param middle_name the middle_name of this employee
    */
    @Override
    public void setMiddle_name(java.lang.String middle_name) {
        _employee.setMiddle_name(middle_name);
    }

    /**
    * Returns the lastname of this employee.
    *
    * @return the lastname of this employee
    */
    @Override
    public java.lang.String getLastname() {
        return _employee.getLastname();
    }

    /**
    * Sets the lastname of this employee.
    *
    * @param lastname the lastname of this employee
    */
    @Override
    public void setLastname(java.lang.String lastname) {
        _employee.setLastname(lastname);
    }

    /**
    * Returns the email of this employee.
    *
    * @return the email of this employee
    */
    @Override
    public java.lang.String getEmail() {
        return _employee.getEmail();
    }

    /**
    * Sets the email of this employee.
    *
    * @param email the email of this employee
    */
    @Override
    public void setEmail(java.lang.String email) {
        _employee.setEmail(email);
    }

    /**
    * Returns the nickname of this employee.
    *
    * @return the nickname of this employee
    */
    @Override
    public java.lang.String getNickname() {
        return _employee.getNickname();
    }

    /**
    * Sets the nickname of this employee.
    *
    * @param nickname the nickname of this employee
    */
    @Override
    public void setNickname(java.lang.String nickname) {
        _employee.setNickname(nickname);
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
    * Returns the status of this employee.
    *
    * @return the status of this employee
    */
    @Override
    public java.lang.String getStatus() {
        return _employee.getStatus();
    }

    /**
    * Sets the status of this employee.
    *
    * @param status the status of this employee
    */
    @Override
    public void setStatus(java.lang.String status) {
        _employee.setStatus(status);
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
