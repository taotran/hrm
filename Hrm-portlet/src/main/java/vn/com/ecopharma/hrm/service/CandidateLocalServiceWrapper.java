package vn.com.ecopharma.hrm.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link CandidateLocalService}.
 *
 * @author tvt
 * @see CandidateLocalService
 * @generated
 */
public class CandidateLocalServiceWrapper implements CandidateLocalService,
    ServiceWrapper<CandidateLocalService> {
    private CandidateLocalService _candidateLocalService;

    public CandidateLocalServiceWrapper(
        CandidateLocalService candidateLocalService) {
        _candidateLocalService = candidateLocalService;
    }

    /**
    * Adds the candidate to the database. Also notifies the appropriate model listeners.
    *
    * @param candidate the candidate
    * @return the candidate that was added
    * @throws SystemException if a system exception occurred
    */
    @Override
    public vn.com.ecopharma.hrm.model.Candidate addCandidate(
        vn.com.ecopharma.hrm.model.Candidate candidate)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _candidateLocalService.addCandidate(candidate);
    }

    /**
    * Creates a new candidate with the primary key. Does not add the candidate to the database.
    *
    * @param c_id the primary key for the new candidate
    * @return the new candidate
    */
    @Override
    public vn.com.ecopharma.hrm.model.Candidate createCandidate(long c_id) {
        return _candidateLocalService.createCandidate(c_id);
    }

    /**
    * Deletes the candidate with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param c_id the primary key of the candidate
    * @return the candidate that was removed
    * @throws PortalException if a candidate with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public vn.com.ecopharma.hrm.model.Candidate deleteCandidate(long c_id)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _candidateLocalService.deleteCandidate(c_id);
    }

    /**
    * Deletes the candidate from the database. Also notifies the appropriate model listeners.
    *
    * @param candidate the candidate
    * @return the candidate that was removed
    * @throws SystemException if a system exception occurred
    */
    @Override
    public vn.com.ecopharma.hrm.model.Candidate deleteCandidate(
        vn.com.ecopharma.hrm.model.Candidate candidate)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _candidateLocalService.deleteCandidate(candidate);
    }

    @Override
    public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return _candidateLocalService.dynamicQuery();
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
        return _candidateLocalService.dynamicQuery(dynamicQuery);
    }

    /**
    * Performs a dynamic query on the database and returns a range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.com.ecopharma.hrm.model.impl.CandidateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _candidateLocalService.dynamicQuery(dynamicQuery, start, end);
    }

    /**
    * Performs a dynamic query on the database and returns an ordered range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.com.ecopharma.hrm.model.impl.CandidateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _candidateLocalService.dynamicQuery(dynamicQuery, start, end,
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
        return _candidateLocalService.dynamicQueryCount(dynamicQuery);
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
        return _candidateLocalService.dynamicQueryCount(dynamicQuery, projection);
    }

    @Override
    public vn.com.ecopharma.hrm.model.Candidate fetchCandidate(long c_id)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _candidateLocalService.fetchCandidate(c_id);
    }

    /**
    * Returns the candidate with the primary key.
    *
    * @param c_id the primary key of the candidate
    * @return the candidate
    * @throws PortalException if a candidate with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public vn.com.ecopharma.hrm.model.Candidate getCandidate(long c_id)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _candidateLocalService.getCandidate(c_id);
    }

    @Override
    public com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _candidateLocalService.getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns a range of all the candidates.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.com.ecopharma.hrm.model.impl.CandidateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of candidates
    * @param end the upper bound of the range of candidates (not inclusive)
    * @return the range of candidates
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.util.List<vn.com.ecopharma.hrm.model.Candidate> getCandidates(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _candidateLocalService.getCandidates(start, end);
    }

    /**
    * Returns the number of candidates.
    *
    * @return the number of candidates
    * @throws SystemException if a system exception occurred
    */
    @Override
    public int getCandidatesCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _candidateLocalService.getCandidatesCount();
    }

    /**
    * Updates the candidate in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param candidate the candidate
    * @return the candidate that was updated
    * @throws SystemException if a system exception occurred
    */
    @Override
    public vn.com.ecopharma.hrm.model.Candidate updateCandidate(
        vn.com.ecopharma.hrm.model.Candidate candidate)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _candidateLocalService.updateCandidate(candidate);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _candidateLocalService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _candidateLocalService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _candidateLocalService.invokeMethod(name, parameterTypes,
            arguments);
    }

    @Override
    public java.util.List<vn.com.ecopharma.hrm.model.Candidate> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _candidateLocalService.findAll();
    }

    @Override
    public java.util.List<vn.com.ecopharma.hrm.model.Candidate> findAll(
        int start, int end) {
        return _candidateLocalService.findAll(start, end);
    }

    @Override
    public java.util.List<vn.com.ecopharma.hrm.model.Candidate> findCandidates(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _candidateLocalService.findCandidates(start, end);
    }

    @Override
    public java.util.List<vn.com.ecopharma.hrm.model.Candidate> searchCandidates(
        long id, java.lang.String first_name, java.lang.String middle_name,
        java.lang.String last_name, java.lang.String email, int start, int end) {
        return _candidateLocalService.searchCandidates(id, first_name,
            middle_name, last_name, email, start, end);
    }

    @Override
    public java.util.List<vn.com.ecopharma.hrm.model.Candidate> searchCandidates(
        long id, java.lang.String first_name, java.lang.String middle_name,
        java.lang.String last_name, java.lang.String email, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator order) {
        return _candidateLocalService.searchCandidates(id, first_name,
            middle_name, last_name, email, start, end, order);
    }

    @Override
    public vn.com.ecopharma.hrm.model.Candidate create(long user_id,
        java.lang.String first_name, java.lang.String middle_name,
        java.lang.String last_name, java.lang.String email,
        java.lang.String contact_number, java.lang.String comment,
        int mode_of_application, java.sql.Date date_of_application,
        long cv_file_id, java.lang.String cv_text_version, int added_person,
        java.lang.Long v_id,
        com.liferay.portal.service.ServiceContext serviceContext)
        throws vn.com.ecopharma.hrm.NoSuchVacancyException {
        return _candidateLocalService.create(user_id, first_name, middle_name,
            last_name, email, contact_number, comment, mode_of_application,
            date_of_application, cv_file_id, cv_text_version, added_person,
            v_id, serviceContext);
    }

    @Override
    public vn.com.ecopharma.hrm.model.Candidate edit(long user_id,
        long candidateId, java.lang.String first_name,
        java.lang.String middle_name, java.lang.String last_name,
        java.lang.String email, java.lang.String contact_number,
        java.lang.String comment, int mode_of_application,
        java.sql.Date date_of_application, long cv_file_id,
        java.lang.String cv_text_version, int added_person,
        java.lang.Long v_id,
        com.liferay.portal.service.ServiceContext serviceContext)
        throws vn.com.ecopharma.hrm.NoSuchVacancyException {
        return _candidateLocalService.edit(user_id, candidateId, first_name,
            middle_name, last_name, email, contact_number, comment,
            mode_of_application, date_of_application, cv_file_id,
            cv_text_version, added_person, v_id, serviceContext);
    }

    @Override
    public void delele(long c_id) {
        _candidateLocalService.delele(c_id);
    }

    @Override
    public java.util.List<vn.com.ecopharma.hrm.model.Candidate> findCandidates(
        java.lang.String first_name, java.lang.String middle_name,
        java.lang.String last_name, java.lang.String email) {
        return _candidateLocalService.findCandidates(first_name, middle_name,
            last_name, email);
    }

    @Override
    public java.util.List<vn.com.ecopharma.hrm.model.Candidate> findCandidates(
        java.lang.String first_name, java.lang.String middle_name,
        java.lang.String last_name, java.lang.String email, int start, int end) {
        return _candidateLocalService.findCandidates(first_name, middle_name,
            last_name, email, start, end);
    }

    @Override
    public int countAll() {
        return _candidateLocalService.countAll();
    }

    @Override
    public java.util.List<vn.com.ecopharma.hrm.model.Candidate> filterCandidates(
        java.lang.String filterString) {
        return _candidateLocalService.filterCandidates(filterString);
    }

    @Override
    public java.util.List<vn.com.ecopharma.hrm.model.Candidate> filterCandidateByGlobalString(
        java.lang.String filterString) {
        return _candidateLocalService.filterCandidateByGlobalString(filterString);
    }

    @Override
    public java.lang.Long findVacancyByCandidate(long c_id) {
        return _candidateLocalService.findVacancyByCandidate(c_id);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public CandidateLocalService getWrappedCandidateLocalService() {
        return _candidateLocalService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedCandidateLocalService(
        CandidateLocalService candidateLocalService) {
        _candidateLocalService = candidateLocalService;
    }

    @Override
    public CandidateLocalService getWrappedService() {
        return _candidateLocalService;
    }

    @Override
    public void setWrappedService(CandidateLocalService candidateLocalService) {
        _candidateLocalService = candidateLocalService;
    }
}
