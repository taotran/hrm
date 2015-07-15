package vn.com.ecopharma.hrm.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import vn.com.ecopharma.hrm.model.Candidate;

/**
 * The persistence interface for the candidate service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author tvt
 * @see CandidatePersistenceImpl
 * @see CandidateUtil
 * @generated
 */
public interface CandidatePersistence extends BasePersistence<Candidate> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link CandidateUtil} to access the candidate persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Caches the candidate in the entity cache if it is enabled.
    *
    * @param candidate the candidate
    */
    public void cacheResult(vn.com.ecopharma.hrm.model.Candidate candidate);

    /**
    * Caches the candidates in the entity cache if it is enabled.
    *
    * @param candidates the candidates
    */
    public void cacheResult(
        java.util.List<vn.com.ecopharma.hrm.model.Candidate> candidates);

    /**
    * Creates a new candidate with the primary key. Does not add the candidate to the database.
    *
    * @param c_id the primary key for the new candidate
    * @return the new candidate
    */
    public vn.com.ecopharma.hrm.model.Candidate create(long c_id);

    /**
    * Removes the candidate with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param c_id the primary key of the candidate
    * @return the candidate that was removed
    * @throws vn.com.ecopharma.hrm.NoSuchCandidateException if a candidate with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public vn.com.ecopharma.hrm.model.Candidate remove(long c_id)
        throws com.liferay.portal.kernel.exception.SystemException,
            vn.com.ecopharma.hrm.NoSuchCandidateException;

    public vn.com.ecopharma.hrm.model.Candidate updateImpl(
        vn.com.ecopharma.hrm.model.Candidate candidate)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the candidate with the primary key or throws a {@link vn.com.ecopharma.hrm.NoSuchCandidateException} if it could not be found.
    *
    * @param c_id the primary key of the candidate
    * @return the candidate
    * @throws vn.com.ecopharma.hrm.NoSuchCandidateException if a candidate with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public vn.com.ecopharma.hrm.model.Candidate findByPrimaryKey(long c_id)
        throws com.liferay.portal.kernel.exception.SystemException,
            vn.com.ecopharma.hrm.NoSuchCandidateException;

    /**
    * Returns the candidate with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param c_id the primary key of the candidate
    * @return the candidate, or <code>null</code> if a candidate with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public vn.com.ecopharma.hrm.model.Candidate fetchByPrimaryKey(long c_id)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the candidates.
    *
    * @return the candidates
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<vn.com.ecopharma.hrm.model.Candidate> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<vn.com.ecopharma.hrm.model.Candidate> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the candidates.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.com.ecopharma.hrm.model.impl.CandidateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of candidates
    * @param end the upper bound of the range of candidates (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of candidates
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<vn.com.ecopharma.hrm.model.Candidate> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the candidates from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of candidates.
    *
    * @return the number of candidates
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}
