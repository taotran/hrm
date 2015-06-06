package vn.com.ecopharma.hrm.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link EmployeeVacancyService}.
 *
 * @author tvt
 * @see EmployeeVacancyService
 * @generated
 */
public class EmployeeVacancyServiceWrapper implements EmployeeVacancyService,
    ServiceWrapper<EmployeeVacancyService> {
    private EmployeeVacancyService _employeeVacancyService;

    public EmployeeVacancyServiceWrapper(
        EmployeeVacancyService employeeVacancyService) {
        _employeeVacancyService = employeeVacancyService;
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _employeeVacancyService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _employeeVacancyService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _employeeVacancyService.invokeMethod(name, parameterTypes,
            arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public EmployeeVacancyService getWrappedEmployeeVacancyService() {
        return _employeeVacancyService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedEmployeeVacancyService(
        EmployeeVacancyService employeeVacancyService) {
        _employeeVacancyService = employeeVacancyService;
    }

    @Override
    public EmployeeVacancyService getWrappedService() {
        return _employeeVacancyService;
    }

    @Override
    public void setWrappedService(EmployeeVacancyService employeeVacancyService) {
        _employeeVacancyService = employeeVacancyService;
    }
}
