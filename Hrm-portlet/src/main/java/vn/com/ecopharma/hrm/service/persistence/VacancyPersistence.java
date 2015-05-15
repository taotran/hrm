package vn.com.ecopharma.hrm.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import vn.com.ecopharma.hrm.model.Vacancy;

/**
 * The persistence interface for the vacancy service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author tvt
 * @see VacancyPersistenceImpl
 * @see VacancyUtil
 * @generated
 */
public interface VacancyPersistence extends BasePersistence<Vacancy> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link VacancyUtil} to access the vacancy persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Caches the vacancy in the entity cache if it is enabled.
    *
    * @param vacancy the vacancy
    */
    public void cacheResult(vn.com.ecopharma.hrm.model.Vacancy vacancy);

    /**
    * Caches the vacancies in the entity cache if it is enabled.
    *
    * @param vacancies the vacancies
    */
    public void cacheResult(
        java.util.List<vn.com.ecopharma.hrm.model.Vacancy> vacancies);

    /**
    * Creates a new vacancy with the primary key. Does not add the vacancy to the database.
    *
    * @param v_id the primary key for the new vacancy
    * @return the new vacancy
    */
    public vn.com.ecopharma.hrm.model.Vacancy create(long v_id);

    /**
    * Removes the vacancy with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param v_id the primary key of the vacancy
    * @return the vacancy that was removed
    * @throws vn.com.ecopharma.hrm.NoSuchVacancyException if a vacancy with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public vn.com.ecopharma.hrm.model.Vacancy remove(long v_id)
        throws com.liferay.portal.kernel.exception.SystemException,
            vn.com.ecopharma.hrm.NoSuchVacancyException;

    public vn.com.ecopharma.hrm.model.Vacancy updateImpl(
        vn.com.ecopharma.hrm.model.Vacancy vacancy)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the vacancy with the primary key or throws a {@link vn.com.ecopharma.hrm.NoSuchVacancyException} if it could not be found.
    *
    * @param v_id the primary key of the vacancy
    * @return the vacancy
    * @throws vn.com.ecopharma.hrm.NoSuchVacancyException if a vacancy with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public vn.com.ecopharma.hrm.model.Vacancy findByPrimaryKey(long v_id)
        throws com.liferay.portal.kernel.exception.SystemException,
            vn.com.ecopharma.hrm.NoSuchVacancyException;

    /**
    * Returns the vacancy with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param v_id the primary key of the vacancy
    * @return the vacancy, or <code>null</code> if a vacancy with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public vn.com.ecopharma.hrm.model.Vacancy fetchByPrimaryKey(long v_id)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the vacancies.
    *
    * @return the vacancies
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<vn.com.ecopharma.hrm.model.Vacancy> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the vacancies.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.com.ecopharma.hrm.model.impl.VacancyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of vacancies
    * @param end the upper bound of the range of vacancies (not inclusive)
    * @return the range of vacancies
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<vn.com.ecopharma.hrm.model.Vacancy> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the vacancies.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.com.ecopharma.hrm.model.impl.VacancyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of vacancies
    * @param end the upper bound of the range of vacancies (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of vacancies
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<vn.com.ecopharma.hrm.model.Vacancy> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the vacancies from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of vacancies.
    *
    * @return the number of vacancies
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the candidates associated with the vacancy.
    *
    * @param pk the primary key of the vacancy
    * @return the candidates associated with the vacancy
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<vn.com.ecopharma.hrm.model.Candidate> getCandidates(
        long pk) throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the candidates associated with the vacancy.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.com.ecopharma.hrm.model.impl.VacancyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param pk the primary key of the vacancy
    * @param start the lower bound of the range of vacancies
    * @param end the upper bound of the range of vacancies (not inclusive)
    * @return the range of candidates associated with the vacancy
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<vn.com.ecopharma.hrm.model.Candidate> getCandidates(
        long pk, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the candidates associated with the vacancy.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.com.ecopharma.hrm.model.impl.VacancyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param pk the primary key of the vacancy
    * @param start the lower bound of the range of vacancies
    * @param end the upper bound of the range of vacancies (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of candidates associated with the vacancy
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<vn.com.ecopharma.hrm.model.Candidate> getCandidates(
        long pk, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of candidates associated with the vacancy.
    *
    * @param pk the primary key of the vacancy
    * @return the number of candidates associated with the vacancy
    * @throws SystemException if a system exception occurred
    */
    public int getCandidatesSize(long pk)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns <code>true</code> if the candidate is associated with the vacancy.
    *
    * @param pk the primary key of the vacancy
    * @param candidatePK the primary key of the candidate
    * @return <code>true</code> if the candidate is associated with the vacancy; <code>false</code> otherwise
    * @throws SystemException if a system exception occurred
    */
    public boolean containsCandidate(long pk, long candidatePK)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns <code>true</code> if the vacancy has any candidates associated with it.
    *
    * @param pk the primary key of the vacancy to check for associations with candidates
    * @return <code>true</code> if the vacancy has any candidates associated with it; <code>false</code> otherwise
    * @throws SystemException if a system exception occurred
    */
    public boolean containsCandidates(long pk)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Adds an association between the vacancy and the candidate. Also notifies the appropriate model listeners and clears the mapping table finder cache.
    *
    * @param pk the primary key of the vacancy
    * @param candidatePK the primary key of the candidate
    * @throws SystemException if a system exception occurred
    */
    public void addCandidate(long pk, long candidatePK)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Adds an association between the vacancy and the candidate. Also notifies the appropriate model listeners and clears the mapping table finder cache.
    *
    * @param pk the primary key of the vacancy
    * @param candidate the candidate
    * @throws SystemException if a system exception occurred
    */
    public void addCandidate(long pk,
        vn.com.ecopharma.hrm.model.Candidate candidate)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Adds an association between the vacancy and the candidates. Also notifies the appropriate model listeners and clears the mapping table finder cache.
    *
    * @param pk the primary key of the vacancy
    * @param candidatePKs the primary keys of the candidates
    * @throws SystemException if a system exception occurred
    */
    public void addCandidates(long pk, long[] candidatePKs)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Adds an association between the vacancy and the candidates. Also notifies the appropriate model listeners and clears the mapping table finder cache.
    *
    * @param pk the primary key of the vacancy
    * @param candidates the candidates
    * @throws SystemException if a system exception occurred
    */
    public void addCandidates(long pk,
        java.util.List<vn.com.ecopharma.hrm.model.Candidate> candidates)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Clears all associations between the vacancy and its candidates. Also notifies the appropriate model listeners and clears the mapping table finder cache.
    *
    * @param pk the primary key of the vacancy to clear the associated candidates from
    * @throws SystemException if a system exception occurred
    */
    public void clearCandidates(long pk)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes the association between the vacancy and the candidate. Also notifies the appropriate model listeners and clears the mapping table finder cache.
    *
    * @param pk the primary key of the vacancy
    * @param candidatePK the primary key of the candidate
    * @throws SystemException if a system exception occurred
    */
    public void removeCandidate(long pk, long candidatePK)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes the association between the vacancy and the candidate. Also notifies the appropriate model listeners and clears the mapping table finder cache.
    *
    * @param pk the primary key of the vacancy
    * @param candidate the candidate
    * @throws SystemException if a system exception occurred
    */
    public void removeCandidate(long pk,
        vn.com.ecopharma.hrm.model.Candidate candidate)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes the association between the vacancy and the candidates. Also notifies the appropriate model listeners and clears the mapping table finder cache.
    *
    * @param pk the primary key of the vacancy
    * @param candidatePKs the primary keys of the candidates
    * @throws SystemException if a system exception occurred
    */
    public void removeCandidates(long pk, long[] candidatePKs)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes the association between the vacancy and the candidates. Also notifies the appropriate model listeners and clears the mapping table finder cache.
    *
    * @param pk the primary key of the vacancy
    * @param candidates the candidates
    * @throws SystemException if a system exception occurred
    */
    public void removeCandidates(long pk,
        java.util.List<vn.com.ecopharma.hrm.model.Candidate> candidates)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Sets the candidates associated with the vacancy, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
    *
    * @param pk the primary key of the vacancy
    * @param candidatePKs the primary keys of the candidates to be associated with the vacancy
    * @throws SystemException if a system exception occurred
    */
    public void setCandidates(long pk, long[] candidatePKs)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Sets the candidates associated with the vacancy, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
    *
    * @param pk the primary key of the vacancy
    * @param candidates the candidates to be associated with the vacancy
    * @throws SystemException if a system exception occurred
    */
    public void setCandidates(long pk,
        java.util.List<vn.com.ecopharma.hrm.model.Candidate> candidates)
        throws com.liferay.portal.kernel.exception.SystemException;
}
