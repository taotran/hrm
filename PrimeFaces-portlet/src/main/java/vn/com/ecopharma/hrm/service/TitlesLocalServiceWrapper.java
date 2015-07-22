package vn.com.ecopharma.hrm.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link TitlesLocalService}.
 *
 * @author tvt
 * @see TitlesLocalService
 * @generated
 */
public class TitlesLocalServiceWrapper implements TitlesLocalService,
    ServiceWrapper<TitlesLocalService> {
    private TitlesLocalService _titlesLocalService;

    public TitlesLocalServiceWrapper(TitlesLocalService titlesLocalService) {
        _titlesLocalService = titlesLocalService;
    }

    /**
    * Adds the titles to the database. Also notifies the appropriate model listeners.
    *
    * @param titles the titles
    * @return the titles that was added
    * @throws SystemException if a system exception occurred
    */
    @Override
    public vn.com.ecopharma.hrm.model.Titles addTitles(
        vn.com.ecopharma.hrm.model.Titles titles)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _titlesLocalService.addTitles(titles);
    }

    /**
    * Creates a new titles with the primary key. Does not add the titles to the database.
    *
    * @param titlesId the primary key for the new titles
    * @return the new titles
    */
    @Override
    public vn.com.ecopharma.hrm.model.Titles createTitles(long titlesId) {
        return _titlesLocalService.createTitles(titlesId);
    }

    /**
    * Deletes the titles with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param titlesId the primary key of the titles
    * @return the titles that was removed
    * @throws PortalException if a titles with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public vn.com.ecopharma.hrm.model.Titles deleteTitles(long titlesId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _titlesLocalService.deleteTitles(titlesId);
    }

    /**
    * Deletes the titles from the database. Also notifies the appropriate model listeners.
    *
    * @param titles the titles
    * @return the titles that was removed
    * @throws SystemException if a system exception occurred
    */
    @Override
    public vn.com.ecopharma.hrm.model.Titles deleteTitles(
        vn.com.ecopharma.hrm.model.Titles titles)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _titlesLocalService.deleteTitles(titles);
    }

    @Override
    public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return _titlesLocalService.dynamicQuery();
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
        return _titlesLocalService.dynamicQuery(dynamicQuery);
    }

    /**
    * Performs a dynamic query on the database and returns a range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.com.ecopharma.hrm.model.impl.TitlesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _titlesLocalService.dynamicQuery(dynamicQuery, start, end);
    }

    /**
    * Performs a dynamic query on the database and returns an ordered range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.com.ecopharma.hrm.model.impl.TitlesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _titlesLocalService.dynamicQuery(dynamicQuery, start, end,
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
        return _titlesLocalService.dynamicQueryCount(dynamicQuery);
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
        return _titlesLocalService.dynamicQueryCount(dynamicQuery, projection);
    }

    @Override
    public vn.com.ecopharma.hrm.model.Titles fetchTitles(long titlesId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _titlesLocalService.fetchTitles(titlesId);
    }

    /**
    * Returns the titles with the primary key.
    *
    * @param titlesId the primary key of the titles
    * @return the titles
    * @throws PortalException if a titles with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public vn.com.ecopharma.hrm.model.Titles getTitles(long titlesId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _titlesLocalService.getTitles(titlesId);
    }

    @Override
    public com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _titlesLocalService.getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns a range of all the titleses.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.com.ecopharma.hrm.model.impl.TitlesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of titleses
    * @param end the upper bound of the range of titleses (not inclusive)
    * @return the range of titleses
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.util.List<vn.com.ecopharma.hrm.model.Titles> getTitleses(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _titlesLocalService.getTitleses(start, end);
    }

    /**
    * Returns the number of titleses.
    *
    * @return the number of titleses
    * @throws SystemException if a system exception occurred
    */
    @Override
    public int getTitlesesCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _titlesLocalService.getTitlesesCount();
    }

    /**
    * Updates the titles in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param titles the titles
    * @return the titles that was updated
    * @throws SystemException if a system exception occurred
    */
    @Override
    public vn.com.ecopharma.hrm.model.Titles updateTitles(
        vn.com.ecopharma.hrm.model.Titles titles)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _titlesLocalService.updateTitles(titles);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _titlesLocalService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _titlesLocalService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _titlesLocalService.invokeMethod(name, parameterTypes, arguments);
    }

    @Override
    public java.util.List<vn.com.ecopharma.hrm.model.Titles> findAll() {
        return _titlesLocalService.findAll();
    }

    @Override
    public java.util.List<vn.com.ecopharma.hrm.model.Titles> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _titlesLocalService.findAll(start, end);
    }

    @Override
    public java.util.List<vn.com.ecopharma.hrm.model.Titles> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _titlesLocalService.findAll(start, end, orderByComparator);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public TitlesLocalService getWrappedTitlesLocalService() {
        return _titlesLocalService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedTitlesLocalService(
        TitlesLocalService titlesLocalService) {
        _titlesLocalService = titlesLocalService;
    }

    @Override
    public TitlesLocalService getWrappedService() {
        return _titlesLocalService;
    }

    @Override
    public void setWrappedService(TitlesLocalService titlesLocalService) {
        _titlesLocalService = titlesLocalService;
    }
}
