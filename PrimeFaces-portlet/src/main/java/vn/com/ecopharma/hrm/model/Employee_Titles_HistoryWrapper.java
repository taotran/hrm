package vn.com.ecopharma.hrm.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Employee_Titles_History}.
 * </p>
 *
 * @author tvt
 * @see Employee_Titles_History
 * @generated
 */
public class Employee_Titles_HistoryWrapper implements Employee_Titles_History,
    ModelWrapper<Employee_Titles_History> {
    private Employee_Titles_History _employee_Titles_History;

    public Employee_Titles_HistoryWrapper(
        Employee_Titles_History employee_Titles_History) {
        _employee_Titles_History = employee_Titles_History;
    }

    @Override
    public Class<?> getModelClass() {
        return Employee_Titles_History.class;
    }

    @Override
    public String getModelClassName() {
        return Employee_Titles_History.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("employee_Titles_HistoryId",
            getEmployee_Titles_HistoryId());
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
        Long employee_Titles_HistoryId = (Long) attributes.get(
                "employee_Titles_HistoryId");

        if (employee_Titles_HistoryId != null) {
            setEmployee_Titles_HistoryId(employee_Titles_HistoryId);
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
    * Returns the primary key of this employee_ titles_ history.
    *
    * @return the primary key of this employee_ titles_ history
    */
    @Override
    public long getPrimaryKey() {
        return _employee_Titles_History.getPrimaryKey();
    }

    /**
    * Sets the primary key of this employee_ titles_ history.
    *
    * @param primaryKey the primary key of this employee_ titles_ history
    */
    @Override
    public void setPrimaryKey(long primaryKey) {
        _employee_Titles_History.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the employee_ titles_ history ID of this employee_ titles_ history.
    *
    * @return the employee_ titles_ history ID of this employee_ titles_ history
    */
    @Override
    public long getEmployee_Titles_HistoryId() {
        return _employee_Titles_History.getEmployee_Titles_HistoryId();
    }

    /**
    * Sets the employee_ titles_ history ID of this employee_ titles_ history.
    *
    * @param employee_Titles_HistoryId the employee_ titles_ history ID of this employee_ titles_ history
    */
    @Override
    public void setEmployee_Titles_HistoryId(long employee_Titles_HistoryId) {
        _employee_Titles_History.setEmployee_Titles_HistoryId(employee_Titles_HistoryId);
    }

    /**
    * Returns the employee ID of this employee_ titles_ history.
    *
    * @return the employee ID of this employee_ titles_ history
    */
    @Override
    public long getEmployeeId() {
        return _employee_Titles_History.getEmployeeId();
    }

    /**
    * Sets the employee ID of this employee_ titles_ history.
    *
    * @param employeeId the employee ID of this employee_ titles_ history
    */
    @Override
    public void setEmployeeId(long employeeId) {
        _employee_Titles_History.setEmployeeId(employeeId);
    }

    /**
    * Returns the titles ID of this employee_ titles_ history.
    *
    * @return the titles ID of this employee_ titles_ history
    */
    @Override
    public long getTitlesId() {
        return _employee_Titles_History.getTitlesId();
    }

    /**
    * Sets the titles ID of this employee_ titles_ history.
    *
    * @param titlesId the titles ID of this employee_ titles_ history
    */
    @Override
    public void setTitlesId(long titlesId) {
        _employee_Titles_History.setTitlesId(titlesId);
    }

    /**
    * Returns the set_date of this employee_ titles_ history.
    *
    * @return the set_date of this employee_ titles_ history
    */
    @Override
    public java.util.Date getSet_date() {
        return _employee_Titles_History.getSet_date();
    }

    /**
    * Sets the set_date of this employee_ titles_ history.
    *
    * @param set_date the set_date of this employee_ titles_ history
    */
    @Override
    public void setSet_date(java.util.Date set_date) {
        _employee_Titles_History.setSet_date(set_date);
    }

    /**
    * Returns the note of this employee_ titles_ history.
    *
    * @return the note of this employee_ titles_ history
    */
    @Override
    public java.lang.String getNote() {
        return _employee_Titles_History.getNote();
    }

    /**
    * Sets the note of this employee_ titles_ history.
    *
    * @param note the note of this employee_ titles_ history
    */
    @Override
    public void setNote(java.lang.String note) {
        _employee_Titles_History.setNote(note);
    }

    /**
    * Returns the group ID of this employee_ titles_ history.
    *
    * @return the group ID of this employee_ titles_ history
    */
    @Override
    public long getGroupId() {
        return _employee_Titles_History.getGroupId();
    }

    /**
    * Sets the group ID of this employee_ titles_ history.
    *
    * @param groupId the group ID of this employee_ titles_ history
    */
    @Override
    public void setGroupId(long groupId) {
        _employee_Titles_History.setGroupId(groupId);
    }

    /**
    * Returns the company ID of this employee_ titles_ history.
    *
    * @return the company ID of this employee_ titles_ history
    */
    @Override
    public long getCompanyId() {
        return _employee_Titles_History.getCompanyId();
    }

    /**
    * Sets the company ID of this employee_ titles_ history.
    *
    * @param companyId the company ID of this employee_ titles_ history
    */
    @Override
    public void setCompanyId(long companyId) {
        _employee_Titles_History.setCompanyId(companyId);
    }

    /**
    * Returns the user ID of this employee_ titles_ history.
    *
    * @return the user ID of this employee_ titles_ history
    */
    @Override
    public long getUserId() {
        return _employee_Titles_History.getUserId();
    }

    /**
    * Sets the user ID of this employee_ titles_ history.
    *
    * @param userId the user ID of this employee_ titles_ history
    */
    @Override
    public void setUserId(long userId) {
        _employee_Titles_History.setUserId(userId);
    }

    /**
    * Returns the user uuid of this employee_ titles_ history.
    *
    * @return the user uuid of this employee_ titles_ history
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.lang.String getUserUuid()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _employee_Titles_History.getUserUuid();
    }

    /**
    * Sets the user uuid of this employee_ titles_ history.
    *
    * @param userUuid the user uuid of this employee_ titles_ history
    */
    @Override
    public void setUserUuid(java.lang.String userUuid) {
        _employee_Titles_History.setUserUuid(userUuid);
    }

    /**
    * Returns the create date of this employee_ titles_ history.
    *
    * @return the create date of this employee_ titles_ history
    */
    @Override
    public java.util.Date getCreateDate() {
        return _employee_Titles_History.getCreateDate();
    }

    /**
    * Sets the create date of this employee_ titles_ history.
    *
    * @param createDate the create date of this employee_ titles_ history
    */
    @Override
    public void setCreateDate(java.util.Date createDate) {
        _employee_Titles_History.setCreateDate(createDate);
    }

    /**
    * Returns the modified date of this employee_ titles_ history.
    *
    * @return the modified date of this employee_ titles_ history
    */
    @Override
    public java.util.Date getModifiedDate() {
        return _employee_Titles_History.getModifiedDate();
    }

    /**
    * Sets the modified date of this employee_ titles_ history.
    *
    * @param modifiedDate the modified date of this employee_ titles_ history
    */
    @Override
    public void setModifiedDate(java.util.Date modifiedDate) {
        _employee_Titles_History.setModifiedDate(modifiedDate);
    }

    @Override
    public boolean isNew() {
        return _employee_Titles_History.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _employee_Titles_History.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _employee_Titles_History.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _employee_Titles_History.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _employee_Titles_History.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _employee_Titles_History.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _employee_Titles_History.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _employee_Titles_History.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _employee_Titles_History.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _employee_Titles_History.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _employee_Titles_History.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new Employee_Titles_HistoryWrapper((Employee_Titles_History) _employee_Titles_History.clone());
    }

    @Override
    public int compareTo(
        vn.com.ecopharma.hrm.model.Employee_Titles_History employee_Titles_History) {
        return _employee_Titles_History.compareTo(employee_Titles_History);
    }

    @Override
    public int hashCode() {
        return _employee_Titles_History.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<vn.com.ecopharma.hrm.model.Employee_Titles_History> toCacheModel() {
        return _employee_Titles_History.toCacheModel();
    }

    @Override
    public vn.com.ecopharma.hrm.model.Employee_Titles_History toEscapedModel() {
        return new Employee_Titles_HistoryWrapper(_employee_Titles_History.toEscapedModel());
    }

    @Override
    public vn.com.ecopharma.hrm.model.Employee_Titles_History toUnescapedModel() {
        return new Employee_Titles_HistoryWrapper(_employee_Titles_History.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _employee_Titles_History.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _employee_Titles_History.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _employee_Titles_History.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof Employee_Titles_HistoryWrapper)) {
            return false;
        }

        Employee_Titles_HistoryWrapper employee_Titles_HistoryWrapper = (Employee_Titles_HistoryWrapper) obj;

        if (Validator.equals(_employee_Titles_History,
                    employee_Titles_HistoryWrapper._employee_Titles_History)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public Employee_Titles_History getWrappedEmployee_Titles_History() {
        return _employee_Titles_History;
    }

    @Override
    public Employee_Titles_History getWrappedModel() {
        return _employee_Titles_History;
    }

    @Override
    public void resetOriginalValues() {
        _employee_Titles_History.resetOriginalValues();
    }
}
