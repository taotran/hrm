package vn.com.ecopharma.hrm.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Employee_Titles}.
 * </p>
 *
 * @author tvt
 * @see Employee_Titles
 * @generated
 */
public class Employee_TitlesWrapper implements Employee_Titles,
    ModelWrapper<Employee_Titles> {
    private Employee_Titles _employee_Titles;

    public Employee_TitlesWrapper(Employee_Titles employee_Titles) {
        _employee_Titles = employee_Titles;
    }

    @Override
    public Class<?> getModelClass() {
        return Employee_Titles.class;
    }

    @Override
    public String getModelClassName() {
        return Employee_Titles.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("employee_TitlesId", getEmployee_TitlesId());
        attributes.put("employeeId", getEmployeeId());
        attributes.put("titlesId", getTitlesId());
        attributes.put("set_date", getSet_date());
        attributes.put("note", getNote());
        attributes.put("groupId", getGroupId());
        attributes.put("companyId", getCompanyId());
        attributes.put("userId", getUserId());
        attributes.put("createDate", getCreateDate());
        attributes.put("modifiedDate", getModifiedDate());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long employee_TitlesId = (Long) attributes.get("employee_TitlesId");

        if (employee_TitlesId != null) {
            setEmployee_TitlesId(employee_TitlesId);
        }

        Long employeeId = (Long) attributes.get("employeeId");

        if (employeeId != null) {
            setEmployeeId(employeeId);
        }

        Long titlesId = (Long) attributes.get("titlesId");

        if (titlesId != null) {
            setTitlesId(titlesId);
        }

        Date set_date = (Date) attributes.get("set_date");

        if (set_date != null) {
            setSet_date(set_date);
        }

        String note = (String) attributes.get("note");

        if (note != null) {
            setNote(note);
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
    }

    /**
    * Returns the primary key of this employee_ titles.
    *
    * @return the primary key of this employee_ titles
    */
    @Override
    public long getPrimaryKey() {
        return _employee_Titles.getPrimaryKey();
    }

    /**
    * Sets the primary key of this employee_ titles.
    *
    * @param primaryKey the primary key of this employee_ titles
    */
    @Override
    public void setPrimaryKey(long primaryKey) {
        _employee_Titles.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the employee_ titles ID of this employee_ titles.
    *
    * @return the employee_ titles ID of this employee_ titles
    */
    @Override
    public long getEmployee_TitlesId() {
        return _employee_Titles.getEmployee_TitlesId();
    }

    /**
    * Sets the employee_ titles ID of this employee_ titles.
    *
    * @param employee_TitlesId the employee_ titles ID of this employee_ titles
    */
    @Override
    public void setEmployee_TitlesId(long employee_TitlesId) {
        _employee_Titles.setEmployee_TitlesId(employee_TitlesId);
    }

    /**
    * Returns the employee ID of this employee_ titles.
    *
    * @return the employee ID of this employee_ titles
    */
    @Override
    public long getEmployeeId() {
        return _employee_Titles.getEmployeeId();
    }

    /**
    * Sets the employee ID of this employee_ titles.
    *
    * @param employeeId the employee ID of this employee_ titles
    */
    @Override
    public void setEmployeeId(long employeeId) {
        _employee_Titles.setEmployeeId(employeeId);
    }

    /**
    * Returns the titles ID of this employee_ titles.
    *
    * @return the titles ID of this employee_ titles
    */
    @Override
    public long getTitlesId() {
        return _employee_Titles.getTitlesId();
    }

    /**
    * Sets the titles ID of this employee_ titles.
    *
    * @param titlesId the titles ID of this employee_ titles
    */
    @Override
    public void setTitlesId(long titlesId) {
        _employee_Titles.setTitlesId(titlesId);
    }

    /**
    * Returns the set_date of this employee_ titles.
    *
    * @return the set_date of this employee_ titles
    */
    @Override
    public java.util.Date getSet_date() {
        return _employee_Titles.getSet_date();
    }

    /**
    * Sets the set_date of this employee_ titles.
    *
    * @param set_date the set_date of this employee_ titles
    */
    @Override
    public void setSet_date(java.util.Date set_date) {
        _employee_Titles.setSet_date(set_date);
    }

    /**
    * Returns the note of this employee_ titles.
    *
    * @return the note of this employee_ titles
    */
    @Override
    public java.lang.String getNote() {
        return _employee_Titles.getNote();
    }

    /**
    * Sets the note of this employee_ titles.
    *
    * @param note the note of this employee_ titles
    */
    @Override
    public void setNote(java.lang.String note) {
        _employee_Titles.setNote(note);
    }

    /**
    * Returns the group ID of this employee_ titles.
    *
    * @return the group ID of this employee_ titles
    */
    @Override
    public long getGroupId() {
        return _employee_Titles.getGroupId();
    }

    /**
    * Sets the group ID of this employee_ titles.
    *
    * @param groupId the group ID of this employee_ titles
    */
    @Override
    public void setGroupId(long groupId) {
        _employee_Titles.setGroupId(groupId);
    }

    /**
    * Returns the company ID of this employee_ titles.
    *
    * @return the company ID of this employee_ titles
    */
    @Override
    public long getCompanyId() {
        return _employee_Titles.getCompanyId();
    }

    /**
    * Sets the company ID of this employee_ titles.
    *
    * @param companyId the company ID of this employee_ titles
    */
    @Override
    public void setCompanyId(long companyId) {
        _employee_Titles.setCompanyId(companyId);
    }

    /**
    * Returns the user ID of this employee_ titles.
    *
    * @return the user ID of this employee_ titles
    */
    @Override
    public long getUserId() {
        return _employee_Titles.getUserId();
    }

    /**
    * Sets the user ID of this employee_ titles.
    *
    * @param userId the user ID of this employee_ titles
    */
    @Override
    public void setUserId(long userId) {
        _employee_Titles.setUserId(userId);
    }

    /**
    * Returns the user uuid of this employee_ titles.
    *
    * @return the user uuid of this employee_ titles
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.lang.String getUserUuid()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _employee_Titles.getUserUuid();
    }

    /**
    * Sets the user uuid of this employee_ titles.
    *
    * @param userUuid the user uuid of this employee_ titles
    */
    @Override
    public void setUserUuid(java.lang.String userUuid) {
        _employee_Titles.setUserUuid(userUuid);
    }

    /**
    * Returns the create date of this employee_ titles.
    *
    * @return the create date of this employee_ titles
    */
    @Override
    public java.util.Date getCreateDate() {
        return _employee_Titles.getCreateDate();
    }

    /**
    * Sets the create date of this employee_ titles.
    *
    * @param createDate the create date of this employee_ titles
    */
    @Override
    public void setCreateDate(java.util.Date createDate) {
        _employee_Titles.setCreateDate(createDate);
    }

    /**
    * Returns the modified date of this employee_ titles.
    *
    * @return the modified date of this employee_ titles
    */
    @Override
    public java.util.Date getModifiedDate() {
        return _employee_Titles.getModifiedDate();
    }

    /**
    * Sets the modified date of this employee_ titles.
    *
    * @param modifiedDate the modified date of this employee_ titles
    */
    @Override
    public void setModifiedDate(java.util.Date modifiedDate) {
        _employee_Titles.setModifiedDate(modifiedDate);
    }

    @Override
    public boolean isNew() {
        return _employee_Titles.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _employee_Titles.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _employee_Titles.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _employee_Titles.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _employee_Titles.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _employee_Titles.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _employee_Titles.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _employee_Titles.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _employee_Titles.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _employee_Titles.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _employee_Titles.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new Employee_TitlesWrapper((Employee_Titles) _employee_Titles.clone());
    }

    @Override
    public int compareTo(
        vn.com.ecopharma.hrm.model.Employee_Titles employee_Titles) {
        return _employee_Titles.compareTo(employee_Titles);
    }

    @Override
    public int hashCode() {
        return _employee_Titles.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<vn.com.ecopharma.hrm.model.Employee_Titles> toCacheModel() {
        return _employee_Titles.toCacheModel();
    }

    @Override
    public vn.com.ecopharma.hrm.model.Employee_Titles toEscapedModel() {
        return new Employee_TitlesWrapper(_employee_Titles.toEscapedModel());
    }

    @Override
    public vn.com.ecopharma.hrm.model.Employee_Titles toUnescapedModel() {
        return new Employee_TitlesWrapper(_employee_Titles.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _employee_Titles.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _employee_Titles.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _employee_Titles.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof Employee_TitlesWrapper)) {
            return false;
        }

        Employee_TitlesWrapper employee_TitlesWrapper = (Employee_TitlesWrapper) obj;

        if (Validator.equals(_employee_Titles,
                    employee_TitlesWrapper._employee_Titles)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public Employee_Titles getWrappedEmployee_Titles() {
        return _employee_Titles;
    }

    @Override
    public Employee_Titles getWrappedModel() {
        return _employee_Titles;
    }

    @Override
    public void resetOriginalValues() {
        _employee_Titles.resetOriginalValues();
    }
}
