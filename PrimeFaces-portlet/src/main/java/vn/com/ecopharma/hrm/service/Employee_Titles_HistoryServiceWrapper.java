package vn.com.ecopharma.hrm.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link Employee_Titles_HistoryService}.
 *
 * @author tvt
 * @see Employee_Titles_HistoryService
 * @generated
 */
public class Employee_Titles_HistoryServiceWrapper
    implements Employee_Titles_HistoryService,
        ServiceWrapper<Employee_Titles_HistoryService> {
    private Employee_Titles_HistoryService _employee_Titles_HistoryService;

    public Employee_Titles_HistoryServiceWrapper(
        Employee_Titles_HistoryService employee_Titles_HistoryService) {
        _employee_Titles_HistoryService = employee_Titles_HistoryService;
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _employee_Titles_HistoryService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _employee_Titles_HistoryService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _employee_Titles_HistoryService.invokeMethod(name,
            parameterTypes, arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public Employee_Titles_HistoryService getWrappedEmployee_Titles_HistoryService() {
        return _employee_Titles_HistoryService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedEmployee_Titles_HistoryService(
        Employee_Titles_HistoryService employee_Titles_HistoryService) {
        _employee_Titles_HistoryService = employee_Titles_HistoryService;
    }

    @Override
    public Employee_Titles_HistoryService getWrappedService() {
        return _employee_Titles_HistoryService;
    }

    @Override
    public void setWrappedService(
        Employee_Titles_HistoryService employee_Titles_HistoryService) {
        _employee_Titles_HistoryService = employee_Titles_HistoryService;
    }
}
