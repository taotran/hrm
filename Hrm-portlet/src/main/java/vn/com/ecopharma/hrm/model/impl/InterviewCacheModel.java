package vn.com.ecopharma.hrm.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import vn.com.ecopharma.hrm.model.Interview;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Interview in entity cache.
 *
 * @author tvt
 * @see Interview
 * @generated
 */
public class InterviewCacheModel implements CacheModel<Interview>,
    Externalizable {
    public long interviewId;
    public long groupId;
    public long companyId;
    public long userId;
    public String userName;
    public long createDate;
    public long modifiedDate;
    public String name;
    public long interview_date;
    public String interview_time;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(21);

        sb.append("{interviewId=");
        sb.append(interviewId);
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
        sb.append(", name=");
        sb.append(name);
        sb.append(", interview_date=");
        sb.append(interview_date);
        sb.append(", interview_time=");
        sb.append(interview_time);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public Interview toEntityModel() {
        InterviewImpl interviewImpl = new InterviewImpl();

        interviewImpl.setInterviewId(interviewId);
        interviewImpl.setGroupId(groupId);
        interviewImpl.setCompanyId(companyId);
        interviewImpl.setUserId(userId);

        if (userName == null) {
            interviewImpl.setUserName(StringPool.BLANK);
        } else {
            interviewImpl.setUserName(userName);
        }

        if (createDate == Long.MIN_VALUE) {
            interviewImpl.setCreateDate(null);
        } else {
            interviewImpl.setCreateDate(new Date(createDate));
        }

        if (modifiedDate == Long.MIN_VALUE) {
            interviewImpl.setModifiedDate(null);
        } else {
            interviewImpl.setModifiedDate(new Date(modifiedDate));
        }

        if (name == null) {
            interviewImpl.setName(StringPool.BLANK);
        } else {
            interviewImpl.setName(name);
        }

        if (interview_date == Long.MIN_VALUE) {
            interviewImpl.setInterview_date(null);
        } else {
            interviewImpl.setInterview_date(new Date(interview_date));
        }

        if (interview_time == null) {
            interviewImpl.setInterview_time(StringPool.BLANK);
        } else {
            interviewImpl.setInterview_time(interview_time);
        }

        interviewImpl.resetOriginalValues();

        return interviewImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        interviewId = objectInput.readLong();
        groupId = objectInput.readLong();
        companyId = objectInput.readLong();
        userId = objectInput.readLong();
        userName = objectInput.readUTF();
        createDate = objectInput.readLong();
        modifiedDate = objectInput.readLong();
        name = objectInput.readUTF();
        interview_date = objectInput.readLong();
        interview_time = objectInput.readUTF();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeLong(interviewId);
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

        if (name == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(name);
        }

        objectOutput.writeLong(interview_date);

        if (interview_time == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(interview_time);
        }
    }
}
