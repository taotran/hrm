package vn.com.ecopharma.hrm.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.CacheModel;

import vn.com.ecopharma.hrm.model.EmployeeVacancy;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing EmployeeVacancy in entity cache.
 *
 * @author tvt
 * @see EmployeeVacancy
 * @generated
 */
public class EmployeeVacancyCacheModel implements CacheModel<EmployeeVacancy>,
    Externalizable {
    public long employeeVacancyId;
    public long employeeId;
    public long v_id;
    public long groupId;
    public long companyId;
    public long userId;
    public long createDate;
    public long modifiedDate;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(17);

        sb.append("{employeeVacancyId=");
        sb.append(employeeVacancyId);
        sb.append(", employeeId=");
        sb.append(employeeId);
        sb.append(", v_id=");
        sb.append(v_id);
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
    public EmployeeVacancy toEntityModel() {
        EmployeeVacancyImpl employeeVacancyImpl = new EmployeeVacancyImpl();

        employeeVacancyImpl.setEmployeeVacancyId(employeeVacancyId);
        employeeVacancyImpl.setEmployeeId(employeeId);
        employeeVacancyImpl.setV_id(v_id);
        employeeVacancyImpl.setGroupId(groupId);
        employeeVacancyImpl.setCompanyId(companyId);
        employeeVacancyImpl.setUserId(userId);

        if (createDate == Long.MIN_VALUE) {
            employeeVacancyImpl.setCreateDate(null);
        } else {
            employeeVacancyImpl.setCreateDate(new Date(createDate));
        }

        if (modifiedDate == Long.MIN_VALUE) {
            employeeVacancyImpl.setModifiedDate(null);
        } else {
            employeeVacancyImpl.setModifiedDate(new Date(modifiedDate));
        }

        employeeVacancyImpl.resetOriginalValues();

        return employeeVacancyImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        employeeVacancyId = objectInput.readLong();
        employeeId = objectInput.readLong();
        v_id = objectInput.readLong();
        groupId = objectInput.readLong();
        companyId = objectInput.readLong();
        userId = objectInput.readLong();
        createDate = objectInput.readLong();
        modifiedDate = objectInput.readLong();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeLong(employeeVacancyId);
        objectOutput.writeLong(employeeId);
        objectOutput.writeLong(v_id);
        objectOutput.writeLong(groupId);
        objectOutput.writeLong(companyId);
        objectOutput.writeLong(userId);
        objectOutput.writeLong(createDate);
        objectOutput.writeLong(modifiedDate);
    }
}
