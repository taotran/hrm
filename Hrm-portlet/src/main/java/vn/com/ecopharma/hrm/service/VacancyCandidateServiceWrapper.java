package vn.com.ecopharma.hrm.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link VacancyCandidateService}.
 *
 * @author tvt
 * @see VacancyCandidateService
 * @generated
 */
public class VacancyCandidateServiceWrapper implements VacancyCandidateService,
    ServiceWrapper<VacancyCandidateService> {
    private VacancyCandidateService _vacancyCandidateService;

    public VacancyCandidateServiceWrapper(
        VacancyCandidateService vacancyCandidateService) {
        _vacancyCandidateService = vacancyCandidateService;
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _vacancyCandidateService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _vacancyCandidateService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _vacancyCandidateService.invokeMethod(name, parameterTypes,
            arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public VacancyCandidateService getWrappedVacancyCandidateService() {
        return _vacancyCandidateService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedVacancyCandidateService(
        VacancyCandidateService vacancyCandidateService) {
        _vacancyCandidateService = vacancyCandidateService;
    }

    @Override
    public VacancyCandidateService getWrappedService() {
        return _vacancyCandidateService;
    }

    @Override
    public void setWrappedService(
        VacancyCandidateService vacancyCandidateService) {
        _vacancyCandidateService = vacancyCandidateService;
    }
}
