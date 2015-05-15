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

import com.liferay.portlet.trash.model.TrashEntry;
import com.liferay.portlet.trash.service.TrashEntryLocalServiceUtil;

import vn.com.ecopharma.hrm.service.ClpSerializer;
import vn.com.ecopharma.hrm.service.JTitleLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;


public class JTitleClp extends BaseModelImpl<JTitle> implements JTitle {
    private long _jobtitleId;
    private String _title;
    private String _description;
    private String _note;
    private boolean _isDeleted;
    private BaseModel<?> _jTitleRemoteModel;
    private Class<?> _clpSerializerClass = vn.com.ecopharma.hrm.service.ClpSerializer.class;

    public JTitleClp() {
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
    public long getPrimaryKey() {
        return _jobtitleId;
    }

    @Override
    public void setPrimaryKey(long primaryKey) {
        setJobtitleId(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _jobtitleId;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Long) primaryKeyObj).longValue());
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("jobtitleId", getJobtitleId());
        attributes.put("title", getTitle());
        attributes.put("description", getDescription());
        attributes.put("note", getNote());
        attributes.put("isDeleted", getIsDeleted());

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
    }

    @Override
    public long getJobtitleId() {
        return _jobtitleId;
    }

    @Override
    public void setJobtitleId(long jobtitleId) {
        _jobtitleId = jobtitleId;

        if (_jTitleRemoteModel != null) {
            try {
                Class<?> clazz = _jTitleRemoteModel.getClass();

                Method method = clazz.getMethod("setJobtitleId", long.class);

                method.invoke(_jTitleRemoteModel, jobtitleId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getTitle() {
        return _title;
    }

    @Override
    public void setTitle(String title) {
        _title = title;

        if (_jTitleRemoteModel != null) {
            try {
                Class<?> clazz = _jTitleRemoteModel.getClass();

                Method method = clazz.getMethod("setTitle", String.class);

                method.invoke(_jTitleRemoteModel, title);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getDescription() {
        return _description;
    }

    @Override
    public void setDescription(String description) {
        _description = description;

        if (_jTitleRemoteModel != null) {
            try {
                Class<?> clazz = _jTitleRemoteModel.getClass();

                Method method = clazz.getMethod("setDescription", String.class);

                method.invoke(_jTitleRemoteModel, description);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getNote() {
        return _note;
    }

    @Override
    public void setNote(String note) {
        _note = note;

        if (_jTitleRemoteModel != null) {
            try {
                Class<?> clazz = _jTitleRemoteModel.getClass();

                Method method = clazz.getMethod("setNote", String.class);

                method.invoke(_jTitleRemoteModel, note);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public boolean getIsDeleted() {
        return _isDeleted;
    }

    @Override
    public boolean isIsDeleted() {
        return _isDeleted;
    }

    @Override
    public void setIsDeleted(boolean isDeleted) {
        _isDeleted = isDeleted;

        if (_jTitleRemoteModel != null) {
            try {
                Class<?> clazz = _jTitleRemoteModel.getClass();

                Method method = clazz.getMethod("setIsDeleted", boolean.class);

                method.invoke(_jTitleRemoteModel, isDeleted);
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

    public BaseModel<?> getJTitleRemoteModel() {
        return _jTitleRemoteModel;
    }

    public void setJTitleRemoteModel(BaseModel<?> jTitleRemoteModel) {
        _jTitleRemoteModel = jTitleRemoteModel;
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

        Class<?> remoteModelClass = _jTitleRemoteModel.getClass();

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

        Object returnValue = method.invoke(_jTitleRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            JTitleLocalServiceUtil.addJTitle(this);
        } else {
            JTitleLocalServiceUtil.updateJTitle(this);
        }
    }

    @Override
    public JTitle toEscapedModel() {
        return (JTitle) ProxyUtil.newProxyInstance(JTitle.class.getClassLoader(),
            new Class[] { JTitle.class }, new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        JTitleClp clone = new JTitleClp();

        clone.setJobtitleId(getJobtitleId());
        clone.setTitle(getTitle());
        clone.setDescription(getDescription());
        clone.setNote(getNote());
        clone.setIsDeleted(getIsDeleted());

        return clone;
    }

    @Override
    public int compareTo(JTitle jTitle) {
        long primaryKey = jTitle.getPrimaryKey();

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

        if (!(obj instanceof JTitleClp)) {
            return false;
        }

        JTitleClp jTitle = (JTitleClp) obj;

        long primaryKey = jTitle.getPrimaryKey();

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
        StringBundler sb = new StringBundler(11);

        sb.append("{jobtitleId=");
        sb.append(getJobtitleId());
        sb.append(", title=");
        sb.append(getTitle());
        sb.append(", description=");
        sb.append(getDescription());
        sb.append(", note=");
        sb.append(getNote());
        sb.append(", isDeleted=");
        sb.append(getIsDeleted());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(19);

        sb.append("<model><model-name>");
        sb.append("vn.com.ecopharma.hrm.model.JTitle");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>jobtitleId</column-name><column-value><![CDATA[");
        sb.append(getJobtitleId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>title</column-name><column-value><![CDATA[");
        sb.append(getTitle());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>description</column-name><column-value><![CDATA[");
        sb.append(getDescription());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>note</column-name><column-value><![CDATA[");
        sb.append(getNote());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>isDeleted</column-name><column-value><![CDATA[");
        sb.append(getIsDeleted());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
