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
 * Provides the local service interface for Employee. Methods of this
 * service will not have security checks based on the propagated JAAS
 * credentials because this service can only be accessed from within the same
 * VM.
 *
 * @author tvt
 * @see EmployeeLocalServiceUtil
 * @see vn.com.ecopharma.hrm.service.base.EmployeeLocalServiceBaseImpl
 * @see vn.com.ecopharma.hrm.service.impl.EmployeeLocalServiceImpl
 * @generated
 */
@Transactional(isolation = Isolation.PORTAL, rollbackFor =  {
    PortalException.class, SystemException.class}
)
public interface EmployeeLocalService extends BaseLocalService,
    InvokableLocalService, PersistedModelLocalService {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link EmployeeLocalServiceUtil} to access the employee local service. Add custom service methods to {@link vn.com.ecopharma.hrm.service.impl.EmployeeLocalServiceImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
     */

    /**
    * Adds the employee to the database. Also notifies the appropriate model listeners.
    *
    * @param employee the employee
    * @return the employee that was added
    * @throws SystemException if a system exception occurred
    */
    @com.liferay.portal.kernel.search.Indexable(type = IndexableType.REINDEX)
    public vn.com.ecopharma.hrm.model.Employee addEmployee(
        vn.com.ecopharma.hrm.model.Employee employee)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Creates a new employee with the primary key. Does not add the employee to the database.
    *
    * @param employeeId the primary key for the new employee
    * @return the new employee
    */
    public vn.com.ecopharma.hrm.model.Employee createEmployee(long employeeId);

    /**
    * Deletes the employee with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param employeeId the primary key of the employee
    * @return the employee that was removed
    * @throws PortalException if a employee with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @com.liferay.portal.kernel.search.Indexable(type = IndexableType.DELETE)
    public vn.com.ecopharma.hrm.model.Employee deleteEmployee(long employeeId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Deletes the employee from the database. Also notifies the appropriate model listeners.
    *
    * @param employee the employee
    * @return the employee that was removed
    * @throws SystemException if a system exception occurred
    */
    @com.liferay.portal.kernel.search.Indexable(type = IndexableType.DELETE)
    public vn.com.ecopharma.hrm.model.Employee deleteEmployee(
        vn.com.ecopharma.hrm.model.Employee employee)
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
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.com.ecopharma.hrm.model.impl.EmployeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.com.ecopharma.hrm.model.impl.EmployeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
    public vn.com.ecopharma.hrm.model.Employee fetchEmployee(long employeeId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the employee with the primary key.
    *
    * @param employeeId the primary key of the employee
    * @return the employee
    * @throws PortalException if a employee with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public vn.com.ecopharma.hrm.model.Employee getEmployee(long employeeId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException;

    @Override
    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the employees.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.com.ecopharma.hrm.model.impl.EmployeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of employees
    * @param end the upper bound of the range of employees (not inclusive)
    * @return the range of employees
    * @throws SystemException if a system exception occurred
    */
    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public java.util.List<vn.com.ecopharma.hrm.model.Employee> getEmployees(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of employees.
    *
    * @return the number of employees
    * @throws SystemException if a system exception occurred
    */
    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public int getEmployeesCount()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Updates the employee in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param employee the employee
    * @return the employee that was updated
    * @throws SystemException if a system exception occurred
    */
    @com.liferay.portal.kernel.search.Indexable(type = IndexableType.REINDEX)
    public vn.com.ecopharma.hrm.model.Employee updateEmployee(
        vn.com.ecopharma.hrm.model.Employee employee)
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

    public void indexAllEmployees();

    public void removeAllEmployeeIndexes(
        com.liferay.portal.kernel.search.SearchContext searchContext,
        long companyId);

    public int countAllIndexedEmployeeDocuments(
        com.liferay.portal.kernel.search.SearchContext searchContext,
        long companyId);

    public int countAllUnDeletedIndexedEmployeeDocuments(
        com.liferay.portal.kernel.search.SearchContext searchContext,
        java.util.List<com.liferay.portal.kernel.search.Query> filterQueries,
        long companyId, com.liferay.portal.kernel.search.Sort sort);

    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public java.util.List<vn.com.taotv.primefaces.modelView.item.EmployeeIndexedItem> searchAllUnDeletedEmployeeIndexedItems(
        com.liferay.portal.kernel.search.SearchContext searchContext,
        java.util.List<com.liferay.portal.kernel.search.Query> filterQueries,
        long companyId, com.liferay.portal.kernel.search.Sort sort, int start,
        int end);

    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public java.util.List<vn.com.taotv.primefaces.modelView.item.EmployeeIndexedItem> searchAllEmployeeIndexedItems(
        com.liferay.portal.kernel.search.SearchContext searchContext,
        long companyId);

    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public java.util.List<vn.com.taotv.primefaces.modelView.item.EmployeeIndexedItem> searchAllEmployeeIndexedItems(
        com.liferay.portal.kernel.search.SearchContext searchContext,
        java.util.List<com.liferay.portal.kernel.search.Query> filterQueries,
        long companyId, int start, int end);

    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public java.util.List<vn.com.taotv.primefaces.modelView.item.EmployeeIndexedItem> searchAllEmployeeIndexedItems(
        com.liferay.portal.kernel.search.SearchContext searchContext,
        java.util.List<com.liferay.portal.kernel.search.Query> filterQueries,
        long companyId, com.liferay.portal.kernel.search.Sort sort, int start,
        int end);

    public java.util.List<vn.com.ecopharma.hrm.model.Employee> findAll();

    public java.util.List<vn.com.ecopharma.hrm.model.Employee> findAll(
        int start, int end);

    public java.util.List<vn.com.ecopharma.hrm.model.Employee> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator);

    public java.util.List<vn.com.ecopharma.hrm.model.Employee> filterEmployees(
        java.lang.String globStr, java.lang.String fullName,
        java.lang.String emp_code, java.lang.String gender,
        java.lang.String contact_number, java.lang.String joined_date_from,
        java.lang.String joined_date_to,
        java.util.List<java.lang.String> jobTitles, java.lang.Long subUnitId,
        java.lang.String promoted_date_from, java.lang.String promoted_date_to,
        int start, int end, boolean isDeleted, java.lang.String sortField,
        java.lang.String sortOrder);

    public vn.com.ecopharma.hrm.model.Employee addEmployee(long creatorUserId,
        long companyId, boolean autoPassword, java.lang.String password1,
        java.lang.String password2, boolean autoScreenName,
        java.lang.String screenName, java.lang.String emailAddress,
        long facebookId, java.lang.String openId, java.util.Locale locale,
        java.lang.String firstName, java.lang.String middleName,
        java.lang.String lastName, int prefixId, int suffixId, boolean male,
        int birthdayMonth, int birthdayDay, int birthdayYear, long[] groupIds,
        long[] organizationIds, long[] roleIds, long[] userGroupIds,
        boolean sendEmail, java.lang.String emp_code,
        java.lang.String contact_number, long jobtitleId,
        java.util.Date joined_date, long subUnitId, long titles_id,
        long level_id, java.util.Date promoted_date,
        java.util.Date labour_contract_signed_date,
        java.util.Date labour_contract_expired_date,
        java.lang.String labour_contract_type, java.lang.String gender,
        java.lang.String place_of_birth, java.lang.String education,
        java.lang.String education_specialize, long universityId,
        java.lang.String marital_status, java.lang.String identityCardNo,
        java.util.Date issued_date, java.lang.String issued_place,
        long addressId, java.lang.String company_email,
        java.lang.String personal_tax_code, int number_of_dependents,
        java.lang.String dependent_names, java.lang.String social_insurance_no,
        java.lang.String health_insurance_no, java.lang.String bank_account_no,
        java.lang.String bank_branch_name, double base_wage_rates,
        double position_wage_rates, double capacity_salary,
        double total_salary, double bonus, java.util.Date resigned_date,
        long emp_userId,
        com.liferay.portal.service.ServiceContext serviceContext)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException;

    public vn.com.ecopharma.hrm.model.Employee addEmployee(
        vn.com.ecopharma.hrm.model.Employee e, long creatorUserId,
        long companyId, boolean autoPassword, java.lang.String password1,
        java.lang.String password2, boolean autoScreenName,
        java.lang.String screenName, java.lang.String emailAddress,
        long facebookId, java.lang.String openId, java.util.Locale locale,
        java.lang.String firstName, java.lang.String middleName,
        java.lang.String lastName, int prefixId, int suffixId, boolean male,
        int birthdayMonth, int birthdayDay, int birthdayYear, long[] groupIds,
        long[] organizationIds, long[] roleIds, long[] userGroupIds,
        boolean sendEmail, long emp_userId,
        java.util.List<vn.com.taotv.primefaces.modelView.item.AddressObjectItem> addresses,
        com.liferay.portal.service.ServiceContext serviceContext)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException;

    public vn.com.ecopharma.hrm.model.Employee update(
        vn.com.ecopharma.hrm.model.Employee employee,
        com.liferay.portal.model.User user,
        vn.com.ecopharma.hrm.model.JTitle jTitle,
        vn.com.ecopharma.hrm.model.SubUnit subUnit,
        vn.com.ecopharma.hrm.model.Titles titles,
        vn.com.ecopharma.hrm.model.Level level,
        vn.com.ecopharma.hrm.model.University university,
        java.util.List<vn.com.taotv.primefaces.modelView.item.AddressObjectItem> addresses,
        com.liferay.portal.service.ServiceContext serviceContext)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException;

    public vn.com.ecopharma.hrm.model.Employee markDeletedEmployee(
        vn.com.ecopharma.hrm.model.Employee employee)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.liferay.portal.kernel.search.SearchException;

    public vn.com.ecopharma.hrm.model.Employee markDeletedEmployee(
        long employeeId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException;

    public int countAll();
}
