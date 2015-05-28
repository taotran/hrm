package vn.com.ecopharma.hrm.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import vn.com.ecopharma.hrm.model.Location;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Location in entity cache.
 *
 * @author tvt
 * @see Location
 * @generated
 */
public class LocationCacheModel implements CacheModel<Location>, Externalizable {
    public long locationId;
    public long groupId;
    public long companyId;
    public long userId;
    public long createDate;
    public long modifiedDate;
    public String type;
    public String name;
    public String country_code;
    public String province;
    public String city;
    public String address;
    public String zip_code;
    public String phone;
    public String fax;
    public String note;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(33);

        sb.append("{locationId=");
        sb.append(locationId);
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
        sb.append(", type=");
        sb.append(type);
        sb.append(", name=");
        sb.append(name);
        sb.append(", country_code=");
        sb.append(country_code);
        sb.append(", province=");
        sb.append(province);
        sb.append(", city=");
        sb.append(city);
        sb.append(", address=");
        sb.append(address);
        sb.append(", zip_code=");
        sb.append(zip_code);
        sb.append(", phone=");
        sb.append(phone);
        sb.append(", fax=");
        sb.append(fax);
        sb.append(", note=");
        sb.append(note);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public Location toEntityModel() {
        LocationImpl locationImpl = new LocationImpl();

        locationImpl.setLocationId(locationId);
        locationImpl.setGroupId(groupId);
        locationImpl.setCompanyId(companyId);
        locationImpl.setUserId(userId);

        if (createDate == Long.MIN_VALUE) {
            locationImpl.setCreateDate(null);
        } else {
            locationImpl.setCreateDate(new Date(createDate));
        }

        if (modifiedDate == Long.MIN_VALUE) {
            locationImpl.setModifiedDate(null);
        } else {
            locationImpl.setModifiedDate(new Date(modifiedDate));
        }

        if (type == null) {
            locationImpl.setType(StringPool.BLANK);
        } else {
            locationImpl.setType(type);
        }

        if (name == null) {
            locationImpl.setName(StringPool.BLANK);
        } else {
            locationImpl.setName(name);
        }

        if (country_code == null) {
            locationImpl.setCountry_code(StringPool.BLANK);
        } else {
            locationImpl.setCountry_code(country_code);
        }

        if (province == null) {
            locationImpl.setProvince(StringPool.BLANK);
        } else {
            locationImpl.setProvince(province);
        }

        if (city == null) {
            locationImpl.setCity(StringPool.BLANK);
        } else {
            locationImpl.setCity(city);
        }

        if (address == null) {
            locationImpl.setAddress(StringPool.BLANK);
        } else {
            locationImpl.setAddress(address);
        }

        if (zip_code == null) {
            locationImpl.setZip_code(StringPool.BLANK);
        } else {
            locationImpl.setZip_code(zip_code);
        }

        if (phone == null) {
            locationImpl.setPhone(StringPool.BLANK);
        } else {
            locationImpl.setPhone(phone);
        }

        if (fax == null) {
            locationImpl.setFax(StringPool.BLANK);
        } else {
            locationImpl.setFax(fax);
        }

        if (note == null) {
            locationImpl.setNote(StringPool.BLANK);
        } else {
            locationImpl.setNote(note);
        }

        locationImpl.resetOriginalValues();

        return locationImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        locationId = objectInput.readLong();
        groupId = objectInput.readLong();
        companyId = objectInput.readLong();
        userId = objectInput.readLong();
        createDate = objectInput.readLong();
        modifiedDate = objectInput.readLong();
        type = objectInput.readUTF();
        name = objectInput.readUTF();
        country_code = objectInput.readUTF();
        province = objectInput.readUTF();
        city = objectInput.readUTF();
        address = objectInput.readUTF();
        zip_code = objectInput.readUTF();
        phone = objectInput.readUTF();
        fax = objectInput.readUTF();
        note = objectInput.readUTF();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeLong(locationId);
        objectOutput.writeLong(groupId);
        objectOutput.writeLong(companyId);
        objectOutput.writeLong(userId);
        objectOutput.writeLong(createDate);
        objectOutput.writeLong(modifiedDate);

        if (type == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(type);
        }

        if (name == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(name);
        }

        if (country_code == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(country_code);
        }

        if (province == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(province);
        }

        if (city == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(city);
        }

        if (address == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(address);
        }

        if (zip_code == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(zip_code);
        }

        if (phone == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(phone);
        }

        if (fax == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(fax);
        }

        if (note == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(note);
        }
    }
}
