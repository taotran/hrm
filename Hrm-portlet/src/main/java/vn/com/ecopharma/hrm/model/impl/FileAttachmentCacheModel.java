package vn.com.ecopharma.hrm.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import vn.com.ecopharma.hrm.model.FileAttachment;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing FileAttachment in entity cache.
 *
 * @author tvt
 * @see FileAttachment
 * @generated
 */
public class FileAttachmentCacheModel implements CacheModel<FileAttachment>,
    Externalizable {
    public long f_id;
    public long groupId;
    public long companyId;
    public long userId;
    public long createDate;
    public long modifiedDate;
    public long c_id;
    public String name;
    public String file_type;
    public long size;
    public String content;
    public String attachment_type;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(25);

        sb.append("{f_id=");
        sb.append(f_id);
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
        sb.append(", c_id=");
        sb.append(c_id);
        sb.append(", name=");
        sb.append(name);
        sb.append(", file_type=");
        sb.append(file_type);
        sb.append(", size=");
        sb.append(size);
        sb.append(", content=");
        sb.append(content);
        sb.append(", attachment_type=");
        sb.append(attachment_type);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public FileAttachment toEntityModel() {
        FileAttachmentImpl fileAttachmentImpl = new FileAttachmentImpl();

        fileAttachmentImpl.setF_id(f_id);
        fileAttachmentImpl.setGroupId(groupId);
        fileAttachmentImpl.setCompanyId(companyId);
        fileAttachmentImpl.setUserId(userId);

        if (createDate == Long.MIN_VALUE) {
            fileAttachmentImpl.setCreateDate(null);
        } else {
            fileAttachmentImpl.setCreateDate(new Date(createDate));
        }

        if (modifiedDate == Long.MIN_VALUE) {
            fileAttachmentImpl.setModifiedDate(null);
        } else {
            fileAttachmentImpl.setModifiedDate(new Date(modifiedDate));
        }

        fileAttachmentImpl.setC_id(c_id);

        if (name == null) {
            fileAttachmentImpl.setName(StringPool.BLANK);
        } else {
            fileAttachmentImpl.setName(name);
        }

        if (file_type == null) {
            fileAttachmentImpl.setFile_type(StringPool.BLANK);
        } else {
            fileAttachmentImpl.setFile_type(file_type);
        }

        fileAttachmentImpl.setSize(size);

        if (content == null) {
            fileAttachmentImpl.setContent(StringPool.BLANK);
        } else {
            fileAttachmentImpl.setContent(content);
        }

        if (attachment_type == null) {
            fileAttachmentImpl.setAttachment_type(StringPool.BLANK);
        } else {
            fileAttachmentImpl.setAttachment_type(attachment_type);
        }

        fileAttachmentImpl.resetOriginalValues();

        return fileAttachmentImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        f_id = objectInput.readLong();
        groupId = objectInput.readLong();
        companyId = objectInput.readLong();
        userId = objectInput.readLong();
        createDate = objectInput.readLong();
        modifiedDate = objectInput.readLong();
        c_id = objectInput.readLong();
        name = objectInput.readUTF();
        file_type = objectInput.readUTF();
        size = objectInput.readLong();
        content = objectInput.readUTF();
        attachment_type = objectInput.readUTF();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeLong(f_id);
        objectOutput.writeLong(groupId);
        objectOutput.writeLong(companyId);
        objectOutput.writeLong(userId);
        objectOutput.writeLong(createDate);
        objectOutput.writeLong(modifiedDate);
        objectOutput.writeLong(c_id);

        if (name == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(name);
        }

        if (file_type == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(file_type);
        }

        objectOutput.writeLong(size);

        if (content == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(content);
        }

        if (attachment_type == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(attachment_type);
        }
    }
}
