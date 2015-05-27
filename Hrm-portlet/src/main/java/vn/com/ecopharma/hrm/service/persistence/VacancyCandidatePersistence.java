package vn.com.ecopharma.hrm.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import vn.com.ecopharma.hrm.model.VacancyCandidate;

/**
 * The persistence interface for the vacancy candidate service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author tvt
 * @see VacancyCandidatePersistenceImpl
 * @see VacancyCandidateUtil
 * @generated
 */
public interface VacancyCandidatePersistence extends BasePersistence<VacancyCandidate> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link VacancyCandidateUtil} to access the vacancy candidate persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Returns all the vacancy candidates where c_id = &#63;.
    *
    * @param c_id the c_id
    * @return the matching vacancy candidates
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<vn.com.ecopharma.hrm.model.VacancyCandidate> findByC_Id(
        long c_id) throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the vacancy candidates where c_id = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.com.ecopharma.hrm.model.impl.VacancyCandidateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param c_id the c_id
    * @param start the lower bound of the range of vacancy candidates
    * @param end the upper bound of the range of vacancy candidates (not inclusive)
    * @return the range of matching vacancy candidates
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<vn.com.ecopharma.hrm.model.VacancyCandidate> findByC_Id(
        long c_id, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the vacancy candidates where c_id = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.com.ecopharma.hrm.model.impl.VacancyCandidateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param c_id the c_id
    * @param start the lower bound of the range of vacancy candidates
    * @param end the upper bound of the range of vacancy candidates (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching vacancy candidates
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<vn.com.ecopharma.hrm.model.VacancyCandidate> findByC_Id(
        long c_id, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first vacancy candidate in the ordered set where c_id = &#63;.
    *
    * @param c_id the c_id
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching vacancy candidate
    * @throws vn.com.ecopharma.hrm.NoSuchVacancyCandidateException if a matching vacancy candidate could not be found
    * @throws SystemException if a system exception occurred
    */
    public vn.com.ecopharma.hrm.model.VacancyCandidate findByC_Id_First(
        long c_id,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            vn.com.ecopharma.hrm.NoSuchVacancyCandidateException;

    /**
    * Returns the first vacancy candidate in the ordered set where c_id = &#63;.
    *
    * @param c_id the c_id
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching vacancy candidate, or <code>null</code> if a matching vacancy candidate could not be found
    * @throws SystemException if a system exception occurred
    */
    public vn.com.ecopharma.hrm.model.VacancyCandidate fetchByC_Id_First(
        long c_id,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last vacancy candidate in the ordered set where c_id = &#63;.
    *
    * @param c_id the c_id
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching vacancy candidate
    * @throws vn.com.ecopharma.hrm.NoSuchVacancyCandidateException if a matching vacancy candidate could not be found
    * @throws SystemException if a system exception occurred
    */
    public vn.com.ecopharma.hrm.model.VacancyCandidate findByC_Id_Last(
        long c_id,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            vn.com.ecopharma.hrm.NoSuchVacancyCandidateException;

    /**
    * Returns the last vacancy candidate in the ordered set where c_id = &#63;.
    *
    * @param c_id the c_id
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching vacancy candidate, or <code>null</code> if a matching vacancy candidate could not be found
    * @throws SystemException if a system exception occurred
    */
    public vn.com.ecopharma.hrm.model.VacancyCandidate fetchByC_Id_Last(
        long c_id,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the vacancy candidates before and after the current vacancy candidate in the ordered set where c_id = &#63;.
    *
    * @param vacancyCandidateId the primary key of the current vacancy candidate
    * @param c_id the c_id
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next vacancy candidate
    * @throws vn.com.ecopharma.hrm.NoSuchVacancyCandidateException if a vacancy candidate with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public vn.com.ecopharma.hrm.model.VacancyCandidate[] findByC_Id_PrevAndNext(
        long vacancyCandidateId, long c_id,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            vn.com.ecopharma.hrm.NoSuchVacancyCandidateException;

    /**
    * Removes all the vacancy candidates where c_id = &#63; from the database.
    *
    * @param c_id the c_id
    * @throws SystemException if a system exception occurred
    */
    public void removeByC_Id(long c_id)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of vacancy candidates where c_id = &#63;.
    *
    * @param c_id the c_id
    * @return the number of matching vacancy candidates
    * @throws SystemException if a system exception occurred
    */
    public int countByC_Id(long c_id)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the vacancy candidates where v_id = &#63;.
    *
    * @param v_id the v_id
    * @return the matching vacancy candidates
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<vn.com.ecopharma.hrm.model.VacancyCandidate> findByV_Id(
        long v_id) throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the vacancy candidates where v_id = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.com.ecopharma.hrm.model.impl.VacancyCandidateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param v_id the v_id
    * @param start the lower bound of the range of vacancy candidates
    * @param end the upper bound of the range of vacancy candidates (not inclusive)
    * @return the range of matching vacancy candidates
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<vn.com.ecopharma.hrm.model.VacancyCandidate> findByV_Id(
        long v_id, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the vacancy candidates where v_id = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.com.ecopharma.hrm.model.impl.VacancyCandidateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param v_id the v_id
    * @param start the lower bound of the range of vacancy candidates
    * @param end the upper bound of the range of vacancy candidates (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching vacancy candidates
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<vn.com.ecopharma.hrm.model.VacancyCandidate> findByV_Id(
        long v_id, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first vacancy candidate in the ordered set where v_id = &#63;.
    *
    * @param v_id the v_id
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching vacancy candidate
    * @throws vn.com.ecopharma.hrm.NoSuchVacancyCandidateException if a matching vacancy candidate could not be found
    * @throws SystemException if a system exception occurred
    */
    public vn.com.ecopharma.hrm.model.VacancyCandidate findByV_Id_First(
        long v_id,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            vn.com.ecopharma.hrm.NoSuchVacancyCandidateException;

    /**
    * Returns the first vacancy candidate in the ordered set where v_id = &#63;.
    *
    * @param v_id the v_id
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching vacancy candidate, or <code>null</code> if a matching vacancy candidate could not be found
    * @throws SystemException if a system exception occurred
    */
    public vn.com.ecopharma.hrm.model.VacancyCandidate fetchByV_Id_First(
        long v_id,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last vacancy candidate in the ordered set where v_id = &#63;.
    *
    * @param v_id the v_id
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching vacancy candidate
    * @throws vn.com.ecopharma.hrm.NoSuchVacancyCandidateException if a matching vacancy candidate could not be found
    * @throws SystemException if a system exception occurred
    */
    public vn.com.ecopharma.hrm.model.VacancyCandidate findByV_Id_Last(
        long v_id,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            vn.com.ecopharma.hrm.NoSuchVacancyCandidateException;

    /**
    * Returns the last vacancy candidate in the ordered set where v_id = &#63;.
    *
    * @param v_id the v_id
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching vacancy candidate, or <code>null</code> if a matching vacancy candidate could not be found
    * @throws SystemException if a system exception occurred
    */
    public vn.com.ecopharma.hrm.model.VacancyCandidate fetchByV_Id_Last(
        long v_id,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the vacancy candidates before and after the current vacancy candidate in the ordered set where v_id = &#63;.
    *
    * @param vacancyCandidateId the primary key of the current vacancy candidate
    * @param v_id the v_id
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next vacancy candidate
    * @throws vn.com.ecopharma.hrm.NoSuchVacancyCandidateException if a vacancy candidate with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public vn.com.ecopharma.hrm.model.VacancyCandidate[] findByV_Id_PrevAndNext(
        long vacancyCandidateId, long v_id,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            vn.com.ecopharma.hrm.NoSuchVacancyCandidateException;

    /**
    * Removes all the vacancy candidates where v_id = &#63; from the database.
    *
    * @param v_id the v_id
    * @throws SystemException if a system exception occurred
    */
    public void removeByV_Id(long v_id)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of vacancy candidates where v_id = &#63;.
    *
    * @param v_id the v_id
    * @return the number of matching vacancy candidates
    * @throws SystemException if a system exception occurred
    */
    public int countByV_Id(long v_id)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Caches the vacancy candidate in the entity cache if it is enabled.
    *
    * @param vacancyCandidate the vacancy candidate
    */
    public void cacheResult(
        vn.com.ecopharma.hrm.model.VacancyCandidate vacancyCandidate);

    /**
    * Caches the vacancy candidates in the entity cache if it is enabled.
    *
    * @param vacancyCandidates the vacancy candidates
    */
    public void cacheResult(
        java.util.List<vn.com.ecopharma.hrm.model.VacancyCandidate> vacancyCandidates);

    /**
    * Creates a new vacancy candidate with the primary key. Does not add the vacancy candidate to the database.
    *
    * @param vacancyCandidateId the primary key for the new vacancy candidate
    * @return the new vacancy candidate
    */
    public vn.com.ecopharma.hrm.model.VacancyCandidate create(
        long vacancyCandidateId);

    /**
    * Removes the vacancy candidate with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param vacancyCandidateId the primary key of the vacancy candidate
    * @return the vacancy candidate that was removed
    * @throws vn.com.ecopharma.hrm.NoSuchVacancyCandidateException if a vacancy candidate with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public vn.com.ecopharma.hrm.model.VacancyCandidate remove(
        long vacancyCandidateId)
        throws com.liferay.portal.kernel.exception.SystemException,
            vn.com.ecopharma.hrm.NoSuchVacancyCandidateException;

    public vn.com.ecopharma.hrm.model.VacancyCandidate updateImpl(
        vn.com.ecopharma.hrm.model.VacancyCandidate vacancyCandidate)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the vacancy candidate with the primary key or throws a {@link vn.com.ecopharma.hrm.NoSuchVacancyCandidateException} if it could not be found.
    *
    * @param vacancyCandidateId the primary key of the vacancy candidate
    * @return the vacancy candidate
    * @throws vn.com.ecopharma.hrm.NoSuchVacancyCandidateException if a vacancy candidate with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public vn.com.ecopharma.hrm.model.VacancyCandidate findByPrimaryKey(
        long vacancyCandidateId)
        throws com.liferay.portal.kernel.exception.SystemException,
            vn.com.ecopharma.hrm.NoSuchVacancyCandidateException;

    /**
    * Returns the vacancy candidate with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param vacancyCandidateId the primary key of the vacancy candidate
    * @return the vacancy candidate, or <code>null</code> if a vacancy candidate with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public vn.com.ecopharma.hrm.model.VacancyCandidate fetchByPrimaryKey(
        long vacancyCandidateId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the vacancy candidates.
    *
    * @return the vacancy candidates
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<vn.com.ecopharma.hrm.model.VacancyCandidate> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the vacancy candidates.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.com.ecopharma.hrm.model.impl.VacancyCandidateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of vacancy candidates
    * @param end the upper bound of the range of vacancy candidates (not inclusive)
    * @return the range of vacancy candidates
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<vn.com.ecopharma.hrm.model.VacancyCandidate> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the vacancy candidates.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.com.ecopharma.hrm.model.impl.VacancyCandidateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of vacancy candidates
    * @param end the upper bound of the range of vacancy candidates (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of vacancy candidates
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<vn.com.ecopharma.hrm.model.VacancyCandidate> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the vacancy candidates from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of vacancy candidates.
    *
    * @return the number of vacancy candidates
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}
