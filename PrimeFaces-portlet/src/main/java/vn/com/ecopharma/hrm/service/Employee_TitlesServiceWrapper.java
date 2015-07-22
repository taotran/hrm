package vn.com.ecopharma.hrm.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link Employee_TitlesService}.
 *
 * @author tvt
 * @see Employee_TitlesService
 * @generated
 */
public class Employee_TitlesServiceWrapper implements Employee_TitlesService,
    ServiceWrapper<Employee_TitlesService> {
    private Employee_TitlesService _employee_TitlesService;

    public Employee_TitlesServiceWrapper(
        Employee_TitlesService employee_TitlesService) {
        _employee_TitlesService = employee_TitlesService;
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _employee_TitlesService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _employee_TitlesService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _employee_TitlesService.invokeMethod(name, parameterTypes,
            arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public Employee_TitlesService getWrappedEmployee_TitlesService() {
        return _employee_TitlesService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedEmployee_TitlesService(
        Employee_TitlesService employee_TitlesService) {
        _employee_TitlesService = employee_TitlesService;
    }

    @Override
    public Employee_TitlesService getWrappedService() {
        return _employee_TitlesService;
    }

    @Override
    public void setWrappedService(Employee_TitlesService employee_TitlesService) {
        _employee_TitlesService = employee_TitlesService;
    }
}
