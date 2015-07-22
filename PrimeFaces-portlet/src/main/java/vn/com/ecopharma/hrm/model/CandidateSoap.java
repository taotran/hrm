package vn.com.ecopharma.hrm.model;

import java.io.Serializable;

import java.util.ArrayList;
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
}
