package vn.com.ecopharma.hrm.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link EmployeeInterviewScheduleService}.
 *
 * @author tvt
 * @see EmployeeInterviewScheduleService
 * @generated
 */
public class EmployeeInterviewScheduleServiceWrapper
    implements EmployeeInterviewScheduleService,
        ServiceWrapper<EmployeeInterviewScheduleService> {
    private EmployeeInterviewScheduleService _employeeInterviewScheduleService;

    public EmployeeInterviewScheduleServiceWrapper(
        EmployeeInterviewScheduleService employeeInterviewScheduleService) {
        _employeeInterviewScheduleService = employeeInterviewScheduleService;
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _employeeInterviewScheduleService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _employeeInterviewScheduleService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _employeeInterviewScheduleService.invokeMethod(name,
            parameterTypes, arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public EmployeeInterviewScheduleService getWrappedEmployeeInterviewScheduleService() {
        return _employeeInterviewScheduleService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedEmployeeInterviewScheduleService(
        EmployeeInterviewScheduleService employeeInterviewScheduleService) {
        _employeeInterviewScheduleService = employeeInterviewScheduleService;
    }

    @Override
    public EmployeeInterviewScheduleService getWrappedService() {
        return _employeeInterviewScheduleService;
    }

    @Override
    public void setWrappedService(
        EmployeeInterviewScheduleService employeeInterviewScheduleService) {
        _employeeInterviewScheduleService = employeeInterviewScheduleService;
    }
}
