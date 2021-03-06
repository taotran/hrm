package vn.com.ecopharma.hrm.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.util.PortalUtil;

import vn.com.ecopharma.hrm.service.ClpSerializer;
import vn.com.ecopharma.hrm.service.Employee_TitlesLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;


public class Employee_TitlesClp extends BaseModelImpl<Employee_Titles>
    implements Employee_Titles {
    private long _employee_TitlesId;
    private long _employeeId;
    private long _titlesId;
    private Date _set_date;
    private String _note;
    private long _groupId;
    private long _companyId;
    private long _userId;
    private String _userUuid;
    private Date _createDate;
    private Date _modifiedDate;
    private BaseModel<?> _employee_TitlesRemoteModel;
    private Class<?> _clpSerializerClass = vn.com.ecopharma.hrm.service.ClpSerializer.class;

    public Employee_TitlesClp() {
    }

    @Override
    public Class<?> getModelClass() {
        return Employee_Titles.class;
    }

    @Override
    public String getModelClassName() {
        return Employee_Titles.class.getName();
    }

    @Override
    public long getPrimaryKey() {
        return _employee_TitlesId;
    }

    @Override
    public void setPrimaryKey(long primaryKey) {
        setEmployee_TitlesId(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _employee_TitlesId;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Long) primaryKeyObj).longValue());
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("employee_TitlesId", getEmployee_TitlesId());
        attributes.put("employeeId", getEmployeeId());
        attributes.put("titlesId", getTitlesId());
        attributes.put("set_date", getSet_date());
        attributes.put("note", getNote());
        attributes.put("groupId", getGroupId());
        attributes.put("companyId", getCompanyId());
        attributes.put("userId", getUserId());
        attributes.put("createDate", getCreateDate());
        attributes.put("modifiedDate", getModifiedDate());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long employee_TitlesId = (Long) attributes.get("employee_TitlesId");

        if (employee_TitlesId != null) {
            setEmployee_TitlesId(employee_TitlesId);
        }

        Long employeeId = (Long) attributes.get("employeeId");

        if (employeeId != null) {
            setEmployeeId(employeeId);
        }

        Long titlesId = (Long) attributes.get("titlesId");

        if (titlesId != null) {
            setTitlesId(titlesId);
        }

        Date set_date = (Date) attributes.get("set_date");

        if (set_date != null) {
            setSet_date(set_date);
        }

        String note = (String) attributes.get("note");

        if (note != null) {
            setNote(note);
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
    public long getEmployee_TitlesId() {
        return _employee_TitlesId;
    }

    @Override
    public void setEmployee_TitlesId(long employee_TitlesId) {
        _employee_TitlesId = employee_TitlesId;

        if (_employee_TitlesRemoteModel != null) {
            try {
                Class<?> clazz = _employee_TitlesRemoteModel.getClass();

                Method method = clazz.getMethod("setEmployee_TitlesId",
                        long.class);

                method.invoke(_employee_TitlesRemoteModel, employee_TitlesId);
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

        if (_employee_TitlesRemoteModel != null) {
            try {
                Class<?> clazz = _employee_TitlesRemoteModel.getClass();

                Method method = clazz.getMethod("setEmployeeId", long.class);

                method.invoke(_employee_TitlesRemoteModel, employeeId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getTitlesId() {
        return _titlesId;
    }

    @Override
    public void setTitlesId(long titlesId) {
        _titlesId = titlesId;

        if (_employee_TitlesRemoteModel != null) {
            try {
                Class<?> clazz = _employee_TitlesRemoteModel.getClass();

                Method method = clazz.getMethod("setTitlesId", long.class);

                method.invoke(_employee_TitlesRemoteModel, titlesId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public Date getSet_date() {
        return _set_date;
    }

    @Override
    public void setSet_date(Date set_date) {
        _set_date = set_date;

        if (_employee_TitlesRemoteModel != null) {
            try {
                Class<?> clazz = _employee_TitlesRemoteModel.getClass();

                Method method = clazz.getMethod("setSet_date", Date.class);

                method.invoke(_employee_TitlesRemoteModel, set_date);
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

        if (_employee_TitlesRemoteModel != null) {
            try {
                Class<?> clazz = _employee_TitlesRemoteModel.getClass();

                Method method = clazz.getMethod("setNote", String.class);

                method.invoke(_employee_TitlesRemoteModel, note);
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

        if (_employee_TitlesRemoteModel != null) {
            try {
                Class<?> clazz = _employee_TitlesRemoteModel.getClass();

                Method method = clazz.getMethod("setGroupId", long.class);

                method.invoke(_employee_TitlesRemoteModel, groupId);
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

        if (_employee_TitlesRemoteModel != null) {
            try {
                Class<?> clazz = _employee_TitlesRemoteModel.getClass();

                Method method = clazz.getMethod("setCompanyId", long.class);

                method.invoke(_employee_TitlesRemoteModel, companyId);
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

        if (_employee_TitlesRemoteModel != null) {
            try {
                Class<?> clazz = _employee_TitlesRemoteModel.getClass();

                Method method = clazz.getMethod("setUserId", long.class);

                method.invoke(_employee_TitlesRemoteModel, userId);
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

        if (_employee_TitlesRemoteModel != null) {
            try {
                Class<?> clazz = _employee_TitlesRemoteModel.getClass();

                Method method = clazz.getMethod("setCreateDate", Date.class);

                method.invoke(_employee_TitlesRemoteModel, createDate);
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

        if (_employee_TitlesRemoteModel != null) {
            try {
                Class<?> clazz = _employee_TitlesRemoteModel.getClass();

                Method method = clazz.getMethod("setModifiedDate", Date.class);

                method.invoke(_employee_TitlesRemoteModel, modifiedDate);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public BaseModel<?> getEmployee_TitlesRemoteModel() {
        return _employee_TitlesRemoteModel;
    }

    public void setEmployee_TitlesRemoteModel(
        BaseModel<?> employee_TitlesRemoteModel) {
        _employee_TitlesRemoteModel = employee_TitlesRemoteModel;
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

        Class<?> remoteModelClass = _employee_TitlesRemoteModel.getClass();

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

        Object returnValue = method.invoke(_employee_TitlesRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            Employee_TitlesLocalServiceUtil.addEmployee_Titles(this);
        } else {
            Employee_TitlesLocalServiceUtil.updateEmployee_Titles(this);
        }
    }

    @Override
    public Employee_Titles toEscapedModel() {
        return (Employee_Titles) ProxyUtil.newProxyInstance(Employee_Titles.class.getClassLoader(),
            new Class[] { Employee_Titles.class },
            new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        Employee_TitlesClp clone = new Employee_TitlesClp();

        clone.setEmployee_TitlesId(getEmployee_TitlesId());
        clone.setEmployeeId(getEmployeeId());
        clone.setTitlesId(getTitlesId());
        clone.setSet_date(getSet_date());
        clone.setNote(getNote());
        clone.setGroupId(getGroupId());
        clone.setCompanyId(getCompanyId());
        clone.setUserId(getUserId());
        clone.setCreateDate(getCreateDate());
        clone.setModifiedDate(getModifiedDate());

        return clone;
    }

    @Override
    public int compareTo(Employee_Titles employee_Titles) {
        long primaryKey = employee_Titles.getPrimaryKey();

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

        if (!(obj instanceof Employee_TitlesClp)) {
            return false;
        }

        Employee_TitlesClp employee_Titles = (Employee_TitlesClp) obj;

        long primaryKey = employee_Titles.getPrimaryKey();

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

        sb.append("{employee_TitlesId=");
        sb.append(getEmployee_TitlesId());
        sb.append(", employeeId=");
        sb.append(getEmployeeId());
        sb.append(", titlesId=");
        sb.append(getTitlesId());
        sb.append(", set_date=");
        sb.append(getSet_date());
        sb.append(", note=");
        sb.append(getNote());
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
        StringBundler sb = new StringBundler(34);

        sb.append("<model><model-name>");
        sb.append("vn.com.ecopharma.hrm.model.Employee_Titles");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>employee_TitlesId</column-name><column-value><![CDATA[");
        sb.append(getEmployee_TitlesId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>employeeId</column-name><column-value><![CDATA[");
        sb.append(getEmployeeId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>titlesId</column-name><column-value><![CDATA[");
        sb.append(getTitlesId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>set_date</column-name><column-value><![CDATA[");
        sb.append(getSet_date());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>note</column-name><column-value><![CDATA[");
        sb.append(getNote());
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
