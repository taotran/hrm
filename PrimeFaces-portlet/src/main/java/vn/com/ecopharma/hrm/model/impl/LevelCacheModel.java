package vn.com.ecopharma.hrm.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import vn.com.ecopharma.hrm.model.Level;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Level in entity cache.
 *
 * @author tvt
 * @see Level
 * @generated
 */
public class LevelCacheModel implements CacheModel<Level>, Externalizable {
    public long levelId;
    public String name;
    public long groupId;
    public long companyId;
    public long userId;
    public long createDate;
    public long modifiedDate;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(15);

        sb.append("{levelId=");
        sb.append(levelId);
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
    public Level toEntityModel() {
        LevelImpl levelImpl = new LevelImpl();

        levelImpl.setLevelId(levelId);

        if (name == null) {
            levelImpl.setName(StringPool.BLANK);
        } else {
            levelImpl.setName(name);
        }

        levelImpl.setGroupId(groupId);
        levelImpl.setCompanyId(companyId);
        levelImpl.setUserId(userId);

        if (createDate == Long.MIN_VALUE) {
            levelImpl.setCreateDate(null);
        } else {
            levelImpl.setCreateDate(new Date(createDate));
        }

        if (modifiedDate == Long.MIN_VALUE) {
            levelImpl.setModifiedDate(null);
        } else {
            levelImpl.setModifiedDate(new Date(modifiedDate));
        }

        levelImpl.resetOriginalValues();

        return levelImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        levelId = objectInput.readLong();
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
        objectOutput.writeLong(levelId);

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
