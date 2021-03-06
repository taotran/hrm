package vn.com.ecopharma.hrm.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the District service. Represents a row in the &quot;pf_District&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link vn.com.ecopharma.hrm.model.impl.DistrictModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link vn.com.ecopharma.hrm.model.impl.DistrictImpl}.
 * </p>
 *
 * @author tvt
 * @see District
 * @see vn.com.ecopharma.hrm.model.impl.DistrictImpl
 * @see vn.com.ecopharma.hrm.model.impl.DistrictModelImpl
 * @generated
 */
public interface DistrictModel extends BaseModel<District> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. All methods that expect a district model instance should use the {@link District} interface instead.
     */

    /**
     * Returns the primary key of this district.
     *
     * @return the primary key of this district
     */
    public long getPrimaryKey();

    /**
     * Sets the primary key of this district.
     *
     * @param primaryKey the primary key of this district
     */
    public void setPrimaryKey(long primaryKey);

    /**
     * Returns the district ID of this district.
     *
     * @return the district ID of this district
     */
    public long getDistrictId();

    /**
     * Sets the district ID of this district.
     *
     * @param districtId the district ID of this district
     */
    public void setDistrictId(long districtId);

    /**
     * Returns the name of this district.
     *
     * @return the name of this district
     */
    @AutoEscape
    public String getName();

    /**
     * Sets the name of this district.
     *
     * @param name the name of this district
     */
    public void setName(String name);

    /**
     * Returns the region ID of this district.
     *
     * @return the region ID of this district
     */
    public long getRegionId();

    /**
     * Sets the region ID of this district.
     *
     * @param regionId the region ID of this district
     */
    public void setRegionId(long regionId);

    /**
     * Returns the group ID of this district.
     *
     * @return the group ID of this district
     */
    public long getGroupId();

    /**
     * Sets the group ID of this district.
     *
     * @param groupId the group ID of this district
     */
    public void setGroupId(long groupId);

    /**
     * Returns the company ID of this district.
     *
     * @return the company ID of this district
     */
    public long getCompanyId();

    /**
     * Sets the company ID of this district.
     *
     * @param companyId the company ID of this district
     */
    public void setCompanyId(long companyId);

    /**
     * Returns the user ID of this district.
     *
     * @return the user ID of this district
     */
    public long getUserId();

    /**
     * Sets the user ID of this district.
     *
     * @param userId the user ID of this district
     */
    public void setUserId(long userId);

    /**
     * Returns the user uuid of this district.
     *
     * @return the user uuid of this district
     * @throws SystemException if a system exception occurred
     */
    public String getUserUuid() throws SystemException;

    /**
     * Sets the user uuid of this district.
     *
     * @param userUuid the user uuid of this district
     */
    public void setUserUuid(String userUuid);

    /**
     * Returns the create date of this district.
     *
     * @return the create date of this district
     */
    public Date getCreateDate();

    /**
     * Sets the create date of this district.
     *
     * @param createDate the create date of this district
     */
    public void setCreateDate(Date createDate);

    /**
     * Returns the modified date of this district.
     *
     * @return the modified date of this district
     */
    public Date getModifiedDate();

    /**
     * Sets the modified date of this district.
     *
     * @param modifiedDate the modified date of this district
     */
    public void setModifiedDate(Date modifiedDate);

    @Override
    public boolean isNew();

    @Override
    public void setNew(boolean n);

    @Override
    public boolean isCachedModel();

    @Override
    public void setCachedModel(boolean cachedModel);

    @Override
    public boolean isEscapedModel();

    @Override
    public Serializable getPrimaryKeyObj();

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj);

    @Override
    public ExpandoBridge getExpandoBridge();

    @Override
    public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

    @Override
    public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

    @Override
    public void setExpandoBridgeAttributes(ServiceContext serviceContext);

    @Override
    public Object clone();

    @Override
    public int compareTo(District district);

    @Override
    public int hashCode();

    @Override
    public CacheModel<District> toCacheModel();

    @Override
    public District toEscapedModel();

    @Override
    public District toUnescapedModel();

    @Override
    public String toString();

    @Override
    public String toXmlString();
}
