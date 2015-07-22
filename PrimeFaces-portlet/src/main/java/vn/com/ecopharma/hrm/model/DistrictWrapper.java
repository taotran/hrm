package vn.com.ecopharma.hrm.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link District}.
 * </p>
 *
 * @author tvt
 * @see District
 * @generated
 */
public class DistrictWrapper implements District, ModelWrapper<District> {
    private District _district;

    public DistrictWrapper(District district) {
        _district = district;
    }

    @Override
    public Class<?> getModelClass() {
        return District.class;
    }

    @Override
    public String getModelClassName() {
        return District.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("districtId", getDistrictId());
        attributes.put("name", getName());
        attributes.put("regionId", getRegionId());
        attributes.put("groupId", getGroupId());
        attributes.put("companyId", getCompanyId());
        attributes.put("userId", getUserId());
        attributes.put("createDate", getCreateDate());
        attributes.put("modifiedDate", getModifiedDate());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long districtId = (Long) attributes.get("districtId");

        if (districtId != null) {
            setDistrictId(districtId);
        }

        String name = (String) attributes.get("name");

        if (name != null) {
            setName(name);
        }

        Long regionId = (Long) attributes.get("regionId");

        if (regionId != null) {
            setRegionId(regionId);
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

    /**
    * Returns the primary key of this district.
    *
    * @return the primary key of this district
    */
    @Override
    public long getPrimaryKey() {
        return _district.getPrimaryKey();
    }

    /**
    * Sets the primary key of this district.
    *
    * @param primaryKey the primary key of this district
    */
    @Override
    public void setPrimaryKey(long primaryKey) {
        _district.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the district ID of this district.
    *
    * @return the district ID of this district
    */
    @Override
    public long getDistrictId() {
        return _district.getDistrictId();
    }

    /**
    * Sets the district ID of this district.
    *
    * @param districtId the district ID of this district
    */
    @Override
    public void setDistrictId(long districtId) {
        _district.setDistrictId(districtId);
    }

    /**
    * Returns the name of this district.
    *
    * @return the name of this district
    */
    @Override
    public java.lang.String getName() {
        return _district.getName();
    }

    /**
    * Sets the name of this district.
    *
    * @param name the name of this district
    */
    @Override
    public void setName(java.lang.String name) {
        _district.setName(name);
    }

    /**
    * Returns the region ID of this district.
    *
    * @return the region ID of this district
    */
    @Override
    public long getRegionId() {
        return _district.getRegionId();
    }

    /**
    * Sets the region ID of this district.
    *
    * @param regionId the region ID of this district
    */
    @Override
    public void setRegionId(long regionId) {
        _district.setRegionId(regionId);
    }

    /**
    * Returns the group ID of this district.
    *
    * @return the group ID of this district
    */
    @Override
    public long getGroupId() {
        return _district.getGroupId();
    }

    /**
    * Sets the group ID of this district.
    *
    * @param groupId the group ID of this district
    */
    @Override
    public void setGroupId(long groupId) {
        _district.setGroupId(groupId);
    }

    /**
    * Returns the company ID of this district.
    *
    * @return the company ID of this district
    */
    @Override
    public long getCompanyId() {
        return _district.getCompanyId();
    }

    /**
    * Sets the company ID of this district.
    *
    * @param companyId the company ID of this district
    */
    @Override
    public void setCompanyId(long companyId) {
        _district.setCompanyId(companyId);
    }

    /**
    * Returns the user ID of this district.
    *
    * @return the user ID of this district
    */
    @Override
    public long getUserId() {
        return _district.getUserId();
    }

    /**
    * Sets the user ID of this district.
    *
    * @param userId the user ID of this district
    */
    @Override
    public void setUserId(long userId) {
        _district.setUserId(userId);
    }

    /**
    * Returns the user uuid of this district.
    *
    * @return the user uuid of this district
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.lang.String getUserUuid()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _district.getUserUuid();
    }

    /**
    * Sets the user uuid of this district.
    *
    * @param userUuid the user uuid of this district
    */
    @Override
    public void setUserUuid(java.lang.String userUuid) {
        _district.setUserUuid(userUuid);
    }

    /**
    * Returns the create date of this district.
    *
    * @return the create date of this district
    */
    @Override
    public java.util.Date getCreateDate() {
        return _district.getCreateDate();
    }

    /**
    * Sets the create date of this district.
    *
    * @param createDate the create date of this district
    */
    @Override
    public void setCreateDate(java.util.Date createDate) {
        _district.setCreateDate(createDate);
    }

    /**
    * Returns the modified date of this district.
    *
    * @return the modified date of this district
    */
    @Override
    public java.util.Date getModifiedDate() {
        return _district.getModifiedDate();
    }

    /**
    * Sets the modified date of this district.
    *
    * @param modifiedDate the modified date of this district
    */
    @Override
    public void setModifiedDate(java.util.Date modifiedDate) {
        _district.setModifiedDate(modifiedDate);
    }

    @Override
    public boolean isNew() {
        return _district.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _district.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _district.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _district.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _district.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _district.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _district.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _district.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _district.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _district.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _district.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new DistrictWrapper((District) _district.clone());
    }

    @Override
    public int compareTo(vn.com.ecopharma.hrm.model.District district) {
        return _district.compareTo(district);
    }

    @Override
    public int hashCode() {
        return _district.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<vn.com.ecopharma.hrm.model.District> toCacheModel() {
        return _district.toCacheModel();
    }

    @Override
    public vn.com.ecopharma.hrm.model.District toEscapedModel() {
        return new DistrictWrapper(_district.toEscapedModel());
    }

    @Override
    public vn.com.ecopharma.hrm.model.District toUnescapedModel() {
        return new DistrictWrapper(_district.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _district.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _district.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _district.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof DistrictWrapper)) {
            return false;
        }

        DistrictWrapper districtWrapper = (DistrictWrapper) obj;

        if (Validator.equals(_district, districtWrapper._district)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public District getWrappedDistrict() {
        return _district;
    }

    @Override
    public District getWrappedModel() {
        return _district;
    }

    @Override
    public void resetOriginalValues() {
        _district.resetOriginalValues();
    }
}
