package vn.com.ecopharma.hrm.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import vn.com.ecopharma.hrm.model.EmployeeInterviewSchedule;

import java.util.List;

/**
 * The persistence utility for the employee interview schedule service. This utility wraps {@link EmployeeInterviewSchedulePersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author tvt
 * @see EmployeeInterviewSchedulePersistence
 * @see EmployeeInterviewSchedulePersistenceImpl
 * @generated
 */
public class EmployeeInterviewScheduleUtil {
    private static EmployeeInterviewSchedulePersistence _persistence;

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
    public static void clearCache(
        EmployeeInterviewSchedule employeeInterviewSchedule) {
        getPersistence().clearCache(employeeInterviewSchedule);
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
    public static List<EmployeeInterviewSchedule> findWithDynamicQuery(
        DynamicQuery dynamicQuery) throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<EmployeeInterviewSchedule> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<EmployeeInterviewSchedule> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
     */
    public static EmployeeInterviewSchedule update(
        EmployeeInterviewSchedule employeeInterviewSchedule)
        throws SystemException {
        return getPersistence().update(employeeInterviewSchedule);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
     */
    public static EmployeeInterviewSchedule update(
        EmployeeInterviewSchedule employeeInterviewSchedule,
        ServiceContext serviceContext) throws SystemException {
        return getPersistence().update(employeeInterviewSchedule, serviceContext);
    }

    /**
    * Caches the employee interview schedule in the entity cache if it is enabled.
    *
    * @param employeeInterviewSchedule the employee interview schedule
    */
    public static void cacheResult(
        vn.com.ecopharma.hrm.model.EmployeeInterviewSchedule employeeInterviewSchedule) {
        getPersistence().cacheResult(employeeInterviewSchedule);
    }

    /**
    * Caches the employee interview schedules in the entity cache if it is enabled.
    *
    * @param employeeInterviewSchedules the employee interview schedules
    */
    public static void cacheResult(
        java.util.List<vn.com.ecopharma.hrm.model.EmployeeInterviewSchedule> employeeInterviewSchedules) {
        getPersistence().cacheResult(employeeInterviewSchedules);
    }

    /**
    * Creates a new employee interview schedule with the primary key. Does not add the employee interview schedule to the database.
    *
    * @param employeeInterviewScheduleId the primary key for the new employee interview schedule
    * @return the new employee interview schedule
    */
    public static vn.com.ecopharma.hrm.model.EmployeeInterviewSchedule create(
        long employeeInterviewScheduleId) {
        return getPersistence().create(employeeInterviewScheduleId);
    }

    /**
    * Removes the employee interview schedule with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param employeeInterviewScheduleId the primary key of the employee interview schedule
    * @return the employee interview schedule that was removed
    * @throws vn.com.ecopharma.hrm.NoSuchEmployeeInterviewScheduleException if a employee interview schedule with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static vn.com.ecopharma.hrm.model.EmployeeInterviewSchedule remove(
        long employeeInterviewScheduleId)
        throws com.liferay.portal.kernel.exception.SystemException,
            vn.com.ecopharma.hrm.NoSuchEmployeeInterviewScheduleException {
        return getPersistence().remove(employeeInterviewScheduleId);
    }

    public static vn.com.ecopharma.hrm.model.EmployeeInterviewSchedule updateImpl(
        vn.com.ecopharma.hrm.model.EmployeeInterviewSchedule employeeInterviewSchedule)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(employeeInterviewSchedule);
    }

    /**
    * Returns the employee interview schedule with the primary key or throws a {@link vn.com.ecopharma.hrm.NoSuchEmployeeInterviewScheduleException} if it could not be found.
    *
    * @param employeeInterviewScheduleId the primary key of the employee interview schedule
    * @return the employee interview schedule
    * @throws vn.com.ecopharma.hrm.NoSuchEmployeeInterviewScheduleException if a employee interview schedule with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static vn.com.ecopharma.hrm.model.EmployeeInterviewSchedule findByPrimaryKey(
        long employeeInterviewScheduleId)
        throws com.liferay.portal.kernel.exception.SystemException,
            vn.com.ecopharma.hrm.NoSuchEmployeeInterviewScheduleException {
        return getPersistence().findByPrimaryKey(employeeInterviewScheduleId);
    }

    /**
    * Returns the employee interview schedule with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param employeeInterviewScheduleId the primary key of the employee interview schedule
    * @return the employee interview schedule, or <code>null</code> if a employee interview schedule with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static vn.com.ecopharma.hrm.model.EmployeeInterviewSchedule fetchByPrimaryKey(
        long employeeInterviewScheduleId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(employeeInterviewScheduleId);
    }

    /**
    * Returns all the employee interview schedules.
    *
    * @return the employee interview schedules
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<vn.com.ecopharma.hrm.model.EmployeeInterviewSchedule> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
    }

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
    public static java.util.List<vn.com.ecopharma.hrm.model.EmployeeInterviewSchedule> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
    }

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
    public static java.util.List<vn.com.ecopharma.hrm.model.EmployeeInterviewSchedule> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the employee interview schedules from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of employee interview schedules.
    *
    * @return the number of employee interview schedules
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    public static EmployeeInterviewSchedulePersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (EmployeeInterviewSchedulePersistence) PortletBeanLocatorUtil.locate(vn.com.ecopharma.hrm.service.ClpSerializer.getServletContextName(),
                    EmployeeInterviewSchedulePersistence.class.getName());

            ReferenceRegistry.registerReference(EmployeeInterviewScheduleUtil.class,
                "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setPersistence(EmployeeInterviewSchedulePersistence persistence) {
    }
}
