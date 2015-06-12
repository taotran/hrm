package vn.com.ecopharma.hrm.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link CandidateHistory}.
 * </p>
 *
 * @author tvt
 * @see CandidateHistory
 * @generated
 */
public class CandidateHistoryWrapper implements CandidateHistory,
    ModelWrapper<CandidateHistory> {
    private CandidateHistory _candidateHistory;

    public CandidateHistoryWrapper(CandidateHistory candidateHistory) {
        _candidateHistory = candidateHistory;
    }

    @Override
    public Class<?> getModelClass() {
        return CandidateHistory.class;
    }

    @Override
    public String getModelClassName() {
        return CandidateHistory.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("candidateHistoryId", getCandidateHistoryId());
        attributes.put("c_id", getC_id());
        attributes.put("v_id", getV_id());
        attributes.put("interviewId", getInterviewId());
        attributes.put("performed_by", getPerformed_by());
        attributes.put("performedDate", getPerformedDate());
        attributes.put("note", getNote());
        attributes.put("interviewers", getInterviewers());
        attributes.put("action", getAction());
        attributes.put("groupId", getGroupId());
        attributes.put("companyId", getCompanyId());
        attributes.put("userId", getUserId());
        attributes.put("userName", getUserName());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long candidateHistoryId = (Long) attributes.get("candidateHistoryId");

        if (candidateHistoryId != null) {
            setCandidateHistoryId(candidateHistoryId);
        }

        Long c_id = (Long) attributes.get("c_id");

        if (c_id != null) {
            setC_id(c_id);
        }

        Long v_id = (Long) attributes.get("v_id");

        if (v_id != null) {
            setV_id(v_id);
        }

        Long interviewId = (Long) attributes.get("interviewId");

        if (interviewId != null) {
            setInterviewId(interviewId);
        }

        Long performed_by = (Long) attributes.get("performed_by");

        if (performed_by != null) {
            setPerformed_by(performed_by);
        }

        Date performedDate = (Date) attributes.get("performedDate");

        if (performedDate != null) {
            setPerformedDate(performedDate);
        }

        String note = (String) attributes.get("note");

        if (note != null) {
            setNote(note);
        }

        String interviewers = (String) attributes.get("interviewers");

        if (interviewers != null) {
            setInterviewers(interviewers);
        }

        String action = (String) attributes.get("action");

        if (action != null) {
            setAction(action);
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

        String userName = (String) attributes.get("userName");

        if (userName != null) {
            setUserName(userName);
        }
    }

    /**
    * Returns the primary key of this candidate history.
    *
    * @return the primary key of this candidate history
    */
    @Override
    public long getPrimaryKey() {
        return _candidateHistory.getPrimaryKey();
    }

    /**
    * Sets the primary key of this candidate history.
    *
    * @param primaryKey the primary key of this candidate history
    */
    @Override
    public void setPrimaryKey(long primaryKey) {
        _candidateHistory.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the candidate history ID of this candidate history.
    *
    * @return the candidate history ID of this candidate history
    */
    @Override
    public long getCandidateHistoryId() {
        return _candidateHistory.getCandidateHistoryId();
    }

    /**
    * Sets the candidate history ID of this candidate history.
    *
    * @param candidateHistoryId the candidate history ID of this candidate history
    */
    @Override
    public void setCandidateHistoryId(long candidateHistoryId) {
        _candidateHistory.setCandidateHistoryId(candidateHistoryId);
    }

    /**
    * Returns the c_id of this candidate history.
    *
    * @return the c_id of this candidate history
    */
    @Override
    public long getC_id() {
        return _candidateHistory.getC_id();
    }

    /**
    * Sets the c_id of this candidate history.
    *
    * @param c_id the c_id of this candidate history
    */
    @Override
    public void setC_id(long c_id) {
        _candidateHistory.setC_id(c_id);
    }

    /**
    * Returns the v_id of this candidate history.
    *
    * @return the v_id of this candidate history
    */
    @Override
    public long getV_id() {
        return _candidateHistory.getV_id();
    }

    /**
    * Sets the v_id of this candidate history.
    *
    * @param v_id the v_id of this candidate history
    */
    @Override
    public void setV_id(long v_id) {
        _candidateHistory.setV_id(v_id);
    }

    /**
    * Returns the interview ID of this candidate history.
    *
    * @return the interview ID of this candidate history
    */
    @Override
    public long getInterviewId() {
        return _candidateHistory.getInterviewId();
    }

    /**
    * Sets the interview ID of this candidate history.
    *
    * @param interviewId the interview ID of this candidate history
    */
    @Override
    public void setInterviewId(long interviewId) {
        _candidateHistory.setInterviewId(interviewId);
    }

    /**
    * Returns the performed_by of this candidate history.
    *
    * @return the performed_by of this candidate history
    */
    @Override
    public long getPerformed_by() {
        return _candidateHistory.getPerformed_by();
    }

    /**
    * Sets the performed_by of this candidate history.
    *
    * @param performed_by the performed_by of this candidate history
    */
    @Override
    public void setPerformed_by(long performed_by) {
        _candidateHistory.setPerformed_by(performed_by);
    }

    /**
    * Returns the performed date of this candidate history.
    *
    * @return the performed date of this candidate history
    */
    @Override
    public java.util.Date getPerformedDate() {
        return _candidateHistory.getPerformedDate();
    }

    /**
    * Sets the performed date of this candidate history.
    *
    * @param performedDate the performed date of this candidate history
    */
    @Override
    public void setPerformedDate(java.util.Date performedDate) {
        _candidateHistory.setPerformedDate(performedDate);
    }

    /**
    * Returns the note of this candidate history.
    *
    * @return the note of this candidate history
    */
    @Override
    public java.lang.String getNote() {
        return _candidateHistory.getNote();
    }

    /**
    * Sets the note of this candidate history.
    *
    * @param note the note of this candidate history
    */
    @Override
    public void setNote(java.lang.String note) {
        _candidateHistory.setNote(note);
    }

    /**
    * Returns the interviewers of this candidate history.
    *
    * @return the interviewers of this candidate history
    */
    @Override
    public java.lang.String getInterviewers() {
        return _candidateHistory.getInterviewers();
    }

    /**
    * Sets the interviewers of this candidate history.
    *
    * @param interviewers the interviewers of this candidate history
    */
    @Override
    public void setInterviewers(java.lang.String interviewers) {
        _candidateHistory.setInterviewers(interviewers);
    }

    /**
    * Returns the action of this candidate history.
    *
    * @return the action of this candidate history
    */
    @Override
    public java.lang.String getAction() {
        return _candidateHistory.getAction();
    }

    /**
    * Sets the action of this candidate history.
    *
    * @param action the action of this candidate history
    */
    @Override
    public void setAction(java.lang.String action) {
        _candidateHistory.setAction(action);
    }

    /**
    * Returns the group ID of this candidate history.
    *
    * @return the group ID of this candidate history
    */
    @Override
    public long getGroupId() {
        return _candidateHistory.getGroupId();
    }

    /**
    * Sets the group ID of this candidate history.
    *
    * @param groupId the group ID of this candidate history
    */
    @Override
    public void setGroupId(long groupId) {
        _candidateHistory.setGroupId(groupId);
    }

    /**
    * Returns the company ID of this candidate history.
    *
    * @return the company ID of this candidate history
    */
    @Override
    public long getCompanyId() {
        return _candidateHistory.getCompanyId();
    }

    /**
    * Sets the company ID of this candidate history.
    *
    * @param companyId the company ID of this candidate history
    */
    @Override
    public void setCompanyId(long companyId) {
        _candidateHistory.setCompanyId(companyId);
    }

    /**
    * Returns the user ID of this candidate history.
    *
    * @return the user ID of this candidate history
    */
    @Override
    public long getUserId() {
        return _candidateHistory.getUserId();
    }

    /**
    * Sets the user ID of this candidate history.
    *
    * @param userId the user ID of this candidate history
    */
    @Override
    public void setUserId(long userId) {
        _candidateHistory.setUserId(userId);
    }

    /**
    * Returns the user uuid of this candidate history.
    *
    * @return the user uuid of this candidate history
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.lang.String getUserUuid()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _candidateHistory.getUserUuid();
    }

    /**
    * Sets the user uuid of this candidate history.
    *
    * @param userUuid the user uuid of this candidate history
    */
    @Override
    public void setUserUuid(java.lang.String userUuid) {
        _candidateHistory.setUserUuid(userUuid);
    }

    /**
    * Returns the user name of this candidate history.
    *
    * @return the user name of this candidate history
    */
    @Override
    public java.lang.String getUserName() {
        return _candidateHistory.getUserName();
    }

    /**
    * Sets the user name of this candidate history.
    *
    * @param userName the user name of this candidate history
    */
    @Override
    public void setUserName(java.lang.String userName) {
        _candidateHistory.setUserName(userName);
    }

    @Override
    public boolean isNew() {
        return _candidateHistory.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _candidateHistory.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _candidateHistory.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _candidateHistory.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _candidateHistory.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _candidateHistory.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _candidateHistory.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _candidateHistory.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _candidateHistory.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _candidateHistory.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _candidateHistory.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new CandidateHistoryWrapper((CandidateHistory) _candidateHistory.clone());
    }

    @Override
    public int compareTo(
        vn.com.ecopharma.hrm.model.CandidateHistory candidateHistory) {
        return _candidateHistory.compareTo(candidateHistory);
    }

    @Override
    public int hashCode() {
        return _candidateHistory.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<vn.com.ecopharma.hrm.model.CandidateHistory> toCacheModel() {
        return _candidateHistory.toCacheModel();
    }

    @Override
    public vn.com.ecopharma.hrm.model.CandidateHistory toEscapedModel() {
        return new CandidateHistoryWrapper(_candidateHistory.toEscapedModel());
    }

    @Override
    public vn.com.ecopharma.hrm.model.CandidateHistory toUnescapedModel() {
        return new CandidateHistoryWrapper(_candidateHistory.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _candidateHistory.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _candidateHistory.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _candidateHistory.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof CandidateHistoryWrapper)) {
            return false;
        }

        CandidateHistoryWrapper candidateHistoryWrapper = (CandidateHistoryWrapper) obj;

        if (Validator.equals(_candidateHistory,
                    candidateHistoryWrapper._candidateHistory)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public CandidateHistory getWrappedCandidateHistory() {
        return _candidateHistory;
    }

    @Override
    public CandidateHistory getWrappedModel() {
        return _candidateHistory;
    }

    @Override
    public void resetOriginalValues() {
        _candidateHistory.resetOriginalValues();
    }
}
