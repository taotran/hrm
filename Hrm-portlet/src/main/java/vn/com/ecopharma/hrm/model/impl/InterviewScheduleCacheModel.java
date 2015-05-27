package vn.com.ecopharma.hrm.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import vn.com.ecopharma.hrm.model.InterviewSchedule;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing InterviewSchedule in entity cache.
 *
 * @author tvt
 * @see InterviewSchedule
 * @generated
 */
public class InterviewScheduleCacheModel implements CacheModel<InterviewSchedule>,
    Externalizable {
    public long interviewScheduleId;
    public long c_id;
    public long v_id;
    public long interviewId;
    public long interviewDate;
    public String interviewTime;
    public String note;
    public long groupId;
    public long companyId;
    public long userId;
    public long createDate;
    public long modifiedDate;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(25);

        sb.append("{interviewScheduleId=");
        sb.append(interviewScheduleId);
        sb.append(", c_id=");
        sb.append(c_id);
        sb.append(", v_id=");
        sb.append(v_id);
        sb.append(", interviewId=");
        sb.append(interviewId);
        sb.append(", interviewDate=");
        sb.append(interviewDate);
        sb.append(", interviewTime=");
        sb.append(interviewTime);
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
    public InterviewSchedule toEntityModel() {
        InterviewScheduleImpl interviewScheduleImpl = new InterviewScheduleImpl();

        interviewScheduleImpl.setInterviewScheduleId(interviewScheduleId);
        interviewScheduleImpl.setC_id(c_id);
        interviewScheduleImpl.setV_id(v_id);
        interviewScheduleImpl.setInterviewId(interviewId);

        if (interviewDate == Long.MIN_VALUE) {
            interviewScheduleImpl.setInterviewDate(null);
        } else {
            interviewScheduleImpl.setInterviewDate(new Date(interviewDate));
        }

        if (interviewTime == null) {
            interviewScheduleImpl.setInterviewTime(StringPool.BLANK);
        } else {
            interviewScheduleImpl.setInterviewTime(interviewTime);
        }

        if (note == null) {
            interviewScheduleImpl.setNote(StringPool.BLANK);
        } else {
            interviewScheduleImpl.setNote(note);
        }

        interviewScheduleImpl.setGroupId(groupId);
        interviewScheduleImpl.setCompanyId(companyId);
        interviewScheduleImpl.setUserId(userId);

        if (createDate == Long.MIN_VALUE) {
            interviewScheduleImpl.setCreateDate(null);
        } else {
            interviewScheduleImpl.setCreateDate(new Date(createDate));
        }

        if (modifiedDate == Long.MIN_VALUE) {
            interviewScheduleImpl.setModifiedDate(null);
        } else {
            interviewScheduleImpl.setModifiedDate(new Date(modifiedDate));
        }

        interviewScheduleImpl.resetOriginalValues();

        return interviewScheduleImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        interviewScheduleId = objectInput.readLong();
        c_id = objectInput.readLong();
        v_id = objectInput.readLong();
        interviewId = objectInput.readLong();
        interviewDate = objectInput.readLong();
        interviewTime = objectInput.readUTF();
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
        objectOutput.writeLong(interviewScheduleId);
        objectOutput.writeLong(c_id);
        objectOutput.writeLong(v_id);
        objectOutput.writeLong(interviewId);
        objectOutput.writeLong(interviewDate);

        if (interviewTime == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(interviewTime);
        }

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
