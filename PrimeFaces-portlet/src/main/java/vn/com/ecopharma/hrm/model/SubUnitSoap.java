package vn.com.ecopharma.hrm.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link vn.com.ecopharma.hrm.service.http.SubUnitServiceSoap}.
 *
 * @author tvt
 * @see vn.com.ecopharma.hrm.service.http.SubUnitServiceSoap
 * @generated
 */
public class SubUnitSoap implements Serializable {
    private long _subUnitId;
    private String _name;
    private long _groupId;
    private long _companyId;
    private long _userId;
    private Date _createDate;
    private Date _modifiedDate;

    public SubUnitSoap() {
    }

    public static SubUnitSoap toSoapModel(SubUnit model) {
        SubUnitSoap soapModel = new SubUnitSoap();

        soapModel.setSubUnitId(model.getSubUnitId());
        soapModel.setName(model.getName());
        soapModel.setGroupId(model.getGroupId());
        soapModel.setCompanyId(model.getCompanyId());
        soapModel.setUserId(model.getUserId());
        soapModel.setCreateDate(model.getCreateDate());
        soapModel.setModifiedDate(model.getModifiedDate());

        return soapModel;
    }

    public static SubUnitSoap[] toSoapModels(SubUnit[] models) {
        SubUnitSoap[] soapModels = new SubUnitSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static SubUnitSoap[][] toSoapModels(SubUnit[][] models) {
        SubUnitSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new SubUnitSoap[models.length][models[0].length];
        } else {
            soapModels = new SubUnitSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static SubUnitSoap[] toSoapModels(List<SubUnit> models) {
        List<SubUnitSoap> soapModels = new ArrayList<SubUnitSoap>(models.size());

        for (SubUnit model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new SubUnitSoap[soapModels.size()]);
    }

    public long getPrimaryKey() {
        return _subUnitId;
    }

    public void setPrimaryKey(long pk) {
        setSubUnitId(pk);
    }

    public long getSubUnitId() {
        return _subUnitId;
    }

    public void setSubUnitId(long subUnitId) {
        _subUnitId = subUnitId;
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
