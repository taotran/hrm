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
 * The base model interface for the University service. Represents a row in the &quot;pf_University&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link vn.com.ecopharma.hrm.model.impl.UniversityModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link vn.com.ecopharma.hrm.model.impl.UniversityImpl}.
 * </p>
 *
 * @author tvt
 * @see University
 * @see vn.com.ecopharma.hrm.model.impl.UniversityImpl
 * @see vn.com.ecopharma.hrm.model.impl.UniversityModelImpl
 * @generated
 */
public interface UniversityModel extends BaseModel<University> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. All methods that expect a university model instance should use the {@link University} interface instead.
     */

    /**
     * Returns the primary key of this university.
     *
     * @return the primary key of this university
     */
    public long getPrimaryKey();

    /**
     * Sets the primary key of this university.
     *
     * @param primaryKey the primary key of this university
     */
    public void setPrimaryKey(long primaryKey);

    /**
     * Returns the university ID of this university.
     *
     * @return the university ID of this university
     */
    public long getUniversityId();

    /**
     * Sets the university ID of this university.
     *
     * @param universityId the university ID of this university
     */
    public void setUniversityId(long universityId);

    /**
     * Returns the name of this university.
     *
     * @return the name of this university
     */
    @AutoEscape
    public String getName();

    /**
     * Sets the name of this university.
     *
     * @param name the name of this university
     */
    public void setName(String name);

    /**
     * Returns the code of this university.
     *
     * @return the code of this university
     */
    @AutoEscape
    public String getCode();

    /**
     * Sets the code of this university.
     *
     * @param code the code of this university
     */
    public void setCode(String code);

    /**
     * Returns the tel_fax of this university.
     *
     * @return the tel_fax of this university
     */
    @AutoEscape
    public String getTel_fax();

    /**
     * Sets the tel_fax of this university.
     *
     * @param tel_fax the tel_fax of this university
     */
    public void setTel_fax(String tel_fax);

    /**
     * Returns the group ID of this university.
     *
     * @return the group ID of this university
     */
    public long getGroupId();

    /**
     * Sets the group ID of this university.
     *
     * @param groupId the group ID of this university
     */
    public void setGroupId(long groupId);

    /**
     * Returns the company ID of this university.
     *
     * @return the company ID of this university
     */
    public long getCompanyId();

    /**
     * Sets the company ID of this university.
     *
     * @param companyId the company ID of this university
     */
    public void setCompanyId(long companyId);

    /**
     * Returns the user ID of this university.
     *
     * @return the user ID of this university
     */
    public long getUserId();

    /**
     * Sets the user ID of this university.
     *
     * @param userId the user ID of this university
     */
    public void setUserId(long userId);

    /**
     * Returns the user uuid of this university.
     *
     * @return the user uuid of this university
     * @throws SystemException if a system exception occurred
     */
    public String getUserUuid() throws SystemException;

    /**
     * Sets the user uuid of this university.
     *
     * @param userUuid the user uuid of this university
     */
    public void setUserUuid(String userUuid);

    /**
     * Returns the create date of this university.
     *
     * @return the create date of this university
     */
    public Date getCreateDate();

    /**
     * Sets the create date of this university.
     *
     * @param createDate the create date of this university
     */
    public void setCreateDate(Date createDate);

    /**
     * Returns the modified date of this university.
     *
     * @return the modified date of this university
     */
    public Date getModifiedDate();

    /**
     * Sets the modified date of this university.
     *
     * @param modifiedDate the modified date of this university
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
    public int compareTo(University university);

    @Override
    public int hashCode();

    @Override
    public CacheModel<University> toCacheModel();

    @Override
    public University toEscapedModel();

    @Override
    public University toUnescapedModel();

    @Override
    public String toString();

    @Override
    public String toXmlString();
}
