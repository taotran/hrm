package vn.com.ecopharma.hrm.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import vn.com.ecopharma.hrm.model.Employee_Titles;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Employee_Titles in entity cache.
 *
 * @author tvt
 * @see Employee_Titles
 * @generated
 */
public class Employee_TitlesCacheModel implements CacheModel<Employee_Titles>,
    Externalizable {
    public long employee_TitlesId;
    public long employeeId;
    public long titlesId;
    public long set_date;
    public String note;
    public long groupId;
    public long companyId;
    public long userId;
    public long createDate;
    public long modifiedDate;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(21);

        sb.append("{employee_TitlesId=");
        sb.append(employee_TitlesId);
        sb.append(", employeeId=");
        sb.append(employeeId);
        sb.append(", titlesId=");
        sb.append(titlesId);
        sb.append(", set_date=");
        sb.append(set_date);
        sb.append(", note=");
        sb.append(note);
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
        sb.append("}");

        return sb.toString();
    }

    @Override
    public Employee_Titles toEntityModel() {
        Employee_TitlesImpl employee_TitlesImpl = new Employee_TitlesImpl();

        employee_TitlesImpl.setEmployee_TitlesId(employee_TitlesId);
        employee_TitlesImpl.setEmployeeId(employeeId);
        employee_TitlesImpl.setTitlesId(titlesId);

        if (set_date == Long.MIN_VALUE) {
            employee_TitlesImpl.setSet_date(null);
        } else {
            employee_TitlesImpl.setSet_date(new Date(set_date));
        }

        if (note == null) {
            employee_TitlesImpl.setNote(StringPool.BLANK);
        } else {
            employee_TitlesImpl.setNote(note);
        }

        employee_TitlesImpl.setGroupId(groupId);
        employee_TitlesImpl.setCompanyId(companyId);
        employee_TitlesImpl.setUserId(userId);

        if (createDate == Long.MIN_VALUE) {
            employee_TitlesImpl.setCreateDate(null);
        } else {
            employee_TitlesImpl.setCreateDate(new Date(createDate));
        }

        if (modifiedDate == Long.MIN_VALUE) {
            employee_TitlesImpl.setModifiedDate(null);
        } else {
            employee_TitlesImpl.setModifiedDate(new Date(modifiedDate));
        }

        employee_TitlesImpl.resetOriginalValues();

        return employee_TitlesImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        employee_TitlesId = objectInput.readLong();
        employeeId = objectInput.readLong();
        titlesId = objectInput.readLong();
        set_date = objectInput.readLong();
        note = objectInput.readUTF();
        groupId = objectInput.readLong();
        companyId = objectInput.readLong();
        userId = objectInput.readLong();
        createDate = objectInput.readLong();
        modifiedDate = objectInput.readLong();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeLong(employee_TitlesId);
        objectOutput.writeLong(employeeId);
        objectOutput.writeLong(titlesId);
        objectOutput.writeLong(set_date);

        if (note == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(note);
        }

        objectOutput.writeLong(groupId);
        objectOutput.writeLong(companyId);
        objectOutput.writeLong(userId);
        objectOutput.writeLong(createDate);
        objectOutput.writeLong(modifiedDate);
    }
}
