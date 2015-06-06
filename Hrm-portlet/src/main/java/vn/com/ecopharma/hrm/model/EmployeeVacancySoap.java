package vn.com.ecopharma.hrm.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link vn.com.ecopharma.hrm.service.http.EmployeeVacancyServiceSoap}.
 *
 * @author tvt
 * @see vn.com.ecopharma.hrm.service.http.EmployeeVacancyServiceSoap
 * @generated
 */
public class EmployeeVacancySoap implements Serializable {
    private long _employeeVacancyId;
    private long _employeeId;
    private long _v_id;
    private long _groupId;
    private long _companyId;
    private long _userId;
    private Date _createDate;
    private Date _modifiedDate;

    public EmployeeVacancySoap() {
    }

    public static EmployeeVacancySoap toSoapModel(EmployeeVacancy model) {
        EmployeeVacancySoap soapModel = new EmployeeVacancySoap();

        soapModel.setEmployeeVacancyId(model.getEmployeeVacancyId());
        soapModel.setEmployeeId(model.getEmployeeId());
        soapModel.setV_id(model.getV_id());
        soapModel.setGroupId(model.getGroupId());
        soapModel.setCompanyId(model.getCompanyId());
        soapModel.setUserId(model.getUserId());
        soapModel.setCreateDate(model.getCreateDate());
        soapModel.setModifiedDate(model.getModifiedDate());

        return soapModel;
    }

    public static EmployeeVacancySoap[] toSoapModels(EmployeeVacancy[] models) {
        EmployeeVacancySoap[] soapModels = new EmployeeVacancySoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static EmployeeVacancySoap[][] toSoapModels(
        EmployeeVacancy[][] models) {
        EmployeeVacancySoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new EmployeeVacancySoap[models.length][models[0].length];
        } else {
            soapModels = new EmployeeVacancySoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static EmployeeVacancySoap[] toSoapModels(
        List<EmployeeVacancy> models) {
        List<EmployeeVacancySoap> soapModels = new ArrayList<EmployeeVacancySoap>(models.size());

        for (EmployeeVacancy model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new EmployeeVacancySoap[soapModels.size()]);
    }

    public long getPrimaryKey() {
        return _employeeVacancyId;
    }

    public void setPrimaryKey(long pk) {
        setEmployeeVacancyId(pk);
    }

    public long getEmployeeVacancyId() {
        return _employeeVacancyId;
    }

    public void setEmployeeVacancyId(long employeeVacancyId) {
        _employeeVacancyId = employeeVacancyId;
    }

    public long getEmployeeId() {
        return _employeeId;
    }

    public void setEmployeeId(long employeeId) {
        _employeeId = employeeId;
    }

    public long getV_id() {
        return _v_id;
    }

    public void setV_id(long v_id) {
        _v_id = v_id;
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
