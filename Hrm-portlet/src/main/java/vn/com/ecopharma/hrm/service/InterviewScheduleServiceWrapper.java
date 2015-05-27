package vn.com.ecopharma.hrm.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link InterviewScheduleService}.
 *
 * @author tvt
 * @see InterviewScheduleService
 * @generated
 */
public class InterviewScheduleServiceWrapper implements InterviewScheduleService,
    ServiceWrapper<InterviewScheduleService> {
    private InterviewScheduleService _interviewScheduleService;

    public InterviewScheduleServiceWrapper(
        InterviewScheduleService interviewScheduleService) {
        _interviewScheduleService = interviewScheduleService;
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _interviewScheduleService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _interviewScheduleService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _interviewScheduleService.invokeMethod(name, parameterTypes,
            arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public InterviewScheduleService getWrappedInterviewScheduleService() {
        return _interviewScheduleService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedInterviewScheduleService(
        InterviewScheduleService interviewScheduleService) {
        _interviewScheduleService = interviewScheduleService;
    }

    @Override
    public InterviewScheduleService getWrappedService() {
        return _interviewScheduleService;
    }

    @Override
    public void setWrappedService(
        InterviewScheduleService interviewScheduleService) {
        _interviewScheduleService = interviewScheduleService;
    }
}
