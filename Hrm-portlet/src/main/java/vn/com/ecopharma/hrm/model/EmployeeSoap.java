package vn.com.ecopharma.hrm.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link vn.com.ecopharma.hrm.service.http.EmployeeServiceSoap}.
 *
 * @author tvt
 * @see vn.com.ecopharma.hrm.service.http.EmployeeServiceSoap
 * @generated
 */
public class EmployeeSoap implements Serializable {
    private long _employeeId;
    private long _groupId;
    private long _companyId;
    private long _userId;
    private String _userName;
    private Date _createDate;
    private Date _modifiedDate;
    private String _emp_code;
    private String _firstname;
    private String _middle_name;
    private String _lastname;
    private String _email;
    private String _contact_number;
    private String _nickname;
    private Date _birthday;
    private String _gender;
    private String _marital_status;
    private String _status;
    private long _jobtitleId;
    private Date _joined_date;

    public EmployeeSoap() {
    }

    public static EmployeeSoap toSoapModel(Employee model) {
        EmployeeSoap soapModel = new EmployeeSoap();

        soapModel.setEmployeeId(model.getEmployeeId());
        soapModel.setGroupId(model.getGroupId());
        soapModel.setCompanyId(model.getCompanyId());
        soapModel.setUserId(model.getUserId());
        soapModel.setUserName(model.getUserName());
        soapModel.setCreateDate(model.getCreateDate());
        soapModel.setModifiedDate(model.getModifiedDate());
        soapModel.setEmp_code(model.getEmp_code());
        soapModel.setFirstname(model.getFirstname());
        soapModel.setMiddle_name(model.getMiddle_name());
        soapModel.setLastname(model.getLastname());
        soapModel.setEmail(model.getEmail());
        soapModel.setContact_number(model.getContact_number());
        soapModel.setNickname(model.getNickname());
        soapModel.setBirthday(model.getBirthday());
        soapModel.setGender(model.getGender());
        soapModel.setMarital_status(model.getMarital_status());
        soapModel.setStatus(model.getStatus());
        soapModel.setJobtitleId(model.getJobtitleId());
        soapModel.setJoined_date(model.getJoined_date());

        return soapModel;
    }

    public static EmployeeSoap[] toSoapModels(Employee[] models) {
        EmployeeSoap[] soapModels = new EmployeeSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static EmployeeSoap[][] toSoapModels(Employee[][] models) {
        EmployeeSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new EmployeeSoap[models.length][models[0].length];
        } else {
            soapModels = new EmployeeSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static EmployeeSoap[] toSoapModels(List<Employee> models) {
        List<EmployeeSoap> soapModels = new ArrayList<EmployeeSoap>(models.size());

        for (Employee model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new EmployeeSoap[soapModels.size()]);
    }

    public long getPrimaryKey() {
        return _employeeId;
    }

    public void setPrimaryKey(long pk) {
        setEmployeeId(pk);
    }

    public long getEmployeeId() {
        return _employeeId;
    }

    public void setEmployeeId(long employeeId) {
        _employeeId = employeeId;
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

    public String getUserName() {
        return _userName;
    }

    public void setUserName(String userName) {
        _userName = userName;
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

    public String getEmp_code() {
        return _emp_code;
    }

    public void setEmp_code(String emp_code) {
        _emp_code = emp_code;
    }

    public String getFirstname() {
        return _firstname;
    }

    public void setFirstname(String firstname) {
        _firstname = firstname;
    }

    public String getMiddle_name() {
        return _middle_name;
    }

    public void setMiddle_name(String middle_name) {
        _middle_name = middle_name;
    }

    public String getLastname() {
        return _lastname;
    }

    public void setLastname(String lastname) {
        _lastname = lastname;
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

    public String getNickname() {
        return _nickname;
    }

    public void setNickname(String nickname) {
        _nickname = nickname;
    }

    public Date getBirthday() {
        return _birthday;
    }

    public void setBirthday(Date birthday) {
        _birthday = birthday;
    }

    public String getGender() {
        return _gender;
    }

    public void setGender(String gender) {
        _gender = gender;
    }

    public String getMarital_status() {
        return _marital_status;
    }

    public void setMarital_status(String marital_status) {
        _marital_status = marital_status;
    }

    public String getStatus() {
        return _status;
    }

    public void setStatus(String status) {
        _status = status;
    }

    public long getJobtitleId() {
        return _jobtitleId;
    }

    public void setJobtitleId(long jobtitleId) {
        _jobtitleId = jobtitleId;
    }

    public Date getJoined_date() {
        return _joined_date;
    }

    public void setJoined_date(Date joined_date) {
        _joined_date = joined_date;
    }
}
