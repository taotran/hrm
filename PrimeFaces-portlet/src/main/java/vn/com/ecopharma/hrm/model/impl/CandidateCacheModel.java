package vn.com.ecopharma.hrm.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import vn.com.ecopharma.hrm.model.Candidate;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

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

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(15);

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
    }
}
