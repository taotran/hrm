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
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().findAll(start, end);
    }

    public static java.util.List<vn.com.ecopharma.hrm.model.Candidate> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().findAll(start, end, orderByComparator);
    }

    public static java.util.List<vn.com.ecopharma.hrm.model.Candidate> searchCandidates(
        long id, java.lang.String first_name, java.lang.String middle_name,
        java.lang.String last_name, java.lang.String email, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService()
                   .searchCandidates(id, first_name, middle_name, last_name,
            email, start, end);
    }

    public static java.util.List<vn.com.ecopharma.hrm.model.Candidate> searchCandidates(
        long id, java.lang.String first_name, java.lang.String middle_name,
        java.lang.String last_name, java.lang.String email, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator order)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService()
                   .searchCandidates(id, first_name, middle_name, last_name,
            email, start, end, order);
    }

    public static vn.com.ecopharma.hrm.model.Candidate create(long user_id,
        java.lang.String first_name, java.lang.String middle_name,
        java.lang.String last_name, java.lang.String email,
        java.lang.String contact_number, java.lang.String comment,
        int mode_of_application, java.sql.Date date_of_application,
        long cv_file_id, java.lang.String cv_text_version, int added_person,
        java.lang.Long v_id,
        com.liferay.portal.service.ServiceContext serviceContext)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService()
                   .create(user_id, first_name, middle_name, last_name, email,
            contact_number, comment, mode_of_application, date_of_application,
            cv_file_id, cv_text_version, added_person, v_id, serviceContext);
    }

    public static vn.com.ecopharma.hrm.model.Candidate edit(long user_id,
        long candidateId, java.lang.String first_name,
        java.lang.String middle_name, java.lang.String last_name,
        java.lang.String email, java.lang.String contact_number,
        java.lang.String comment, int mode_of_application,
        java.sql.Date date_of_application, long cv_file_id,
        boolean isDeleteOrNotAddResume, java.lang.String cv_text_version,
        int added_person, java.lang.Long v_id,
        com.liferay.portal.service.ServiceContext serviceContext)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService()
                   .edit(user_id, candidateId, first_name, middle_name,
            last_name, email, contact_number, comment, mode_of_application,
            date_of_application, cv_file_id, isDeleteOrNotAddResume,
            cv_text_version, added_person, v_id, serviceContext);
    }

    public static vn.com.ecopharma.hrm.model.Candidate changeCandidateStatus(
        long candidateId, long vacancyId, long userId,
        vn.com.ecopharma.hrm.constant.CandidateStatus status,
        com.liferay.portal.service.ServiceContext serviceContext)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService()
                   .changeCandidateStatus(candidateId, vacancyId, userId,
            status, serviceContext);
    }

    public static void delele(long c_id)
        throws com.liferay.portal.kernel.exception.SystemException,
            vn.com.ecopharma.hrm.NoSuchCandidateException,
            vn.com.ecopharma.hrm.NoSuchInterviewScheduleException,
            vn.com.ecopharma.hrm.NoSuchVacancyCandidateException {
        getService().delele(c_id);
    }

    public static java.util.List<vn.com.ecopharma.hrm.model.Candidate> findCandidates(
        java.lang.String first_name, java.lang.String middle_name,
        java.lang.String last_name, java.lang.String email)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService()
                   .findCandidates(first_name, middle_name, last_name, email);
    }

    public static java.util.List<vn.com.ecopharma.hrm.model.Candidate> findCandidates(
        java.lang.String first_name, java.lang.String middle_name,
        java.lang.String last_name, java.lang.String email, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService()
                   .findCandidates(first_name, middle_name, last_name, email,
            start, end);
    }

    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().countAll();
    }

    public static java.util.List<vn.com.ecopharma.hrm.model.Candidate> filterCandidates(
        java.lang.String globStr, java.lang.String name,
        java.lang.String email, java.lang.String contact_number,
        java.lang.String candidate_status, java.lang.String vacancy_name,
        java.lang.String date_from, java.lang.String date_to,
        java.lang.String sortColumnName, java.lang.String sortDirection,
        int start, int end) {
        return getService()
                   .filterCandidates(globStr, name, email, contact_number,
            candidate_status, vacancy_name, date_from, date_to, sortColumnName,
            sortDirection, start, end);
    }

    public static int getFilterCandidatesSize(java.lang.String globStr,
        java.lang.String name, java.lang.String email,
        java.lang.String contact_number, java.lang.String candidate_status,
        java.lang.String vacancy_name, java.lang.String date_from,
        java.lang.String date_to, java.lang.String sortColName,
        java.lang.String sortDirection) {
        return getService()
                   .getFilterCandidatesSize(globStr, name, email,
            contact_number, candidate_status, vacancy_name, date_from, date_to,
            sortColName, sortDirection);
    }

    public static java.util.List<vn.com.ecopharma.hrm.model.Candidate> dynamicQueryTest(
        java.lang.String s, int start, int end) {
        return getService().dynamicQueryTest(s, start, end);
    }

    public static java.util.List<vn.com.ecopharma.hrm.model.Candidate> filterCandidateForExport(
        com.google.gson.JsonArray conditions) {
        return getService().filterCandidateForExport(conditions);
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
