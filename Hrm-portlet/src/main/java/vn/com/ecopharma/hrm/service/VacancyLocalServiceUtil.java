package vn.com.ecopharma.hrm.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * Provides the local service utility for Vacancy. This utility wraps
 * {@link vn.com.ecopharma.hrm.service.impl.VacancyLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author tvt
 * @see VacancyLocalService
 * @see vn.com.ecopharma.hrm.service.base.VacancyLocalServiceBaseImpl
 * @see vn.com.ecopharma.hrm.service.impl.VacancyLocalServiceImpl
 * @generated
 */
public class VacancyLocalServiceUtil {
    private static VacancyLocalService _service;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Add custom service methods to {@link vn.com.ecopharma.hrm.service.impl.VacancyLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
     */

    /**
    * Adds the vacancy to the database. Also notifies the appropriate model listeners.
    *
    * @param vacancy the vacancy
    * @return the vacancy that was added
    * @throws SystemException if a system exception occurred
    */
    public static vn.com.ecopharma.hrm.model.Vacancy addVacancy(
        vn.com.ecopharma.hrm.model.Vacancy vacancy)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().addVacancy(vacancy);
    }

    /**
    * Creates a new vacancy with the primary key. Does not add the vacancy to the database.
    *
    * @param v_id the primary key for the new vacancy
    * @return the new vacancy
    */
    public static vn.com.ecopharma.hrm.model.Vacancy createVacancy(long v_id) {
        return getService().createVacancy(v_id);
    }

    /**
    * Deletes the vacancy with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param v_id the primary key of the vacancy
    * @return the vacancy that was removed
    * @throws PortalException if a vacancy with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static vn.com.ecopharma.hrm.model.Vacancy deleteVacancy(long v_id)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().deleteVacancy(v_id);
    }

    /**
    * Deletes the vacancy from the database. Also notifies the appropriate model listeners.
    *
    * @param vacancy the vacancy
    * @return the vacancy that was removed
    * @throws SystemException if a system exception occurred
    */
    public static vn.com.ecopharma.hrm.model.Vacancy deleteVacancy(
        vn.com.ecopharma.hrm.model.Vacancy vacancy)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().deleteVacancy(vacancy);
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
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.com.ecopharma.hrm.model.impl.VacancyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.com.ecopharma.hrm.model.impl.VacancyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

    public static vn.com.ecopharma.hrm.model.Vacancy fetchVacancy(long v_id)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().fetchVacancy(v_id);
    }

    /**
    * Returns the vacancy with the primary key.
    *
    * @param v_id the primary key of the vacancy
    * @return the vacancy
    * @throws PortalException if a vacancy with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static vn.com.ecopharma.hrm.model.Vacancy getVacancy(long v_id)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getVacancy(v_id);
    }

    public static com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns a range of all the vacancies.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.com.ecopharma.hrm.model.impl.VacancyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of vacancies
    * @param end the upper bound of the range of vacancies (not inclusive)
    * @return the range of vacancies
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<vn.com.ecopharma.hrm.model.Vacancy> getVacancies(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getVacancies(start, end);
    }

    /**
    * Returns the number of vacancies.
    *
    * @return the number of vacancies
    * @throws SystemException if a system exception occurred
    */
    public static int getVacanciesCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getVacanciesCount();
    }

    /**
    * Updates the vacancy in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param vacancy the vacancy
    * @return the vacancy that was updated
    * @throws SystemException if a system exception occurred
    */
    public static vn.com.ecopharma.hrm.model.Vacancy updateVacancy(
        vn.com.ecopharma.hrm.model.Vacancy vacancy)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().updateVacancy(vacancy);
    }

    /**
    * @throws SystemException if a system exception occurred
    */
    public static void addCandidateVacancy(long c_id, long v_id)
        throws com.liferay.portal.kernel.exception.SystemException {
        getService().addCandidateVacancy(c_id, v_id);
    }

    /**
    * @throws SystemException if a system exception occurred
    */
    public static void addCandidateVacancy(long c_id,
        vn.com.ecopharma.hrm.model.Vacancy vacancy)
        throws com.liferay.portal.kernel.exception.SystemException {
        getService().addCandidateVacancy(c_id, vacancy);
    }

    /**
    * @throws SystemException if a system exception occurred
    */
    public static void addCandidateVacancies(long c_id, long[] v_ids)
        throws com.liferay.portal.kernel.exception.SystemException {
        getService().addCandidateVacancies(c_id, v_ids);
    }

    /**
    * @throws SystemException if a system exception occurred
    */
    public static void addCandidateVacancies(long c_id,
        java.util.List<vn.com.ecopharma.hrm.model.Vacancy> Vacancies)
        throws com.liferay.portal.kernel.exception.SystemException {
        getService().addCandidateVacancies(c_id, Vacancies);
    }

    /**
    * @throws SystemException if a system exception occurred
    */
    public static void clearCandidateVacancies(long c_id)
        throws com.liferay.portal.kernel.exception.SystemException {
        getService().clearCandidateVacancies(c_id);
    }

    /**
    * @throws SystemException if a system exception occurred
    */
    public static void deleteCandidateVacancy(long c_id, long v_id)
        throws com.liferay.portal.kernel.exception.SystemException {
        getService().deleteCandidateVacancy(c_id, v_id);
    }

    /**
    * @throws SystemException if a system exception occurred
    */
    public static void deleteCandidateVacancy(long c_id,
        vn.com.ecopharma.hrm.model.Vacancy vacancy)
        throws com.liferay.portal.kernel.exception.SystemException {
        getService().deleteCandidateVacancy(c_id, vacancy);
    }

    /**
    * @throws SystemException if a system exception occurred
    */
    public static void deleteCandidateVacancies(long c_id, long[] v_ids)
        throws com.liferay.portal.kernel.exception.SystemException {
        getService().deleteCandidateVacancies(c_id, v_ids);
    }

    /**
    * @throws SystemException if a system exception occurred
    */
    public static void deleteCandidateVacancies(long c_id,
        java.util.List<vn.com.ecopharma.hrm.model.Vacancy> Vacancies)
        throws com.liferay.portal.kernel.exception.SystemException {
        getService().deleteCandidateVacancies(c_id, Vacancies);
    }

    /**
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<vn.com.ecopharma.hrm.model.Vacancy> getCandidateVacancies(
        long c_id) throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getCandidateVacancies(c_id);
    }

    /**
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<vn.com.ecopharma.hrm.model.Vacancy> getCandidateVacancies(
        long c_id, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getCandidateVacancies(c_id, start, end);
    }

    /**
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<vn.com.ecopharma.hrm.model.Vacancy> getCandidateVacancies(
        long c_id, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService()
                   .getCandidateVacancies(c_id, start, end, orderByComparator);
    }

    /**
    * @throws SystemException if a system exception occurred
    */
    public static int getCandidateVacanciesCount(long c_id)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getCandidateVacanciesCount(c_id);
    }

    /**
    * @throws SystemException if a system exception occurred
    */
    public static boolean hasCandidateVacancy(long c_id, long v_id)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().hasCandidateVacancy(c_id, v_id);
    }

    /**
    * @throws SystemException if a system exception occurred
    */
    public static boolean hasCandidateVacancies(long c_id)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().hasCandidateVacancies(c_id);
    }

    /**
    * @throws SystemException if a system exception occurred
    */
    public static void setCandidateVacancies(long c_id, long[] v_ids)
        throws com.liferay.portal.kernel.exception.SystemException {
        getService().setCandidateVacancies(c_id, v_ids);
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

    public static java.util.List<vn.com.ecopharma.hrm.model.Vacancy> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().findAll();
    }

    public static vn.com.ecopharma.hrm.model.Vacancy createVacancy(
        long jTitle_id, long hiring_mananager_id, java.lang.String name,
        java.lang.String description, int no_of_positions,
        boolean published_in_feed,
        java.util.List<vn.com.ecopharma.hrm.model.Candidate> candidates)
        throws vn.com.ecopharma.hrm.NoSuchVacancyException {
        return getService()
                   .createVacancy(jTitle_id, hiring_mananager_id, name,
            description, no_of_positions, published_in_feed, candidates);
    }

    public static vn.com.ecopharma.hrm.model.Vacancy editVacancy(long id,
        long jtitle_id, long hiring_manager_id, java.lang.String name,
        java.lang.String description, int number_of_positions,
        boolean published_in_feed, java.util.Date update_date) {
        return getService()
                   .editVacancy(id, jtitle_id, hiring_manager_id, name,
            description, number_of_positions, published_in_feed, update_date);
    }

    public static void clearService() {
        _service = null;
    }

    public static VacancyLocalService getService() {
        if (_service == null) {
            InvokableLocalService invokableLocalService = (InvokableLocalService) PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
                    VacancyLocalService.class.getName());

            if (invokableLocalService instanceof VacancyLocalService) {
                _service = (VacancyLocalService) invokableLocalService;
            } else {
                _service = new VacancyLocalServiceClp(invokableLocalService);
            }

            ReferenceRegistry.registerReference(VacancyLocalServiceUtil.class,
                "_service");
        }

        return _service;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setService(VacancyLocalService service) {
    }
}
