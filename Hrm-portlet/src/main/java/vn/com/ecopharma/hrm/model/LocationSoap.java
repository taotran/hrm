package vn.com.ecopharma.hrm.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link vn.com.ecopharma.hrm.service.http.LocationServiceSoap}.
 *
 * @author tvt
 * @see vn.com.ecopharma.hrm.service.http.LocationServiceSoap
 * @generated
 */
public class LocationSoap implements Serializable {
    private long _locationId;
    private long _groupId;
    private long _companyId;
    private long _userId;
    private Date _createDate;
    private Date _modifiedDate;
    private String _type;
    private String _name;
    private String _country_code;
    private String _province;
    private String _city;
    private String _address;
    private String _zip_code;
    private String _phone;
    private String _fax;
    private String _note;

    public LocationSoap() {
    }

    public static LocationSoap toSoapModel(Location model) {
        LocationSoap soapModel = new LocationSoap();

        soapModel.setLocationId(model.getLocationId());
        soapModel.setGroupId(model.getGroupId());
        soapModel.setCompanyId(model.getCompanyId());
        soapModel.setUserId(model.getUserId());
        soapModel.setCreateDate(model.getCreateDate());
        soapModel.setModifiedDate(model.getModifiedDate());
        soapModel.setType(model.getType());
        soapModel.setName(model.getName());
        soapModel.setCountry_code(model.getCountry_code());
        soapModel.setProvince(model.getProvince());
        soapModel.setCity(model.getCity());
        soapModel.setAddress(model.getAddress());
        soapModel.setZip_code(model.getZip_code());
        soapModel.setPhone(model.getPhone());
        soapModel.setFax(model.getFax());
        soapModel.setNote(model.getNote());

        return soapModel;
    }

    public static LocationSoap[] toSoapModels(Location[] models) {
        LocationSoap[] soapModels = new LocationSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static LocationSoap[][] toSoapModels(Location[][] models) {
        LocationSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new LocationSoap[models.length][models[0].length];
        } else {
            soapModels = new LocationSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static LocationSoap[] toSoapModels(List<Location> models) {
        List<LocationSoap> soapModels = new ArrayList<LocationSoap>(models.size());

        for (Location model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new LocationSoap[soapModels.size()]);
    }

    public long getPrimaryKey() {
        return _locationId;
    }

    public void setPrimaryKey(long pk) {
        setLocationId(pk);
    }

    public long getLocationId() {
        return _locationId;
    }

    public void setLocationId(long locationId) {
        _locationId = locationId;
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

    public String getType() {
        return _type;
    }

    public void setType(String type) {
        _type = type;
    }

    public String getName() {
        return _name;
    }

    public void setName(String name) {
        _name = name;
    }

    public String getCountry_code() {
        return _country_code;
    }

    public void setCountry_code(String country_code) {
        _country_code = country_code;
    }

    public String getProvince() {
        return _province;
    }

    public void setProvince(String province) {
        _province = province;
    }

    public String getCity() {
        return _city;
    }

    public void setCity(String city) {
        _city = city;
    }

    public String getAddress() {
        return _address;
    }

    public void setAddress(String address) {
        _address = address;
    }

    public String getZip_code() {
        return _zip_code;
    }

    public void setZip_code(String zip_code) {
        _zip_code = zip_code;
    }

    public String getPhone() {
        return _phone;
    }

    public void setPhone(String phone) {
        _phone = phone;
    }

    public String getFax() {
        return _fax;
    }

    public void setFax(String fax) {
        _fax = fax;
    }

    public String getNote() {
        return _note;
    }

    public void setNote(String note) {
        _note = note;
    }
}
