package vn.com.ecopharma.hrm.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link Employee_Titles_HistoryLocalService}.
 *
 * @author tvt
 * @see Employee_Titles_HistoryLocalService
 * @generated
 */
public class Employee_Titles_HistoryLocalServiceWrapper
    implements Employee_Titles_HistoryLocalService,
        ServiceWrapper<Employee_Titles_HistoryLocalService> {
    private Employee_Titles_HistoryLocalService _employee_Titles_HistoryLocalService;

    public Employee_Titles_HistoryLocalServiceWrapper(
        Employee_Titles_HistoryLocalService employee_Titles_HistoryLocalService) {
        _employee_Titles_HistoryLocalService = employee_Titles_HistoryLocalService;
    }

    /**
    * Adds the employee_ titles_ history to the database. Also notifies the appropriate model listeners.
    *
    * @param employee_Titles_History the employee_ titles_ history
    * @return the employee_ titles_ history that was added
    * @throws SystemException if a system exception occurred
    */
    @Override
    public vn.com.ecopharma.hrm.model.Employee_Titles_History addEmployee_Titles_History(
        vn.com.ecopharma.hrm.model.Employee_Titles_History employee_Titles_History)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _employee_Titles_HistoryLocalService.addEmployee_Titles_History(employee_Titles_History);
    }

    /**
    * Creates a new employee_ titles_ history with the primary key. Does not add the employee_ titles_ history to the database.
    *
    * @param employee_Titles_HistoryId the primary key for the new employee_ titles_ history
    * @return the new employee_ titles_ history
    */
    @Override
    public vn.com.ecopharma.hrm.model.Employee_Titles_History createEmployee_Titles_History(
        long employee_Titles_HistoryId) {
        return _employee_Titles_HistoryLocalService.createEmployee_Titles_History(employee_Titles_HistoryId);
    }

    /**
    * Deletes the employee_ titles_ history with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param employee_Titles_HistoryId the primary key of the employee_ titles_ history
    * @return the employee_ titles_ history that was removed
    * @throws PortalException if a employee_ titles_ history with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public vn.com.ecopharma.hrm.model.Employee_Titles_History deleteEmployee_Titles_History(
        long employee_Titles_HistoryId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _employee_Titles_HistoryLocalService.deleteEmployee_Titles_History(employee_Titles_HistoryId);
    }

    /**
    * Deletes the employee_ titles_ history from the database. Also notifies the appropriate model listeners.
    *
    * @param employee_Titles_History the employee_ titles_ history
    * @return the employee_ titles_ history that was removed
    * @throws SystemException if a system exception occurred
    */
    @Override
    public vn.com.ecopharma.hrm.model.Employee_Titles_History deleteEmployee_Titles_History(
        vn.com.ecopharma.hrm.model.Employee_Titles_History employee_Titles_History)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _employee_Titles_HistoryLocalService.deleteEmployee_Titles_History(employee_Titles_History);
    }

    @Override
    public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return _employee_Titles_HistoryLocalService.dynamicQuery();
    }

    /**
    * Performs a dynamic query on the database and returns the matching rows.
    *
    * @param dynamicQuery the dynamic query
    * @return the matching rows
    * @throws SystemException if a system exception occurred
    */
    @Override
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _employee_Titles_HistoryLocalService.dynamicQuery(dynamicQuery);
    }

    /**
    * Performs a dynamic query on the database and returns a range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.com.ecopharma.hrm.model.impl.Employee_Titles_HistoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param dynamicQuery the dynamic query
    * @param start the lower bound of the range of model instances
    * @param end the upper bound of the range of model instances (not inclusive)
    * @return the range of matching rows
    * @throws SystemException if a system exception occurred
    */
    @Override
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException {
        return _employee_Titles_HistoryLocalService.dynamicQuery(dynamicQuery,
            start, end);
    }

    /**
    * Performs a dynamic query on the database and returns an ordered range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.com.ecopharma.hrm.model.impl.Employee_Titles_HistoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param dynamicQuery the dynamic query
    * @param start the lower bound of the range of model instances
    * @param end the upper bound of the range of model instances (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching rows
    * @throws SystemException if a system exception occurred
    */
    @Override
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _employee_Titles_HistoryLocalService.dynamicQuery(dynamicQuery,
            start, end, orderByComparator);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    @Override
    public long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _employee_Titles_HistoryLocalService.dynamicQueryCount(dynamicQuery);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @param projection the projection to apply to the query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    @Override
    public long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
        com.liferay.portal.kernel.dao.orm.Projection projection)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _employee_Titles_HistoryLocalService.dynamicQueryCount(dynamicQuery,
            projection);
    }

    @Override
    public vn.com.ecopharma.hrm.model.Employee_Titles_History fetchEmployee_Titles_History(
        long employee_Titles_HistoryId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _employee_Titles_HistoryLocalService.fetchEmployee_Titles_History(employee_Titles_HistoryId);
    }

    /**
    * Returns the employee_ titles_ history with the primary key.
    *
    * @param employee_Titles_HistoryId the primary key of the employee_ titles_ history
    * @return the employee_ titles_ history
    * @throws PortalException if a employee_ titles_ history with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public vn.com.ecopharma.hrm.model.Employee_Titles_History getEmployee_Titles_History(
        long employee_Titles_HistoryId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _employee_Titles_HistoryLocalService.getEmployee_Titles_History(employee_Titles_HistoryId);
    }

    @Override
    public com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _employee_Titles_HistoryLocalService.getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns a range of all the employee_ titles_ histories.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.com.ecopharma.hrm.model.impl.Employee_Titles_HistoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of employee_ titles_ histories
    * @param end the upper bound of the range of employee_ titles_ histories (not inclusive)
    * @return the range of employee_ titles_ histories
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.util.List<vn.com.ecopharma.hrm.model.Employee_Titles_History> getEmployee_Titles_Histories(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _employee_Titles_HistoryLocalService.getEmployee_Titles_Histories(start,
            end);
    }

    /**
    * Returns the number of employee_ titles_ histories.
    *
    * @return the number of employee_ titles_ histories
    * @throws SystemException if a system exception occurred
    */
    @Override
    public int getEmployee_Titles_HistoriesCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _employee_Titles_HistoryLocalService.getEmployee_Titles_HistoriesCount();
    }

    /**
    * Updates the employee_ titles_ history in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param employee_Titles_History the employee_ titles_ history
    * @return the employee_ titles_ history that was updated
    * @throws SystemException if a system exception occurred
    */
    @Override
    public vn.com.ecopharma.hrm.model.Employee_Titles_History updateEmployee_Titles_History(
        vn.com.ecopharma.hrm.model.Employee_Titles_History employee_Titles_History)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _employee_Titles_HistoryLocalService.updateEmployee_Titles_History(employee_Titles_History);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _employee_Titles_HistoryLocalService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _employee_Titles_HistoryLocalService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _employee_Titles_HistoryLocalService.invokeMethod(name,
            parameterTypes, arguments);
    }

    @Override
    public java.util.List<vn.com.ecopharma.hrm.model.Employee_Titles_History> findAll() {
        return _employee_Titles_HistoryLocalService.findAll();
    }

    @Override
    public java.util.List<vn.com.ecopharma.hrm.model.Employee_Titles_History> findAll(
        int start, int end) {
        return _employee_Titles_HistoryLocalService.findAll(start, end);
    }

    @Override
    public java.util.List<vn.com.ecopharma.hrm.model.Employee_Titles_History> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator) {
        return _employee_Titles_HistoryLocalService.findAll(start, end,
            orderByComparator);
    }

    @Override
    public vn.com.ecopharma.hrm.model.Employee_Titles_History addEmployee_Titles_History(
        long employeeId, long titlesId, java.lang.String note,
        java.util.Date set_date,
        com.liferay.portal.service.ServiceContext serviceContext)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _employee_Titles_HistoryLocalService.addEmployee_Titles_History(employeeId,
            titlesId, note, set_date, serviceContext);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public Employee_Titles_HistoryLocalService getWrappedEmployee_Titles_HistoryLocalService() {
        return _employee_Titles_HistoryLocalService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedEmployee_Titles_HistoryLocalService(
        Employee_Titles_HistoryLocalService employee_Titles_HistoryLocalService) {
        _employee_Titles_HistoryLocalService = employee_Titles_HistoryLocalService;
    }

    @Override
    public Employee_Titles_HistoryLocalService getWrappedService() {
        return _employee_Titles_HistoryLocalService;
    }

    @Override
    public void setWrappedService(
        Employee_Titles_HistoryLocalService employee_Titles_HistoryLocalService) {
        _employee_Titles_HistoryLocalService = employee_Titles_HistoryLocalService;
    }
}
