package vn.com.ecopharma.hrm.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Interview}.
 * </p>
 *
 * @author tvt
 * @see Interview
 * @generated
 */
public class InterviewWrapper implements Interview, ModelWrapper<Interview> {
    private Interview _interview;

    public InterviewWrapper(Interview interview) {
        _interview = interview;
    }

    @Override
    public Class<?> getModelClass() {
        return Interview.class;
    }

    @Override
    public String getModelClassName() {
        return Interview.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("interviewId", getInterviewId());
        attributes.put("groupId", getGroupId());
        attributes.put("companyId", getCompanyId());
        attributes.put("userId", getUserId());
        attributes.put("userName", getUserName());
        attributes.put("createDate", getCreateDate());
        attributes.put("modifiedDate", getModifiedDate());
        attributes.put("name", getName());
        attributes.put("interview_date", getInterview_date());
        attributes.put("interview_time", getInterview_time());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long interviewId = (Long) attributes.get("interviewId");

        if (interviewId != null) {
            setInterviewId(interviewId);
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

        String name = (String) attributes.get("name");

        if (name != null) {
            setName(name);
        }

        Date interview_date = (Date) attributes.get("interview_date");

        if (interview_date != null) {
            setInterview_date(interview_date);
        }

        String interview_time = (String) attributes.get("interview_time");

        if (interview_time != null) {
            setInterview_time(interview_time);
        }
    }

    /**
    * Returns the primary key of this interview.
    *
    * @return the primary key of this interview
    */
    @Override
    public long getPrimaryKey() {
        return _interview.getPrimaryKey();
    }

    /**
    * Sets the primary key of this interview.
    *
    * @param primaryKey the primary key of this interview
    */
    @Override
    public void setPrimaryKey(long primaryKey) {
        _interview.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the interview ID of this interview.
    *
    * @return the interview ID of this interview
    */
    @Override
    public long getInterviewId() {
        return _interview.getInterviewId();
    }

    /**
    * Sets the interview ID of this interview.
    *
    * @param interviewId the interview ID of this interview
    */
    @Override
    public void setInterviewId(long interviewId) {
        _interview.setInterviewId(interviewId);
    }

    /**
    * Returns the group ID of this interview.
    *
    * @return the group ID of this interview
    */
    @Override
    public long getGroupId() {
        return _interview.getGroupId();
    }

    /**
    * Sets the group ID of this interview.
    *
    * @param groupId the group ID of this interview
    */
    @Override
    public void setGroupId(long groupId) {
        _interview.setGroupId(groupId);
    }

    /**
    * Returns the company ID of this interview.
    *
    * @return the company ID of this interview
    */
    @Override
    public long getCompanyId() {
        return _interview.getCompanyId();
    }

    /**
    * Sets the company ID of this interview.
    *
    * @param companyId the company ID of this interview
    */
    @Override
    public void setCompanyId(long companyId) {
        _interview.setCompanyId(companyId);
    }

    /**
    * Returns the user ID of this interview.
    *
    * @return the user ID of this interview
    */
    @Override
    public long getUserId() {
        return _interview.getUserId();
    }

    /**
    * Sets the user ID of this interview.
    *
    * @param userId the user ID of this interview
    */
    @Override
    public void setUserId(long userId) {
        _interview.setUserId(userId);
    }

    /**
    * Returns the user uuid of this interview.
    *
    * @return the user uuid of this interview
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.lang.String getUserUuid()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _interview.getUserUuid();
    }

    /**
    * Sets the user uuid of this interview.
    *
    * @param userUuid the user uuid of this interview
    */
    @Override
    public void setUserUuid(java.lang.String userUuid) {
        _interview.setUserUuid(userUuid);
    }

    /**
    * Returns the user name of this interview.
    *
    * @return the user name of this interview
    */
    @Override
    public java.lang.String getUserName() {
        return _interview.getUserName();
    }

    /**
    * Sets the user name of this interview.
    *
    * @param userName the user name of this interview
    */
    @Override
    public void setUserName(java.lang.String userName) {
        _interview.setUserName(userName);
    }

    /**
    * Returns the create date of this interview.
    *
    * @return the create date of this interview
    */
    @Override
    public java.util.Date getCreateDate() {
        return _interview.getCreateDate();
    }

    /**
    * Sets the create date of this interview.
    *
    * @param createDate the create date of this interview
    */
    @Override
    public void setCreateDate(java.util.Date createDate) {
        _interview.setCreateDate(createDate);
    }

    /**
    * Returns the modified date of this interview.
    *
    * @return the modified date of this interview
    */
    @Override
    public java.util.Date getModifiedDate() {
        return _interview.getModifiedDate();
    }

    /**
    * Sets the modified date of this interview.
    *
    * @param modifiedDate the modified date of this interview
    */
    @Override
    public void setModifiedDate(java.util.Date modifiedDate) {
        _interview.setModifiedDate(modifiedDate);
    }

    /**
    * Returns the name of this interview.
    *
    * @return the name of this interview
    */
    @Override
    public java.lang.String getName() {
        return _interview.getName();
    }

    /**
    * Sets the name of this interview.
    *
    * @param name the name of this interview
    */
    @Override
    public void setName(java.lang.String name) {
        _interview.setName(name);
    }

    /**
    * Returns the interview_date of this interview.
    *
    * @return the interview_date of this interview
    */
    @Override
    public java.util.Date getInterview_date() {
        return _interview.getInterview_date();
    }

    /**
    * Sets the interview_date of this interview.
    *
    * @param interview_date the interview_date of this interview
    */
    @Override
    public void setInterview_date(java.util.Date interview_date) {
        _interview.setInterview_date(interview_date);
    }

    /**
    * Returns the interview_time of this interview.
    *
    * @return the interview_time of this interview
    */
    @Override
    public java.lang.String getInterview_time() {
        return _interview.getInterview_time();
    }

    /**
    * Sets the interview_time of this interview.
    *
    * @param interview_time the interview_time of this interview
    */
    @Override
    public void setInterview_time(java.lang.String interview_time) {
        _interview.setInterview_time(interview_time);
    }

    /**
    * Returns the status of this interview.
    *
    * @return the status of this interview
    */
    @Override
    public int getStatus() {
        return _interview.getStatus();
    }

    /**
    * Returns the trash entry created when this interview was moved to the Recycle Bin. The trash entry may belong to one of the ancestors of this interview.
    *
    * @return the trash entry created when this interview was moved to the Recycle Bin
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.liferay.portlet.trash.model.TrashEntry getTrashEntry()
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _interview.getTrashEntry();
    }

    /**
    * Returns the class primary key of the trash entry for this interview.
    *
    * @return the class primary key of the trash entry for this interview
    */
    @Override
    public long getTrashEntryClassPK() {
        return _interview.getTrashEntryClassPK();
    }

    /**
    * Returns the trash handler for this interview.
    *
    * @return the trash handler for this interview
    */
    @Override
    public com.liferay.portal.kernel.trash.TrashHandler getTrashHandler() {
        return _interview.getTrashHandler();
    }

    /**
    * Returns <code>true</code> if this interview is in the Recycle Bin.
    *
    * @return <code>true</code> if this interview is in the Recycle Bin; <code>false</code> otherwise
    */
    @Override
    public boolean isInTrash() {
        return _interview.isInTrash();
    }

    /**
    * Returns <code>true</code> if the parent of this interview is in the Recycle Bin.
    *
    * @return <code>true</code> if the parent of this interview is in the Recycle Bin; <code>false</code> otherwise
    * @throws SystemException if a system exception occurred
    */
    @Override
    public boolean isInTrashContainer() {
        return _interview.isInTrashContainer();
    }

    @Override
    public boolean isNew() {
        return _interview.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _interview.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _interview.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _interview.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _interview.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _interview.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _interview.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _interview.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _interview.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _interview.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _interview.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new InterviewWrapper((Interview) _interview.clone());
    }

    @Override
    public int compareTo(vn.com.ecopharma.hrm.model.Interview interview) {
        return _interview.compareTo(interview);
    }

    @Override
    public int hashCode() {
        return _interview.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<vn.com.ecopharma.hrm.model.Interview> toCacheModel() {
        return _interview.toCacheModel();
    }

    @Override
    public vn.com.ecopharma.hrm.model.Interview toEscapedModel() {
        return new InterviewWrapper(_interview.toEscapedModel());
    }

    @Override
    public vn.com.ecopharma.hrm.model.Interview toUnescapedModel() {
        return new InterviewWrapper(_interview.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _interview.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _interview.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _interview.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof InterviewWrapper)) {
            return false;
        }

        InterviewWrapper interviewWrapper = (InterviewWrapper) obj;

        if (Validator.equals(_interview, interviewWrapper._interview)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public Interview getWrappedInterview() {
        return _interview;
    }

    @Override
    public Interview getWrappedModel() {
        return _interview;
    }

    @Override
    public void resetOriginalValues() {
        _interview.resetOriginalValues();
    }
}
