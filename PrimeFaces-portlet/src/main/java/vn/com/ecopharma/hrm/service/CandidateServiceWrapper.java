package vn.com.ecopharma.hrm.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link CandidateService}.
 *
 * @author tvt
 * @see CandidateService
 * @generated
 */
public class CandidateServiceWrapper implements CandidateService,
    ServiceWrapper<CandidateService> {
    private CandidateService _candidateService;

    public CandidateServiceWrapper(CandidateService candidateService) {
        _candidateService = candidateService;
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _candidateService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _candidateService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _candidateService.invokeMethod(name, parameterTypes, arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public CandidateService getWrappedCandidateService() {
        return _candidateService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedCandidateService(CandidateService candidateService) {
        _candidateService = candidateService;
    }

    @Override
    public CandidateService getWrappedService() {
        return _candidateService;
    }

    @Override
    public void setWrappedService(CandidateService candidateService) {
        _candidateService = candidateService;
    }
}
