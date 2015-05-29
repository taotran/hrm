package vn.com.ecopharma.hrm.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

import vn.com.ecopharma.hrm.model.EmployeeInterviewSchedule;
import vn.com.ecopharma.hrm.service.EmployeeInterviewScheduleLocalServiceUtil;

/**
 * @author tvt
 * @generated
 */
public abstract class EmployeeInterviewScheduleActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public EmployeeInterviewScheduleActionableDynamicQuery()
        throws SystemException {
        setBaseLocalService(EmployeeInterviewScheduleLocalServiceUtil.getService());
        setClass(EmployeeInterviewSchedule.class);

        setClassLoader(vn.com.ecopharma.hrm.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("employeeInterviewScheduleId");
    }
}
