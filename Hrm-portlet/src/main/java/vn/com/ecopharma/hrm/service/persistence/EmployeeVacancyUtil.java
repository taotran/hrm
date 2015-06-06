package vn.com.ecopharma.hrm.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import vn.com.ecopharma.hrm.model.EmployeeVacancy;

import java.util.List;

/**
 * The persistence utility for the employee vacancy service. This utility wraps {@link EmployeeVacancyPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author tvt
 * @see EmployeeVacancyPersistence
 * @see EmployeeVacancyPersistenceImpl
 * @generated
 */
public class EmployeeVacancyUtil {
    private static EmployeeVacancyPersistence _persistence;

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
    public static void clearCache(EmployeeVacancy employeeVacancy) {
        getPersistence().clearCache(employeeVacancy);
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
    public static List<EmployeeVacancy> findWithDynamicQuery(
        DynamicQuery dynamicQuery) throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<EmployeeVacancy> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<EmployeeVacancy> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
     */
    public static EmployeeVacancy update(EmployeeVacancy employeeVacancy)
        throws SystemException {
        return getPersistence().update(employeeVacancy);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
     */
    public static EmployeeVacancy update(EmployeeVacancy employeeVacancy,
        ServiceContext serviceContext) throws SystemException {
        return getPersistence().update(employeeVacancy, serviceContext);
    }

    /**
    * Returns the employee vacancy where v_id = &#63; and employeeId = &#63; or throws a {@link vn.com.ecopharma.hrm.NoSuchEmployeeVacancyException} if it could not be found.
    *
    * @param v_id the v_id
    * @param employeeId the employee ID
    * @return the matching employee vacancy
    * @throws vn.com.ecopharma.hrm.NoSuchEmployeeVacancyException if a matching employee vacancy could not be found
    * @throws SystemException if a system exception occurred
    */
    public static vn.com.ecopharma.hrm.model.EmployeeVacancy findByVacancyId_EmployeeId(
        long v_id, long employeeId)
        throws com.liferay.portal.kernel.exception.SystemException,
            vn.com.ecopharma.hrm.NoSuchEmployeeVacancyException {
        return getPersistence().findByVacancyId_EmployeeId(v_id, employeeId);
    }

    /**
    * Returns the employee vacancy where v_id = &#63; and employeeId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
    *
    * @param v_id the v_id
    * @param employeeId the employee ID
    * @return the matching employee vacancy, or <code>null</code> if a matching employee vacancy could not be found
    * @throws SystemException if a system exception occurred
    */
    public static vn.com.ecopharma.hrm.model.EmployeeVacancy fetchByVacancyId_EmployeeId(
        long v_id, long employeeId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByVacancyId_EmployeeId(v_id, employeeId);
    }

    /**
    * Returns the employee vacancy where v_id = &#63; and employeeId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
    *
    * @param v_id the v_id
    * @param employeeId the employee ID
    * @param retrieveFromCache whether to use the finder cache
    * @return the matching employee vacancy, or <code>null</code> if a matching employee vacancy could not be found
    * @throws SystemException if a system exception occurred
    */
    public static vn.com.ecopharma.hrm.model.EmployeeVacancy fetchByVacancyId_EmployeeId(
        long v_id, long employeeId, boolean retrieveFromCache)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByVacancyId_EmployeeId(v_id, employeeId,
            retrieveFromCache);
    }

    /**
    * Removes the employee vacancy where v_id = &#63; and employeeId = &#63; from the database.
    *
    * @param v_id the v_id
    * @param employeeId the employee ID
    * @return the employee vacancy that was removed
    * @throws SystemException if a system exception occurred
    */
    public static vn.com.ecopharma.hrm.model.EmployeeVacancy removeByVacancyId_EmployeeId(
        long v_id, long employeeId)
        throws com.liferay.portal.kernel.exception.SystemException,
            vn.com.ecopharma.hrm.NoSuchEmployeeVacancyException {
        return getPersistence().removeByVacancyId_EmployeeId(v_id, employeeId);
    }

    /**
    * Returns the number of employee vacancies where v_id = &#63; and employeeId = &#63;.
    *
    * @param v_id the v_id
    * @param employeeId the employee ID
    * @return the number of matching employee vacancies
    * @throws SystemException if a system exception occurred
    */
    public static int countByVacancyId_EmployeeId(long v_id, long employeeId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByVacancyId_EmployeeId(v_id, employeeId);
    }

    /**
    * Returns all the employee vacancies where employeeId = &#63;.
    *
    * @param employeeId the employee ID
    * @return the matching employee vacancies
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<vn.com.ecopharma.hrm.model.EmployeeVacancy> findByEmployeeId(
        long employeeId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByEmployeeId(employeeId);
    }

    /**
    * Returns a range of all the employee vacancies where employeeId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.com.ecopharma.hrm.model.impl.EmployeeVacancyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param employeeId the employee ID
    * @param start the lower bound of the range of employee vacancies
    * @param end the upper bound of the range of employee vacancies (not inclusive)
    * @return the range of matching employee vacancies
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<vn.com.ecopharma.hrm.model.EmployeeVacancy> findByEmployeeId(
        long employeeId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByEmployeeId(employeeId, start, end);
    }

    /**
    * Returns an ordered range of all the employee vacancies where employeeId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.com.ecopharma.hrm.model.impl.EmployeeVacancyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param employeeId the employee ID
    * @param start the lower bound of the range of employee vacancies
    * @param end the upper bound of the range of employee vacancies (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching employee vacancies
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<vn.com.ecopharma.hrm.model.EmployeeVacancy> findByEmployeeId(
        long employeeId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByEmployeeId(employeeId, start, end, orderByComparator);
    }

    /**
    * Returns the first employee vacancy in the ordered set where employeeId = &#63;.
    *
    * @param employeeId the employee ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching employee vacancy
    * @throws vn.com.ecopharma.hrm.NoSuchEmployeeVacancyException if a matching employee vacancy could not be found
    * @throws SystemException if a system exception occurred
    */
    public static vn.com.ecopharma.hrm.model.EmployeeVacancy findByEmployeeId_First(
        long employeeId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            vn.com.ecopharma.hrm.NoSuchEmployeeVacancyException {
        return getPersistence()
                   .findByEmployeeId_First(employeeId, orderByComparator);
    }

    /**
    * Returns the first employee vacancy in the ordered set where employeeId = &#63;.
    *
    * @param employeeId the employee ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching employee vacancy, or <code>null</code> if a matching employee vacancy could not be found
    * @throws SystemException if a system exception occurred
    */
    public static vn.com.ecopharma.hrm.model.EmployeeVacancy fetchByEmployeeId_First(
        long employeeId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByEmployeeId_First(employeeId, orderByComparator);
    }

    /**
    * Returns the last employee vacancy in the ordered set where employeeId = &#63;.
    *
    * @param employeeId the employee ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching employee vacancy
    * @throws vn.com.ecopharma.hrm.NoSuchEmployeeVacancyException if a matching employee vacancy could not be found
    * @throws SystemException if a system exception occurred
    */
    public static vn.com.ecopharma.hrm.model.EmployeeVacancy findByEmployeeId_Last(
        long employeeId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            vn.com.ecopharma.hrm.NoSuchEmployeeVacancyException {
        return getPersistence()
                   .findByEmployeeId_Last(employeeId, orderByComparator);
    }

    /**
    * Returns the last employee vacancy in the ordered set where employeeId = &#63;.
    *
    * @param employeeId the employee ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching employee vacancy, or <code>null</code> if a matching employee vacancy could not be found
    * @throws SystemException if a system exception occurred
    */
    public static vn.com.ecopharma.hrm.model.EmployeeVacancy fetchByEmployeeId_Last(
        long employeeId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByEmployeeId_Last(employeeId, orderByComparator);
    }

    /**
    * Returns the employee vacancies before and after the current employee vacancy in the ordered set where employeeId = &#63;.
    *
    * @param employeeVacancyId the primary key of the current employee vacancy
    * @param employeeId the employee ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next employee vacancy
    * @throws vn.com.ecopharma.hrm.NoSuchEmployeeVacancyException if a employee vacancy with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static vn.com.ecopharma.hrm.model.EmployeeVacancy[] findByEmployeeId_PrevAndNext(
        long employeeVacancyId, long employeeId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            vn.com.ecopharma.hrm.NoSuchEmployeeVacancyException {
        return getPersistence()
                   .findByEmployeeId_PrevAndNext(employeeVacancyId, employeeId,
            orderByComparator);
    }

    /**
    * Removes all the employee vacancies where employeeId = &#63; from the database.
    *
    * @param employeeId the employee ID
    * @throws SystemException if a system exception occurred
    */
    public static void removeByEmployeeId(long employeeId)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByEmployeeId(employeeId);
    }

    /**
    * Returns the number of employee vacancies where employeeId = &#63;.
    *
    * @param employeeId the employee ID
    * @return the number of matching employee vacancies
    * @throws SystemException if a system exception occurred
    */
    public static int countByEmployeeId(long employeeId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByEmployeeId(employeeId);
    }

    /**
    * Returns all the employee vacancies where v_id = &#63;.
    *
    * @param v_id the v_id
    * @return the matching employee vacancies
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<vn.com.ecopharma.hrm.model.EmployeeVacancy> findByVacancyId(
        long v_id) throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByVacancyId(v_id);
    }

    /**
    * Returns a range of all the employee vacancies where v_id = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.com.ecopharma.hrm.model.impl.EmployeeVacancyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param v_id the v_id
    * @param start the lower bound of the range of employee vacancies
    * @param end the upper bound of the range of employee vacancies (not inclusive)
    * @return the range of matching employee vacancies
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<vn.com.ecopharma.hrm.model.EmployeeVacancy> findByVacancyId(
        long v_id, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByVacancyId(v_id, start, end);
    }

    /**
    * Returns an ordered range of all the employee vacancies where v_id = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.com.ecopharma.hrm.model.impl.EmployeeVacancyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param v_id the v_id
    * @param start the lower bound of the range of employee vacancies
    * @param end the upper bound of the range of employee vacancies (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching employee vacancies
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<vn.com.ecopharma.hrm.model.EmployeeVacancy> findByVacancyId(
        long v_id, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByVacancyId(v_id, start, end, orderByComparator);
    }

    /**
    * Returns the first employee vacancy in the ordered set where v_id = &#63;.
    *
    * @param v_id the v_id
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching employee vacancy
    * @throws vn.com.ecopharma.hrm.NoSuchEmployeeVacancyException if a matching employee vacancy could not be found
    * @throws SystemException if a system exception occurred
    */
    public static vn.com.ecopharma.hrm.model.EmployeeVacancy findByVacancyId_First(
        long v_id,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            vn.com.ecopharma.hrm.NoSuchEmployeeVacancyException {
        return getPersistence().findByVacancyId_First(v_id, orderByComparator);
    }

    /**
    * Returns the first employee vacancy in the ordered set where v_id = &#63;.
    *
    * @param v_id the v_id
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching employee vacancy, or <code>null</code> if a matching employee vacancy could not be found
    * @throws SystemException if a system exception occurred
    */
    public static vn.com.ecopharma.hrm.model.EmployeeVacancy fetchByVacancyId_First(
        long v_id,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByVacancyId_First(v_id, orderByComparator);
    }

    /**
    * Returns the last employee vacancy in the ordered set where v_id = &#63;.
    *
    * @param v_id the v_id
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching employee vacancy
    * @throws vn.com.ecopharma.hrm.NoSuchEmployeeVacancyException if a matching employee vacancy could not be found
    * @throws SystemException if a system exception occurred
    */
    public static vn.com.ecopharma.hrm.model.EmployeeVacancy findByVacancyId_Last(
        long v_id,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            vn.com.ecopharma.hrm.NoSuchEmployeeVacancyException {
        return getPersistence().findByVacancyId_Last(v_id, orderByComparator);
    }

    /**
    * Returns the last employee vacancy in the ordered set where v_id = &#63;.
    *
    * @param v_id the v_id
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching employee vacancy, or <code>null</code> if a matching employee vacancy could not be found
    * @throws SystemException if a system exception occurred
    */
    public static vn.com.ecopharma.hrm.model.EmployeeVacancy fetchByVacancyId_Last(
        long v_id,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByVacancyId_Last(v_id, orderByComparator);
    }

    /**
    * Returns the employee vacancies before and after the current employee vacancy in the ordered set where v_id = &#63;.
    *
    * @param employeeVacancyId the primary key of the current employee vacancy
    * @param v_id the v_id
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next employee vacancy
    * @throws vn.com.ecopharma.hrm.NoSuchEmployeeVacancyException if a employee vacancy with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static vn.com.ecopharma.hrm.model.EmployeeVacancy[] findByVacancyId_PrevAndNext(
        long employeeVacancyId, long v_id,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            vn.com.ecopharma.hrm.NoSuchEmployeeVacancyException {
        return getPersistence()
                   .findByVacancyId_PrevAndNext(employeeVacancyId, v_id,
            orderByComparator);
    }

    /**
    * Removes all the employee vacancies where v_id = &#63; from the database.
    *
    * @param v_id the v_id
    * @throws SystemException if a system exception occurred
    */
    public static void removeByVacancyId(long v_id)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByVacancyId(v_id);
    }

    /**
    * Returns the number of employee vacancies where v_id = &#63;.
    *
    * @param v_id the v_id
    * @return the number of matching employee vacancies
    * @throws SystemException if a system exception occurred
    */
    public static int countByVacancyId(long v_id)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByVacancyId(v_id);
    }

    /**
    * Caches the employee vacancy in the entity cache if it is enabled.
    *
    * @param employeeVacancy the employee vacancy
    */
    public static void cacheResult(
        vn.com.ecopharma.hrm.model.EmployeeVacancy employeeVacancy) {
        getPersistence().cacheResult(employeeVacancy);
    }

    /**
    * Caches the employee vacancies in the entity cache if it is enabled.
    *
    * @param employeeVacancies the employee vacancies
    */
    public static void cacheResult(
        java.util.List<vn.com.ecopharma.hrm.model.EmployeeVacancy> employeeVacancies) {
        getPersistence().cacheResult(employeeVacancies);
    }

    /**
    * Creates a new employee vacancy with the primary key. Does not add the employee vacancy to the database.
    *
    * @param employeeVacancyId the primary key for the new employee vacancy
    * @return the new employee vacancy
    */
    public static vn.com.ecopharma.hrm.model.EmployeeVacancy create(
        long employeeVacancyId) {
        return getPersistence().create(employeeVacancyId);
    }

    /**
    * Removes the employee vacancy with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param employeeVacancyId the primary key of the employee vacancy
    * @return the employee vacancy that was removed
    * @throws vn.com.ecopharma.hrm.NoSuchEmployeeVacancyException if a employee vacancy with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static vn.com.ecopharma.hrm.model.EmployeeVacancy remove(
        long employeeVacancyId)
        throws com.liferay.portal.kernel.exception.SystemException,
            vn.com.ecopharma.hrm.NoSuchEmployeeVacancyException {
        return getPersistence().remove(employeeVacancyId);
    }

    public static vn.com.ecopharma.hrm.model.EmployeeVacancy updateImpl(
        vn.com.ecopharma.hrm.model.EmployeeVacancy employeeVacancy)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(employeeVacancy);
    }

    /**
    * Returns the employee vacancy with the primary key or throws a {@link vn.com.ecopharma.hrm.NoSuchEmployeeVacancyException} if it could not be found.
    *
    * @param employeeVacancyId the primary key of the employee vacancy
    * @return the employee vacancy
    * @throws vn.com.ecopharma.hrm.NoSuchEmployeeVacancyException if a employee vacancy with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static vn.com.ecopharma.hrm.model.EmployeeVacancy findByPrimaryKey(
        long employeeVacancyId)
        throws com.liferay.portal.kernel.exception.SystemException,
            vn.com.ecopharma.hrm.NoSuchEmployeeVacancyException {
        return getPersistence().findByPrimaryKey(employeeVacancyId);
    }

    /**
    * Returns the employee vacancy with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param employeeVacancyId the primary key of the employee vacancy
    * @return the employee vacancy, or <code>null</code> if a employee vacancy with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static vn.com.ecopharma.hrm.model.EmployeeVacancy fetchByPrimaryKey(
        long employeeVacancyId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(employeeVacancyId);
    }

    /**
    * Returns all the employee vacancies.
    *
    * @return the employee vacancies
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<vn.com.ecopharma.hrm.model.EmployeeVacancy> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
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
    public static java.util.List<vn.com.ecopharma.hrm.model.EmployeeVacancy> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
    }

    /**
    * Returns an ordered range of all the employee vacancies.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.com.ecopharma.hrm.model.impl.EmployeeVacancyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of employee vacancies
    * @param end the upper bound of the range of employee vacancies (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of employee vacancies
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<vn.com.ecopharma.hrm.model.EmployeeVacancy> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the employee vacancies from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of employee vacancies.
    *
    * @return the number of employee vacancies
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    public static EmployeeVacancyPersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (EmployeeVacancyPersistence) PortletBeanLocatorUtil.locate(vn.com.ecopharma.hrm.service.ClpSerializer.getServletContextName(),
                    EmployeeVacancyPersistence.class.getName());

            ReferenceRegistry.registerReference(EmployeeVacancyUtil.class,
                "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setPersistence(EmployeeVacancyPersistence persistence) {
    }
}
