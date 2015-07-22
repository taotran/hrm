package vn.com.ecopharma.hrm.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.util.PortalUtil;

import vn.com.ecopharma.hrm.service.ClpSerializer;
import vn.com.ecopharma.hrm.service.EmployeeLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;


public class EmployeeClp extends BaseModelImpl<Employee> implements Employee {
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
    private String _userUuid;
    private Date _createDate;
    private Date _modifiedDate;
    private boolean _isDeleted;
    private String _companyEmailAddress;
    private BaseModel<?> _employeeRemoteModel;
    private Class<?> _clpSerializerClass = vn.com.ecopharma.hrm.service.ClpSerializer.class;

    public EmployeeClp() {
    }

    @Override
    public Class<?> getModelClass() {
        return Employee.class;
    }

    @Override
    public String getModelClassName() {
        return Employee.class.getName();
    }

    @Override
    public long getPrimaryKey() {
        return _employeeId;
    }

    @Override
    public void setPrimaryKey(long primaryKey) {
        setEmployeeId(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _employeeId;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Long) primaryKeyObj).longValue());
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("employeeId", getEmployeeId());
        attributes.put("emp_code", getEmp_code());
        attributes.put("contact_number", getContact_number());
        attributes.put("birthday", getBirthday());
        attributes.put("jobtitleId", getJobtitleId());
        attributes.put("joined_date", getJoined_date());
        attributes.put("subUnitId", getSubUnitId());
        attributes.put("titlesId", getTitlesId());
        attributes.put("levelId", getLevelId());
        attributes.put("promoted_date", getPromoted_date());
        attributes.put("labour_contract_signed_date",
            getLabour_contract_signed_date());
        attributes.put("labour_contract_expired_date",
            getLabour_contract_expired_date());
        attributes.put("labour_contract_type", getLabour_contract_type());
        attributes.put("gender", getGender());
        attributes.put("place_of_birth", getPlace_of_birth());
        attributes.put("education", getEducation());
        attributes.put("education_specialize", getEducation_specialize());
        attributes.put("universityId", getUniversityId());
        attributes.put("marital_status", getMarital_status());
        attributes.put("identityCardNo", getIdentityCardNo());
        attributes.put("issued_date", getIssued_date());
        attributes.put("issued_place", getIssued_place());
        attributes.put("addressId", getAddressId());
        attributes.put("company_email", getCompany_email());
        attributes.put("personal_tax_code", getPersonal_tax_code());
        attributes.put("number_of_dependents", getNumber_of_dependents());
        attributes.put("dependent_names", getDependent_names());
        attributes.put("social_insurance_no", getSocial_insurance_no());
        attributes.put("health_insurance_no", getHealth_insurance_no());
        attributes.put("bank_account_no", getBank_account_no());
        attributes.put("bank_branch_name", getBank_branch_name());
        attributes.put("base_wage_rates", getBase_wage_rates());
        attributes.put("position_wage_rates", getPosition_wage_rates());
        attributes.put("capacity_salary", getCapacity_salary());
        attributes.put("total_salary", getTotal_salary());
        attributes.put("bonus", getBonus());
        attributes.put("resigned_date", getResigned_date());
        attributes.put("employee_userId", getEmployee_userId());
        attributes.put("groupId", getGroupId());
        attributes.put("companyId", getCompanyId());
        attributes.put("userId", getUserId());
        attributes.put("createDate", getCreateDate());
        attributes.put("modifiedDate", getModifiedDate());
        attributes.put("isDeleted", getIsDeleted());
        attributes.put("companyEmailAddress", getCompanyEmailAddress());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long employeeId = (Long) attributes.get("employeeId");

        if (employeeId != null) {
            setEmployeeId(employeeId);
        }

        String emp_code = (String) attributes.get("emp_code");

        if (emp_code != null) {
            setEmp_code(emp_code);
        }

        String contact_number = (String) attributes.get("contact_number");

        if (contact_number != null) {
            setContact_number(contact_number);
        }

        Date birthday = (Date) attributes.get("birthday");

        if (birthday != null) {
            setBirthday(birthday);
        }

        Long jobtitleId = (Long) attributes.get("jobtitleId");

        if (jobtitleId != null) {
            setJobtitleId(jobtitleId);
        }

        Date joined_date = (Date) attributes.get("joined_date");

        if (joined_date != null) {
            setJoined_date(joined_date);
        }

        Long subUnitId = (Long) attributes.get("subUnitId");

        if (subUnitId != null) {
            setSubUnitId(subUnitId);
        }

        Long titlesId = (Long) attributes.get("titlesId");

        if (titlesId != null) {
            setTitlesId(titlesId);
        }

        Long levelId = (Long) attributes.get("levelId");

        if (levelId != null) {
            setLevelId(levelId);
        }

        Date promoted_date = (Date) attributes.get("promoted_date");

        if (promoted_date != null) {
            setPromoted_date(promoted_date);
        }

        Date labour_contract_signed_date = (Date) attributes.get(
                "labour_contract_signed_date");

        if (labour_contract_signed_date != null) {
            setLabour_contract_signed_date(labour_contract_signed_date);
        }

        Date labour_contract_expired_date = (Date) attributes.get(
                "labour_contract_expired_date");

        if (labour_contract_expired_date != null) {
            setLabour_contract_expired_date(labour_contract_expired_date);
        }

        String labour_contract_type = (String) attributes.get(
                "labour_contract_type");

        if (labour_contract_type != null) {
            setLabour_contract_type(labour_contract_type);
        }

        String gender = (String) attributes.get("gender");

        if (gender != null) {
            setGender(gender);
        }

        String place_of_birth = (String) attributes.get("place_of_birth");

        if (place_of_birth != null) {
            setPlace_of_birth(place_of_birth);
        }

        String education = (String) attributes.get("education");

        if (education != null) {
            setEducation(education);
        }

        String education_specialize = (String) attributes.get(
                "education_specialize");

        if (education_specialize != null) {
            setEducation_specialize(education_specialize);
        }

        Long universityId = (Long) attributes.get("universityId");

        if (universityId != null) {
            setUniversityId(universityId);
        }

        String marital_status = (String) attributes.get("marital_status");

        if (marital_status != null) {
            setMarital_status(marital_status);
        }

        String identityCardNo = (String) attributes.get("identityCardNo");

        if (identityCardNo != null) {
            setIdentityCardNo(identityCardNo);
        }

        Date issued_date = (Date) attributes.get("issued_date");

        if (issued_date != null) {
            setIssued_date(issued_date);
        }

        String issued_place = (String) attributes.get("issued_place");

        if (issued_place != null) {
            setIssued_place(issued_place);
        }

        Long addressId = (Long) attributes.get("addressId");

        if (addressId != null) {
            setAddressId(addressId);
        }

        String company_email = (String) attributes.get("company_email");

        if (company_email != null) {
            setCompany_email(company_email);
        }

        String personal_tax_code = (String) attributes.get("personal_tax_code");

        if (personal_tax_code != null) {
            setPersonal_tax_code(personal_tax_code);
        }

        Integer number_of_dependents = (Integer) attributes.get(
                "number_of_dependents");

        if (number_of_dependents != null) {
            setNumber_of_dependents(number_of_dependents);
        }

        String dependent_names = (String) attributes.get("dependent_names");

        if (dependent_names != null) {
            setDependent_names(dependent_names);
        }

        String social_insurance_no = (String) attributes.get(
                "social_insurance_no");

        if (social_insurance_no != null) {
            setSocial_insurance_no(social_insurance_no);
        }

        String health_insurance_no = (String) attributes.get(
                "health_insurance_no");

        if (health_insurance_no != null) {
            setHealth_insurance_no(health_insurance_no);
        }

        String bank_account_no = (String) attributes.get("bank_account_no");

        if (bank_account_no != null) {
            setBank_account_no(bank_account_no);
        }

        String bank_branch_name = (String) attributes.get("bank_branch_name");

        if (bank_branch_name != null) {
            setBank_branch_name(bank_branch_name);
        }

        Double base_wage_rates = (Double) attributes.get("base_wage_rates");

        if (base_wage_rates != null) {
            setBase_wage_rates(base_wage_rates);
        }

        Double position_wage_rates = (Double) attributes.get(
                "position_wage_rates");

        if (position_wage_rates != null) {
            setPosition_wage_rates(position_wage_rates);
        }

        Double capacity_salary = (Double) attributes.get("capacity_salary");

        if (capacity_salary != null) {
            setCapacity_salary(capacity_salary);
        }

        Double total_salary = (Double) attributes.get("total_salary");

        if (total_salary != null) {
            setTotal_salary(total_salary);
        }

        Double bonus = (Double) attributes.get("bonus");

        if (bonus != null) {
            setBonus(bonus);
        }

        Date resigned_date = (Date) attributes.get("resigned_date");

        if (resigned_date != null) {
            setResigned_date(resigned_date);
        }

        Long employee_userId = (Long) attributes.get("employee_userId");

        if (employee_userId != null) {
            setEmployee_userId(employee_userId);
        }

        Long groupId = (Long) attributes.get("groupId");

        if (groupId != null) {
            setGroupId(groupId);
        }

        Long companyId = (Long) attributes.get("companyId");

        if (companyId != null) {
            setCompanyId(companyId);
        }

        Long userId = (Long) attributes.get("userId");

        if (userId != null) {
            setUserId(userId);
        }

        Date createDate = (Date) attributes.get("createDate");

        if (createDate != null) {
            setCreateDate(createDate);
        }

        Date modifiedDate = (Date) attributes.get("modifiedDate");

        if (modifiedDate != null) {
            setModifiedDate(modifiedDate);
        }

        Boolean isDeleted = (Boolean) attributes.get("isDeleted");

        if (isDeleted != null) {
            setIsDeleted(isDeleted);
        }

        String companyEmailAddress = (String) attributes.get(
                "companyEmailAddress");

        if (companyEmailAddress != null) {
            setCompanyEmailAddress(companyEmailAddress);
        }
    }

    @Override
    public long getEmployeeId() {
        return _employeeId;
    }

    @Override
    public void setEmployeeId(long employeeId) {
        _employeeId = employeeId;

        if (_employeeRemoteModel != null) {
            try {
                Class<?> clazz = _employeeRemoteModel.getClass();

                Method method = clazz.getMethod("setEmployeeId", long.class);

                method.invoke(_employeeRemoteModel, employeeId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getEmp_code() {
        return _emp_code;
    }

    @Override
    public void setEmp_code(String emp_code) {
        _emp_code = emp_code;

        if (_employeeRemoteModel != null) {
            try {
                Class<?> clazz = _employeeRemoteModel.getClass();

                Method method = clazz.getMethod("setEmp_code", String.class);

                method.invoke(_employeeRemoteModel, emp_code);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getContact_number() {
        return _contact_number;
    }

    @Override
    public void setContact_number(String contact_number) {
        _contact_number = contact_number;

        if (_employeeRemoteModel != null) {
            try {
                Class<?> clazz = _employeeRemoteModel.getClass();

                Method method = clazz.getMethod("setContact_number",
                        String.class);

                method.invoke(_employeeRemoteModel, contact_number);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public Date getBirthday() {
        return _birthday;
    }

    @Override
    public void setBirthday(Date birthday) {
        _birthday = birthday;

        if (_employeeRemoteModel != null) {
            try {
                Class<?> clazz = _employeeRemoteModel.getClass();

                Method method = clazz.getMethod("setBirthday", Date.class);

                method.invoke(_employeeRemoteModel, birthday);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getJobtitleId() {
        return _jobtitleId;
    }

    @Override
    public void setJobtitleId(long jobtitleId) {
        _jobtitleId = jobtitleId;

        if (_employeeRemoteModel != null) {
            try {
                Class<?> clazz = _employeeRemoteModel.getClass();

                Method method = clazz.getMethod("setJobtitleId", long.class);

                method.invoke(_employeeRemoteModel, jobtitleId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public Date getJoined_date() {
        return _joined_date;
    }

    @Override
    public void setJoined_date(Date joined_date) {
        _joined_date = joined_date;

        if (_employeeRemoteModel != null) {
            try {
                Class<?> clazz = _employeeRemoteModel.getClass();

                Method method = clazz.getMethod("setJoined_date", Date.class);

                method.invoke(_employeeRemoteModel, joined_date);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getSubUnitId() {
        return _subUnitId;
    }

    @Override
    public void setSubUnitId(long subUnitId) {
        _subUnitId = subUnitId;

        if (_employeeRemoteModel != null) {
            try {
                Class<?> clazz = _employeeRemoteModel.getClass();

                Method method = clazz.getMethod("setSubUnitId", long.class);

                method.invoke(_employeeRemoteModel, subUnitId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getTitlesId() {
        return _titlesId;
    }

    @Override
    public void setTitlesId(long titlesId) {
        _titlesId = titlesId;

        if (_employeeRemoteModel != null) {
            try {
                Class<?> clazz = _employeeRemoteModel.getClass();

                Method method = clazz.getMethod("setTitlesId", long.class);

                method.invoke(_employeeRemoteModel, titlesId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getLevelId() {
        return _levelId;
    }

    @Override
    public void setLevelId(long levelId) {
        _levelId = levelId;

        if (_employeeRemoteModel != null) {
            try {
                Class<?> clazz = _employeeRemoteModel.getClass();

                Method method = clazz.getMethod("setLevelId", long.class);

                method.invoke(_employeeRemoteModel, levelId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public Date getPromoted_date() {
        return _promoted_date;
    }

    @Override
    public void setPromoted_date(Date promoted_date) {
        _promoted_date = promoted_date;

        if (_employeeRemoteModel != null) {
            try {
                Class<?> clazz = _employeeRemoteModel.getClass();

                Method method = clazz.getMethod("setPromoted_date", Date.class);

                method.invoke(_employeeRemoteModel, promoted_date);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public Date getLabour_contract_signed_date() {
        return _labour_contract_signed_date;
    }

    @Override
    public void setLabour_contract_signed_date(Date labour_contract_signed_date) {
        _labour_contract_signed_date = labour_contract_signed_date;

        if (_employeeRemoteModel != null) {
            try {
                Class<?> clazz = _employeeRemoteModel.getClass();

                Method method = clazz.getMethod("setLabour_contract_signed_date",
                        Date.class);

                method.invoke(_employeeRemoteModel, labour_contract_signed_date);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public Date getLabour_contract_expired_date() {
        return _labour_contract_expired_date;
    }

    @Override
    public void setLabour_contract_expired_date(
        Date labour_contract_expired_date) {
        _labour_contract_expired_date = labour_contract_expired_date;

        if (_employeeRemoteModel != null) {
            try {
                Class<?> clazz = _employeeRemoteModel.getClass();

                Method method = clazz.getMethod("setLabour_contract_expired_date",
                        Date.class);

                method.invoke(_employeeRemoteModel, labour_contract_expired_date);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getLabour_contract_type() {
        return _labour_contract_type;
    }

    @Override
    public void setLabour_contract_type(String labour_contract_type) {
        _labour_contract_type = labour_contract_type;

        if (_employeeRemoteModel != null) {
            try {
                Class<?> clazz = _employeeRemoteModel.getClass();

                Method method = clazz.getMethod("setLabour_contract_type",
                        String.class);

                method.invoke(_employeeRemoteModel, labour_contract_type);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getGender() {
        return _gender;
    }

    @Override
    public void setGender(String gender) {
        _gender = gender;

        if (_employeeRemoteModel != null) {
            try {
                Class<?> clazz = _employeeRemoteModel.getClass();

                Method method = clazz.getMethod("setGender", String.class);

                method.invoke(_employeeRemoteModel, gender);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getPlace_of_birth() {
        return _place_of_birth;
    }

    @Override
    public void setPlace_of_birth(String place_of_birth) {
        _place_of_birth = place_of_birth;

        if (_employeeRemoteModel != null) {
            try {
                Class<?> clazz = _employeeRemoteModel.getClass();

                Method method = clazz.getMethod("setPlace_of_birth",
                        String.class);

                method.invoke(_employeeRemoteModel, place_of_birth);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getEducation() {
        return _education;
    }

    @Override
    public void setEducation(String education) {
        _education = education;

        if (_employeeRemoteModel != null) {
            try {
                Class<?> clazz = _employeeRemoteModel.getClass();

                Method method = clazz.getMethod("setEducation", String.class);

                method.invoke(_employeeRemoteModel, education);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getEducation_specialize() {
        return _education_specialize;
    }

    @Override
    public void setEducation_specialize(String education_specialize) {
        _education_specialize = education_specialize;

        if (_employeeRemoteModel != null) {
            try {
                Class<?> clazz = _employeeRemoteModel.getClass();

                Method method = clazz.getMethod("setEducation_specialize",
                        String.class);

                method.invoke(_employeeRemoteModel, education_specialize);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getUniversityId() {
        return _universityId;
    }

    @Override
    public void setUniversityId(long universityId) {
        _universityId = universityId;

        if (_employeeRemoteModel != null) {
            try {
                Class<?> clazz = _employeeRemoteModel.getClass();

                Method method = clazz.getMethod("setUniversityId", long.class);

                method.invoke(_employeeRemoteModel, universityId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getMarital_status() {
        return _marital_status;
    }

    @Override
    public void setMarital_status(String marital_status) {
        _marital_status = marital_status;

        if (_employeeRemoteModel != null) {
            try {
                Class<?> clazz = _employeeRemoteModel.getClass();

                Method method = clazz.getMethod("setMarital_status",
                        String.class);

                method.invoke(_employeeRemoteModel, marital_status);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getIdentityCardNo() {
        return _identityCardNo;
    }

    @Override
    public void setIdentityCardNo(String identityCardNo) {
        _identityCardNo = identityCardNo;

        if (_employeeRemoteModel != null) {
            try {
                Class<?> clazz = _employeeRemoteModel.getClass();

                Method method = clazz.getMethod("setIdentityCardNo",
                        String.class);

                method.invoke(_employeeRemoteModel, identityCardNo);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public Date getIssued_date() {
        return _issued_date;
    }

    @Override
    public void setIssued_date(Date issued_date) {
        _issued_date = issued_date;

        if (_employeeRemoteModel != null) {
            try {
                Class<?> clazz = _employeeRemoteModel.getClass();

                Method method = clazz.getMethod("setIssued_date", Date.class);

                method.invoke(_employeeRemoteModel, issued_date);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getIssued_place() {
        return _issued_place;
    }

    @Override
    public void setIssued_place(String issued_place) {
        _issued_place = issued_place;

        if (_employeeRemoteModel != null) {
            try {
                Class<?> clazz = _employeeRemoteModel.getClass();

                Method method = clazz.getMethod("setIssued_place", String.class);

                method.invoke(_employeeRemoteModel, issued_place);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getAddressId() {
        return _addressId;
    }

    @Override
    public void setAddressId(long addressId) {
        _addressId = addressId;

        if (_employeeRemoteModel != null) {
            try {
                Class<?> clazz = _employeeRemoteModel.getClass();

                Method method = clazz.getMethod("setAddressId", long.class);

                method.invoke(_employeeRemoteModel, addressId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getCompany_email() {
        return _company_email;
    }

    @Override
    public void setCompany_email(String company_email) {
        _company_email = company_email;

        if (_employeeRemoteModel != null) {
            try {
                Class<?> clazz = _employeeRemoteModel.getClass();

                Method method = clazz.getMethod("setCompany_email", String.class);

                method.invoke(_employeeRemoteModel, company_email);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getPersonal_tax_code() {
        return _personal_tax_code;
    }

    @Override
    public void setPersonal_tax_code(String personal_tax_code) {
        _personal_tax_code = personal_tax_code;

        if (_employeeRemoteModel != null) {
            try {
                Class<?> clazz = _employeeRemoteModel.getClass();

                Method method = clazz.getMethod("setPersonal_tax_code",
                        String.class);

                method.invoke(_employeeRemoteModel, personal_tax_code);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getNumber_of_dependents() {
        return _number_of_dependents;
    }

    @Override
    public void setNumber_of_dependents(int number_of_dependents) {
        _number_of_dependents = number_of_dependents;

        if (_employeeRemoteModel != null) {
            try {
                Class<?> clazz = _employeeRemoteModel.getClass();

                Method method = clazz.getMethod("setNumber_of_dependents",
                        int.class);

                method.invoke(_employeeRemoteModel, number_of_dependents);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getDependent_names() {
        return _dependent_names;
    }

    @Override
    public void setDependent_names(String dependent_names) {
        _dependent_names = dependent_names;

        if (_employeeRemoteModel != null) {
            try {
                Class<?> clazz = _employeeRemoteModel.getClass();

                Method method = clazz.getMethod("setDependent_names",
                        String.class);

                method.invoke(_employeeRemoteModel, dependent_names);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getSocial_insurance_no() {
        return _social_insurance_no;
    }

    @Override
    public void setSocial_insurance_no(String social_insurance_no) {
        _social_insurance_no = social_insurance_no;

        if (_employeeRemoteModel != null) {
            try {
                Class<?> clazz = _employeeRemoteModel.getClass();

                Method method = clazz.getMethod("setSocial_insurance_no",
                        String.class);

                method.invoke(_employeeRemoteModel, social_insurance_no);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getHealth_insurance_no() {
        return _health_insurance_no;
    }

    @Override
    public void setHealth_insurance_no(String health_insurance_no) {
        _health_insurance_no = health_insurance_no;

        if (_employeeRemoteModel != null) {
            try {
                Class<?> clazz = _employeeRemoteModel.getClass();

                Method method = clazz.getMethod("setHealth_insurance_no",
                        String.class);

                method.invoke(_employeeRemoteModel, health_insurance_no);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getBank_account_no() {
        return _bank_account_no;
    }

    @Override
    public void setBank_account_no(String bank_account_no) {
        _bank_account_no = bank_account_no;

        if (_employeeRemoteModel != null) {
            try {
                Class<?> clazz = _employeeRemoteModel.getClass();

                Method method = clazz.getMethod("setBank_account_no",
                        String.class);

                method.invoke(_employeeRemoteModel, bank_account_no);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getBank_branch_name() {
        return _bank_branch_name;
    }

    @Override
    public void setBank_branch_name(String bank_branch_name) {
        _bank_branch_name = bank_branch_name;

        if (_employeeRemoteModel != null) {
            try {
                Class<?> clazz = _employeeRemoteModel.getClass();

                Method method = clazz.getMethod("setBank_branch_name",
                        String.class);

                method.invoke(_employeeRemoteModel, bank_branch_name);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public double getBase_wage_rates() {
        return _base_wage_rates;
    }

    @Override
    public void setBase_wage_rates(double base_wage_rates) {
        _base_wage_rates = base_wage_rates;

        if (_employeeRemoteModel != null) {
            try {
                Class<?> clazz = _employeeRemoteModel.getClass();

                Method method = clazz.getMethod("setBase_wage_rates",
                        double.class);

                method.invoke(_employeeRemoteModel, base_wage_rates);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public double getPosition_wage_rates() {
        return _position_wage_rates;
    }

    @Override
    public void setPosition_wage_rates(double position_wage_rates) {
        _position_wage_rates = position_wage_rates;

        if (_employeeRemoteModel != null) {
            try {
                Class<?> clazz = _employeeRemoteModel.getClass();

                Method method = clazz.getMethod("setPosition_wage_rates",
                        double.class);

                method.invoke(_employeeRemoteModel, position_wage_rates);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public double getCapacity_salary() {
        return _capacity_salary;
    }

    @Override
    public void setCapacity_salary(double capacity_salary) {
        _capacity_salary = capacity_salary;

        if (_employeeRemoteModel != null) {
            try {
                Class<?> clazz = _employeeRemoteModel.getClass();

                Method method = clazz.getMethod("setCapacity_salary",
                        double.class);

                method.invoke(_employeeRemoteModel, capacity_salary);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public double getTotal_salary() {
        return _total_salary;
    }

    @Override
    public void setTotal_salary(double total_salary) {
        _total_salary = total_salary;

        if (_employeeRemoteModel != null) {
            try {
                Class<?> clazz = _employeeRemoteModel.getClass();

                Method method = clazz.getMethod("setTotal_salary", double.class);

                method.invoke(_employeeRemoteModel, total_salary);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public double getBonus() {
        return _bonus;
    }

    @Override
    public void setBonus(double bonus) {
        _bonus = bonus;

        if (_employeeRemoteModel != null) {
            try {
                Class<?> clazz = _employeeRemoteModel.getClass();

                Method method = clazz.getMethod("setBonus", double.class);

                method.invoke(_employeeRemoteModel, bonus);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public Date getResigned_date() {
        return _resigned_date;
    }

    @Override
    public void setResigned_date(Date resigned_date) {
        _resigned_date = resigned_date;

        if (_employeeRemoteModel != null) {
            try {
                Class<?> clazz = _employeeRemoteModel.getClass();

                Method method = clazz.getMethod("setResigned_date", Date.class);

                method.invoke(_employeeRemoteModel, resigned_date);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getEmployee_userId() {
        return _employee_userId;
    }

    @Override
    public void setEmployee_userId(long employee_userId) {
        _employee_userId = employee_userId;

        if (_employeeRemoteModel != null) {
            try {
                Class<?> clazz = _employeeRemoteModel.getClass();

                Method method = clazz.getMethod("setEmployee_userId", long.class);

                method.invoke(_employeeRemoteModel, employee_userId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getGroupId() {
        return _groupId;
    }

    @Override
    public void setGroupId(long groupId) {
        _groupId = groupId;

        if (_employeeRemoteModel != null) {
            try {
                Class<?> clazz = _employeeRemoteModel.getClass();

                Method method = clazz.getMethod("setGroupId", long.class);

                method.invoke(_employeeRemoteModel, groupId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getCompanyId() {
        return _companyId;
    }

    @Override
    public void setCompanyId(long companyId) {
        _companyId = companyId;

        if (_employeeRemoteModel != null) {
            try {
                Class<?> clazz = _employeeRemoteModel.getClass();

                Method method = clazz.getMethod("setCompanyId", long.class);

                method.invoke(_employeeRemoteModel, companyId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getUserId() {
        return _userId;
    }

    @Override
    public void setUserId(long userId) {
        _userId = userId;

        if (_employeeRemoteModel != null) {
            try {
                Class<?> clazz = _employeeRemoteModel.getClass();

                Method method = clazz.getMethod("setUserId", long.class);

                method.invoke(_employeeRemoteModel, userId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getUserUuid() throws SystemException {
        return PortalUtil.getUserValue(getUserId(), "uuid", _userUuid);
    }

    @Override
    public void setUserUuid(String userUuid) {
        _userUuid = userUuid;
    }

    @Override
    public Date getCreateDate() {
        return _createDate;
    }

    @Override
    public void setCreateDate(Date createDate) {
        _createDate = createDate;

        if (_employeeRemoteModel != null) {
            try {
                Class<?> clazz = _employeeRemoteModel.getClass();

                Method method = clazz.getMethod("setCreateDate", Date.class);

                method.invoke(_employeeRemoteModel, createDate);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public Date getModifiedDate() {
        return _modifiedDate;
    }

    @Override
    public void setModifiedDate(Date modifiedDate) {
        _modifiedDate = modifiedDate;

        if (_employeeRemoteModel != null) {
            try {
                Class<?> clazz = _employeeRemoteModel.getClass();

                Method method = clazz.getMethod("setModifiedDate", Date.class);

                method.invoke(_employeeRemoteModel, modifiedDate);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public boolean getIsDeleted() {
        return _isDeleted;
    }

    @Override
    public boolean isIsDeleted() {
        return _isDeleted;
    }

    @Override
    public void setIsDeleted(boolean isDeleted) {
        _isDeleted = isDeleted;

        if (_employeeRemoteModel != null) {
            try {
                Class<?> clazz = _employeeRemoteModel.getClass();

                Method method = clazz.getMethod("setIsDeleted", boolean.class);

                method.invoke(_employeeRemoteModel, isDeleted);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getCompanyEmailAddress() {
        return _companyEmailAddress;
    }

    @Override
    public void setCompanyEmailAddress(String companyEmailAddress) {
        _companyEmailAddress = companyEmailAddress;

        if (_employeeRemoteModel != null) {
            try {
                Class<?> clazz = _employeeRemoteModel.getClass();

                Method method = clazz.getMethod("setCompanyEmailAddress",
                        String.class);

                method.invoke(_employeeRemoteModel, companyEmailAddress);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public BaseModel<?> getEmployeeRemoteModel() {
        return _employeeRemoteModel;
    }

    public void setEmployeeRemoteModel(BaseModel<?> employeeRemoteModel) {
        _employeeRemoteModel = employeeRemoteModel;
    }

    public Object invokeOnRemoteModel(String methodName,
        Class<?>[] parameterTypes, Object[] parameterValues)
        throws Exception {
        Object[] remoteParameterValues = new Object[parameterValues.length];

        for (int i = 0; i < parameterValues.length; i++) {
            if (parameterValues[i] != null) {
                remoteParameterValues[i] = ClpSerializer.translateInput(parameterValues[i]);
            }
        }

        Class<?> remoteModelClass = _employeeRemoteModel.getClass();

        ClassLoader remoteModelClassLoader = remoteModelClass.getClassLoader();

        Class<?>[] remoteParameterTypes = new Class[parameterTypes.length];

        for (int i = 0; i < parameterTypes.length; i++) {
            if (parameterTypes[i].isPrimitive()) {
                remoteParameterTypes[i] = parameterTypes[i];
            } else {
                String parameterTypeName = parameterTypes[i].getName();

                remoteParameterTypes[i] = remoteModelClassLoader.loadClass(parameterTypeName);
            }
        }

        Method method = remoteModelClass.getMethod(methodName,
                remoteParameterTypes);

        Object returnValue = method.invoke(_employeeRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            EmployeeLocalServiceUtil.addEmployee(this);
        } else {
            EmployeeLocalServiceUtil.updateEmployee(this);
        }
    }

    @Override
    public Employee toEscapedModel() {
        return (Employee) ProxyUtil.newProxyInstance(Employee.class.getClassLoader(),
            new Class[] { Employee.class }, new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        EmployeeClp clone = new EmployeeClp();

        clone.setEmployeeId(getEmployeeId());
        clone.setEmp_code(getEmp_code());
        clone.setContact_number(getContact_number());
        clone.setBirthday(getBirthday());
        clone.setJobtitleId(getJobtitleId());
        clone.setJoined_date(getJoined_date());
        clone.setSubUnitId(getSubUnitId());
        clone.setTitlesId(getTitlesId());
        clone.setLevelId(getLevelId());
        clone.setPromoted_date(getPromoted_date());
        clone.setLabour_contract_signed_date(getLabour_contract_signed_date());
        clone.setLabour_contract_expired_date(getLabour_contract_expired_date());
        clone.setLabour_contract_type(getLabour_contract_type());
        clone.setGender(getGender());
        clone.setPlace_of_birth(getPlace_of_birth());
        clone.setEducation(getEducation());
        clone.setEducation_specialize(getEducation_specialize());
        clone.setUniversityId(getUniversityId());
        clone.setMarital_status(getMarital_status());
        clone.setIdentityCardNo(getIdentityCardNo());
        clone.setIssued_date(getIssued_date());
        clone.setIssued_place(getIssued_place());
        clone.setAddressId(getAddressId());
        clone.setCompany_email(getCompany_email());
        clone.setPersonal_tax_code(getPersonal_tax_code());
        clone.setNumber_of_dependents(getNumber_of_dependents());
        clone.setDependent_names(getDependent_names());
        clone.setSocial_insurance_no(getSocial_insurance_no());
        clone.setHealth_insurance_no(getHealth_insurance_no());
        clone.setBank_account_no(getBank_account_no());
        clone.setBank_branch_name(getBank_branch_name());
        clone.setBase_wage_rates(getBase_wage_rates());
        clone.setPosition_wage_rates(getPosition_wage_rates());
        clone.setCapacity_salary(getCapacity_salary());
        clone.setTotal_salary(getTotal_salary());
        clone.setBonus(getBonus());
        clone.setResigned_date(getResigned_date());
        clone.setEmployee_userId(getEmployee_userId());
        clone.setGroupId(getGroupId());
        clone.setCompanyId(getCompanyId());
        clone.setUserId(getUserId());
        clone.setCreateDate(getCreateDate());
        clone.setModifiedDate(getModifiedDate());
        clone.setIsDeleted(getIsDeleted());
        clone.setCompanyEmailAddress(getCompanyEmailAddress());

        return clone;
    }

    @Override
    public int compareTo(Employee employee) {
        long primaryKey = employee.getPrimaryKey();

        if (getPrimaryKey() < primaryKey) {
            return -1;
        } else if (getPrimaryKey() > primaryKey) {
            return 1;
        } else {
            return 0;
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof EmployeeClp)) {
            return false;
        }

        EmployeeClp employee = (EmployeeClp) obj;

        long primaryKey = employee.getPrimaryKey();

        if (getPrimaryKey() == primaryKey) {
            return true;
        } else {
            return false;
        }
    }

    public Class<?> getClpSerializerClass() {
        return _clpSerializerClass;
    }

    @Override
    public int hashCode() {
        return (int) getPrimaryKey();
    }

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(91);

        sb.append("{employeeId=");
        sb.append(getEmployeeId());
        sb.append(", emp_code=");
        sb.append(getEmp_code());
        sb.append(", contact_number=");
        sb.append(getContact_number());
        sb.append(", birthday=");
        sb.append(getBirthday());
        sb.append(", jobtitleId=");
        sb.append(getJobtitleId());
        sb.append(", joined_date=");
        sb.append(getJoined_date());
        sb.append(", subUnitId=");
        sb.append(getSubUnitId());
        sb.append(", titlesId=");
        sb.append(getTitlesId());
        sb.append(", levelId=");
        sb.append(getLevelId());
        sb.append(", promoted_date=");
        sb.append(getPromoted_date());
        sb.append(", labour_contract_signed_date=");
        sb.append(getLabour_contract_signed_date());
        sb.append(", labour_contract_expired_date=");
        sb.append(getLabour_contract_expired_date());
        sb.append(", labour_contract_type=");
        sb.append(getLabour_contract_type());
        sb.append(", gender=");
        sb.append(getGender());
        sb.append(", place_of_birth=");
        sb.append(getPlace_of_birth());
        sb.append(", education=");
        sb.append(getEducation());
        sb.append(", education_specialize=");
        sb.append(getEducation_specialize());
        sb.append(", universityId=");
        sb.append(getUniversityId());
        sb.append(", marital_status=");
        sb.append(getMarital_status());
        sb.append(", identityCardNo=");
        sb.append(getIdentityCardNo());
        sb.append(", issued_date=");
        sb.append(getIssued_date());
        sb.append(", issued_place=");
        sb.append(getIssued_place());
        sb.append(", addressId=");
        sb.append(getAddressId());
        sb.append(", company_email=");
        sb.append(getCompany_email());
        sb.append(", personal_tax_code=");
        sb.append(getPersonal_tax_code());
        sb.append(", number_of_dependents=");
        sb.append(getNumber_of_dependents());
        sb.append(", dependent_names=");
        sb.append(getDependent_names());
        sb.append(", social_insurance_no=");
        sb.append(getSocial_insurance_no());
        sb.append(", health_insurance_no=");
        sb.append(getHealth_insurance_no());
        sb.append(", bank_account_no=");
        sb.append(getBank_account_no());
        sb.append(", bank_branch_name=");
        sb.append(getBank_branch_name());
        sb.append(", base_wage_rates=");
        sb.append(getBase_wage_rates());
        sb.append(", position_wage_rates=");
        sb.append(getPosition_wage_rates());
        sb.append(", capacity_salary=");
        sb.append(getCapacity_salary());
        sb.append(", total_salary=");
        sb.append(getTotal_salary());
        sb.append(", bonus=");
        sb.append(getBonus());
        sb.append(", resigned_date=");
        sb.append(getResigned_date());
        sb.append(", employee_userId=");
        sb.append(getEmployee_userId());
        sb.append(", groupId=");
        sb.append(getGroupId());
        sb.append(", companyId=");
        sb.append(getCompanyId());
        sb.append(", userId=");
        sb.append(getUserId());
        sb.append(", createDate=");
        sb.append(getCreateDate());
        sb.append(", modifiedDate=");
        sb.append(getModifiedDate());
        sb.append(", isDeleted=");
        sb.append(getIsDeleted());
        sb.append(", companyEmailAddress=");
        sb.append(getCompanyEmailAddress());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(139);

        sb.append("<model><model-name>");
        sb.append("vn.com.ecopharma.hrm.model.Employee");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>employeeId</column-name><column-value><![CDATA[");
        sb.append(getEmployeeId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>emp_code</column-name><column-value><![CDATA[");
        sb.append(getEmp_code());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>contact_number</column-name><column-value><![CDATA[");
        sb.append(getContact_number());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>birthday</column-name><column-value><![CDATA[");
        sb.append(getBirthday());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>jobtitleId</column-name><column-value><![CDATA[");
        sb.append(getJobtitleId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>joined_date</column-name><column-value><![CDATA[");
        sb.append(getJoined_date());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>subUnitId</column-name><column-value><![CDATA[");
        sb.append(getSubUnitId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>titlesId</column-name><column-value><![CDATA[");
        sb.append(getTitlesId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>levelId</column-name><column-value><![CDATA[");
        sb.append(getLevelId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>promoted_date</column-name><column-value><![CDATA[");
        sb.append(getPromoted_date());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>labour_contract_signed_date</column-name><column-value><![CDATA[");
        sb.append(getLabour_contract_signed_date());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>labour_contract_expired_date</column-name><column-value><![CDATA[");
        sb.append(getLabour_contract_expired_date());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>labour_contract_type</column-name><column-value><![CDATA[");
        sb.append(getLabour_contract_type());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>gender</column-name><column-value><![CDATA[");
        sb.append(getGender());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>place_of_birth</column-name><column-value><![CDATA[");
        sb.append(getPlace_of_birth());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>education</column-name><column-value><![CDATA[");
        sb.append(getEducation());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>education_specialize</column-name><column-value><![CDATA[");
        sb.append(getEducation_specialize());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>universityId</column-name><column-value><![CDATA[");
        sb.append(getUniversityId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>marital_status</column-name><column-value><![CDATA[");
        sb.append(getMarital_status());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>identityCardNo</column-name><column-value><![CDATA[");
        sb.append(getIdentityCardNo());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>issued_date</column-name><column-value><![CDATA[");
        sb.append(getIssued_date());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>issued_place</column-name><column-value><![CDATA[");
        sb.append(getIssued_place());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>addressId</column-name><column-value><![CDATA[");
        sb.append(getAddressId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>company_email</column-name><column-value><![CDATA[");
        sb.append(getCompany_email());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>personal_tax_code</column-name><column-value><![CDATA[");
        sb.append(getPersonal_tax_code());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>number_of_dependents</column-name><column-value><![CDATA[");
        sb.append(getNumber_of_dependents());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>dependent_names</column-name><column-value><![CDATA[");
        sb.append(getDependent_names());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>social_insurance_no</column-name><column-value><![CDATA[");
        sb.append(getSocial_insurance_no());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>health_insurance_no</column-name><column-value><![CDATA[");
        sb.append(getHealth_insurance_no());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>bank_account_no</column-name><column-value><![CDATA[");
        sb.append(getBank_account_no());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>bank_branch_name</column-name><column-value><![CDATA[");
        sb.append(getBank_branch_name());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>base_wage_rates</column-name><column-value><![CDATA[");
        sb.append(getBase_wage_rates());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>position_wage_rates</column-name><column-value><![CDATA[");
        sb.append(getPosition_wage_rates());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>capacity_salary</column-name><column-value><![CDATA[");
        sb.append(getCapacity_salary());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>total_salary</column-name><column-value><![CDATA[");
        sb.append(getTotal_salary());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>bonus</column-name><column-value><![CDATA[");
        sb.append(getBonus());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>resigned_date</column-name><column-value><![CDATA[");
        sb.append(getResigned_date());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>employee_userId</column-name><column-value><![CDATA[");
        sb.append(getEmployee_userId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>groupId</column-name><column-value><![CDATA[");
        sb.append(getGroupId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>companyId</column-name><column-value><![CDATA[");
        sb.append(getCompanyId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>userId</column-name><column-value><![CDATA[");
        sb.append(getUserId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>createDate</column-name><column-value><![CDATA[");
        sb.append(getCreateDate());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>modifiedDate</column-name><column-value><![CDATA[");
        sb.append(getModifiedDate());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>isDeleted</column-name><column-value><![CDATA[");
        sb.append(getIsDeleted());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>companyEmailAddress</column-name><column-value><![CDATA[");
        sb.append(getCompanyEmailAddress());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
