package vn.com.ecopharma.hrm.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import vn.com.ecopharma.hrm.model.EmployeeInterviewSchedule;

/**
 * The persistence interface for the employee interview schedule service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author tvt
 * @see EmployeeInterviewSchedulePersistenceImpl
 * @see EmployeeInterviewScheduleUtil
 * @generated
 */
public interface EmployeeInterviewSchedulePersistence extends BasePersistence<EmployeeInterviewSchedule> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link EmployeeInterviewScheduleUtil} to access the employee interview schedule persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Returns all the employee interview schedules where employeeId = &#63;.
    *
    * @param employeeId the employee ID
    * @return the matching employee interview schedules
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<vn.com.ecopharma.hrm.model.EmployeeInterviewSchedule> findByEmpId(
        long employeeId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the employee interview schedules where employeeId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.com.ecopharma.hrm.model.impl.EmployeeInterviewScheduleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param employeeId the employee ID
    * @param start the lower bound of the range of employee interview schedules
    * @param end the upper bound of the range of employee interview schedules (not inclusive)
    * @return the range of matching employee interview schedules
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<vn.com.ecopharma.hrm.model.EmployeeInterviewSchedule> findByEmpId(
        long employeeId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the employee interview schedules where employeeId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.com.ecopharma.hrm.model.impl.EmployeeInterviewScheduleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param employeeId the employee ID
    * @param start the lower bound of the range of employee interview schedules
    * @param end the upper bound of the range of employee interview schedules (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching employee interview schedules
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<vn.com.ecopharma.hrm.model.EmployeeInterviewSchedule> findByEmpId(
        long employeeId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first employee interview schedule in the ordered set where employeeId = &#63;.
    *
    * @param employeeId the employee ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching employee interview schedule
    * @throws vn.com.ecopharma.hrm.NoSuchEmployeeInterviewScheduleException if a matching employee interview schedule could not be found
    * @throws SystemException if a system exception occurred
    */
    public vn.com.ecopharma.hrm.model.EmployeeInterviewSchedule findByEmpId_First(
        long employeeId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            vn.com.ecopharma.hrm.NoSuchEmployeeInterviewScheduleException;

    /**
    * Returns the first employee interview schedule in the ordered set where employeeId = &#63;.
    *
    * @param employeeId the employee ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching employee interview schedule, or <code>null</code> if a matching employee interview schedule could not be found
    * @throws SystemException if a system exception occurred
    */
    public vn.com.ecopharma.hrm.model.EmployeeInterviewSchedule fetchByEmpId_First(
        long employeeId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last employee interview schedule in the ordered set where employeeId = &#63;.
    *
    * @param employeeId the employee ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching employee interview schedule
    * @throws vn.com.ecopharma.hrm.NoSuchEmployeeInterviewScheduleException if a matching employee interview schedule could not be found
    * @throws SystemException if a system exception occurred
    */
    public vn.com.ecopharma.hrm.model.EmployeeInterviewSchedule findByEmpId_Last(
        long employeeId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            vn.com.ecopharma.hrm.NoSuchEmployeeInterviewScheduleException;

    /**
    * Returns the last employee interview schedule in the ordered set where employeeId = &#63;.
    *
    * @param employeeId the employee ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching employee interview schedule, or <code>null</code> if a matching employee interview schedule could not be found
    * @throws SystemException if a system exception occurred
    */
    public vn.com.ecopharma.hrm.model.EmployeeInterviewSchedule fetchByEmpId_Last(
        long employeeId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the employee interview schedules before and after the current employee interview schedule in the ordered set where employeeId = &#63;.
    *
    * @param employeeInterviewScheduleId the primary key of the current employee interview schedule
    * @param employeeId the employee ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next employee interview schedule
    * @throws vn.com.ecopharma.hrm.NoSuchEmployeeInterviewScheduleException if a employee interview schedule with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public vn.com.ecopharma.hrm.model.EmployeeInterviewSchedule[] findByEmpId_PrevAndNext(
        long employeeInterviewScheduleId, long employeeId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            vn.com.ecopharma.hrm.NoSuchEmployeeInterviewScheduleException;

    /**
    * Removes all the employee interview schedules where employeeId = &#63; from the database.
    *
    * @param employeeId the employee ID
    * @throws SystemException if a system exception occurred
    */
    public void removeByEmpId(long employeeId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of employee interview schedules where employeeId = &#63;.
    *
    * @param employeeId the employee ID
    * @return the number of matching employee interview schedules
    * @throws SystemException if a system exception occurred
    */
    public int countByEmpId(long employeeId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the employee interview schedules where interviewScheduleId = &#63;.
    *
    * @param interviewScheduleId the interview schedule ID
    * @return the matching employee interview schedules
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<vn.com.ecopharma.hrm.model.EmployeeInterviewSchedule> findByInterviewScheduleId(
        long interviewScheduleId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the employee interview schedules where interviewScheduleId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.com.ecopharma.hrm.model.impl.EmployeeInterviewScheduleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param interviewScheduleId the interview schedule ID
    * @param start the lower bound of the range of employee interview schedules
    * @param end the upper bound of the range of employee interview schedules (not inclusive)
    * @return the range of matching employee interview schedules
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<vn.com.ecopharma.hrm.model.EmployeeInterviewSchedule> findByInterviewScheduleId(
        long interviewScheduleId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the employee interview schedules where interviewScheduleId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.com.ecopharma.hrm.model.impl.EmployeeInterviewScheduleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param interviewScheduleId the interview schedule ID
    * @param start the lower bound of the range of employee interview schedules
    * @param end the upper bound of the range of employee interview schedules (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching employee interview schedules
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<vn.com.ecopharma.hrm.model.EmployeeInterviewSchedule> findByInterviewScheduleId(
        long interviewScheduleId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first employee interview schedule in the ordered set where interviewScheduleId = &#63;.
    *
    * @param interviewScheduleId the interview schedule ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching employee interview schedule
    * @throws vn.com.ecopharma.hrm.NoSuchEmployeeInterviewScheduleException if a matching employee interview schedule could not be found
    * @throws SystemException if a system exception occurred
    */
    public vn.com.ecopharma.hrm.model.EmployeeInterviewSchedule findByInterviewScheduleId_First(
        long interviewScheduleId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            vn.com.ecopharma.hrm.NoSuchEmployeeInterviewScheduleException;

    /**
    * Returns the first employee interview schedule in the ordered set where interviewScheduleId = &#63;.
    *
    * @param interviewScheduleId the interview schedule ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching employee interview schedule, or <code>null</code> if a matching employee interview schedule could not be found
    * @throws SystemException if a system exception occurred
    */
    public vn.com.ecopharma.hrm.model.EmployeeInterviewSchedule fetchByInterviewScheduleId_First(
        long interviewScheduleId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last employee interview schedule in the ordered set where interviewScheduleId = &#63;.
    *
    * @param interviewScheduleId the interview schedule ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching employee interview schedule
    * @throws vn.com.ecopharma.hrm.NoSuchEmployeeInterviewScheduleException if a matching employee interview schedule could not be found
    * @throws SystemException if a system exception occurred
    */
    public vn.com.ecopharma.hrm.model.EmployeeInterviewSchedule findByInterviewScheduleId_Last(
        long interviewScheduleId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            vn.com.ecopharma.hrm.NoSuchEmployeeInterviewScheduleException;

    /**
    * Returns the last employee interview schedule in the ordered set where interviewScheduleId = &#63;.
    *
    * @param interviewScheduleId the interview schedule ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching employee interview schedule, or <code>null</code> if a matching employee interview schedule could not be found
    * @throws SystemException if a system exception occurred
    */
    public vn.com.ecopharma.hrm.model.EmployeeInterviewSchedule fetchByInterviewScheduleId_Last(
        long interviewScheduleId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the employee interview schedules before and after the current employee interview schedule in the ordered set where interviewScheduleId = &#63;.
    *
    * @param employeeInterviewScheduleId the primary key of the current employee interview schedule
    * @param interviewScheduleId the interview schedule ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next employee interview schedule
    * @throws vn.com.ecopharma.hrm.NoSuchEmployeeInterviewScheduleException if a employee interview schedule with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public vn.com.ecopharma.hrm.model.EmployeeInterviewSchedule[] findByInterviewScheduleId_PrevAndNext(
        long employeeInterviewScheduleId, long interviewScheduleId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            vn.com.ecopharma.hrm.NoSuchEmployeeInterviewScheduleException;

    /**
    * Removes all the employee interview schedules where interviewScheduleId = &#63; from the database.
    *
    * @param interviewScheduleId the interview schedule ID
    * @throws SystemException if a system exception occurred
    */
    public void removeByInterviewScheduleId(long interviewScheduleId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of employee interview schedules where interviewScheduleId = &#63;.
    *
    * @param interviewScheduleId the interview schedule ID
    * @return the number of matching employee interview schedules
    * @throws SystemException if a system exception occurred
    */
    public int countByInterviewScheduleId(long interviewScheduleId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Caches the employee interview schedule in the entity cache if it is enabled.
    *
    * @param employeeInterviewSchedule the employee interview schedule
    */
    public void cacheResult(
        vn.com.ecopharma.hrm.model.EmployeeInterviewSchedule employeeInterviewSchedule);

    /**
    * Caches the employee interview schedules in the entity cache if it is enabled.
    *
    * @param employeeInterviewSchedules the employee interview schedules
    */
    public void cacheResult(
        java.util.List<vn.com.ecopharma.hrm.model.EmployeeInterviewSchedule> employeeInterviewSchedules);

    /**
    * Creates a new employee interview schedule with the primary key. Does not add the employee interview schedule to the database.
    *
    * @param employeeInterviewScheduleId the primary key for the new employee interview schedule
    * @return the new employee interview schedule
    */
    public vn.com.ecopharma.hrm.model.EmployeeInterviewSchedule create(
        long employeeInterviewScheduleId);

    /**
    * Removes the employee interview schedule with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param employeeInterviewScheduleId the primary key of the employee interview schedule
    * @return the employee interview schedule that was removed
    * @throws vn.com.ecopharma.hrm.NoSuchEmployeeInterviewScheduleException if a employee interview schedule with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public vn.com.ecopharma.hrm.model.EmployeeInterviewSchedule remove(
        long employeeInterviewScheduleId)
        throws com.liferay.portal.kernel.exception.SystemException,
            vn.com.ecopharma.hrm.NoSuchEmployeeInterviewScheduleException;

    public vn.com.ecopharma.hrm.model.EmployeeInterviewSchedule updateImpl(
        vn.com.ecopharma.hrm.model.EmployeeInterviewSchedule employeeInterviewSchedule)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the employee interview schedule with the primary key or throws a {@link vn.com.ecopharma.hrm.NoSuchEmployeeInterviewScheduleException} if it could not be found.
    *
    * @param employeeInterviewScheduleId the primary key of the employee interview schedule
    * @return the employee interview schedule
    * @throws vn.com.ecopharma.hrm.NoSuchEmployeeInterviewScheduleException if a employee interview schedule with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public vn.com.ecopharma.hrm.model.EmployeeInterviewSchedule findByPrimaryKey(
        long employeeInterviewScheduleId)
        throws com.liferay.portal.kernel.exception.SystemException,
            vn.com.ecopharma.hrm.NoSuchEmployeeInterviewScheduleException;

    /**
    * Returns the employee interview schedule with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param employeeInterviewScheduleId the primary key of the employee interview schedule
    * @return the employee interview schedule, or <code>null</code> if a employee interview schedule with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public vn.com.ecopharma.hrm.model.EmployeeInterviewSchedule fetchByPrimaryKey(
        long employeeInterviewScheduleId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the employee interview schedules.
    *
    * @return the employee interview schedules
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<vn.com.ecopharma.hrm.model.EmployeeInterviewSchedule> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the employee interview schedules.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.com.ecopharma.hrm.model.impl.EmployeeInterviewScheduleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of employee interview schedules
    * @param end the upper bound of the range of employee interview schedules (not inclusive)
    * @return the range of employee interview schedules
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<vn.com.ecopharma.hrm.model.EmployeeInterviewSchedule> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the employee interview schedules.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.com.ecopharma.hrm.model.impl.EmployeeInterviewScheduleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of employee interview schedules
    * @param end the upper bound of the range of employee interview schedules (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of employee interview schedules
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<vn.com.ecopharma.hrm.model.EmployeeInterviewSchedule> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the employee interview schedules from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of employee interview schedules.
    *
    * @return the number of employee interview schedules
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}
