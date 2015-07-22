package vn.com.ecopharma.hrm.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import vn.com.ecopharma.hrm.model.Employee_Titles;

import java.util.List;

/**
 * The persistence utility for the employee_ titles service. This utility wraps {@link Employee_TitlesPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author tvt
 * @see Employee_TitlesPersistence
 * @see Employee_TitlesPersistenceImpl
 * @generated
 */
public class Employee_TitlesUtil {
    private static Employee_TitlesPersistence _persistence;

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
    public static void clearCache(Employee_Titles employee_Titles) {
        getPersistence().clearCache(employee_Titles);
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
    public static List<Employee_Titles> findWithDynamicQuery(
        DynamicQuery dynamicQuery) throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<Employee_Titles> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<Employee_Titles> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
     */
    public static Employee_Titles update(Employee_Titles employee_Titles)
        throws SystemException {
        return getPersistence().update(employee_Titles);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
     */
    public static Employee_Titles update(Employee_Titles employee_Titles,
        ServiceContext serviceContext) throws SystemException {
        return getPersistence().update(employee_Titles, serviceContext);
    }

    /**
    * Caches the employee_ titles in the entity cache if it is enabled.
    *
    * @param employee_Titles the employee_ titles
    */
    public static void cacheResult(
        vn.com.ecopharma.hrm.model.Employee_Titles employee_Titles) {
        getPersistence().cacheResult(employee_Titles);
    }

    /**
    * Caches the employee_ titleses in the entity cache if it is enabled.
    *
    * @param employee_Titleses the employee_ titleses
    */
    public static void cacheResult(
        java.util.List<vn.com.ecopharma.hrm.model.Employee_Titles> employee_Titleses) {
        getPersistence().cacheResult(employee_Titleses);
    }

    /**
    * Creates a new employee_ titles with the primary key. Does not add the employee_ titles to the database.
    *
    * @param employee_TitlesId the primary key for the new employee_ titles
    * @return the new employee_ titles
    */
    public static vn.com.ecopharma.hrm.model.Employee_Titles create(
        long employee_TitlesId) {
        return getPersistence().create(employee_TitlesId);
    }

    /**
    * Removes the employee_ titles with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param employee_TitlesId the primary key of the employee_ titles
    * @return the employee_ titles that was removed
    * @throws vn.com.ecopharma.hrm.NoSuchEmployee_TitlesException if a employee_ titles with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static vn.com.ecopharma.hrm.model.Employee_Titles remove(
        long employee_TitlesId)
        throws com.liferay.portal.kernel.exception.SystemException,
            vn.com.ecopharma.hrm.NoSuchEmployee_TitlesException {
        return getPersistence().remove(employee_TitlesId);
    }

    public static vn.com.ecopharma.hrm.model.Employee_Titles updateImpl(
        vn.com.ecopharma.hrm.model.Employee_Titles employee_Titles)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(employee_Titles);
    }

    /**
    * Returns the employee_ titles with the primary key or throws a {@link vn.com.ecopharma.hrm.NoSuchEmployee_TitlesException} if it could not be found.
    *
    * @param employee_TitlesId the primary key of the employee_ titles
    * @return the employee_ titles
    * @throws vn.com.ecopharma.hrm.NoSuchEmployee_TitlesException if a employee_ titles with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static vn.com.ecopharma.hrm.model.Employee_Titles findByPrimaryKey(
        long employee_TitlesId)
        throws com.liferay.portal.kernel.exception.SystemException,
            vn.com.ecopharma.hrm.NoSuchEmployee_TitlesException {
        return getPersistence().findByPrimaryKey(employee_TitlesId);
    }

    /**
    * Returns the employee_ titles with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param employee_TitlesId the primary key of the employee_ titles
    * @return the employee_ titles, or <code>null</code> if a employee_ titles with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static vn.com.ecopharma.hrm.model.Employee_Titles fetchByPrimaryKey(
        long employee_TitlesId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(employee_TitlesId);
    }

    /**
    * Returns all the employee_ titleses.
    *
    * @return the employee_ titleses
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<vn.com.ecopharma.hrm.model.Employee_Titles> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
    }

    /**
    * Returns a range of all the employee_ titleses.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.com.ecopharma.hrm.model.impl.Employee_TitlesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of employee_ titleses
    * @param end the upper bound of the range of employee_ titleses (not inclusive)
    * @return the range of employee_ titleses
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<vn.com.ecopharma.hrm.model.Employee_Titles> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
    }

    /**
    * Returns an ordered range of all the employee_ titleses.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.com.ecopharma.hrm.model.impl.Employee_TitlesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of employee_ titleses
    * @param end the upper bound of the range of employee_ titleses (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of employee_ titleses
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<vn.com.ecopharma.hrm.model.Employee_Titles> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the employee_ titleses from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of employee_ titleses.
    *
    * @return the number of employee_ titleses
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    public static Employee_TitlesPersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (Employee_TitlesPersistence) PortletBeanLocatorUtil.locate(vn.com.ecopharma.hrm.service.ClpSerializer.getServletContextName(),
                    Employee_TitlesPersistence.class.getName());

            ReferenceRegistry.registerReference(Employee_TitlesUtil.class,
                "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setPersistence(Employee_TitlesPersistence persistence) {
    }
}
