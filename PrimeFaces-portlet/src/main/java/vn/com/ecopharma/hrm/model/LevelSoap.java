package vn.com.ecopharma.hrm.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link vn.com.ecopharma.hrm.service.http.LevelServiceSoap}.
 *
 * @author tvt
 * @see vn.com.ecopharma.hrm.service.http.LevelServiceSoap
 * @generated
 */
public class LevelSoap implements Serializable {
    private long _levelId;
    private String _name;
    private long _groupId;
    private long _companyId;
    private long _userId;
    private Date _createDate;
    private Date _modifiedDate;

    public LevelSoap() {
    }

    public static LevelSoap toSoapModel(Level model) {
        LevelSoap soapModel = new LevelSoap();

        soapModel.setLevelId(model.getLevelId());
        soapModel.setName(model.getName());
        soapModel.setGroupId(model.getGroupId());
        soapModel.setCompanyId(model.getCompanyId());
        soapModel.setUserId(model.getUserId());
        soapModel.setCreateDate(model.getCreateDate());
        soapModel.setModifiedDate(model.getModifiedDate());

        return soapModel;
    }

    public static LevelSoap[] toSoapModels(Level[] models) {
        LevelSoap[] soapModels = new LevelSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static LevelSoap[][] toSoapModels(Level[][] models) {
        LevelSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new LevelSoap[models.length][models[0].length];
        } else {
            soapModels = new LevelSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static LevelSoap[] toSoapModels(List<Level> models) {
        List<LevelSoap> soapModels = new ArrayList<LevelSoap>(models.size());

        for (Level model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new LevelSoap[soapModels.size()]);
    }

    public long getPrimaryKey() {
        return _levelId;
    }

    public void setPrimaryKey(long pk) {
        setLevelId(pk);
    }

    public long getLevelId() {
        return _levelId;
    }

    public void setLevelId(long levelId) {
        _levelId = levelId;
    }

    public String getName() {
        return _name;
    }

    public void setName(String name) {
        _name = name;
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
