package vn.com.ecopharma.hrm.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link EmployeeLocalService}.
 *
 * @author tvt
 * @see EmployeeLocalService
 * @generated
 */
public class EmployeeLocalServiceWrapper implements EmployeeLocalService,
    ServiceWrapper<EmployeeLocalService> {
    private EmployeeLocalService _employeeLocalService;

    public EmployeeLocalServiceWrapper(
        EmployeeLocalService employeeLocalService) {
        _employeeLocalService = employeeLocalService;
    }

    /**
    * Adds the employee to the database. Also notifies the appropriate model listeners.
    *
    * @param employee the employee
    * @return the employee that was added
    * @throws SystemException if a system exception occurred
    */
    @Override
    public vn.com.ecopharma.hrm.model.Employee addEmployee(
        vn.com.ecopharma.hrm.model.Employee employee)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _employeeLocalService.addEmployee(employee);
    }

    /**
    * Creates a new employee with the primary key. Does not add the employee to the database.
    *
    * @param employeeId the primary key for the new employee
    * @return the new employee
    */
    @Override
    public vn.com.ecopharma.hrm.model.Employee createEmployee(long employeeId) {
        return _employeeLocalService.createEmployee(employeeId);
    }

    /**
    * Deletes the employee with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param employeeId the primary key of the employee
    * @return the employee that was removed
    * @throws PortalException if a employee with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public vn.com.ecopharma.hrm.model.Employee deleteEmployee(long employeeId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _employeeLocalService.deleteEmployee(employeeId);
    }

    /**
    * Deletes the employee from the database. Also notifies the appropriate model listeners.
    *
    * @param employee the employee
    * @return the employee that was removed
    * @throws SystemException if a system exception occurred
    */
    @Override
    public vn.com.ecopharma.hrm.model.Employee deleteEmployee(
        vn.com.ecopharma.hrm.model.Employee employee)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _employeeLocalService.deleteEmployee(employee);
    }

    @Override
    public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return _employeeLocalService.dynamicQuery();
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
        return _employeeLocalService.dynamicQuery(dynamicQuery);
    }

    /**
    * Performs a dynamic query on the database and returns a range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.com.ecopharma.hrm.model.impl.EmployeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _employeeLocalService.dynamicQuery(dynamicQuery, start, end);
    }

    /**
    * Performs a dynamic query on the database and returns an ordered range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.com.ecopharma.hrm.model.impl.EmployeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _employeeLocalService.dynamicQuery(dynamicQuery, start, end,
            orderByComparator);
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
        return _employeeLocalService.dynamicQueryCount(dynamicQuery);
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
        return _employeeLocalService.dynamicQueryCount(dynamicQuery, projection);
    }

    @Override
    public vn.com.ecopharma.hrm.model.Employee fetchEmployee(long employeeId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _employeeLocalService.fetchEmployee(employeeId);
    }

    /**
    * Returns the employee with the primary key.
    *
    * @param employeeId the primary key of the employee
    * @return the employee
    * @throws PortalException if a employee with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public vn.com.ecopharma.hrm.model.Employee getEmployee(long employeeId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _employeeLocalService.getEmployee(employeeId);
    }

    @Override
    public com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _employeeLocalService.getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns a range of all the employees.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.com.ecopharma.hrm.model.impl.EmployeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of employees
    * @param end the upper bound of the range of employees (not inclusive)
    * @return the range of employees
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.util.List<vn.com.ecopharma.hrm.model.Employee> getEmployees(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _employeeLocalService.getEmployees(start, end);
    }

    /**
    * Returns the number of employees.
    *
    * @return the number of employees
    * @throws SystemException if a system exception occurred
    */
    @Override
    public int getEmployeesCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _employeeLocalService.getEmployeesCount();
    }

    /**
    * Updates the employee in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param employee the employee
    * @return the employee that was updated
    * @throws SystemException if a system exception occurred
    */
    @Override
    public vn.com.ecopharma.hrm.model.Employee updateEmployee(
        vn.com.ecopharma.hrm.model.Employee employee)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _employeeLocalService.updateEmployee(employee);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _employeeLocalService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _employeeLocalService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _employeeLocalService.invokeMethod(name, parameterTypes,
            arguments);
    }

    @Override
    public java.util.List<vn.com.ecopharma.hrm.model.Employee> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _employeeLocalService.findAll();
    }

    @Override
    public java.util.List<vn.com.ecopharma.hrm.model.Employee> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _employeeLocalService.findAll(start, end);
    }

    @Override
    public java.util.List<vn.com.ecopharma.hrm.model.Employee> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _employeeLocalService.findAll(start, end, orderByComparator);
    }

    @Override
    public vn.com.ecopharma.hrm.model.Employee create(
        java.lang.String emp_code, java.lang.String firstname,
        java.lang.String middle_name, java.lang.String lastname,
        java.lang.String email, java.lang.String contact_number,
        java.lang.String nickname, java.util.Date birthday,
        java.lang.String gender, long jobTitleId, java.util.Date joined_date,
        long userId, com.liferay.portal.service.ServiceContext serviceContext)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _employeeLocalService.create(emp_code, firstname, middle_name,
            lastname, email, contact_number, nickname, birthday, gender,
            jobTitleId, joined_date, userId, serviceContext);
    }

    @Override
    public vn.com.ecopharma.hrm.model.Employee tranferCandidate(
        vn.com.ecopharma.hrm.model.Candidate candidate,
        java.lang.String emp_code, java.lang.String nickname,
        java.util.Date birthday, long jobTitleId, java.util.Date joined_date)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _employeeLocalService.tranferCandidate(candidate, emp_code,
            nickname, birthday, jobTitleId, joined_date);
    }

    @Override
    public void delete(long employeeId)
        throws com.liferay.portal.NoSuchModelException,
            com.liferay.portal.kernel.exception.SystemException,
            vn.com.ecopharma.hrm.NoSuchVacancyCandidateException {
        _employeeLocalService.delete(employeeId);
    }

    @Override
    public java.lang.String getListInterviewersStringByIds(
        java.util.List<java.lang.Long> ids)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _employeeLocalService.getListInterviewersStringByIds(ids);
    }

    @Override
    public java.lang.String getListInterviewersStringByEmps(
        java.util.List<vn.com.ecopharma.hrm.model.Employee> emps) {
        return _employeeLocalService.getListInterviewersStringByEmps(emps);
    }

    @Override
    public java.util.List<vn.com.ecopharma.hrm.model.Employee> findByIds(
        java.util.List<java.lang.Long> ids)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _employeeLocalService.findByIds(ids);
    }

    @Override
    public java.util.List<vn.com.ecopharma.hrm.model.Employee> filterByName(
        java.lang.String term)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _employeeLocalService.filterByName(term);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public EmployeeLocalService getWrappedEmployeeLocalService() {
        return _employeeLocalService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedEmployeeLocalService(
        EmployeeLocalService employeeLocalService) {
        _employeeLocalService = employeeLocalService;
    }

    @Override
    public EmployeeLocalService getWrappedService() {
        return _employeeLocalService;
    }

    @Override
    public void setWrappedService(EmployeeLocalService employeeLocalService) {
        _employeeLocalService = employeeLocalService;
    }
}
