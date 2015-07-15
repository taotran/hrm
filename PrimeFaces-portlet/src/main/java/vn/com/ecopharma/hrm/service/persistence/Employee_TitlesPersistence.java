package vn.com.ecopharma.hrm.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import vn.com.ecopharma.hrm.model.Employee_Titles;

/**
 * The persistence interface for the employee_ titles service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author tvt
 * @see Employee_TitlesPersistenceImpl
 * @see Employee_TitlesUtil
 * @generated
 */
public interface Employee_TitlesPersistence extends BasePersistence<Employee_Titles> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link Employee_TitlesUtil} to access the employee_ titles persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Caches the employee_ titles in the entity cache if it is enabled.
    *
    * @param employee_Titles the employee_ titles
    */
    public void cacheResult(
        vn.com.ecopharma.hrm.model.Employee_Titles employee_Titles);

    /**
    * Caches the employee_ titleses in the entity cache if it is enabled.
    *
    * @param employee_Titleses the employee_ titleses
    */
    public void cacheResult(
        java.util.List<vn.com.ecopharma.hrm.model.Employee_Titles> employee_Titleses);

    /**
    * Creates a new employee_ titles with the primary key. Does not add the employee_ titles to the database.
    *
    * @param employee_TitlesId the primary key for the new employee_ titles
    * @return the new employee_ titles
    */
    public vn.com.ecopharma.hrm.model.Employee_Titles create(
        long employee_TitlesId);

    /**
    * Removes the employee_ titles with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param employee_TitlesId the primary key of the employee_ titles
    * @return the employee_ titles that was removed
    * @throws vn.com.ecopharma.hrm.NoSuchEmployee_TitlesException if a employee_ titles with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public vn.com.ecopharma.hrm.model.Employee_Titles remove(
        long employee_TitlesId)
        throws com.liferay.portal.kernel.exception.SystemException,
            vn.com.ecopharma.hrm.NoSuchEmployee_TitlesException;

    public vn.com.ecopharma.hrm.model.Employee_Titles updateImpl(
        vn.com.ecopharma.hrm.model.Employee_Titles employee_Titles)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the employee_ titles with the primary key or throws a {@link vn.com.ecopharma.hrm.NoSuchEmployee_TitlesException} if it could not be found.
    *
    * @param employee_TitlesId the primary key of the employee_ titles
    * @return the employee_ titles
    * @throws vn.com.ecopharma.hrm.NoSuchEmployee_TitlesException if a employee_ titles with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public vn.com.ecopharma.hrm.model.Employee_Titles findByPrimaryKey(
        long employee_TitlesId)
        throws com.liferay.portal.kernel.exception.SystemException,
            vn.com.ecopharma.hrm.NoSuchEmployee_TitlesException;

    /**
    * Returns the employee_ titles with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param employee_TitlesId the primary key of the employee_ titles
    * @return the employee_ titles, or <code>null</code> if a employee_ titles with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public vn.com.ecopharma.hrm.model.Employee_Titles fetchByPrimaryKey(
        long employee_TitlesId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the employee_ titleses.
    *
    * @return the employee_ titleses
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<vn.com.ecopharma.hrm.model.Employee_Titles> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<vn.com.ecopharma.hrm.model.Employee_Titles> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<vn.com.ecopharma.hrm.model.Employee_Titles> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the employee_ titleses from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of employee_ titleses.
    *
    * @return the number of employee_ titleses
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}
