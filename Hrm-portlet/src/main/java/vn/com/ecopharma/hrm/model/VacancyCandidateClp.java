package vn.com.ecopharma.hrm.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.util.PortalUtil;

import vn.com.ecopharma.hrm.service.ClpSerializer;
import vn.com.ecopharma.hrm.service.VacancyCandidateLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;


public class VacancyCandidateClp extends BaseModelImpl<VacancyCandidate>
    implements VacancyCandidate {
    private long _vacancyCandidateId;
    private long _c_id;
    private long _v_id;
    private long _groupId;
    private long _companyId;
    private long _userId;
    private String _userUuid;
    private Date _createDate;
    private Date _modifiedDate;
    private String _vc_status;
    private BaseModel<?> _vacancyCandidateRemoteModel;
    private Class<?> _clpSerializerClass = vn.com.ecopharma.hrm.service.ClpSerializer.class;

    public VacancyCandidateClp() {
    }

    @Override
    public Class<?> getModelClass() {
        return VacancyCandidate.class;
    }

    @Override
    public String getModelClassName() {
        return VacancyCandidate.class.getName();
    }

    @Override
    public long getPrimaryKey() {
        return _vacancyCandidateId;
    }

    @Override
    public void setPrimaryKey(long primaryKey) {
        setVacancyCandidateId(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _vacancyCandidateId;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Long) primaryKeyObj).longValue());
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("vacancyCandidateId", getVacancyCandidateId());
        attributes.put("c_id", getC_id());
        attributes.put("v_id", getV_id());
        attributes.put("groupId", getGroupId());
        attributes.put("companyId", getCompanyId());
        attributes.put("userId", getUserId());
        attributes.put("createDate", getCreateDate());
        attributes.put("modifiedDate", getModifiedDate());
        attributes.put("vc_status", getVc_status());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long vacancyCandidateId = (Long) attributes.get("vacancyCandidateId");

        if (vacancyCandidateId != null) {
            setVacancyCandidateId(vacancyCandidateId);
        }

        Long c_id = (Long) attributes.get("c_id");

        if (c_id != null) {
            setC_id(c_id);
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

        String vc_status = (String) attributes.get("vc_status");

        if (vc_status != null) {
            setVc_status(vc_status);
        }
    }

    @Override
    public long getVacancyCandidateId() {
        return _vacancyCandidateId;
    }

    @Override
    public void setVacancyCandidateId(long vacancyCandidateId) {
        _vacancyCandidateId = vacancyCandidateId;

        if (_vacancyCandidateRemoteModel != null) {
            try {
                Class<?> clazz = _vacancyCandidateRemoteModel.getClass();

                Method method = clazz.getMethod("setVacancyCandidateId",
                        long.class);

                method.invoke(_vacancyCandidateRemoteModel, vacancyCandidateId);
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

        if (_vacancyCandidateRemoteModel != null) {
            try {
                Class<?> clazz = _vacancyCandidateRemoteModel.getClass();

                Method method = clazz.getMethod("setC_id", long.class);

                method.invoke(_vacancyCandidateRemoteModel, c_id);
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

        if (_vacancyCandidateRemoteModel != null) {
            try {
                Class<?> clazz = _vacancyCandidateRemoteModel.getClass();

                Method method = clazz.getMethod("setV_id", long.class);

                method.invoke(_vacancyCandidateRemoteModel, v_id);
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

        if (_vacancyCandidateRemoteModel != null) {
            try {
                Class<?> clazz = _vacancyCandidateRemoteModel.getClass();

                Method method = clazz.getMethod("setGroupId", long.class);

                method.invoke(_vacancyCandidateRemoteModel, groupId);
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

        if (_vacancyCandidateRemoteModel != null) {
            try {
                Class<?> clazz = _vacancyCandidateRemoteModel.getClass();

                Method method = clazz.getMethod("setCompanyId", long.class);

                method.invoke(_vacancyCandidateRemoteModel, companyId);
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

        if (_vacancyCandidateRemoteModel != null) {
            try {
                Class<?> clazz = _vacancyCandidateRemoteModel.getClass();

                Method method = clazz.getMethod("setUserId", long.class);

                method.invoke(_vacancyCandidateRemoteModel, userId);
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

        if (_vacancyCandidateRemoteModel != null) {
            try {
                Class<?> clazz = _vacancyCandidateRemoteModel.getClass();

                Method method = clazz.getMethod("setCreateDate", Date.class);

                method.invoke(_vacancyCandidateRemoteModel, createDate);
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

        if (_vacancyCandidateRemoteModel != null) {
            try {
                Class<?> clazz = _vacancyCandidateRemoteModel.getClass();

                Method method = clazz.getMethod("setModifiedDate", Date.class);

                method.invoke(_vacancyCandidateRemoteModel, modifiedDate);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getVc_status() {
        return _vc_status;
    }

    @Override
    public void setVc_status(String vc_status) {
        _vc_status = vc_status;

        if (_vacancyCandidateRemoteModel != null) {
            try {
                Class<?> clazz = _vacancyCandidateRemoteModel.getClass();

                Method method = clazz.getMethod("setVc_status", String.class);

                method.invoke(_vacancyCandidateRemoteModel, vc_status);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public BaseModel<?> getVacancyCandidateRemoteModel() {
        return _vacancyCandidateRemoteModel;
    }

    public void setVacancyCandidateRemoteModel(
        BaseModel<?> vacancyCandidateRemoteModel) {
        _vacancyCandidateRemoteModel = vacancyCandidateRemoteModel;
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

        Class<?> remoteModelClass = _vacancyCandidateRemoteModel.getClass();

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

        Object returnValue = method.invoke(_vacancyCandidateRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            VacancyCandidateLocalServiceUtil.addVacancyCandidate(this);
        } else {
            VacancyCandidateLocalServiceUtil.updateVacancyCandidate(this);
        }
    }

    @Override
    public VacancyCandidate toEscapedModel() {
        return (VacancyCandidate) ProxyUtil.newProxyInstance(VacancyCandidate.class.getClassLoader(),
            new Class[] { VacancyCandidate.class },
            new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        VacancyCandidateClp clone = new VacancyCandidateClp();

        clone.setVacancyCandidateId(getVacancyCandidateId());
        clone.setC_id(getC_id());
        clone.setV_id(getV_id());
        clone.setGroupId(getGroupId());
        clone.setCompanyId(getCompanyId());
        clone.setUserId(getUserId());
        clone.setCreateDate(getCreateDate());
        clone.setModifiedDate(getModifiedDate());
        clone.setVc_status(getVc_status());

        return clone;
    }

    @Override
    public int compareTo(VacancyCandidate vacancyCandidate) {
        long primaryKey = vacancyCandidate.getPrimaryKey();

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

        if (!(obj instanceof VacancyCandidateClp)) {
            return false;
        }

        VacancyCandidateClp vacancyCandidate = (VacancyCandidateClp) obj;

        long primaryKey = vacancyCandidate.getPrimaryKey();

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

        sb.append("{vacancyCandidateId=");
        sb.append(getVacancyCandidateId());
        sb.append(", c_id=");
        sb.append(getC_id());
        sb.append(", v_id=");
        sb.append(getV_id());
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
        sb.append(", vc_status=");
        sb.append(getVc_status());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(31);

        sb.append("<model><model-name>");
        sb.append("vn.com.ecopharma.hrm.model.VacancyCandidate");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>vacancyCandidateId</column-name><column-value><![CDATA[");
        sb.append(getVacancyCandidateId());
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
            "<column><column-name>vc_status</column-name><column-value><![CDATA[");
        sb.append(getVc_status());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
