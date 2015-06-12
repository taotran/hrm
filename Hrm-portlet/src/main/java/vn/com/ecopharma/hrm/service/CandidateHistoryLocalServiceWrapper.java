package vn.com.ecopharma.hrm.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link CandidateHistoryLocalService}.
 *
 * @author tvt
 * @see CandidateHistoryLocalService
 * @generated
 */
public class CandidateHistoryLocalServiceWrapper
    implements CandidateHistoryLocalService,
        ServiceWrapper<CandidateHistoryLocalService> {
    private CandidateHistoryLocalService _candidateHistoryLocalService;

    public CandidateHistoryLocalServiceWrapper(
        CandidateHistoryLocalService candidateHistoryLocalService) {
        _candidateHistoryLocalService = candidateHistoryLocalService;
    }

    /**
    * Adds the candidate history to the database. Also notifies the appropriate model listeners.
    *
    * @param candidateHistory the candidate history
    * @return the candidate history that was added
    * @throws SystemException if a system exception occurred
    */
    @Override
    public vn.com.ecopharma.hrm.model.CandidateHistory addCandidateHistory(
        vn.com.ecopharma.hrm.model.CandidateHistory candidateHistory)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _candidateHistoryLocalService.addCandidateHistory(candidateHistory);
    }

    /**
    * Creates a new candidate history with the primary key. Does not add the candidate history to the database.
    *
    * @param candidateHistoryId the primary key for the new candidate history
    * @return the new candidate history
    */
    @Override
    public vn.com.ecopharma.hrm.model.CandidateHistory createCandidateHistory(
        long candidateHistoryId) {
        return _candidateHistoryLocalService.createCandidateHistory(candidateHistoryId);
    }

    /**
    * Deletes the candidate history with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param candidateHistoryId the primary key of the candidate history
    * @return the candidate history that was removed
    * @throws PortalException if a candidate history with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public vn.com.ecopharma.hrm.model.CandidateHistory deleteCandidateHistory(
        long candidateHistoryId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _candidateHistoryLocalService.deleteCandidateHistory(candidateHistoryId);
    }

    /**
    * Deletes the candidate history from the database. Also notifies the appropriate model listeners.
    *
    * @param candidateHistory the candidate history
    * @return the candidate history that was removed
    * @throws SystemException if a system exception occurred
    */
    @Override
    public vn.com.ecopharma.hrm.model.CandidateHistory deleteCandidateHistory(
        vn.com.ecopharma.hrm.model.CandidateHistory candidateHistory)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _candidateHistoryLocalService.deleteCandidateHistory(candidateHistory);
    }

    @Override
    public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return _candidateHistoryLocalService.dynamicQuery();
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
        return _candidateHistoryLocalService.dynamicQuery(dynamicQuery);
    }

    /**
    * Performs a dynamic query on the database and returns a range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.com.ecopharma.hrm.model.impl.CandidateHistoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _candidateHistoryLocalService.dynamicQuery(dynamicQuery, start,
            end);
    }

    /**
    * Performs a dynamic query on the database and returns an ordered range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.com.ecopharma.hrm.model.impl.CandidateHistoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _candidateHistoryLocalService.dynamicQuery(dynamicQuery, start,
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
        return _candidateHistoryLocalService.dynamicQueryCount(dynamicQuery);
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
        return _candidateHistoryLocalService.dynamicQueryCount(dynamicQuery,
            projection);
    }

    @Override
    public vn.com.ecopharma.hrm.model.CandidateHistory fetchCandidateHistory(
        long candidateHistoryId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _candidateHistoryLocalService.fetchCandidateHistory(candidateHistoryId);
    }

    /**
    * Returns the candidate history with the primary key.
    *
    * @param candidateHistoryId the primary key of the candidate history
    * @return the candidate history
    * @throws PortalException if a candidate history with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public vn.com.ecopharma.hrm.model.CandidateHistory getCandidateHistory(
        long candidateHistoryId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _candidateHistoryLocalService.getCandidateHistory(candidateHistoryId);
    }

    @Override
    public com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _candidateHistoryLocalService.getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns a range of all the candidate histories.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.com.ecopharma.hrm.model.impl.CandidateHistoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of candidate histories
    * @param end the upper bound of the range of candidate histories (not inclusive)
    * @return the range of candidate histories
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.util.List<vn.com.ecopharma.hrm.model.CandidateHistory> getCandidateHistories(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _candidateHistoryLocalService.getCandidateHistories(start, end);
    }

    /**
    * Returns the number of candidate histories.
    *
    * @return the number of candidate histories
    * @throws SystemException if a system exception occurred
    */
    @Override
    public int getCandidateHistoriesCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _candidateHistoryLocalService.getCandidateHistoriesCount();
    }

    /**
    * Updates the candidate history in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param candidateHistory the candidate history
    * @return the candidate history that was updated
    * @throws SystemException if a system exception occurred
    */
    @Override
    public vn.com.ecopharma.hrm.model.CandidateHistory updateCandidateHistory(
        vn.com.ecopharma.hrm.model.CandidateHistory candidateHistory)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _candidateHistoryLocalService.updateCandidateHistory(candidateHistory);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _candidateHistoryLocalService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _candidateHistoryLocalService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _candidateHistoryLocalService.invokeMethod(name, parameterTypes,
            arguments);
    }

    @Override
    public java.util.List<vn.com.ecopharma.hrm.model.CandidateHistory> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _candidateHistoryLocalService.findAll();
    }

    @Override
    public java.util.List<vn.com.ecopharma.hrm.model.CandidateHistory> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _candidateHistoryLocalService.findAll(start, end);
    }

    @Override
    public java.util.List<vn.com.ecopharma.hrm.model.CandidateHistory> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _candidateHistoryLocalService.findAll(start, end,
            orderByComparator);
    }

    @Override
    public vn.com.ecopharma.hrm.model.CandidateHistory create(long c_id,
        long v_id, long interviewId, long performer_id, java.lang.String note,
        java.sql.Date performedDate, java.lang.String interviewers,
        java.lang.String action, long userId,
        com.liferay.portal.service.ServiceContext serviceContext)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _candidateHistoryLocalService.create(c_id, v_id, interviewId,
            performer_id, note, performedDate, interviewers, action, userId,
            serviceContext);
    }

    @Override
    public vn.com.ecopharma.hrm.model.CandidateHistory edit(
        long candidateHistoryId, long c_id, long v_id, long interviewId,
        long performer_id, java.lang.String note, java.sql.Date performedDate,
        java.lang.String interviewers, java.lang.String action, long userId,
        com.liferay.portal.service.ServiceContext serviceContext)
        throws com.liferay.portal.kernel.exception.SystemException,
            vn.com.ecopharma.hrm.NoSuchCandidateHistoryException {
        return _candidateHistoryLocalService.edit(candidateHistoryId, c_id,
            v_id, interviewId, performer_id, note, performedDate, interviewers,
            action, userId, serviceContext);
    }

    @Override
    public java.util.List<vn.com.ecopharma.hrm.model.CandidateHistory> findByCandidate(
        long c_id) throws com.liferay.portal.kernel.exception.SystemException {
        return _candidateHistoryLocalService.findByCandidate(c_id);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public CandidateHistoryLocalService getWrappedCandidateHistoryLocalService() {
        return _candidateHistoryLocalService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedCandidateHistoryLocalService(
        CandidateHistoryLocalService candidateHistoryLocalService) {
        _candidateHistoryLocalService = candidateHistoryLocalService;
    }

    @Override
    public CandidateHistoryLocalService getWrappedService() {
        return _candidateHistoryLocalService;
    }

    @Override
    public void setWrappedService(
        CandidateHistoryLocalService candidateHistoryLocalService) {
        _candidateHistoryLocalService = candidateHistoryLocalService;
    }
}
