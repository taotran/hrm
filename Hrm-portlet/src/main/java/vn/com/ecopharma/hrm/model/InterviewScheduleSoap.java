package vn.com.ecopharma.hrm.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link vn.com.ecopharma.hrm.service.http.InterviewScheduleServiceSoap}.
 *
 * @author tvt
 * @see vn.com.ecopharma.hrm.service.http.InterviewScheduleServiceSoap
 * @generated
 */
public class InterviewScheduleSoap implements Serializable {
    private long _interviewScheduleId;
    private long _c_id;
    private long _v_id;
    private long _interviewId;
    private Date _interviewDate;
    private String _interviewTime;
    private String _note;
    private long _groupId;
    private long _companyId;
    private long _userId;
    private Date _createDate;
    private Date _modifiedDate;

    public InterviewScheduleSoap() {
    }

    public static InterviewScheduleSoap toSoapModel(InterviewSchedule model) {
        InterviewScheduleSoap soapModel = new InterviewScheduleSoap();

        soapModel.setInterviewScheduleId(model.getInterviewScheduleId());
        soapModel.setC_id(model.getC_id());
        soapModel.setV_id(model.getV_id());
        soapModel.setInterviewId(model.getInterviewId());
        soapModel.setInterviewDate(model.getInterviewDate());
        soapModel.setInterviewTime(model.getInterviewTime());
        soapModel.setNote(model.getNote());
        soapModel.setGroupId(model.getGroupId());
        soapModel.setCompanyId(model.getCompanyId());
        soapModel.setUserId(model.getUserId());
        soapModel.setCreateDate(model.getCreateDate());
        soapModel.setModifiedDate(model.getModifiedDate());

        return soapModel;
    }

    public static InterviewScheduleSoap[] toSoapModels(
        InterviewSchedule[] models) {
        InterviewScheduleSoap[] soapModels = new InterviewScheduleSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static InterviewScheduleSoap[][] toSoapModels(
        InterviewSchedule[][] models) {
        InterviewScheduleSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new InterviewScheduleSoap[models.length][models[0].length];
        } else {
            soapModels = new InterviewScheduleSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static InterviewScheduleSoap[] toSoapModels(
        List<InterviewSchedule> models) {
        List<InterviewScheduleSoap> soapModels = new ArrayList<InterviewScheduleSoap>(models.size());

        for (InterviewSchedule model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new InterviewScheduleSoap[soapModels.size()]);
    }

    public long getPrimaryKey() {
        return _interviewScheduleId;
    }

    public void setPrimaryKey(long pk) {
        setInterviewScheduleId(pk);
    }

    public long getInterviewScheduleId() {
        return _interviewScheduleId;
    }

    public void setInterviewScheduleId(long interviewScheduleId) {
        _interviewScheduleId = interviewScheduleId;
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

    public Date getInterviewDate() {
        return _interviewDate;
    }

    public void setInterviewDate(Date interviewDate) {
        _interviewDate = interviewDate;
    }

    public String getInterviewTime() {
        return _interviewTime;
    }

    public void setInterviewTime(String interviewTime) {
        _interviewTime = interviewTime;
    }

    public String getNote() {
        return _note;
    }

    public void setNote(String note) {
        _note = note;
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
}
