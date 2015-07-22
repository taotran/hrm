package vn.com.ecopharma.hrm.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import vn.com.ecopharma.hrm.model.Employee;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Employee in entity cache.
 *
 * @author tvt
 * @see Employee
 * @generated
 */
public class EmployeeCacheModel implements CacheModel<Employee>, Externalizable {
    public long employeeId;
    public String emp_code;
    public String contact_number;
    public long birthday;
    public long jobtitleId;
    public long joined_date;
    public long subUnitId;
    public long titlesId;
    public long levelId;
    public long promoted_date;
    public long labour_contract_signed_date;
    public long labour_contract_expired_date;
    public String labour_contract_type;
    public String gender;
    public String place_of_birth;
    public String education;
    public String education_specialize;
    public long universityId;
    public String marital_status;
    public String identityCardNo;
    public long issued_date;
    public String issued_place;
    public long addressId;
    public String company_email;
    public String personal_tax_code;
    public int number_of_dependents;
    public String dependent_names;
    public String social_insurance_no;
    public String health_insurance_no;
    public String bank_account_no;
    public String bank_branch_name;
    public double base_wage_rates;
    public double position_wage_rates;
    public double capacity_salary;
    public double total_salary;
    public double bonus;
    public long resigned_date;
    public long employee_userId;
    public long groupId;
    public long companyId;
    public long userId;
    public long createDate;
    public long modifiedDate;
    public boolean isDeleted;
    public String companyEmailAddress;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(91);

        sb.append("{employeeId=");
        sb.append(employeeId);
        sb.append(", emp_code=");
        sb.append(emp_code);
        sb.append(", contact_number=");
        sb.append(contact_number);
        sb.append(", birthday=");
        sb.append(birthday);
        sb.append(", jobtitleId=");
        sb.append(jobtitleId);
        sb.append(", joined_date=");
        sb.append(joined_date);
        sb.append(", subUnitId=");
        sb.append(subUnitId);
        sb.append(", titlesId=");
        sb.append(titlesId);
        sb.append(", levelId=");
        sb.append(levelId);
        sb.append(", promoted_date=");
        sb.append(promoted_date);
        sb.append(", labour_contract_signed_date=");
        sb.append(labour_contract_signed_date);
        sb.append(", labour_contract_expired_date=");
        sb.append(labour_contract_expired_date);
        sb.append(", labour_contract_type=");
        sb.append(labour_contract_type);
        sb.append(", gender=");
        sb.append(gender);
        sb.append(", place_of_birth=");
        sb.append(place_of_birth);
        sb.append(", education=");
        sb.append(education);
        sb.append(", education_specialize=");
        sb.append(education_specialize);
        sb.append(", universityId=");
        sb.append(universityId);
        sb.append(", marital_status=");
        sb.append(marital_status);
        sb.append(", identityCardNo=");
        sb.append(identityCardNo);
        sb.append(", issued_date=");
        sb.append(issued_date);
        sb.append(", issued_place=");
        sb.append(issued_place);
        sb.append(", addressId=");
        sb.append(addressId);
        sb.append(", company_email=");
        sb.append(company_email);
        sb.append(", personal_tax_code=");
        sb.append(personal_tax_code);
        sb.append(", number_of_dependents=");
        sb.append(number_of_dependents);
        sb.append(", dependent_names=");
        sb.append(dependent_names);
        sb.append(", social_insurance_no=");
        sb.append(social_insurance_no);
        sb.append(", health_insurance_no=");
        sb.append(health_insurance_no);
        sb.append(", bank_account_no=");
        sb.append(bank_account_no);
        sb.append(", bank_branch_name=");
        sb.append(bank_branch_name);
        sb.append(", base_wage_rates=");
        sb.append(base_wage_rates);
        sb.append(", position_wage_rates=");
        sb.append(position_wage_rates);
        sb.append(", capacity_salary=");
        sb.append(capacity_salary);
        sb.append(", total_salary=");
        sb.append(total_salary);
        sb.append(", bonus=");
        sb.append(bonus);
        sb.append(", resigned_date=");
        sb.append(resigned_date);
        sb.append(", employee_userId=");
        sb.append(employee_userId);
        sb.append(", groupId=");
        sb.append(groupId);
        sb.append(", companyId=");
        sb.append(companyId);
        sb.append(", userId=");
        sb.append(userId);
        sb.append(", createDate=");
        sb.append(createDate);
        sb.append(", modifiedDate=");
        sb.append(modifiedDate);
        sb.append(", isDeleted=");
        sb.append(isDeleted);
        sb.append(", companyEmailAddress=");
        sb.append(companyEmailAddress);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public Employee toEntityModel() {
        EmployeeImpl employeeImpl = new EmployeeImpl();

        employeeImpl.setEmployeeId(employeeId);

        if (emp_code == null) {
            employeeImpl.setEmp_code(StringPool.BLANK);
        } else {
            employeeImpl.setEmp_code(emp_code);
        }

        if (contact_number == null) {
            employeeImpl.setContact_number(StringPool.BLANK);
        } else {
            employeeImpl.setContact_number(contact_number);
        }

        if (birthday == Long.MIN_VALUE) {
            employeeImpl.setBirthday(null);
        } else {
            employeeImpl.setBirthday(new Date(birthday));
        }

        employeeImpl.setJobtitleId(jobtitleId);

        if (joined_date == Long.MIN_VALUE) {
            employeeImpl.setJoined_date(null);
        } else {
            employeeImpl.setJoined_date(new Date(joined_date));
        }

        employeeImpl.setSubUnitId(subUnitId);
        employeeImpl.setTitlesId(titlesId);
        employeeImpl.setLevelId(levelId);

        if (promoted_date == Long.MIN_VALUE) {
            employeeImpl.setPromoted_date(null);
        } else {
            employeeImpl.setPromoted_date(new Date(promoted_date));
        }

        if (labour_contract_signed_date == Long.MIN_VALUE) {
            employeeImpl.setLabour_contract_signed_date(null);
        } else {
            employeeImpl.setLabour_contract_signed_date(new Date(
                    labour_contract_signed_date));
        }

        if (labour_contract_expired_date == Long.MIN_VALUE) {
            employeeImpl.setLabour_contract_expired_date(null);
        } else {
            employeeImpl.setLabour_contract_expired_date(new Date(
                    labour_contract_expired_date));
        }

        if (labour_contract_type == null) {
            employeeImpl.setLabour_contract_type(StringPool.BLANK);
        } else {
            employeeImpl.setLabour_contract_type(labour_contract_type);
        }

        if (gender == null) {
            employeeImpl.setGender(StringPool.BLANK);
        } else {
            employeeImpl.setGender(gender);
        }

        if (place_of_birth == null) {
            employeeImpl.setPlace_of_birth(StringPool.BLANK);
        } else {
            employeeImpl.setPlace_of_birth(place_of_birth);
        }

        if (education == null) {
            employeeImpl.setEducation(StringPool.BLANK);
        } else {
            employeeImpl.setEducation(education);
        }

        if (education_specialize == null) {
            employeeImpl.setEducation_specialize(StringPool.BLANK);
        } else {
            employeeImpl.setEducation_specialize(education_specialize);
        }

        employeeImpl.setUniversityId(universityId);

        if (marital_status == null) {
            employeeImpl.setMarital_status(StringPool.BLANK);
        } else {
            employeeImpl.setMarital_status(marital_status);
        }

        if (identityCardNo == null) {
            employeeImpl.setIdentityCardNo(StringPool.BLANK);
        } else {
            employeeImpl.setIdentityCardNo(identityCardNo);
        }

        if (issued_date == Long.MIN_VALUE) {
            employeeImpl.setIssued_date(null);
        } else {
            employeeImpl.setIssued_date(new Date(issued_date));
        }

        if (issued_place == null) {
            employeeImpl.setIssued_place(StringPool.BLANK);
        } else {
            employeeImpl.setIssued_place(issued_place);
        }

        employeeImpl.setAddressId(addressId);

        if (company_email == null) {
            employeeImpl.setCompany_email(StringPool.BLANK);
        } else {
            employeeImpl.setCompany_email(company_email);
        }

        if (personal_tax_code == null) {
            employeeImpl.setPersonal_tax_code(StringPool.BLANK);
        } else {
            employeeImpl.setPersonal_tax_code(personal_tax_code);
        }

        employeeImpl.setNumber_of_dependents(number_of_dependents);

        if (dependent_names == null) {
            employeeImpl.setDependent_names(StringPool.BLANK);
        } else {
            employeeImpl.setDependent_names(dependent_names);
        }

        if (social_insurance_no == null) {
            employeeImpl.setSocial_insurance_no(StringPool.BLANK);
        } else {
            employeeImpl.setSocial_insurance_no(social_insurance_no);
        }

        if (health_insurance_no == null) {
            employeeImpl.setHealth_insurance_no(StringPool.BLANK);
        } else {
            employeeImpl.setHealth_insurance_no(health_insurance_no);
        }

        if (bank_account_no == null) {
            employeeImpl.setBank_account_no(StringPool.BLANK);
        } else {
            employeeImpl.setBank_account_no(bank_account_no);
        }

        if (bank_branch_name == null) {
            employeeImpl.setBank_branch_name(StringPool.BLANK);
        } else {
            employeeImpl.setBank_branch_name(bank_branch_name);
        }

        employeeImpl.setBase_wage_rates(base_wage_rates);
        employeeImpl.setPosition_wage_rates(position_wage_rates);
        employeeImpl.setCapacity_salary(capacity_salary);
        employeeImpl.setTotal_salary(total_salary);
        employeeImpl.setBonus(bonus);

        if (resigned_date == Long.MIN_VALUE) {
            employeeImpl.setResigned_date(null);
        } else {
            employeeImpl.setResigned_date(new Date(resigned_date));
        }

        employeeImpl.setEmployee_userId(employee_userId);
        employeeImpl.setGroupId(groupId);
        employeeImpl.setCompanyId(companyId);
        employeeImpl.setUserId(userId);

        if (createDate == Long.MIN_VALUE) {
            employeeImpl.setCreateDate(null);
        } else {
            employeeImpl.setCreateDate(new Date(createDate));
        }

        if (modifiedDate == Long.MIN_VALUE) {
            employeeImpl.setModifiedDate(null);
        } else {
            employeeImpl.setModifiedDate(new Date(modifiedDate));
        }

        employeeImpl.setIsDeleted(isDeleted);

        if (companyEmailAddress == null) {
            employeeImpl.setCompanyEmailAddress(StringPool.BLANK);
        } else {
            employeeImpl.setCompanyEmailAddress(companyEmailAddress);
        }

        employeeImpl.resetOriginalValues();

        return employeeImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        employeeId = objectInput.readLong();
        emp_code = objectInput.readUTF();
        contact_number = objectInput.readUTF();
        birthday = objectInput.readLong();
        jobtitleId = objectInput.readLong();
        joined_date = objectInput.readLong();
        subUnitId = objectInput.readLong();
        titlesId = objectInput.readLong();
        levelId = objectInput.readLong();
        promoted_date = objectInput.readLong();
        labour_contract_signed_date = objectInput.readLong();
        labour_contract_expired_date = objectInput.readLong();
        labour_contract_type = objectInput.readUTF();
        gender = objectInput.readUTF();
        place_of_birth = objectInput.readUTF();
        education = objectInput.readUTF();
        education_specialize = objectInput.readUTF();
        universityId = objectInput.readLong();
        marital_status = objectInput.readUTF();
        identityCardNo = objectInput.readUTF();
        issued_date = objectInput.readLong();
        issued_place = objectInput.readUTF();
        addressId = objectInput.readLong();
        company_email = objectInput.readUTF();
        personal_tax_code = objectInput.readUTF();
        number_of_dependents = objectInput.readInt();
        dependent_names = objectInput.readUTF();
        social_insurance_no = objectInput.readUTF();
        health_insurance_no = objectInput.readUTF();
        bank_account_no = objectInput.readUTF();
        bank_branch_name = objectInput.readUTF();
        base_wage_rates = objectInput.readDouble();
        position_wage_rates = objectInput.readDouble();
        capacity_salary = objectInput.readDouble();
        total_salary = objectInput.readDouble();
        bonus = objectInput.readDouble();
        resigned_date = objectInput.readLong();
        employee_userId = objectInput.readLong();
        groupId = objectInput.readLong();
        companyId = objectInput.readLong();
        userId = objectInput.readLong();
        createDate = objectInput.readLong();
        modifiedDate = objectInput.readLong();
        isDeleted = objectInput.readBoolean();
        companyEmailAddress = objectInput.readUTF();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeLong(employeeId);

        if (emp_code == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(emp_code);
        }

        if (contact_number == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(contact_number);
        }

        objectOutput.writeLong(birthday);
        objectOutput.writeLong(jobtitleId);
        objectOutput.writeLong(joined_date);
        objectOutput.writeLong(subUnitId);
        objectOutput.writeLong(titlesId);
        objectOutput.writeLong(levelId);
        objectOutput.writeLong(promoted_date);
        objectOutput.writeLong(labour_contract_signed_date);
        objectOutput.writeLong(labour_contract_expired_date);

        if (labour_contract_type == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(labour_contract_type);
        }

        if (gender == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(gender);
        }

        if (place_of_birth == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(place_of_birth);
        }

        if (education == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(education);
        }

        if (education_specialize == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(education_specialize);
        }

        objectOutput.writeLong(universityId);

        if (marital_status == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(marital_status);
        }

        if (identityCardNo == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(identityCardNo);
        }

        objectOutput.writeLong(issued_date);

        if (issued_place == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(issued_place);
        }

        objectOutput.writeLong(addressId);

        if (company_email == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(company_email);
        }

        if (personal_tax_code == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(personal_tax_code);
        }

        objectOutput.writeInt(number_of_dependents);

        if (dependent_names == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(dependent_names);
        }

        if (social_insurance_no == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(social_insurance_no);
        }

        if (health_insurance_no == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(health_insurance_no);
        }

        if (bank_account_no == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(bank_account_no);
        }

        if (bank_branch_name == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(bank_branch_name);
        }

        objectOutput.writeDouble(base_wage_rates);
        objectOutput.writeDouble(position_wage_rates);
        objectOutput.writeDouble(capacity_salary);
        objectOutput.writeDouble(total_salary);
        objectOutput.writeDouble(bonus);
        objectOutput.writeLong(resigned_date);
        objectOutput.writeLong(employee_userId);
        objectOutput.writeLong(groupId);
        objectOutput.writeLong(companyId);
        objectOutput.writeLong(userId);
        objectOutput.writeLong(createDate);
        objectOutput.writeLong(modifiedDate);
        objectOutput.writeBoolean(isDeleted);

        if (companyEmailAddress == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(companyEmailAddress);
        }
    }
}
