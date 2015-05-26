package vn.com.ecopharma.hrm.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link vn.com.ecopharma.hrm.service.http.InterviewServiceSoap}.
 *
 * @author tvt
 * @see vn.com.ecopharma.hrm.service.http.InterviewServiceSoap
 * @generated
 */
public class InterviewSoap implements Serializable {
    private long _interviewId;
    private long _groupId;
    private long _companyId;
    private long _userId;
    private String _userName;
    private Date _createDate;
    private Date _modifiedDate;
    private String _name;
    private Date _interview_date;
    private String _interview_time;

    public InterviewSoap() {
    }

    public static InterviewSoap toSoapModel(Interview model) {
        InterviewSoap soapModel = new InterviewSoap();

        soapModel.setInterviewId(model.getInterviewId());
        soapModel.setGroupId(model.getGroupId());
        soapModel.setCompanyId(model.getCompanyId());
        soapModel.setUserId(model.getUserId());
        soapModel.setUserName(model.getUserName());
        soapModel.setCreateDate(model.getCreateDate());
        soapModel.setModifiedDate(model.getModifiedDate());
        soapModel.setName(model.getName());
        soapModel.setInterview_date(model.getInterview_date());
        soapModel.setInterview_time(model.getInterview_time());

        return soapModel;
    }

    public static InterviewSoap[] toSoapModels(Interview[] models) {
        InterviewSoap[] soapModels = new InterviewSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static InterviewSoap[][] toSoapModels(Interview[][] models) {
        InterviewSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new InterviewSoap[models.length][models[0].length];
        } else {
            soapModels = new InterviewSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static InterviewSoap[] toSoapModels(List<Interview> models) {
        List<InterviewSoap> soapModels = new ArrayList<InterviewSoap>(models.size());

        for (Interview model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new InterviewSoap[soapModels.size()]);
    }

    public long getPrimaryKey() {
        return _interviewId;
    }

    public void setPrimaryKey(long pk) {
        setInterviewId(pk);
    }

    public long getInterviewId() {
        return _interviewId;
    }

    public void setInterviewId(long interviewId) {
        _interviewId = interviewId;
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

    public String getName() {
        return _name;
    }

    public void setName(String name) {
        _name = name;
    }

    public Date getInterview_date() {
        return _interview_date;
    }

    public void setInterview_date(Date interview_date) {
        _interview_date = interview_date;
    }

    public String getInterview_time() {
        return _interview_time;
    }

    public void setInterview_time(String interview_time) {
        _interview_time = interview_time;
    }
}
