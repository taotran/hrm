package vn.com.ecopharma.hrm.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link LevelService}.
 *
 * @author tvt
 * @see LevelService
 * @generated
 */
public class LevelServiceWrapper implements LevelService,
    ServiceWrapper<LevelService> {
    private LevelService _levelService;

    public LevelServiceWrapper(LevelService levelService) {
        _levelService = levelService;
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _levelService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _levelService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _levelService.invokeMethod(name, parameterTypes, arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public LevelService getWrappedLevelService() {
        return _levelService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedLevelService(LevelService levelService) {
        _levelService = levelService;
    }

    @Override
    public LevelService getWrappedService() {
        return _levelService;
    }

    @Override
    public void setWrappedService(LevelService levelService) {
        _levelService = levelService;
    }
}
