package vn.com.ecopharma.hrm.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link vn.com.ecopharma.hrm.service.http.JTitleServiceSoap}.
 *
 * @author tvt
 * @see vn.com.ecopharma.hrm.service.http.JTitleServiceSoap
 * @generated
 */
public class JTitleSoap implements Serializable {
    private long _jobtitleId;
    private String _title;
    private String _description;
    private String _note;
    private boolean _isDeleted;
    private long _user_id;
    private long _group_id;

    public JTitleSoap() {
    }

    public static JTitleSoap toSoapModel(JTitle model) {
        JTitleSoap soapModel = new JTitleSoap();

        soapModel.setJobtitleId(model.getJobtitleId());
        soapModel.setTitle(model.getTitle());
        soapModel.setDescription(model.getDescription());
        soapModel.setNote(model.getNote());
        soapModel.setIsDeleted(model.getIsDeleted());
        soapModel.setUser_id(model.getUser_id());
        soapModel.setGroup_id(model.getGroup_id());

        return soapModel;
    }

    public static JTitleSoap[] toSoapModels(JTitle[] models) {
        JTitleSoap[] soapModels = new JTitleSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static JTitleSoap[][] toSoapModels(JTitle[][] models) {
        JTitleSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new JTitleSoap[models.length][models[0].length];
        } else {
            soapModels = new JTitleSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static JTitleSoap[] toSoapModels(List<JTitle> models) {
        List<JTitleSoap> soapModels = new ArrayList<JTitleSoap>(models.size());

        for (JTitle model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new JTitleSoap[soapModels.size()]);
    }

    public long getPrimaryKey() {
        return _jobtitleId;
    }

    public void setPrimaryKey(long pk) {
        setJobtitleId(pk);
    }

    public long getJobtitleId() {
        return _jobtitleId;
    }

    public void setJobtitleId(long jobtitleId) {
        _jobtitleId = jobtitleId;
    }

    public String getTitle() {
        return _title;
    }

    public void setTitle(String title) {
        _title = title;
    }

    public String getDescription() {
        return _description;
    }

    public void setDescription(String description) {
        _description = description;
    }

    public String getNote() {
        return _note;
    }

    public void setNote(String note) {
        _note = note;
    }

    public boolean getIsDeleted() {
        return _isDeleted;
    }

    public boolean isIsDeleted() {
        return _isDeleted;
    }

    public void setIsDeleted(boolean isDeleted) {
        _isDeleted = isDeleted;
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
}
