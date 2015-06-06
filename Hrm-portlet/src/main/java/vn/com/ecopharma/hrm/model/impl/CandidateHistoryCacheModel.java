package vn.com.ecopharma.hrm.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import vn.com.ecopharma.hrm.model.CandidateHistory;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing CandidateHistory in entity cache.
 *
 * @author tvt
 * @see CandidateHistory
 * @generated
 */
public class CandidateHistoryCacheModel implements CacheModel<CandidateHistory>,
    Externalizable {
    public long candidateHistoryId;
    public long c_id;
    public long v_id;
    public long interviewId;
    public long performed_by;
    public String note;
    public String interviewers;
    public String action;
    public long groupId;
    public long companyId;
    public long userId;
    public String userName;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(25);

        sb.append("{candidateHistoryId=");
        sb.append(candidateHistoryId);
        sb.append(", c_id=");
        sb.append(c_id);
        sb.append(", v_id=");
        sb.append(v_id);
        sb.append(", interviewId=");
        sb.append(interviewId);
        sb.append(", performed_by=");
        sb.append(performed_by);
        sb.append(", note=");
        sb.append(note);
        sb.append(", interviewers=");
        sb.append(interviewers);
        sb.append(", action=");
        sb.append(action);
        sb.append(", groupId=");
        sb.append(groupId);
        sb.append(", companyId=");
        sb.append(companyId);
        sb.append(", userId=");
        sb.append(userId);
        sb.append(", userName=");
        sb.append(userName);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public CandidateHistory toEntityModel() {
        CandidateHistoryImpl candidateHistoryImpl = new CandidateHistoryImpl();

        candidateHistoryImpl.setCandidateHistoryId(candidateHistoryId);
        candidateHistoryImpl.setC_id(c_id);
        candidateHistoryImpl.setV_id(v_id);
        candidateHistoryImpl.setInterviewId(interviewId);
        candidateHistoryImpl.setPerformed_by(performed_by);

        if (note == null) {
            candidateHistoryImpl.setNote(StringPool.BLANK);
        } else {
            candidateHistoryImpl.setNote(note);
        }

        if (interviewers == null) {
            candidateHistoryImpl.setInterviewers(StringPool.BLANK);
        } else {
            candidateHistoryImpl.setInterviewers(interviewers);
        }

        if (action == null) {
            candidateHistoryImpl.setAction(StringPool.BLANK);
        } else {
            candidateHistoryImpl.setAction(action);
        }

        candidateHistoryImpl.setGroupId(groupId);
        candidateHistoryImpl.setCompanyId(companyId);
        candidateHistoryImpl.setUserId(userId);

        if (userName == null) {
            candidateHistoryImpl.setUserName(StringPool.BLANK);
        } else {
            candidateHistoryImpl.setUserName(userName);
        }

        candidateHistoryImpl.resetOriginalValues();

        return candidateHistoryImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        candidateHistoryId = objectInput.readLong();
        c_id = objectInput.readLong();
        v_id = objectInput.readLong();
        interviewId = objectInput.readLong();
        performed_by = objectInput.readLong();
        note = objectInput.readUTF();
        interviewers = objectInput.readUTF();
        action = objectInput.readUTF();
        groupId = objectInput.readLong();
        companyId = objectInput.readLong();
        userId = objectInput.readLong();
        userName = objectInput.readUTF();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeLong(candidateHistoryId);
        objectOutput.writeLong(c_id);
        objectOutput.writeLong(v_id);
        objectOutput.writeLong(interviewId);
        objectOutput.writeLong(performed_by);

        if (note == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(note);
        }

        if (interviewers == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(interviewers);
        }

        if (action == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(action);
        }

        objectOutput.writeLong(groupId);
        objectOutput.writeLong(companyId);
        objectOutput.writeLong(userId);

        if (userName == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(userName);
        }
    }
}
