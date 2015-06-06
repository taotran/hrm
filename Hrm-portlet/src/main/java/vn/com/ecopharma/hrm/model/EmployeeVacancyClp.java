package vn.com.ecopharma.hrm.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.util.PortalUtil;

import vn.com.ecopharma.hrm.service.ClpSerializer;
import vn.com.ecopharma.hrm.service.EmployeeVacancyLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;


public class EmployeeVacancyClp extends BaseModelImpl<EmployeeVacancy>
    implements EmployeeVacancy {
    private long _employeeVacancyId;
    private long _employeeId;
    private long _v_id;
    private long _groupId;
    private long _companyId;
    private long _userId;
    private String _userUuid;
    private Date _createDate;
    private Date _modifiedDate;
    private BaseModel<?> _employeeVacancyRemoteModel;
    private Class<?> _clpSerializerClass = vn.com.ecopharma.hrm.service.ClpSerializer.class;

    public EmployeeVacancyClp() {
    }

    @Override
    public Class<?> getModelClass() {
        return EmployeeVacancy.class;
    }

    @Override
    public String getModelClassName() {
        return EmployeeVacancy.class.getName();
    }

    @Override
    public long getPrimaryKey() {
        return _employeeVacancyId;
    }

    @Override
    public void setPrimaryKey(long primaryKey) {
        setEmployeeVacancyId(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _employeeVacancyId;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Long) primaryKeyObj).longValue());
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("employeeVacancyId", getEmployeeVacancyId());
        attributes.put("employeeId", getEmployeeId());
        attributes.put("v_id", getV_id());
        attributes.put("groupId", getGroupId());
        attributes.put("companyId", getCompanyId());
        attributes.put("userId", getUserId());
        attributes.put("createDate", getCreateDate());
        attributes.put("modifiedDate", getModifiedDate());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long employeeVacancyId = (Long) attributes.get("employeeVacancyId");

        if (employeeVacancyId != null) {
            setEmployeeVacancyId(employeeVacancyId);
        }

        Long employeeId = (Long) attributes.get("employeeId");

        if (employeeId != null) {
            setEmployeeId(employeeId);
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
    }

    @Override
    public long getEmployeeVacancyId() {
        return _employeeVacancyId;
    }

    @Override
    public void setEmployeeVacancyId(long employeeVacancyId) {
        _employeeVacancyId = employeeVacancyId;

        if (_employeeVacancyRemoteModel != null) {
            try {
                Class<?> clazz = _employeeVacancyRemoteModel.getClass();

                Method method = clazz.getMethod("setEmployeeVacancyId",
                        long.class);

                method.invoke(_employeeVacancyRemoteModel, employeeVacancyId);
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

        if (_employeeVacancyRemoteModel != null) {
            try {
                Class<?> clazz = _employeeVacancyRemoteModel.getClass();

                Method method = clazz.getMethod("setEmployeeId", long.class);

                method.invoke(_employeeVacancyRemoteModel, employeeId);
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

        if (_employeeVacancyRemoteModel != null) {
            try {
                Class<?> clazz = _employeeVacancyRemoteModel.getClass();

                Method method = clazz.getMethod("setV_id", long.class);

                method.invoke(_employeeVacancyRemoteModel, v_id);
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

        if (_employeeVacancyRemoteModel != null) {
            try {
                Class<?> clazz = _employeeVacancyRemoteModel.getClass();

                Method method = clazz.getMethod("setGroupId", long.class);

                method.invoke(_employeeVacancyRemoteModel, groupId);
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

        if (_employeeVacancyRemoteModel != null) {
            try {
                Class<?> clazz = _employeeVacancyRemoteModel.getClass();

                Method method = clazz.getMethod("setCompanyId", long.class);

                method.invoke(_employeeVacancyRemoteModel, companyId);
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

        if (_employeeVacancyRemoteModel != null) {
            try {
                Class<?> clazz = _employeeVacancyRemoteModel.getClass();

                Method method = clazz.getMethod("setUserId", long.class);

                method.invoke(_employeeVacancyRemoteModel, userId);
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

        if (_employeeVacancyRemoteModel != null) {
            try {
                Class<?> clazz = _employeeVacancyRemoteModel.getClass();

                Method method = clazz.getMethod("setCreateDate", Date.class);

                method.invoke(_employeeVacancyRemoteModel, createDate);
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

        if (_employeeVacancyRemoteModel != null) {
            try {
                Class<?> clazz = _employeeVacancyRemoteModel.getClass();

                Method method = clazz.getMethod("setModifiedDate", Date.class);

                method.invoke(_employeeVacancyRemoteModel, modifiedDate);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public BaseModel<?> getEmployeeVacancyRemoteModel() {
        return _employeeVacancyRemoteModel;
    }

    public void setEmployeeVacancyRemoteModel(
        BaseModel<?> employeeVacancyRemoteModel) {
        _employeeVacancyRemoteModel = employeeVacancyRemoteModel;
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

        Class<?> remoteModelClass = _employeeVacancyRemoteModel.getClass();

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

        Object returnValue = method.invoke(_employeeVacancyRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            EmployeeVacancyLocalServiceUtil.addEmployeeVacancy(this);
        } else {
            EmployeeVacancyLocalServiceUtil.updateEmployeeVacancy(this);
        }
    }

    @Override
    public EmployeeVacancy toEscapedModel() {
        return (EmployeeVacancy) ProxyUtil.newProxyInstance(EmployeeVacancy.class.getClassLoader(),
            new Class[] { EmployeeVacancy.class },
            new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        EmployeeVacancyClp clone = new EmployeeVacancyClp();

        clone.setEmployeeVacancyId(getEmployeeVacancyId());
        clone.setEmployeeId(getEmployeeId());
        clone.setV_id(getV_id());
        clone.setGroupId(getGroupId());
        clone.setCompanyId(getCompanyId());
        clone.setUserId(getUserId());
        clone.setCreateDate(getCreateDate());
        clone.setModifiedDate(getModifiedDate());

        return clone;
    }

    @Override
    public int compareTo(EmployeeVacancy employeeVacancy) {
        long primaryKey = employeeVacancy.getPrimaryKey();

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

        if (!(obj instanceof EmployeeVacancyClp)) {
            return false;
        }

        EmployeeVacancyClp employeeVacancy = (EmployeeVacancyClp) obj;

        long primaryKey = employeeVacancy.getPrimaryKey();

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
        StringBundler sb = new StringBundler(17);

        sb.append("{employeeVacancyId=");
        sb.append(getEmployeeVacancyId());
        sb.append(", employeeId=");
        sb.append(getEmployeeId());
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
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(28);

        sb.append("<model><model-name>");
        sb.append("vn.com.ecopharma.hrm.model.EmployeeVacancy");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>employeeVacancyId</column-name><column-value><![CDATA[");
        sb.append(getEmployeeVacancyId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>employeeId</column-name><column-value><![CDATA[");
        sb.append(getEmployeeId());
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

        sb.append("</model>");

        return sb.toString();
    }
}
