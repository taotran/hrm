package vn.com.ecopharma.hrm.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import vn.com.ecopharma.hrm.model.EmployeeInterviewSchedule;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing EmployeeInterviewSchedule in entity cache.
 *
 * @author tvt
 * @see EmployeeInterviewSchedule
 * @generated
 */
public class EmployeeInterviewScheduleCacheModel implements CacheModel<EmployeeInterviewSchedule>,
    Externalizable {
    public long employeeInterviewScheduleId;
    public long employeeId;
    public long interviewScheduleId;
    public long groupId;
    public long companyId;
    public long userId;
    public long createDate;
    public long modifiedDate;
    public String note;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(19);

        sb.append("{employeeInterviewScheduleId=");
        sb.append(employeeInterviewScheduleId);
        sb.append(", employeeId=");
        sb.append(employeeId);
        sb.append(", interviewScheduleId=");
        sb.append(interviewScheduleId);
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
        sb.append(", note=");
        sb.append(note);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public EmployeeInterviewSchedule toEntityModel() {
        EmployeeInterviewScheduleImpl employeeInterviewScheduleImpl = new EmployeeInterviewScheduleImpl();

        employeeInterviewScheduleImpl.setEmployeeInterviewScheduleId(employeeInterviewScheduleId);
        employeeInterviewScheduleImpl.setEmployeeId(employeeId);
        employeeInterviewScheduleImpl.setInterviewScheduleId(interviewScheduleId);
        employeeInterviewScheduleImpl.setGroupId(groupId);
        employeeInterviewScheduleImpl.setCompanyId(companyId);
        employeeInterviewScheduleImpl.setUserId(userId);

        if (createDate == Long.MIN_VALUE) {
            employeeInterviewScheduleImpl.setCreateDate(null);
        } else {
            employeeInterviewScheduleImpl.setCreateDate(new Date(createDate));
        }

        if (modifiedDate == Long.MIN_VALUE) {
            employeeInterviewScheduleImpl.setModifiedDate(null);
        } else {
            employeeInterviewScheduleImpl.setModifiedDate(new Date(modifiedDate));
        }

        if (note == null) {
            employeeInterviewScheduleImpl.setNote(StringPool.BLANK);
        } else {
            employeeInterviewScheduleImpl.setNote(note);
        }

        employeeInterviewScheduleImpl.resetOriginalValues();

        return employeeInterviewScheduleImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        employeeInterviewScheduleId = objectInput.readLong();
        employeeId = objectInput.readLong();
        interviewScheduleId = objectInput.readLong();
        groupId = objectInput.readLong();
        companyId = objectInput.readLong();
        userId = objectInput.readLong();
        createDate = objectInput.readLong();
        modifiedDate = objectInput.readLong();
        note = objectInput.readUTF();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeLong(employeeInterviewScheduleId);
        objectOutput.writeLong(employeeId);
        objectOutput.writeLong(interviewScheduleId);
        objectOutput.writeLong(groupId);
        objectOutput.writeLong(companyId);
        objectOutput.writeLong(userId);
        objectOutput.writeLong(createDate);
        objectOutput.writeLong(modifiedDate);

        if (note == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(note);
        }
    }
}
