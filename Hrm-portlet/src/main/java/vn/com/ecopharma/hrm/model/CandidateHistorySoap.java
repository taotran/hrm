package vn.com.ecopharma.hrm.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link vn.com.ecopharma.hrm.service.http.CandidateHistoryServiceSoap}.
 *
 * @author tvt
 * @see vn.com.ecopharma.hrm.service.http.CandidateHistoryServiceSoap
 * @generated
 */
public class CandidateHistorySoap implements Serializable {
    private long _candidateHistoryId;
    private long _c_id;
    private long _v_id;
    private long _interviewId;
    private long _performed_by;
    private Date _performedDate;
    private String _note;
    private String _interviewers;
    private String _action;
    private long _groupId;
    private long _companyId;
    private long _userId;
    private String _userName;

    public CandidateHistorySoap() {
    }

    public static CandidateHistorySoap toSoapModel(CandidateHistory model) {
        CandidateHistorySoap soapModel = new CandidateHistorySoap();

        soapModel.setCandidateHistoryId(model.getCandidateHistoryId());
        soapModel.setC_id(model.getC_id());
        soapModel.setV_id(model.getV_id());
        soapModel.setInterviewId(model.getInterviewId());
        soapModel.setPerformed_by(model.getPerformed_by());
        soapModel.setPerformedDate(model.getPerformedDate());
        soapModel.setNote(model.getNote());
        soapModel.setInterviewers(model.getInterviewers());
        soapModel.setAction(model.getAction());
        soapModel.setGroupId(model.getGroupId());
        soapModel.setCompanyId(model.getCompanyId());
        soapModel.setUserId(model.getUserId());
        soapModel.setUserName(model.getUserName());

        return soapModel;
    }

    public static CandidateHistorySoap[] toSoapModels(CandidateHistory[] models) {
        CandidateHistorySoap[] soapModels = new CandidateHistorySoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static CandidateHistorySoap[][] toSoapModels(
        CandidateHistory[][] models) {
        CandidateHistorySoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new CandidateHistorySoap[models.length][models[0].length];
        } else {
            soapModels = new CandidateHistorySoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static CandidateHistorySoap[] toSoapModels(
        List<CandidateHistory> models) {
        List<CandidateHistorySoap> soapModels = new ArrayList<CandidateHistorySoap>(models.size());

        for (CandidateHistory model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new CandidateHistorySoap[soapModels.size()]);
    }

    public long getPrimaryKey() {
        return _candidateHistoryId;
    }

    public void setPrimaryKey(long pk) {
        setCandidateHistoryId(pk);
    }

    public long getCandidateHistoryId() {
        return _candidateHistoryId;
    }

    public void setCandidateHistoryId(long candidateHistoryId) {
        _candidateHistoryId = candidateHistoryId;
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

    public long getInterviewId() {
        return _interviewId;
    }

    public void setInterviewId(long interviewId) {
        _interviewId = interviewId;
    }

    public long getPerformed_by() {
        return _performed_by;
    }

    public void setPerformed_by(long performed_by) {
        _performed_by = performed_by;
    }

    public Date getPerformedDate() {
        return _performedDate;
    }

    public void setPerformedDate(Date performedDate) {
        _performedDate = performedDate;
    }

    public String getNote() {
        return _note;
    }

    public void setNote(String note) {
        _note = note;
    }

    public String getInterviewers() {
        return _interviewers;
    }

    public void setInterviewers(String interviewers) {
        _interviewers = interviewers;
    }

    public String getAction() {
        return _action;
    }

    public void setAction(String action) {
        _action = action;
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

    public String getUserName() {
        return _userName;
    }

    public void setUserName(String userName) {
        _userName = userName;
    }
}
