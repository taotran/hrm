package vn.com.ecopharma.hrm.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import vn.com.ecopharma.hrm.model.University;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing University in entity cache.
 *
 * @author tvt
 * @see University
 * @generated
 */
public class UniversityCacheModel implements CacheModel<University>,
    Externalizable {
    public long universityId;
    public String name;
    public String code;
    public String tel_fax;
    public long groupId;
    public long companyId;
    public long userId;
    public long createDate;
    public long modifiedDate;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(19);

        sb.append("{universityId=");
        sb.append(universityId);
        sb.append(", name=");
        sb.append(name);
        sb.append(", code=");
        sb.append(code);
        sb.append(", tel_fax=");
        sb.append(tel_fax);
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
    public University toEntityModel() {
        UniversityImpl universityImpl = new UniversityImpl();

        universityImpl.setUniversityId(universityId);

        if (name == null) {
            universityImpl.setName(StringPool.BLANK);
        } else {
            universityImpl.setName(name);
        }

        if (code == null) {
            universityImpl.setCode(StringPool.BLANK);
        } else {
            universityImpl.setCode(code);
        }

        if (tel_fax == null) {
            universityImpl.setTel_fax(StringPool.BLANK);
        } else {
            universityImpl.setTel_fax(tel_fax);
        }

        universityImpl.setGroupId(groupId);
        universityImpl.setCompanyId(companyId);
        universityImpl.setUserId(userId);

        if (createDate == Long.MIN_VALUE) {
            universityImpl.setCreateDate(null);
        } else {
            universityImpl.setCreateDate(new Date(createDate));
        }

        if (modifiedDate == Long.MIN_VALUE) {
            universityImpl.setModifiedDate(null);
        } else {
            universityImpl.setModifiedDate(new Date(modifiedDate));
        }

        universityImpl.resetOriginalValues();

        return universityImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        universityId = objectInput.readLong();
        name = objectInput.readUTF();
        code = objectInput.readUTF();
        tel_fax = objectInput.readUTF();
        groupId = objectInput.readLong();
        companyId = objectInput.readLong();
        userId = objectInput.readLong();
        createDate = objectInput.readLong();
        modifiedDate = objectInput.readLong();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeLong(universityId);

        if (name == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(name);
        }

        if (code == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(code);
        }

        if (tel_fax == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(tel_fax);
        }

        objectOutput.writeLong(groupId);
        objectOutput.writeLong(companyId);
        objectOutput.writeLong(userId);
        objectOutput.writeLong(createDate);
        objectOutput.writeLong(modifiedDate);
    }
}
