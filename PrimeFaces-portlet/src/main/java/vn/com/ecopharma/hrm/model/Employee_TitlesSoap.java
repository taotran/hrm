package vn.com.ecopharma.hrm.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link vn.com.ecopharma.hrm.service.http.Employee_TitlesServiceSoap}.
 *
 * @author tvt
 * @see vn.com.ecopharma.hrm.service.http.Employee_TitlesServiceSoap
 * @generated
 */
public class Employee_TitlesSoap implements Serializable {
    private long _employee_TitlesId;
    private long _employeeId;
    private long _titlesId;
    private Date _set_date;
    private String _note;
    private long _groupId;
    private long _companyId;
    private long _userId;
    private Date _createDate;
    private Date _modifiedDate;

    public Employee_TitlesSoap() {
    }

    public static Employee_TitlesSoap toSoapModel(Employee_Titles model) {
        Employee_TitlesSoap soapModel = new Employee_TitlesSoap();

        soapModel.setEmployee_TitlesId(model.getEmployee_TitlesId());
        soapModel.setEmployeeId(model.getEmployeeId());
        soapModel.setTitlesId(model.getTitlesId());
        soapModel.setSet_date(model.getSet_date());
        soapModel.setNote(model.getNote());
        soapModel.setGroupId(model.getGroupId());
        soapModel.setCompanyId(model.getCompanyId());
        soapModel.setUserId(model.getUserId());
        soapModel.setCreateDate(model.getCreateDate());
        soapModel.setModifiedDate(model.getModifiedDate());

        return soapModel;
    }

    public static Employee_TitlesSoap[] toSoapModels(Employee_Titles[] models) {
        Employee_TitlesSoap[] soapModels = new Employee_TitlesSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static Employee_TitlesSoap[][] toSoapModels(
        Employee_Titles[][] models) {
        Employee_TitlesSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new Employee_TitlesSoap[models.length][models[0].length];
        } else {
            soapModels = new Employee_TitlesSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static Employee_TitlesSoap[] toSoapModels(
        List<Employee_Titles> models) {
        List<Employee_TitlesSoap> soapModels = new ArrayList<Employee_TitlesSoap>(models.size());

        for (Employee_Titles model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new Employee_TitlesSoap[soapModels.size()]);
    }

    public long getPrimaryKey() {
        return _employee_TitlesId;
    }

    public void setPrimaryKey(long pk) {
        setEmployee_TitlesId(pk);
    }

    public long getEmployee_TitlesId() {
        return _employee_TitlesId;
    }

    public void setEmployee_TitlesId(long employee_TitlesId) {
        _employee_TitlesId = employee_TitlesId;
    }

    public long getEmployeeId() {
        return _employeeId;
    }

    public void setEmployeeId(long employeeId) {
        _employeeId = employeeId;
    }

    public long getTitlesId() {
        return _titlesId;
    }

    public void setTitlesId(long titlesId) {
        _titlesId = titlesId;
    }

    public Date getSet_date() {
        return _set_date;
    }

    public void setSet_date(Date set_date) {
        _set_date = set_date;
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
