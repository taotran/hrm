package vn.com.ecopharma.hrm.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link FileAttachment}.
 * </p>
 *
 * @author tvt
 * @see FileAttachment
 * @generated
 */
public class FileAttachmentWrapper implements FileAttachment,
    ModelWrapper<FileAttachment> {
    private FileAttachment _fileAttachment;

    public FileAttachmentWrapper(FileAttachment fileAttachment) {
        _fileAttachment = fileAttachment;
    }

    @Override
    public Class<?> getModelClass() {
        return FileAttachment.class;
    }

    @Override
    public String getModelClassName() {
        return FileAttachment.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("f_id", getF_id());
        attributes.put("groupId", getGroupId());
        attributes.put("companyId", getCompanyId());
        attributes.put("userId", getUserId());
        attributes.put("createDate", getCreateDate());
        attributes.put("modifiedDate", getModifiedDate());
        attributes.put("c_id", getC_id());
        attributes.put("name", getName());
        attributes.put("file_type", getFile_type());
        attributes.put("size", getSize());
        attributes.put("content", getContent());
        attributes.put("attachment_type", getAttachment_type());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long f_id = (Long) attributes.get("f_id");

        if (f_id != null) {
            setF_id(f_id);
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

        Long c_id = (Long) attributes.get("c_id");

        if (c_id != null) {
            setC_id(c_id);
        }

        String name = (String) attributes.get("name");

        if (name != null) {
            setName(name);
        }

        String file_type = (String) attributes.get("file_type");

        if (file_type != null) {
            setFile_type(file_type);
        }

        Long size = (Long) attributes.get("size");

        if (size != null) {
            setSize(size);
        }

        String content = (String) attributes.get("content");

        if (content != null) {
            setContent(content);
        }

        String attachment_type = (String) attributes.get("attachment_type");

        if (attachment_type != null) {
            setAttachment_type(attachment_type);
        }
    }

    /**
    * Returns the primary key of this file attachment.
    *
    * @return the primary key of this file attachment
    */
    @Override
    public long getPrimaryKey() {
        return _fileAttachment.getPrimaryKey();
    }

    /**
    * Sets the primary key of this file attachment.
    *
    * @param primaryKey the primary key of this file attachment
    */
    @Override
    public void setPrimaryKey(long primaryKey) {
        _fileAttachment.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the f_id of this file attachment.
    *
    * @return the f_id of this file attachment
    */
    @Override
    public long getF_id() {
        return _fileAttachment.getF_id();
    }

    /**
    * Sets the f_id of this file attachment.
    *
    * @param f_id the f_id of this file attachment
    */
    @Override
    public void setF_id(long f_id) {
        _fileAttachment.setF_id(f_id);
    }

    /**
    * Returns the group ID of this file attachment.
    *
    * @return the group ID of this file attachment
    */
    @Override
    public long getGroupId() {
        return _fileAttachment.getGroupId();
    }

    /**
    * Sets the group ID of this file attachment.
    *
    * @param groupId the group ID of this file attachment
    */
    @Override
    public void setGroupId(long groupId) {
        _fileAttachment.setGroupId(groupId);
    }

    /**
    * Returns the company ID of this file attachment.
    *
    * @return the company ID of this file attachment
    */
    @Override
    public long getCompanyId() {
        return _fileAttachment.getCompanyId();
    }

    /**
    * Sets the company ID of this file attachment.
    *
    * @param companyId the company ID of this file attachment
    */
    @Override
    public void setCompanyId(long companyId) {
        _fileAttachment.setCompanyId(companyId);
    }

    /**
    * Returns the user ID of this file attachment.
    *
    * @return the user ID of this file attachment
    */
    @Override
    public long getUserId() {
        return _fileAttachment.getUserId();
    }

    /**
    * Sets the user ID of this file attachment.
    *
    * @param userId the user ID of this file attachment
    */
    @Override
    public void setUserId(long userId) {
        _fileAttachment.setUserId(userId);
    }

    /**
    * Returns the user uuid of this file attachment.
    *
    * @return the user uuid of this file attachment
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.lang.String getUserUuid()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _fileAttachment.getUserUuid();
    }

    /**
    * Sets the user uuid of this file attachment.
    *
    * @param userUuid the user uuid of this file attachment
    */
    @Override
    public void setUserUuid(java.lang.String userUuid) {
        _fileAttachment.setUserUuid(userUuid);
    }

    /**
    * Returns the create date of this file attachment.
    *
    * @return the create date of this file attachment
    */
    @Override
    public java.util.Date getCreateDate() {
        return _fileAttachment.getCreateDate();
    }

    /**
    * Sets the create date of this file attachment.
    *
    * @param createDate the create date of this file attachment
    */
    @Override
    public void setCreateDate(java.util.Date createDate) {
        _fileAttachment.setCreateDate(createDate);
    }

    /**
    * Returns the modified date of this file attachment.
    *
    * @return the modified date of this file attachment
    */
    @Override
    public java.util.Date getModifiedDate() {
        return _fileAttachment.getModifiedDate();
    }

    /**
    * Sets the modified date of this file attachment.
    *
    * @param modifiedDate the modified date of this file attachment
    */
    @Override
    public void setModifiedDate(java.util.Date modifiedDate) {
        _fileAttachment.setModifiedDate(modifiedDate);
    }

    /**
    * Returns the c_id of this file attachment.
    *
    * @return the c_id of this file attachment
    */
    @Override
    public long getC_id() {
        return _fileAttachment.getC_id();
    }

    /**
    * Sets the c_id of this file attachment.
    *
    * @param c_id the c_id of this file attachment
    */
    @Override
    public void setC_id(long c_id) {
        _fileAttachment.setC_id(c_id);
    }

    /**
    * Returns the name of this file attachment.
    *
    * @return the name of this file attachment
    */
    @Override
    public java.lang.String getName() {
        return _fileAttachment.getName();
    }

    /**
    * Sets the name of this file attachment.
    *
    * @param name the name of this file attachment
    */
    @Override
    public void setName(java.lang.String name) {
        _fileAttachment.setName(name);
    }

    /**
    * Returns the file_type of this file attachment.
    *
    * @return the file_type of this file attachment
    */
    @Override
    public java.lang.String getFile_type() {
        return _fileAttachment.getFile_type();
    }

    /**
    * Sets the file_type of this file attachment.
    *
    * @param file_type the file_type of this file attachment
    */
    @Override
    public void setFile_type(java.lang.String file_type) {
        _fileAttachment.setFile_type(file_type);
    }

    /**
    * Returns the size of this file attachment.
    *
    * @return the size of this file attachment
    */
    @Override
    public long getSize() {
        return _fileAttachment.getSize();
    }

    /**
    * Sets the size of this file attachment.
    *
    * @param size the size of this file attachment
    */
    @Override
    public void setSize(long size) {
        _fileAttachment.setSize(size);
    }

    /**
    * Returns the content of this file attachment.
    *
    * @return the content of this file attachment
    */
    @Override
    public java.lang.String getContent() {
        return _fileAttachment.getContent();
    }

    /**
    * Sets the content of this file attachment.
    *
    * @param content the content of this file attachment
    */
    @Override
    public void setContent(java.lang.String content) {
        _fileAttachment.setContent(content);
    }

    /**
    * Returns the attachment_type of this file attachment.
    *
    * @return the attachment_type of this file attachment
    */
    @Override
    public java.lang.String getAttachment_type() {
        return _fileAttachment.getAttachment_type();
    }

    /**
    * Sets the attachment_type of this file attachment.
    *
    * @param attachment_type the attachment_type of this file attachment
    */
    @Override
    public void setAttachment_type(java.lang.String attachment_type) {
        _fileAttachment.setAttachment_type(attachment_type);
    }

    /**
    * Returns the status of this file attachment.
    *
    * @return the status of this file attachment
    */
    @Override
    public int getStatus() {
        return _fileAttachment.getStatus();
    }

    /**
    * Returns the trash entry created when this file attachment was moved to the Recycle Bin. The trash entry may belong to one of the ancestors of this file attachment.
    *
    * @return the trash entry created when this file attachment was moved to the Recycle Bin
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.liferay.portlet.trash.model.TrashEntry getTrashEntry()
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _fileAttachment.getTrashEntry();
    }

    /**
    * Returns the class primary key of the trash entry for this file attachment.
    *
    * @return the class primary key of the trash entry for this file attachment
    */
    @Override
    public long getTrashEntryClassPK() {
        return _fileAttachment.getTrashEntryClassPK();
    }

    /**
    * Returns the trash handler for this file attachment.
    *
    * @return the trash handler for this file attachment
    */
    @Override
    public com.liferay.portal.kernel.trash.TrashHandler getTrashHandler() {
        return _fileAttachment.getTrashHandler();
    }

    /**
    * Returns <code>true</code> if this file attachment is in the Recycle Bin.
    *
    * @return <code>true</code> if this file attachment is in the Recycle Bin; <code>false</code> otherwise
    */
    @Override
    public boolean isInTrash() {
        return _fileAttachment.isInTrash();
    }

    /**
    * Returns <code>true</code> if the parent of this file attachment is in the Recycle Bin.
    *
    * @return <code>true</code> if the parent of this file attachment is in the Recycle Bin; <code>false</code> otherwise
    * @throws SystemException if a system exception occurred
    */
    @Override
    public boolean isInTrashContainer() {
        return _fileAttachment.isInTrashContainer();
    }

    @Override
    public boolean isNew() {
        return _fileAttachment.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _fileAttachment.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _fileAttachment.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _fileAttachment.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _fileAttachment.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _fileAttachment.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _fileAttachment.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _fileAttachment.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _fileAttachment.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _fileAttachment.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _fileAttachment.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new FileAttachmentWrapper((FileAttachment) _fileAttachment.clone());
    }

    @Override
    public int compareTo(
        vn.com.ecopharma.hrm.model.FileAttachment fileAttachment) {
        return _fileAttachment.compareTo(fileAttachment);
    }

    @Override
    public int hashCode() {
        return _fileAttachment.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<vn.com.ecopharma.hrm.model.FileAttachment> toCacheModel() {
        return _fileAttachment.toCacheModel();
    }

    @Override
    public vn.com.ecopharma.hrm.model.FileAttachment toEscapedModel() {
        return new FileAttachmentWrapper(_fileAttachment.toEscapedModel());
    }

    @Override
    public vn.com.ecopharma.hrm.model.FileAttachment toUnescapedModel() {
        return new FileAttachmentWrapper(_fileAttachment.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _fileAttachment.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _fileAttachment.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _fileAttachment.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof FileAttachmentWrapper)) {
            return false;
        }

        FileAttachmentWrapper fileAttachmentWrapper = (FileAttachmentWrapper) obj;

        if (Validator.equals(_fileAttachment,
                    fileAttachmentWrapper._fileAttachment)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public FileAttachment getWrappedFileAttachment() {
        return _fileAttachment;
    }

    @Override
    public FileAttachment getWrappedModel() {
        return _fileAttachment;
    }

    @Override
    public void resetOriginalValues() {
        _fileAttachment.resetOriginalValues();
    }
}
