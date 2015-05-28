package vn.com.ecopharma.hrm.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.util.PortalUtil;

import vn.com.ecopharma.hrm.service.ClpSerializer;
import vn.com.ecopharma.hrm.service.LocationLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;


public class LocationClp extends BaseModelImpl<Location> implements Location {
    private long _locationId;
    private long _groupId;
    private long _companyId;
    private long _userId;
    private String _userUuid;
    private Date _createDate;
    private Date _modifiedDate;
    private String _type;
    private String _name;
    private String _country_code;
    private String _province;
    private String _city;
    private String _address;
    private String _zip_code;
    private String _phone;
    private String _fax;
    private String _note;
    private BaseModel<?> _locationRemoteModel;
    private Class<?> _clpSerializerClass = vn.com.ecopharma.hrm.service.ClpSerializer.class;

    public LocationClp() {
    }

    @Override
    public Class<?> getModelClass() {
        return Location.class;
    }

    @Override
    public String getModelClassName() {
        return Location.class.getName();
    }

    @Override
    public long getPrimaryKey() {
        return _locationId;
    }

    @Override
    public void setPrimaryKey(long primaryKey) {
        setLocationId(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _locationId;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Long) primaryKeyObj).longValue());
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("locationId", getLocationId());
        attributes.put("groupId", getGroupId());
        attributes.put("companyId", getCompanyId());
        attributes.put("userId", getUserId());
        attributes.put("createDate", getCreateDate());
        attributes.put("modifiedDate", getModifiedDate());
        attributes.put("type", getType());
        attributes.put("name", getName());
        attributes.put("country_code", getCountry_code());
        attributes.put("province", getProvince());
        attributes.put("city", getCity());
        attributes.put("address", getAddress());
        attributes.put("zip_code", getZip_code());
        attributes.put("phone", getPhone());
        attributes.put("fax", getFax());
        attributes.put("note", getNote());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long locationId = (Long) attributes.get("locationId");

        if (locationId != null) {
            setLocationId(locationId);
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

        String type = (String) attributes.get("type");

        if (type != null) {
            setType(type);
        }

        String name = (String) attributes.get("name");

        if (name != null) {
            setName(name);
        }

        String country_code = (String) attributes.get("country_code");

        if (country_code != null) {
            setCountry_code(country_code);
        }

        String province = (String) attributes.get("province");

        if (province != null) {
            setProvince(province);
        }

        String city = (String) attributes.get("city");

        if (city != null) {
            setCity(city);
        }

        String address = (String) attributes.get("address");

        if (address != null) {
            setAddress(address);
        }

        String zip_code = (String) attributes.get("zip_code");

        if (zip_code != null) {
            setZip_code(zip_code);
        }

        String phone = (String) attributes.get("phone");

        if (phone != null) {
            setPhone(phone);
        }

        String fax = (String) attributes.get("fax");

        if (fax != null) {
            setFax(fax);
        }

        String note = (String) attributes.get("note");

        if (note != null) {
            setNote(note);
        }
    }

    @Override
    public long getLocationId() {
        return _locationId;
    }

    @Override
    public void setLocationId(long locationId) {
        _locationId = locationId;

        if (_locationRemoteModel != null) {
            try {
                Class<?> clazz = _locationRemoteModel.getClass();

                Method method = clazz.getMethod("setLocationId", long.class);

                method.invoke(_locationRemoteModel, locationId);
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

        if (_locationRemoteModel != null) {
            try {
                Class<?> clazz = _locationRemoteModel.getClass();

                Method method = clazz.getMethod("setGroupId", long.class);

                method.invoke(_locationRemoteModel, groupId);
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

        if (_locationRemoteModel != null) {
            try {
                Class<?> clazz = _locationRemoteModel.getClass();

                Method method = clazz.getMethod("setCompanyId", long.class);

                method.invoke(_locationRemoteModel, companyId);
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

        if (_locationRemoteModel != null) {
            try {
                Class<?> clazz = _locationRemoteModel.getClass();

                Method method = clazz.getMethod("setUserId", long.class);

                method.invoke(_locationRemoteModel, userId);
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

        if (_locationRemoteModel != null) {
            try {
                Class<?> clazz = _locationRemoteModel.getClass();

                Method method = clazz.getMethod("setCreateDate", Date.class);

                method.invoke(_locationRemoteModel, createDate);
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

        if (_locationRemoteModel != null) {
            try {
                Class<?> clazz = _locationRemoteModel.getClass();

                Method method = clazz.getMethod("setModifiedDate", Date.class);

                method.invoke(_locationRemoteModel, modifiedDate);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getType() {
        return _type;
    }

    @Override
    public void setType(String type) {
        _type = type;

        if (_locationRemoteModel != null) {
            try {
                Class<?> clazz = _locationRemoteModel.getClass();

                Method method = clazz.getMethod("setType", String.class);

                method.invoke(_locationRemoteModel, type);
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

        if (_locationRemoteModel != null) {
            try {
                Class<?> clazz = _locationRemoteModel.getClass();

                Method method = clazz.getMethod("setName", String.class);

                method.invoke(_locationRemoteModel, name);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getCountry_code() {
        return _country_code;
    }

    @Override
    public void setCountry_code(String country_code) {
        _country_code = country_code;

        if (_locationRemoteModel != null) {
            try {
                Class<?> clazz = _locationRemoteModel.getClass();

                Method method = clazz.getMethod("setCountry_code", String.class);

                method.invoke(_locationRemoteModel, country_code);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getProvince() {
        return _province;
    }

    @Override
    public void setProvince(String province) {
        _province = province;

        if (_locationRemoteModel != null) {
            try {
                Class<?> clazz = _locationRemoteModel.getClass();

                Method method = clazz.getMethod("setProvince", String.class);

                method.invoke(_locationRemoteModel, province);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getCity() {
        return _city;
    }

    @Override
    public void setCity(String city) {
        _city = city;

        if (_locationRemoteModel != null) {
            try {
                Class<?> clazz = _locationRemoteModel.getClass();

                Method method = clazz.getMethod("setCity", String.class);

                method.invoke(_locationRemoteModel, city);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getAddress() {
        return _address;
    }

    @Override
    public void setAddress(String address) {
        _address = address;

        if (_locationRemoteModel != null) {
            try {
                Class<?> clazz = _locationRemoteModel.getClass();

                Method method = clazz.getMethod("setAddress", String.class);

                method.invoke(_locationRemoteModel, address);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getZip_code() {
        return _zip_code;
    }

    @Override
    public void setZip_code(String zip_code) {
        _zip_code = zip_code;

        if (_locationRemoteModel != null) {
            try {
                Class<?> clazz = _locationRemoteModel.getClass();

                Method method = clazz.getMethod("setZip_code", String.class);

                method.invoke(_locationRemoteModel, zip_code);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getPhone() {
        return _phone;
    }

    @Override
    public void setPhone(String phone) {
        _phone = phone;

        if (_locationRemoteModel != null) {
            try {
                Class<?> clazz = _locationRemoteModel.getClass();

                Method method = clazz.getMethod("setPhone", String.class);

                method.invoke(_locationRemoteModel, phone);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getFax() {
        return _fax;
    }

    @Override
    public void setFax(String fax) {
        _fax = fax;

        if (_locationRemoteModel != null) {
            try {
                Class<?> clazz = _locationRemoteModel.getClass();

                Method method = clazz.getMethod("setFax", String.class);

                method.invoke(_locationRemoteModel, fax);
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

        if (_locationRemoteModel != null) {
            try {
                Class<?> clazz = _locationRemoteModel.getClass();

                Method method = clazz.getMethod("setNote", String.class);

                method.invoke(_locationRemoteModel, note);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public BaseModel<?> getLocationRemoteModel() {
        return _locationRemoteModel;
    }

    public void setLocationRemoteModel(BaseModel<?> locationRemoteModel) {
        _locationRemoteModel = locationRemoteModel;
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

        Class<?> remoteModelClass = _locationRemoteModel.getClass();

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

        Object returnValue = method.invoke(_locationRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            LocationLocalServiceUtil.addLocation(this);
        } else {
            LocationLocalServiceUtil.updateLocation(this);
        }
    }

    @Override
    public Location toEscapedModel() {
        return (Location) ProxyUtil.newProxyInstance(Location.class.getClassLoader(),
            new Class[] { Location.class }, new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        LocationClp clone = new LocationClp();

        clone.setLocationId(getLocationId());
        clone.setGroupId(getGroupId());
        clone.setCompanyId(getCompanyId());
        clone.setUserId(getUserId());
        clone.setCreateDate(getCreateDate());
        clone.setModifiedDate(getModifiedDate());
        clone.setType(getType());
        clone.setName(getName());
        clone.setCountry_code(getCountry_code());
        clone.setProvince(getProvince());
        clone.setCity(getCity());
        clone.setAddress(getAddress());
        clone.setZip_code(getZip_code());
        clone.setPhone(getPhone());
        clone.setFax(getFax());
        clone.setNote(getNote());

        return clone;
    }

    @Override
    public int compareTo(Location location) {
        long primaryKey = location.getPrimaryKey();

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

        if (!(obj instanceof LocationClp)) {
            return false;
        }

        LocationClp location = (LocationClp) obj;

        long primaryKey = location.getPrimaryKey();

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
        StringBundler sb = new StringBundler(33);

        sb.append("{locationId=");
        sb.append(getLocationId());
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
        sb.append(", type=");
        sb.append(getType());
        sb.append(", name=");
        sb.append(getName());
        sb.append(", country_code=");
        sb.append(getCountry_code());
        sb.append(", province=");
        sb.append(getProvince());
        sb.append(", city=");
        sb.append(getCity());
        sb.append(", address=");
        sb.append(getAddress());
        sb.append(", zip_code=");
        sb.append(getZip_code());
        sb.append(", phone=");
        sb.append(getPhone());
        sb.append(", fax=");
        sb.append(getFax());
        sb.append(", note=");
        sb.append(getNote());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(52);

        sb.append("<model><model-name>");
        sb.append("vn.com.ecopharma.hrm.model.Location");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>locationId</column-name><column-value><![CDATA[");
        sb.append(getLocationId());
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
            "<column><column-name>type</column-name><column-value><![CDATA[");
        sb.append(getType());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>name</column-name><column-value><![CDATA[");
        sb.append(getName());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>country_code</column-name><column-value><![CDATA[");
        sb.append(getCountry_code());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>province</column-name><column-value><![CDATA[");
        sb.append(getProvince());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>city</column-name><column-value><![CDATA[");
        sb.append(getCity());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>address</column-name><column-value><![CDATA[");
        sb.append(getAddress());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>zip_code</column-name><column-value><![CDATA[");
        sb.append(getZip_code());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>phone</column-name><column-value><![CDATA[");
        sb.append(getPhone());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>fax</column-name><column-value><![CDATA[");
        sb.append(getFax());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>note</column-name><column-value><![CDATA[");
        sb.append(getNote());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
