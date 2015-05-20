package vn.com.ecopharma.hrm.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.trash.TrashHandler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.TrashedModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.trash.model.TrashEntry;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the Vacancy service. Represents a row in the &quot;HRM_Vacancy&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link vn.com.ecopharma.hrm.model.impl.VacancyModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link vn.com.ecopharma.hrm.model.impl.VacancyImpl}.
 * </p>
 *
 * @author tvt
 * @see Vacancy
 * @see vn.com.ecopharma.hrm.model.impl.VacancyImpl
 * @see vn.com.ecopharma.hrm.model.impl.VacancyModelImpl
 * @generated
 */
public interface VacancyModel extends BaseModel<Vacancy>, TrashedModel {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. All methods that expect a vacancy model instance should use the {@link Vacancy} interface instead.
     */

    /**
     * Returns the primary key of this vacancy.
     *
     * @return the primary key of this vacancy
     */
    public long getPrimaryKey();

    /**
     * Sets the primary key of this vacancy.
     *
     * @param primaryKey the primary key of this vacancy
     */
    public void setPrimaryKey(long primaryKey);

    /**
     * Returns the v_id of this vacancy.
     *
     * @return the v_id of this vacancy
     */
    public long getV_id();

    /**
     * Sets the v_id of this vacancy.
     *
     * @param v_id the v_id of this vacancy
     */
    public void setV_id(long v_id);

    /**
     * Returns the jtitle_id of this vacancy.
     *
     * @return the jtitle_id of this vacancy
     */
    public long getJtitle_id();

    /**
     * Sets the jtitle_id of this vacancy.
     *
     * @param jtitle_id the jtitle_id of this vacancy
     */
    public void setJtitle_id(long jtitle_id);

    /**
     * Returns the hiring_manager_id of this vacancy.
     *
     * @return the hiring_manager_id of this vacancy
     */
    public long getHiring_manager_id();

    /**
     * Sets the hiring_manager_id of this vacancy.
     *
     * @param hiring_manager_id the hiring_manager_id of this vacancy
     */
    public void setHiring_manager_id(long hiring_manager_id);

    /**
     * Returns the name of this vacancy.
     *
     * @return the name of this vacancy
     */
    @AutoEscape
    public String getName();

    /**
     * Sets the name of this vacancy.
     *
     * @param name the name of this vacancy
     */
    public void setName(String name);

    /**
     * Returns the description of this vacancy.
     *
     * @return the description of this vacancy
     */
    @AutoEscape
    public String getDescription();

    /**
     * Sets the description of this vacancy.
     *
     * @param description the description of this vacancy
     */
    public void setDescription(String description);

    /**
     * Returns the no_of_positions of this vacancy.
     *
     * @return the no_of_positions of this vacancy
     */
    public int getNo_of_positions();

    /**
     * Sets the no_of_positions of this vacancy.
     *
     * @param no_of_positions the no_of_positions of this vacancy
     */
    public void setNo_of_positions(int no_of_positions);

    /**
     * Returns the published_in_feed of this vacancy.
     *
     * @return the published_in_feed of this vacancy
     */
    public boolean getPublished_in_feed();

    /**
     * Returns <code>true</code> if this vacancy is published_in_feed.
     *
     * @return <code>true</code> if this vacancy is published_in_feed; <code>false</code> otherwise
     */
    public boolean isPublished_in_feed();

    /**
     * Sets whether this vacancy is published_in_feed.
     *
     * @param published_in_feed the published_in_feed of this vacancy
     */
    public void setPublished_in_feed(boolean published_in_feed);

    /**
     * Returns the insert_date of this vacancy.
     *
     * @return the insert_date of this vacancy
     */
    public Date getInsert_date();

    /**
     * Sets the insert_date of this vacancy.
     *
     * @param insert_date the insert_date of this vacancy
     */
    public void setInsert_date(Date insert_date);

    /**
     * Returns the update_date of this vacancy.
     *
     * @return the update_date of this vacancy
     */
    public Date getUpdate_date();

    /**
     * Sets the update_date of this vacancy.
     *
     * @param update_date the update_date of this vacancy
     */
    public void setUpdate_date(Date update_date);

    /**
     * Returns the user_id of this vacancy.
     *
     * @return the user_id of this vacancy
     */
    public long getUser_id();

    /**
     * Sets the user_id of this vacancy.
     *
     * @param user_id the user_id of this vacancy
     */
    public void setUser_id(long user_id);

    /**
     * Returns the group_id of this vacancy.
     *
     * @return the group_id of this vacancy
     */
    public long getGroup_id();

    /**
     * Sets the group_id of this vacancy.
     *
     * @param group_id the group_id of this vacancy
     */
    public void setGroup_id(long group_id);

    /**
     * Returns the status of this vacancy.
     *
     * @return the status of this vacancy
     */
    @Override
    public int getStatus();

    /**
     * Returns the trash entry created when this vacancy was moved to the Recycle Bin. The trash entry may belong to one of the ancestors of this vacancy.
     *
     * @return the trash entry created when this vacancy was moved to the Recycle Bin
     * @throws SystemException if a system exception occurred
     */
    @Override
    public TrashEntry getTrashEntry() throws PortalException, SystemException;

    /**
     * Returns the class primary key of the trash entry for this vacancy.
     *
     * @return the class primary key of the trash entry for this vacancy
     */
    @Override
    public long getTrashEntryClassPK();

    /**
     * Returns the trash handler for this vacancy.
     *
     * @return the trash handler for this vacancy
     */
    @Override
    public TrashHandler getTrashHandler();

    /**
     * Returns <code>true</code> if this vacancy is in the Recycle Bin.
     *
     * @return <code>true</code> if this vacancy is in the Recycle Bin; <code>false</code> otherwise
     */
    @Override
    public boolean isInTrash();

    /**
     * Returns <code>true</code> if the parent of this vacancy is in the Recycle Bin.
     *
     * @return <code>true</code> if the parent of this vacancy is in the Recycle Bin; <code>false</code> otherwise
     * @throws SystemException if a system exception occurred
     */
    @Override
    public boolean isInTrashContainer();

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
    public int compareTo(Vacancy vacancy);

    @Override
    public int hashCode();

    @Override
    public CacheModel<Vacancy> toCacheModel();

    @Override
    public Vacancy toEscapedModel();

    @Override
    public Vacancy toUnescapedModel();

    @Override
    public String toString();

    @Override
    public String toXmlString();
}