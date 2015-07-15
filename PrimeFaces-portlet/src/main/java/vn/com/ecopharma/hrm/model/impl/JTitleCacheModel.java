package vn.com.ecopharma.hrm.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import vn.com.ecopharma.hrm.model.JTitle;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing JTitle in entity cache.
 *
 * @author tvt
 * @see JTitle
 * @generated
 */
public class JTitleCacheModel implements CacheModel<JTitle>, Externalizable {
    public long jobtitleId;
    public String title;
    public String description;
    public String note;
    public boolean isDeleted;
    public long userId;
    public long groupId;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(15);

        sb.append("{jobtitleId=");
        sb.append(jobtitleId);
        sb.append(", title=");
        sb.append(title);
        sb.append(", description=");
        sb.append(description);
        sb.append(", note=");
        sb.append(note);
        sb.append(", isDeleted=");
        sb.append(isDeleted);
        sb.append(", userId=");
        sb.append(userId);
        sb.append(", groupId=");
        sb.append(groupId);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public JTitle toEntityModel() {
        JTitleImpl jTitleImpl = new JTitleImpl();

        jTitleImpl.setJobtitleId(jobtitleId);

        if (title == null) {
            jTitleImpl.setTitle(StringPool.BLANK);
        } else {
            jTitleImpl.setTitle(title);
        }

        if (description == null) {
            jTitleImpl.setDescription(StringPool.BLANK);
        } else {
            jTitleImpl.setDescription(description);
        }

        if (note == null) {
            jTitleImpl.setNote(StringPool.BLANK);
        } else {
            jTitleImpl.setNote(note);
        }

        jTitleImpl.setIsDeleted(isDeleted);
        jTitleImpl.setUserId(userId);
        jTitleImpl.setGroupId(groupId);

        jTitleImpl.resetOriginalValues();

        return jTitleImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        jobtitleId = objectInput.readLong();
        title = objectInput.readUTF();
        description = objectInput.readUTF();
        note = objectInput.readUTF();
        isDeleted = objectInput.readBoolean();
        userId = objectInput.readLong();
        groupId = objectInput.readLong();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeLong(jobtitleId);

        if (title == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(title);
        }

        if (description == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(description);
        }

        if (note == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(note);
        }

        objectOutput.writeBoolean(isDeleted);
        objectOutput.writeLong(userId);
        objectOutput.writeLong(groupId);
    }
}
