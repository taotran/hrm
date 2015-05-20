package vn.com.ecopharma.hrm.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import vn.com.ecopharma.hrm.model.Vacancy;

import java.util.List;

/**
 * The persistence utility for the vacancy service. This utility wraps {@link VacancyPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author tvt
 * @see VacancyPersistence
 * @see VacancyPersistenceImpl
 * @generated
 */
public class VacancyUtil {
    private static VacancyPersistence _persistence;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
     */
    public static void clearCache() {
        getPersistence().clearCache();
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
     */
    public static void clearCache(Vacancy vacancy) {
        getPersistence().clearCache(vacancy);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
     */
    public static long countWithDynamicQuery(DynamicQuery dynamicQuery)
        throws SystemException {
        return getPersistence().countWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
     */
    public static List<Vacancy> findWithDynamicQuery(DynamicQuery dynamicQuery)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<Vacancy> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<Vacancy> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
     */
    public static Vacancy update(Vacancy vacancy) throws SystemException {
        return getPersistence().update(vacancy);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
     */
    public static Vacancy update(Vacancy vacancy, ServiceContext serviceContext)
        throws SystemException {
        return getPersistence().update(vacancy, serviceContext);
    }

    /**
    * Caches the vacancy in the entity cache if it is enabled.
    *
    * @param vacancy the vacancy
    */
    public static void cacheResult(vn.com.ecopharma.hrm.model.Vacancy vacancy) {
        getPersistence().cacheResult(vacancy);
    }

    /**
    * Caches the vacancies in the entity cache if it is enabled.
    *
    * @param vacancies the vacancies
    */
    public static void cacheResult(
        java.util.List<vn.com.ecopharma.hrm.model.Vacancy> vacancies) {
        getPersistence().cacheResult(vacancies);
    }

    /**
    * Creates a new vacancy with the primary key. Does not add the vacancy to the database.
    *
    * @param v_id the primary key for the new vacancy
    * @return the new vacancy
    */
    public static vn.com.ecopharma.hrm.model.Vacancy create(long v_id) {
        return getPersistence().create(v_id);
    }

    /**
    * Removes the vacancy with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param v_id the primary key of the vacancy
    * @return the vacancy that was removed
    * @throws vn.com.ecopharma.hrm.NoSuchVacancyException if a vacancy with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static vn.com.ecopharma.hrm.model.Vacancy remove(long v_id)
        throws com.liferay.portal.kernel.exception.SystemException,
            vn.com.ecopharma.hrm.NoSuchVacancyException {
        return getPersistence().remove(v_id);
    }

    public static vn.com.ecopharma.hrm.model.Vacancy updateImpl(
        vn.com.ecopharma.hrm.model.Vacancy vacancy)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(vacancy);
    }

    /**
    * Returns the vacancy with the primary key or throws a {@link vn.com.ecopharma.hrm.NoSuchVacancyException} if it could not be found.
    *
    * @param v_id the primary key of the vacancy
    * @return the vacancy
    * @throws vn.com.ecopharma.hrm.NoSuchVacancyException if a vacancy with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static vn.com.ecopharma.hrm.model.Vacancy findByPrimaryKey(long v_id)
        throws com.liferay.portal.kernel.exception.SystemException,
            vn.com.ecopharma.hrm.NoSuchVacancyException {
        return getPersistence().findByPrimaryKey(v_id);
    }

    /**
    * Returns the vacancy with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param v_id the primary key of the vacancy
    * @return the vacancy, or <code>null</code> if a vacancy with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static vn.com.ecopharma.hrm.model.Vacancy fetchByPrimaryKey(
        long v_id) throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(v_id);
    }

    /**
    * Returns all the vacancies.
    *
    * @return the vacancies
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<vn.com.ecopharma.hrm.model.Vacancy> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
    }

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
    public static java.util.List<vn.com.ecopharma.hrm.model.Vacancy> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
    }

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
    public static java.util.List<vn.com.ecopharma.hrm.model.Vacancy> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the vacancies from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of vacancies.
    *
    * @return the number of vacancies
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    /**
    * Returns all the candidates associated with the vacancy.
    *
    * @param pk the primary key of the vacancy
    * @return the candidates associated with the vacancy
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<vn.com.ecopharma.hrm.model.Candidate> getCandidates(
        long pk) throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().getCandidates(pk);
    }

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
    public static java.util.List<vn.com.ecopharma.hrm.model.Candidate> getCandidates(
        long pk, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().getCandidates(pk, start, end);
    }

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
    public static java.util.List<vn.com.ecopharma.hrm.model.Candidate> getCandidates(
        long pk, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().getCandidates(pk, start, end, orderByComparator);
    }

    /**
    * Returns the number of candidates associated with the vacancy.
    *
    * @param pk the primary key of the vacancy
    * @return the number of candidates associated with the vacancy
    * @throws SystemException if a system exception occurred
    */
    public static int getCandidatesSize(long pk)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().getCandidatesSize(pk);
    }

    /**
    * Returns <code>true</code> if the candidate is associated with the vacancy.
    *
    * @param pk the primary key of the vacancy
    * @param candidatePK the primary key of the candidate
    * @return <code>true</code> if the candidate is associated with the vacancy; <code>false</code> otherwise
    * @throws SystemException if a system exception occurred
    */
    public static boolean containsCandidate(long pk, long candidatePK)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().containsCandidate(pk, candidatePK);
    }

    /**
    * Returns <code>true</code> if the vacancy has any candidates associated with it.
    *
    * @param pk the primary key of the vacancy to check for associations with candidates
    * @return <code>true</code> if the vacancy has any candidates associated with it; <code>false</code> otherwise
    * @throws SystemException if a system exception occurred
    */
    public static boolean containsCandidates(long pk)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().containsCandidates(pk);
    }

    /**
    * Adds an association between the vacancy and the candidate. Also notifies the appropriate model listeners and clears the mapping table finder cache.
    *
    * @param pk the primary key of the vacancy
    * @param candidatePK the primary key of the candidate
    * @throws SystemException if a system exception occurred
    */
    public static void addCandidate(long pk, long candidatePK)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().addCandidate(pk, candidatePK);
    }

    /**
    * Adds an association between the vacancy and the candidate. Also notifies the appropriate model listeners and clears the mapping table finder cache.
    *
    * @param pk the primary key of the vacancy
    * @param candidate the candidate
    * @throws SystemException if a system exception occurred
    */
    public static void addCandidate(long pk,
        vn.com.ecopharma.hrm.model.Candidate candidate)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().addCandidate(pk, candidate);
    }

    /**
    * Adds an association between the vacancy and the candidates. Also notifies the appropriate model listeners and clears the mapping table finder cache.
    *
    * @param pk the primary key of the vacancy
    * @param candidatePKs the primary keys of the candidates
    * @throws SystemException if a system exception occurred
    */
    public static void addCandidates(long pk, long[] candidatePKs)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().addCandidates(pk, candidatePKs);
    }

    /**
    * Adds an association between the vacancy and the candidates. Also notifies the appropriate model listeners and clears the mapping table finder cache.
    *
    * @param pk the primary key of the vacancy
    * @param candidates the candidates
    * @throws SystemException if a system exception occurred
    */
    public static void addCandidates(long pk,
        java.util.List<vn.com.ecopharma.hrm.model.Candidate> candidates)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().addCandidates(pk, candidates);
    }

    /**
    * Clears all associations between the vacancy and its candidates. Also notifies the appropriate model listeners and clears the mapping table finder cache.
    *
    * @param pk the primary key of the vacancy to clear the associated candidates from
    * @throws SystemException if a system exception occurred
    */
    public static void clearCandidates(long pk)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().clearCandidates(pk);
    }

    /**
    * Removes the association between the vacancy and the candidate. Also notifies the appropriate model listeners and clears the mapping table finder cache.
    *
    * @param pk the primary key of the vacancy
    * @param candidatePK the primary key of the candidate
    * @throws SystemException if a system exception occurred
    */
    public static void removeCandidate(long pk, long candidatePK)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeCandidate(pk, candidatePK);
    }

    /**
    * Removes the association between the vacancy and the candidate. Also notifies the appropriate model listeners and clears the mapping table finder cache.
    *
    * @param pk the primary key of the vacancy
    * @param candidate the candidate
    * @throws SystemException if a system exception occurred
    */
    public static void removeCandidate(long pk,
        vn.com.ecopharma.hrm.model.Candidate candidate)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeCandidate(pk, candidate);
    }

    /**
    * Removes the association between the vacancy and the candidates. Also notifies the appropriate model listeners and clears the mapping table finder cache.
    *
    * @param pk the primary key of the vacancy
    * @param candidatePKs the primary keys of the candidates
    * @throws SystemException if a system exception occurred
    */
    public static void removeCandidates(long pk, long[] candidatePKs)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeCandidates(pk, candidatePKs);
    }

    /**
    * Removes the association between the vacancy and the candidates. Also notifies the appropriate model listeners and clears the mapping table finder cache.
    *
    * @param pk the primary key of the vacancy
    * @param candidates the candidates
    * @throws SystemException if a system exception occurred
    */
    public static void removeCandidates(long pk,
        java.util.List<vn.com.ecopharma.hrm.model.Candidate> candidates)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeCandidates(pk, candidates);
    }

    /**
    * Sets the candidates associated with the vacancy, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
    *
    * @param pk the primary key of the vacancy
    * @param candidatePKs the primary keys of the candidates to be associated with the vacancy
    * @throws SystemException if a system exception occurred
    */
    public static void setCandidates(long pk, long[] candidatePKs)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().setCandidates(pk, candidatePKs);
    }

    /**
    * Sets the candidates associated with the vacancy, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
    *
    * @param pk the primary key of the vacancy
    * @param candidates the candidates to be associated with the vacancy
    * @throws SystemException if a system exception occurred
    */
    public static void setCandidates(long pk,
        java.util.List<vn.com.ecopharma.hrm.model.Candidate> candidates)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().setCandidates(pk, candidates);
    }

    public static VacancyPersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (VacancyPersistence) PortletBeanLocatorUtil.locate(vn.com.ecopharma.hrm.service.ClpSerializer.getServletContextName(),
                    VacancyPersistence.class.getName());

            ReferenceRegistry.registerReference(VacancyUtil.class,
                "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setPersistence(VacancyPersistence persistence) {
    }
}