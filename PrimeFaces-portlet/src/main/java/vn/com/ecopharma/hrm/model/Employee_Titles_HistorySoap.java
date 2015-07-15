package vn.com.ecopharma.hrm.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link vn.com.ecopharma.hrm.service.http.Employee_Titles_HistoryServiceSoap}.
 *
 * @author tvt
 * @see vn.com.ecopharma.hrm.service.http.Employee_Titles_HistoryServiceSoap
 * @generated
 */
public class Employee_Titles_HistorySoap implements Serializable {
    private long _employee_Titles_HistoryId;
    private long _employeeId;
    private long _titlesId;
    private Date _set_date;
    private String _note;
    private long _groupId;
    private long _companyId;
    private long _userId;
    private Date _createDate;
    private Date _modifiedDate;

    public Employee_Titles_HistorySoap() {
    }

    public static Employee_Titles_HistorySoap toSoapModel(
        Employee_Titles_History model) {
        Employee_Titles_HistorySoap soapModel = new Employee_Titles_HistorySoap();

        soapModel.setEmployee_Titles_HistoryId(model.getEmployee_Titles_HistoryId());
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

    public static Employee_Titles_HistorySoap[] toSoapModels(
        Employee_Titles_History[] models) {
        Employee_Titles_HistorySoap[] soapModels = new Employee_Titles_HistorySoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static Employee_Titles_HistorySoap[][] toSoapModels(
        Employee_Titles_History[][] models) {
        Employee_Titles_HistorySoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new Employee_Titles_HistorySoap[models.length][models[0].length];
        } else {
            soapModels = new Employee_Titles_HistorySoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static Employee_Titles_HistorySoap[] toSoapModels(
        List<Employee_Titles_History> models) {
        List<Employee_Titles_HistorySoap> soapModels = new ArrayList<Employee_Titles_HistorySoap>(models.size());

        for (Employee_Titles_History model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new Employee_Titles_HistorySoap[soapModels.size()]);
    }

    public long getPrimaryKey() {
        return _employee_Titles_HistoryId;
    }

    public void setPrimaryKey(long pk) {
        setEmployee_Titles_HistoryId(pk);
    }

    public long getEmployee_Titles_HistoryId() {
        return _employee_Titles_HistoryId;
    }

    public void setEmployee_Titles_HistoryId(long employee_Titles_HistoryId) {
        _employee_Titles_HistoryId = employee_Titles_HistoryId;
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
