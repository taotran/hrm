package vn.com.ecopharma.hrm.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import vn.com.ecopharma.hrm.model.EmployeeVacancy;

/**
 * The persistence interface for the employee vacancy service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author tvt
 * @see EmployeeVacancyPersistenceImpl
 * @see EmployeeVacancyUtil
 * @generated
 */
public interface EmployeeVacancyPersistence extends BasePersistence<EmployeeVacancy> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link EmployeeVacancyUtil} to access the employee vacancy persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Returns the employee vacancy where v_id = &#63; and employeeId = &#63; or throws a {@link vn.com.ecopharma.hrm.NoSuchEmployeeVacancyException} if it could not be found.
    *
    * @param v_id the v_id
    * @param employeeId the employee ID
    * @return the matching employee vacancy
    * @throws vn.com.ecopharma.hrm.NoSuchEmployeeVacancyException if a matching employee vacancy could not be found
    * @throws SystemException if a system exception occurred
    */
    public vn.com.ecopharma.hrm.model.EmployeeVacancy findByVacancyId_EmployeeId(
        long v_id, long employeeId)
        throws com.liferay.portal.kernel.exception.SystemException,
            vn.com.ecopharma.hrm.NoSuchEmployeeVacancyException;

    /**
    * Returns the employee vacancy where v_id = &#63; and employeeId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
    *
    * @param v_id the v_id
    * @param employeeId the employee ID
    * @return the matching employee vacancy, or <code>null</code> if a matching employee vacancy could not be found
    * @throws SystemException if a system exception occurred
    */
    public vn.com.ecopharma.hrm.model.EmployeeVacancy fetchByVacancyId_EmployeeId(
        long v_id, long employeeId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the employee vacancy where v_id = &#63; and employeeId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
    *
    * @param v_id the v_id
    * @param employeeId the employee ID
    * @param retrieveFromCache whether to use the finder cache
    * @return the matching employee vacancy, or <code>null</code> if a matching employee vacancy could not be found
    * @throws SystemException if a system exception occurred
    */
    public vn.com.ecopharma.hrm.model.EmployeeVacancy fetchByVacancyId_EmployeeId(
        long v_id, long employeeId, boolean retrieveFromCache)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes the employee vacancy where v_id = &#63; and employeeId = &#63; from the database.
    *
    * @param v_id the v_id
    * @param employeeId the employee ID
    * @return the employee vacancy that was removed
    * @throws SystemException if a system exception occurred
    */
    public vn.com.ecopharma.hrm.model.EmployeeVacancy removeByVacancyId_EmployeeId(
        long v_id, long employeeId)
        throws com.liferay.portal.kernel.exception.SystemException,
            vn.com.ecopharma.hrm.NoSuchEmployeeVacancyException;

    /**
    * Returns the number of employee vacancies where v_id = &#63; and employeeId = &#63;.
    *
    * @param v_id the v_id
    * @param employeeId the employee ID
    * @return the number of matching employee vacancies
    * @throws SystemException if a system exception occurred
    */
    public int countByVacancyId_EmployeeId(long v_id, long employeeId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the employee vacancies where employeeId = &#63;.
    *
    * @param employeeId the employee ID
    * @return the matching employee vacancies
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<vn.com.ecopharma.hrm.model.EmployeeVacancy> findByEmployeeId(
        long employeeId)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<vn.com.ecopharma.hrm.model.EmployeeVacancy> findByEmployeeId(
        long employeeId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<vn.com.ecopharma.hrm.model.EmployeeVacancy> findByEmployeeId(
        long employeeId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first employee vacancy in the ordered set where employeeId = &#63;.
    *
    * @param employeeId the employee ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching employee vacancy
    * @throws vn.com.ecopharma.hrm.NoSuchEmployeeVacancyException if a matching employee vacancy could not be found
    * @throws SystemException if a system exception occurred
    */
    public vn.com.ecopharma.hrm.model.EmployeeVacancy findByEmployeeId_First(
        long employeeId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            vn.com.ecopharma.hrm.NoSuchEmployeeVacancyException;

    /**
    * Returns the first employee vacancy in the ordered set where employeeId = &#63;.
    *
    * @param employeeId the employee ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching employee vacancy, or <code>null</code> if a matching employee vacancy could not be found
    * @throws SystemException if a system exception occurred
    */
    public vn.com.ecopharma.hrm.model.EmployeeVacancy fetchByEmployeeId_First(
        long employeeId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last employee vacancy in the ordered set where employeeId = &#63;.
    *
    * @param employeeId the employee ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching employee vacancy
    * @throws vn.com.ecopharma.hrm.NoSuchEmployeeVacancyException if a matching employee vacancy could not be found
    * @throws SystemException if a system exception occurred
    */
    public vn.com.ecopharma.hrm.model.EmployeeVacancy findByEmployeeId_Last(
        long employeeId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            vn.com.ecopharma.hrm.NoSuchEmployeeVacancyException;

    /**
    * Returns the last employee vacancy in the ordered set where employeeId = &#63;.
    *
    * @param employeeId the employee ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching employee vacancy, or <code>null</code> if a matching employee vacancy could not be found
    * @throws SystemException if a system exception occurred
    */
    public vn.com.ecopharma.hrm.model.EmployeeVacancy fetchByEmployeeId_Last(
        long employeeId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public vn.com.ecopharma.hrm.model.EmployeeVacancy[] findByEmployeeId_PrevAndNext(
        long employeeVacancyId, long employeeId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            vn.com.ecopharma.hrm.NoSuchEmployeeVacancyException;

    /**
    * Removes all the employee vacancies where employeeId = &#63; from the database.
    *
    * @param employeeId the employee ID
    * @throws SystemException if a system exception occurred
    */
    public void removeByEmployeeId(long employeeId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of employee vacancies where employeeId = &#63;.
    *
    * @param employeeId the employee ID
    * @return the number of matching employee vacancies
    * @throws SystemException if a system exception occurred
    */
    public int countByEmployeeId(long employeeId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the employee vacancies where v_id = &#63;.
    *
    * @param v_id the v_id
    * @return the matching employee vacancies
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<vn.com.ecopharma.hrm.model.EmployeeVacancy> findByVacancyId(
        long v_id) throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<vn.com.ecopharma.hrm.model.EmployeeVacancy> findByVacancyId(
        long v_id, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<vn.com.ecopharma.hrm.model.EmployeeVacancy> findByVacancyId(
        long v_id, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first employee vacancy in the ordered set where v_id = &#63;.
    *
    * @param v_id the v_id
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching employee vacancy
    * @throws vn.com.ecopharma.hrm.NoSuchEmployeeVacancyException if a matching employee vacancy could not be found
    * @throws SystemException if a system exception occurred
    */
    public vn.com.ecopharma.hrm.model.EmployeeVacancy findByVacancyId_First(
        long v_id,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            vn.com.ecopharma.hrm.NoSuchEmployeeVacancyException;

    /**
    * Returns the first employee vacancy in the ordered set where v_id = &#63;.
    *
    * @param v_id the v_id
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching employee vacancy, or <code>null</code> if a matching employee vacancy could not be found
    * @throws SystemException if a system exception occurred
    */
    public vn.com.ecopharma.hrm.model.EmployeeVacancy fetchByVacancyId_First(
        long v_id,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last employee vacancy in the ordered set where v_id = &#63;.
    *
    * @param v_id the v_id
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching employee vacancy
    * @throws vn.com.ecopharma.hrm.NoSuchEmployeeVacancyException if a matching employee vacancy could not be found
    * @throws SystemException if a system exception occurred
    */
    public vn.com.ecopharma.hrm.model.EmployeeVacancy findByVacancyId_Last(
        long v_id,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            vn.com.ecopharma.hrm.NoSuchEmployeeVacancyException;

    /**
    * Returns the last employee vacancy in the ordered set where v_id = &#63;.
    *
    * @param v_id the v_id
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching employee vacancy, or <code>null</code> if a matching employee vacancy could not be found
    * @throws SystemException if a system exception occurred
    */
    public vn.com.ecopharma.hrm.model.EmployeeVacancy fetchByVacancyId_Last(
        long v_id,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public vn.com.ecopharma.hrm.model.EmployeeVacancy[] findByVacancyId_PrevAndNext(
        long employeeVacancyId, long v_id,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            vn.com.ecopharma.hrm.NoSuchEmployeeVacancyException;

    /**
    * Removes all the employee vacancies where v_id = &#63; from the database.
    *
    * @param v_id the v_id
    * @throws SystemException if a system exception occurred
    */
    public void removeByVacancyId(long v_id)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of employee vacancies where v_id = &#63;.
    *
    * @param v_id the v_id
    * @return the number of matching employee vacancies
    * @throws SystemException if a system exception occurred
    */
    public int countByVacancyId(long v_id)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Caches the employee vacancy in the entity cache if it is enabled.
    *
    * @param employeeVacancy the employee vacancy
    */
    public void cacheResult(
        vn.com.ecopharma.hrm.model.EmployeeVacancy employeeVacancy);

    /**
    * Caches the employee vacancies in the entity cache if it is enabled.
    *
    * @param employeeVacancies the employee vacancies
    */
    public void cacheResult(
        java.util.List<vn.com.ecopharma.hrm.model.EmployeeVacancy> employeeVacancies);

    /**
    * Creates a new employee vacancy with the primary key. Does not add the employee vacancy to the database.
    *
    * @param employeeVacancyId the primary key for the new employee vacancy
    * @return the new employee vacancy
    */
    public vn.com.ecopharma.hrm.model.EmployeeVacancy create(
        long employeeVacancyId);

    /**
    * Removes the employee vacancy with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param employeeVacancyId the primary key of the employee vacancy
    * @return the employee vacancy that was removed
    * @throws vn.com.ecopharma.hrm.NoSuchEmployeeVacancyException if a employee vacancy with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public vn.com.ecopharma.hrm.model.EmployeeVacancy remove(
        long employeeVacancyId)
        throws com.liferay.portal.kernel.exception.SystemException,
            vn.com.ecopharma.hrm.NoSuchEmployeeVacancyException;

    public vn.com.ecopharma.hrm.model.EmployeeVacancy updateImpl(
        vn.com.ecopharma.hrm.model.EmployeeVacancy employeeVacancy)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the employee vacancy with the primary key or throws a {@link vn.com.ecopharma.hrm.NoSuchEmployeeVacancyException} if it could not be found.
    *
    * @param employeeVacancyId the primary key of the employee vacancy
    * @return the employee vacancy
    * @throws vn.com.ecopharma.hrm.NoSuchEmployeeVacancyException if a employee vacancy with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public vn.com.ecopharma.hrm.model.EmployeeVacancy findByPrimaryKey(
        long employeeVacancyId)
        throws com.liferay.portal.kernel.exception.SystemException,
            vn.com.ecopharma.hrm.NoSuchEmployeeVacancyException;

    /**
    * Returns the employee vacancy with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param employeeVacancyId the primary key of the employee vacancy
    * @return the employee vacancy, or <code>null</code> if a employee vacancy with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public vn.com.ecopharma.hrm.model.EmployeeVacancy fetchByPrimaryKey(
        long employeeVacancyId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the employee vacancies.
    *
    * @return the employee vacancies
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<vn.com.ecopharma.hrm.model.EmployeeVacancy> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<vn.com.ecopharma.hrm.model.EmployeeVacancy> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<vn.com.ecopharma.hrm.model.EmployeeVacancy> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the employee vacancies from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of employee vacancies.
    *
    * @return the number of employee vacancies
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}
