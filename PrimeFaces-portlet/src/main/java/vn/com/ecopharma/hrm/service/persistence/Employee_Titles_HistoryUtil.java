package vn.com.ecopharma.hrm.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import vn.com.ecopharma.hrm.model.Employee_Titles_History;

import java.util.List;

/**
 * The persistence utility for the employee_ titles_ history service. This utility wraps {@link Employee_Titles_HistoryPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author tvt
 * @see Employee_Titles_HistoryPersistence
 * @see Employee_Titles_HistoryPersistenceImpl
 * @generated
 */
public class Employee_Titles_HistoryUtil {
    private static Employee_Titles_HistoryPersistence _persistence;

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
        Employee_Titles_History employee_Titles_History) {
        getPersistence().clearCache(employee_Titles_History);
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
    public static List<Employee_Titles_History> findWithDynamicQuery(
        DynamicQuery dynamicQuery) throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<Employee_Titles_History> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<Employee_Titles_History> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
     */
    public static Employee_Titles_History update(
        Employee_Titles_History employee_Titles_History)
        throws SystemException {
        return getPersistence().update(employee_Titles_History);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
     */
    public static Employee_Titles_History update(
        Employee_Titles_History employee_Titles_History,
        ServiceContext serviceContext) throws SystemException {
        return getPersistence().update(employee_Titles_History, serviceContext);
    }

    /**
    * Caches the employee_ titles_ history in the entity cache if it is enabled.
    *
    * @param employee_Titles_History the employee_ titles_ history
    */
    public static void cacheResult(
        vn.com.ecopharma.hrm.model.Employee_Titles_History employee_Titles_History) {
        getPersistence().cacheResult(employee_Titles_History);
    }

    /**
    * Caches the employee_ titles_ histories in the entity cache if it is enabled.
    *
    * @param employee_Titles_Histories the employee_ titles_ histories
    */
    public static void cacheResult(
        java.util.List<vn.com.ecopharma.hrm.model.Employee_Titles_History> employee_Titles_Histories) {
        getPersistence().cacheResult(employee_Titles_Histories);
    }

    /**
    * Creates a new employee_ titles_ history with the primary key. Does not add the employee_ titles_ history to the database.
    *
    * @param employee_Titles_HistoryId the primary key for the new employee_ titles_ history
    * @return the new employee_ titles_ history
    */
    public static vn.com.ecopharma.hrm.model.Employee_Titles_History create(
        long employee_Titles_HistoryId) {
        return getPersistence().create(employee_Titles_HistoryId);
    }

    /**
    * Removes the employee_ titles_ history with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param employee_Titles_HistoryId the primary key of the employee_ titles_ history
    * @return the employee_ titles_ history that was removed
    * @throws vn.com.ecopharma.hrm.NoSuchEmployee_Titles_HistoryException if a employee_ titles_ history with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static vn.com.ecopharma.hrm.model.Employee_Titles_History remove(
        long employee_Titles_HistoryId)
        throws com.liferay.portal.kernel.exception.SystemException,
            vn.com.ecopharma.hrm.NoSuchEmployee_Titles_HistoryException {
        return getPersistence().remove(employee_Titles_HistoryId);
    }

    public static vn.com.ecopharma.hrm.model.Employee_Titles_History updateImpl(
        vn.com.ecopharma.hrm.model.Employee_Titles_History employee_Titles_History)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(employee_Titles_History);
    }

    /**
    * Returns the employee_ titles_ history with the primary key or throws a {@link vn.com.ecopharma.hrm.NoSuchEmployee_Titles_HistoryException} if it could not be found.
    *
    * @param employee_Titles_HistoryId the primary key of the employee_ titles_ history
    * @return the employee_ titles_ history
    * @throws vn.com.ecopharma.hrm.NoSuchEmployee_Titles_HistoryException if a employee_ titles_ history with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static vn.com.ecopharma.hrm.model.Employee_Titles_History findByPrimaryKey(
        long employee_Titles_HistoryId)
        throws com.liferay.portal.kernel.exception.SystemException,
            vn.com.ecopharma.hrm.NoSuchEmployee_Titles_HistoryException {
        return getPersistence().findByPrimaryKey(employee_Titles_HistoryId);
    }

    /**
    * Returns the employee_ titles_ history with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param employee_Titles_HistoryId the primary key of the employee_ titles_ history
    * @return the employee_ titles_ history, or <code>null</code> if a employee_ titles_ history with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static vn.com.ecopharma.hrm.model.Employee_Titles_History fetchByPrimaryKey(
        long employee_Titles_HistoryId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(employee_Titles_HistoryId);
    }

    /**
    * Returns all the employee_ titles_ histories.
    *
    * @return the employee_ titles_ histories
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<vn.com.ecopharma.hrm.model.Employee_Titles_History> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
    }

    /**
    * Returns a range of all the employee_ titles_ histories.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.com.ecopharma.hrm.model.impl.Employee_Titles_HistoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of employee_ titles_ histories
    * @param end the upper bound of the range of employee_ titles_ histories (not inclusive)
    * @return the range of employee_ titles_ histories
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<vn.com.ecopharma.hrm.model.Employee_Titles_History> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
    }

    /**
    * Returns an ordered range of all the employee_ titles_ histories.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.com.ecopharma.hrm.model.impl.Employee_Titles_HistoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of employee_ titles_ histories
    * @param end the upper bound of the range of employee_ titles_ histories (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of employee_ titles_ histories
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<vn.com.ecopharma.hrm.model.Employee_Titles_History> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the employee_ titles_ histories from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of employee_ titles_ histories.
    *
    * @return the number of employee_ titles_ histories
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    public static Employee_Titles_HistoryPersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (Employee_Titles_HistoryPersistence) PortletBeanLocatorUtil.locate(vn.com.ecopharma.hrm.service.ClpSerializer.getServletContextName(),
                    Employee_Titles_HistoryPersistence.class.getName());

            ReferenceRegistry.registerReference(Employee_Titles_HistoryUtil.class,
                "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setPersistence(Employee_Titles_HistoryPersistence persistence) {
    }
}
