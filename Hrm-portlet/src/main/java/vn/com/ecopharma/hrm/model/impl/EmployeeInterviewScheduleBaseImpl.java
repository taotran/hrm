package vn.com.ecopharma.hrm.model.impl;

import com.liferay.portal.kernel.exception.SystemException;

import vn.com.ecopharma.hrm.model.EmployeeInterviewSchedule;
import vn.com.ecopharma.hrm.service.EmployeeInterviewScheduleLocalServiceUtil;

/**
 * The extended model base implementation for the EmployeeInterviewSchedule service. Represents a row in the &quot;HRM_Recruitment_EmployeeInterviewSchedule&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link EmployeeInterviewScheduleImpl}.
 * </p>
 *
 * @author tvt
 * @see EmployeeInterviewScheduleImpl
 * @see vn.com.ecopharma.hrm.model.EmployeeInterviewSchedule
 * @generated
 */
public abstract class EmployeeInterviewScheduleBaseImpl
    extends EmployeeInterviewScheduleModelImpl
    implements EmployeeInterviewSchedule {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. All methods that expect a employee interview schedule model instance should use the {@link EmployeeInterviewSchedule} interface instead.
     */
    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            EmployeeInterviewScheduleLocalServiceUtil.addEmployeeInterviewSchedule(this);
        } else {
            EmployeeInterviewScheduleLocalServiceUtil.updateEmployeeInterviewSchedule(this);
        }
    }
}
