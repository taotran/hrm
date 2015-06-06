package vn.com.ecopharma.hrm.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link EmployeeVacancyLocalService}.
 *
 * @author tvt
 * @see EmployeeVacancyLocalService
 * @generated
 */
public class EmployeeVacancyLocalServiceWrapper
    implements EmployeeVacancyLocalService,
        ServiceWrapper<EmployeeVacancyLocalService> {
    private EmployeeVacancyLocalService _employeeVacancyLocalService;

    public EmployeeVacancyLocalServiceWrapper(
        EmployeeVacancyLocalService employeeVacancyLocalService) {
        _employeeVacancyLocalService = employeeVacancyLocalService;
    }

    /**
    * Adds the employee vacancy to the database. Also notifies the appropriate model listeners.
    *
    * @param employeeVacancy the employee vacancy
    * @return the employee vacancy that was added
    * @throws SystemException if a system exception occurred
    */
    @Override
    public vn.com.ecopharma.hrm.model.EmployeeVacancy addEmployeeVacancy(
        vn.com.ecopharma.hrm.model.EmployeeVacancy employeeVacancy)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _employeeVacancyLocalService.addEmployeeVacancy(employeeVacancy);
    }

    /**
    * Creates a new employee vacancy with the primary key. Does not add the employee vacancy to the database.
    *
    * @param employeeVacancyId the primary key for the new employee vacancy
    * @return the new employee vacancy
    */
    @Override
    public vn.com.ecopharma.hrm.model.EmployeeVacancy createEmployeeVacancy(
        long employeeVacancyId) {
        return _employeeVacancyLocalService.createEmployeeVacancy(employeeVacancyId);
    }

    /**
    * Deletes the employee vacancy with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param employeeVacancyId the primary key of the employee vacancy
    * @return the employee vacancy that was removed
    * @throws PortalException if a employee vacancy with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public vn.com.ecopharma.hrm.model.EmployeeVacancy deleteEmployeeVacancy(
        long employeeVacancyId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _employeeVacancyLocalService.deleteEmployeeVacancy(employeeVacancyId);
    }

    /**
    * Deletes the employee vacancy from the database. Also notifies the appropriate model listeners.
    *
    * @param employeeVacancy the employee vacancy
    * @return the employee vacancy that was removed
    * @throws SystemException if a system exception occurred
    */
    @Override
    public vn.com.ecopharma.hrm.model.EmployeeVacancy deleteEmployeeVacancy(
        vn.com.ecopharma.hrm.model.EmployeeVacancy employeeVacancy)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _employeeVacancyLocalService.deleteEmployeeVacancy(employeeVacancy);
    }

    @Override
    public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return _employeeVacancyLocalService.dynamicQuery();
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
        return _employeeVacancyLocalService.dynamicQuery(dynamicQuery);
    }

    /**
    * Performs a dynamic query on the database and returns a range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.com.ecopharma.hrm.model.impl.EmployeeVacancyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _employeeVacancyLocalService.dynamicQuery(dynamicQuery, start,
            end);
    }

    /**
    * Performs a dynamic query on the database and returns an ordered range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.com.ecopharma.hrm.model.impl.EmployeeVacancyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _employeeVacancyLocalService.dynamicQuery(dynamicQuery, start,
            end, orderByComparator);
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
        return _employeeVacancyLocalService.dynamicQueryCount(dynamicQuery);
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
        return _employeeVacancyLocalService.dynamicQueryCount(dynamicQuery,
            projection);
    }

    @Override
    public vn.com.ecopharma.hrm.model.EmployeeVacancy fetchEmployeeVacancy(
        long employeeVacancyId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _employeeVacancyLocalService.fetchEmployeeVacancy(employeeVacancyId);
    }

    /**
    * Returns the employee vacancy with the primary key.
    *
    * @param employeeVacancyId the primary key of the employee vacancy
    * @return the employee vacancy
    * @throws PortalException if a employee vacancy with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public vn.com.ecopharma.hrm.model.EmployeeVacancy getEmployeeVacancy(
        long employeeVacancyId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _employeeVacancyLocalService.getEmployeeVacancy(employeeVacancyId);
    }

    @Override
    public com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _employeeVacancyLocalService.getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns a range of all the employee vacancies.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.com.ecopharma.hrm.model.impl.EmployeeVacancyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of employee vacancies
    * @param end the upper bound of the range of employee vacancies (not inclusive)
    * @return the range of employee vacancies
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.util.List<vn.com.ecopharma.hrm.model.EmployeeVacancy> getEmployeeVacancies(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _employeeVacancyLocalService.getEmployeeVacancies(start, end);
    }

    /**
    * Returns the number of employee vacancies.
    *
    * @return the number of employee vacancies
    * @throws SystemException if a system exception occurred
    */
    @Override
    public int getEmployeeVacanciesCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _employeeVacancyLocalService.getEmployeeVacanciesCount();
    }

    /**
    * Updates the employee vacancy in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param employeeVacancy the employee vacancy
    * @return the employee vacancy that was updated
    * @throws SystemException if a system exception occurred
    */
    @Override
    public vn.com.ecopharma.hrm.model.EmployeeVacancy updateEmployeeVacancy(
        vn.com.ecopharma.hrm.model.EmployeeVacancy employeeVacancy)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _employeeVacancyLocalService.updateEmployeeVacancy(employeeVacancy);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _employeeVacancyLocalService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _employeeVacancyLocalService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _employeeVacancyLocalService.invokeMethod(name, parameterTypes,
            arguments);
    }

    @Override
    public java.util.List<vn.com.ecopharma.hrm.model.EmployeeVacancy> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _employeeVacancyLocalService.findAll();
    }

    @Override
    public java.util.List<vn.com.ecopharma.hrm.model.EmployeeVacancy> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _employeeVacancyLocalService.findAll(start, end);
    }

    @Override
    public java.util.List<vn.com.ecopharma.hrm.model.EmployeeVacancy> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _employeeVacancyLocalService.findAll(start, end,
            orderByComparator);
    }

    @Override
    public java.util.List<vn.com.ecopharma.hrm.model.EmployeeVacancy> findByVacancy(
        long vacancyId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _employeeVacancyLocalService.findByVacancy(vacancyId);
    }

    @Override
    public java.util.List<vn.com.ecopharma.hrm.model.EmployeeVacancy> findByEmployee(
        long employeeId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _employeeVacancyLocalService.findByEmployee(employeeId);
    }

    @Override
    public vn.com.ecopharma.hrm.model.EmployeeVacancy create(long employeeId,
        long vacancyId, long userId,
        com.liferay.portal.service.ServiceContext serviceContext)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _employeeVacancyLocalService.create(employeeId, vacancyId,
            userId, serviceContext);
    }

    @Override
    public void delete(long employeeVacancyId)
        throws com.liferay.portal.kernel.exception.SystemException,
            vn.com.ecopharma.hrm.NoSuchEmployeeVacancyException {
        _employeeVacancyLocalService.delete(employeeVacancyId);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public EmployeeVacancyLocalService getWrappedEmployeeVacancyLocalService() {
        return _employeeVacancyLocalService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedEmployeeVacancyLocalService(
        EmployeeVacancyLocalService employeeVacancyLocalService) {
        _employeeVacancyLocalService = employeeVacancyLocalService;
    }

    @Override
    public EmployeeVacancyLocalService getWrappedService() {
        return _employeeVacancyLocalService;
    }

    @Override
    public void setWrappedService(
        EmployeeVacancyLocalService employeeVacancyLocalService) {
        _employeeVacancyLocalService = employeeVacancyLocalService;
    }
}
