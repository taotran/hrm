package vn.com.ecopharma.hrm.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import vn.com.ecopharma.hrm.model.Employee_Titles_History;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Employee_Titles_History in entity cache.
 *
 * @author tvt
 * @see Employee_Titles_History
 * @generated
 */
public class Employee_Titles_HistoryCacheModel implements CacheModel<Employee_Titles_History>,
    Externalizable {
    public long employee_Titles_HistoryId;
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

        sb.append("{employee_Titles_HistoryId=");
        sb.append(employee_Titles_HistoryId);
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
    public Employee_Titles_History toEntityModel() {
        Employee_Titles_HistoryImpl employee_Titles_HistoryImpl = new Employee_Titles_HistoryImpl();

        employee_Titles_HistoryImpl.setEmployee_Titles_HistoryId(employee_Titles_HistoryId);
        employee_Titles_HistoryImpl.setEmployeeId(employeeId);
        employee_Titles_HistoryImpl.setTitlesId(titlesId);

        if (set_date == Long.MIN_VALUE) {
            employee_Titles_HistoryImpl.setSet_date(null);
        } else {
            employee_Titles_HistoryImpl.setSet_date(new Date(set_date));
        }

        if (note == null) {
            employee_Titles_HistoryImpl.setNote(StringPool.BLANK);
        } else {
            employee_Titles_HistoryImpl.setNote(note);
        }

        employee_Titles_HistoryImpl.setGroupId(groupId);
        employee_Titles_HistoryImpl.setCompanyId(companyId);
        employee_Titles_HistoryImpl.setUserId(userId);

        if (createDate == Long.MIN_VALUE) {
            employee_Titles_HistoryImpl.setCreateDate(null);
        } else {
            employee_Titles_HistoryImpl.setCreateDate(new Date(createDate));
        }

        if (modifiedDate == Long.MIN_VALUE) {
            employee_Titles_HistoryImpl.setModifiedDate(null);
        } else {
            employee_Titles_HistoryImpl.setModifiedDate(new Date(modifiedDate));
        }

        employee_Titles_HistoryImpl.resetOriginalValues();

        return employee_Titles_HistoryImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        employee_Titles_HistoryId = objectInput.readLong();
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
        objectOutput.writeLong(employee_Titles_HistoryId);
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
