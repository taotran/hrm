package vn.com.ecopharma.hrm.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link JTitleService}.
 *
 * @author tvt
 * @see JTitleService
 * @generated
 */
public class JTitleServiceWrapper implements JTitleService,
    ServiceWrapper<JTitleService> {
    private JTitleService _jTitleService;

    public JTitleServiceWrapper(JTitleService jTitleService) {
        _jTitleService = jTitleService;
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _jTitleService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _jTitleService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _jTitleService.invokeMethod(name, parameterTypes, arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public JTitleService getWrappedJTitleService() {
        return _jTitleService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedJTitleService(JTitleService jTitleService) {
        _jTitleService = jTitleService;
    }

    @Override
    public JTitleService getWrappedService() {
        return _jTitleService;
    }

    @Override
    public void setWrappedService(JTitleService jTitleService) {
        _jTitleService = jTitleService;
    }
}
