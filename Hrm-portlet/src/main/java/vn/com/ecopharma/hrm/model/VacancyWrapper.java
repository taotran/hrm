package vn.com.ecopharma.hrm.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Vacancy}.
 * </p>
 *
 * @author tvt
 * @see Vacancy
 * @generated
 */
public class VacancyWrapper implements Vacancy, ModelWrapper<Vacancy> {
    private Vacancy _vacancy;

    public VacancyWrapper(Vacancy vacancy) {
        _vacancy = vacancy;
    }

    @Override
    public Class<?> getModelClass() {
        return Vacancy.class;
    }

    @Override
    public String getModelClassName() {
        return Vacancy.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("v_id", getV_id());
        attributes.put("jobtitleId", getJobtitleId());
        attributes.put("hiring_manager_id", getHiring_manager_id());
        attributes.put("name", getName());
        attributes.put("description", getDescription());
        attributes.put("no_of_positions", getNo_of_positions());
        attributes.put("published_in_feed", getPublished_in_feed());
        attributes.put("insert_date", getInsert_date());
        attributes.put("update_date", getUpdate_date());
        attributes.put("user_id", getUser_id());
        attributes.put("group_id", getGroup_id());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long v_id = (Long) attributes.get("v_id");

        if (v_id != null) {
            setV_id(v_id);
        }

        Long jobtitleId = (Long) attributes.get("jobtitleId");

        if (jobtitleId != null) {
            setJobtitleId(jobtitleId);
        }

        Long hiring_manager_id = (Long) attributes.get("hiring_manager_id");

        if (hiring_manager_id != null) {
            setHiring_manager_id(hiring_manager_id);
        }

        String name = (String) attributes.get("name");

        if (name != null) {
            setName(name);
        }

        String description = (String) attributes.get("description");

        if (description != null) {
            setDescription(description);
        }

        Integer no_of_positions = (Integer) attributes.get("no_of_positions");

        if (no_of_positions != null) {
            setNo_of_positions(no_of_positions);
        }

        Boolean published_in_feed = (Boolean) attributes.get(
                "published_in_feed");

        if (published_in_feed != null) {
            setPublished_in_feed(published_in_feed);
        }

        Date insert_date = (Date) attributes.get("insert_date");

        if (insert_date != null) {
            setInsert_date(insert_date);
        }

        Date update_date = (Date) attributes.get("update_date");

        if (update_date != null) {
            setUpdate_date(update_date);
        }

        Long user_id = (Long) attributes.get("user_id");

        if (user_id != null) {
            setUser_id(user_id);
        }

        Long group_id = (Long) attributes.get("group_id");

        if (group_id != null) {
            setGroup_id(group_id);
        }
    }

    /**
    * Returns the primary key of this vacancy.
    *
    * @return the primary key of this vacancy
    */
    @Override
    public long getPrimaryKey() {
        return _vacancy.getPrimaryKey();
    }

    /**
    * Sets the primary key of this vacancy.
    *
    * @param primaryKey the primary key of this vacancy
    */
    @Override
    public void setPrimaryKey(long primaryKey) {
        _vacancy.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the v_id of this vacancy.
    *
    * @return the v_id of this vacancy
    */
    @Override
    public long getV_id() {
        return _vacancy.getV_id();
    }

    /**
    * Sets the v_id of this vacancy.
    *
    * @param v_id the v_id of this vacancy
    */
    @Override
    public void setV_id(long v_id) {
        _vacancy.setV_id(v_id);
    }

    /**
    * Returns the jobtitle ID of this vacancy.
    *
    * @return the jobtitle ID of this vacancy
    */
    @Override
    public long getJobtitleId() {
        return _vacancy.getJobtitleId();
    }

    /**
    * Sets the jobtitle ID of this vacancy.
    *
    * @param jobtitleId the jobtitle ID of this vacancy
    */
    @Override
    public void setJobtitleId(long jobtitleId) {
        _vacancy.setJobtitleId(jobtitleId);
    }

    /**
    * Returns the hiring_manager_id of this vacancy.
    *
    * @return the hiring_manager_id of this vacancy
    */
    @Override
    public long getHiring_manager_id() {
        return _vacancy.getHiring_manager_id();
    }

    /**
    * Sets the hiring_manager_id of this vacancy.
    *
    * @param hiring_manager_id the hiring_manager_id of this vacancy
    */
    @Override
    public void setHiring_manager_id(long hiring_manager_id) {
        _vacancy.setHiring_manager_id(hiring_manager_id);
    }

    /**
    * Returns the name of this vacancy.
    *
    * @return the name of this vacancy
    */
    @Override
    public java.lang.String getName() {
        return _vacancy.getName();
    }

    /**
    * Sets the name of this vacancy.
    *
    * @param name the name of this vacancy
    */
    @Override
    public void setName(java.lang.String name) {
        _vacancy.setName(name);
    }

    /**
    * Returns the description of this vacancy.
    *
    * @return the description of this vacancy
    */
    @Override
    public java.lang.String getDescription() {
        return _vacancy.getDescription();
    }

    /**
    * Sets the description of this vacancy.
    *
    * @param description the description of this vacancy
    */
    @Override
    public void setDescription(java.lang.String description) {
        _vacancy.setDescription(description);
    }

    /**
    * Returns the no_of_positions of this vacancy.
    *
    * @return the no_of_positions of this vacancy
    */
    @Override
    public int getNo_of_positions() {
        return _vacancy.getNo_of_positions();
    }

    /**
    * Sets the no_of_positions of this vacancy.
    *
    * @param no_of_positions the no_of_positions of this vacancy
    */
    @Override
    public void setNo_of_positions(int no_of_positions) {
        _vacancy.setNo_of_positions(no_of_positions);
    }

    /**
    * Returns the published_in_feed of this vacancy.
    *
    * @return the published_in_feed of this vacancy
    */
    @Override
    public boolean getPublished_in_feed() {
        return _vacancy.getPublished_in_feed();
    }

    /**
    * Returns <code>true</code> if this vacancy is published_in_feed.
    *
    * @return <code>true</code> if this vacancy is published_in_feed; <code>false</code> otherwise
    */
    @Override
    public boolean isPublished_in_feed() {
        return _vacancy.isPublished_in_feed();
    }

    /**
    * Sets whether this vacancy is published_in_feed.
    *
    * @param published_in_feed the published_in_feed of this vacancy
    */
    @Override
    public void setPublished_in_feed(boolean published_in_feed) {
        _vacancy.setPublished_in_feed(published_in_feed);
    }

    /**
    * Returns the insert_date of this vacancy.
    *
    * @return the insert_date of this vacancy
    */
    @Override
    public java.util.Date getInsert_date() {
        return _vacancy.getInsert_date();
    }

    /**
    * Sets the insert_date of this vacancy.
    *
    * @param insert_date the insert_date of this vacancy
    */
    @Override
    public void setInsert_date(java.util.Date insert_date) {
        _vacancy.setInsert_date(insert_date);
    }

    /**
    * Returns the update_date of this vacancy.
    *
    * @return the update_date of this vacancy
    */
    @Override
    public java.util.Date getUpdate_date() {
        return _vacancy.getUpdate_date();
    }

    /**
    * Sets the update_date of this vacancy.
    *
    * @param update_date the update_date of this vacancy
    */
    @Override
    public void setUpdate_date(java.util.Date update_date) {
        _vacancy.setUpdate_date(update_date);
    }

    /**
    * Returns the user_id of this vacancy.
    *
    * @return the user_id of this vacancy
    */
    @Override
    public long getUser_id() {
        return _vacancy.getUser_id();
    }

    /**
    * Sets the user_id of this vacancy.
    *
    * @param user_id the user_id of this vacancy
    */
    @Override
    public void setUser_id(long user_id) {
        _vacancy.setUser_id(user_id);
    }

    /**
    * Returns the group_id of this vacancy.
    *
    * @return the group_id of this vacancy
    */
    @Override
    public long getGroup_id() {
        return _vacancy.getGroup_id();
    }

    /**
    * Sets the group_id of this vacancy.
    *
    * @param group_id the group_id of this vacancy
    */
    @Override
    public void setGroup_id(long group_id) {
        _vacancy.setGroup_id(group_id);
    }

    /**
    * Returns the status of this vacancy.
    *
    * @return the status of this vacancy
    */
    @Override
    public int getStatus() {
        return _vacancy.getStatus();
    }

    /**
    * Returns the trash entry created when this vacancy was moved to the Recycle Bin. The trash entry may belong to one of the ancestors of this vacancy.
    *
    * @return the trash entry created when this vacancy was moved to the Recycle Bin
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.liferay.portlet.trash.model.TrashEntry getTrashEntry()
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _vacancy.getTrashEntry();
    }

    /**
    * Returns the class primary key of the trash entry for this vacancy.
    *
    * @return the class primary key of the trash entry for this vacancy
    */
    @Override
    public long getTrashEntryClassPK() {
        return _vacancy.getTrashEntryClassPK();
    }

    /**
    * Returns the trash handler for this vacancy.
    *
    * @return the trash handler for this vacancy
    */
    @Override
    public com.liferay.portal.kernel.trash.TrashHandler getTrashHandler() {
        return _vacancy.getTrashHandler();
    }

    /**
    * Returns <code>true</code> if this vacancy is in the Recycle Bin.
    *
    * @return <code>true</code> if this vacancy is in the Recycle Bin; <code>false</code> otherwise
    */
    @Override
    public boolean isInTrash() {
        return _vacancy.isInTrash();
    }

    /**
    * Returns <code>true</code> if the parent of this vacancy is in the Recycle Bin.
    *
    * @return <code>true</code> if the parent of this vacancy is in the Recycle Bin; <code>false</code> otherwise
    * @throws SystemException if a system exception occurred
    */
    @Override
    public boolean isInTrashContainer() {
        return _vacancy.isInTrashContainer();
    }

    @Override
    public boolean isNew() {
        return _vacancy.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _vacancy.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _vacancy.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _vacancy.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _vacancy.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _vacancy.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _vacancy.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _vacancy.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _vacancy.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _vacancy.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _vacancy.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new VacancyWrapper((Vacancy) _vacancy.clone());
    }

    @Override
    public int compareTo(vn.com.ecopharma.hrm.model.Vacancy vacancy) {
        return _vacancy.compareTo(vacancy);
    }

    @Override
    public int hashCode() {
        return _vacancy.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<vn.com.ecopharma.hrm.model.Vacancy> toCacheModel() {
        return _vacancy.toCacheModel();
    }

    @Override
    public vn.com.ecopharma.hrm.model.Vacancy toEscapedModel() {
        return new VacancyWrapper(_vacancy.toEscapedModel());
    }

    @Override
    public vn.com.ecopharma.hrm.model.Vacancy toUnescapedModel() {
        return new VacancyWrapper(_vacancy.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _vacancy.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _vacancy.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _vacancy.persist();
    }

    @Override
    public java.util.List<vn.com.ecopharma.hrm.model.Candidate> get_candidates() {
        return _vacancy.get_candidates();
    }

    @Override
    public void set_candidates(
        java.util.List<vn.com.ecopharma.hrm.model.Candidate> _candidates) {
        _vacancy.set_candidates(_candidates);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof VacancyWrapper)) {
            return false;
        }

        VacancyWrapper vacancyWrapper = (VacancyWrapper) obj;

        if (Validator.equals(_vacancy, vacancyWrapper._vacancy)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public Vacancy getWrappedVacancy() {
        return _vacancy;
    }

    @Override
    public Vacancy getWrappedModel() {
        return _vacancy;
    }

    @Override
    public void resetOriginalValues() {
        _vacancy.resetOriginalValues();
    }
}
