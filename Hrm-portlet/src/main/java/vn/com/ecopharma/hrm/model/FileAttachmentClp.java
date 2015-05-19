package vn.com.ecopharma.hrm.model;

import com.liferay.portal.NoSuchModelException;
import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.trash.TrashHandler;
import com.liferay.portal.kernel.trash.TrashHandlerRegistryUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.workflow.WorkflowConstants;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.ContainerModel;
import com.liferay.portal.model.TrashedModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.util.PortalUtil;

import com.liferay.portlet.trash.model.TrashEntry;
import com.liferay.portlet.trash.service.TrashEntryLocalServiceUtil;

import vn.com.ecopharma.hrm.service.ClpSerializer;
import vn.com.ecopharma.hrm.service.FileAttachmentLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;


public class FileAttachmentClp extends BaseModelImpl<FileAttachment>
    implements FileAttachment {
    private long _f_id;
    private long _groupId;
    private long _companyId;
    private long _userId;
    private String _userUuid;
    private Date _createDate;
    private Date _modifiedDate;
    private long _c_id;
    private String _name;
    private String _file_type;
    private long _size;
    private String _content;
    private String _attachment_type;
    private BaseModel<?> _fileAttachmentRemoteModel;
    private Class<?> _clpSerializerClass = vn.com.ecopharma.hrm.service.ClpSerializer.class;

    public FileAttachmentClp() {
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
    public long getPrimaryKey() {
        return _f_id;
    }

    @Override
    public void setPrimaryKey(long primaryKey) {
        setF_id(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _f_id;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Long) primaryKeyObj).longValue());
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

    @Override
    public long getF_id() {
        return _f_id;
    }

    @Override
    public void setF_id(long f_id) {
        _f_id = f_id;

        if (_fileAttachmentRemoteModel != null) {
            try {
                Class<?> clazz = _fileAttachmentRemoteModel.getClass();

                Method method = clazz.getMethod("setF_id", long.class);

                method.invoke(_fileAttachmentRemoteModel, f_id);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getGroupId() {
        return _groupId;
    }

    @Override
    public void setGroupId(long groupId) {
        _groupId = groupId;

        if (_fileAttachmentRemoteModel != null) {
            try {
                Class<?> clazz = _fileAttachmentRemoteModel.getClass();

                Method method = clazz.getMethod("setGroupId", long.class);

                method.invoke(_fileAttachmentRemoteModel, groupId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getCompanyId() {
        return _companyId;
    }

    @Override
    public void setCompanyId(long companyId) {
        _companyId = companyId;

        if (_fileAttachmentRemoteModel != null) {
            try {
                Class<?> clazz = _fileAttachmentRemoteModel.getClass();

                Method method = clazz.getMethod("setCompanyId", long.class);

                method.invoke(_fileAttachmentRemoteModel, companyId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getUserId() {
        return _userId;
    }

    @Override
    public void setUserId(long userId) {
        _userId = userId;

        if (_fileAttachmentRemoteModel != null) {
            try {
                Class<?> clazz = _fileAttachmentRemoteModel.getClass();

                Method method = clazz.getMethod("setUserId", long.class);

                method.invoke(_fileAttachmentRemoteModel, userId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getUserUuid() throws SystemException {
        return PortalUtil.getUserValue(getUserId(), "uuid", _userUuid);
    }

    @Override
    public void setUserUuid(String userUuid) {
        _userUuid = userUuid;
    }

    @Override
    public Date getCreateDate() {
        return _createDate;
    }

    @Override
    public void setCreateDate(Date createDate) {
        _createDate = createDate;

        if (_fileAttachmentRemoteModel != null) {
            try {
                Class<?> clazz = _fileAttachmentRemoteModel.getClass();

                Method method = clazz.getMethod("setCreateDate", Date.class);

                method.invoke(_fileAttachmentRemoteModel, createDate);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public Date getModifiedDate() {
        return _modifiedDate;
    }

    @Override
    public void setModifiedDate(Date modifiedDate) {
        _modifiedDate = modifiedDate;

        if (_fileAttachmentRemoteModel != null) {
            try {
                Class<?> clazz = _fileAttachmentRemoteModel.getClass();

                Method method = clazz.getMethod("setModifiedDate", Date.class);

                method.invoke(_fileAttachmentRemoteModel, modifiedDate);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getC_id() {
        return _c_id;
    }

    @Override
    public void setC_id(long c_id) {
        _c_id = c_id;

        if (_fileAttachmentRemoteModel != null) {
            try {
                Class<?> clazz = _fileAttachmentRemoteModel.getClass();

                Method method = clazz.getMethod("setC_id", long.class);

                method.invoke(_fileAttachmentRemoteModel, c_id);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getName() {
        return _name;
    }

    @Override
    public void setName(String name) {
        _name = name;

        if (_fileAttachmentRemoteModel != null) {
            try {
                Class<?> clazz = _fileAttachmentRemoteModel.getClass();

                Method method = clazz.getMethod("setName", String.class);

                method.invoke(_fileAttachmentRemoteModel, name);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getFile_type() {
        return _file_type;
    }

    @Override
    public void setFile_type(String file_type) {
        _file_type = file_type;

        if (_fileAttachmentRemoteModel != null) {
            try {
                Class<?> clazz = _fileAttachmentRemoteModel.getClass();

                Method method = clazz.getMethod("setFile_type", String.class);

                method.invoke(_fileAttachmentRemoteModel, file_type);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getSize() {
        return _size;
    }

    @Override
    public void setSize(long size) {
        _size = size;

        if (_fileAttachmentRemoteModel != null) {
            try {
                Class<?> clazz = _fileAttachmentRemoteModel.getClass();

                Method method = clazz.getMethod("setSize", long.class);

                method.invoke(_fileAttachmentRemoteModel, size);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getContent() {
        return _content;
    }

    @Override
    public void setContent(String content) {
        _content = content;

        if (_fileAttachmentRemoteModel != null) {
            try {
                Class<?> clazz = _fileAttachmentRemoteModel.getClass();

                Method method = clazz.getMethod("setContent", String.class);

                method.invoke(_fileAttachmentRemoteModel, content);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getAttachment_type() {
        return _attachment_type;
    }

    @Override
    public void setAttachment_type(String attachment_type) {
        _attachment_type = attachment_type;

        if (_fileAttachmentRemoteModel != null) {
            try {
                Class<?> clazz = _fileAttachmentRemoteModel.getClass();

                Method method = clazz.getMethod("setAttachment_type",
                        String.class);

                method.invoke(_fileAttachmentRemoteModel, attachment_type);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getStatus() {
        return 0;
    }

    @Override
    public TrashEntry getTrashEntry() throws PortalException, SystemException {
        if (!isInTrash()) {
            return null;
        }

        TrashEntry trashEntry = TrashEntryLocalServiceUtil.fetchEntry(getModelClassName(),
                getTrashEntryClassPK());

        if (trashEntry != null) {
            return trashEntry;
        }

        TrashHandler trashHandler = getTrashHandler();

        if (!Validator.isNull(trashHandler.getContainerModelClassName())) {
            ContainerModel containerModel = null;

            try {
                containerModel = trashHandler.getParentContainerModel(this);
            } catch (NoSuchModelException nsme) {
                return null;
            }

            while (containerModel != null) {
                if (containerModel instanceof TrashedModel) {
                    TrashedModel trashedModel = (TrashedModel) containerModel;

                    return trashedModel.getTrashEntry();
                }

                trashHandler = TrashHandlerRegistryUtil.getTrashHandler(trashHandler.getContainerModelClassName());

                if (trashHandler == null) {
                    return null;
                }

                containerModel = trashHandler.getContainerModel(containerModel.getParentContainerModelId());
            }
        }

        return null;
    }

    @Override
    public long getTrashEntryClassPK() {
        return getPrimaryKey();
    }

    @Override
    public TrashHandler getTrashHandler() {
        return TrashHandlerRegistryUtil.getTrashHandler(getModelClassName());
    }

    @Override
    public boolean isInTrash() {
        if (getStatus() == WorkflowConstants.STATUS_IN_TRASH) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean isInTrashContainer() {
        TrashHandler trashHandler = getTrashHandler();

        if ((trashHandler == null) ||
                Validator.isNull(trashHandler.getContainerModelClassName())) {
            return false;
        }

        try {
            ContainerModel containerModel = trashHandler.getParentContainerModel(this);

            if (containerModel == null) {
                return false;
            }

            if (containerModel instanceof TrashedModel) {
                return ((TrashedModel) containerModel).isInTrash();
            }
        } catch (Exception e) {
        }

        return false;
    }

    public BaseModel<?> getFileAttachmentRemoteModel() {
        return _fileAttachmentRemoteModel;
    }

    public void setFileAttachmentRemoteModel(
        BaseModel<?> fileAttachmentRemoteModel) {
        _fileAttachmentRemoteModel = fileAttachmentRemoteModel;
    }

    public Object invokeOnRemoteModel(String methodName,
        Class<?>[] parameterTypes, Object[] parameterValues)
        throws Exception {
        Object[] remoteParameterValues = new Object[parameterValues.length];

        for (int i = 0; i < parameterValues.length; i++) {
            if (parameterValues[i] != null) {
                remoteParameterValues[i] = ClpSerializer.translateInput(parameterValues[i]);
            }
        }

        Class<?> remoteModelClass = _fileAttachmentRemoteModel.getClass();

        ClassLoader remoteModelClassLoader = remoteModelClass.getClassLoader();

        Class<?>[] remoteParameterTypes = new Class[parameterTypes.length];

        for (int i = 0; i < parameterTypes.length; i++) {
            if (parameterTypes[i].isPrimitive()) {
                remoteParameterTypes[i] = parameterTypes[i];
            } else {
                String parameterTypeName = parameterTypes[i].getName();

                remoteParameterTypes[i] = remoteModelClassLoader.loadClass(parameterTypeName);
            }
        }

        Method method = remoteModelClass.getMethod(methodName,
                remoteParameterTypes);

        Object returnValue = method.invoke(_fileAttachmentRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            FileAttachmentLocalServiceUtil.addFileAttachment(this);
        } else {
            FileAttachmentLocalServiceUtil.updateFileAttachment(this);
        }
    }

    @Override
    public FileAttachment toEscapedModel() {
        return (FileAttachment) ProxyUtil.newProxyInstance(FileAttachment.class.getClassLoader(),
            new Class[] { FileAttachment.class },
            new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        FileAttachmentClp clone = new FileAttachmentClp();

        clone.setF_id(getF_id());
        clone.setGroupId(getGroupId());
        clone.setCompanyId(getCompanyId());
        clone.setUserId(getUserId());
        clone.setCreateDate(getCreateDate());
        clone.setModifiedDate(getModifiedDate());
        clone.setC_id(getC_id());
        clone.setName(getName());
        clone.setFile_type(getFile_type());
        clone.setSize(getSize());
        clone.setContent(getContent());
        clone.setAttachment_type(getAttachment_type());

        return clone;
    }

    @Override
    public int compareTo(FileAttachment fileAttachment) {
        long primaryKey = fileAttachment.getPrimaryKey();

        if (getPrimaryKey() < primaryKey) {
            return -1;
        } else if (getPrimaryKey() > primaryKey) {
            return 1;
        } else {
            return 0;
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof FileAttachmentClp)) {
            return false;
        }

        FileAttachmentClp fileAttachment = (FileAttachmentClp) obj;

        long primaryKey = fileAttachment.getPrimaryKey();

        if (getPrimaryKey() == primaryKey) {
            return true;
        } else {
            return false;
        }
    }

    public Class<?> getClpSerializerClass() {
        return _clpSerializerClass;
    }

    @Override
    public int hashCode() {
        return (int) getPrimaryKey();
    }

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(25);

        sb.append("{f_id=");
        sb.append(getF_id());
        sb.append(", groupId=");
        sb.append(getGroupId());
        sb.append(", companyId=");
        sb.append(getCompanyId());
        sb.append(", userId=");
        sb.append(getUserId());
        sb.append(", createDate=");
        sb.append(getCreateDate());
        sb.append(", modifiedDate=");
        sb.append(getModifiedDate());
        sb.append(", c_id=");
        sb.append(getC_id());
        sb.append(", name=");
        sb.append(getName());
        sb.append(", file_type=");
        sb.append(getFile_type());
        sb.append(", size=");
        sb.append(getSize());
        sb.append(", content=");
        sb.append(getContent());
        sb.append(", attachment_type=");
        sb.append(getAttachment_type());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(40);

        sb.append("<model><model-name>");
        sb.append("vn.com.ecopharma.hrm.model.FileAttachment");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>f_id</column-name><column-value><![CDATA[");
        sb.append(getF_id());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>groupId</column-name><column-value><![CDATA[");
        sb.append(getGroupId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>companyId</column-name><column-value><![CDATA[");
        sb.append(getCompanyId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>userId</column-name><column-value><![CDATA[");
        sb.append(getUserId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>createDate</column-name><column-value><![CDATA[");
        sb.append(getCreateDate());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>modifiedDate</column-name><column-value><![CDATA[");
        sb.append(getModifiedDate());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>c_id</column-name><column-value><![CDATA[");
        sb.append(getC_id());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>name</column-name><column-value><![CDATA[");
        sb.append(getName());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>file_type</column-name><column-value><![CDATA[");
        sb.append(getFile_type());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>size</column-name><column-value><![CDATA[");
        sb.append(getSize());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>content</column-name><column-value><![CDATA[");
        sb.append(getContent());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>attachment_type</column-name><column-value><![CDATA[");
        sb.append(getAttachment_type());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
