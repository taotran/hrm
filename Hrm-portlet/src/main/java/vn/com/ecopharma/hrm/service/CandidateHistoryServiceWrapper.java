package vn.com.ecopharma.hrm.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link CandidateHistoryService}.
 *
 * @author tvt
 * @see CandidateHistoryService
 * @generated
 */
public class CandidateHistoryServiceWrapper implements CandidateHistoryService,
    ServiceWrapper<CandidateHistoryService> {
    private CandidateHistoryService _candidateHistoryService;

    public CandidateHistoryServiceWrapper(
        CandidateHistoryService candidateHistoryService) {
        _candidateHistoryService = candidateHistoryService;
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _candidateHistoryService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _candidateHistoryService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _candidateHistoryService.invokeMethod(name, parameterTypes,
            arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public CandidateHistoryService getWrappedCandidateHistoryService() {
        return _candidateHistoryService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedCandidateHistoryService(
        CandidateHistoryService candidateHistoryService) {
        _candidateHistoryService = candidateHistoryService;
    }

    @Override
    public CandidateHistoryService getWrappedService() {
        return _candidateHistoryService;
    }

    @Override
    public void setWrappedService(
        CandidateHistoryService candidateHistoryService) {
        _candidateHistoryService = candidateHistoryService;
    }
}
