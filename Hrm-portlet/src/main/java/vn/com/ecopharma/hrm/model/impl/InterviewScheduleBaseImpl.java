package vn.com.ecopharma.hrm.model.impl;

import com.liferay.portal.kernel.exception.SystemException;

import vn.com.ecopharma.hrm.model.InterviewSchedule;
import vn.com.ecopharma.hrm.service.InterviewScheduleLocalServiceUtil;

/**
 * The extended model base implementation for the InterviewSchedule service. Represents a row in the &quot;HRM_Recruitment_InterviewSchedule&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link InterviewScheduleImpl}.
 * </p>
 *
 * @author tvt
 * @see InterviewScheduleImpl
 * @see vn.com.ecopharma.hrm.model.InterviewSchedule
 * @generated
 */
public abstract class InterviewScheduleBaseImpl
    extends InterviewScheduleModelImpl implements InterviewSchedule {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. All methods that expect a interview schedule model instance should use the {@link InterviewSchedule} interface instead.
     */
    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            InterviewScheduleLocalServiceUtil.addInterviewSchedule(this);
        } else {
            InterviewScheduleLocalServiceUtil.updateInterviewSchedule(this);
        }
    }
}
