package vn.com.ecopharma.hrm.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link VacancyCandidate}.
 * </p>
 *
 * @author tvt
 * @see VacancyCandidate
 * @generated
 */
public class VacancyCandidateWrapper implements VacancyCandidate,
    ModelWrapper<VacancyCandidate> {
    private VacancyCandidate _vacancyCandidate;

    public VacancyCandidateWrapper(VacancyCandidate vacancyCandidate) {
        _vacancyCandidate = vacancyCandidate;
    }

    @Override
    public Class<?> getModelClass() {
        return VacancyCandidate.class;
    }

    @Override
    public String getModelClassName() {
        return VacancyCandidate.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("vacancyCandidateId", getVacancyCandidateId());
        attributes.put("c_id", getC_id());
        attributes.put("v_id", getV_id());
        attributes.put("groupId", getGroupId());
        attributes.put("companyId", getCompanyId());
        attributes.put("userId", getUserId());
        attributes.put("createDate", getCreateDate());
        attributes.put("modifiedDate", getModifiedDate());
        attributes.put("vc_status", getVc_status());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long vacancyCandidateId = (Long) attributes.get("vacancyCandidateId");

        if (vacancyCandidateId != null) {
            setVacancyCandidateId(vacancyCandidateId);
        }

        Long c_id = (Long) attributes.get("c_id");

        if (c_id != null) {
            setC_id(c_id);
        }

        Long v_id = (Long) attributes.get("v_id");

        if (v_id != null) {
            setV_id(v_id);
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

        String vc_status = (String) attributes.get("vc_status");

        if (vc_status != null) {
            setVc_status(vc_status);
        }
    }

    /**
    * Returns the primary key of this vacancy candidate.
    *
    * @return the primary key of this vacancy candidate
    */
    @Override
    public long getPrimaryKey() {
        return _vacancyCandidate.getPrimaryKey();
    }

    /**
    * Sets the primary key of this vacancy candidate.
    *
    * @param primaryKey the primary key of this vacancy candidate
    */
    @Override
    public void setPrimaryKey(long primaryKey) {
        _vacancyCandidate.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the vacancy candidate ID of this vacancy candidate.
    *
    * @return the vacancy candidate ID of this vacancy candidate
    */
    @Override
    public long getVacancyCandidateId() {
        return _vacancyCandidate.getVacancyCandidateId();
    }

    /**
    * Sets the vacancy candidate ID of this vacancy candidate.
    *
    * @param vacancyCandidateId the vacancy candidate ID of this vacancy candidate
    */
    @Override
    public void setVacancyCandidateId(long vacancyCandidateId) {
        _vacancyCandidate.setVacancyCandidateId(vacancyCandidateId);
    }

    /**
    * Returns the c_id of this vacancy candidate.
    *
    * @return the c_id of this vacancy candidate
    */
    @Override
    public long getC_id() {
        return _vacancyCandidate.getC_id();
    }

    /**
    * Sets the c_id of this vacancy candidate.
    *
    * @param c_id the c_id of this vacancy candidate
    */
    @Override
    public void setC_id(long c_id) {
        _vacancyCandidate.setC_id(c_id);
    }

    /**
    * Returns the v_id of this vacancy candidate.
    *
    * @return the v_id of this vacancy candidate
    */
    @Override
    public long getV_id() {
        return _vacancyCandidate.getV_id();
    }

    /**
    * Sets the v_id of this vacancy candidate.
    *
    * @param v_id the v_id of this vacancy candidate
    */
    @Override
    public void setV_id(long v_id) {
        _vacancyCandidate.setV_id(v_id);
    }

    /**
    * Returns the group ID of this vacancy candidate.
    *
    * @return the group ID of this vacancy candidate
    */
    @Override
    public long getGroupId() {
        return _vacancyCandidate.getGroupId();
    }

    /**
    * Sets the group ID of this vacancy candidate.
    *
    * @param groupId the group ID of this vacancy candidate
    */
    @Override
    public void setGroupId(long groupId) {
        _vacancyCandidate.setGroupId(groupId);
    }

    /**
    * Returns the company ID of this vacancy candidate.
    *
    * @return the company ID of this vacancy candidate
    */
    @Override
    public long getCompanyId() {
        return _vacancyCandidate.getCompanyId();
    }

    /**
    * Sets the company ID of this vacancy candidate.
    *
    * @param companyId the company ID of this vacancy candidate
    */
    @Override
    public void setCompanyId(long companyId) {
        _vacancyCandidate.setCompanyId(companyId);
    }

    /**
    * Returns the user ID of this vacancy candidate.
    *
    * @return the user ID of this vacancy candidate
    */
    @Override
    public long getUserId() {
        return _vacancyCandidate.getUserId();
    }

    /**
    * Sets the user ID of this vacancy candidate.
    *
    * @param userId the user ID of this vacancy candidate
    */
    @Override
    public void setUserId(long userId) {
        _vacancyCandidate.setUserId(userId);
    }

    /**
    * Returns the user uuid of this vacancy candidate.
    *
    * @return the user uuid of this vacancy candidate
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.lang.String getUserUuid()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _vacancyCandidate.getUserUuid();
    }

    /**
    * Sets the user uuid of this vacancy candidate.
    *
    * @param userUuid the user uuid of this vacancy candidate
    */
    @Override
    public void setUserUuid(java.lang.String userUuid) {
        _vacancyCandidate.setUserUuid(userUuid);
    }

    /**
    * Returns the create date of this vacancy candidate.
    *
    * @return the create date of this vacancy candidate
    */
    @Override
    public java.util.Date getCreateDate() {
        return _vacancyCandidate.getCreateDate();
    }

    /**
    * Sets the create date of this vacancy candidate.
    *
    * @param createDate the create date of this vacancy candidate
    */
    @Override
    public void setCreateDate(java.util.Date createDate) {
        _vacancyCandidate.setCreateDate(createDate);
    }

    /**
    * Returns the modified date of this vacancy candidate.
    *
    * @return the modified date of this vacancy candidate
    */
    @Override
    public java.util.Date getModifiedDate() {
        return _vacancyCandidate.getModifiedDate();
    }

    /**
    * Sets the modified date of this vacancy candidate.
    *
    * @param modifiedDate the modified date of this vacancy candidate
    */
    @Override
    public void setModifiedDate(java.util.Date modifiedDate) {
        _vacancyCandidate.setModifiedDate(modifiedDate);
    }

    /**
    * Returns the vc_status of this vacancy candidate.
    *
    * @return the vc_status of this vacancy candidate
    */
    @Override
    public java.lang.String getVc_status() {
        return _vacancyCandidate.getVc_status();
    }

    /**
    * Sets the vc_status of this vacancy candidate.
    *
    * @param vc_status the vc_status of this vacancy candidate
    */
    @Override
    public void setVc_status(java.lang.String vc_status) {
        _vacancyCandidate.setVc_status(vc_status);
    }

    @Override
    public boolean isNew() {
        return _vacancyCandidate.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _vacancyCandidate.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _vacancyCandidate.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _vacancyCandidate.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _vacancyCandidate.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _vacancyCandidate.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _vacancyCandidate.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _vacancyCandidate.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _vacancyCandidate.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _vacancyCandidate.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _vacancyCandidate.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new VacancyCandidateWrapper((VacancyCandidate) _vacancyCandidate.clone());
    }

    @Override
    public int compareTo(
        vn.com.ecopharma.hrm.model.VacancyCandidate vacancyCandidate) {
        return _vacancyCandidate.compareTo(vacancyCandidate);
    }

    @Override
    public int hashCode() {
        return _vacancyCandidate.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<vn.com.ecopharma.hrm.model.VacancyCandidate> toCacheModel() {
        return _vacancyCandidate.toCacheModel();
    }

    @Override
    public vn.com.ecopharma.hrm.model.VacancyCandidate toEscapedModel() {
        return new VacancyCandidateWrapper(_vacancyCandidate.toEscapedModel());
    }

    @Override
    public vn.com.ecopharma.hrm.model.VacancyCandidate toUnescapedModel() {
        return new VacancyCandidateWrapper(_vacancyCandidate.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _vacancyCandidate.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _vacancyCandidate.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _vacancyCandidate.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof VacancyCandidateWrapper)) {
            return false;
        }

        VacancyCandidateWrapper vacancyCandidateWrapper = (VacancyCandidateWrapper) obj;

        if (Validator.equals(_vacancyCandidate,
                    vacancyCandidateWrapper._vacancyCandidate)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public VacancyCandidate getWrappedVacancyCandidate() {
        return _vacancyCandidate;
    }

    @Override
    public VacancyCandidate getWrappedModel() {
        return _vacancyCandidate;
    }

    @Override
    public void resetOriginalValues() {
        _vacancyCandidate.resetOriginalValues();
    }
}
