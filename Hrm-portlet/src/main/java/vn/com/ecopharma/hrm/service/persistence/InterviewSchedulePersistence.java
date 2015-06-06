package vn.com.ecopharma.hrm.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import vn.com.ecopharma.hrm.model.InterviewSchedule;

/**
 * The persistence interface for the interview schedule service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author tvt
 * @see InterviewSchedulePersistenceImpl
 * @see InterviewScheduleUtil
 * @generated
 */
public interface InterviewSchedulePersistence extends BasePersistence<InterviewSchedule> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link InterviewScheduleUtil} to access the interview schedule persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Returns all the interview schedules where interviewId = &#63;.
    *
    * @param interviewId the interview ID
    * @return the matching interview schedules
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<vn.com.ecopharma.hrm.model.InterviewSchedule> findByInterviewId(
        long interviewId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the interview schedules where interviewId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.com.ecopharma.hrm.model.impl.InterviewScheduleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param interviewId the interview ID
    * @param start the lower bound of the range of interview schedules
    * @param end the upper bound of the range of interview schedules (not inclusive)
    * @return the range of matching interview schedules
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<vn.com.ecopharma.hrm.model.InterviewSchedule> findByInterviewId(
        long interviewId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the interview schedules where interviewId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.com.ecopharma.hrm.model.impl.InterviewScheduleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param interviewId the interview ID
    * @param start the lower bound of the range of interview schedules
    * @param end the upper bound of the range of interview schedules (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching interview schedules
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<vn.com.ecopharma.hrm.model.InterviewSchedule> findByInterviewId(
        long interviewId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first interview schedule in the ordered set where interviewId = &#63;.
    *
    * @param interviewId the interview ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching interview schedule
    * @throws vn.com.ecopharma.hrm.NoSuchInterviewScheduleException if a matching interview schedule could not be found
    * @throws SystemException if a system exception occurred
    */
    public vn.com.ecopharma.hrm.model.InterviewSchedule findByInterviewId_First(
        long interviewId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            vn.com.ecopharma.hrm.NoSuchInterviewScheduleException;

    /**
    * Returns the first interview schedule in the ordered set where interviewId = &#63;.
    *
    * @param interviewId the interview ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching interview schedule, or <code>null</code> if a matching interview schedule could not be found
    * @throws SystemException if a system exception occurred
    */
    public vn.com.ecopharma.hrm.model.InterviewSchedule fetchByInterviewId_First(
        long interviewId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last interview schedule in the ordered set where interviewId = &#63;.
    *
    * @param interviewId the interview ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching interview schedule
    * @throws vn.com.ecopharma.hrm.NoSuchInterviewScheduleException if a matching interview schedule could not be found
    * @throws SystemException if a system exception occurred
    */
    public vn.com.ecopharma.hrm.model.InterviewSchedule findByInterviewId_Last(
        long interviewId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            vn.com.ecopharma.hrm.NoSuchInterviewScheduleException;

    /**
    * Returns the last interview schedule in the ordered set where interviewId = &#63;.
    *
    * @param interviewId the interview ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching interview schedule, or <code>null</code> if a matching interview schedule could not be found
    * @throws SystemException if a system exception occurred
    */
    public vn.com.ecopharma.hrm.model.InterviewSchedule fetchByInterviewId_Last(
        long interviewId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the interview schedules before and after the current interview schedule in the ordered set where interviewId = &#63;.
    *
    * @param interviewScheduleId the primary key of the current interview schedule
    * @param interviewId the interview ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next interview schedule
    * @throws vn.com.ecopharma.hrm.NoSuchInterviewScheduleException if a interview schedule with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public vn.com.ecopharma.hrm.model.InterviewSchedule[] findByInterviewId_PrevAndNext(
        long interviewScheduleId, long interviewId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            vn.com.ecopharma.hrm.NoSuchInterviewScheduleException;

    /**
    * Removes all the interview schedules where interviewId = &#63; from the database.
    *
    * @param interviewId the interview ID
    * @throws SystemException if a system exception occurred
    */
    public void removeByInterviewId(long interviewId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of interview schedules where interviewId = &#63;.
    *
    * @param interviewId the interview ID
    * @return the number of matching interview schedules
    * @throws SystemException if a system exception occurred
    */
    public int countByInterviewId(long interviewId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the interview schedule where vacancyCandidateId = &#63; or throws a {@link vn.com.ecopharma.hrm.NoSuchInterviewScheduleException} if it could not be found.
    *
    * @param vacancyCandidateId the vacancy candidate ID
    * @return the matching interview schedule
    * @throws vn.com.ecopharma.hrm.NoSuchInterviewScheduleException if a matching interview schedule could not be found
    * @throws SystemException if a system exception occurred
    */
    public vn.com.ecopharma.hrm.model.InterviewSchedule findByVacancyCandidate(
        long vacancyCandidateId)
        throws com.liferay.portal.kernel.exception.SystemException,
            vn.com.ecopharma.hrm.NoSuchInterviewScheduleException;

    /**
    * Returns the interview schedule where vacancyCandidateId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
    *
    * @param vacancyCandidateId the vacancy candidate ID
    * @return the matching interview schedule, or <code>null</code> if a matching interview schedule could not be found
    * @throws SystemException if a system exception occurred
    */
    public vn.com.ecopharma.hrm.model.InterviewSchedule fetchByVacancyCandidate(
        long vacancyCandidateId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the interview schedule where vacancyCandidateId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
    *
    * @param vacancyCandidateId the vacancy candidate ID
    * @param retrieveFromCache whether to use the finder cache
    * @return the matching interview schedule, or <code>null</code> if a matching interview schedule could not be found
    * @throws SystemException if a system exception occurred
    */
    public vn.com.ecopharma.hrm.model.InterviewSchedule fetchByVacancyCandidate(
        long vacancyCandidateId, boolean retrieveFromCache)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes the interview schedule where vacancyCandidateId = &#63; from the database.
    *
    * @param vacancyCandidateId the vacancy candidate ID
    * @return the interview schedule that was removed
    * @throws SystemException if a system exception occurred
    */
    public vn.com.ecopharma.hrm.model.InterviewSchedule removeByVacancyCandidate(
        long vacancyCandidateId)
        throws com.liferay.portal.kernel.exception.SystemException,
            vn.com.ecopharma.hrm.NoSuchInterviewScheduleException;

    /**
    * Returns the number of interview schedules where vacancyCandidateId = &#63;.
    *
    * @param vacancyCandidateId the vacancy candidate ID
    * @return the number of matching interview schedules
    * @throws SystemException if a system exception occurred
    */
    public int countByVacancyCandidate(long vacancyCandidateId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the interview schedule where interviewId = &#63; and vacancyCandidateId = &#63; or throws a {@link vn.com.ecopharma.hrm.NoSuchInterviewScheduleException} if it could not be found.
    *
    * @param interviewId the interview ID
    * @param vacancyCandidateId the vacancy candidate ID
    * @return the matching interview schedule
    * @throws vn.com.ecopharma.hrm.NoSuchInterviewScheduleException if a matching interview schedule could not be found
    * @throws SystemException if a system exception occurred
    */
    public vn.com.ecopharma.hrm.model.InterviewSchedule findByInterview_And_VacancyCandidate(
        long interviewId, long vacancyCandidateId)
        throws com.liferay.portal.kernel.exception.SystemException,
            vn.com.ecopharma.hrm.NoSuchInterviewScheduleException;

    /**
    * Returns the interview schedule where interviewId = &#63; and vacancyCandidateId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
    *
    * @param interviewId the interview ID
    * @param vacancyCandidateId the vacancy candidate ID
    * @return the matching interview schedule, or <code>null</code> if a matching interview schedule could not be found
    * @throws SystemException if a system exception occurred
    */
    public vn.com.ecopharma.hrm.model.InterviewSchedule fetchByInterview_And_VacancyCandidate(
        long interviewId, long vacancyCandidateId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the interview schedule where interviewId = &#63; and vacancyCandidateId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
    *
    * @param interviewId the interview ID
    * @param vacancyCandidateId the vacancy candidate ID
    * @param retrieveFromCache whether to use the finder cache
    * @return the matching interview schedule, or <code>null</code> if a matching interview schedule could not be found
    * @throws SystemException if a system exception occurred
    */
    public vn.com.ecopharma.hrm.model.InterviewSchedule fetchByInterview_And_VacancyCandidate(
        long interviewId, long vacancyCandidateId, boolean retrieveFromCache)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes the interview schedule where interviewId = &#63; and vacancyCandidateId = &#63; from the database.
    *
    * @param interviewId the interview ID
    * @param vacancyCandidateId the vacancy candidate ID
    * @return the interview schedule that was removed
    * @throws SystemException if a system exception occurred
    */
    public vn.com.ecopharma.hrm.model.InterviewSchedule removeByInterview_And_VacancyCandidate(
        long interviewId, long vacancyCandidateId)
        throws com.liferay.portal.kernel.exception.SystemException,
            vn.com.ecopharma.hrm.NoSuchInterviewScheduleException;

    /**
    * Returns the number of interview schedules where interviewId = &#63; and vacancyCandidateId = &#63;.
    *
    * @param interviewId the interview ID
    * @param vacancyCandidateId the vacancy candidate ID
    * @return the number of matching interview schedules
    * @throws SystemException if a system exception occurred
    */
    public int countByInterview_And_VacancyCandidate(long interviewId,
        long vacancyCandidateId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Caches the interview schedule in the entity cache if it is enabled.
    *
    * @param interviewSchedule the interview schedule
    */
    public void cacheResult(
        vn.com.ecopharma.hrm.model.InterviewSchedule interviewSchedule);

    /**
    * Caches the interview schedules in the entity cache if it is enabled.
    *
    * @param interviewSchedules the interview schedules
    */
    public void cacheResult(
        java.util.List<vn.com.ecopharma.hrm.model.InterviewSchedule> interviewSchedules);

    /**
    * Creates a new interview schedule with the primary key. Does not add the interview schedule to the database.
    *
    * @param interviewScheduleId the primary key for the new interview schedule
    * @return the new interview schedule
    */
    public vn.com.ecopharma.hrm.model.InterviewSchedule create(
        long interviewScheduleId);

    /**
    * Removes the interview schedule with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param interviewScheduleId the primary key of the interview schedule
    * @return the interview schedule that was removed
    * @throws vn.com.ecopharma.hrm.NoSuchInterviewScheduleException if a interview schedule with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public vn.com.ecopharma.hrm.model.InterviewSchedule remove(
        long interviewScheduleId)
        throws com.liferay.portal.kernel.exception.SystemException,
            vn.com.ecopharma.hrm.NoSuchInterviewScheduleException;

    public vn.com.ecopharma.hrm.model.InterviewSchedule updateImpl(
        vn.com.ecopharma.hrm.model.InterviewSchedule interviewSchedule)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the interview schedule with the primary key or throws a {@link vn.com.ecopharma.hrm.NoSuchInterviewScheduleException} if it could not be found.
    *
    * @param interviewScheduleId the primary key of the interview schedule
    * @return the interview schedule
    * @throws vn.com.ecopharma.hrm.NoSuchInterviewScheduleException if a interview schedule with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public vn.com.ecopharma.hrm.model.InterviewSchedule findByPrimaryKey(
        long interviewScheduleId)
        throws com.liferay.portal.kernel.exception.SystemException,
            vn.com.ecopharma.hrm.NoSuchInterviewScheduleException;

    /**
    * Returns the interview schedule with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param interviewScheduleId the primary key of the interview schedule
    * @return the interview schedule, or <code>null</code> if a interview schedule with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public vn.com.ecopharma.hrm.model.InterviewSchedule fetchByPrimaryKey(
        long interviewScheduleId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the interview schedules.
    *
    * @return the interview schedules
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<vn.com.ecopharma.hrm.model.InterviewSchedule> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the interview schedules.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.com.ecopharma.hrm.model.impl.InterviewScheduleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of interview schedules
    * @param end the upper bound of the range of interview schedules (not inclusive)
    * @return the range of interview schedules
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<vn.com.ecopharma.hrm.model.InterviewSchedule> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the interview schedules.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.com.ecopharma.hrm.model.impl.InterviewScheduleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of interview schedules
    * @param end the upper bound of the range of interview schedules (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of interview schedules
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<vn.com.ecopharma.hrm.model.InterviewSchedule> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the interview schedules from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of interview schedules.
    *
    * @return the number of interview schedules
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}
