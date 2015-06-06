package vn.com.ecopharma.hrm.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.util.PortalUtil;

import vn.com.ecopharma.hrm.service.CandidateHistoryLocalServiceUtil;
import vn.com.ecopharma.hrm.service.ClpSerializer;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;


public class CandidateHistoryClp extends BaseModelImpl<CandidateHistory>
    implements CandidateHistory {
    private long _candidateHistoryId;
    private long _c_id;
    private long _v_id;
    private long _interviewId;
    private long _performed_by;
    private String _note;
    private String _interviewers;
    private String _action;
    private long _groupId;
    private long _companyId;
    private long _userId;
    private String _userUuid;
    private String _userName;
    private BaseModel<?> _candidateHistoryRemoteModel;
    private Class<?> _clpSerializerClass = vn.com.ecopharma.hrm.service.ClpSerializer.class;

    public CandidateHistoryClp() {
    }

    @Override
    public Class<?> getModelClass() {
        return CandidateHistory.class;
    }

    @Override
    public String getModelClassName() {
        return CandidateHistory.class.getName();
    }

    @Override
    public long getPrimaryKey() {
        return _candidateHistoryId;
    }

    @Override
    public void setPrimaryKey(long primaryKey) {
        setCandidateHistoryId(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _candidateHistoryId;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Long) primaryKeyObj).longValue());
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("candidateHistoryId", getCandidateHistoryId());
        attributes.put("c_id", getC_id());
        attributes.put("v_id", getV_id());
        attributes.put("interviewId", getInterviewId());
        attributes.put("performed_by", getPerformed_by());
        attributes.put("note", getNote());
        attributes.put("interviewers", getInterviewers());
        attributes.put("action", getAction());
        attributes.put("groupId", getGroupId());
        attributes.put("companyId", getCompanyId());
        attributes.put("userId", getUserId());
        attributes.put("userName", getUserName());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long candidateHistoryId = (Long) attributes.get("candidateHistoryId");

        if (candidateHistoryId != null) {
            setCandidateHistoryId(candidateHistoryId);
        }

        Long c_id = (Long) attributes.get("c_id");

        if (c_id != null) {
            setC_id(c_id);
        }

        Long v_id = (Long) attributes.get("v_id");

        if (v_id != null) {
            setV_id(v_id);
        }

        Long interviewId = (Long) attributes.get("interviewId");

        if (interviewId != null) {
            setInterviewId(interviewId);
        }

        Long performed_by = (Long) attributes.get("performed_by");

        if (performed_by != null) {
            setPerformed_by(performed_by);
        }

        String note = (String) attributes.get("note");

        if (note != null) {
            setNote(note);
        }

        String interviewers = (String) attributes.get("interviewers");

        if (interviewers != null) {
            setInterviewers(interviewers);
        }

        String action = (String) attributes.get("action");

        if (action != null) {
            setAction(action);
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
    }

    @Override
    public long getCandidateHistoryId() {
        return _candidateHistoryId;
    }

    @Override
    public void setCandidateHistoryId(long candidateHistoryId) {
        _candidateHistoryId = candidateHistoryId;

        if (_candidateHistoryRemoteModel != null) {
            try {
                Class<?> clazz = _candidateHistoryRemoteModel.getClass();

                Method method = clazz.getMethod("setCandidateHistoryId",
                        long.class);

                method.invoke(_candidateHistoryRemoteModel, candidateHistoryId);
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

        if (_candidateHistoryRemoteModel != null) {
            try {
                Class<?> clazz = _candidateHistoryRemoteModel.getClass();

                Method method = clazz.getMethod("setC_id", long.class);

                method.invoke(_candidateHistoryRemoteModel, c_id);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getV_id() {
        return _v_id;
    }

    @Override
    public void setV_id(long v_id) {
        _v_id = v_id;

        if (_candidateHistoryRemoteModel != null) {
            try {
                Class<?> clazz = _candidateHistoryRemoteModel.getClass();

                Method method = clazz.getMethod("setV_id", long.class);

                method.invoke(_candidateHistoryRemoteModel, v_id);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getInterviewId() {
        return _interviewId;
    }

    @Override
    public void setInterviewId(long interviewId) {
        _interviewId = interviewId;

        if (_candidateHistoryRemoteModel != null) {
            try {
                Class<?> clazz = _candidateHistoryRemoteModel.getClass();

                Method method = clazz.getMethod("setInterviewId", long.class);

                method.invoke(_candidateHistoryRemoteModel, interviewId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getPerformed_by() {
        return _performed_by;
    }

    @Override
    public void setPerformed_by(long performed_by) {
        _performed_by = performed_by;

        if (_candidateHistoryRemoteModel != null) {
            try {
                Class<?> clazz = _candidateHistoryRemoteModel.getClass();

                Method method = clazz.getMethod("setPerformed_by", long.class);

                method.invoke(_candidateHistoryRemoteModel, performed_by);
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

        if (_candidateHistoryRemoteModel != null) {
            try {
                Class<?> clazz = _candidateHistoryRemoteModel.getClass();

                Method method = clazz.getMethod("setNote", String.class);

                method.invoke(_candidateHistoryRemoteModel, note);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getInterviewers() {
        return _interviewers;
    }

    @Override
    public void setInterviewers(String interviewers) {
        _interviewers = interviewers;

        if (_candidateHistoryRemoteModel != null) {
            try {
                Class<?> clazz = _candidateHistoryRemoteModel.getClass();

                Method method = clazz.getMethod("setInterviewers", String.class);

                method.invoke(_candidateHistoryRemoteModel, interviewers);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getAction() {
        return _action;
    }

    @Override
    public void setAction(String action) {
        _action = action;

        if (_candidateHistoryRemoteModel != null) {
            try {
                Class<?> clazz = _candidateHistoryRemoteModel.getClass();

                Method method = clazz.getMethod("setAction", String.class);

                method.invoke(_candidateHistoryRemoteModel, action);
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

        if (_candidateHistoryRemoteModel != null) {
            try {
                Class<?> clazz = _candidateHistoryRemoteModel.getClass();

                Method method = clazz.getMethod("setGroupId", long.class);

                method.invoke(_candidateHistoryRemoteModel, groupId);
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

        if (_candidateHistoryRemoteModel != null) {
            try {
                Class<?> clazz = _candidateHistoryRemoteModel.getClass();

                Method method = clazz.getMethod("setCompanyId", long.class);

                method.invoke(_candidateHistoryRemoteModel, companyId);
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

        if (_candidateHistoryRemoteModel != null) {
            try {
                Class<?> clazz = _candidateHistoryRemoteModel.getClass();

                Method method = clazz.getMethod("setUserId", long.class);

                method.invoke(_candidateHistoryRemoteModel, userId);
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

        if (_candidateHistoryRemoteModel != null) {
            try {
                Class<?> clazz = _candidateHistoryRemoteModel.getClass();

                Method method = clazz.getMethod("setUserName", String.class);

                method.invoke(_candidateHistoryRemoteModel, userName);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public BaseModel<?> getCandidateHistoryRemoteModel() {
        return _candidateHistoryRemoteModel;
    }

    public void setCandidateHistoryRemoteModel(
        BaseModel<?> candidateHistoryRemoteModel) {
        _candidateHistoryRemoteModel = candidateHistoryRemoteModel;
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

        Class<?> remoteModelClass = _candidateHistoryRemoteModel.getClass();

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

        Object returnValue = method.invoke(_candidateHistoryRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            CandidateHistoryLocalServiceUtil.addCandidateHistory(this);
        } else {
            CandidateHistoryLocalServiceUtil.updateCandidateHistory(this);
        }
    }

    @Override
    public CandidateHistory toEscapedModel() {
        return (CandidateHistory) ProxyUtil.newProxyInstance(CandidateHistory.class.getClassLoader(),
            new Class[] { CandidateHistory.class },
            new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        CandidateHistoryClp clone = new CandidateHistoryClp();

        clone.setCandidateHistoryId(getCandidateHistoryId());
        clone.setC_id(getC_id());
        clone.setV_id(getV_id());
        clone.setInterviewId(getInterviewId());
        clone.setPerformed_by(getPerformed_by());
        clone.setNote(getNote());
        clone.setInterviewers(getInterviewers());
        clone.setAction(getAction());
        clone.setGroupId(getGroupId());
        clone.setCompanyId(getCompanyId());
        clone.setUserId(getUserId());
        clone.setUserName(getUserName());

        return clone;
    }

    @Override
    public int compareTo(CandidateHistory candidateHistory) {
        long primaryKey = candidateHistory.getPrimaryKey();

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

        if (!(obj instanceof CandidateHistoryClp)) {
            return false;
        }

        CandidateHistoryClp candidateHistory = (CandidateHistoryClp) obj;

        long primaryKey = candidateHistory.getPrimaryKey();

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

        sb.append("{candidateHistoryId=");
        sb.append(getCandidateHistoryId());
        sb.append(", c_id=");
        sb.append(getC_id());
        sb.append(", v_id=");
        sb.append(getV_id());
        sb.append(", interviewId=");
        sb.append(getInterviewId());
        sb.append(", performed_by=");
        sb.append(getPerformed_by());
        sb.append(", note=");
        sb.append(getNote());
        sb.append(", interviewers=");
        sb.append(getInterviewers());
        sb.append(", action=");
        sb.append(getAction());
        sb.append(", groupId=");
        sb.append(getGroupId());
        sb.append(", companyId=");
        sb.append(getCompanyId());
        sb.append(", userId=");
        sb.append(getUserId());
        sb.append(", userName=");
        sb.append(getUserName());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(40);

        sb.append("<model><model-name>");
        sb.append("vn.com.ecopharma.hrm.model.CandidateHistory");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>candidateHistoryId</column-name><column-value><![CDATA[");
        sb.append(getCandidateHistoryId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>c_id</column-name><column-value><![CDATA[");
        sb.append(getC_id());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>v_id</column-name><column-value><![CDATA[");
        sb.append(getV_id());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>interviewId</column-name><column-value><![CDATA[");
        sb.append(getInterviewId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>performed_by</column-name><column-value><![CDATA[");
        sb.append(getPerformed_by());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>note</column-name><column-value><![CDATA[");
        sb.append(getNote());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>interviewers</column-name><column-value><![CDATA[");
        sb.append(getInterviewers());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>action</column-name><column-value><![CDATA[");
        sb.append(getAction());
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

        sb.append("</model>");

        return sb.toString();
    }
}
