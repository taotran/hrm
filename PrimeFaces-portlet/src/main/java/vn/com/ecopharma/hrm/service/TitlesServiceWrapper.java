package vn.com.ecopharma.hrm.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link TitlesService}.
 *
 * @author tvt
 * @see TitlesService
 * @generated
 */
public class TitlesServiceWrapper implements TitlesService,
    ServiceWrapper<TitlesService> {
    private TitlesService _titlesService;

    public TitlesServiceWrapper(TitlesService titlesService) {
        _titlesService = titlesService;
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _titlesService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _titlesService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _titlesService.invokeMethod(name, parameterTypes, arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public TitlesService getWrappedTitlesService() {
        return _titlesService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedTitlesService(TitlesService titlesService) {
        _titlesService = titlesService;
    }

    @Override
    public TitlesService getWrappedService() {
        return _titlesService;
    }

    @Override
    public void setWrappedService(TitlesService titlesService) {
        _titlesService = titlesService;
    }
}
