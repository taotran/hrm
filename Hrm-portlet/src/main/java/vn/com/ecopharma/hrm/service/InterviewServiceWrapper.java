package vn.com.ecopharma.hrm.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link InterviewService}.
 *
 * @author tvt
 * @see InterviewService
 * @generated
 */
public class InterviewServiceWrapper implements InterviewService,
    ServiceWrapper<InterviewService> {
    private InterviewService _interviewService;

    public InterviewServiceWrapper(InterviewService interviewService) {
        _interviewService = interviewService;
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _interviewService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _interviewService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _interviewService.invokeMethod(name, parameterTypes, arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public InterviewService getWrappedInterviewService() {
        return _interviewService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedInterviewService(InterviewService interviewService) {
        _interviewService = interviewService;
    }

    @Override
    public InterviewService getWrappedService() {
        return _interviewService;
    }

    @Override
    public void setWrappedService(InterviewService interviewService) {
        _interviewService = interviewService;
    }
}
