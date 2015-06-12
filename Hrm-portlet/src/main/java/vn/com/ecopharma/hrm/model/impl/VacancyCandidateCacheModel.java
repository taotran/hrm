package vn.com.ecopharma.hrm.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import vn.com.ecopharma.hrm.model.VacancyCandidate;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing VacancyCandidate in entity cache.
 *
 * @author tvt
 * @see VacancyCandidate
 * @generated
 */
public class VacancyCandidateCacheModel implements CacheModel<VacancyCandidate>,
    Externalizable {
    public long vacancyCandidateId;
    public long c_id;
    public long v_id;
    public long groupId;
    public long companyId;
    public long userId;
    public long createDate;
    public long modifiedDate;
    public String vc_status;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(19);

        sb.append("{vacancyCandidateId=");
        sb.append(vacancyCandidateId);
        sb.append(", c_id=");
        sb.append(c_id);
        sb.append(", v_id=");
        sb.append(v_id);
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
        sb.append(", vc_status=");
        sb.append(vc_status);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public VacancyCandidate toEntityModel() {
        VacancyCandidateImpl vacancyCandidateImpl = new VacancyCandidateImpl();

        vacancyCandidateImpl.setVacancyCandidateId(vacancyCandidateId);
        vacancyCandidateImpl.setC_id(c_id);
        vacancyCandidateImpl.setV_id(v_id);
        vacancyCandidateImpl.setGroupId(groupId);
        vacancyCandidateImpl.setCompanyId(companyId);
        vacancyCandidateImpl.setUserId(userId);

        if (createDate == Long.MIN_VALUE) {
            vacancyCandidateImpl.setCreateDate(null);
        } else {
            vacancyCandidateImpl.setCreateDate(new Date(createDate));
        }

        if (modifiedDate == Long.MIN_VALUE) {
            vacancyCandidateImpl.setModifiedDate(null);
        } else {
            vacancyCandidateImpl.setModifiedDate(new Date(modifiedDate));
        }

        if (vc_status == null) {
            vacancyCandidateImpl.setVc_status(StringPool.BLANK);
        } else {
            vacancyCandidateImpl.setVc_status(vc_status);
        }

        vacancyCandidateImpl.resetOriginalValues();

        return vacancyCandidateImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        vacancyCandidateId = objectInput.readLong();
        c_id = objectInput.readLong();
        v_id = objectInput.readLong();
        groupId = objectInput.readLong();
        companyId = objectInput.readLong();
        userId = objectInput.readLong();
        createDate = objectInput.readLong();
        modifiedDate = objectInput.readLong();
        vc_status = objectInput.readUTF();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeLong(vacancyCandidateId);
        objectOutput.writeLong(c_id);
        objectOutput.writeLong(v_id);
        objectOutput.writeLong(groupId);
        objectOutput.writeLong(companyId);
        objectOutput.writeLong(userId);
        objectOutput.writeLong(createDate);
        objectOutput.writeLong(modifiedDate);

        if (vc_status == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(vc_status);
        }
    }
}
