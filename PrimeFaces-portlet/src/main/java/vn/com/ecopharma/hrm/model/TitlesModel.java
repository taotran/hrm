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
 * The base model interface for the Titles service. Represents a row in the &quot;pf_Titles&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link vn.com.ecopharma.hrm.model.impl.TitlesModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link vn.com.ecopharma.hrm.model.impl.TitlesImpl}.
 * </p>
 *
 * @author tvt
 * @see Titles
 * @see vn.com.ecopharma.hrm.model.impl.TitlesImpl
 * @see vn.com.ecopharma.hrm.model.impl.TitlesModelImpl
 * @generated
 */
public interface TitlesModel extends BaseModel<Titles> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. All methods that expect a titles model instance should use the {@link Titles} interface instead.
     */

    /**
     * Returns the primary key of this titles.
     *
     * @return the primary key of this titles
     */
    public long getPrimaryKey();

    /**
     * Sets the primary key of this titles.
     *
     * @param primaryKey the primary key of this titles
     */
    public void setPrimaryKey(long primaryKey);

    /**
     * Returns the titles ID of this titles.
     *
     * @return the titles ID of this titles
     */
    public long getTitlesId();

    /**
     * Sets the titles ID of this titles.
     *
     * @param titlesId the titles ID of this titles
     */
    public void setTitlesId(long titlesId);

    /**
     * Returns the name of this titles.
     *
     * @return the name of this titles
     */
    @AutoEscape
    public String getName();

    /**
     * Sets the name of this titles.
     *
     * @param name the name of this titles
     */
    public void setName(String name);

    /**
     * Returns the group ID of this titles.
     *
     * @return the group ID of this titles
     */
    public long getGroupId();

    /**
     * Sets the group ID of this titles.
     *
     * @param groupId the group ID of this titles
     */
    public void setGroupId(long groupId);

    /**
     * Returns the company ID of this titles.
     *
     * @return the company ID of this titles
     */
    public long getCompanyId();

    /**
     * Sets the company ID of this titles.
     *
     * @param companyId the company ID of this titles
     */
    public void setCompanyId(long companyId);

    /**
     * Returns the user ID of this titles.
     *
     * @return the user ID of this titles
     */
    public long getUserId();

    /**
     * Sets the user ID of this titles.
     *
     * @param userId the user ID of this titles
     */
    public void setUserId(long userId);

    /**
     * Returns the user uuid of this titles.
     *
     * @return the user uuid of this titles
     * @throws SystemException if a system exception occurred
     */
    public String getUserUuid() throws SystemException;

    /**
     * Sets the user uuid of this titles.
     *
     * @param userUuid the user uuid of this titles
     */
    public void setUserUuid(String userUuid);

    /**
     * Returns the create date of this titles.
     *
     * @return the create date of this titles
     */
    public Date getCreateDate();

    /**
     * Sets the create date of this titles.
     *
     * @param createDate the create date of this titles
     */
    public void setCreateDate(Date createDate);

    /**
     * Returns the modified date of this titles.
     *
     * @return the modified date of this titles
     */
    public Date getModifiedDate();

    /**
     * Sets the modified date of this titles.
     *
     * @param modifiedDate the modified date of this titles
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
    public int compareTo(Titles titles);

    @Override
    public int hashCode();

    @Override
    public CacheModel<Titles> toCacheModel();

    @Override
    public Titles toEscapedModel();

    @Override
    public Titles toUnescapedModel();

    @Override
    public String toString();

    @Override
    public String toXmlString();
}
