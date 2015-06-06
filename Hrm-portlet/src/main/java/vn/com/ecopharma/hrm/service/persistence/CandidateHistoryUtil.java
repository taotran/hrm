package vn.com.ecopharma.hrm.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import vn.com.ecopharma.hrm.model.CandidateHistory;

import java.util.List;

/**
 * The persistence utility for the candidate history service. This utility wraps {@link CandidateHistoryPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author tvt
 * @see CandidateHistoryPersistence
 * @see CandidateHistoryPersistenceImpl
 * @generated
 */
public class CandidateHistoryUtil {
    private static CandidateHistoryPersistence _persistence;

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
    public static void clearCache(CandidateHistory candidateHistory) {
        getPersistence().clearCache(candidateHistory);
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
    public static List<CandidateHistory> findWithDynamicQuery(
        DynamicQuery dynamicQuery) throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<CandidateHistory> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<CandidateHistory> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
     */
    public static CandidateHistory update(CandidateHistory candidateHistory)
        throws SystemException {
        return getPersistence().update(candidateHistory);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
     */
    public static CandidateHistory update(CandidateHistory candidateHistory,
        ServiceContext serviceContext) throws SystemException {
        return getPersistence().update(candidateHistory, serviceContext);
    }

    /**
    * Returns all the candidate histories where c_id = &#63;.
    *
    * @param c_id the c_id
    * @return the matching candidate histories
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<vn.com.ecopharma.hrm.model.CandidateHistory> findByC_Id(
        long c_id) throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByC_Id(c_id);
    }

    /**
    * Returns a range of all the candidate histories where c_id = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.com.ecopharma.hrm.model.impl.CandidateHistoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param c_id the c_id
    * @param start the lower bound of the range of candidate histories
    * @param end the upper bound of the range of candidate histories (not inclusive)
    * @return the range of matching candidate histories
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<vn.com.ecopharma.hrm.model.CandidateHistory> findByC_Id(
        long c_id, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByC_Id(c_id, start, end);
    }

    /**
    * Returns an ordered range of all the candidate histories where c_id = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.com.ecopharma.hrm.model.impl.CandidateHistoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param c_id the c_id
    * @param start the lower bound of the range of candidate histories
    * @param end the upper bound of the range of candidate histories (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching candidate histories
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<vn.com.ecopharma.hrm.model.CandidateHistory> findByC_Id(
        long c_id, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByC_Id(c_id, start, end, orderByComparator);
    }

    /**
    * Returns the first candidate history in the ordered set where c_id = &#63;.
    *
    * @param c_id the c_id
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching candidate history
    * @throws vn.com.ecopharma.hrm.NoSuchCandidateHistoryException if a matching candidate history could not be found
    * @throws SystemException if a system exception occurred
    */
    public static vn.com.ecopharma.hrm.model.CandidateHistory findByC_Id_First(
        long c_id,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            vn.com.ecopharma.hrm.NoSuchCandidateHistoryException {
        return getPersistence().findByC_Id_First(c_id, orderByComparator);
    }

    /**
    * Returns the first candidate history in the ordered set where c_id = &#63;.
    *
    * @param c_id the c_id
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching candidate history, or <code>null</code> if a matching candidate history could not be found
    * @throws SystemException if a system exception occurred
    */
    public static vn.com.ecopharma.hrm.model.CandidateHistory fetchByC_Id_First(
        long c_id,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByC_Id_First(c_id, orderByComparator);
    }

    /**
    * Returns the last candidate history in the ordered set where c_id = &#63;.
    *
    * @param c_id the c_id
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching candidate history
    * @throws vn.com.ecopharma.hrm.NoSuchCandidateHistoryException if a matching candidate history could not be found
    * @throws SystemException if a system exception occurred
    */
    public static vn.com.ecopharma.hrm.model.CandidateHistory findByC_Id_Last(
        long c_id,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            vn.com.ecopharma.hrm.NoSuchCandidateHistoryException {
        return getPersistence().findByC_Id_Last(c_id, orderByComparator);
    }

    /**
    * Returns the last candidate history in the ordered set where c_id = &#63;.
    *
    * @param c_id the c_id
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching candidate history, or <code>null</code> if a matching candidate history could not be found
    * @throws SystemException if a system exception occurred
    */
    public static vn.com.ecopharma.hrm.model.CandidateHistory fetchByC_Id_Last(
        long c_id,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByC_Id_Last(c_id, orderByComparator);
    }

    /**
    * Returns the candidate histories before and after the current candidate history in the ordered set where c_id = &#63;.
    *
    * @param candidateHistoryId the primary key of the current candidate history
    * @param c_id the c_id
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next candidate history
    * @throws vn.com.ecopharma.hrm.NoSuchCandidateHistoryException if a candidate history with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static vn.com.ecopharma.hrm.model.CandidateHistory[] findByC_Id_PrevAndNext(
        long candidateHistoryId, long c_id,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            vn.com.ecopharma.hrm.NoSuchCandidateHistoryException {
        return getPersistence()
                   .findByC_Id_PrevAndNext(candidateHistoryId, c_id,
            orderByComparator);
    }

    /**
    * Removes all the candidate histories where c_id = &#63; from the database.
    *
    * @param c_id the c_id
    * @throws SystemException if a system exception occurred
    */
    public static void removeByC_Id(long c_id)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByC_Id(c_id);
    }

    /**
    * Returns the number of candidate histories where c_id = &#63;.
    *
    * @param c_id the c_id
    * @return the number of matching candidate histories
    * @throws SystemException if a system exception occurred
    */
    public static int countByC_Id(long c_id)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByC_Id(c_id);
    }

    /**
    * Caches the candidate history in the entity cache if it is enabled.
    *
    * @param candidateHistory the candidate history
    */
    public static void cacheResult(
        vn.com.ecopharma.hrm.model.CandidateHistory candidateHistory) {
        getPersistence().cacheResult(candidateHistory);
    }

    /**
    * Caches the candidate histories in the entity cache if it is enabled.
    *
    * @param candidateHistories the candidate histories
    */
    public static void cacheResult(
        java.util.List<vn.com.ecopharma.hrm.model.CandidateHistory> candidateHistories) {
        getPersistence().cacheResult(candidateHistories);
    }

    /**
    * Creates a new candidate history with the primary key. Does not add the candidate history to the database.
    *
    * @param candidateHistoryId the primary key for the new candidate history
    * @return the new candidate history
    */
    public static vn.com.ecopharma.hrm.model.CandidateHistory create(
        long candidateHistoryId) {
        return getPersistence().create(candidateHistoryId);
    }

    /**
    * Removes the candidate history with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param candidateHistoryId the primary key of the candidate history
    * @return the candidate history that was removed
    * @throws vn.com.ecopharma.hrm.NoSuchCandidateHistoryException if a candidate history with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static vn.com.ecopharma.hrm.model.CandidateHistory remove(
        long candidateHistoryId)
        throws com.liferay.portal.kernel.exception.SystemException,
            vn.com.ecopharma.hrm.NoSuchCandidateHistoryException {
        return getPersistence().remove(candidateHistoryId);
    }

    public static vn.com.ecopharma.hrm.model.CandidateHistory updateImpl(
        vn.com.ecopharma.hrm.model.CandidateHistory candidateHistory)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(candidateHistory);
    }

    /**
    * Returns the candidate history with the primary key or throws a {@link vn.com.ecopharma.hrm.NoSuchCandidateHistoryException} if it could not be found.
    *
    * @param candidateHistoryId the primary key of the candidate history
    * @return the candidate history
    * @throws vn.com.ecopharma.hrm.NoSuchCandidateHistoryException if a candidate history with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static vn.com.ecopharma.hrm.model.CandidateHistory findByPrimaryKey(
        long candidateHistoryId)
        throws com.liferay.portal.kernel.exception.SystemException,
            vn.com.ecopharma.hrm.NoSuchCandidateHistoryException {
        return getPersistence().findByPrimaryKey(candidateHistoryId);
    }

    /**
    * Returns the candidate history with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param candidateHistoryId the primary key of the candidate history
    * @return the candidate history, or <code>null</code> if a candidate history with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static vn.com.ecopharma.hrm.model.CandidateHistory fetchByPrimaryKey(
        long candidateHistoryId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(candidateHistoryId);
    }

    /**
    * Returns all the candidate histories.
    *
    * @return the candidate histories
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<vn.com.ecopharma.hrm.model.CandidateHistory> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
    }

    /**
    * Returns a range of all the candidate histories.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.com.ecopharma.hrm.model.impl.CandidateHistoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of candidate histories
    * @param end the upper bound of the range of candidate histories (not inclusive)
    * @return the range of candidate histories
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<vn.com.ecopharma.hrm.model.CandidateHistory> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
    }

    /**
    * Returns an ordered range of all the candidate histories.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.com.ecopharma.hrm.model.impl.CandidateHistoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of candidate histories
    * @param end the upper bound of the range of candidate histories (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of candidate histories
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<vn.com.ecopharma.hrm.model.CandidateHistory> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the candidate histories from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of candidate histories.
    *
    * @return the number of candidate histories
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    public static CandidateHistoryPersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (CandidateHistoryPersistence) PortletBeanLocatorUtil.locate(vn.com.ecopharma.hrm.service.ClpSerializer.getServletContextName(),
                    CandidateHistoryPersistence.class.getName());

            ReferenceRegistry.registerReference(CandidateHistoryUtil.class,
                "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setPersistence(CandidateHistoryPersistence persistence) {
    }
}
