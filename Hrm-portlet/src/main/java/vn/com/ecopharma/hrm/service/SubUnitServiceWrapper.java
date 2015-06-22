package vn.com.ecopharma.hrm.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link SubUnitService}.
 *
 * @author tvt
 * @see SubUnitService
 * @generated
 */
public class SubUnitServiceWrapper implements SubUnitService,
    ServiceWrapper<SubUnitService> {
    private SubUnitService _subUnitService;

    public SubUnitServiceWrapper(SubUnitService subUnitService) {
        _subUnitService = subUnitService;
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _subUnitService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _subUnitService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _subUnitService.invokeMethod(name, parameterTypes, arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public SubUnitService getWrappedSubUnitService() {
        return _subUnitService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedSubUnitService(SubUnitService subUnitService) {
        _subUnitService = subUnitService;
    }

    @Override
    public SubUnitService getWrappedService() {
        return _subUnitService;
    }

    @Override
    public void setWrappedService(SubUnitService subUnitService) {
        _subUnitService = subUnitService;
    }
}
