package vn.com.ecopharma.hrm.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Location}.
 * </p>
 *
 * @author tvt
 * @see Location
 * @generated
 */
public class LocationWrapper implements Location, ModelWrapper<Location> {
    private Location _location;

    public LocationWrapper(Location location) {
        _location = location;
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

    /**
    * Returns the primary key of this location.
    *
    * @return the primary key of this location
    */
    @Override
    public long getPrimaryKey() {
        return _location.getPrimaryKey();
    }

    /**
    * Sets the primary key of this location.
    *
    * @param primaryKey the primary key of this location
    */
    @Override
    public void setPrimaryKey(long primaryKey) {
        _location.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the location ID of this location.
    *
    * @return the location ID of this location
    */
    @Override
    public long getLocationId() {
        return _location.getLocationId();
    }

    /**
    * Sets the location ID of this location.
    *
    * @param locationId the location ID of this location
    */
    @Override
    public void setLocationId(long locationId) {
        _location.setLocationId(locationId);
    }

    /**
    * Returns the group ID of this location.
    *
    * @return the group ID of this location
    */
    @Override
    public long getGroupId() {
        return _location.getGroupId();
    }

    /**
    * Sets the group ID of this location.
    *
    * @param groupId the group ID of this location
    */
    @Override
    public void setGroupId(long groupId) {
        _location.setGroupId(groupId);
    }

    /**
    * Returns the company ID of this location.
    *
    * @return the company ID of this location
    */
    @Override
    public long getCompanyId() {
        return _location.getCompanyId();
    }

    /**
    * Sets the company ID of this location.
    *
    * @param companyId the company ID of this location
    */
    @Override
    public void setCompanyId(long companyId) {
        _location.setCompanyId(companyId);
    }

    /**
    * Returns the user ID of this location.
    *
    * @return the user ID of this location
    */
    @Override
    public long getUserId() {
        return _location.getUserId();
    }

    /**
    * Sets the user ID of this location.
    *
    * @param userId the user ID of this location
    */
    @Override
    public void setUserId(long userId) {
        _location.setUserId(userId);
    }

    /**
    * Returns the user uuid of this location.
    *
    * @return the user uuid of this location
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.lang.String getUserUuid()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _location.getUserUuid();
    }

    /**
    * Sets the user uuid of this location.
    *
    * @param userUuid the user uuid of this location
    */
    @Override
    public void setUserUuid(java.lang.String userUuid) {
        _location.setUserUuid(userUuid);
    }

    /**
    * Returns the create date of this location.
    *
    * @return the create date of this location
    */
    @Override
    public java.util.Date getCreateDate() {
        return _location.getCreateDate();
    }

    /**
    * Sets the create date of this location.
    *
    * @param createDate the create date of this location
    */
    @Override
    public void setCreateDate(java.util.Date createDate) {
        _location.setCreateDate(createDate);
    }

    /**
    * Returns the modified date of this location.
    *
    * @return the modified date of this location
    */
    @Override
    public java.util.Date getModifiedDate() {
        return _location.getModifiedDate();
    }

    /**
    * Sets the modified date of this location.
    *
    * @param modifiedDate the modified date of this location
    */
    @Override
    public void setModifiedDate(java.util.Date modifiedDate) {
        _location.setModifiedDate(modifiedDate);
    }

    /**
    * Returns the type of this location.
    *
    * @return the type of this location
    */
    @Override
    public java.lang.String getType() {
        return _location.getType();
    }

    /**
    * Sets the type of this location.
    *
    * @param type the type of this location
    */
    @Override
    public void setType(java.lang.String type) {
        _location.setType(type);
    }

    /**
    * Returns the name of this location.
    *
    * @return the name of this location
    */
    @Override
    public java.lang.String getName() {
        return _location.getName();
    }

    /**
    * Sets the name of this location.
    *
    * @param name the name of this location
    */
    @Override
    public void setName(java.lang.String name) {
        _location.setName(name);
    }

    /**
    * Returns the country_code of this location.
    *
    * @return the country_code of this location
    */
    @Override
    public java.lang.String getCountry_code() {
        return _location.getCountry_code();
    }

    /**
    * Sets the country_code of this location.
    *
    * @param country_code the country_code of this location
    */
    @Override
    public void setCountry_code(java.lang.String country_code) {
        _location.setCountry_code(country_code);
    }

    /**
    * Returns the province of this location.
    *
    * @return the province of this location
    */
    @Override
    public java.lang.String getProvince() {
        return _location.getProvince();
    }

    /**
    * Sets the province of this location.
    *
    * @param province the province of this location
    */
    @Override
    public void setProvince(java.lang.String province) {
        _location.setProvince(province);
    }

    /**
    * Returns the city of this location.
    *
    * @return the city of this location
    */
    @Override
    public java.lang.String getCity() {
        return _location.getCity();
    }

    /**
    * Sets the city of this location.
    *
    * @param city the city of this location
    */
    @Override
    public void setCity(java.lang.String city) {
        _location.setCity(city);
    }

    /**
    * Returns the address of this location.
    *
    * @return the address of this location
    */
    @Override
    public java.lang.String getAddress() {
        return _location.getAddress();
    }

    /**
    * Sets the address of this location.
    *
    * @param address the address of this location
    */
    @Override
    public void setAddress(java.lang.String address) {
        _location.setAddress(address);
    }

    /**
    * Returns the zip_code of this location.
    *
    * @return the zip_code of this location
    */
    @Override
    public java.lang.String getZip_code() {
        return _location.getZip_code();
    }

    /**
    * Sets the zip_code of this location.
    *
    * @param zip_code the zip_code of this location
    */
    @Override
    public void setZip_code(java.lang.String zip_code) {
        _location.setZip_code(zip_code);
    }

    /**
    * Returns the phone of this location.
    *
    * @return the phone of this location
    */
    @Override
    public java.lang.String getPhone() {
        return _location.getPhone();
    }

    /**
    * Sets the phone of this location.
    *
    * @param phone the phone of this location
    */
    @Override
    public void setPhone(java.lang.String phone) {
        _location.setPhone(phone);
    }

    /**
    * Returns the fax of this location.
    *
    * @return the fax of this location
    */
    @Override
    public java.lang.String getFax() {
        return _location.getFax();
    }

    /**
    * Sets the fax of this location.
    *
    * @param fax the fax of this location
    */
    @Override
    public void setFax(java.lang.String fax) {
        _location.setFax(fax);
    }

    /**
    * Returns the note of this location.
    *
    * @return the note of this location
    */
    @Override
    public java.lang.String getNote() {
        return _location.getNote();
    }

    /**
    * Sets the note of this location.
    *
    * @param note the note of this location
    */
    @Override
    public void setNote(java.lang.String note) {
        _location.setNote(note);
    }

    @Override
    public boolean isNew() {
        return _location.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _location.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _location.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _location.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _location.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _location.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _location.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _location.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _location.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _location.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _location.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new LocationWrapper((Location) _location.clone());
    }

    @Override
    public int compareTo(vn.com.ecopharma.hrm.model.Location location) {
        return _location.compareTo(location);
    }

    @Override
    public int hashCode() {
        return _location.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<vn.com.ecopharma.hrm.model.Location> toCacheModel() {
        return _location.toCacheModel();
    }

    @Override
    public vn.com.ecopharma.hrm.model.Location toEscapedModel() {
        return new LocationWrapper(_location.toEscapedModel());
    }

    @Override
    public vn.com.ecopharma.hrm.model.Location toUnescapedModel() {
        return new LocationWrapper(_location.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _location.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _location.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _location.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof LocationWrapper)) {
            return false;
        }

        LocationWrapper locationWrapper = (LocationWrapper) obj;

        if (Validator.equals(_location, locationWrapper._location)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public Location getWrappedLocation() {
        return _location;
    }

    @Override
    public Location getWrappedModel() {
        return _location;
    }

    @Override
    public void resetOriginalValues() {
        _location.resetOriginalValues();
    }
}
