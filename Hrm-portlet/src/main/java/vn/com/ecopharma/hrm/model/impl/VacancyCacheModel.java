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
    public long jobtitleId;
    public long hiring_manager_id;
    public String name;
    public long locationId;
    public String description;
    public int no_of_positions;
    public String vacancy_status;
    public long insert_date;
    public long update_date;
    public long user_id;
    public long group_id;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(25);

        sb.append("{v_id=");
        sb.append(v_id);
        sb.append(", jobtitleId=");
        sb.append(jobtitleId);
        sb.append(", hiring_manager_id=");
        sb.append(hiring_manager_id);
        sb.append(", name=");
        sb.append(name);
        sb.append(", locationId=");
        sb.append(locationId);
        sb.append(", description=");
        sb.append(description);
        sb.append(", no_of_positions=");
        sb.append(no_of_positions);
        sb.append(", vacancy_status=");
        sb.append(vacancy_status);
        sb.append(", insert_date=");
        sb.append(insert_date);
        sb.append(", update_date=");
        sb.append(update_date);
        sb.append(", user_id=");
        sb.append(user_id);
        sb.append(", group_id=");
        sb.append(group_id);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public Vacancy toEntityModel() {
        VacancyImpl vacancyImpl = new VacancyImpl();

        vacancyImpl.setV_id(v_id);
        vacancyImpl.setJobtitleId(jobtitleId);
        vacancyImpl.setHiring_manager_id(hiring_manager_id);

        if (name == null) {
            vacancyImpl.setName(StringPool.BLANK);
        } else {
            vacancyImpl.setName(name);
        }

        vacancyImpl.setLocationId(locationId);

        if (description == null) {
            vacancyImpl.setDescription(StringPool.BLANK);
        } else {
            vacancyImpl.setDescription(description);
        }

        vacancyImpl.setNo_of_positions(no_of_positions);

        if (vacancy_status == null) {
            vacancyImpl.setVacancy_status(StringPool.BLANK);
        } else {
            vacancyImpl.setVacancy_status(vacancy_status);
        }

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

        vacancyImpl.setUser_id(user_id);
        vacancyImpl.setGroup_id(group_id);

        vacancyImpl.resetOriginalValues();

        return vacancyImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        v_id = objectInput.readLong();
        jobtitleId = objectInput.readLong();
        hiring_manager_id = objectInput.readLong();
        name = objectInput.readUTF();
        locationId = objectInput.readLong();
        description = objectInput.readUTF();
        no_of_positions = objectInput.readInt();
        vacancy_status = objectInput.readUTF();
        insert_date = objectInput.readLong();
        update_date = objectInput.readLong();
        user_id = objectInput.readLong();
        group_id = objectInput.readLong();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeLong(v_id);
        objectOutput.writeLong(jobtitleId);
        objectOutput.writeLong(hiring_manager_id);

        if (name == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(name);
        }

        objectOutput.writeLong(locationId);

        if (description == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(description);
        }

        objectOutput.writeInt(no_of_positions);

        if (vacancy_status == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(vacancy_status);
        }

        objectOutput.writeLong(insert_date);
        objectOutput.writeLong(update_date);
        objectOutput.writeLong(user_id);
        objectOutput.writeLong(group_id);
    }
}
