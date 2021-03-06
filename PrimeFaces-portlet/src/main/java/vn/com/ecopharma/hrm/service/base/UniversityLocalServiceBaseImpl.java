package vn.com.ecopharma.hrm.service.base;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.bean.IdentifiableBean;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.model.PersistedModel;
import com.liferay.portal.service.BaseLocalServiceImpl;
import com.liferay.portal.service.PersistedModelLocalServiceRegistryUtil;
import com.liferay.portal.service.persistence.UserPersistence;

import vn.com.ecopharma.hrm.model.University;
import vn.com.ecopharma.hrm.service.UniversityLocalService;
import vn.com.ecopharma.hrm.service.persistence.CandidatePersistence;
import vn.com.ecopharma.hrm.service.persistence.DistrictPersistence;
import vn.com.ecopharma.hrm.service.persistence.EmployeeFinder;
import vn.com.ecopharma.hrm.service.persistence.EmployeePersistence;
import vn.com.ecopharma.hrm.service.persistence.Employee_Titles_HistoryPersistence;
import vn.com.ecopharma.hrm.service.persistence.JTitlePersistence;
import vn.com.ecopharma.hrm.service.persistence.LevelPersistence;
import vn.com.ecopharma.hrm.service.persistence.SubUnitPersistence;
import vn.com.ecopharma.hrm.service.persistence.TitlesPersistence;
import vn.com.ecopharma.hrm.service.persistence.UniversityPersistence;

import java.io.Serializable;

import java.util.List;

import javax.sql.DataSource;

/**
 * Provides the base implementation for the university local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link vn.com.ecopharma.hrm.service.impl.UniversityLocalServiceImpl}.
 * </p>
 *
 * @author tvt
 * @see vn.com.ecopharma.hrm.service.impl.UniversityLocalServiceImpl
 * @see vn.com.ecopharma.hrm.service.UniversityLocalServiceUtil
 * @generated
 */
public abstract class UniversityLocalServiceBaseImpl
    extends BaseLocalServiceImpl implements UniversityLocalService,
        IdentifiableBean {
    @BeanReference(type = vn.com.ecopharma.hrm.service.CandidateLocalService.class)
    protected vn.com.ecopharma.hrm.service.CandidateLocalService candidateLocalService;
    @BeanReference(type = vn.com.ecopharma.hrm.service.CandidateService.class)
    protected vn.com.ecopharma.hrm.service.CandidateService candidateService;
    @BeanReference(type = CandidatePersistence.class)
    protected CandidatePersistence candidatePersistence;
    @BeanReference(type = vn.com.ecopharma.hrm.service.DistrictLocalService.class)
    protected vn.com.ecopharma.hrm.service.DistrictLocalService districtLocalService;
    @BeanReference(type = vn.com.ecopharma.hrm.service.DistrictService.class)
    protected vn.com.ecopharma.hrm.service.DistrictService districtService;
    @BeanReference(type = DistrictPersistence.class)
    protected DistrictPersistence districtPersistence;
    @BeanReference(type = vn.com.ecopharma.hrm.service.EmployeeLocalService.class)
    protected vn.com.ecopharma.hrm.service.EmployeeLocalService employeeLocalService;
    @BeanReference(type = vn.com.ecopharma.hrm.service.EmployeeService.class)
    protected vn.com.ecopharma.hrm.service.EmployeeService employeeService;
    @BeanReference(type = EmployeePersistence.class)
    protected EmployeePersistence employeePersistence;
    @BeanReference(type = EmployeeFinder.class)
    protected EmployeeFinder employeeFinder;
    @BeanReference(type = vn.com.ecopharma.hrm.service.Employee_Titles_HistoryLocalService.class)
    protected vn.com.ecopharma.hrm.service.Employee_Titles_HistoryLocalService employee_Titles_HistoryLocalService;
    @BeanReference(type = vn.com.ecopharma.hrm.service.Employee_Titles_HistoryService.class)
    protected vn.com.ecopharma.hrm.service.Employee_Titles_HistoryService employee_Titles_HistoryService;
    @BeanReference(type = Employee_Titles_HistoryPersistence.class)
    protected Employee_Titles_HistoryPersistence employee_Titles_HistoryPersistence;
    @BeanReference(type = vn.com.ecopharma.hrm.service.JTitleLocalService.class)
    protected vn.com.ecopharma.hrm.service.JTitleLocalService jTitleLocalService;
    @BeanReference(type = vn.com.ecopharma.hrm.service.JTitleService.class)
    protected vn.com.ecopharma.hrm.service.JTitleService jTitleService;
    @BeanReference(type = JTitlePersistence.class)
    protected JTitlePersistence jTitlePersistence;
    @BeanReference(type = vn.com.ecopharma.hrm.service.LevelLocalService.class)
    protected vn.com.ecopharma.hrm.service.LevelLocalService levelLocalService;
    @BeanReference(type = vn.com.ecopharma.hrm.service.LevelService.class)
    protected vn.com.ecopharma.hrm.service.LevelService levelService;
    @BeanReference(type = LevelPersistence.class)
    protected LevelPersistence levelPersistence;
    @BeanReference(type = vn.com.ecopharma.hrm.service.SubUnitLocalService.class)
    protected vn.com.ecopharma.hrm.service.SubUnitLocalService subUnitLocalService;
    @BeanReference(type = vn.com.ecopharma.hrm.service.SubUnitService.class)
    protected vn.com.ecopharma.hrm.service.SubUnitService subUnitService;
    @BeanReference(type = SubUnitPersistence.class)
    protected SubUnitPersistence subUnitPersistence;
    @BeanReference(type = vn.com.ecopharma.hrm.service.TitlesLocalService.class)
    protected vn.com.ecopharma.hrm.service.TitlesLocalService titlesLocalService;
    @BeanReference(type = vn.com.ecopharma.hrm.service.TitlesService.class)
    protected vn.com.ecopharma.hrm.service.TitlesService titlesService;
    @BeanReference(type = TitlesPersistence.class)
    protected TitlesPersistence titlesPersistence;
    @BeanReference(type = vn.com.ecopharma.hrm.service.UniversityLocalService.class)
    protected vn.com.ecopharma.hrm.service.UniversityLocalService universityLocalService;
    @BeanReference(type = vn.com.ecopharma.hrm.service.UniversityService.class)
    protected vn.com.ecopharma.hrm.service.UniversityService universityService;
    @BeanReference(type = UniversityPersistence.class)
    protected UniversityPersistence universityPersistence;
    @BeanReference(type = com.liferay.counter.service.CounterLocalService.class)
    protected com.liferay.counter.service.CounterLocalService counterLocalService;
    @BeanReference(type = com.liferay.portal.service.ResourceLocalService.class)
    protected com.liferay.portal.service.ResourceLocalService resourceLocalService;
    @BeanReference(type = com.liferay.portal.service.UserLocalService.class)
    protected com.liferay.portal.service.UserLocalService userLocalService;
    @BeanReference(type = com.liferay.portal.service.UserService.class)
    protected com.liferay.portal.service.UserService userService;
    @BeanReference(type = UserPersistence.class)
    protected UserPersistence userPersistence;
    private String _beanIdentifier;
    private ClassLoader _classLoader;
    private UniversityLocalServiceClpInvoker _clpInvoker = new UniversityLocalServiceClpInvoker();

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link vn.com.ecopharma.hrm.service.UniversityLocalServiceUtil} to access the university local service.
     */

    /**
     * Adds the university to the database. Also notifies the appropriate model listeners.
     *
     * @param university the university
     * @return the university that was added
     * @throws SystemException if a system exception occurred
     */
    @Indexable(type = IndexableType.REINDEX)
    @Override
    public University addUniversity(University university)
        throws SystemException {
        university.setNew(true);

        return universityPersistence.update(university);
    }

    /**
     * Creates a new university with the primary key. Does not add the university to the database.
     *
     * @param universityId the primary key for the new university
     * @return the new university
     */
    @Override
    public University createUniversity(long universityId) {
        return universityPersistence.create(universityId);
    }

    /**
     * Deletes the university with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param universityId the primary key of the university
     * @return the university that was removed
     * @throws PortalException if a university with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Indexable(type = IndexableType.DELETE)
    @Override
    public University deleteUniversity(long universityId)
        throws PortalException, SystemException {
        return universityPersistence.remove(universityId);
    }

    /**
     * Deletes the university from the database. Also notifies the appropriate model listeners.
     *
     * @param university the university
     * @return the university that was removed
     * @throws SystemException if a system exception occurred
     */
    @Indexable(type = IndexableType.DELETE)
    @Override
    public University deleteUniversity(University university)
        throws SystemException {
        return universityPersistence.remove(university);
    }

    @Override
    public DynamicQuery dynamicQuery() {
        Class<?> clazz = getClass();

        return DynamicQueryFactoryUtil.forClass(University.class,
            clazz.getClassLoader());
    }

    /**
     * Performs a dynamic query on the database and returns the matching rows.
     *
     * @param dynamicQuery the dynamic query
     * @return the matching rows
     * @throws SystemException if a system exception occurred
     */
    @Override
    @SuppressWarnings("rawtypes")
    public List dynamicQuery(DynamicQuery dynamicQuery)
        throws SystemException {
        return universityPersistence.findWithDynamicQuery(dynamicQuery);
    }

    /**
     * Performs a dynamic query on the database and returns a range of the matching rows.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.com.ecopharma.hrm.model.impl.UniversityModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param dynamicQuery the dynamic query
     * @param start the lower bound of the range of model instances
     * @param end the upper bound of the range of model instances (not inclusive)
     * @return the range of matching rows
     * @throws SystemException if a system exception occurred
     */
    @Override
    @SuppressWarnings("rawtypes")
    public List dynamicQuery(DynamicQuery dynamicQuery, int start, int end)
        throws SystemException {
        return universityPersistence.findWithDynamicQuery(dynamicQuery, start,
            end);
    }

    /**
     * Performs a dynamic query on the database and returns an ordered range of the matching rows.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.com.ecopharma.hrm.model.impl.UniversityModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param dynamicQuery the dynamic query
     * @param start the lower bound of the range of model instances
     * @param end the upper bound of the range of model instances (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of matching rows
     * @throws SystemException if a system exception occurred
     */
    @Override
    @SuppressWarnings("rawtypes")
    public List dynamicQuery(DynamicQuery dynamicQuery, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        return universityPersistence.findWithDynamicQuery(dynamicQuery, start,
            end, orderByComparator);
    }

    /**
     * Returns the number of rows that match the dynamic query.
     *
     * @param dynamicQuery the dynamic query
     * @return the number of rows that match the dynamic query
     * @throws SystemException if a system exception occurred
     */
    @Override
    public long dynamicQueryCount(DynamicQuery dynamicQuery)
        throws SystemException {
        return universityPersistence.countWithDynamicQuery(dynamicQuery);
    }

    /**
     * Returns the number of rows that match the dynamic query.
     *
     * @param dynamicQuery the dynamic query
     * @param projection the projection to apply to the query
     * @return the number of rows that match the dynamic query
     * @throws SystemException if a system exception occurred
     */
    @Override
    public long dynamicQueryCount(DynamicQuery dynamicQuery,
        Projection projection) throws SystemException {
        return universityPersistence.countWithDynamicQuery(dynamicQuery,
            projection);
    }

    @Override
    public University fetchUniversity(long universityId)
        throws SystemException {
        return universityPersistence.fetchByPrimaryKey(universityId);
    }

    /**
     * Returns the university with the primary key.
     *
     * @param universityId the primary key of the university
     * @return the university
     * @throws PortalException if a university with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public University getUniversity(long universityId)
        throws PortalException, SystemException {
        return universityPersistence.findByPrimaryKey(universityId);
    }

    @Override
    public PersistedModel getPersistedModel(Serializable primaryKeyObj)
        throws PortalException, SystemException {
        return universityPersistence.findByPrimaryKey(primaryKeyObj);
    }

    /**
     * Returns a range of all the universities.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.com.ecopharma.hrm.model.impl.UniversityModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of universities
     * @param end the upper bound of the range of universities (not inclusive)
     * @return the range of universities
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<University> getUniversities(int start, int end)
        throws SystemException {
        return universityPersistence.findAll(start, end);
    }

    /**
     * Returns the number of universities.
     *
     * @return the number of universities
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int getUniversitiesCount() throws SystemException {
        return universityPersistence.countAll();
    }

    /**
     * Updates the university in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
     *
     * @param university the university
     * @return the university that was updated
     * @throws SystemException if a system exception occurred
     */
    @Indexable(type = IndexableType.REINDEX)
    @Override
    public University updateUniversity(University university)
        throws SystemException {
        return universityPersistence.update(university);
    }

    /**
     * Returns the candidate local service.
     *
     * @return the candidate local service
     */
    public vn.com.ecopharma.hrm.service.CandidateLocalService getCandidateLocalService() {
        return candidateLocalService;
    }

    /**
     * Sets the candidate local service.
     *
     * @param candidateLocalService the candidate local service
     */
    public void setCandidateLocalService(
        vn.com.ecopharma.hrm.service.CandidateLocalService candidateLocalService) {
        this.candidateLocalService = candidateLocalService;
    }

    /**
     * Returns the candidate remote service.
     *
     * @return the candidate remote service
     */
    public vn.com.ecopharma.hrm.service.CandidateService getCandidateService() {
        return candidateService;
    }

    /**
     * Sets the candidate remote service.
     *
     * @param candidateService the candidate remote service
     */
    public void setCandidateService(
        vn.com.ecopharma.hrm.service.CandidateService candidateService) {
        this.candidateService = candidateService;
    }

    /**
     * Returns the candidate persistence.
     *
     * @return the candidate persistence
     */
    public CandidatePersistence getCandidatePersistence() {
        return candidatePersistence;
    }

    /**
     * Sets the candidate persistence.
     *
     * @param candidatePersistence the candidate persistence
     */
    public void setCandidatePersistence(
        CandidatePersistence candidatePersistence) {
        this.candidatePersistence = candidatePersistence;
    }

    /**
     * Returns the district local service.
     *
     * @return the district local service
     */
    public vn.com.ecopharma.hrm.service.DistrictLocalService getDistrictLocalService() {
        return districtLocalService;
    }

    /**
     * Sets the district local service.
     *
     * @param districtLocalService the district local service
     */
    public void setDistrictLocalService(
        vn.com.ecopharma.hrm.service.DistrictLocalService districtLocalService) {
        this.districtLocalService = districtLocalService;
    }

    /**
     * Returns the district remote service.
     *
     * @return the district remote service
     */
    public vn.com.ecopharma.hrm.service.DistrictService getDistrictService() {
        return districtService;
    }

    /**
     * Sets the district remote service.
     *
     * @param districtService the district remote service
     */
    public void setDistrictService(
        vn.com.ecopharma.hrm.service.DistrictService districtService) {
        this.districtService = districtService;
    }

    /**
     * Returns the district persistence.
     *
     * @return the district persistence
     */
    public DistrictPersistence getDistrictPersistence() {
        return districtPersistence;
    }

    /**
     * Sets the district persistence.
     *
     * @param districtPersistence the district persistence
     */
    public void setDistrictPersistence(DistrictPersistence districtPersistence) {
        this.districtPersistence = districtPersistence;
    }

    /**
     * Returns the employee local service.
     *
     * @return the employee local service
     */
    public vn.com.ecopharma.hrm.service.EmployeeLocalService getEmployeeLocalService() {
        return employeeLocalService;
    }

    /**
     * Sets the employee local service.
     *
     * @param employeeLocalService the employee local service
     */
    public void setEmployeeLocalService(
        vn.com.ecopharma.hrm.service.EmployeeLocalService employeeLocalService) {
        this.employeeLocalService = employeeLocalService;
    }

    /**
     * Returns the employee remote service.
     *
     * @return the employee remote service
     */
    public vn.com.ecopharma.hrm.service.EmployeeService getEmployeeService() {
        return employeeService;
    }

    /**
     * Sets the employee remote service.
     *
     * @param employeeService the employee remote service
     */
    public void setEmployeeService(
        vn.com.ecopharma.hrm.service.EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    /**
     * Returns the employee persistence.
     *
     * @return the employee persistence
     */
    public EmployeePersistence getEmployeePersistence() {
        return employeePersistence;
    }

    /**
     * Sets the employee persistence.
     *
     * @param employeePersistence the employee persistence
     */
    public void setEmployeePersistence(EmployeePersistence employeePersistence) {
        this.employeePersistence = employeePersistence;
    }

    /**
     * Returns the employee finder.
     *
     * @return the employee finder
     */
    public EmployeeFinder getEmployeeFinder() {
        return employeeFinder;
    }

    /**
     * Sets the employee finder.
     *
     * @param employeeFinder the employee finder
     */
    public void setEmployeeFinder(EmployeeFinder employeeFinder) {
        this.employeeFinder = employeeFinder;
    }

    /**
     * Returns the employee_ titles_ history local service.
     *
     * @return the employee_ titles_ history local service
     */
    public vn.com.ecopharma.hrm.service.Employee_Titles_HistoryLocalService getEmployee_Titles_HistoryLocalService() {
        return employee_Titles_HistoryLocalService;
    }

    /**
     * Sets the employee_ titles_ history local service.
     *
     * @param employee_Titles_HistoryLocalService the employee_ titles_ history local service
     */
    public void setEmployee_Titles_HistoryLocalService(
        vn.com.ecopharma.hrm.service.Employee_Titles_HistoryLocalService employee_Titles_HistoryLocalService) {
        this.employee_Titles_HistoryLocalService = employee_Titles_HistoryLocalService;
    }

    /**
     * Returns the employee_ titles_ history remote service.
     *
     * @return the employee_ titles_ history remote service
     */
    public vn.com.ecopharma.hrm.service.Employee_Titles_HistoryService getEmployee_Titles_HistoryService() {
        return employee_Titles_HistoryService;
    }

    /**
     * Sets the employee_ titles_ history remote service.
     *
     * @param employee_Titles_HistoryService the employee_ titles_ history remote service
     */
    public void setEmployee_Titles_HistoryService(
        vn.com.ecopharma.hrm.service.Employee_Titles_HistoryService employee_Titles_HistoryService) {
        this.employee_Titles_HistoryService = employee_Titles_HistoryService;
    }

    /**
     * Returns the employee_ titles_ history persistence.
     *
     * @return the employee_ titles_ history persistence
     */
    public Employee_Titles_HistoryPersistence getEmployee_Titles_HistoryPersistence() {
        return employee_Titles_HistoryPersistence;
    }

    /**
     * Sets the employee_ titles_ history persistence.
     *
     * @param employee_Titles_HistoryPersistence the employee_ titles_ history persistence
     */
    public void setEmployee_Titles_HistoryPersistence(
        Employee_Titles_HistoryPersistence employee_Titles_HistoryPersistence) {
        this.employee_Titles_HistoryPersistence = employee_Titles_HistoryPersistence;
    }

    /**
     * Returns the j title local service.
     *
     * @return the j title local service
     */
    public vn.com.ecopharma.hrm.service.JTitleLocalService getJTitleLocalService() {
        return jTitleLocalService;
    }

    /**
     * Sets the j title local service.
     *
     * @param jTitleLocalService the j title local service
     */
    public void setJTitleLocalService(
        vn.com.ecopharma.hrm.service.JTitleLocalService jTitleLocalService) {
        this.jTitleLocalService = jTitleLocalService;
    }

    /**
     * Returns the j title remote service.
     *
     * @return the j title remote service
     */
    public vn.com.ecopharma.hrm.service.JTitleService getJTitleService() {
        return jTitleService;
    }

    /**
     * Sets the j title remote service.
     *
     * @param jTitleService the j title remote service
     */
    public void setJTitleService(
        vn.com.ecopharma.hrm.service.JTitleService jTitleService) {
        this.jTitleService = jTitleService;
    }

    /**
     * Returns the j title persistence.
     *
     * @return the j title persistence
     */
    public JTitlePersistence getJTitlePersistence() {
        return jTitlePersistence;
    }

    /**
     * Sets the j title persistence.
     *
     * @param jTitlePersistence the j title persistence
     */
    public void setJTitlePersistence(JTitlePersistence jTitlePersistence) {
        this.jTitlePersistence = jTitlePersistence;
    }

    /**
     * Returns the level local service.
     *
     * @return the level local service
     */
    public vn.com.ecopharma.hrm.service.LevelLocalService getLevelLocalService() {
        return levelLocalService;
    }

    /**
     * Sets the level local service.
     *
     * @param levelLocalService the level local service
     */
    public void setLevelLocalService(
        vn.com.ecopharma.hrm.service.LevelLocalService levelLocalService) {
        this.levelLocalService = levelLocalService;
    }

    /**
     * Returns the level remote service.
     *
     * @return the level remote service
     */
    public vn.com.ecopharma.hrm.service.LevelService getLevelService() {
        return levelService;
    }

    /**
     * Sets the level remote service.
     *
     * @param levelService the level remote service
     */
    public void setLevelService(
        vn.com.ecopharma.hrm.service.LevelService levelService) {
        this.levelService = levelService;
    }

    /**
     * Returns the level persistence.
     *
     * @return the level persistence
     */
    public LevelPersistence getLevelPersistence() {
        return levelPersistence;
    }

    /**
     * Sets the level persistence.
     *
     * @param levelPersistence the level persistence
     */
    public void setLevelPersistence(LevelPersistence levelPersistence) {
        this.levelPersistence = levelPersistence;
    }

    /**
     * Returns the sub unit local service.
     *
     * @return the sub unit local service
     */
    public vn.com.ecopharma.hrm.service.SubUnitLocalService getSubUnitLocalService() {
        return subUnitLocalService;
    }

    /**
     * Sets the sub unit local service.
     *
     * @param subUnitLocalService the sub unit local service
     */
    public void setSubUnitLocalService(
        vn.com.ecopharma.hrm.service.SubUnitLocalService subUnitLocalService) {
        this.subUnitLocalService = subUnitLocalService;
    }

    /**
     * Returns the sub unit remote service.
     *
     * @return the sub unit remote service
     */
    public vn.com.ecopharma.hrm.service.SubUnitService getSubUnitService() {
        return subUnitService;
    }

    /**
     * Sets the sub unit remote service.
     *
     * @param subUnitService the sub unit remote service
     */
    public void setSubUnitService(
        vn.com.ecopharma.hrm.service.SubUnitService subUnitService) {
        this.subUnitService = subUnitService;
    }

    /**
     * Returns the sub unit persistence.
     *
     * @return the sub unit persistence
     */
    public SubUnitPersistence getSubUnitPersistence() {
        return subUnitPersistence;
    }

    /**
     * Sets the sub unit persistence.
     *
     * @param subUnitPersistence the sub unit persistence
     */
    public void setSubUnitPersistence(SubUnitPersistence subUnitPersistence) {
        this.subUnitPersistence = subUnitPersistence;
    }

    /**
     * Returns the titles local service.
     *
     * @return the titles local service
     */
    public vn.com.ecopharma.hrm.service.TitlesLocalService getTitlesLocalService() {
        return titlesLocalService;
    }

    /**
     * Sets the titles local service.
     *
     * @param titlesLocalService the titles local service
     */
    public void setTitlesLocalService(
        vn.com.ecopharma.hrm.service.TitlesLocalService titlesLocalService) {
        this.titlesLocalService = titlesLocalService;
    }

    /**
     * Returns the titles remote service.
     *
     * @return the titles remote service
     */
    public vn.com.ecopharma.hrm.service.TitlesService getTitlesService() {
        return titlesService;
    }

    /**
     * Sets the titles remote service.
     *
     * @param titlesService the titles remote service
     */
    public void setTitlesService(
        vn.com.ecopharma.hrm.service.TitlesService titlesService) {
        this.titlesService = titlesService;
    }

    /**
     * Returns the titles persistence.
     *
     * @return the titles persistence
     */
    public TitlesPersistence getTitlesPersistence() {
        return titlesPersistence;
    }

    /**
     * Sets the titles persistence.
     *
     * @param titlesPersistence the titles persistence
     */
    public void setTitlesPersistence(TitlesPersistence titlesPersistence) {
        this.titlesPersistence = titlesPersistence;
    }

    /**
     * Returns the university local service.
     *
     * @return the university local service
     */
    public vn.com.ecopharma.hrm.service.UniversityLocalService getUniversityLocalService() {
        return universityLocalService;
    }

    /**
     * Sets the university local service.
     *
     * @param universityLocalService the university local service
     */
    public void setUniversityLocalService(
        vn.com.ecopharma.hrm.service.UniversityLocalService universityLocalService) {
        this.universityLocalService = universityLocalService;
    }

    /**
     * Returns the university remote service.
     *
     * @return the university remote service
     */
    public vn.com.ecopharma.hrm.service.UniversityService getUniversityService() {
        return universityService;
    }

    /**
     * Sets the university remote service.
     *
     * @param universityService the university remote service
     */
    public void setUniversityService(
        vn.com.ecopharma.hrm.service.UniversityService universityService) {
        this.universityService = universityService;
    }

    /**
     * Returns the university persistence.
     *
     * @return the university persistence
     */
    public UniversityPersistence getUniversityPersistence() {
        return universityPersistence;
    }

    /**
     * Sets the university persistence.
     *
     * @param universityPersistence the university persistence
     */
    public void setUniversityPersistence(
        UniversityPersistence universityPersistence) {
        this.universityPersistence = universityPersistence;
    }

    /**
     * Returns the counter local service.
     *
     * @return the counter local service
     */
    public com.liferay.counter.service.CounterLocalService getCounterLocalService() {
        return counterLocalService;
    }

    /**
     * Sets the counter local service.
     *
     * @param counterLocalService the counter local service
     */
    public void setCounterLocalService(
        com.liferay.counter.service.CounterLocalService counterLocalService) {
        this.counterLocalService = counterLocalService;
    }

    /**
     * Returns the resource local service.
     *
     * @return the resource local service
     */
    public com.liferay.portal.service.ResourceLocalService getResourceLocalService() {
        return resourceLocalService;
    }

    /**
     * Sets the resource local service.
     *
     * @param resourceLocalService the resource local service
     */
    public void setResourceLocalService(
        com.liferay.portal.service.ResourceLocalService resourceLocalService) {
        this.resourceLocalService = resourceLocalService;
    }

    /**
     * Returns the user local service.
     *
     * @return the user local service
     */
    public com.liferay.portal.service.UserLocalService getUserLocalService() {
        return userLocalService;
    }

    /**
     * Sets the user local service.
     *
     * @param userLocalService the user local service
     */
    public void setUserLocalService(
        com.liferay.portal.service.UserLocalService userLocalService) {
        this.userLocalService = userLocalService;
    }

    /**
     * Returns the user remote service.
     *
     * @return the user remote service
     */
    public com.liferay.portal.service.UserService getUserService() {
        return userService;
    }

    /**
     * Sets the user remote service.
     *
     * @param userService the user remote service
     */
    public void setUserService(
        com.liferay.portal.service.UserService userService) {
        this.userService = userService;
    }

    /**
     * Returns the user persistence.
     *
     * @return the user persistence
     */
    public UserPersistence getUserPersistence() {
        return userPersistence;
    }

    /**
     * Sets the user persistence.
     *
     * @param userPersistence the user persistence
     */
    public void setUserPersistence(UserPersistence userPersistence) {
        this.userPersistence = userPersistence;
    }

    public void afterPropertiesSet() {
        Class<?> clazz = getClass();

        _classLoader = clazz.getClassLoader();

        PersistedModelLocalServiceRegistryUtil.register("vn.com.ecopharma.hrm.model.University",
            universityLocalService);
    }

    public void destroy() {
        PersistedModelLocalServiceRegistryUtil.unregister(
            "vn.com.ecopharma.hrm.model.University");
    }

    /**
     * Returns the Spring bean ID for this bean.
     *
     * @return the Spring bean ID for this bean
     */
    @Override
    public String getBeanIdentifier() {
        return _beanIdentifier;
    }

    /**
     * Sets the Spring bean ID for this bean.
     *
     * @param beanIdentifier the Spring bean ID for this bean
     */
    @Override
    public void setBeanIdentifier(String beanIdentifier) {
        _beanIdentifier = beanIdentifier;
    }

    @Override
    public Object invokeMethod(String name, String[] parameterTypes,
        Object[] arguments) throws Throwable {
        Thread currentThread = Thread.currentThread();

        ClassLoader contextClassLoader = currentThread.getContextClassLoader();

        if (contextClassLoader != _classLoader) {
            currentThread.setContextClassLoader(_classLoader);
        }

        try {
            return _clpInvoker.invokeMethod(name, parameterTypes, arguments);
        } finally {
            if (contextClassLoader != _classLoader) {
                currentThread.setContextClassLoader(contextClassLoader);
            }
        }
    }

    protected Class<?> getModelClass() {
        return University.class;
    }

    protected String getModelClassName() {
        return University.class.getName();
    }

    /**
     * Performs an SQL query.
     *
     * @param sql the sql query
     */
    protected void runSQL(String sql) throws SystemException {
        try {
            DataSource dataSource = universityPersistence.getDataSource();

            SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(dataSource,
                    sql, new int[0]);

            sqlUpdate.update();
        } catch (Exception e) {
            throw new SystemException(e);
        }
    }
}
