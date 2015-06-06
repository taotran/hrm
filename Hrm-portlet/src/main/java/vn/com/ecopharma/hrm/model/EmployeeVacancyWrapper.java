package vn.com.ecopharma.hrm.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link EmployeeVacancy}.
 * </p>
 *
 * @author tvt
 * @see EmployeeVacancy
 * @generated
 */
public class EmployeeVacancyWrapper implements EmployeeVacancy,
    ModelWrapper<EmployeeVacancy> {
    private EmployeeVacancy _employeeVacancy;

    public EmployeeVacancyWrapper(EmployeeVacancy employeeVacancy) {
        _employeeVacancy = employeeVacancy;
    }

    @Override
    public Class<?> getModelClass() {
        return EmployeeVacancy.class;
    }

    @Override
    public String getModelClassName() {
        return EmployeeVacancy.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("employeeVacancyId", getEmployeeVacancyId());
        attributes.put("employeeId", getEmployeeId());
        attributes.put("v_id", getV_id());
        attributes.put("groupId", getGroupId());
        attributes.put("companyId", getCompanyId());
        attributes.put("userId", getUserId());
        attributes.put("createDate", getCreateDate());
        attributes.put("modifiedDate", getModifiedDate());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long employeeVacancyId = (Long) attributes.get("employeeVacancyId");

        if (employeeVacancyId != null) {
            setEmployeeVacancyId(employeeVacancyId);
        }

        Long employeeId = (Long) attributes.get("employeeId");

        if (employeeId != null) {
            setEmployeeId(employeeId);
        }

        Long v_id = (Long) attributes.get("v_id");

        if (v_id != null) {
            setV_id(v_id);
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
    * Returns the primary key of this employee vacancy.
    *
    * @return the primary key of this employee vacancy
    */
    @Override
    public long getPrimaryKey() {
        return _employeeVacancy.getPrimaryKey();
    }

    /**
    * Sets the primary key of this employee vacancy.
    *
    * @param primaryKey the primary key of this employee vacancy
    */
    @Override
    public void setPrimaryKey(long primaryKey) {
        _employeeVacancy.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the employee vacancy ID of this employee vacancy.
    *
    * @return the employee vacancy ID of this employee vacancy
    */
    @Override
    public long getEmployeeVacancyId() {
        return _employeeVacancy.getEmployeeVacancyId();
    }

    /**
    * Sets the employee vacancy ID of this employee vacancy.
    *
    * @param employeeVacancyId the employee vacancy ID of this employee vacancy
    */
    @Override
    public void setEmployeeVacancyId(long employeeVacancyId) {
        _employeeVacancy.setEmployeeVacancyId(employeeVacancyId);
    }

    /**
    * Returns the employee ID of this employee vacancy.
    *
    * @return the employee ID of this employee vacancy
    */
    @Override
    public long getEmployeeId() {
        return _employeeVacancy.getEmployeeId();
    }

    /**
    * Sets the employee ID of this employee vacancy.
    *
    * @param employeeId the employee ID of this employee vacancy
    */
    @Override
    public void setEmployeeId(long employeeId) {
        _employeeVacancy.setEmployeeId(employeeId);
    }

    /**
    * Returns the v_id of this employee vacancy.
    *
    * @return the v_id of this employee vacancy
    */
    @Override
    public long getV_id() {
        return _employeeVacancy.getV_id();
    }

    /**
    * Sets the v_id of this employee vacancy.
    *
    * @param v_id the v_id of this employee vacancy
    */
    @Override
    public void setV_id(long v_id) {
        _employeeVacancy.setV_id(v_id);
    }

    /**
    * Returns the group ID of this employee vacancy.
    *
    * @return the group ID of this employee vacancy
    */
    @Override
    public long getGroupId() {
        return _employeeVacancy.getGroupId();
    }

    /**
    * Sets the group ID of this employee vacancy.
    *
    * @param groupId the group ID of this employee vacancy
    */
    @Override
    public void setGroupId(long groupId) {
        _employeeVacancy.setGroupId(groupId);
    }

    /**
    * Returns the company ID of this employee vacancy.
    *
    * @return the company ID of this employee vacancy
    */
    @Override
    public long getCompanyId() {
        return _employeeVacancy.getCompanyId();
    }

    /**
    * Sets the company ID of this employee vacancy.
    *
    * @param companyId the company ID of this employee vacancy
    */
    @Override
    public void setCompanyId(long companyId) {
        _employeeVacancy.setCompanyId(companyId);
    }

    /**
    * Returns the user ID of this employee vacancy.
    *
    * @return the user ID of this employee vacancy
    */
    @Override
    public long getUserId() {
        return _employeeVacancy.getUserId();
    }

    /**
    * Sets the user ID of this employee vacancy.
    *
    * @param userId the user ID of this employee vacancy
    */
    @Override
    public void setUserId(long userId) {
        _employeeVacancy.setUserId(userId);
    }

    /**
    * Returns the user uuid of this employee vacancy.
    *
    * @return the user uuid of this employee vacancy
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.lang.String getUserUuid()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _employeeVacancy.getUserUuid();
    }

    /**
    * Sets the user uuid of this employee vacancy.
    *
    * @param userUuid the user uuid of this employee vacancy
    */
    @Override
    public void setUserUuid(java.lang.String userUuid) {
        _employeeVacancy.setUserUuid(userUuid);
    }

    /**
    * Returns the create date of this employee vacancy.
    *
    * @return the create date of this employee vacancy
    */
    @Override
    public java.util.Date getCreateDate() {
        return _employeeVacancy.getCreateDate();
    }

    /**
    * Sets the create date of this employee vacancy.
    *
    * @param createDate the create date of this employee vacancy
    */
    @Override
    public void setCreateDate(java.util.Date createDate) {
        _employeeVacancy.setCreateDate(createDate);
    }

    /**
    * Returns the modified date of this employee vacancy.
    *
    * @return the modified date of this employee vacancy
    */
    @Override
    public java.util.Date getModifiedDate() {
        return _employeeVacancy.getModifiedDate();
    }

    /**
    * Sets the modified date of this employee vacancy.
    *
    * @param modifiedDate the modified date of this employee vacancy
    */
    @Override
    public void setModifiedDate(java.util.Date modifiedDate) {
        _employeeVacancy.setModifiedDate(modifiedDate);
    }

    @Override
    public boolean isNew() {
        return _employeeVacancy.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _employeeVacancy.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _employeeVacancy.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _employeeVacancy.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _employeeVacancy.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _employeeVacancy.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _employeeVacancy.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _employeeVacancy.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _employeeVacancy.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _employeeVacancy.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _employeeVacancy.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new EmployeeVacancyWrapper((EmployeeVacancy) _employeeVacancy.clone());
    }

    @Override
    public int compareTo(
        vn.com.ecopharma.hrm.model.EmployeeVacancy employeeVacancy) {
        return _employeeVacancy.compareTo(employeeVacancy);
    }

    @Override
    public int hashCode() {
        return _employeeVacancy.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<vn.com.ecopharma.hrm.model.EmployeeVacancy> toCacheModel() {
        return _employeeVacancy.toCacheModel();
    }

    @Override
    public vn.com.ecopharma.hrm.model.EmployeeVacancy toEscapedModel() {
        return new EmployeeVacancyWrapper(_employeeVacancy.toEscapedModel());
    }

    @Override
    public vn.com.ecopharma.hrm.model.EmployeeVacancy toUnescapedModel() {
        return new EmployeeVacancyWrapper(_employeeVacancy.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _employeeVacancy.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _employeeVacancy.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _employeeVacancy.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof EmployeeVacancyWrapper)) {
            return false;
        }

        EmployeeVacancyWrapper employeeVacancyWrapper = (EmployeeVacancyWrapper) obj;

        if (Validator.equals(_employeeVacancy,
                    employeeVacancyWrapper._employeeVacancy)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public EmployeeVacancy getWrappedEmployeeVacancy() {
        return _employeeVacancy;
    }

    @Override
    public EmployeeVacancy getWrappedModel() {
        return _employeeVacancy;
    }

    @Override
    public void resetOriginalValues() {
        _employeeVacancy.resetOriginalValues();
    }
}
