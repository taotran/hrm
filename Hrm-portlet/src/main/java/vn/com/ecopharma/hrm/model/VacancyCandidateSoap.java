package vn.com.ecopharma.hrm.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link vn.com.ecopharma.hrm.service.http.VacancyCandidateServiceSoap}.
 *
 * @author tvt
 * @see vn.com.ecopharma.hrm.service.http.VacancyCandidateServiceSoap
 * @generated
 */
public class VacancyCandidateSoap implements Serializable {
    private long _vacancyCandidateId;
    private long _c_id;
    private long _v_id;
    private long _groupId;
    private long _companyId;
    private long _userId;
    private Date _createDate;
    private Date _modifiedDate;
    private String _vc_status;

    public VacancyCandidateSoap() {
    }

    public static VacancyCandidateSoap toSoapModel(VacancyCandidate model) {
        VacancyCandidateSoap soapModel = new VacancyCandidateSoap();

        soapModel.setVacancyCandidateId(model.getVacancyCandidateId());
        soapModel.setC_id(model.getC_id());
        soapModel.setV_id(model.getV_id());
        soapModel.setGroupId(model.getGroupId());
        soapModel.setCompanyId(model.getCompanyId());
        soapModel.setUserId(model.getUserId());
        soapModel.setCreateDate(model.getCreateDate());
        soapModel.setModifiedDate(model.getModifiedDate());
        soapModel.setVc_status(model.getVc_status());

        return soapModel;
    }

    public static VacancyCandidateSoap[] toSoapModels(VacancyCandidate[] models) {
        VacancyCandidateSoap[] soapModels = new VacancyCandidateSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static VacancyCandidateSoap[][] toSoapModels(
        VacancyCandidate[][] models) {
        VacancyCandidateSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new VacancyCandidateSoap[models.length][models[0].length];
        } else {
            soapModels = new VacancyCandidateSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static VacancyCandidateSoap[] toSoapModels(
        List<VacancyCandidate> models) {
        List<VacancyCandidateSoap> soapModels = new ArrayList<VacancyCandidateSoap>(models.size());

        for (VacancyCandidate model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new VacancyCandidateSoap[soapModels.size()]);
    }

    public long getPrimaryKey() {
        return _vacancyCandidateId;
    }

    public void setPrimaryKey(long pk) {
        setVacancyCandidateId(pk);
    }

    public long getVacancyCandidateId() {
        return _vacancyCandidateId;
    }

    public void setVacancyCandidateId(long vacancyCandidateId) {
        _vacancyCandidateId = vacancyCandidateId;
    }

    public long getC_id() {
        return _c_id;
    }

    public void setC_id(long c_id) {
        _c_id = c_id;
    }

    public long getV_id() {
        return _v_id;
    }

    public void setV_id(long v_id) {
        _v_id = v_id;
    }

    public long getGroupId() {
        return _groupId;
    }

    public void setGroupId(long groupId) {
        _groupId = groupId;
    }

    public long getCompanyId() {
        return _companyId;
    }

    public void setCompanyId(long companyId) {
        _companyId = companyId;
    }

    public long getUserId() {
        return _userId;
    }

    public void setUserId(long userId) {
        _userId = userId;
    }

    public Date getCreateDate() {
        return _createDate;
    }

    public void setCreateDate(Date createDate) {
        _createDate = createDate;
    }

    public Date getModifiedDate() {
        return _modifiedDate;
    }

    public void setModifiedDate(Date modifiedDate) {
        _modifiedDate = modifiedDate;
    }

    public String getVc_status() {
        return _vc_status;
    }

    public void setVc_status(String vc_status) {
        _vc_status = vc_status;
    }
}
