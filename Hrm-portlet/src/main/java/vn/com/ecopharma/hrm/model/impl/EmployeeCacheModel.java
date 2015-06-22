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
    public long groupId;
    public long companyId;
    public long userId;
    public String userName;
    public long createDate;
    public long modifiedDate;
    public String emp_code;
    public String firstname;
    public String middle_name;
    public String lastname;
    public String email;
    public String contact_number;
    public String nickname;
    public long birthday;
    public String gender;
    public String marital_status;
    public String status;
    public long jobtitleId;
    public long joined_date;
    public long subUnitId;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(43);

        sb.append("{employeeId=");
        sb.append(employeeId);
        sb.append(", groupId=");
        sb.append(groupId);
        sb.append(", companyId=");
        sb.append(companyId);
        sb.append(", userId=");
        sb.append(userId);
        sb.append(", userName=");
        sb.append(userName);
        sb.append(", createDate=");
        sb.append(createDate);
        sb.append(", modifiedDate=");
        sb.append(modifiedDate);
        sb.append(", emp_code=");
        sb.append(emp_code);
        sb.append(", firstname=");
        sb.append(firstname);
        sb.append(", middle_name=");
        sb.append(middle_name);
        sb.append(", lastname=");
        sb.append(lastname);
        sb.append(", email=");
        sb.append(email);
        sb.append(", contact_number=");
        sb.append(contact_number);
        sb.append(", nickname=");
        sb.append(nickname);
        sb.append(", birthday=");
        sb.append(birthday);
        sb.append(", gender=");
        sb.append(gender);
        sb.append(", marital_status=");
        sb.append(marital_status);
        sb.append(", status=");
        sb.append(status);
        sb.append(", jobtitleId=");
        sb.append(jobtitleId);
        sb.append(", joined_date=");
        sb.append(joined_date);
        sb.append(", subUnitId=");
        sb.append(subUnitId);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public Employee toEntityModel() {
        EmployeeImpl employeeImpl = new EmployeeImpl();

        employeeImpl.setEmployeeId(employeeId);
        employeeImpl.setGroupId(groupId);
        employeeImpl.setCompanyId(companyId);
        employeeImpl.setUserId(userId);

        if (userName == null) {
            employeeImpl.setUserName(StringPool.BLANK);
        } else {
            employeeImpl.setUserName(userName);
        }

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

        if (emp_code == null) {
            employeeImpl.setEmp_code(StringPool.BLANK);
        } else {
            employeeImpl.setEmp_code(emp_code);
        }

        if (firstname == null) {
            employeeImpl.setFirstname(StringPool.BLANK);
        } else {
            employeeImpl.setFirstname(firstname);
        }

        if (middle_name == null) {
            employeeImpl.setMiddle_name(StringPool.BLANK);
        } else {
            employeeImpl.setMiddle_name(middle_name);
        }

        if (lastname == null) {
            employeeImpl.setLastname(StringPool.BLANK);
        } else {
            employeeImpl.setLastname(lastname);
        }

        if (email == null) {
            employeeImpl.setEmail(StringPool.BLANK);
        } else {
            employeeImpl.setEmail(email);
        }

        if (contact_number == null) {
            employeeImpl.setContact_number(StringPool.BLANK);
        } else {
            employeeImpl.setContact_number(contact_number);
        }

        if (nickname == null) {
            employeeImpl.setNickname(StringPool.BLANK);
        } else {
            employeeImpl.setNickname(nickname);
        }

        if (birthday == Long.MIN_VALUE) {
            employeeImpl.setBirthday(null);
        } else {
            employeeImpl.setBirthday(new Date(birthday));
        }

        if (gender == null) {
            employeeImpl.setGender(StringPool.BLANK);
        } else {
            employeeImpl.setGender(gender);
        }

        if (marital_status == null) {
            employeeImpl.setMarital_status(StringPool.BLANK);
        } else {
            employeeImpl.setMarital_status(marital_status);
        }

        if (status == null) {
            employeeImpl.setStatus(StringPool.BLANK);
        } else {
            employeeImpl.setStatus(status);
        }

        employeeImpl.setJobtitleId(jobtitleId);

        if (joined_date == Long.MIN_VALUE) {
            employeeImpl.setJoined_date(null);
        } else {
            employeeImpl.setJoined_date(new Date(joined_date));
        }

        employeeImpl.setSubUnitId(subUnitId);

        employeeImpl.resetOriginalValues();

        return employeeImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        employeeId = objectInput.readLong();
        groupId = objectInput.readLong();
        companyId = objectInput.readLong();
        userId = objectInput.readLong();
        userName = objectInput.readUTF();
        createDate = objectInput.readLong();
        modifiedDate = objectInput.readLong();
        emp_code = objectInput.readUTF();
        firstname = objectInput.readUTF();
        middle_name = objectInput.readUTF();
        lastname = objectInput.readUTF();
        email = objectInput.readUTF();
        contact_number = objectInput.readUTF();
        nickname = objectInput.readUTF();
        birthday = objectInput.readLong();
        gender = objectInput.readUTF();
        marital_status = objectInput.readUTF();
        status = objectInput.readUTF();
        jobtitleId = objectInput.readLong();
        joined_date = objectInput.readLong();
        subUnitId = objectInput.readLong();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeLong(employeeId);
        objectOutput.writeLong(groupId);
        objectOutput.writeLong(companyId);
        objectOutput.writeLong(userId);

        if (userName == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(userName);
        }

        objectOutput.writeLong(createDate);
        objectOutput.writeLong(modifiedDate);

        if (emp_code == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(emp_code);
        }

        if (firstname == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(firstname);
        }

        if (middle_name == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(middle_name);
        }

        if (lastname == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(lastname);
        }

        if (email == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(email);
        }

        if (contact_number == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(contact_number);
        }

        if (nickname == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(nickname);
        }

        objectOutput.writeLong(birthday);

        if (gender == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(gender);
        }

        if (marital_status == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(marital_status);
        }

        if (status == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(status);
        }

        objectOutput.writeLong(jobtitleId);
        objectOutput.writeLong(joined_date);
        objectOutput.writeLong(subUnitId);
    }
}
