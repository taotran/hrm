package vn.com.ecopharma.hrm.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import vn.com.ecopharma.hrm.model.District;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing District in entity cache.
 *
 * @author tvt
 * @see District
 * @generated
 */
public class DistrictCacheModel implements CacheModel<District>, Externalizable {
    public long districtId;
    public String name;
    public long regionId;
    public long groupId;
    public long companyId;
    public long userId;
    public long createDate;
    public long modifiedDate;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(17);

        sb.append("{districtId=");
        sb.append(districtId);
        sb.append(", name=");
        sb.append(name);
        sb.append(", regionId=");
        sb.append(regionId);
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
    public District toEntityModel() {
        DistrictImpl districtImpl = new DistrictImpl();

        districtImpl.setDistrictId(districtId);

        if (name == null) {
            districtImpl.setName(StringPool.BLANK);
        } else {
            districtImpl.setName(name);
        }

        districtImpl.setRegionId(regionId);
        districtImpl.setGroupId(groupId);
        districtImpl.setCompanyId(companyId);
        districtImpl.setUserId(userId);

        if (createDate == Long.MIN_VALUE) {
            districtImpl.setCreateDate(null);
        } else {
            districtImpl.setCreateDate(new Date(createDate));
        }

        if (modifiedDate == Long.MIN_VALUE) {
            districtImpl.setModifiedDate(null);
        } else {
            districtImpl.setModifiedDate(new Date(modifiedDate));
        }

        districtImpl.resetOriginalValues();

        return districtImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        districtId = objectInput.readLong();
        name = objectInput.readUTF();
        regionId = objectInput.readLong();
        groupId = objectInput.readLong();
        companyId = objectInput.readLong();
        userId = objectInput.readLong();
        createDate = objectInput.readLong();
        modifiedDate = objectInput.readLong();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeLong(districtId);

        if (name == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(name);
        }

        objectOutput.writeLong(regionId);
        objectOutput.writeLong(groupId);
        objectOutput.writeLong(companyId);
        objectOutput.writeLong(userId);
        objectOutput.writeLong(createDate);
        objectOutput.writeLong(modifiedDate);
    }
}
