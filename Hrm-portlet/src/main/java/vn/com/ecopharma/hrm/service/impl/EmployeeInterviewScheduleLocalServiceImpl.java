package vn.com.ecopharma.hrm.service.impl;

import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.service.ServiceContext;

import vn.com.ecopharma.hrm.model.EmployeeInterviewSchedule;
import vn.com.ecopharma.hrm.service.base.EmployeeInterviewScheduleLocalServiceBaseImpl;

/**
 * The implementation of the employee interview schedule local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link vn.com.ecopharma.hrm.service.EmployeeInterviewScheduleLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author tvt
 * @see vn.com.ecopharma.hrm.service.base.EmployeeInterviewScheduleLocalServiceBaseImpl
 * @see vn.com.ecopharma.hrm.service.EmployeeInterviewScheduleLocalServiceUtil
 */
public class EmployeeInterviewScheduleLocalServiceImpl
    extends EmployeeInterviewScheduleLocalServiceBaseImpl {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never reference this interface directly. Always use {@link vn.com.ecopharma.hrm.service.EmployeeInterviewScheduleLocalServiceUtil} to access the employee interview schedule local service.
     */
	
	public EmployeeInterviewSchedule create(long employeeId, long interviewScheduleId, long userId, ServiceContext serviceContext) throws SystemException {
		
		final EmployeeInterviewSchedule eis = employeeInterviewSchedulePersistence.create(counterLocalService.increment());
		eis.setEmployeeId(employeeId);
		eis.setInterviewScheduleId(interviewScheduleId);
		eis.setUserId(userId);
		eis.setGroupId(serviceContext.getScopeGroupId());
		employeeInterviewSchedulePersistence.update(eis);
		return eis;
	}
	
}
