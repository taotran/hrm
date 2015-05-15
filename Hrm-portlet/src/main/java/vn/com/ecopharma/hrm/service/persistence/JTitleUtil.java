package vn.com.ecopharma.hrm.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import vn.com.ecopharma.hrm.model.JTitle;

import java.util.List;

/**
 * The persistence utility for the j title service. This utility wraps {@link JTitlePersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author tvt
 * @see JTitlePersistence
 * @see JTitlePersistenceImpl
 * @generated
 */
public class JTitleUtil {
    private static JTitlePersistence _persistence;

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
    public static void clearCache(JTitle jTitle) {
        getPersistence().clearCache(jTitle);
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
    public static List<JTitle> findWithDynamicQuery(DynamicQuery dynamicQuery)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<JTitle> findWithDynamicQuery(DynamicQuery dynamicQuery,
        int start, int end) throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<JTitle> findWithDynamicQuery(DynamicQuery dynamicQuery,
        int start, int end, OrderByComparator orderByComparator)
        throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
     */
    public static JTitle update(JTitle jTitle) throws SystemException {
        return getPersistence().update(jTitle);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
     */
    public static JTitle update(JTitle jTitle, ServiceContext serviceContext)
        throws SystemException {
        return getPersistence().update(jTitle, serviceContext);
    }

    /**
    * Caches the j title in the entity cache if it is enabled.
    *
    * @param jTitle the j title
    */
    public static void cacheResult(vn.com.ecopharma.hrm.model.JTitle jTitle) {
        getPersistence().cacheResult(jTitle);
    }

    /**
    * Caches the j titles in the entity cache if it is enabled.
    *
    * @param jTitles the j titles
    */
    public static void cacheResult(
        java.util.List<vn.com.ecopharma.hrm.model.JTitle> jTitles) {
        getPersistence().cacheResult(jTitles);
    }

    /**
    * Creates a new j title with the primary key. Does not add the j title to the database.
    *
    * @param jobtitleId the primary key for the new j title
    * @return the new j title
    */
    public static vn.com.ecopharma.hrm.model.JTitle create(long jobtitleId) {
        return getPersistence().create(jobtitleId);
    }

    /**
    * Removes the j title with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param jobtitleId the primary key of the j title
    * @return the j title that was removed
    * @throws vn.com.ecopharma.hrm.NoSuchJTitleException if a j title with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static vn.com.ecopharma.hrm.model.JTitle remove(long jobtitleId)
        throws com.liferay.portal.kernel.exception.SystemException,
            vn.com.ecopharma.hrm.NoSuchJTitleException {
        return getPersistence().remove(jobtitleId);
    }

    public static vn.com.ecopharma.hrm.model.JTitle updateImpl(
        vn.com.ecopharma.hrm.model.JTitle jTitle)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(jTitle);
    }

    /**
    * Returns the j title with the primary key or throws a {@link vn.com.ecopharma.hrm.NoSuchJTitleException} if it could not be found.
    *
    * @param jobtitleId the primary key of the j title
    * @return the j title
    * @throws vn.com.ecopharma.hrm.NoSuchJTitleException if a j title with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static vn.com.ecopharma.hrm.model.JTitle findByPrimaryKey(
        long jobtitleId)
        throws com.liferay.portal.kernel.exception.SystemException,
            vn.com.ecopharma.hrm.NoSuchJTitleException {
        return getPersistence().findByPrimaryKey(jobtitleId);
    }

    /**
    * Returns the j title with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param jobtitleId the primary key of the j title
    * @return the j title, or <code>null</code> if a j title with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static vn.com.ecopharma.hrm.model.JTitle fetchByPrimaryKey(
        long jobtitleId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(jobtitleId);
    }

    /**
    * Returns all the j titles.
    *
    * @return the j titles
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<vn.com.ecopharma.hrm.model.JTitle> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
    }

    /**
    * Returns a range of all the j titles.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.com.ecopharma.hrm.model.impl.JTitleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of j titles
    * @param end the upper bound of the range of j titles (not inclusive)
    * @return the range of j titles
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<vn.com.ecopharma.hrm.model.JTitle> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
    }

    /**
    * Returns an ordered range of all the j titles.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.com.ecopharma.hrm.model.impl.JTitleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of j titles
    * @param end the upper bound of the range of j titles (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of j titles
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<vn.com.ecopharma.hrm.model.JTitle> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the j titles from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of j titles.
    *
    * @return the number of j titles
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    public static JTitlePersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (JTitlePersistence) PortletBeanLocatorUtil.locate(vn.com.ecopharma.hrm.service.ClpSerializer.getServletContextName(),
                    JTitlePersistence.class.getName());

            ReferenceRegistry.registerReference(JTitleUtil.class, "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setPersistence(JTitlePersistence persistence) {
    }
}
