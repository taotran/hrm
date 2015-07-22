package vn.com.ecopharma.hrm.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import vn.com.ecopharma.hrm.model.SubUnit;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing SubUnit in entity cache.
 *
 * @author tvt
 * @see SubUnit
 * @generated
 */
public class SubUnitCacheModel implements CacheModel<SubUnit>, Externalizable {
    public long subUnitId;
    public String name;
    public long groupId;
    public long companyId;
    public long userId;
    public long createDate;
    public long modifiedDate;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(15);

        sb.append("{subUnitId=");
        sb.append(subUnitId);
        sb.append(", name=");
        sb.append(name);
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
    public SubUnit toEntityModel() {
        SubUnitImpl subUnitImpl = new SubUnitImpl();

        subUnitImpl.setSubUnitId(subUnitId);

        if (name == null) {
            subUnitImpl.setName(StringPool.BLANK);
        } else {
            subUnitImpl.setName(name);
        }

        subUnitImpl.setGroupId(groupId);
        subUnitImpl.setCompanyId(companyId);
        subUnitImpl.setUserId(userId);

        if (createDate == Long.MIN_VALUE) {
            subUnitImpl.setCreateDate(null);
        } else {
            subUnitImpl.setCreateDate(new Date(createDate));
        }

        if (modifiedDate == Long.MIN_VALUE) {
            subUnitImpl.setModifiedDate(null);
        } else {
            subUnitImpl.setModifiedDate(new Date(modifiedDate));
        }

        subUnitImpl.resetOriginalValues();

        return subUnitImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        subUnitId = objectInput.readLong();
        name = objectInput.readUTF();
        groupId = objectInput.readLong();
        companyId = objectInput.readLong();
        userId = objectInput.readLong();
        createDate = objectInput.readLong();
        modifiedDate = objectInput.readLong();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeLong(subUnitId);

        if (name == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(name);
        }

        objectOutput.writeLong(groupId);
        objectOutput.writeLong(companyId);
        objectOutput.writeLong(userId);
        objectOutput.writeLong(createDate);
        objectOutput.writeLong(modifiedDate);
    }
}
