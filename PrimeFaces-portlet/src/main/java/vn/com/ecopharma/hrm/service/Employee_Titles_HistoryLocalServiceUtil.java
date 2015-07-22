package vn.com.ecopharma.hrm.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * Provides the local service utility for Employee_Titles_History. This utility wraps
 * {@link vn.com.ecopharma.hrm.service.impl.Employee_Titles_HistoryLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author tvt
 * @see Employee_Titles_HistoryLocalService
 * @see vn.com.ecopharma.hrm.service.base.Employee_Titles_HistoryLocalServiceBaseImpl
 * @see vn.com.ecopharma.hrm.service.impl.Employee_Titles_HistoryLocalServiceImpl
 * @generated
 */
public class Employee_Titles_HistoryLocalServiceUtil {
    private static Employee_Titles_HistoryLocalService _service;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Add custom service methods to {@link vn.com.ecopharma.hrm.service.impl.Employee_Titles_HistoryLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
     */

    /**
    * Adds the employee_ titles_ history to the database. Also notifies the appropriate model listeners.
    *
    * @param employee_Titles_History the employee_ titles_ history
    * @return the employee_ titles_ history that was added
    * @throws SystemException if a system exception occurred
    */
    public static vn.com.ecopharma.hrm.model.Employee_Titles_History addEmployee_Titles_History(
        vn.com.ecopharma.hrm.model.Employee_Titles_History employee_Titles_History)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().addEmployee_Titles_History(employee_Titles_History);
    }

    /**
    * Creates a new employee_ titles_ history with the primary key. Does not add the employee_ titles_ history to the database.
    *
    * @param employee_Titles_HistoryId the primary key for the new employee_ titles_ history
    * @return the new employee_ titles_ history
    */
    public static vn.com.ecopharma.hrm.model.Employee_Titles_History createEmployee_Titles_History(
        long employee_Titles_HistoryId) {
        return getService()
                   .createEmployee_Titles_History(employee_Titles_HistoryId);
    }

    /**
    * Deletes the employee_ titles_ history with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param employee_Titles_HistoryId the primary key of the employee_ titles_ history
    * @return the employee_ titles_ history that was removed
    * @throws PortalException if a employee_ titles_ history with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static vn.com.ecopharma.hrm.model.Employee_Titles_History deleteEmployee_Titles_History(
        long employee_Titles_HistoryId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService()
                   .deleteEmployee_Titles_History(employee_Titles_HistoryId);
    }

    /**
    * Deletes the employee_ titles_ history from the database. Also notifies the appropriate model listeners.
    *
    * @param employee_Titles_History the employee_ titles_ history
    * @return the employee_ titles_ history that was removed
    * @throws SystemException if a system exception occurred
    */
    public static vn.com.ecopharma.hrm.model.Employee_Titles_History deleteEmployee_Titles_History(
        vn.com.ecopharma.hrm.model.Employee_Titles_History employee_Titles_History)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService()
                   .deleteEmployee_Titles_History(employee_Titles_History);
    }

    public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return getService().dynamicQuery();
    }

    /**
    * Performs a dynamic query on the database and returns the matching rows.
    *
    * @param dynamicQuery the dynamic query
    * @return the matching rows
    * @throws SystemException if a system exception occurred
    */
    @SuppressWarnings("rawtypes")
    public static java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().dynamicQuery(dynamicQuery);
    }

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
    public static java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException {
        return getService().dynamicQuery(dynamicQuery, start, end);
    }

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
    public static java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService()
                   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    public static long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().dynamicQueryCount(dynamicQuery);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @param projection the projection to apply to the query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    public static long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
        com.liferay.portal.kernel.dao.orm.Projection projection)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().dynamicQueryCount(dynamicQuery, projection);
    }

    public static vn.com.ecopharma.hrm.model.Employee_Titles_History fetchEmployee_Titles_History(
        long employee_Titles_HistoryId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService()
                   .fetchEmployee_Titles_History(employee_Titles_HistoryId);
    }

    /**
    * Returns the employee_ titles_ history with the primary key.
    *
    * @param employee_Titles_HistoryId the primary key of the employee_ titles_ history
    * @return the employee_ titles_ history
    * @throws PortalException if a employee_ titles_ history with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static vn.com.ecopharma.hrm.model.Employee_Titles_History getEmployee_Titles_History(
        long employee_Titles_HistoryId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getEmployee_Titles_History(employee_Titles_HistoryId);
    }

    public static com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getPersistedModel(primaryKeyObj);
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
    public static java.util.List<vn.com.ecopharma.hrm.model.Employee_Titles_History> getEmployee_Titles_Histories(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getEmployee_Titles_Histories(start, end);
    }

    /**
    * Returns the number of employee_ titles_ histories.
    *
    * @return the number of employee_ titles_ histories
    * @throws SystemException if a system exception occurred
    */
    public static int getEmployee_Titles_HistoriesCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getEmployee_Titles_HistoriesCount();
    }

    /**
    * Updates the employee_ titles_ history in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param employee_Titles_History the employee_ titles_ history
    * @return the employee_ titles_ history that was updated
    * @throws SystemException if a system exception occurred
    */
    public static vn.com.ecopharma.hrm.model.Employee_Titles_History updateEmployee_Titles_History(
        vn.com.ecopharma.hrm.model.Employee_Titles_History employee_Titles_History)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService()
                   .updateEmployee_Titles_History(employee_Titles_History);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    public static java.lang.String getBeanIdentifier() {
        return getService().getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    public static void setBeanIdentifier(java.lang.String beanIdentifier) {
        getService().setBeanIdentifier(beanIdentifier);
    }

    public static java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return getService().invokeMethod(name, parameterTypes, arguments);
    }

    public static java.util.List<vn.com.ecopharma.hrm.model.Employee_Titles_History> findAll() {
        return getService().findAll();
    }

    public static java.util.List<vn.com.ecopharma.hrm.model.Employee_Titles_History> findAll(
        int start, int end) {
        return getService().findAll(start, end);
    }

    public static java.util.List<vn.com.ecopharma.hrm.model.Employee_Titles_History> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator) {
        return getService().findAll(start, end, orderByComparator);
    }

    public static vn.com.ecopharma.hrm.model.Employee_Titles_History addEmployee_Titles_History(
        long employeeId, long titlesId, java.lang.String note,
        java.util.Date set_date,
        com.liferay.portal.service.ServiceContext serviceContext)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService()
                   .addEmployee_Titles_History(employeeId, titlesId, note,
            set_date, serviceContext);
    }

    public static void clearService() {
        _service = null;
    }

    public static Employee_Titles_HistoryLocalService getService() {
        if (_service == null) {
            InvokableLocalService invokableLocalService = (InvokableLocalService) PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
                    Employee_Titles_HistoryLocalService.class.getName());

            if (invokableLocalService instanceof Employee_Titles_HistoryLocalService) {
                _service = (Employee_Titles_HistoryLocalService) invokableLocalService;
            } else {
                _service = new Employee_Titles_HistoryLocalServiceClp(invokableLocalService);
            }

            ReferenceRegistry.registerReference(Employee_Titles_HistoryLocalServiceUtil.class,
                "_service");
        }

        return _service;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setService(Employee_Titles_HistoryLocalService service) {
    }
}
