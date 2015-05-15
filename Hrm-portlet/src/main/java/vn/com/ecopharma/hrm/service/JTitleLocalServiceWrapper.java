package vn.com.ecopharma.hrm.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link JTitleLocalService}.
 *
 * @author tvt
 * @see JTitleLocalService
 * @generated
 */
public class JTitleLocalServiceWrapper implements JTitleLocalService,
    ServiceWrapper<JTitleLocalService> {
    private JTitleLocalService _jTitleLocalService;

    public JTitleLocalServiceWrapper(JTitleLocalService jTitleLocalService) {
        _jTitleLocalService = jTitleLocalService;
    }

    /**
    * Adds the j title to the database. Also notifies the appropriate model listeners.
    *
    * @param jTitle the j title
    * @return the j title that was added
    * @throws SystemException if a system exception occurred
    */
    @Override
    public vn.com.ecopharma.hrm.model.JTitle addJTitle(
        vn.com.ecopharma.hrm.model.JTitle jTitle)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _jTitleLocalService.addJTitle(jTitle);
    }

    /**
    * Creates a new j title with the primary key. Does not add the j title to the database.
    *
    * @param jobtitleId the primary key for the new j title
    * @return the new j title
    */
    @Override
    public vn.com.ecopharma.hrm.model.JTitle createJTitle(long jobtitleId) {
        return _jTitleLocalService.createJTitle(jobtitleId);
    }

    /**
    * Deletes the j title with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param jobtitleId the primary key of the j title
    * @return the j title that was removed
    * @throws PortalException if a j title with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public vn.com.ecopharma.hrm.model.JTitle deleteJTitle(long jobtitleId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _jTitleLocalService.deleteJTitle(jobtitleId);
    }

    /**
    * Deletes the j title from the database. Also notifies the appropriate model listeners.
    *
    * @param jTitle the j title
    * @return the j title that was removed
    * @throws SystemException if a system exception occurred
    */
    @Override
    public vn.com.ecopharma.hrm.model.JTitle deleteJTitle(
        vn.com.ecopharma.hrm.model.JTitle jTitle)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _jTitleLocalService.deleteJTitle(jTitle);
    }

    @Override
    public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return _jTitleLocalService.dynamicQuery();
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
        return _jTitleLocalService.dynamicQuery(dynamicQuery);
    }

    /**
    * Performs a dynamic query on the database and returns a range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.com.ecopharma.hrm.model.impl.JTitleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _jTitleLocalService.dynamicQuery(dynamicQuery, start, end);
    }

    /**
    * Performs a dynamic query on the database and returns an ordered range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.com.ecopharma.hrm.model.impl.JTitleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _jTitleLocalService.dynamicQuery(dynamicQuery, start, end,
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
        return _jTitleLocalService.dynamicQueryCount(dynamicQuery);
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
        return _jTitleLocalService.dynamicQueryCount(dynamicQuery, projection);
    }

    @Override
    public vn.com.ecopharma.hrm.model.JTitle fetchJTitle(long jobtitleId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _jTitleLocalService.fetchJTitle(jobtitleId);
    }

    /**
    * Returns the j title with the primary key.
    *
    * @param jobtitleId the primary key of the j title
    * @return the j title
    * @throws PortalException if a j title with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public vn.com.ecopharma.hrm.model.JTitle getJTitle(long jobtitleId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _jTitleLocalService.getJTitle(jobtitleId);
    }

    @Override
    public com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _jTitleLocalService.getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns a range of all the j titles.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.com.ecopharma.hrm.model.impl.JTitleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of j titles
    * @param end the upper bound of the range of j titles (not inclusive)
    * @return the range of j titles
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.util.List<vn.com.ecopharma.hrm.model.JTitle> getJTitles(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _jTitleLocalService.getJTitles(start, end);
    }

    /**
    * Returns the number of j titles.
    *
    * @return the number of j titles
    * @throws SystemException if a system exception occurred
    */
    @Override
    public int getJTitlesCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _jTitleLocalService.getJTitlesCount();
    }

    /**
    * Updates the j title in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param jTitle the j title
    * @return the j title that was updated
    * @throws SystemException if a system exception occurred
    */
    @Override
    public vn.com.ecopharma.hrm.model.JTitle updateJTitle(
        vn.com.ecopharma.hrm.model.JTitle jTitle)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _jTitleLocalService.updateJTitle(jTitle);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _jTitleLocalService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _jTitleLocalService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _jTitleLocalService.invokeMethod(name, parameterTypes, arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public JTitleLocalService getWrappedJTitleLocalService() {
        return _jTitleLocalService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedJTitleLocalService(
        JTitleLocalService jTitleLocalService) {
        _jTitleLocalService = jTitleLocalService;
    }

    @Override
    public JTitleLocalService getWrappedService() {
        return _jTitleLocalService;
    }

    @Override
    public void setWrappedService(JTitleLocalService jTitleLocalService) {
        _jTitleLocalService = jTitleLocalService;
    }
}
