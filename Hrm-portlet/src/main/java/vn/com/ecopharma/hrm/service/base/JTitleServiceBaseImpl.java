package vn.com.ecopharma.hrm.service.base;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.bean.IdentifiableBean;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.service.BaseServiceImpl;
import com.liferay.portal.service.persistence.UserPersistence;

import vn.com.ecopharma.hrm.model.JTitle;
import vn.com.ecopharma.hrm.service.JTitleService;
import vn.com.ecopharma.hrm.service.persistence.CandidateFinder;
import vn.com.ecopharma.hrm.service.persistence.CandidateHistoryPersistence;
import vn.com.ecopharma.hrm.service.persistence.CandidatePersistence;
import vn.com.ecopharma.hrm.service.persistence.EmployeeInterviewSchedulePersistence;
import vn.com.ecopharma.hrm.service.persistence.EmployeePersistence;
import vn.com.ecopharma.hrm.service.persistence.EmployeeVacancyPersistence;
import vn.com.ecopharma.hrm.service.persistence.FileAttachmentPersistence;
import vn.com.ecopharma.hrm.service.persistence.InterviewPersistence;
import vn.com.ecopharma.hrm.service.persistence.InterviewSchedulePersistence;
import vn.com.ecopharma.hrm.service.persistence.JTitlePersistence;
import vn.com.ecopharma.hrm.service.persistence.LocationPersistence;
import vn.com.ecopharma.hrm.service.persistence.VacancyCandidatePersistence;
import vn.com.ecopharma.hrm.service.persistence.VacancyFinder;
import vn.com.ecopharma.hrm.service.persistence.VacancyPersistence;

import javax.sql.DataSource;

/**
 * Provides the base implementation for the j title remote service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link vn.com.ecopharma.hrm.service.impl.JTitleServiceImpl}.
 * </p>
 *
 * @author tvt
 * @see vn.com.ecopharma.hrm.service.impl.JTitleServiceImpl
 * @see vn.com.ecopharma.hrm.service.JTitleServiceUtil
 * @generated
 */
public abstract class JTitleServiceBaseImpl extends BaseServiceImpl
    implements JTitleService, IdentifiableBean {
    @BeanReference(type = vn.com.ecopharma.hrm.service.CandidateLocalService.class)
    protected vn.com.ecopharma.hrm.service.CandidateLocalService candidateLocalService;
    @BeanReference(type = vn.com.ecopharma.hrm.service.CandidateService.class)
    protected vn.com.ecopharma.hrm.service.CandidateService candidateService;
    @BeanReference(type = CandidatePersistence.class)
    protected CandidatePersistence candidatePersistence;
    @BeanReference(type = CandidateFinder.class)
    protected CandidateFinder candidateFinder;
    @BeanReference(type = vn.com.ecopharma.hrm.service.CandidateHistoryLocalService.class)
    protected vn.com.ecopharma.hrm.service.CandidateHistoryLocalService candidateHistoryLocalService;
    @BeanReference(type = vn.com.ecopharma.hrm.service.CandidateHistoryService.class)
    protected vn.com.ecopharma.hrm.service.CandidateHistoryService candidateHistoryService;
    @BeanReference(type = CandidateHistoryPersistence.class)
    protected CandidateHistoryPersistence candidateHistoryPersistence;
    @BeanReference(type = vn.com.ecopharma.hrm.service.EmployeeLocalService.class)
    protected vn.com.ecopharma.hrm.service.EmployeeLocalService employeeLocalService;
    @BeanReference(type = vn.com.ecopharma.hrm.service.EmployeeService.class)
    protected vn.com.ecopharma.hrm.service.EmployeeService employeeService;
    @BeanReference(type = EmployeePersistence.class)
    protected EmployeePersistence employeePersistence;
    @BeanReference(type = vn.com.ecopharma.hrm.service.EmployeeInterviewScheduleLocalService.class)
    protected vn.com.ecopharma.hrm.service.EmployeeInterviewScheduleLocalService employeeInterviewScheduleLocalService;
    @BeanReference(type = vn.com.ecopharma.hrm.service.EmployeeInterviewScheduleService.class)
    protected vn.com.ecopharma.hrm.service.EmployeeInterviewScheduleService employeeInterviewScheduleService;
    @BeanReference(type = EmployeeInterviewSchedulePersistence.class)
    protected EmployeeInterviewSchedulePersistence employeeInterviewSchedulePersistence;
    @BeanReference(type = vn.com.ecopharma.hrm.service.EmployeeVacancyLocalService.class)
    protected vn.com.ecopharma.hrm.service.EmployeeVacancyLocalService employeeVacancyLocalService;
    @BeanReference(type = vn.com.ecopharma.hrm.service.EmployeeVacancyService.class)
    protected vn.com.ecopharma.hrm.service.EmployeeVacancyService employeeVacancyService;
    @BeanReference(type = EmployeeVacancyPersistence.class)
    protected EmployeeVacancyPersistence employeeVacancyPersistence;
    @BeanReference(type = vn.com.ecopharma.hrm.service.FileAttachmentLocalService.class)
    protected vn.com.ecopharma.hrm.service.FileAttachmentLocalService fileAttachmentLocalService;
    @BeanReference(type = vn.com.ecopharma.hrm.service.FileAttachmentService.class)
    protected vn.com.ecopharma.hrm.service.FileAttachmentService fileAttachmentService;
    @BeanReference(type = FileAttachmentPersistence.class)
    protected FileAttachmentPersistence fileAttachmentPersistence;
    @BeanReference(type = vn.com.ecopharma.hrm.service.InterviewLocalService.class)
    protected vn.com.ecopharma.hrm.service.InterviewLocalService interviewLocalService;
    @BeanReference(type = vn.com.ecopharma.hrm.service.InterviewService.class)
    protected vn.com.ecopharma.hrm.service.InterviewService interviewService;
    @BeanReference(type = InterviewPersistence.class)
    protected InterviewPersistence interviewPersistence;
    @BeanReference(type = vn.com.ecopharma.hrm.service.InterviewScheduleLocalService.class)
    protected vn.com.ecopharma.hrm.service.InterviewScheduleLocalService interviewScheduleLocalService;
    @BeanReference(type = vn.com.ecopharma.hrm.service.InterviewScheduleService.class)
    protected vn.com.ecopharma.hrm.service.InterviewScheduleService interviewScheduleService;
    @BeanReference(type = InterviewSchedulePersistence.class)
    protected InterviewSchedulePersistence interviewSchedulePersistence;
    @BeanReference(type = vn.com.ecopharma.hrm.service.JTitleLocalService.class)
    protected vn.com.ecopharma.hrm.service.JTitleLocalService jTitleLocalService;
    @BeanReference(type = vn.com.ecopharma.hrm.service.JTitleService.class)
    protected vn.com.ecopharma.hrm.service.JTitleService jTitleService;
    @BeanReference(type = JTitlePersistence.class)
    protected JTitlePersistence jTitlePersistence;
    @BeanReference(type = vn.com.ecopharma.hrm.service.LocationLocalService.class)
    protected vn.com.ecopharma.hrm.service.LocationLocalService locationLocalService;
    @BeanReference(type = vn.com.ecopharma.hrm.service.LocationService.class)
    protected vn.com.ecopharma.hrm.service.LocationService locationService;
    @BeanReference(type = LocationPersistence.class)
    protected LocationPersistence locationPersistence;
    @BeanReference(type = vn.com.ecopharma.hrm.service.VacancyLocalService.class)
    protected vn.com.ecopharma.hrm.service.VacancyLocalService vacancyLocalService;
    @BeanReference(type = vn.com.ecopharma.hrm.service.VacancyService.class)
    protected vn.com.ecopharma.hrm.service.VacancyService vacancyService;
    @BeanReference(type = VacancyPersistence.class)
    protected VacancyPersistence vacancyPersistence;
    @BeanReference(type = VacancyFinder.class)
    protected VacancyFinder vacancyFinder;
    @BeanReference(type = vn.com.ecopharma.hrm.service.VacancyCandidateLocalService.class)
    protected vn.com.ecopharma.hrm.service.VacancyCandidateLocalService vacancyCandidateLocalService;
    @BeanReference(type = vn.com.ecopharma.hrm.service.VacancyCandidateService.class)
    protected vn.com.ecopharma.hrm.service.VacancyCandidateService vacancyCandidateService;
    @BeanReference(type = VacancyCandidatePersistence.class)
    protected VacancyCandidatePersistence vacancyCandidatePersistence;
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
    private JTitleServiceClpInvoker _clpInvoker = new JTitleServiceClpInvoker();

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link vn.com.ecopharma.hrm.service.JTitleServiceUtil} to access the j title remote service.
     */

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
     * Returns the candidate finder.
     *
     * @return the candidate finder
     */
    public CandidateFinder getCandidateFinder() {
        return candidateFinder;
    }

    /**
     * Sets the candidate finder.
     *
     * @param candidateFinder the candidate finder
     */
    public void setCandidateFinder(CandidateFinder candidateFinder) {
        this.candidateFinder = candidateFinder;
    }

    /**
     * Returns the candidate history local service.
     *
     * @return the candidate history local service
     */
    public vn.com.ecopharma.hrm.service.CandidateHistoryLocalService getCandidateHistoryLocalService() {
        return candidateHistoryLocalService;
    }

    /**
     * Sets the candidate history local service.
     *
     * @param candidateHistoryLocalService the candidate history local service
     */
    public void setCandidateHistoryLocalService(
        vn.com.ecopharma.hrm.service.CandidateHistoryLocalService candidateHistoryLocalService) {
        this.candidateHistoryLocalService = candidateHistoryLocalService;
    }

    /**
     * Returns the candidate history remote service.
     *
     * @return the candidate history remote service
     */
    public vn.com.ecopharma.hrm.service.CandidateHistoryService getCandidateHistoryService() {
        return candidateHistoryService;
    }

    /**
     * Sets the candidate history remote service.
     *
     * @param candidateHistoryService the candidate history remote service
     */
    public void setCandidateHistoryService(
        vn.com.ecopharma.hrm.service.CandidateHistoryService candidateHistoryService) {
        this.candidateHistoryService = candidateHistoryService;
    }

    /**
     * Returns the candidate history persistence.
     *
     * @return the candidate history persistence
     */
    public CandidateHistoryPersistence getCandidateHistoryPersistence() {
        return candidateHistoryPersistence;
    }

    /**
     * Sets the candidate history persistence.
     *
     * @param candidateHistoryPersistence the candidate history persistence
     */
    public void setCandidateHistoryPersistence(
        CandidateHistoryPersistence candidateHistoryPersistence) {
        this.candidateHistoryPersistence = candidateHistoryPersistence;
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
     * Returns the employee interview schedule local service.
     *
     * @return the employee interview schedule local service
     */
    public vn.com.ecopharma.hrm.service.EmployeeInterviewScheduleLocalService getEmployeeInterviewScheduleLocalService() {
        return employeeInterviewScheduleLocalService;
    }

    /**
     * Sets the employee interview schedule local service.
     *
     * @param employeeInterviewScheduleLocalService the employee interview schedule local service
     */
    public void setEmployeeInterviewScheduleLocalService(
        vn.com.ecopharma.hrm.service.EmployeeInterviewScheduleLocalService employeeInterviewScheduleLocalService) {
        this.employeeInterviewScheduleLocalService = employeeInterviewScheduleLocalService;
    }

    /**
     * Returns the employee interview schedule remote service.
     *
     * @return the employee interview schedule remote service
     */
    public vn.com.ecopharma.hrm.service.EmployeeInterviewScheduleService getEmployeeInterviewScheduleService() {
        return employeeInterviewScheduleService;
    }

    /**
     * Sets the employee interview schedule remote service.
     *
     * @param employeeInterviewScheduleService the employee interview schedule remote service
     */
    public void setEmployeeInterviewScheduleService(
        vn.com.ecopharma.hrm.service.EmployeeInterviewScheduleService employeeInterviewScheduleService) {
        this.employeeInterviewScheduleService = employeeInterviewScheduleService;
    }

    /**
     * Returns the employee interview schedule persistence.
     *
     * @return the employee interview schedule persistence
     */
    public EmployeeInterviewSchedulePersistence getEmployeeInterviewSchedulePersistence() {
        return employeeInterviewSchedulePersistence;
    }

    /**
     * Sets the employee interview schedule persistence.
     *
     * @param employeeInterviewSchedulePersistence the employee interview schedule persistence
     */
    public void setEmployeeInterviewSchedulePersistence(
        EmployeeInterviewSchedulePersistence employeeInterviewSchedulePersistence) {
        this.employeeInterviewSchedulePersistence = employeeInterviewSchedulePersistence;
    }

    /**
     * Returns the employee vacancy local service.
     *
     * @return the employee vacancy local service
     */
    public vn.com.ecopharma.hrm.service.EmployeeVacancyLocalService getEmployeeVacancyLocalService() {
        return employeeVacancyLocalService;
    }

    /**
     * Sets the employee vacancy local service.
     *
     * @param employeeVacancyLocalService the employee vacancy local service
     */
    public void setEmployeeVacancyLocalService(
        vn.com.ecopharma.hrm.service.EmployeeVacancyLocalService employeeVacancyLocalService) {
        this.employeeVacancyLocalService = employeeVacancyLocalService;
    }

    /**
     * Returns the employee vacancy remote service.
     *
     * @return the employee vacancy remote service
     */
    public vn.com.ecopharma.hrm.service.EmployeeVacancyService getEmployeeVacancyService() {
        return employeeVacancyService;
    }

    /**
     * Sets the employee vacancy remote service.
     *
     * @param employeeVacancyService the employee vacancy remote service
     */
    public void setEmployeeVacancyService(
        vn.com.ecopharma.hrm.service.EmployeeVacancyService employeeVacancyService) {
        this.employeeVacancyService = employeeVacancyService;
    }

    /**
     * Returns the employee vacancy persistence.
     *
     * @return the employee vacancy persistence
     */
    public EmployeeVacancyPersistence getEmployeeVacancyPersistence() {
        return employeeVacancyPersistence;
    }

    /**
     * Sets the employee vacancy persistence.
     *
     * @param employeeVacancyPersistence the employee vacancy persistence
     */
    public void setEmployeeVacancyPersistence(
        EmployeeVacancyPersistence employeeVacancyPersistence) {
        this.employeeVacancyPersistence = employeeVacancyPersistence;
    }

    /**
     * Returns the file attachment local service.
     *
     * @return the file attachment local service
     */
    public vn.com.ecopharma.hrm.service.FileAttachmentLocalService getFileAttachmentLocalService() {
        return fileAttachmentLocalService;
    }

    /**
     * Sets the file attachment local service.
     *
     * @param fileAttachmentLocalService the file attachment local service
     */
    public void setFileAttachmentLocalService(
        vn.com.ecopharma.hrm.service.FileAttachmentLocalService fileAttachmentLocalService) {
        this.fileAttachmentLocalService = fileAttachmentLocalService;
    }

    /**
     * Returns the file attachment remote service.
     *
     * @return the file attachment remote service
     */
    public vn.com.ecopharma.hrm.service.FileAttachmentService getFileAttachmentService() {
        return fileAttachmentService;
    }

    /**
     * Sets the file attachment remote service.
     *
     * @param fileAttachmentService the file attachment remote service
     */
    public void setFileAttachmentService(
        vn.com.ecopharma.hrm.service.FileAttachmentService fileAttachmentService) {
        this.fileAttachmentService = fileAttachmentService;
    }

    /**
     * Returns the file attachment persistence.
     *
     * @return the file attachment persistence
     */
    public FileAttachmentPersistence getFileAttachmentPersistence() {
        return fileAttachmentPersistence;
    }

    /**
     * Sets the file attachment persistence.
     *
     * @param fileAttachmentPersistence the file attachment persistence
     */
    public void setFileAttachmentPersistence(
        FileAttachmentPersistence fileAttachmentPersistence) {
        this.fileAttachmentPersistence = fileAttachmentPersistence;
    }

    /**
     * Returns the interview local service.
     *
     * @return the interview local service
     */
    public vn.com.ecopharma.hrm.service.InterviewLocalService getInterviewLocalService() {
        return interviewLocalService;
    }

    /**
     * Sets the interview local service.
     *
     * @param interviewLocalService the interview local service
     */
    public void setInterviewLocalService(
        vn.com.ecopharma.hrm.service.InterviewLocalService interviewLocalService) {
        this.interviewLocalService = interviewLocalService;
    }

    /**
     * Returns the interview remote service.
     *
     * @return the interview remote service
     */
    public vn.com.ecopharma.hrm.service.InterviewService getInterviewService() {
        return interviewService;
    }

    /**
     * Sets the interview remote service.
     *
     * @param interviewService the interview remote service
     */
    public void setInterviewService(
        vn.com.ecopharma.hrm.service.InterviewService interviewService) {
        this.interviewService = interviewService;
    }

    /**
     * Returns the interview persistence.
     *
     * @return the interview persistence
     */
    public InterviewPersistence getInterviewPersistence() {
        return interviewPersistence;
    }

    /**
     * Sets the interview persistence.
     *
     * @param interviewPersistence the interview persistence
     */
    public void setInterviewPersistence(
        InterviewPersistence interviewPersistence) {
        this.interviewPersistence = interviewPersistence;
    }

    /**
     * Returns the interview schedule local service.
     *
     * @return the interview schedule local service
     */
    public vn.com.ecopharma.hrm.service.InterviewScheduleLocalService getInterviewScheduleLocalService() {
        return interviewScheduleLocalService;
    }

    /**
     * Sets the interview schedule local service.
     *
     * @param interviewScheduleLocalService the interview schedule local service
     */
    public void setInterviewScheduleLocalService(
        vn.com.ecopharma.hrm.service.InterviewScheduleLocalService interviewScheduleLocalService) {
        this.interviewScheduleLocalService = interviewScheduleLocalService;
    }

    /**
     * Returns the interview schedule remote service.
     *
     * @return the interview schedule remote service
     */
    public vn.com.ecopharma.hrm.service.InterviewScheduleService getInterviewScheduleService() {
        return interviewScheduleService;
    }

    /**
     * Sets the interview schedule remote service.
     *
     * @param interviewScheduleService the interview schedule remote service
     */
    public void setInterviewScheduleService(
        vn.com.ecopharma.hrm.service.InterviewScheduleService interviewScheduleService) {
        this.interviewScheduleService = interviewScheduleService;
    }

    /**
     * Returns the interview schedule persistence.
     *
     * @return the interview schedule persistence
     */
    public InterviewSchedulePersistence getInterviewSchedulePersistence() {
        return interviewSchedulePersistence;
    }

    /**
     * Sets the interview schedule persistence.
     *
     * @param interviewSchedulePersistence the interview schedule persistence
     */
    public void setInterviewSchedulePersistence(
        InterviewSchedulePersistence interviewSchedulePersistence) {
        this.interviewSchedulePersistence = interviewSchedulePersistence;
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
     * Returns the location local service.
     *
     * @return the location local service
     */
    public vn.com.ecopharma.hrm.service.LocationLocalService getLocationLocalService() {
        return locationLocalService;
    }

    /**
     * Sets the location local service.
     *
     * @param locationLocalService the location local service
     */
    public void setLocationLocalService(
        vn.com.ecopharma.hrm.service.LocationLocalService locationLocalService) {
        this.locationLocalService = locationLocalService;
    }

    /**
     * Returns the location remote service.
     *
     * @return the location remote service
     */
    public vn.com.ecopharma.hrm.service.LocationService getLocationService() {
        return locationService;
    }

    /**
     * Sets the location remote service.
     *
     * @param locationService the location remote service
     */
    public void setLocationService(
        vn.com.ecopharma.hrm.service.LocationService locationService) {
        this.locationService = locationService;
    }

    /**
     * Returns the location persistence.
     *
     * @return the location persistence
     */
    public LocationPersistence getLocationPersistence() {
        return locationPersistence;
    }

    /**
     * Sets the location persistence.
     *
     * @param locationPersistence the location persistence
     */
    public void setLocationPersistence(LocationPersistence locationPersistence) {
        this.locationPersistence = locationPersistence;
    }

    /**
     * Returns the vacancy local service.
     *
     * @return the vacancy local service
     */
    public vn.com.ecopharma.hrm.service.VacancyLocalService getVacancyLocalService() {
        return vacancyLocalService;
    }

    /**
     * Sets the vacancy local service.
     *
     * @param vacancyLocalService the vacancy local service
     */
    public void setVacancyLocalService(
        vn.com.ecopharma.hrm.service.VacancyLocalService vacancyLocalService) {
        this.vacancyLocalService = vacancyLocalService;
    }

    /**
     * Returns the vacancy remote service.
     *
     * @return the vacancy remote service
     */
    public vn.com.ecopharma.hrm.service.VacancyService getVacancyService() {
        return vacancyService;
    }

    /**
     * Sets the vacancy remote service.
     *
     * @param vacancyService the vacancy remote service
     */
    public void setVacancyService(
        vn.com.ecopharma.hrm.service.VacancyService vacancyService) {
        this.vacancyService = vacancyService;
    }

    /**
     * Returns the vacancy persistence.
     *
     * @return the vacancy persistence
     */
    public VacancyPersistence getVacancyPersistence() {
        return vacancyPersistence;
    }

    /**
     * Sets the vacancy persistence.
     *
     * @param vacancyPersistence the vacancy persistence
     */
    public void setVacancyPersistence(VacancyPersistence vacancyPersistence) {
        this.vacancyPersistence = vacancyPersistence;
    }

    /**
     * Returns the vacancy finder.
     *
     * @return the vacancy finder
     */
    public VacancyFinder getVacancyFinder() {
        return vacancyFinder;
    }

    /**
     * Sets the vacancy finder.
     *
     * @param vacancyFinder the vacancy finder
     */
    public void setVacancyFinder(VacancyFinder vacancyFinder) {
        this.vacancyFinder = vacancyFinder;
    }

    /**
     * Returns the vacancy candidate local service.
     *
     * @return the vacancy candidate local service
     */
    public vn.com.ecopharma.hrm.service.VacancyCandidateLocalService getVacancyCandidateLocalService() {
        return vacancyCandidateLocalService;
    }

    /**
     * Sets the vacancy candidate local service.
     *
     * @param vacancyCandidateLocalService the vacancy candidate local service
     */
    public void setVacancyCandidateLocalService(
        vn.com.ecopharma.hrm.service.VacancyCandidateLocalService vacancyCandidateLocalService) {
        this.vacancyCandidateLocalService = vacancyCandidateLocalService;
    }

    /**
     * Returns the vacancy candidate remote service.
     *
     * @return the vacancy candidate remote service
     */
    public vn.com.ecopharma.hrm.service.VacancyCandidateService getVacancyCandidateService() {
        return vacancyCandidateService;
    }

    /**
     * Sets the vacancy candidate remote service.
     *
     * @param vacancyCandidateService the vacancy candidate remote service
     */
    public void setVacancyCandidateService(
        vn.com.ecopharma.hrm.service.VacancyCandidateService vacancyCandidateService) {
        this.vacancyCandidateService = vacancyCandidateService;
    }

    /**
     * Returns the vacancy candidate persistence.
     *
     * @return the vacancy candidate persistence
     */
    public VacancyCandidatePersistence getVacancyCandidatePersistence() {
        return vacancyCandidatePersistence;
    }

    /**
     * Sets the vacancy candidate persistence.
     *
     * @param vacancyCandidatePersistence the vacancy candidate persistence
     */
    public void setVacancyCandidatePersistence(
        VacancyCandidatePersistence vacancyCandidatePersistence) {
        this.vacancyCandidatePersistence = vacancyCandidatePersistence;
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
    }

    public void destroy() {
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
        return JTitle.class;
    }

    protected String getModelClassName() {
        return JTitle.class.getName();
    }

    /**
     * Performs an SQL query.
     *
     * @param sql the sql query
     */
    protected void runSQL(String sql) throws SystemException {
        try {
            DataSource dataSource = jTitlePersistence.getDataSource();

            SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(dataSource,
                    sql, new int[0]);

            sqlUpdate.update();
        } catch (Exception e) {
            throw new SystemException(e);
        }
    }
}
