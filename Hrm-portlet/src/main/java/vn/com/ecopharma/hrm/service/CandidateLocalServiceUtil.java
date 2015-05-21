package vn.com.ecopharma.hrm.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * Provides the local service utility for Candidate. This utility wraps
 * {@link vn.com.ecopharma.hrm.service.impl.CandidateLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author tvt
 * @see CandidateLocalService
 * @see vn.com.ecopharma.hrm.service.base.CandidateLocalServiceBaseImpl
 * @see vn.com.ecopharma.hrm.service.impl.CandidateLocalServiceImpl
 * @generated
 */
public class CandidateLocalServiceUtil {
    private static CandidateLocalService _service;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Add custom service methods to {@link vn.com.ecopharma.hrm.service.impl.CandidateLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
     */

    /**
    * Adds the candidate to the database. Also notifies the appropriate model listeners.
    *
    * @param candidate the candidate
    * @return the candidate that was added
    * @throws SystemException if a system exception occurred
    */
    public static vn.com.ecopharma.hrm.model.Candidate addCandidate(
        vn.com.ecopharma.hrm.model.Candidate candidate)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().addCandidate(candidate);
    }

    /**
    * Creates a new candidate with the primary key. Does not add the candidate to the database.
    *
    * @param c_id the primary key for the new candidate
    * @return the new candidate
    */
    public static vn.com.ecopharma.hrm.model.Candidate createCandidate(
        long c_id) {
        return getService().createCandidate(c_id);
    }

    /**
    * Deletes the candidate with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param c_id the primary key of the candidate
    * @return the candidate that was removed
    * @throws PortalException if a candidate with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static vn.com.ecopharma.hrm.model.Candidate deleteCandidate(
        long c_id)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().deleteCandidate(c_id);
    }

    /**
    * Deletes the candidate from the database. Also notifies the appropriate model listeners.
    *
    * @param candidate the candidate
    * @return the candidate that was removed
    * @throws SystemException if a system exception occurred
    */
    public static vn.com.ecopharma.hrm.model.Candidate deleteCandidate(
        vn.com.ecopharma.hrm.model.Candidate candidate)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().deleteCandidate(candidate);
    }

    public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return getService().dynamicQuery();
    }

    /**
    * Performs a dynamic query on the database and returns the matching rows.
    *
    * @param dynamicQuery the dynamic query
    * @return the matching rows
    * @throws SystemException if a system exception occurred
    */
    @SuppressWarnings("rawtypes")
    public static java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().dynamicQuery(dynamicQuery);
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
    @SuppressWarnings("rawtypes")
    public static java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException {
        return getService().dynamicQuery(dynamicQuery, start, end);
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
    @SuppressWarnings("rawtypes")
    public static java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService()
                   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    public static long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().dynamicQueryCount(dynamicQuery);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @param projection the projection to apply to the query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    public static long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
        com.liferay.portal.kernel.dao.orm.Projection projection)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().dynamicQueryCount(dynamicQuery, projection);
    }

    public static vn.com.ecopharma.hrm.model.Candidate fetchCandidate(long c_id)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().fetchCandidate(c_id);
    }

    /**
    * Returns the candidate with the primary key.
    *
    * @param c_id the primary key of the candidate
    * @return the candidate
    * @throws PortalException if a candidate with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static vn.com.ecopharma.hrm.model.Candidate getCandidate(long c_id)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getCandidate(c_id);
    }

    public static com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getPersistedModel(primaryKeyObj);
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
    public static java.util.List<vn.com.ecopharma.hrm.model.Candidate> getCandidates(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getCandidates(start, end);
    }

    /**
    * Returns the number of candidates.
    *
    * @return the number of candidates
    * @throws SystemException if a system exception occurred
    */
    public static int getCandidatesCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getCandidatesCount();
    }

    /**
    * Updates the candidate in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param candidate the candidate
    * @return the candidate that was updated
    * @throws SystemException if a system exception occurred
    */
    public static vn.com.ecopharma.hrm.model.Candidate updateCandidate(
        vn.com.ecopharma.hrm.model.Candidate candidate)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().updateCandidate(candidate);
    }

    /**
    * @throws SystemException if a system exception occurred
    */
    public static void addVacancyCandidate(long v_id, long c_id)
        throws com.liferay.portal.kernel.exception.SystemException {
        getService().addVacancyCandidate(v_id, c_id);
    }

    /**
    * @throws SystemException if a system exception occurred
    */
    public static void addVacancyCandidate(long v_id,
        vn.com.ecopharma.hrm.model.Candidate candidate)
        throws com.liferay.portal.kernel.exception.SystemException {
        getService().addVacancyCandidate(v_id, candidate);
    }

    /**
    * @throws SystemException if a system exception occurred
    */
    public static void addVacancyCandidates(long v_id, long[] c_ids)
        throws com.liferay.portal.kernel.exception.SystemException {
        getService().addVacancyCandidates(v_id, c_ids);
    }

    /**
    * @throws SystemException if a system exception occurred
    */
    public static void addVacancyCandidates(long v_id,
        java.util.List<vn.com.ecopharma.hrm.model.Candidate> Candidates)
        throws com.liferay.portal.kernel.exception.SystemException {
        getService().addVacancyCandidates(v_id, Candidates);
    }

    /**
    * @throws SystemException if a system exception occurred
    */
    public static void clearVacancyCandidates(long v_id)
        throws com.liferay.portal.kernel.exception.SystemException {
        getService().clearVacancyCandidates(v_id);
    }

    /**
    * @throws SystemException if a system exception occurred
    */
    public static void deleteVacancyCandidate(long v_id, long c_id)
        throws com.liferay.portal.kernel.exception.SystemException {
        getService().deleteVacancyCandidate(v_id, c_id);
    }

    /**
    * @throws SystemException if a system exception occurred
    */
    public static void deleteVacancyCandidate(long v_id,
        vn.com.ecopharma.hrm.model.Candidate candidate)
        throws com.liferay.portal.kernel.exception.SystemException {
        getService().deleteVacancyCandidate(v_id, candidate);
    }

    /**
    * @throws SystemException if a system exception occurred
    */
    public static void deleteVacancyCandidates(long v_id, long[] c_ids)
        throws com.liferay.portal.kernel.exception.SystemException {
        getService().deleteVacancyCandidates(v_id, c_ids);
    }

    /**
    * @throws SystemException if a system exception occurred
    */
    public static void deleteVacancyCandidates(long v_id,
        java.util.List<vn.com.ecopharma.hrm.model.Candidate> Candidates)
        throws com.liferay.portal.kernel.exception.SystemException {
        getService().deleteVacancyCandidates(v_id, Candidates);
    }

    /**
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<vn.com.ecopharma.hrm.model.Candidate> getVacancyCandidates(
        long v_id) throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getVacancyCandidates(v_id);
    }

    /**
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<vn.com.ecopharma.hrm.model.Candidate> getVacancyCandidates(
        long v_id, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getVacancyCandidates(v_id, start, end);
    }

    /**
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<vn.com.ecopharma.hrm.model.Candidate> getVacancyCandidates(
        long v_id, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService()
                   .getVacancyCandidates(v_id, start, end, orderByComparator);
    }

    /**
    * @throws SystemException if a system exception occurred
    */
    public static int getVacancyCandidatesCount(long v_id)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getVacancyCandidatesCount(v_id);
    }

    /**
    * @throws SystemException if a system exception occurred
    */
    public static boolean hasVacancyCandidate(long v_id, long c_id)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().hasVacancyCandidate(v_id, c_id);
    }

    /**
    * @throws SystemException if a system exception occurred
    */
    public static boolean hasVacancyCandidates(long v_id)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().hasVacancyCandidates(v_id);
    }

    /**
    * @throws SystemException if a system exception occurred
    */
    public static void setVacancyCandidates(long v_id, long[] c_ids)
        throws com.liferay.portal.kernel.exception.SystemException {
        getService().setVacancyCandidates(v_id, c_ids);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    public static java.lang.String getBeanIdentifier() {
        return getService().getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    public static void setBeanIdentifier(java.lang.String beanIdentifier) {
        getService().setBeanIdentifier(beanIdentifier);
    }

    public static java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return getService().invokeMethod(name, parameterTypes, arguments);
    }

    public static java.util.List<vn.com.ecopharma.hrm.model.Candidate> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().findAll();
    }

    public static java.util.List<vn.com.ecopharma.hrm.model.Candidate> findAll(
        int start, int end) {
        return getService().findAll(start, end);
    }

    public static java.util.List<vn.com.ecopharma.hrm.model.Candidate> findCandidates(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().findCandidates(start, end);
    }

    public static java.util.List<vn.com.ecopharma.hrm.model.Candidate> searchCandidates(
        long id, java.lang.String first_name, java.lang.String middle_name,
        java.lang.String last_name, java.lang.String email, int start, int end) {
        return getService()
                   .searchCandidates(id, first_name, middle_name, last_name,
            email, start, end);
    }

    public static java.util.List<vn.com.ecopharma.hrm.model.Candidate> searchCandidates(
        long id, java.lang.String first_name, java.lang.String middle_name,
        java.lang.String last_name, java.lang.String email, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator order) {
        return getService()
                   .searchCandidates(id, first_name, middle_name, last_name,
            email, start, end, order);
    }

    public static java.util.List<vn.com.ecopharma.hrm.model.Vacancy> getVacanciesByCandidate(
        long c_id) {
        return getService().getVacanciesByCandidate(c_id);
    }

    public static vn.com.ecopharma.hrm.model.Candidate createCandidate(
        long user_id, java.lang.String first_name,
        java.lang.String middle_name, java.lang.String last_name,
        java.lang.String email, java.lang.String contact_number,
        java.lang.String comment, int mode_of_application,
        java.sql.Date date_of_application, long cv_file_id,
        java.lang.String cv_text_version, int added_person,
        java.util.List<vn.com.ecopharma.hrm.model.Vacancy> vacancies,
        com.liferay.portal.service.ServiceContext serviceContext)
        throws vn.com.ecopharma.hrm.NoSuchVacancyException {
        return getService()
                   .createCandidate(user_id, first_name, middle_name,
            last_name, email, contact_number, comment, mode_of_application,
            date_of_application, cv_file_id, cv_text_version, added_person,
            vacancies, serviceContext);
    }

    public static vn.com.ecopharma.hrm.model.Candidate editCandidate(
        long candidateId, java.lang.String first_name,
        java.lang.String middle_name, java.lang.String last_name,
        java.lang.String email, java.lang.String contact_number,
        java.lang.String comment, int mode_of_application,
        java.sql.Date date_of_application, long cv_file_id,
        java.lang.String cv_text_version, int added_person,
        java.util.List<vn.com.ecopharma.hrm.model.Vacancy> vacancies)
        throws vn.com.ecopharma.hrm.NoSuchVacancyException {
        return getService()
                   .editCandidate(candidateId, first_name, middle_name,
            last_name, email, contact_number, comment, mode_of_application,
            date_of_application, cv_file_id, cv_text_version, added_person,
            vacancies);
    }

    public static void delele(long c_id) {
        getService().delele(c_id);
    }

    public static java.util.List<vn.com.ecopharma.hrm.model.Candidate> findCandidates(
        java.lang.String first_name, java.lang.String middle_name,
        java.lang.String last_name, java.lang.String email) {
        return getService()
                   .findCandidates(first_name, middle_name, last_name, email);
    }

    public static java.util.List<vn.com.ecopharma.hrm.model.Candidate> findCandidates(
        java.lang.String first_name, java.lang.String middle_name,
        java.lang.String last_name, java.lang.String email, int start, int end) {
        return getService()
                   .findCandidates(first_name, middle_name, last_name, email,
            start, end);
    }

    public static int countAll() {
        return getService().countAll();
    }

    public static java.util.List<vn.com.ecopharma.hrm.model.Candidate> filterCandidates(
        java.lang.String filterString) {
        return getService().filterCandidates(filterString);
    }

    public static java.util.List<vn.com.ecopharma.hrm.model.Candidate> filterCandidates(
        java.lang.String filterString, int start, int end) {
        return getService().filterCandidates(filterString, start, end);
    }

    public static java.lang.Long findVacancyByCandidate(long c_id) {
        return getService().findVacancyByCandidate(c_id);
    }

    public static void clearService() {
        _service = null;
    }

    public static CandidateLocalService getService() {
        if (_service == null) {
            InvokableLocalService invokableLocalService = (InvokableLocalService) PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
                    CandidateLocalService.class.getName());

            if (invokableLocalService instanceof CandidateLocalService) {
                _service = (CandidateLocalService) invokableLocalService;
            } else {
                _service = new CandidateLocalServiceClp(invokableLocalService);
            }

            ReferenceRegistry.registerReference(CandidateLocalServiceUtil.class,
                "_service");
        }

        return _service;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setService(CandidateLocalService service) {
    }
}
