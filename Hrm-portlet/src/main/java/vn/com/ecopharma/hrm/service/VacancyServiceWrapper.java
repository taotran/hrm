package vn.com.ecopharma.hrm.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link VacancyService}.
 *
 * @author tvt
 * @see VacancyService
 * @generated
 */
public class VacancyServiceWrapper implements VacancyService,
    ServiceWrapper<VacancyService> {
    private VacancyService _vacancyService;

    public VacancyServiceWrapper(VacancyService vacancyService) {
        _vacancyService = vacancyService;
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _vacancyService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _vacancyService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _vacancyService.invokeMethod(name, parameterTypes, arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public VacancyService getWrappedVacancyService() {
        return _vacancyService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedVacancyService(VacancyService vacancyService) {
        _vacancyService = vacancyService;
    }

    @Override
    public VacancyService getWrappedService() {
        return _vacancyService;
    }

    @Override
    public void setWrappedService(VacancyService vacancyService) {
        _vacancyService = vacancyService;
    }
}
