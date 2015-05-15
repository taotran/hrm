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
    * Returns all the candidates where c_id = &#63;.
    *
    * @param c_id the c_id
    * @return the matching candidates
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<vn.com.ecopharma.hrm.model.Candidate> findByfindCandidates(
        long c_id) throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the candidates where c_id = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.com.ecopharma.hrm.model.impl.CandidateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param c_id the c_id
    * @param start the lower bound of the range of candidates
    * @param end the upper bound of the range of candidates (not inclusive)
    * @return the range of matching candidates
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<vn.com.ecopharma.hrm.model.Candidate> findByfindCandidates(
        long c_id, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the candidates where c_id = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.com.ecopharma.hrm.model.impl.CandidateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param c_id the c_id
    * @param start the lower bound of the range of candidates
    * @param end the upper bound of the range of candidates (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching candidates
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<vn.com.ecopharma.hrm.model.Candidate> findByfindCandidates(
        long c_id, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first candidate in the ordered set where c_id = &#63;.
    *
    * @param c_id the c_id
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching candidate
    * @throws vn.com.ecopharma.hrm.NoSuchCandidateException if a matching candidate could not be found
    * @throws SystemException if a system exception occurred
    */
    public vn.com.ecopharma.hrm.model.Candidate findByfindCandidates_First(
        long c_id,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            vn.com.ecopharma.hrm.NoSuchCandidateException;

    /**
    * Returns the first candidate in the ordered set where c_id = &#63;.
    *
    * @param c_id the c_id
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching candidate, or <code>null</code> if a matching candidate could not be found
    * @throws SystemException if a system exception occurred
    */
    public vn.com.ecopharma.hrm.model.Candidate fetchByfindCandidates_First(
        long c_id,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last candidate in the ordered set where c_id = &#63;.
    *
    * @param c_id the c_id
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching candidate
    * @throws vn.com.ecopharma.hrm.NoSuchCandidateException if a matching candidate could not be found
    * @throws SystemException if a system exception occurred
    */
    public vn.com.ecopharma.hrm.model.Candidate findByfindCandidates_Last(
        long c_id,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            vn.com.ecopharma.hrm.NoSuchCandidateException;

    /**
    * Returns the last candidate in the ordered set where c_id = &#63;.
    *
    * @param c_id the c_id
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching candidate, or <code>null</code> if a matching candidate could not be found
    * @throws SystemException if a system exception occurred
    */
    public vn.com.ecopharma.hrm.model.Candidate fetchByfindCandidates_Last(
        long c_id,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the candidates where c_id = &#63; from the database.
    *
    * @param c_id the c_id
    * @throws SystemException if a system exception occurred
    */
    public void removeByfindCandidates(long c_id)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of candidates where c_id = &#63;.
    *
    * @param c_id the c_id
    * @return the number of matching candidates
    * @throws SystemException if a system exception occurred
    */
    public int countByfindCandidates(long c_id)
        throws com.liferay.portal.kernel.exception.SystemException;

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

    /**
    * Returns all the vacancies associated with the candidate.
    *
    * @param pk the primary key of the candidate
    * @return the vacancies associated with the candidate
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<vn.com.ecopharma.hrm.model.Vacancy> getVacancies(
        long pk) throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the vacancies associated with the candidate.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.com.ecopharma.hrm.model.impl.CandidateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param pk the primary key of the candidate
    * @param start the lower bound of the range of candidates
    * @param end the upper bound of the range of candidates (not inclusive)
    * @return the range of vacancies associated with the candidate
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<vn.com.ecopharma.hrm.model.Vacancy> getVacancies(
        long pk, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the vacancies associated with the candidate.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.com.ecopharma.hrm.model.impl.CandidateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param pk the primary key of the candidate
    * @param start the lower bound of the range of candidates
    * @param end the upper bound of the range of candidates (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of vacancies associated with the candidate
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<vn.com.ecopharma.hrm.model.Vacancy> getVacancies(
        long pk, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of vacancies associated with the candidate.
    *
    * @param pk the primary key of the candidate
    * @return the number of vacancies associated with the candidate
    * @throws SystemException if a system exception occurred
    */
    public int getVacanciesSize(long pk)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns <code>true</code> if the vacancy is associated with the candidate.
    *
    * @param pk the primary key of the candidate
    * @param vacancyPK the primary key of the vacancy
    * @return <code>true</code> if the vacancy is associated with the candidate; <code>false</code> otherwise
    * @throws SystemException if a system exception occurred
    */
    public boolean containsVacancy(long pk, long vacancyPK)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns <code>true</code> if the candidate has any vacancies associated with it.
    *
    * @param pk the primary key of the candidate to check for associations with vacancies
    * @return <code>true</code> if the candidate has any vacancies associated with it; <code>false</code> otherwise
    * @throws SystemException if a system exception occurred
    */
    public boolean containsVacancies(long pk)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Adds an association between the candidate and the vacancy. Also notifies the appropriate model listeners and clears the mapping table finder cache.
    *
    * @param pk the primary key of the candidate
    * @param vacancyPK the primary key of the vacancy
    * @throws SystemException if a system exception occurred
    */
    public void addVacancy(long pk, long vacancyPK)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Adds an association between the candidate and the vacancy. Also notifies the appropriate model listeners and clears the mapping table finder cache.
    *
    * @param pk the primary key of the candidate
    * @param vacancy the vacancy
    * @throws SystemException if a system exception occurred
    */
    public void addVacancy(long pk, vn.com.ecopharma.hrm.model.Vacancy vacancy)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Adds an association between the candidate and the vacancies. Also notifies the appropriate model listeners and clears the mapping table finder cache.
    *
    * @param pk the primary key of the candidate
    * @param vacancyPKs the primary keys of the vacancies
    * @throws SystemException if a system exception occurred
    */
    public void addVacancies(long pk, long[] vacancyPKs)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Adds an association between the candidate and the vacancies. Also notifies the appropriate model listeners and clears the mapping table finder cache.
    *
    * @param pk the primary key of the candidate
    * @param vacancies the vacancies
    * @throws SystemException if a system exception occurred
    */
    public void addVacancies(long pk,
        java.util.List<vn.com.ecopharma.hrm.model.Vacancy> vacancies)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Clears all associations between the candidate and its vacancies. Also notifies the appropriate model listeners and clears the mapping table finder cache.
    *
    * @param pk the primary key of the candidate to clear the associated vacancies from
    * @throws SystemException if a system exception occurred
    */
    public void clearVacancies(long pk)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes the association between the candidate and the vacancy. Also notifies the appropriate model listeners and clears the mapping table finder cache.
    *
    * @param pk the primary key of the candidate
    * @param vacancyPK the primary key of the vacancy
    * @throws SystemException if a system exception occurred
    */
    public void removeVacancy(long pk, long vacancyPK)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes the association between the candidate and the vacancy. Also notifies the appropriate model listeners and clears the mapping table finder cache.
    *
    * @param pk the primary key of the candidate
    * @param vacancy the vacancy
    * @throws SystemException if a system exception occurred
    */
    public void removeVacancy(long pk,
        vn.com.ecopharma.hrm.model.Vacancy vacancy)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes the association between the candidate and the vacancies. Also notifies the appropriate model listeners and clears the mapping table finder cache.
    *
    * @param pk the primary key of the candidate
    * @param vacancyPKs the primary keys of the vacancies
    * @throws SystemException if a system exception occurred
    */
    public void removeVacancies(long pk, long[] vacancyPKs)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes the association between the candidate and the vacancies. Also notifies the appropriate model listeners and clears the mapping table finder cache.
    *
    * @param pk the primary key of the candidate
    * @param vacancies the vacancies
    * @throws SystemException if a system exception occurred
    */
    public void removeVacancies(long pk,
        java.util.List<vn.com.ecopharma.hrm.model.Vacancy> vacancies)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Sets the vacancies associated with the candidate, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
    *
    * @param pk the primary key of the candidate
    * @param vacancyPKs the primary keys of the vacancies to be associated with the candidate
    * @throws SystemException if a system exception occurred
    */
    public void setVacancies(long pk, long[] vacancyPKs)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Sets the vacancies associated with the candidate, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
    *
    * @param pk the primary key of the candidate
    * @param vacancies the vacancies to be associated with the candidate
    * @throws SystemException if a system exception occurred
    */
    public void setVacancies(long pk,
        java.util.List<vn.com.ecopharma.hrm.model.Vacancy> vacancies)
        throws com.liferay.portal.kernel.exception.SystemException;
}
