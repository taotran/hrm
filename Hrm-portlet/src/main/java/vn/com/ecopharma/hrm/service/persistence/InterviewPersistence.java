package vn.com.ecopharma.hrm.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import vn.com.ecopharma.hrm.model.Interview;

/**
 * The persistence interface for the interview service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author tvt
 * @see InterviewPersistenceImpl
 * @see InterviewUtil
 * @generated
 */
public interface InterviewPersistence extends BasePersistence<Interview> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link InterviewUtil} to access the interview persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Caches the interview in the entity cache if it is enabled.
    *
    * @param interview the interview
    */
    public void cacheResult(vn.com.ecopharma.hrm.model.Interview interview);

    /**
    * Caches the interviews in the entity cache if it is enabled.
    *
    * @param interviews the interviews
    */
    public void cacheResult(
        java.util.List<vn.com.ecopharma.hrm.model.Interview> interviews);

    /**
    * Creates a new interview with the primary key. Does not add the interview to the database.
    *
    * @param interviewId the primary key for the new interview
    * @return the new interview
    */
    public vn.com.ecopharma.hrm.model.Interview create(long interviewId);

    /**
    * Removes the interview with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param interviewId the primary key of the interview
    * @return the interview that was removed
    * @throws vn.com.ecopharma.hrm.NoSuchInterviewException if a interview with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public vn.com.ecopharma.hrm.model.Interview remove(long interviewId)
        throws com.liferay.portal.kernel.exception.SystemException,
            vn.com.ecopharma.hrm.NoSuchInterviewException;

    public vn.com.ecopharma.hrm.model.Interview updateImpl(
        vn.com.ecopharma.hrm.model.Interview interview)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the interview with the primary key or throws a {@link vn.com.ecopharma.hrm.NoSuchInterviewException} if it could not be found.
    *
    * @param interviewId the primary key of the interview
    * @return the interview
    * @throws vn.com.ecopharma.hrm.NoSuchInterviewException if a interview with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public vn.com.ecopharma.hrm.model.Interview findByPrimaryKey(
        long interviewId)
        throws com.liferay.portal.kernel.exception.SystemException,
            vn.com.ecopharma.hrm.NoSuchInterviewException;

    /**
    * Returns the interview with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param interviewId the primary key of the interview
    * @return the interview, or <code>null</code> if a interview with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public vn.com.ecopharma.hrm.model.Interview fetchByPrimaryKey(
        long interviewId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the interviews.
    *
    * @return the interviews
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<vn.com.ecopharma.hrm.model.Interview> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the interviews.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.com.ecopharma.hrm.model.impl.InterviewModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of interviews
    * @param end the upper bound of the range of interviews (not inclusive)
    * @return the range of interviews
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<vn.com.ecopharma.hrm.model.Interview> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the interviews.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.com.ecopharma.hrm.model.impl.InterviewModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of interviews
    * @param end the upper bound of the range of interviews (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of interviews
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<vn.com.ecopharma.hrm.model.Interview> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the interviews from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of interviews.
    *
    * @return the number of interviews
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}
