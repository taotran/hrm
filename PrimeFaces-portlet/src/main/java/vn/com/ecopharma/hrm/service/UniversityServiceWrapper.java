package vn.com.ecopharma.hrm.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link UniversityService}.
 *
 * @author tvt
 * @see UniversityService
 * @generated
 */
public class UniversityServiceWrapper implements UniversityService,
    ServiceWrapper<UniversityService> {
    private UniversityService _universityService;

    public UniversityServiceWrapper(UniversityService universityService) {
        _universityService = universityService;
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _universityService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _universityService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _universityService.invokeMethod(name, parameterTypes, arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public UniversityService getWrappedUniversityService() {
        return _universityService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedUniversityService(UniversityService universityService) {
        _universityService = universityService;
    }

    @Override
    public UniversityService getWrappedService() {
        return _universityService;
    }

    @Override
    public void setWrappedService(UniversityService universityService) {
        _universityService = universityService;
    }
}
