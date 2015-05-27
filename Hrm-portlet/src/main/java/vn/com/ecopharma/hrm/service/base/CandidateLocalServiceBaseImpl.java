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

import vn.com.ecopharma.hrm.model.Candidate;
import vn.com.ecopharma.hrm.service.CandidateLocalService;
import vn.com.ecopharma.hrm.service.persistence.CandidateFinder;
import vn.com.ecopharma.hrm.service.persistence.CandidatePersistence;
import vn.com.ecopharma.hrm.service.persistence.FileAttachmentPersistence;
import vn.com.ecopharma.hrm.service.persistence.InterviewPersistence;
import vn.com.ecopharma.hrm.service.persistence.InterviewSchedulePersistence;
import vn.com.ecopharma.hrm.service.persistence.JTitlePersistence;
import vn.com.ecopharma.hrm.service.persistence.VacancyCandidatePersistence;
import vn.com.ecopharma.hrm.service.persistence.VacancyPersistence;

import java.io.Serializable;

import java.util.List;

import javax.sql.DataSource;

/**
 * Provides the base implementation for the candidate local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link vn.com.ecopharma.hrm.service.impl.CandidateLocalServiceImpl}.
 * </p>
 *
 * @author tvt
 * @see vn.com.ecopharma.hrm.service.impl.CandidateLocalServiceImpl
 * @see vn.com.ecopharma.hrm.service.CandidateLocalServiceUtil
 * @generated
 */
public abstract class CandidateLocalServiceBaseImpl extends BaseLocalServiceImpl
    implements CandidateLocalService, IdentifiableBean {
    @BeanReference(type = vn.com.ecopharma.hrm.service.CandidateLocalService.class)
    protected vn.com.ecopharma.hrm.service.CandidateLocalService candidateLocalService;
    @BeanReference(type = vn.com.ecopharma.hrm.service.CandidateService.class)
    protected vn.com.ecopharma.hrm.service.CandidateService candidateService;
    @BeanReference(type = CandidatePersistence.class)
    protected CandidatePersistence candidatePersistence;
    @BeanReference(type = CandidateFinder.class)
    protected CandidateFinder candidateFinder;
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
    @BeanReference(type = vn.com.ecopharma.hrm.service.VacancyLocalService.class)
    protected vn.com.ecopharma.hrm.service.VacancyLocalService vacancyLocalService;
    @BeanReference(type = vn.com.ecopharma.hrm.service.VacancyService.class)
    protected vn.com.ecopharma.hrm.service.VacancyService vacancyService;
    @BeanReference(type = VacancyPersistence.class)
    protected VacancyPersistence vacancyPersistence;
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
    private CandidateLocalServiceClpInvoker _clpInvoker = new CandidateLocalServiceClpInvoker();

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link vn.com.ecopharma.hrm.service.CandidateLocalServiceUtil} to access the candidate local service.
     */

    /**
     * Adds the candidate to the database. Also notifies the appropriate model listeners.
     *
     * @param candidate the candidate
     * @return the candidate that was added
     * @throws SystemException if a system exception occurred
     */
    @Indexable(type = IndexableType.REINDEX)
    @Override
    public Candidate addCandidate(Candidate candidate)
        throws SystemException {
        candidate.setNew(true);

        return candidatePersistence.update(candidate);
    }

    /**
     * Creates a new candidate with the primary key. Does not add the candidate to the database.
     *
     * @param c_id the primary key for the new candidate
     * @return the new candidate
     */
    @Override
    public Candidate createCandidate(long c_id) {
        return candidatePersistence.create(c_id);
    }

    /**
     * Deletes the candidate with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param c_id the primary key of the candidate
     * @return the candidate that was removed
     * @throws PortalException if a candidate with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Indexable(type = IndexableType.DELETE)
    @Override
    public Candidate deleteCandidate(long c_id)
        throws PortalException, SystemException {
        return candidatePersistence.remove(c_id);
    }

    /**
     * Deletes the candidate from the database. Also notifies the appropriate model listeners.
     *
     * @param candidate the candidate
     * @return the candidate that was removed
     * @throws SystemException if a system exception occurred
     */
    @Indexable(type = IndexableType.DELETE)
    @Override
    public Candidate deleteCandidate(Candidate candidate)
        throws SystemException {
        return candidatePersistence.remove(candidate);
    }

    @Override
    public DynamicQuery dynamicQuery() {
        Class<?> clazz = getClass();

        return DynamicQueryFactoryUtil.forClass(Candidate.class,
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
        return candidatePersistence.findWithDynamicQuery(dynamicQuery);
    }

    /**
     * Performs a dynamic query on the database and returns a range of the matching rows.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.com.ecopharma.hrm.model.impl.CandidateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return candidatePersistence.findWithDynamicQuery(dynamicQuery, start,
            end);
    }

    /**
     * Performs a dynamic query on the database and returns an ordered range of the matching rows.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.com.ecopharma.hrm.model.impl.CandidateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return candidatePersistence.findWithDynamicQuery(dynamicQuery, start,
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
        return candidatePersistence.countWithDynamicQuery(dynamicQuery);
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
        return candidatePersistence.countWithDynamicQuery(dynamicQuery,
            projection);
    }

    @Override
    public Candidate fetchCandidate(long c_id) throws SystemException {
        return candidatePersistence.fetchByPrimaryKey(c_id);
    }

    /**
     * Returns the candidate with the primary key.
     *
     * @param c_id the primary key of the candidate
     * @return the candidate
     * @throws PortalException if a candidate with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Candidate getCandidate(long c_id)
        throws PortalException, SystemException {
        return candidatePersistence.findByPrimaryKey(c_id);
    }

    @Override
    public PersistedModel getPersistedModel(Serializable primaryKeyObj)
        throws PortalException, SystemException {
        return candidatePersistence.findByPrimaryKey(primaryKeyObj);
    }

    /**
     * Returns a range of all the candidates.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.com.ecopharma.hrm.model.impl.CandidateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of candidates
     * @param end the upper bound of the range of candidates (not inclusive)
     * @return the range of candidates
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Candidate> getCandidates(int start, int end)
        throws SystemException {
        return candidatePersistence.findAll(start, end);
    }

    /**
     * Returns the number of candidates.
     *
     * @return the number of candidates
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int getCandidatesCount() throws SystemException {
        return candidatePersistence.countAll();
    }

    /**
     * Updates the candidate in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
     *
     * @param candidate the candidate
     * @return the candidate that was updated
     * @throws SystemException if a system exception occurred
     */
    @Indexable(type = IndexableType.REINDEX)
    @Override
    public Candidate updateCandidate(Candidate candidate)
        throws SystemException {
        return candidatePersistence.update(candidate);
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

        PersistedModelLocalServiceRegistryUtil.register("vn.com.ecopharma.hrm.model.Candidate",
            candidateLocalService);
    }

    public void destroy() {
        PersistedModelLocalServiceRegistryUtil.unregister(
            "vn.com.ecopharma.hrm.model.Candidate");
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
        return Candidate.class;
    }

    protected String getModelClassName() {
        return Candidate.class.getName();
    }

    /**
     * Performs an SQL query.
     *
     * @param sql the sql query
     */
    protected void runSQL(String sql) throws SystemException {
        try {
            DataSource dataSource = candidatePersistence.getDataSource();

            SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(dataSource,
                    sql, new int[0]);

            sqlUpdate.update();
        } catch (Exception e) {
            throw new SystemException(e);
        }
    }
}
