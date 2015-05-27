package vn.com.ecopharma.hrm.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import vn.com.ecopharma.hrm.model.VacancyCandidate;

import java.util.List;

/**
 * The persistence utility for the vacancy candidate service. This utility wraps {@link VacancyCandidatePersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author tvt
 * @see VacancyCandidatePersistence
 * @see VacancyCandidatePersistenceImpl
 * @generated
 */
public class VacancyCandidateUtil {
    private static VacancyCandidatePersistence _persistence;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
     */
    public static void clearCache() {
        getPersistence().clearCache();
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
     */
    public static void clearCache(VacancyCandidate vacancyCandidate) {
        getPersistence().clearCache(vacancyCandidate);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
     */
    public static long countWithDynamicQuery(DynamicQuery dynamicQuery)
        throws SystemException {
        return getPersistence().countWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
     */
    public static List<VacancyCandidate> findWithDynamicQuery(
        DynamicQuery dynamicQuery) throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<VacancyCandidate> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<VacancyCandidate> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
     */
    public static VacancyCandidate update(VacancyCandidate vacancyCandidate)
        throws SystemException {
        return getPersistence().update(vacancyCandidate);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
     */
    public static VacancyCandidate update(VacancyCandidate vacancyCandidate,
        ServiceContext serviceContext) throws SystemException {
        return getPersistence().update(vacancyCandidate, serviceContext);
    }

    /**
    * Returns all the vacancy candidates where c_id = &#63;.
    *
    * @param c_id the c_id
    * @return the matching vacancy candidates
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<vn.com.ecopharma.hrm.model.VacancyCandidate> findByC_Id(
        long c_id) throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByC_Id(c_id);
    }

    /**
    * Returns a range of all the vacancy candidates where c_id = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.com.ecopharma.hrm.model.impl.VacancyCandidateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param c_id the c_id
    * @param start the lower bound of the range of vacancy candidates
    * @param end the upper bound of the range of vacancy candidates (not inclusive)
    * @return the range of matching vacancy candidates
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<vn.com.ecopharma.hrm.model.VacancyCandidate> findByC_Id(
        long c_id, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByC_Id(c_id, start, end);
    }

    /**
    * Returns an ordered range of all the vacancy candidates where c_id = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.com.ecopharma.hrm.model.impl.VacancyCandidateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param c_id the c_id
    * @param start the lower bound of the range of vacancy candidates
    * @param end the upper bound of the range of vacancy candidates (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching vacancy candidates
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<vn.com.ecopharma.hrm.model.VacancyCandidate> findByC_Id(
        long c_id, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByC_Id(c_id, start, end, orderByComparator);
    }

    /**
    * Returns the first vacancy candidate in the ordered set where c_id = &#63;.
    *
    * @param c_id the c_id
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching vacancy candidate
    * @throws vn.com.ecopharma.hrm.NoSuchVacancyCandidateException if a matching vacancy candidate could not be found
    * @throws SystemException if a system exception occurred
    */
    public static vn.com.ecopharma.hrm.model.VacancyCandidate findByC_Id_First(
        long c_id,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            vn.com.ecopharma.hrm.NoSuchVacancyCandidateException {
        return getPersistence().findByC_Id_First(c_id, orderByComparator);
    }

    /**
    * Returns the first vacancy candidate in the ordered set where c_id = &#63;.
    *
    * @param c_id the c_id
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching vacancy candidate, or <code>null</code> if a matching vacancy candidate could not be found
    * @throws SystemException if a system exception occurred
    */
    public static vn.com.ecopharma.hrm.model.VacancyCandidate fetchByC_Id_First(
        long c_id,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByC_Id_First(c_id, orderByComparator);
    }

    /**
    * Returns the last vacancy candidate in the ordered set where c_id = &#63;.
    *
    * @param c_id the c_id
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching vacancy candidate
    * @throws vn.com.ecopharma.hrm.NoSuchVacancyCandidateException if a matching vacancy candidate could not be found
    * @throws SystemException if a system exception occurred
    */
    public static vn.com.ecopharma.hrm.model.VacancyCandidate findByC_Id_Last(
        long c_id,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            vn.com.ecopharma.hrm.NoSuchVacancyCandidateException {
        return getPersistence().findByC_Id_Last(c_id, orderByComparator);
    }

    /**
    * Returns the last vacancy candidate in the ordered set where c_id = &#63;.
    *
    * @param c_id the c_id
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching vacancy candidate, or <code>null</code> if a matching vacancy candidate could not be found
    * @throws SystemException if a system exception occurred
    */
    public static vn.com.ecopharma.hrm.model.VacancyCandidate fetchByC_Id_Last(
        long c_id,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByC_Id_Last(c_id, orderByComparator);
    }

    /**
    * Returns the vacancy candidates before and after the current vacancy candidate in the ordered set where c_id = &#63;.
    *
    * @param vacancyCandidateId the primary key of the current vacancy candidate
    * @param c_id the c_id
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next vacancy candidate
    * @throws vn.com.ecopharma.hrm.NoSuchVacancyCandidateException if a vacancy candidate with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static vn.com.ecopharma.hrm.model.VacancyCandidate[] findByC_Id_PrevAndNext(
        long vacancyCandidateId, long c_id,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            vn.com.ecopharma.hrm.NoSuchVacancyCandidateException {
        return getPersistence()
                   .findByC_Id_PrevAndNext(vacancyCandidateId, c_id,
            orderByComparator);
    }

    /**
    * Removes all the vacancy candidates where c_id = &#63; from the database.
    *
    * @param c_id the c_id
    * @throws SystemException if a system exception occurred
    */
    public static void removeByC_Id(long c_id)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByC_Id(c_id);
    }

    /**
    * Returns the number of vacancy candidates where c_id = &#63;.
    *
    * @param c_id the c_id
    * @return the number of matching vacancy candidates
    * @throws SystemException if a system exception occurred
    */
    public static int countByC_Id(long c_id)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByC_Id(c_id);
    }

    /**
    * Returns all the vacancy candidates where v_id = &#63;.
    *
    * @param v_id the v_id
    * @return the matching vacancy candidates
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<vn.com.ecopharma.hrm.model.VacancyCandidate> findByV_Id(
        long v_id) throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByV_Id(v_id);
    }

    /**
    * Returns a range of all the vacancy candidates where v_id = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.com.ecopharma.hrm.model.impl.VacancyCandidateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param v_id the v_id
    * @param start the lower bound of the range of vacancy candidates
    * @param end the upper bound of the range of vacancy candidates (not inclusive)
    * @return the range of matching vacancy candidates
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<vn.com.ecopharma.hrm.model.VacancyCandidate> findByV_Id(
        long v_id, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByV_Id(v_id, start, end);
    }

    /**
    * Returns an ordered range of all the vacancy candidates where v_id = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.com.ecopharma.hrm.model.impl.VacancyCandidateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param v_id the v_id
    * @param start the lower bound of the range of vacancy candidates
    * @param end the upper bound of the range of vacancy candidates (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching vacancy candidates
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<vn.com.ecopharma.hrm.model.VacancyCandidate> findByV_Id(
        long v_id, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByV_Id(v_id, start, end, orderByComparator);
    }

    /**
    * Returns the first vacancy candidate in the ordered set where v_id = &#63;.
    *
    * @param v_id the v_id
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching vacancy candidate
    * @throws vn.com.ecopharma.hrm.NoSuchVacancyCandidateException if a matching vacancy candidate could not be found
    * @throws SystemException if a system exception occurred
    */
    public static vn.com.ecopharma.hrm.model.VacancyCandidate findByV_Id_First(
        long v_id,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            vn.com.ecopharma.hrm.NoSuchVacancyCandidateException {
        return getPersistence().findByV_Id_First(v_id, orderByComparator);
    }

    /**
    * Returns the first vacancy candidate in the ordered set where v_id = &#63;.
    *
    * @param v_id the v_id
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching vacancy candidate, or <code>null</code> if a matching vacancy candidate could not be found
    * @throws SystemException if a system exception occurred
    */
    public static vn.com.ecopharma.hrm.model.VacancyCandidate fetchByV_Id_First(
        long v_id,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByV_Id_First(v_id, orderByComparator);
    }

    /**
    * Returns the last vacancy candidate in the ordered set where v_id = &#63;.
    *
    * @param v_id the v_id
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching vacancy candidate
    * @throws vn.com.ecopharma.hrm.NoSuchVacancyCandidateException if a matching vacancy candidate could not be found
    * @throws SystemException if a system exception occurred
    */
    public static vn.com.ecopharma.hrm.model.VacancyCandidate findByV_Id_Last(
        long v_id,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            vn.com.ecopharma.hrm.NoSuchVacancyCandidateException {
        return getPersistence().findByV_Id_Last(v_id, orderByComparator);
    }

    /**
    * Returns the last vacancy candidate in the ordered set where v_id = &#63;.
    *
    * @param v_id the v_id
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching vacancy candidate, or <code>null</code> if a matching vacancy candidate could not be found
    * @throws SystemException if a system exception occurred
    */
    public static vn.com.ecopharma.hrm.model.VacancyCandidate fetchByV_Id_Last(
        long v_id,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByV_Id_Last(v_id, orderByComparator);
    }

    /**
    * Returns the vacancy candidates before and after the current vacancy candidate in the ordered set where v_id = &#63;.
    *
    * @param vacancyCandidateId the primary key of the current vacancy candidate
    * @param v_id the v_id
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next vacancy candidate
    * @throws vn.com.ecopharma.hrm.NoSuchVacancyCandidateException if a vacancy candidate with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static vn.com.ecopharma.hrm.model.VacancyCandidate[] findByV_Id_PrevAndNext(
        long vacancyCandidateId, long v_id,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            vn.com.ecopharma.hrm.NoSuchVacancyCandidateException {
        return getPersistence()
                   .findByV_Id_PrevAndNext(vacancyCandidateId, v_id,
            orderByComparator);
    }

    /**
    * Removes all the vacancy candidates where v_id = &#63; from the database.
    *
    * @param v_id the v_id
    * @throws SystemException if a system exception occurred
    */
    public static void removeByV_Id(long v_id)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByV_Id(v_id);
    }

    /**
    * Returns the number of vacancy candidates where v_id = &#63;.
    *
    * @param v_id the v_id
    * @return the number of matching vacancy candidates
    * @throws SystemException if a system exception occurred
    */
    public static int countByV_Id(long v_id)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByV_Id(v_id);
    }

    /**
    * Caches the vacancy candidate in the entity cache if it is enabled.
    *
    * @param vacancyCandidate the vacancy candidate
    */
    public static void cacheResult(
        vn.com.ecopharma.hrm.model.VacancyCandidate vacancyCandidate) {
        getPersistence().cacheResult(vacancyCandidate);
    }

    /**
    * Caches the vacancy candidates in the entity cache if it is enabled.
    *
    * @param vacancyCandidates the vacancy candidates
    */
    public static void cacheResult(
        java.util.List<vn.com.ecopharma.hrm.model.VacancyCandidate> vacancyCandidates) {
        getPersistence().cacheResult(vacancyCandidates);
    }

    /**
    * Creates a new vacancy candidate with the primary key. Does not add the vacancy candidate to the database.
    *
    * @param vacancyCandidateId the primary key for the new vacancy candidate
    * @return the new vacancy candidate
    */
    public static vn.com.ecopharma.hrm.model.VacancyCandidate create(
        long vacancyCandidateId) {
        return getPersistence().create(vacancyCandidateId);
    }

    /**
    * Removes the vacancy candidate with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param vacancyCandidateId the primary key of the vacancy candidate
    * @return the vacancy candidate that was removed
    * @throws vn.com.ecopharma.hrm.NoSuchVacancyCandidateException if a vacancy candidate with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static vn.com.ecopharma.hrm.model.VacancyCandidate remove(
        long vacancyCandidateId)
        throws com.liferay.portal.kernel.exception.SystemException,
            vn.com.ecopharma.hrm.NoSuchVacancyCandidateException {
        return getPersistence().remove(vacancyCandidateId);
    }

    public static vn.com.ecopharma.hrm.model.VacancyCandidate updateImpl(
        vn.com.ecopharma.hrm.model.VacancyCandidate vacancyCandidate)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(vacancyCandidate);
    }

    /**
    * Returns the vacancy candidate with the primary key or throws a {@link vn.com.ecopharma.hrm.NoSuchVacancyCandidateException} if it could not be found.
    *
    * @param vacancyCandidateId the primary key of the vacancy candidate
    * @return the vacancy candidate
    * @throws vn.com.ecopharma.hrm.NoSuchVacancyCandidateException if a vacancy candidate with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static vn.com.ecopharma.hrm.model.VacancyCandidate findByPrimaryKey(
        long vacancyCandidateId)
        throws com.liferay.portal.kernel.exception.SystemException,
            vn.com.ecopharma.hrm.NoSuchVacancyCandidateException {
        return getPersistence().findByPrimaryKey(vacancyCandidateId);
    }

    /**
    * Returns the vacancy candidate with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param vacancyCandidateId the primary key of the vacancy candidate
    * @return the vacancy candidate, or <code>null</code> if a vacancy candidate with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static vn.com.ecopharma.hrm.model.VacancyCandidate fetchByPrimaryKey(
        long vacancyCandidateId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(vacancyCandidateId);
    }

    /**
    * Returns all the vacancy candidates.
    *
    * @return the vacancy candidates
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<vn.com.ecopharma.hrm.model.VacancyCandidate> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
    }

    /**
    * Returns a range of all the vacancy candidates.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.com.ecopharma.hrm.model.impl.VacancyCandidateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of vacancy candidates
    * @param end the upper bound of the range of vacancy candidates (not inclusive)
    * @return the range of vacancy candidates
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<vn.com.ecopharma.hrm.model.VacancyCandidate> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
    }

    /**
    * Returns an ordered range of all the vacancy candidates.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.com.ecopharma.hrm.model.impl.VacancyCandidateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of vacancy candidates
    * @param end the upper bound of the range of vacancy candidates (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of vacancy candidates
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<vn.com.ecopharma.hrm.model.VacancyCandidate> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the vacancy candidates from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of vacancy candidates.
    *
    * @return the number of vacancy candidates
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    public static VacancyCandidatePersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (VacancyCandidatePersistence) PortletBeanLocatorUtil.locate(vn.com.ecopharma.hrm.service.ClpSerializer.getServletContextName(),
                    VacancyCandidatePersistence.class.getName());

            ReferenceRegistry.registerReference(VacancyCandidateUtil.class,
                "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setPersistence(VacancyCandidatePersistence persistence) {
    }
}
