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
    private String _emp_code;
    private String _contact_number;
    private Date _birthday;
    private long _jobtitleId;
    private Date _joined_date;
    private long _subUnitId;
    private long _titlesId;
    private long _levelId;
    private Date _promoted_date;
    private Date _labour_contract_signed_date;
    private Date _labour_contract_expired_date;
    private String _labour_contract_type;
    private String _gender;
    private String _place_of_birth;
    private String _education;
    private String _education_specialize;
    private long _universityId;
    private String _marital_status;
    private String _identityCardNo;
    private Date _issued_date;
    private String _issued_place;
    private long _addressId;
    private String _company_email;
    private String _personal_tax_code;
    private int _number_of_dependents;
    private String _dependent_names;
    private String _social_insurance_no;
    private String _health_insurance_no;
    private String _bank_account_no;
    private String _bank_branch_name;
    private double _base_wage_rates;
    private double _position_wage_rates;
    private double _capacity_salary;
    private double _total_salary;
    private double _bonus;
    private Date _resigned_date;
    private long _employee_userId;
    private long _groupId;
    private long _companyId;
    private long _userId;
    private Date _createDate;
    private Date _modifiedDate;
    private boolean _isDeleted;
    private String _companyEmailAddress;

    public EmployeeSoap() {
    }

    public static EmployeeSoap toSoapModel(Employee model) {
        EmployeeSoap soapModel = new EmployeeSoap();

        soapModel.setEmployeeId(model.getEmployeeId());
        soapModel.setEmp_code(model.getEmp_code());
        soapModel.setContact_number(model.getContact_number());
        soapModel.setBirthday(model.getBirthday());
        soapModel.setJobtitleId(model.getJobtitleId());
        soapModel.setJoined_date(model.getJoined_date());
        soapModel.setSubUnitId(model.getSubUnitId());
        soapModel.setTitlesId(model.getTitlesId());
        soapModel.setLevelId(model.getLevelId());
        soapModel.setPromoted_date(model.getPromoted_date());
        soapModel.setLabour_contract_signed_date(model.getLabour_contract_signed_date());
        soapModel.setLabour_contract_expired_date(model.getLabour_contract_expired_date());
        soapModel.setLabour_contract_type(model.getLabour_contract_type());
        soapModel.setGender(model.getGender());
        soapModel.setPlace_of_birth(model.getPlace_of_birth());
        soapModel.setEducation(model.getEducation());
        soapModel.setEducation_specialize(model.getEducation_specialize());
        soapModel.setUniversityId(model.getUniversityId());
        soapModel.setMarital_status(model.getMarital_status());
        soapModel.setIdentityCardNo(model.getIdentityCardNo());
        soapModel.setIssued_date(model.getIssued_date());
        soapModel.setIssued_place(model.getIssued_place());
        soapModel.setAddressId(model.getAddressId());
        soapModel.setCompany_email(model.getCompany_email());
        soapModel.setPersonal_tax_code(model.getPersonal_tax_code());
        soapModel.setNumber_of_dependents(model.getNumber_of_dependents());
        soapModel.setDependent_names(model.getDependent_names());
        soapModel.setSocial_insurance_no(model.getSocial_insurance_no());
        soapModel.setHealth_insurance_no(model.getHealth_insurance_no());
        soapModel.setBank_account_no(model.getBank_account_no());
        soapModel.setBank_branch_name(model.getBank_branch_name());
        soapModel.setBase_wage_rates(model.getBase_wage_rates());
        soapModel.setPosition_wage_rates(model.getPosition_wage_rates());
        soapModel.setCapacity_salary(model.getCapacity_salary());
        soapModel.setTotal_salary(model.getTotal_salary());
        soapModel.setBonus(model.getBonus());
        soapModel.setResigned_date(model.getResigned_date());
        soapModel.setEmployee_userId(model.getEmployee_userId());
        soapModel.setGroupId(model.getGroupId());
        soapModel.setCompanyId(model.getCompanyId());
        soapModel.setUserId(model.getUserId());
        soapModel.setCreateDate(model.getCreateDate());
        soapModel.setModifiedDate(model.getModifiedDate());
        soapModel.setIsDeleted(model.getIsDeleted());
        soapModel.setCompanyEmailAddress(model.getCompanyEmailAddress());

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

    public String getEmp_code() {
        return _emp_code;
    }

    public void setEmp_code(String emp_code) {
        _emp_code = emp_code;
    }

    public String getContact_number() {
        return _contact_number;
    }

    public void setContact_number(String contact_number) {
        _contact_number = contact_number;
    }

    public Date getBirthday() {
        return _birthday;
    }

    public void setBirthday(Date birthday) {
        _birthday = birthday;
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

    public long getSubUnitId() {
        return _subUnitId;
    }

    public void setSubUnitId(long subUnitId) {
        _subUnitId = subUnitId;
    }

    public long getTitlesId() {
        return _titlesId;
    }

    public void setTitlesId(long titlesId) {
        _titlesId = titlesId;
    }

    public long getLevelId() {
        return _levelId;
    }

    public void setLevelId(long levelId) {
        _levelId = levelId;
    }

    public Date getPromoted_date() {
        return _promoted_date;
    }

    public void setPromoted_date(Date promoted_date) {
        _promoted_date = promoted_date;
    }

    public Date getLabour_contract_signed_date() {
        return _labour_contract_signed_date;
    }

    public void setLabour_contract_signed_date(Date labour_contract_signed_date) {
        _labour_contract_signed_date = labour_contract_signed_date;
    }

    public Date getLabour_contract_expired_date() {
        return _labour_contract_expired_date;
    }

    public void setLabour_contract_expired_date(
        Date labour_contract_expired_date) {
        _labour_contract_expired_date = labour_contract_expired_date;
    }

    public String getLabour_contract_type() {
        return _labour_contract_type;
    }

    public void setLabour_contract_type(String labour_contract_type) {
        _labour_contract_type = labour_contract_type;
    }

    public String getGender() {
        return _gender;
    }

    public void setGender(String gender) {
        _gender = gender;
    }

    public String getPlace_of_birth() {
        return _place_of_birth;
    }

    public void setPlace_of_birth(String place_of_birth) {
        _place_of_birth = place_of_birth;
    }

    public String getEducation() {
        return _education;
    }

    public void setEducation(String education) {
        _education = education;
    }

    public String getEducation_specialize() {
        return _education_specialize;
    }

    public void setEducation_specialize(String education_specialize) {
        _education_specialize = education_specialize;
    }

    public long getUniversityId() {
        return _universityId;
    }

    public void setUniversityId(long universityId) {
        _universityId = universityId;
    }

    public String getMarital_status() {
        return _marital_status;
    }

    public void setMarital_status(String marital_status) {
        _marital_status = marital_status;
    }

    public String getIdentityCardNo() {
        return _identityCardNo;
    }

    public void setIdentityCardNo(String identityCardNo) {
        _identityCardNo = identityCardNo;
    }

    public Date getIssued_date() {
        return _issued_date;
    }

    public void setIssued_date(Date issued_date) {
        _issued_date = issued_date;
    }

    public String getIssued_place() {
        return _issued_place;
    }

    public void setIssued_place(String issued_place) {
        _issued_place = issued_place;
    }

    public long getAddressId() {
        return _addressId;
    }

    public void setAddressId(long addressId) {
        _addressId = addressId;
    }

    public String getCompany_email() {
        return _company_email;
    }

    public void setCompany_email(String company_email) {
        _company_email = company_email;
    }

    public String getPersonal_tax_code() {
        return _personal_tax_code;
    }

    public void setPersonal_tax_code(String personal_tax_code) {
        _personal_tax_code = personal_tax_code;
    }

    public int getNumber_of_dependents() {
        return _number_of_dependents;
    }

    public void setNumber_of_dependents(int number_of_dependents) {
        _number_of_dependents = number_of_dependents;
    }

    public String getDependent_names() {
        return _dependent_names;
    }

    public void setDependent_names(String dependent_names) {
        _dependent_names = dependent_names;
    }

    public String getSocial_insurance_no() {
        return _social_insurance_no;
    }

    public void setSocial_insurance_no(String social_insurance_no) {
        _social_insurance_no = social_insurance_no;
    }

    public String getHealth_insurance_no() {
        return _health_insurance_no;
    }

    public void setHealth_insurance_no(String health_insurance_no) {
        _health_insurance_no = health_insurance_no;
    }

    public String getBank_account_no() {
        return _bank_account_no;
    }

    public void setBank_account_no(String bank_account_no) {
        _bank_account_no = bank_account_no;
    }

    public String getBank_branch_name() {
        return _bank_branch_name;
    }

    public void setBank_branch_name(String bank_branch_name) {
        _bank_branch_name = bank_branch_name;
    }

    public double getBase_wage_rates() {
        return _base_wage_rates;
    }

    public void setBase_wage_rates(double base_wage_rates) {
        _base_wage_rates = base_wage_rates;
    }

    public double getPosition_wage_rates() {
        return _position_wage_rates;
    }

    public void setPosition_wage_rates(double position_wage_rates) {
        _position_wage_rates = position_wage_rates;
    }

    public double getCapacity_salary() {
        return _capacity_salary;
    }

    public void setCapacity_salary(double capacity_salary) {
        _capacity_salary = capacity_salary;
    }

    public double getTotal_salary() {
        return _total_salary;
    }

    public void setTotal_salary(double total_salary) {
        _total_salary = total_salary;
    }

    public double getBonus() {
        return _bonus;
    }

    public void setBonus(double bonus) {
        _bonus = bonus;
    }

    public Date getResigned_date() {
        return _resigned_date;
    }

    public void setResigned_date(Date resigned_date) {
        _resigned_date = resigned_date;
    }

    public long getEmployee_userId() {
        return _employee_userId;
    }

    public void setEmployee_userId(long employee_userId) {
        _employee_userId = employee_userId;
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

    public boolean getIsDeleted() {
        return _isDeleted;
    }

    public boolean isIsDeleted() {
        return _isDeleted;
    }

    public void setIsDeleted(boolean isDeleted) {
        _isDeleted = isDeleted;
    }

    public String getCompanyEmailAddress() {
        return _companyEmailAddress;
    }

    public void setCompanyEmailAddress(String companyEmailAddress) {
        _companyEmailAddress = companyEmailAddress;
    }
}
