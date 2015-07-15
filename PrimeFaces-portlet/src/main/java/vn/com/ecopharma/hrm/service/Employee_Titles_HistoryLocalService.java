package vn.com.ecopharma.hrm.service;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.transaction.Isolation;
import com.liferay.portal.kernel.transaction.Propagation;
import com.liferay.portal.kernel.transaction.Transactional;
import com.liferay.portal.service.BaseLocalService;
import com.liferay.portal.service.InvokableLocalService;
import com.liferay.portal.service.PersistedModelLocalService;

/**
 * Provides the local service interface for Employee_Titles_History. Methods of this
 * service will not have security checks based on the propagated JAAS
 * credentials because this service can only be accessed from within the same
 * VM.
 *
 * @author tvt
 * @see Employee_Titles_HistoryLocalServiceUtil
 * @see vn.com.ecopharma.hrm.service.base.Employee_Titles_HistoryLocalServiceBaseImpl
 * @see vn.com.ecopharma.hrm.service.impl.Employee_Titles_HistoryLocalServiceImpl
 * @generated
 */
@Transactional(isolation = Isolation.PORTAL, rollbackFor =  {
    PortalException.class, SystemException.class}
)
public interface Employee_Titles_HistoryLocalService extends BaseLocalService,
    InvokableLocalService, PersistedModelLocalService {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link Employee_Titles_HistoryLocalServiceUtil} to access the employee_ titles_ history local service. Add custom service methods to {@link vn.com.ecopharma.hrm.service.impl.Employee_Titles_HistoryLocalServiceImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
     */

    /**
    * Adds the employee_ titles_ history to the database. Also notifies the appropriate model listeners.
    *
    * @param employee_Titles_History the employee_ titles_ history
    * @return the employee_ titles_ history that was added
    * @throws SystemException if a system exception occurred
    */
    @com.liferay.portal.kernel.search.Indexable(type = IndexableType.REINDEX)
    public vn.com.ecopharma.hrm.model.Employee_Titles_History addEmployee_Titles_History(
        vn.com.ecopharma.hrm.model.Employee_Titles_History employee_Titles_History)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Creates a new employee_ titles_ history with the primary key. Does not add the employee_ titles_ history to the database.
    *
    * @param employee_Titles_HistoryId the primary key for the new employee_ titles_ history
    * @return the new employee_ titles_ history
    */
    public vn.com.ecopharma.hrm.model.Employee_Titles_History createEmployee_Titles_History(
        long employee_Titles_HistoryId);

    /**
    * Deletes the employee_ titles_ history with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param employee_Titles_HistoryId the primary key of the employee_ titles_ history
    * @return the employee_ titles_ history that was removed
    * @throws PortalException if a employee_ titles_ history with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @com.liferay.portal.kernel.search.Indexable(type = IndexableType.DELETE)
    public vn.com.ecopharma.hrm.model.Employee_Titles_History deleteEmployee_Titles_History(
        long employee_Titles_HistoryId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Deletes the employee_ titles_ history from the database. Also notifies the appropriate model listeners.
    *
    * @param employee_Titles_History the employee_ titles_ history
    * @return the employee_ titles_ history that was removed
    * @throws SystemException if a system exception occurred
    */
    @com.liferay.portal.kernel.search.Indexable(type = IndexableType.DELETE)
    public vn.com.ecopharma.hrm.model.Employee_Titles_History deleteEmployee_Titles_History(
        vn.com.ecopharma.hrm.model.Employee_Titles_History employee_Titles_History)
        throws com.liferay.portal.kernel.exception.SystemException;

    public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery();

    /**
    * Performs a dynamic query on the database and returns the matching rows.
    *
    * @param dynamicQuery the dynamic query
    * @return the matching rows
    * @throws SystemException if a system exception occurred
    */
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Performs a dynamic query on the database and returns a range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.com.ecopharma.hrm.model.impl.Employee_Titles_HistoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param dynamicQuery the dynamic query
    * @param start the lower bound of the range of model instances
    * @param end the upper bound of the range of model instances (not inclusive)
    * @return the range of matching rows
    * @throws SystemException if a system exception occurred
    */
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Performs a dynamic query on the database and returns an ordered range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.com.ecopharma.hrm.model.impl.Employee_Titles_HistoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param dynamicQuery the dynamic query
    * @param start the lower bound of the range of model instances
    * @param end the upper bound of the range of model instances (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching rows
    * @throws SystemException if a system exception occurred
    */
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    public long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @param projection the projection to apply to the query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    public long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
        com.liferay.portal.kernel.dao.orm.Projection projection)
        throws com.liferay.portal.kernel.exception.SystemException;

    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public vn.com.ecopharma.hrm.model.Employee_Titles_History fetchEmployee_Titles_History(
        long employee_Titles_HistoryId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the employee_ titles_ history with the primary key.
    *
    * @param employee_Titles_HistoryId the primary key of the employee_ titles_ history
    * @return the employee_ titles_ history
    * @throws PortalException if a employee_ titles_ history with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public vn.com.ecopharma.hrm.model.Employee_Titles_History getEmployee_Titles_History(
        long employee_Titles_HistoryId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException;

    @Override
    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException;

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
    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public java.util.List<vn.com.ecopharma.hrm.model.Employee_Titles_History> getEmployee_Titles_Histories(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of employee_ titles_ histories.
    *
    * @return the number of employee_ titles_ histories
    * @throws SystemException if a system exception occurred
    */
    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public int getEmployee_Titles_HistoriesCount()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Updates the employee_ titles_ history in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param employee_Titles_History the employee_ titles_ history
    * @return the employee_ titles_ history that was updated
    * @throws SystemException if a system exception occurred
    */
    @com.liferay.portal.kernel.search.Indexable(type = IndexableType.REINDEX)
    public vn.com.ecopharma.hrm.model.Employee_Titles_History updateEmployee_Titles_History(
        vn.com.ecopharma.hrm.model.Employee_Titles_History employee_Titles_History)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    public java.lang.String getBeanIdentifier();

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    public void setBeanIdentifier(java.lang.String beanIdentifier);

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable;

    public java.util.List<vn.com.ecopharma.hrm.model.Employee_Titles_History> findAll();

    public java.util.List<vn.com.ecopharma.hrm.model.Employee_Titles_History> findAll(
        int start, int end);

    public java.util.List<vn.com.ecopharma.hrm.model.Employee_Titles_History> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator);

    public vn.com.ecopharma.hrm.model.Employee_Titles_History addEmployee_Titles_History(
        long employeeId, long titlesId, java.lang.String note,
        java.util.Date set_date,
        com.liferay.portal.service.ServiceContext serviceContext)
        throws com.liferay.portal.kernel.exception.SystemException;
}
