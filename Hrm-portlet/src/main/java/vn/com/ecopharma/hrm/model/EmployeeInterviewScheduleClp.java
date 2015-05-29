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
import vn.com.ecopharma.hrm.service.EmployeeInterviewScheduleLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;


public class EmployeeInterviewScheduleClp extends BaseModelImpl<EmployeeInterviewSchedule>
    implements EmployeeInterviewSchedule {
    private long _employeeInterviewScheduleId;
    private long _employeeId;
    private long _interviewScheduleId;
    private long _groupId;
    private long _companyId;
    private long _userId;
    private String _userUuid;
    private Date _createDate;
    private Date _modifiedDate;
    private String _note;
    private BaseModel<?> _employeeInterviewScheduleRemoteModel;
    private Class<?> _clpSerializerClass = vn.com.ecopharma.hrm.service.ClpSerializer.class;

    public EmployeeInterviewScheduleClp() {
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
    public long getPrimaryKey() {
        return _employeeInterviewScheduleId;
    }

    @Override
    public void setPrimaryKey(long primaryKey) {
        setEmployeeInterviewScheduleId(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _employeeInterviewScheduleId;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Long) primaryKeyObj).longValue());
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

    @Override
    public long getEmployeeInterviewScheduleId() {
        return _employeeInterviewScheduleId;
    }

    @Override
    public void setEmployeeInterviewScheduleId(long employeeInterviewScheduleId) {
        _employeeInterviewScheduleId = employeeInterviewScheduleId;

        if (_employeeInterviewScheduleRemoteModel != null) {
            try {
                Class<?> clazz = _employeeInterviewScheduleRemoteModel.getClass();

                Method method = clazz.getMethod("setEmployeeInterviewScheduleId",
                        long.class);

                method.invoke(_employeeInterviewScheduleRemoteModel,
                    employeeInterviewScheduleId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getEmployeeId() {
        return _employeeId;
    }

    @Override
    public void setEmployeeId(long employeeId) {
        _employeeId = employeeId;

        if (_employeeInterviewScheduleRemoteModel != null) {
            try {
                Class<?> clazz = _employeeInterviewScheduleRemoteModel.getClass();

                Method method = clazz.getMethod("setEmployeeId", long.class);

                method.invoke(_employeeInterviewScheduleRemoteModel, employeeId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getInterviewScheduleId() {
        return _interviewScheduleId;
    }

    @Override
    public void setInterviewScheduleId(long interviewScheduleId) {
        _interviewScheduleId = interviewScheduleId;

        if (_employeeInterviewScheduleRemoteModel != null) {
            try {
                Class<?> clazz = _employeeInterviewScheduleRemoteModel.getClass();

                Method method = clazz.getMethod("setInterviewScheduleId",
                        long.class);

                method.invoke(_employeeInterviewScheduleRemoteModel,
                    interviewScheduleId);
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

        if (_employeeInterviewScheduleRemoteModel != null) {
            try {
                Class<?> clazz = _employeeInterviewScheduleRemoteModel.getClass();

                Method method = clazz.getMethod("setGroupId", long.class);

                method.invoke(_employeeInterviewScheduleRemoteModel, groupId);
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

        if (_employeeInterviewScheduleRemoteModel != null) {
            try {
                Class<?> clazz = _employeeInterviewScheduleRemoteModel.getClass();

                Method method = clazz.getMethod("setCompanyId", long.class);

                method.invoke(_employeeInterviewScheduleRemoteModel, companyId);
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

        if (_employeeInterviewScheduleRemoteModel != null) {
            try {
                Class<?> clazz = _employeeInterviewScheduleRemoteModel.getClass();

                Method method = clazz.getMethod("setUserId", long.class);

                method.invoke(_employeeInterviewScheduleRemoteModel, userId);
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

        if (_employeeInterviewScheduleRemoteModel != null) {
            try {
                Class<?> clazz = _employeeInterviewScheduleRemoteModel.getClass();

                Method method = clazz.getMethod("setCreateDate", Date.class);

                method.invoke(_employeeInterviewScheduleRemoteModel, createDate);
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

        if (_employeeInterviewScheduleRemoteModel != null) {
            try {
                Class<?> clazz = _employeeInterviewScheduleRemoteModel.getClass();

                Method method = clazz.getMethod("setModifiedDate", Date.class);

                method.invoke(_employeeInterviewScheduleRemoteModel,
                    modifiedDate);
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

        if (_employeeInterviewScheduleRemoteModel != null) {
            try {
                Class<?> clazz = _employeeInterviewScheduleRemoteModel.getClass();

                Method method = clazz.getMethod("setNote", String.class);

                method.invoke(_employeeInterviewScheduleRemoteModel, note);
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

    public BaseModel<?> getEmployeeInterviewScheduleRemoteModel() {
        return _employeeInterviewScheduleRemoteModel;
    }

    public void setEmployeeInterviewScheduleRemoteModel(
        BaseModel<?> employeeInterviewScheduleRemoteModel) {
        _employeeInterviewScheduleRemoteModel = employeeInterviewScheduleRemoteModel;
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

        Class<?> remoteModelClass = _employeeInterviewScheduleRemoteModel.getClass();

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

        Object returnValue = method.invoke(_employeeInterviewScheduleRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            EmployeeInterviewScheduleLocalServiceUtil.addEmployeeInterviewSchedule(this);
        } else {
            EmployeeInterviewScheduleLocalServiceUtil.updateEmployeeInterviewSchedule(this);
        }
    }

    @Override
    public EmployeeInterviewSchedule toEscapedModel() {
        return (EmployeeInterviewSchedule) ProxyUtil.newProxyInstance(EmployeeInterviewSchedule.class.getClassLoader(),
            new Class[] { EmployeeInterviewSchedule.class },
            new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        EmployeeInterviewScheduleClp clone = new EmployeeInterviewScheduleClp();

        clone.setEmployeeInterviewScheduleId(getEmployeeInterviewScheduleId());
        clone.setEmployeeId(getEmployeeId());
        clone.setInterviewScheduleId(getInterviewScheduleId());
        clone.setGroupId(getGroupId());
        clone.setCompanyId(getCompanyId());
        clone.setUserId(getUserId());
        clone.setCreateDate(getCreateDate());
        clone.setModifiedDate(getModifiedDate());
        clone.setNote(getNote());

        return clone;
    }

    @Override
    public int compareTo(EmployeeInterviewSchedule employeeInterviewSchedule) {
        long primaryKey = employeeInterviewSchedule.getPrimaryKey();

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

        if (!(obj instanceof EmployeeInterviewScheduleClp)) {
            return false;
        }

        EmployeeInterviewScheduleClp employeeInterviewSchedule = (EmployeeInterviewScheduleClp) obj;

        long primaryKey = employeeInterviewSchedule.getPrimaryKey();

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
        StringBundler sb = new StringBundler(19);

        sb.append("{employeeInterviewScheduleId=");
        sb.append(getEmployeeInterviewScheduleId());
        sb.append(", employeeId=");
        sb.append(getEmployeeId());
        sb.append(", interviewScheduleId=");
        sb.append(getInterviewScheduleId());
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
        sb.append(", note=");
        sb.append(getNote());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(31);

        sb.append("<model><model-name>");
        sb.append("vn.com.ecopharma.hrm.model.EmployeeInterviewSchedule");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>employeeInterviewScheduleId</column-name><column-value><![CDATA[");
        sb.append(getEmployeeInterviewScheduleId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>employeeId</column-name><column-value><![CDATA[");
        sb.append(getEmployeeId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>interviewScheduleId</column-name><column-value><![CDATA[");
        sb.append(getInterviewScheduleId());
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
            "<column><column-name>note</column-name><column-value><![CDATA[");
        sb.append(getNote());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
