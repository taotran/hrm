package vn.com.ecopharma.hrm.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link JTitle}.
 * </p>
 *
 * @author tvt
 * @see JTitle
 * @generated
 */
public class JTitleWrapper implements JTitle, ModelWrapper<JTitle> {
    private JTitle _jTitle;

    public JTitleWrapper(JTitle jTitle) {
        _jTitle = jTitle;
    }

    @Override
    public Class<?> getModelClass() {
        return JTitle.class;
    }

    @Override
    public String getModelClassName() {
        return JTitle.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("jobtitleId", getJobtitleId());
        attributes.put("title", getTitle());
        attributes.put("description", getDescription());
        attributes.put("note", getNote());
        attributes.put("isDeleted", getIsDeleted());
        attributes.put("userId", getUserId());
        attributes.put("groupId", getGroupId());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long jobtitleId = (Long) attributes.get("jobtitleId");

        if (jobtitleId != null) {
            setJobtitleId(jobtitleId);
        }

        String title = (String) attributes.get("title");

        if (title != null) {
            setTitle(title);
        }

        String description = (String) attributes.get("description");

        if (description != null) {
            setDescription(description);
        }

        String note = (String) attributes.get("note");

        if (note != null) {
            setNote(note);
        }

        Boolean isDeleted = (Boolean) attributes.get("isDeleted");

        if (isDeleted != null) {
            setIsDeleted(isDeleted);
        }

        Long userId = (Long) attributes.get("userId");

        if (userId != null) {
            setUserId(userId);
        }

        Long groupId = (Long) attributes.get("groupId");

        if (groupId != null) {
            setGroupId(groupId);
        }
    }

    /**
    * Returns the primary key of this j title.
    *
    * @return the primary key of this j title
    */
    @Override
    public long getPrimaryKey() {
        return _jTitle.getPrimaryKey();
    }

    /**
    * Sets the primary key of this j title.
    *
    * @param primaryKey the primary key of this j title
    */
    @Override
    public void setPrimaryKey(long primaryKey) {
        _jTitle.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the jobtitle ID of this j title.
    *
    * @return the jobtitle ID of this j title
    */
    @Override
    public long getJobtitleId() {
        return _jTitle.getJobtitleId();
    }

    /**
    * Sets the jobtitle ID of this j title.
    *
    * @param jobtitleId the jobtitle ID of this j title
    */
    @Override
    public void setJobtitleId(long jobtitleId) {
        _jTitle.setJobtitleId(jobtitleId);
    }

    /**
    * Returns the title of this j title.
    *
    * @return the title of this j title
    */
    @Override
    public java.lang.String getTitle() {
        return _jTitle.getTitle();
    }

    /**
    * Sets the title of this j title.
    *
    * @param title the title of this j title
    */
    @Override
    public void setTitle(java.lang.String title) {
        _jTitle.setTitle(title);
    }

    /**
    * Returns the description of this j title.
    *
    * @return the description of this j title
    */
    @Override
    public java.lang.String getDescription() {
        return _jTitle.getDescription();
    }

    /**
    * Sets the description of this j title.
    *
    * @param description the description of this j title
    */
    @Override
    public void setDescription(java.lang.String description) {
        _jTitle.setDescription(description);
    }

    /**
    * Returns the note of this j title.
    *
    * @return the note of this j title
    */
    @Override
    public java.lang.String getNote() {
        return _jTitle.getNote();
    }

    /**
    * Sets the note of this j title.
    *
    * @param note the note of this j title
    */
    @Override
    public void setNote(java.lang.String note) {
        _jTitle.setNote(note);
    }

    /**
    * Returns the is deleted of this j title.
    *
    * @return the is deleted of this j title
    */
    @Override
    public boolean getIsDeleted() {
        return _jTitle.getIsDeleted();
    }

    /**
    * Returns <code>true</code> if this j title is is deleted.
    *
    * @return <code>true</code> if this j title is is deleted; <code>false</code> otherwise
    */
    @Override
    public boolean isIsDeleted() {
        return _jTitle.isIsDeleted();
    }

    /**
    * Sets whether this j title is is deleted.
    *
    * @param isDeleted the is deleted of this j title
    */
    @Override
    public void setIsDeleted(boolean isDeleted) {
        _jTitle.setIsDeleted(isDeleted);
    }

    /**
    * Returns the user ID of this j title.
    *
    * @return the user ID of this j title
    */
    @Override
    public long getUserId() {
        return _jTitle.getUserId();
    }

    /**
    * Sets the user ID of this j title.
    *
    * @param userId the user ID of this j title
    */
    @Override
    public void setUserId(long userId) {
        _jTitle.setUserId(userId);
    }

    /**
    * Returns the user uuid of this j title.
    *
    * @return the user uuid of this j title
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.lang.String getUserUuid()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _jTitle.getUserUuid();
    }

    /**
    * Sets the user uuid of this j title.
    *
    * @param userUuid the user uuid of this j title
    */
    @Override
    public void setUserUuid(java.lang.String userUuid) {
        _jTitle.setUserUuid(userUuid);
    }

    /**
    * Returns the group ID of this j title.
    *
    * @return the group ID of this j title
    */
    @Override
    public long getGroupId() {
        return _jTitle.getGroupId();
    }

    /**
    * Sets the group ID of this j title.
    *
    * @param groupId the group ID of this j title
    */
    @Override
    public void setGroupId(long groupId) {
        _jTitle.setGroupId(groupId);
    }

    /**
    * Returns the status of this j title.
    *
    * @return the status of this j title
    */
    @Override
    public int getStatus() {
        return _jTitle.getStatus();
    }

    /**
    * Returns the trash entry created when this j title was moved to the Recycle Bin. The trash entry may belong to one of the ancestors of this j title.
    *
    * @return the trash entry created when this j title was moved to the Recycle Bin
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.liferay.portlet.trash.model.TrashEntry getTrashEntry()
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _jTitle.getTrashEntry();
    }

    /**
    * Returns the class primary key of the trash entry for this j title.
    *
    * @return the class primary key of the trash entry for this j title
    */
    @Override
    public long getTrashEntryClassPK() {
        return _jTitle.getTrashEntryClassPK();
    }

    /**
    * Returns the trash handler for this j title.
    *
    * @return the trash handler for this j title
    */
    @Override
    public com.liferay.portal.kernel.trash.TrashHandler getTrashHandler() {
        return _jTitle.getTrashHandler();
    }

    /**
    * Returns <code>true</code> if this j title is in the Recycle Bin.
    *
    * @return <code>true</code> if this j title is in the Recycle Bin; <code>false</code> otherwise
    */
    @Override
    public boolean isInTrash() {
        return _jTitle.isInTrash();
    }

    /**
    * Returns <code>true</code> if the parent of this j title is in the Recycle Bin.
    *
    * @return <code>true</code> if the parent of this j title is in the Recycle Bin; <code>false</code> otherwise
    * @throws SystemException if a system exception occurred
    */
    @Override
    public boolean isInTrashContainer() {
        return _jTitle.isInTrashContainer();
    }

    @Override
    public boolean isNew() {
        return _jTitle.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _jTitle.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _jTitle.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _jTitle.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _jTitle.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _jTitle.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _jTitle.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _jTitle.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _jTitle.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _jTitle.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _jTitle.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new JTitleWrapper((JTitle) _jTitle.clone());
    }

    @Override
    public int compareTo(vn.com.ecopharma.hrm.model.JTitle jTitle) {
        return _jTitle.compareTo(jTitle);
    }

    @Override
    public int hashCode() {
        return _jTitle.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<vn.com.ecopharma.hrm.model.JTitle> toCacheModel() {
        return _jTitle.toCacheModel();
    }

    @Override
    public vn.com.ecopharma.hrm.model.JTitle toEscapedModel() {
        return new JTitleWrapper(_jTitle.toEscapedModel());
    }

    @Override
    public vn.com.ecopharma.hrm.model.JTitle toUnescapedModel() {
        return new JTitleWrapper(_jTitle.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _jTitle.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _jTitle.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _jTitle.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof JTitleWrapper)) {
            return false;
        }

        JTitleWrapper jTitleWrapper = (JTitleWrapper) obj;

        if (Validator.equals(_jTitle, jTitleWrapper._jTitle)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public JTitle getWrappedJTitle() {
        return _jTitle;
    }

    @Override
    public JTitle getWrappedModel() {
        return _jTitle;
    }

    @Override
    public void resetOriginalValues() {
        _jTitle.resetOriginalValues();
    }
}
