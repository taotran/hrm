package vn.com.ecopharma.hrm.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link EmployeeInterviewSchedule}.
 * </p>
 *
 * @author tvt
 * @see EmployeeInterviewSchedule
 * @generated
 */
public class EmployeeInterviewScheduleWrapper
    implements EmployeeInterviewSchedule,
        ModelWrapper<EmployeeInterviewSchedule> {
    private EmployeeInterviewSchedule _employeeInterviewSchedule;

    public EmployeeInterviewScheduleWrapper(
        EmployeeInterviewSchedule employeeInterviewSchedule) {
        _employeeInterviewSchedule = employeeInterviewSchedule;
    }

    @Override
    public Class<?> getModelClass() {
        return EmployeeInterviewSchedule.class;
    }

    @Override
    public String getModelClassName() {
        return EmployeeInterviewSchedule.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("employeeInterviewScheduleId",
            getEmployeeInterviewScheduleId());
        attributes.put("employeeId", getEmployeeId());
        attributes.put("interviewScheduleId", getInterviewScheduleId());
        attributes.put("groupId", getGroupId());
        attributes.put("companyId", getCompanyId());
        attributes.put("userId", getUserId());
        attributes.put("createDate", getCreateDate());
        attributes.put("modifiedDate", getModifiedDate());
        attributes.put("note", getNote());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long employeeInterviewScheduleId = (Long) attributes.get(
                "employeeInterviewScheduleId");

        if (employeeInterviewScheduleId != null) {
            setEmployeeInterviewScheduleId(employeeInterviewScheduleId);
        }

        Long employeeId = (Long) attributes.get("employeeId");

        if (employeeId != null) {
            setEmployeeId(employeeId);
        }

        Long interviewScheduleId = (Long) attributes.get("interviewScheduleId");

        if (interviewScheduleId != null) {
            setInterviewScheduleId(interviewScheduleId);
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

        String note = (String) attributes.get("note");

        if (note != null) {
            setNote(note);
        }
    }

    /**
    * Returns the primary key of this employee interview schedule.
    *
    * @return the primary key of this employee interview schedule
    */
    @Override
    public long getPrimaryKey() {
        return _employeeInterviewSchedule.getPrimaryKey();
    }

    /**
    * Sets the primary key of this employee interview schedule.
    *
    * @param primaryKey the primary key of this employee interview schedule
    */
    @Override
    public void setPrimaryKey(long primaryKey) {
        _employeeInterviewSchedule.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the employee interview schedule ID of this employee interview schedule.
    *
    * @return the employee interview schedule ID of this employee interview schedule
    */
    @Override
    public long getEmployeeInterviewScheduleId() {
        return _employeeInterviewSchedule.getEmployeeInterviewScheduleId();
    }

    /**
    * Sets the employee interview schedule ID of this employee interview schedule.
    *
    * @param employeeInterviewScheduleId the employee interview schedule ID of this employee interview schedule
    */
    @Override
    public void setEmployeeInterviewScheduleId(long employeeInterviewScheduleId) {
        _employeeInterviewSchedule.setEmployeeInterviewScheduleId(employeeInterviewScheduleId);
    }

    /**
    * Returns the employee ID of this employee interview schedule.
    *
    * @return the employee ID of this employee interview schedule
    */
    @Override
    public long getEmployeeId() {
        return _employeeInterviewSchedule.getEmployeeId();
    }

    /**
    * Sets the employee ID of this employee interview schedule.
    *
    * @param employeeId the employee ID of this employee interview schedule
    */
    @Override
    public void setEmployeeId(long employeeId) {
        _employeeInterviewSchedule.setEmployeeId(employeeId);
    }

    /**
    * Returns the interview schedule ID of this employee interview schedule.
    *
    * @return the interview schedule ID of this employee interview schedule
    */
    @Override
    public long getInterviewScheduleId() {
        return _employeeInterviewSchedule.getInterviewScheduleId();
    }

    /**
    * Sets the interview schedule ID of this employee interview schedule.
    *
    * @param interviewScheduleId the interview schedule ID of this employee interview schedule
    */
    @Override
    public void setInterviewScheduleId(long interviewScheduleId) {
        _employeeInterviewSchedule.setInterviewScheduleId(interviewScheduleId);
    }

    /**
    * Returns the group ID of this employee interview schedule.
    *
    * @return the group ID of this employee interview schedule
    */
    @Override
    public long getGroupId() {
        return _employeeInterviewSchedule.getGroupId();
    }

    /**
    * Sets the group ID of this employee interview schedule.
    *
    * @param groupId the group ID of this employee interview schedule
    */
    @Override
    public void setGroupId(long groupId) {
        _employeeInterviewSchedule.setGroupId(groupId);
    }

    /**
    * Returns the company ID of this employee interview schedule.
    *
    * @return the company ID of this employee interview schedule
    */
    @Override
    public long getCompanyId() {
        return _employeeInterviewSchedule.getCompanyId();
    }

    /**
    * Sets the company ID of this employee interview schedule.
    *
    * @param companyId the company ID of this employee interview schedule
    */
    @Override
    public void setCompanyId(long companyId) {
        _employeeInterviewSchedule.setCompanyId(companyId);
    }

    /**
    * Returns the user ID of this employee interview schedule.
    *
    * @return the user ID of this employee interview schedule
    */
    @Override
    public long getUserId() {
        return _employeeInterviewSchedule.getUserId();
    }

    /**
    * Sets the user ID of this employee interview schedule.
    *
    * @param userId the user ID of this employee interview schedule
    */
    @Override
    public void setUserId(long userId) {
        _employeeInterviewSchedule.setUserId(userId);
    }

    /**
    * Returns the user uuid of this employee interview schedule.
    *
    * @return the user uuid of this employee interview schedule
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.lang.String getUserUuid()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _employeeInterviewSchedule.getUserUuid();
    }

    /**
    * Sets the user uuid of this employee interview schedule.
    *
    * @param userUuid the user uuid of this employee interview schedule
    */
    @Override
    public void setUserUuid(java.lang.String userUuid) {
        _employeeInterviewSchedule.setUserUuid(userUuid);
    }

    /**
    * Returns the create date of this employee interview schedule.
    *
    * @return the create date of this employee interview schedule
    */
    @Override
    public java.util.Date getCreateDate() {
        return _employeeInterviewSchedule.getCreateDate();
    }

    /**
    * Sets the create date of this employee interview schedule.
    *
    * @param createDate the create date of this employee interview schedule
    */
    @Override
    public void setCreateDate(java.util.Date createDate) {
        _employeeInterviewSchedule.setCreateDate(createDate);
    }

    /**
    * Returns the modified date of this employee interview schedule.
    *
    * @return the modified date of this employee interview schedule
    */
    @Override
    public java.util.Date getModifiedDate() {
        return _employeeInterviewSchedule.getModifiedDate();
    }

    /**
    * Sets the modified date of this employee interview schedule.
    *
    * @param modifiedDate the modified date of this employee interview schedule
    */
    @Override
    public void setModifiedDate(java.util.Date modifiedDate) {
        _employeeInterviewSchedule.setModifiedDate(modifiedDate);
    }

    /**
    * Returns the note of this employee interview schedule.
    *
    * @return the note of this employee interview schedule
    */
    @Override
    public java.lang.String getNote() {
        return _employeeInterviewSchedule.getNote();
    }

    /**
    * Sets the note of this employee interview schedule.
    *
    * @param note the note of this employee interview schedule
    */
    @Override
    public void setNote(java.lang.String note) {
        _employeeInterviewSchedule.setNote(note);
    }

    /**
    * Returns the status of this employee interview schedule.
    *
    * @return the status of this employee interview schedule
    */
    @Override
    public int getStatus() {
        return _employeeInterviewSchedule.getStatus();
    }

    /**
    * Returns the trash entry created when this employee interview schedule was moved to the Recycle Bin. The trash entry may belong to one of the ancestors of this employee interview schedule.
    *
    * @return the trash entry created when this employee interview schedule was moved to the Recycle Bin
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.liferay.portlet.trash.model.TrashEntry getTrashEntry()
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _employeeInterviewSchedule.getTrashEntry();
    }

    /**
    * Returns the class primary key of the trash entry for this employee interview schedule.
    *
    * @return the class primary key of the trash entry for this employee interview schedule
    */
    @Override
    public long getTrashEntryClassPK() {
        return _employeeInterviewSchedule.getTrashEntryClassPK();
    }

    /**
    * Returns the trash handler for this employee interview schedule.
    *
    * @return the trash handler for this employee interview schedule
    */
    @Override
    public com.liferay.portal.kernel.trash.TrashHandler getTrashHandler() {
        return _employeeInterviewSchedule.getTrashHandler();
    }

    /**
    * Returns <code>true</code> if this employee interview schedule is in the Recycle Bin.
    *
    * @return <code>true</code> if this employee interview schedule is in the Recycle Bin; <code>false</code> otherwise
    */
    @Override
    public boolean isInTrash() {
        return _employeeInterviewSchedule.isInTrash();
    }

    /**
    * Returns <code>true</code> if the parent of this employee interview schedule is in the Recycle Bin.
    *
    * @return <code>true</code> if the parent of this employee interview schedule is in the Recycle Bin; <code>false</code> otherwise
    * @throws SystemException if a system exception occurred
    */
    @Override
    public boolean isInTrashContainer() {
        return _employeeInterviewSchedule.isInTrashContainer();
    }

    @Override
    public boolean isNew() {
        return _employeeInterviewSchedule.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _employeeInterviewSchedule.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _employeeInterviewSchedule.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _employeeInterviewSchedule.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _employeeInterviewSchedule.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _employeeInterviewSchedule.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _employeeInterviewSchedule.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _employeeInterviewSchedule.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _employeeInterviewSchedule.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _employeeInterviewSchedule.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _employeeInterviewSchedule.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new EmployeeInterviewScheduleWrapper((EmployeeInterviewSchedule) _employeeInterviewSchedule.clone());
    }

    @Override
    public int compareTo(
        vn.com.ecopharma.hrm.model.EmployeeInterviewSchedule employeeInterviewSchedule) {
        return _employeeInterviewSchedule.compareTo(employeeInterviewSchedule);
    }

    @Override
    public int hashCode() {
        return _employeeInterviewSchedule.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<vn.com.ecopharma.hrm.model.EmployeeInterviewSchedule> toCacheModel() {
        return _employeeInterviewSchedule.toCacheModel();
    }

    @Override
    public vn.com.ecopharma.hrm.model.EmployeeInterviewSchedule toEscapedModel() {
        return new EmployeeInterviewScheduleWrapper(_employeeInterviewSchedule.toEscapedModel());
    }

    @Override
    public vn.com.ecopharma.hrm.model.EmployeeInterviewSchedule toUnescapedModel() {
        return new EmployeeInterviewScheduleWrapper(_employeeInterviewSchedule.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _employeeInterviewSchedule.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _employeeInterviewSchedule.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _employeeInterviewSchedule.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof EmployeeInterviewScheduleWrapper)) {
            return false;
        }

        EmployeeInterviewScheduleWrapper employeeInterviewScheduleWrapper = (EmployeeInterviewScheduleWrapper) obj;

        if (Validator.equals(_employeeInterviewSchedule,
                    employeeInterviewScheduleWrapper._employeeInterviewSchedule)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public EmployeeInterviewSchedule getWrappedEmployeeInterviewSchedule() {
        return _employeeInterviewSchedule;
    }

    @Override
    public EmployeeInterviewSchedule getWrappedModel() {
        return _employeeInterviewSchedule;
    }

    @Override
    public void resetOriginalValues() {
        _employeeInterviewSchedule.resetOriginalValues();
    }
}
