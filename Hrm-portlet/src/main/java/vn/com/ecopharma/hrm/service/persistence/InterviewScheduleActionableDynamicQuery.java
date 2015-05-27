package vn.com.ecopharma.hrm.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

import vn.com.ecopharma.hrm.model.InterviewSchedule;
import vn.com.ecopharma.hrm.service.InterviewScheduleLocalServiceUtil;

/**
 * @author tvt
 * @generated
 */
public abstract class InterviewScheduleActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public InterviewScheduleActionableDynamicQuery() throws SystemException {
        setBaseLocalService(InterviewScheduleLocalServiceUtil.getService());
        setClass(InterviewSchedule.class);

        setClassLoader(vn.com.ecopharma.hrm.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("interviewScheduleId");
    }
}
