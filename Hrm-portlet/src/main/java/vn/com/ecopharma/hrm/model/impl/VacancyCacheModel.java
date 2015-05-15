package vn.com.ecopharma.hrm.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import vn.com.ecopharma.hrm.model.Vacancy;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Vacancy in entity cache.
 *
 * @author tvt
 * @see Vacancy
 * @generated
 */
public class VacancyCacheModel implements CacheModel<Vacancy>, Externalizable {
    public long v_id;
    public long jtitle_id;
    public long hiring_manager_id;
    public String name;
    public String description;
    public int no_of_positions;
    public boolean published_in_feed;
    public long insert_date;
    public long update_date;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(19);

        sb.append("{v_id=");
        sb.append(v_id);
        sb.append(", jtitle_id=");
        sb.append(jtitle_id);
        sb.append(", hiring_manager_id=");
        sb.append(hiring_manager_id);
        sb.append(", name=");
        sb.append(name);
        sb.append(", description=");
        sb.append(description);
        sb.append(", no_of_positions=");
        sb.append(no_of_positions);
        sb.append(", published_in_feed=");
        sb.append(published_in_feed);
        sb.append(", insert_date=");
        sb.append(insert_date);
        sb.append(", update_date=");
        sb.append(update_date);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public Vacancy toEntityModel() {
        VacancyImpl vacancyImpl = new VacancyImpl();

        vacancyImpl.setV_id(v_id);
        vacancyImpl.setJtitle_id(jtitle_id);
        vacancyImpl.setHiring_manager_id(hiring_manager_id);

        if (name == null) {
            vacancyImpl.setName(StringPool.BLANK);
        } else {
            vacancyImpl.setName(name);
        }

        if (description == null) {
            vacancyImpl.setDescription(StringPool.BLANK);
        } else {
            vacancyImpl.setDescription(description);
        }

        vacancyImpl.setNo_of_positions(no_of_positions);
        vacancyImpl.setPublished_in_feed(published_in_feed);

        if (insert_date == Long.MIN_VALUE) {
            vacancyImpl.setInsert_date(null);
        } else {
            vacancyImpl.setInsert_date(new Date(insert_date));
        }

        if (update_date == Long.MIN_VALUE) {
            vacancyImpl.setUpdate_date(null);
        } else {
            vacancyImpl.setUpdate_date(new Date(update_date));
        }

        vacancyImpl.resetOriginalValues();

        return vacancyImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        v_id = objectInput.readLong();
        jtitle_id = objectInput.readLong();
        hiring_manager_id = objectInput.readLong();
        name = objectInput.readUTF();
        description = objectInput.readUTF();
        no_of_positions = objectInput.readInt();
        published_in_feed = objectInput.readBoolean();
        insert_date = objectInput.readLong();
        update_date = objectInput.readLong();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeLong(v_id);
        objectOutput.writeLong(jtitle_id);
        objectOutput.writeLong(hiring_manager_id);

        if (name == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(name);
        }

        if (description == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(description);
        }

        objectOutput.writeInt(no_of_positions);
        objectOutput.writeBoolean(published_in_feed);
        objectOutput.writeLong(insert_date);
        objectOutput.writeLong(update_date);
    }
}
