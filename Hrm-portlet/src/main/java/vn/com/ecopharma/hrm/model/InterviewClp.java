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
import vn.com.ecopharma.hrm.service.InterviewLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;


public class InterviewClp extends BaseModelImpl<Interview> implements Interview {
    private long _interviewId;
    private long _groupId;
    private long _companyId;
    private long _userId;
    private String _userUuid;
    private String _userName;
    private Date _createDate;
    private Date _modifiedDate;
    private String _name;
    private Date _interview_date;
    private String _interview_time;
    private BaseModel<?> _interviewRemoteModel;
    private Class<?> _clpSerializerClass = vn.com.ecopharma.hrm.service.ClpSerializer.class;

    public InterviewClp() {
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
    public long getPrimaryKey() {
        return _interviewId;
    }

    @Override
    public void setPrimaryKey(long primaryKey) {
        setInterviewId(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _interviewId;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Long) primaryKeyObj).longValue());
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

    @Override
    public long getInterviewId() {
        return _interviewId;
    }

    @Override
    public void setInterviewId(long interviewId) {
        _interviewId = interviewId;

        if (_interviewRemoteModel != null) {
            try {
                Class<?> clazz = _interviewRemoteModel.getClass();

                Method method = clazz.getMethod("setInterviewId", long.class);

                method.invoke(_interviewRemoteModel, interviewId);
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

        if (_interviewRemoteModel != null) {
            try {
                Class<?> clazz = _interviewRemoteModel.getClass();

                Method method = clazz.getMethod("setGroupId", long.class);

                method.invoke(_interviewRemoteModel, groupId);
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

        if (_interviewRemoteModel != null) {
            try {
                Class<?> clazz = _interviewRemoteModel.getClass();

                Method method = clazz.getMethod("setCompanyId", long.class);

                method.invoke(_interviewRemoteModel, companyId);
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

        if (_interviewRemoteModel != null) {
            try {
                Class<?> clazz = _interviewRemoteModel.getClass();

                Method method = clazz.getMethod("setUserId", long.class);

                method.invoke(_interviewRemoteModel, userId);
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
    public String getUserName() {
        return _userName;
    }

    @Override
    public void setUserName(String userName) {
        _userName = userName;

        if (_interviewRemoteModel != null) {
            try {
                Class<?> clazz = _interviewRemoteModel.getClass();

                Method method = clazz.getMethod("setUserName", String.class);

                method.invoke(_interviewRemoteModel, userName);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public Date getCreateDate() {
        return _createDate;
    }

    @Override
    public void setCreateDate(Date createDate) {
        _createDate = createDate;

        if (_interviewRemoteModel != null) {
            try {
                Class<?> clazz = _interviewRemoteModel.getClass();

                Method method = clazz.getMethod("setCreateDate", Date.class);

                method.invoke(_interviewRemoteModel, createDate);
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

        if (_interviewRemoteModel != null) {
            try {
                Class<?> clazz = _interviewRemoteModel.getClass();

                Method method = clazz.getMethod("setModifiedDate", Date.class);

                method.invoke(_interviewRemoteModel, modifiedDate);
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

        if (_interviewRemoteModel != null) {
            try {
                Class<?> clazz = _interviewRemoteModel.getClass();

                Method method = clazz.getMethod("setName", String.class);

                method.invoke(_interviewRemoteModel, name);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public Date getInterview_date() {
        return _interview_date;
    }

    @Override
    public void setInterview_date(Date interview_date) {
        _interview_date = interview_date;

        if (_interviewRemoteModel != null) {
            try {
                Class<?> clazz = _interviewRemoteModel.getClass();

                Method method = clazz.getMethod("setInterview_date", Date.class);

                method.invoke(_interviewRemoteModel, interview_date);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getInterview_time() {
        return _interview_time;
    }

    @Override
    public void setInterview_time(String interview_time) {
        _interview_time = interview_time;

        if (_interviewRemoteModel != null) {
            try {
                Class<?> clazz = _interviewRemoteModel.getClass();

                Method method = clazz.getMethod("setInterview_time",
                        String.class);

                method.invoke(_interviewRemoteModel, interview_time);
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

    public BaseModel<?> getInterviewRemoteModel() {
        return _interviewRemoteModel;
    }

    public void setInterviewRemoteModel(BaseModel<?> interviewRemoteModel) {
        _interviewRemoteModel = interviewRemoteModel;
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

        Class<?> remoteModelClass = _interviewRemoteModel.getClass();

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

        Object returnValue = method.invoke(_interviewRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            InterviewLocalServiceUtil.addInterview(this);
        } else {
            InterviewLocalServiceUtil.updateInterview(this);
        }
    }

    @Override
    public Interview toEscapedModel() {
        return (Interview) ProxyUtil.newProxyInstance(Interview.class.getClassLoader(),
            new Class[] { Interview.class }, new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        InterviewClp clone = new InterviewClp();

        clone.setInterviewId(getInterviewId());
        clone.setGroupId(getGroupId());
        clone.setCompanyId(getCompanyId());
        clone.setUserId(getUserId());
        clone.setUserName(getUserName());
        clone.setCreateDate(getCreateDate());
        clone.setModifiedDate(getModifiedDate());
        clone.setName(getName());
        clone.setInterview_date(getInterview_date());
        clone.setInterview_time(getInterview_time());

        return clone;
    }

    @Override
    public int compareTo(Interview interview) {
        long primaryKey = interview.getPrimaryKey();

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

        if (!(obj instanceof InterviewClp)) {
            return false;
        }

        InterviewClp interview = (InterviewClp) obj;

        long primaryKey = interview.getPrimaryKey();

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
        StringBundler sb = new StringBundler(21);

        sb.append("{interviewId=");
        sb.append(getInterviewId());
        sb.append(", groupId=");
        sb.append(getGroupId());
        sb.append(", companyId=");
        sb.append(getCompanyId());
        sb.append(", userId=");
        sb.append(getUserId());
        sb.append(", userName=");
        sb.append(getUserName());
        sb.append(", createDate=");
        sb.append(getCreateDate());
        sb.append(", modifiedDate=");
        sb.append(getModifiedDate());
        sb.append(", name=");
        sb.append(getName());
        sb.append(", interview_date=");
        sb.append(getInterview_date());
        sb.append(", interview_time=");
        sb.append(getInterview_time());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(34);

        sb.append("<model><model-name>");
        sb.append("vn.com.ecopharma.hrm.model.Interview");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>interviewId</column-name><column-value><![CDATA[");
        sb.append(getInterviewId());
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
            "<column><column-name>userName</column-name><column-value><![CDATA[");
        sb.append(getUserName());
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
            "<column><column-name>name</column-name><column-value><![CDATA[");
        sb.append(getName());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>interview_date</column-name><column-value><![CDATA[");
        sb.append(getInterview_date());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>interview_time</column-name><column-value><![CDATA[");
        sb.append(getInterview_time());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
