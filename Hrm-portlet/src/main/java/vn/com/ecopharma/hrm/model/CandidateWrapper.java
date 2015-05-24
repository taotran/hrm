package vn.com.ecopharma.hrm.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Candidate}.
 * </p>
 *
 * @author tvt
 * @see Candidate
 * @generated
 */
public class CandidateWrapper implements Candidate, ModelWrapper<Candidate> {
    private Candidate _candidate;

    public CandidateWrapper(Candidate candidate) {
        _candidate = candidate;
    }

    @Override
    public Class<?> getModelClass() {
        return Candidate.class;
    }

    @Override
    public String getModelClassName() {
        return Candidate.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("c_id", getC_id());
        attributes.put("first_name", getFirst_name());
        attributes.put("middle_name", getMiddle_name());
        attributes.put("last_name", getLast_name());
        attributes.put("email", getEmail());
        attributes.put("contact_number", getContact_number());
        attributes.put("comment", getComment());
        attributes.put("mode_of_application", getMode_of_application());
        attributes.put("date_of_application", getDate_of_application());
        attributes.put("cv_file_id", getCv_file_id());
        attributes.put("cv_text_version", getCv_text_version());
        attributes.put("keywords", getKeywords());
        attributes.put("added_person", getAdded_person());
        attributes.put("user_id", getUser_id());
        attributes.put("group_id", getGroup_id());
        attributes.put("interviewId", getInterviewId());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long c_id = (Long) attributes.get("c_id");

        if (c_id != null) {
            setC_id(c_id);
        }

        String first_name = (String) attributes.get("first_name");

        if (first_name != null) {
            setFirst_name(first_name);
        }

        String middle_name = (String) attributes.get("middle_name");

        if (middle_name != null) {
            setMiddle_name(middle_name);
        }

        String last_name = (String) attributes.get("last_name");

        if (last_name != null) {
            setLast_name(last_name);
        }

        String email = (String) attributes.get("email");

        if (email != null) {
            setEmail(email);
        }

        String contact_number = (String) attributes.get("contact_number");

        if (contact_number != null) {
            setContact_number(contact_number);
        }

        String comment = (String) attributes.get("comment");

        if (comment != null) {
            setComment(comment);
        }

        Integer mode_of_application = (Integer) attributes.get(
                "mode_of_application");

        if (mode_of_application != null) {
            setMode_of_application(mode_of_application);
        }

        Date date_of_application = (Date) attributes.get("date_of_application");

        if (date_of_application != null) {
            setDate_of_application(date_of_application);
        }

        Long cv_file_id = (Long) attributes.get("cv_file_id");

        if (cv_file_id != null) {
            setCv_file_id(cv_file_id);
        }

        String cv_text_version = (String) attributes.get("cv_text_version");

        if (cv_text_version != null) {
            setCv_text_version(cv_text_version);
        }

        String keywords = (String) attributes.get("keywords");

        if (keywords != null) {
            setKeywords(keywords);
        }

        Integer added_person = (Integer) attributes.get("added_person");

        if (added_person != null) {
            setAdded_person(added_person);
        }

        Long user_id = (Long) attributes.get("user_id");

        if (user_id != null) {
            setUser_id(user_id);
        }

        Long group_id = (Long) attributes.get("group_id");

        if (group_id != null) {
            setGroup_id(group_id);
        }

        Long interviewId = (Long) attributes.get("interviewId");

        if (interviewId != null) {
            setInterviewId(interviewId);
        }
    }

    /**
    * Returns the primary key of this candidate.
    *
    * @return the primary key of this candidate
    */
    @Override
    public long getPrimaryKey() {
        return _candidate.getPrimaryKey();
    }

    /**
    * Sets the primary key of this candidate.
    *
    * @param primaryKey the primary key of this candidate
    */
    @Override
    public void setPrimaryKey(long primaryKey) {
        _candidate.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the c_id of this candidate.
    *
    * @return the c_id of this candidate
    */
    @Override
    public long getC_id() {
        return _candidate.getC_id();
    }

    /**
    * Sets the c_id of this candidate.
    *
    * @param c_id the c_id of this candidate
    */
    @Override
    public void setC_id(long c_id) {
        _candidate.setC_id(c_id);
    }

    /**
    * Returns the first_name of this candidate.
    *
    * @return the first_name of this candidate
    */
    @Override
    public java.lang.String getFirst_name() {
        return _candidate.getFirst_name();
    }

    /**
    * Sets the first_name of this candidate.
    *
    * @param first_name the first_name of this candidate
    */
    @Override
    public void setFirst_name(java.lang.String first_name) {
        _candidate.setFirst_name(first_name);
    }

    /**
    * Returns the middle_name of this candidate.
    *
    * @return the middle_name of this candidate
    */
    @Override
    public java.lang.String getMiddle_name() {
        return _candidate.getMiddle_name();
    }

    /**
    * Sets the middle_name of this candidate.
    *
    * @param middle_name the middle_name of this candidate
    */
    @Override
    public void setMiddle_name(java.lang.String middle_name) {
        _candidate.setMiddle_name(middle_name);
    }

    /**
    * Returns the last_name of this candidate.
    *
    * @return the last_name of this candidate
    */
    @Override
    public java.lang.String getLast_name() {
        return _candidate.getLast_name();
    }

    /**
    * Sets the last_name of this candidate.
    *
    * @param last_name the last_name of this candidate
    */
    @Override
    public void setLast_name(java.lang.String last_name) {
        _candidate.setLast_name(last_name);
    }

    /**
    * Returns the email of this candidate.
    *
    * @return the email of this candidate
    */
    @Override
    public java.lang.String getEmail() {
        return _candidate.getEmail();
    }

    /**
    * Sets the email of this candidate.
    *
    * @param email the email of this candidate
    */
    @Override
    public void setEmail(java.lang.String email) {
        _candidate.setEmail(email);
    }

    /**
    * Returns the contact_number of this candidate.
    *
    * @return the contact_number of this candidate
    */
    @Override
    public java.lang.String getContact_number() {
        return _candidate.getContact_number();
    }

    /**
    * Sets the contact_number of this candidate.
    *
    * @param contact_number the contact_number of this candidate
    */
    @Override
    public void setContact_number(java.lang.String contact_number) {
        _candidate.setContact_number(contact_number);
    }

    /**
    * Returns the comment of this candidate.
    *
    * @return the comment of this candidate
    */
    @Override
    public java.lang.String getComment() {
        return _candidate.getComment();
    }

    /**
    * Sets the comment of this candidate.
    *
    * @param comment the comment of this candidate
    */
    @Override
    public void setComment(java.lang.String comment) {
        _candidate.setComment(comment);
    }

    /**
    * Returns the mode_of_application of this candidate.
    *
    * @return the mode_of_application of this candidate
    */
    @Override
    public int getMode_of_application() {
        return _candidate.getMode_of_application();
    }

    /**
    * Sets the mode_of_application of this candidate.
    *
    * @param mode_of_application the mode_of_application of this candidate
    */
    @Override
    public void setMode_of_application(int mode_of_application) {
        _candidate.setMode_of_application(mode_of_application);
    }

    /**
    * Returns the date_of_application of this candidate.
    *
    * @return the date_of_application of this candidate
    */
    @Override
    public java.util.Date getDate_of_application() {
        return _candidate.getDate_of_application();
    }

    /**
    * Sets the date_of_application of this candidate.
    *
    * @param date_of_application the date_of_application of this candidate
    */
    @Override
    public void setDate_of_application(java.util.Date date_of_application) {
        _candidate.setDate_of_application(date_of_application);
    }

    /**
    * Returns the cv_file_id of this candidate.
    *
    * @return the cv_file_id of this candidate
    */
    @Override
    public long getCv_file_id() {
        return _candidate.getCv_file_id();
    }

    /**
    * Sets the cv_file_id of this candidate.
    *
    * @param cv_file_id the cv_file_id of this candidate
    */
    @Override
    public void setCv_file_id(long cv_file_id) {
        _candidate.setCv_file_id(cv_file_id);
    }

    /**
    * Returns the cv_text_version of this candidate.
    *
    * @return the cv_text_version of this candidate
    */
    @Override
    public java.lang.String getCv_text_version() {
        return _candidate.getCv_text_version();
    }

    /**
    * Sets the cv_text_version of this candidate.
    *
    * @param cv_text_version the cv_text_version of this candidate
    */
    @Override
    public void setCv_text_version(java.lang.String cv_text_version) {
        _candidate.setCv_text_version(cv_text_version);
    }

    /**
    * Returns the keywords of this candidate.
    *
    * @return the keywords of this candidate
    */
    @Override
    public java.lang.String getKeywords() {
        return _candidate.getKeywords();
    }

    /**
    * Sets the keywords of this candidate.
    *
    * @param keywords the keywords of this candidate
    */
    @Override
    public void setKeywords(java.lang.String keywords) {
        _candidate.setKeywords(keywords);
    }

    /**
    * Returns the added_person of this candidate.
    *
    * @return the added_person of this candidate
    */
    @Override
    public int getAdded_person() {
        return _candidate.getAdded_person();
    }

    /**
    * Sets the added_person of this candidate.
    *
    * @param added_person the added_person of this candidate
    */
    @Override
    public void setAdded_person(int added_person) {
        _candidate.setAdded_person(added_person);
    }

    /**
    * Returns the user_id of this candidate.
    *
    * @return the user_id of this candidate
    */
    @Override
    public long getUser_id() {
        return _candidate.getUser_id();
    }

    /**
    * Sets the user_id of this candidate.
    *
    * @param user_id the user_id of this candidate
    */
    @Override
    public void setUser_id(long user_id) {
        _candidate.setUser_id(user_id);
    }

    /**
    * Returns the group_id of this candidate.
    *
    * @return the group_id of this candidate
    */
    @Override
    public long getGroup_id() {
        return _candidate.getGroup_id();
    }

    /**
    * Sets the group_id of this candidate.
    *
    * @param group_id the group_id of this candidate
    */
    @Override
    public void setGroup_id(long group_id) {
        _candidate.setGroup_id(group_id);
    }

    /**
    * Returns the interview ID of this candidate.
    *
    * @return the interview ID of this candidate
    */
    @Override
    public long getInterviewId() {
        return _candidate.getInterviewId();
    }

    /**
    * Sets the interview ID of this candidate.
    *
    * @param interviewId the interview ID of this candidate
    */
    @Override
    public void setInterviewId(long interviewId) {
        _candidate.setInterviewId(interviewId);
    }

    /**
    * Returns the status of this candidate.
    *
    * @return the status of this candidate
    */
    @Override
    public int getStatus() {
        return _candidate.getStatus();
    }

    /**
    * Returns the trash entry created when this candidate was moved to the Recycle Bin. The trash entry may belong to one of the ancestors of this candidate.
    *
    * @return the trash entry created when this candidate was moved to the Recycle Bin
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.liferay.portlet.trash.model.TrashEntry getTrashEntry()
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _candidate.getTrashEntry();
    }

    /**
    * Returns the class primary key of the trash entry for this candidate.
    *
    * @return the class primary key of the trash entry for this candidate
    */
    @Override
    public long getTrashEntryClassPK() {
        return _candidate.getTrashEntryClassPK();
    }

    /**
    * Returns the trash handler for this candidate.
    *
    * @return the trash handler for this candidate
    */
    @Override
    public com.liferay.portal.kernel.trash.TrashHandler getTrashHandler() {
        return _candidate.getTrashHandler();
    }

    /**
    * Returns <code>true</code> if this candidate is in the Recycle Bin.
    *
    * @return <code>true</code> if this candidate is in the Recycle Bin; <code>false</code> otherwise
    */
    @Override
    public boolean isInTrash() {
        return _candidate.isInTrash();
    }

    /**
    * Returns <code>true</code> if the parent of this candidate is in the Recycle Bin.
    *
    * @return <code>true</code> if the parent of this candidate is in the Recycle Bin; <code>false</code> otherwise
    * @throws SystemException if a system exception occurred
    */
    @Override
    public boolean isInTrashContainer() {
        return _candidate.isInTrashContainer();
    }

    @Override
    public boolean isNew() {
        return _candidate.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _candidate.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _candidate.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _candidate.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _candidate.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _candidate.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _candidate.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _candidate.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _candidate.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _candidate.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _candidate.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new CandidateWrapper((Candidate) _candidate.clone());
    }

    @Override
    public int compareTo(vn.com.ecopharma.hrm.model.Candidate candidate) {
        return _candidate.compareTo(candidate);
    }

    @Override
    public int hashCode() {
        return _candidate.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<vn.com.ecopharma.hrm.model.Candidate> toCacheModel() {
        return _candidate.toCacheModel();
    }

    @Override
    public vn.com.ecopharma.hrm.model.Candidate toEscapedModel() {
        return new CandidateWrapper(_candidate.toEscapedModel());
    }

    @Override
    public vn.com.ecopharma.hrm.model.Candidate toUnescapedModel() {
        return new CandidateWrapper(_candidate.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _candidate.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _candidate.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _candidate.persist();
    }

    @Override
    public java.util.List<vn.com.ecopharma.hrm.model.Vacancy> get_vacancies() {
        return _candidate.get_vacancies();
    }

    @Override
    public void set_vacancies(
        java.util.List<vn.com.ecopharma.hrm.model.Vacancy> _vacancies) {
        _candidate.set_vacancies(_vacancies);
    }

    @Override
    public java.lang.String getFullName() {
        return _candidate.getFullName();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof CandidateWrapper)) {
            return false;
        }

        CandidateWrapper candidateWrapper = (CandidateWrapper) obj;

        if (Validator.equals(_candidate, candidateWrapper._candidate)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public Candidate getWrappedCandidate() {
        return _candidate;
    }

    @Override
    public Candidate getWrappedModel() {
        return _candidate;
    }

    @Override
    public void resetOriginalValues() {
        _candidate.resetOriginalValues();
    }
}
