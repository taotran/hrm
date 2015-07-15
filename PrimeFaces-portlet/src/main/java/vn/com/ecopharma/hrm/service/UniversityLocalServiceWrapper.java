package vn.com.ecopharma.hrm.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link UniversityLocalService}.
 *
 * @author tvt
 * @see UniversityLocalService
 * @generated
 */
public class UniversityLocalServiceWrapper implements UniversityLocalService,
    ServiceWrapper<UniversityLocalService> {
    private UniversityLocalService _universityLocalService;

    public UniversityLocalServiceWrapper(
        UniversityLocalService universityLocalService) {
        _universityLocalService = universityLocalService;
    }

    /**
    * Adds the university to the database. Also notifies the appropriate model listeners.
    *
    * @param university the university
    * @return the university that was added
    * @throws SystemException if a system exception occurred
    */
    @Override
    public vn.com.ecopharma.hrm.model.University addUniversity(
        vn.com.ecopharma.hrm.model.University university)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _universityLocalService.addUniversity(university);
    }

    /**
    * Creates a new university with the primary key. Does not add the university to the database.
    *
    * @param universityId the primary key for the new university
    * @return the new university
    */
    @Override
    public vn.com.ecopharma.hrm.model.University createUniversity(
        long universityId) {
        return _universityLocalService.createUniversity(universityId);
    }

    /**
    * Deletes the university with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param universityId the primary key of the university
    * @return the university that was removed
    * @throws PortalException if a university with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public vn.com.ecopharma.hrm.model.University deleteUniversity(
        long universityId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _universityLocalService.deleteUniversity(universityId);
    }

    /**
    * Deletes the university from the database. Also notifies the appropriate model listeners.
    *
    * @param university the university
    * @return the university that was removed
    * @throws SystemException if a system exception occurred
    */
    @Override
    public vn.com.ecopharma.hrm.model.University deleteUniversity(
        vn.com.ecopharma.hrm.model.University university)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _universityLocalService.deleteUniversity(university);
    }

    @Override
    public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return _universityLocalService.dynamicQuery();
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
        return _universityLocalService.dynamicQuery(dynamicQuery);
    }

    /**
    * Performs a dynamic query on the database and returns a range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.com.ecopharma.hrm.model.impl.UniversityModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _universityLocalService.dynamicQuery(dynamicQuery, start, end);
    }

    /**
    * Performs a dynamic query on the database and returns an ordered range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.com.ecopharma.hrm.model.impl.UniversityModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _universityLocalService.dynamicQuery(dynamicQuery, start, end,
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
        return _universityLocalService.dynamicQueryCount(dynamicQuery);
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
        return _universityLocalService.dynamicQueryCount(dynamicQuery,
            projection);
    }

    @Override
    public vn.com.ecopharma.hrm.model.University fetchUniversity(
        long universityId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _universityLocalService.fetchUniversity(universityId);
    }

    /**
    * Returns the university with the primary key.
    *
    * @param universityId the primary key of the university
    * @return the university
    * @throws PortalException if a university with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public vn.com.ecopharma.hrm.model.University getUniversity(
        long universityId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _universityLocalService.getUniversity(universityId);
    }

    @Override
    public com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _universityLocalService.getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns a range of all the universities.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.com.ecopharma.hrm.model.impl.UniversityModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of universities
    * @param end the upper bound of the range of universities (not inclusive)
    * @return the range of universities
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.util.List<vn.com.ecopharma.hrm.model.University> getUniversities(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _universityLocalService.getUniversities(start, end);
    }

    /**
    * Returns the number of universities.
    *
    * @return the number of universities
    * @throws SystemException if a system exception occurred
    */
    @Override
    public int getUniversitiesCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _universityLocalService.getUniversitiesCount();
    }

    /**
    * Updates the university in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param university the university
    * @return the university that was updated
    * @throws SystemException if a system exception occurred
    */
    @Override
    public vn.com.ecopharma.hrm.model.University updateUniversity(
        vn.com.ecopharma.hrm.model.University university)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _universityLocalService.updateUniversity(university);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _universityLocalService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _universityLocalService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _universityLocalService.invokeMethod(name, parameterTypes,
            arguments);
    }

    @Override
    public java.util.List<vn.com.ecopharma.hrm.model.University> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _universityLocalService.findAll();
    }

    @Override
    public java.util.List<vn.com.ecopharma.hrm.model.University> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _universityLocalService.findAll(start, end);
    }

    @Override
    public java.util.List<vn.com.ecopharma.hrm.model.University> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _universityLocalService.findAll(start, end, orderByComparator);
    }

    @Override
    public vn.com.ecopharma.hrm.model.University addUniversity(
        java.lang.String name, java.lang.String code, java.lang.String tel_fax,
        com.liferay.portal.service.ServiceContext serviceContext)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _universityLocalService.addUniversity(name, code, tel_fax,
            serviceContext);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public UniversityLocalService getWrappedUniversityLocalService() {
        return _universityLocalService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedUniversityLocalService(
        UniversityLocalService universityLocalService) {
        _universityLocalService = universityLocalService;
    }

    @Override
    public UniversityLocalService getWrappedService() {
        return _universityLocalService;
    }

    @Override
    public void setWrappedService(UniversityLocalService universityLocalService) {
        _universityLocalService = universityLocalService;
    }
}
