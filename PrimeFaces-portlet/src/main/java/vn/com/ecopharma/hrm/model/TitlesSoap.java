package vn.com.ecopharma.hrm.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link vn.com.ecopharma.hrm.service.http.TitlesServiceSoap}.
 *
 * @author tvt
 * @see vn.com.ecopharma.hrm.service.http.TitlesServiceSoap
 * @generated
 */
public class TitlesSoap implements Serializable {
    private long _titlesId;
    private String _name;
    private long _groupId;
    private long _companyId;
    private long _userId;
    private Date _createDate;
    private Date _modifiedDate;

    public TitlesSoap() {
    }

    public static TitlesSoap toSoapModel(Titles model) {
        TitlesSoap soapModel = new TitlesSoap();

        soapModel.setTitlesId(model.getTitlesId());
        soapModel.setName(model.getName());
        soapModel.setGroupId(model.getGroupId());
        soapModel.setCompanyId(model.getCompanyId());
        soapModel.setUserId(model.getUserId());
        soapModel.setCreateDate(model.getCreateDate());
        soapModel.setModifiedDate(model.getModifiedDate());

        return soapModel;
    }

    public static TitlesSoap[] toSoapModels(Titles[] models) {
        TitlesSoap[] soapModels = new TitlesSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static TitlesSoap[][] toSoapModels(Titles[][] models) {
        TitlesSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new TitlesSoap[models.length][models[0].length];
        } else {
            soapModels = new TitlesSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static TitlesSoap[] toSoapModels(List<Titles> models) {
        List<TitlesSoap> soapModels = new ArrayList<TitlesSoap>(models.size());

        for (Titles model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new TitlesSoap[soapModels.size()]);
    }

    public long getPrimaryKey() {
        return _titlesId;
    }

    public void setPrimaryKey(long pk) {
        setTitlesId(pk);
    }

    public long getTitlesId() {
        return _titlesId;
    }

    public void setTitlesId(long titlesId) {
        _titlesId = titlesId;
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
