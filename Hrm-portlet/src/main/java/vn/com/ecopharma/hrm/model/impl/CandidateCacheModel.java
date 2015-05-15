package vn.com.ecopharma.hrm.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import vn.com.ecopharma.hrm.model.Candidate;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Candidate in entity cache.
 *
 * @author tvt
 * @see Candidate
 * @generated
 */
public class CandidateCacheModel implements CacheModel<Candidate>,
    Externalizable {
    public long c_id;
    public String first_name;
    public String middle_name;
    public String last_name;
    public String email;
    public String contact_number;
    public String comment;
    public int mode_of_application;
    public long date_of_application;
    public long cv_file_id;
    public String cv_text_version;
    public String keywords;
    public int added_person;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(27);

        sb.append("{c_id=");
        sb.append(c_id);
        sb.append(", first_name=");
        sb.append(first_name);
        sb.append(", middle_name=");
        sb.append(middle_name);
        sb.append(", last_name=");
        sb.append(last_name);
        sb.append(", email=");
        sb.append(email);
        sb.append(", contact_number=");
        sb.append(contact_number);
        sb.append(", comment=");
        sb.append(comment);
        sb.append(", mode_of_application=");
        sb.append(mode_of_application);
        sb.append(", date_of_application=");
        sb.append(date_of_application);
        sb.append(", cv_file_id=");
        sb.append(cv_file_id);
        sb.append(", cv_text_version=");
        sb.append(cv_text_version);
        sb.append(", keywords=");
        sb.append(keywords);
        sb.append(", added_person=");
        sb.append(added_person);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public Candidate toEntityModel() {
        CandidateImpl candidateImpl = new CandidateImpl();

        candidateImpl.setC_id(c_id);

        if (first_name == null) {
            candidateImpl.setFirst_name(StringPool.BLANK);
        } else {
            candidateImpl.setFirst_name(first_name);
        }

        if (middle_name == null) {
            candidateImpl.setMiddle_name(StringPool.BLANK);
        } else {
            candidateImpl.setMiddle_name(middle_name);
        }

        if (last_name == null) {
            candidateImpl.setLast_name(StringPool.BLANK);
        } else {
            candidateImpl.setLast_name(last_name);
        }

        if (email == null) {
            candidateImpl.setEmail(StringPool.BLANK);
        } else {
            candidateImpl.setEmail(email);
        }

        if (contact_number == null) {
            candidateImpl.setContact_number(StringPool.BLANK);
        } else {
            candidateImpl.setContact_number(contact_number);
        }

        if (comment == null) {
            candidateImpl.setComment(StringPool.BLANK);
        } else {
            candidateImpl.setComment(comment);
        }

        candidateImpl.setMode_of_application(mode_of_application);

        if (date_of_application == Long.MIN_VALUE) {
            candidateImpl.setDate_of_application(null);
        } else {
            candidateImpl.setDate_of_application(new Date(date_of_application));
        }

        candidateImpl.setCv_file_id(cv_file_id);

        if (cv_text_version == null) {
            candidateImpl.setCv_text_version(StringPool.BLANK);
        } else {
            candidateImpl.setCv_text_version(cv_text_version);
        }

        if (keywords == null) {
            candidateImpl.setKeywords(StringPool.BLANK);
        } else {
            candidateImpl.setKeywords(keywords);
        }

        candidateImpl.setAdded_person(added_person);

        candidateImpl.resetOriginalValues();

        return candidateImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        c_id = objectInput.readLong();
        first_name = objectInput.readUTF();
        middle_name = objectInput.readUTF();
        last_name = objectInput.readUTF();
        email = objectInput.readUTF();
        contact_number = objectInput.readUTF();
        comment = objectInput.readUTF();
        mode_of_application = objectInput.readInt();
        date_of_application = objectInput.readLong();
        cv_file_id = objectInput.readLong();
        cv_text_version = objectInput.readUTF();
        keywords = objectInput.readUTF();
        added_person = objectInput.readInt();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeLong(c_id);

        if (first_name == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(first_name);
        }

        if (middle_name == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(middle_name);
        }

        if (last_name == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(last_name);
        }

        if (email == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(email);
        }

        if (contact_number == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(contact_number);
        }

        if (comment == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(comment);
        }

        objectOutput.writeInt(mode_of_application);
        objectOutput.writeLong(date_of_application);
        objectOutput.writeLong(cv_file_id);

        if (cv_text_version == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(cv_text_version);
        }

        if (keywords == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(keywords);
        }

        objectOutput.writeInt(added_person);
    }
}
