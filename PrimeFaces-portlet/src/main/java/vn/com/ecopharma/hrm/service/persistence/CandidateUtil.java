package vn.com.ecopharma.hrm.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import vn.com.ecopharma.hrm.model.Candidate;

import java.util.List;

/**
 * The persistence utility for the candidate service. This utility wraps {@link CandidatePersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author tvt
 * @see CandidatePersistence
 * @see CandidatePersistenceImpl
 * @generated
 */
public class CandidateUtil {
    private static CandidatePersistence _persistence;

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
    public static void clearCache(Candidate candidate) {
        getPersistence().clearCache(candidate);
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
    public static List<Candidate> findWithDynamicQuery(
        DynamicQuery dynamicQuery) throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<Candidate> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<Candidate> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
     */
    public static Candidate update(Candidate candidate)
        throws SystemException {
        return getPersistence().update(candidate);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
     */
    public static Candidate update(Candidate candidate,
        ServiceContext serviceContext) throws SystemException {
        return getPersistence().update(candidate, serviceContext);
    }

    /**
    * Caches the candidate in the entity cache if it is enabled.
    *
    * @param candidate the candidate
    */
    public static void cacheResult(
        vn.com.ecopharma.hrm.model.Candidate candidate) {
        getPersistence().cacheResult(candidate);
    }

    /**
    * Caches the candidates in the entity cache if it is enabled.
    *
    * @param candidates the candidates
    */
    public static void cacheResult(
        java.util.List<vn.com.ecopharma.hrm.model.Candidate> candidates) {
        getPersistence().cacheResult(candidates);
    }

    /**
    * Creates a new candidate with the primary key. Does not add the candidate to the database.
    *
    * @param c_id the primary key for the new candidate
    * @return the new candidate
    */
    public static vn.com.ecopharma.hrm.model.Candidate create(long c_id) {
        return getPersistence().create(c_id);
    }

    /**
    * Removes the candidate with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param c_id the primary key of the candidate
    * @return the candidate that was removed
    * @throws vn.com.ecopharma.hrm.NoSuchCandidateException if a candidate with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static vn.com.ecopharma.hrm.model.Candidate remove(long c_id)
        throws com.liferay.portal.kernel.exception.SystemException,
            vn.com.ecopharma.hrm.NoSuchCandidateException {
        return getPersistence().remove(c_id);
    }

    public static vn.com.ecopharma.hrm.model.Candidate updateImpl(
        vn.com.ecopharma.hrm.model.Candidate candidate)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(candidate);
    }

    /**
    * Returns the candidate with the primary key or throws a {@link vn.com.ecopharma.hrm.NoSuchCandidateException} if it could not be found.
    *
    * @param c_id the primary key of the candidate
    * @return the candidate
    * @throws vn.com.ecopharma.hrm.NoSuchCandidateException if a candidate with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static vn.com.ecopharma.hrm.model.Candidate findByPrimaryKey(
        long c_id)
        throws com.liferay.portal.kernel.exception.SystemException,
            vn.com.ecopharma.hrm.NoSuchCandidateException {
        return getPersistence().findByPrimaryKey(c_id);
    }

    /**
    * Returns the candidate with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param c_id the primary key of the candidate
    * @return the candidate, or <code>null</code> if a candidate with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static vn.com.ecopharma.hrm.model.Candidate fetchByPrimaryKey(
        long c_id) throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(c_id);
    }

    /**
    * Returns all the candidates.
    *
    * @return the candidates
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<vn.com.ecopharma.hrm.model.Candidate> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
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
    public static java.util.List<vn.com.ecopharma.hrm.model.Candidate> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
    }

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
    public static java.util.List<vn.com.ecopharma.hrm.model.Candidate> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the candidates from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of candidates.
    *
    * @return the number of candidates
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    public static CandidatePersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (CandidatePersistence) PortletBeanLocatorUtil.locate(vn.com.ecopharma.hrm.service.ClpSerializer.getServletContextName(),
                    CandidatePersistence.class.getName());

            ReferenceRegistry.registerReference(CandidateUtil.class,
                "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setPersistence(CandidatePersistence persistence) {
    }
}
