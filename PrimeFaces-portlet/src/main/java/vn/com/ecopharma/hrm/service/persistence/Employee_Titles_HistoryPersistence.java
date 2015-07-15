package vn.com.ecopharma.hrm.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import vn.com.ecopharma.hrm.model.Employee_Titles_History;

/**
 * The persistence interface for the employee_ titles_ history service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author tvt
 * @see Employee_Titles_HistoryPersistenceImpl
 * @see Employee_Titles_HistoryUtil
 * @generated
 */
public interface Employee_Titles_HistoryPersistence extends BasePersistence<Employee_Titles_History> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link Employee_Titles_HistoryUtil} to access the employee_ titles_ history persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Caches the employee_ titles_ history in the entity cache if it is enabled.
    *
    * @param employee_Titles_History the employee_ titles_ history
    */
    public void cacheResult(
        vn.com.ecopharma.hrm.model.Employee_Titles_History employee_Titles_History);

    /**
    * Caches the employee_ titles_ histories in the entity cache if it is enabled.
    *
    * @param employee_Titles_Histories the employee_ titles_ histories
    */
    public void cacheResult(
        java.util.List<vn.com.ecopharma.hrm.model.Employee_Titles_History> employee_Titles_Histories);

    /**
    * Creates a new employee_ titles_ history with the primary key. Does not add the employee_ titles_ history to the database.
    *
    * @param employee_Titles_HistoryId the primary key for the new employee_ titles_ history
    * @return the new employee_ titles_ history
    */
    public vn.com.ecopharma.hrm.model.Employee_Titles_History create(
        long employee_Titles_HistoryId);

    /**
    * Removes the employee_ titles_ history with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param employee_Titles_HistoryId the primary key of the employee_ titles_ history
    * @return the employee_ titles_ history that was removed
    * @throws vn.com.ecopharma.hrm.NoSuchEmployee_Titles_HistoryException if a employee_ titles_ history with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public vn.com.ecopharma.hrm.model.Employee_Titles_History remove(
        long employee_Titles_HistoryId)
        throws com.liferay.portal.kernel.exception.SystemException,
            vn.com.ecopharma.hrm.NoSuchEmployee_Titles_HistoryException;

    public vn.com.ecopharma.hrm.model.Employee_Titles_History updateImpl(
        vn.com.ecopharma.hrm.model.Employee_Titles_History employee_Titles_History)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the employee_ titles_ history with the primary key or throws a {@link vn.com.ecopharma.hrm.NoSuchEmployee_Titles_HistoryException} if it could not be found.
    *
    * @param employee_Titles_HistoryId the primary key of the employee_ titles_ history
    * @return the employee_ titles_ history
    * @throws vn.com.ecopharma.hrm.NoSuchEmployee_Titles_HistoryException if a employee_ titles_ history with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public vn.com.ecopharma.hrm.model.Employee_Titles_History findByPrimaryKey(
        long employee_Titles_HistoryId)
        throws com.liferay.portal.kernel.exception.SystemException,
            vn.com.ecopharma.hrm.NoSuchEmployee_Titles_HistoryException;

    /**
    * Returns the employee_ titles_ history with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param employee_Titles_HistoryId the primary key of the employee_ titles_ history
    * @return the employee_ titles_ history, or <code>null</code> if a employee_ titles_ history with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public vn.com.ecopharma.hrm.model.Employee_Titles_History fetchByPrimaryKey(
        long employee_Titles_HistoryId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the employee_ titles_ histories.
    *
    * @return the employee_ titles_ histories
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<vn.com.ecopharma.hrm.model.Employee_Titles_History> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<vn.com.ecopharma.hrm.model.Employee_Titles_History> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<vn.com.ecopharma.hrm.model.Employee_Titles_History> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the employee_ titles_ histories from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of employee_ titles_ histories.
    *
    * @return the number of employee_ titles_ histories
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}
