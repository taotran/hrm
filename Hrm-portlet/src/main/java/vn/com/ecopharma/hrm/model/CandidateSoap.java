package vn.com.ecopharma.hrm.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link vn.com.ecopharma.hrm.service.http.CandidateServiceSoap}.
 *
 * @author tvt
 * @see vn.com.ecopharma.hrm.service.http.CandidateServiceSoap
 * @generated
 */
public class CandidateSoap implements Serializable {
    private long _c_id;
    private String _first_name;
    private String _middle_name;
    private String _last_name;
    private String _email;
    private String _contact_number;
    private String _comment;
    private int _mode_of_application;
    private Date _date_of_application;
    private long _cv_file_id;
    private String _cv_text_version;
    private String _keywords;
    private int _added_person;
    private long _user_id;
    private long _group_id;
    private long _interviewId;

    public CandidateSoap() {
    }

    public static CandidateSoap toSoapModel(Candidate model) {
        CandidateSoap soapModel = new CandidateSoap();

        soapModel.setC_id(model.getC_id());
        soapModel.setFirst_name(model.getFirst_name());
        soapModel.setMiddle_name(model.getMiddle_name());
        soapModel.setLast_name(model.getLast_name());
        soapModel.setEmail(model.getEmail());
        soapModel.setContact_number(model.getContact_number());
        soapModel.setComment(model.getComment());
        soapModel.setMode_of_application(model.getMode_of_application());
        soapModel.setDate_of_application(model.getDate_of_application());
        soapModel.setCv_file_id(model.getCv_file_id());
        soapModel.setCv_text_version(model.getCv_text_version());
        soapModel.setKeywords(model.getKeywords());
        soapModel.setAdded_person(model.getAdded_person());
        soapModel.setUser_id(model.getUser_id());
        soapModel.setGroup_id(model.getGroup_id());
        soapModel.setInterviewId(model.getInterviewId());

        return soapModel;
    }

    public static CandidateSoap[] toSoapModels(Candidate[] models) {
        CandidateSoap[] soapModels = new CandidateSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static CandidateSoap[][] toSoapModels(Candidate[][] models) {
        CandidateSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new CandidateSoap[models.length][models[0].length];
        } else {
            soapModels = new CandidateSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static CandidateSoap[] toSoapModels(List<Candidate> models) {
        List<CandidateSoap> soapModels = new ArrayList<CandidateSoap>(models.size());

        for (Candidate model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new CandidateSoap[soapModels.size()]);
    }

    public long getPrimaryKey() {
        return _c_id;
    }

    public void setPrimaryKey(long pk) {
        setC_id(pk);
    }

    public long getC_id() {
        return _c_id;
    }

    public void setC_id(long c_id) {
        _c_id = c_id;
    }

    public String getFirst_name() {
        return _first_name;
    }

    public void setFirst_name(String first_name) {
        _first_name = first_name;
    }

    public String getMiddle_name() {
        return _middle_name;
    }

    public void setMiddle_name(String middle_name) {
        _middle_name = middle_name;
    }

    public String getLast_name() {
        return _last_name;
    }

    public void setLast_name(String last_name) {
        _last_name = last_name;
    }

    public String getEmail() {
        return _email;
    }

    public void setEmail(String email) {
        _email = email;
    }

    public String getContact_number() {
        return _contact_number;
    }

    public void setContact_number(String contact_number) {
        _contact_number = contact_number;
    }

    public String getComment() {
        return _comment;
    }

    public void setComment(String comment) {
        _comment = comment;
    }

    public int getMode_of_application() {
        return _mode_of_application;
    }

    public void setMode_of_application(int mode_of_application) {
        _mode_of_application = mode_of_application;
    }

    public Date getDate_of_application() {
        return _date_of_application;
    }

    public void setDate_of_application(Date date_of_application) {
        _date_of_application = date_of_application;
    }

    public long getCv_file_id() {
        return _cv_file_id;
    }

    public void setCv_file_id(long cv_file_id) {
        _cv_file_id = cv_file_id;
    }

    public String getCv_text_version() {
        return _cv_text_version;
    }

    public void setCv_text_version(String cv_text_version) {
        _cv_text_version = cv_text_version;
    }

    public String getKeywords() {
        return _keywords;
    }

    public void setKeywords(String keywords) {
        _keywords = keywords;
    }

    public int getAdded_person() {
        return _added_person;
    }

    public void setAdded_person(int added_person) {
        _added_person = added_person;
    }

    public long getUser_id() {
        return _user_id;
    }

    public void setUser_id(long user_id) {
        _user_id = user_id;
    }

    public long getGroup_id() {
        return _group_id;
    }

    public void setGroup_id(long group_id) {
        _group_id = group_id;
    }

    public long getInterviewId() {
        return _interviewId;
    }

    public void setInterviewId(long interviewId) {
        _interviewId = interviewId;
    }
}
