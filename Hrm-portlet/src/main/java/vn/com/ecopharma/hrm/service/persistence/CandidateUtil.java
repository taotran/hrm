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
    * Returns all the candidates where c_id = &#63;.
    *
    * @param c_id the c_id
    * @return the matching candidates
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<vn.com.ecopharma.hrm.model.Candidate> findByfindCandidates(
        long c_id) throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByfindCandidates(c_id);
    }

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
    public static java.util.List<vn.com.ecopharma.hrm.model.Candidate> findByfindCandidates(
        long c_id, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByfindCandidates(c_id, start, end);
    }

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
    public static java.util.List<vn.com.ecopharma.hrm.model.Candidate> findByfindCandidates(
        long c_id, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByfindCandidates(c_id, start, end, orderByComparator);
    }

    /**
    * Returns the first candidate in the ordered set where c_id = &#63;.
    *
    * @param c_id the c_id
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching candidate
    * @throws vn.com.ecopharma.hrm.NoSuchCandidateException if a matching candidate could not be found
    * @throws SystemException if a system exception occurred
    */
    public static vn.com.ecopharma.hrm.model.Candidate findByfindCandidates_First(
        long c_id,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            vn.com.ecopharma.hrm.NoSuchCandidateException {
        return getPersistence()
                   .findByfindCandidates_First(c_id, orderByComparator);
    }

    /**
    * Returns the first candidate in the ordered set where c_id = &#63;.
    *
    * @param c_id the c_id
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching candidate, or <code>null</code> if a matching candidate could not be found
    * @throws SystemException if a system exception occurred
    */
    public static vn.com.ecopharma.hrm.model.Candidate fetchByfindCandidates_First(
        long c_id,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByfindCandidates_First(c_id, orderByComparator);
    }

    /**
    * Returns the last candidate in the ordered set where c_id = &#63;.
    *
    * @param c_id the c_id
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching candidate
    * @throws vn.com.ecopharma.hrm.NoSuchCandidateException if a matching candidate could not be found
    * @throws SystemException if a system exception occurred
    */
    public static vn.com.ecopharma.hrm.model.Candidate findByfindCandidates_Last(
        long c_id,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            vn.com.ecopharma.hrm.NoSuchCandidateException {
        return getPersistence()
                   .findByfindCandidates_Last(c_id, orderByComparator);
    }

    /**
    * Returns the last candidate in the ordered set where c_id = &#63;.
    *
    * @param c_id the c_id
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching candidate, or <code>null</code> if a matching candidate could not be found
    * @throws SystemException if a system exception occurred
    */
    public static vn.com.ecopharma.hrm.model.Candidate fetchByfindCandidates_Last(
        long c_id,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByfindCandidates_Last(c_id, orderByComparator);
    }

    /**
    * Returns all the candidates that the user has permission to view where c_id = &#63;.
    *
    * @param c_id the c_id
    * @return the matching candidates that the user has permission to view
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<vn.com.ecopharma.hrm.model.Candidate> filterFindByfindCandidates(
        long c_id) throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().filterFindByfindCandidates(c_id);
    }

    /**
    * Returns a range of all the candidates that the user has permission to view where c_id = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.com.ecopharma.hrm.model.impl.CandidateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param c_id the c_id
    * @param start the lower bound of the range of candidates
    * @param end the upper bound of the range of candidates (not inclusive)
    * @return the range of matching candidates that the user has permission to view
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<vn.com.ecopharma.hrm.model.Candidate> filterFindByfindCandidates(
        long c_id, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().filterFindByfindCandidates(c_id, start, end);
    }

    /**
    * Returns an ordered range of all the candidates that the user has permissions to view where c_id = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.com.ecopharma.hrm.model.impl.CandidateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param c_id the c_id
    * @param start the lower bound of the range of candidates
    * @param end the upper bound of the range of candidates (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching candidates that the user has permission to view
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<vn.com.ecopharma.hrm.model.Candidate> filterFindByfindCandidates(
        long c_id, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .filterFindByfindCandidates(c_id, start, end,
            orderByComparator);
    }

    /**
    * Removes all the candidates where c_id = &#63; from the database.
    *
    * @param c_id the c_id
    * @throws SystemException if a system exception occurred
    */
    public static void removeByfindCandidates(long c_id)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByfindCandidates(c_id);
    }

    /**
    * Returns the number of candidates where c_id = &#63;.
    *
    * @param c_id the c_id
    * @return the number of matching candidates
    * @throws SystemException if a system exception occurred
    */
    public static int countByfindCandidates(long c_id)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByfindCandidates(c_id);
    }

    /**
    * Returns the number of candidates that the user has permission to view where c_id = &#63;.
    *
    * @param c_id the c_id
    * @return the number of matching candidates that the user has permission to view
    * @throws SystemException if a system exception occurred
    */
    public static int filterCountByfindCandidates(long c_id)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().filterCountByfindCandidates(c_id);
    }

    /**
    * Returns all the candidates where first_name LIKE &#63; and middle_name LIKE &#63; and last_name LIKE &#63; and email LIKE &#63;.
    *
    * @param first_name the first_name
    * @param middle_name the middle_name
    * @param last_name the last_name
    * @param email the email
    * @return the matching candidates
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<vn.com.ecopharma.hrm.model.Candidate> findByfilterCandidate(
        java.lang.String first_name, java.lang.String middle_name,
        java.lang.String last_name, java.lang.String email)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByfilterCandidate(first_name, middle_name, last_name,
            email);
    }

    /**
    * Returns a range of all the candidates where first_name LIKE &#63; and middle_name LIKE &#63; and last_name LIKE &#63; and email LIKE &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.com.ecopharma.hrm.model.impl.CandidateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param first_name the first_name
    * @param middle_name the middle_name
    * @param last_name the last_name
    * @param email the email
    * @param start the lower bound of the range of candidates
    * @param end the upper bound of the range of candidates (not inclusive)
    * @return the range of matching candidates
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<vn.com.ecopharma.hrm.model.Candidate> findByfilterCandidate(
        java.lang.String first_name, java.lang.String middle_name,
        java.lang.String last_name, java.lang.String email, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByfilterCandidate(first_name, middle_name, last_name,
            email, start, end);
    }

    /**
    * Returns an ordered range of all the candidates where first_name LIKE &#63; and middle_name LIKE &#63; and last_name LIKE &#63; and email LIKE &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.com.ecopharma.hrm.model.impl.CandidateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param first_name the first_name
    * @param middle_name the middle_name
    * @param last_name the last_name
    * @param email the email
    * @param start the lower bound of the range of candidates
    * @param end the upper bound of the range of candidates (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching candidates
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<vn.com.ecopharma.hrm.model.Candidate> findByfilterCandidate(
        java.lang.String first_name, java.lang.String middle_name,
        java.lang.String last_name, java.lang.String email, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByfilterCandidate(first_name, middle_name, last_name,
            email, start, end, orderByComparator);
    }

    /**
    * Returns the first candidate in the ordered set where first_name LIKE &#63; and middle_name LIKE &#63; and last_name LIKE &#63; and email LIKE &#63;.
    *
    * @param first_name the first_name
    * @param middle_name the middle_name
    * @param last_name the last_name
    * @param email the email
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching candidate
    * @throws vn.com.ecopharma.hrm.NoSuchCandidateException if a matching candidate could not be found
    * @throws SystemException if a system exception occurred
    */
    public static vn.com.ecopharma.hrm.model.Candidate findByfilterCandidate_First(
        java.lang.String first_name, java.lang.String middle_name,
        java.lang.String last_name, java.lang.String email,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            vn.com.ecopharma.hrm.NoSuchCandidateException {
        return getPersistence()
                   .findByfilterCandidate_First(first_name, middle_name,
            last_name, email, orderByComparator);
    }

    /**
    * Returns the first candidate in the ordered set where first_name LIKE &#63; and middle_name LIKE &#63; and last_name LIKE &#63; and email LIKE &#63;.
    *
    * @param first_name the first_name
    * @param middle_name the middle_name
    * @param last_name the last_name
    * @param email the email
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching candidate, or <code>null</code> if a matching candidate could not be found
    * @throws SystemException if a system exception occurred
    */
    public static vn.com.ecopharma.hrm.model.Candidate fetchByfilterCandidate_First(
        java.lang.String first_name, java.lang.String middle_name,
        java.lang.String last_name, java.lang.String email,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByfilterCandidate_First(first_name, middle_name,
            last_name, email, orderByComparator);
    }

    /**
    * Returns the last candidate in the ordered set where first_name LIKE &#63; and middle_name LIKE &#63; and last_name LIKE &#63; and email LIKE &#63;.
    *
    * @param first_name the first_name
    * @param middle_name the middle_name
    * @param last_name the last_name
    * @param email the email
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching candidate
    * @throws vn.com.ecopharma.hrm.NoSuchCandidateException if a matching candidate could not be found
    * @throws SystemException if a system exception occurred
    */
    public static vn.com.ecopharma.hrm.model.Candidate findByfilterCandidate_Last(
        java.lang.String first_name, java.lang.String middle_name,
        java.lang.String last_name, java.lang.String email,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            vn.com.ecopharma.hrm.NoSuchCandidateException {
        return getPersistence()
                   .findByfilterCandidate_Last(first_name, middle_name,
            last_name, email, orderByComparator);
    }

    /**
    * Returns the last candidate in the ordered set where first_name LIKE &#63; and middle_name LIKE &#63; and last_name LIKE &#63; and email LIKE &#63;.
    *
    * @param first_name the first_name
    * @param middle_name the middle_name
    * @param last_name the last_name
    * @param email the email
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching candidate, or <code>null</code> if a matching candidate could not be found
    * @throws SystemException if a system exception occurred
    */
    public static vn.com.ecopharma.hrm.model.Candidate fetchByfilterCandidate_Last(
        java.lang.String first_name, java.lang.String middle_name,
        java.lang.String last_name, java.lang.String email,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByfilterCandidate_Last(first_name, middle_name,
            last_name, email, orderByComparator);
    }

    /**
    * Returns the candidates before and after the current candidate in the ordered set where first_name LIKE &#63; and middle_name LIKE &#63; and last_name LIKE &#63; and email LIKE &#63;.
    *
    * @param c_id the primary key of the current candidate
    * @param first_name the first_name
    * @param middle_name the middle_name
    * @param last_name the last_name
    * @param email the email
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next candidate
    * @throws vn.com.ecopharma.hrm.NoSuchCandidateException if a candidate with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static vn.com.ecopharma.hrm.model.Candidate[] findByfilterCandidate_PrevAndNext(
        long c_id, java.lang.String first_name, java.lang.String middle_name,
        java.lang.String last_name, java.lang.String email,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            vn.com.ecopharma.hrm.NoSuchCandidateException {
        return getPersistence()
                   .findByfilterCandidate_PrevAndNext(c_id, first_name,
            middle_name, last_name, email, orderByComparator);
    }

    /**
    * Returns all the candidates that the user has permission to view where first_name LIKE &#63; and middle_name LIKE &#63; and last_name LIKE &#63; and email LIKE &#63;.
    *
    * @param first_name the first_name
    * @param middle_name the middle_name
    * @param last_name the last_name
    * @param email the email
    * @return the matching candidates that the user has permission to view
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<vn.com.ecopharma.hrm.model.Candidate> filterFindByfilterCandidate(
        java.lang.String first_name, java.lang.String middle_name,
        java.lang.String last_name, java.lang.String email)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .filterFindByfilterCandidate(first_name, middle_name,
            last_name, email);
    }

    /**
    * Returns a range of all the candidates that the user has permission to view where first_name LIKE &#63; and middle_name LIKE &#63; and last_name LIKE &#63; and email LIKE &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.com.ecopharma.hrm.model.impl.CandidateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param first_name the first_name
    * @param middle_name the middle_name
    * @param last_name the last_name
    * @param email the email
    * @param start the lower bound of the range of candidates
    * @param end the upper bound of the range of candidates (not inclusive)
    * @return the range of matching candidates that the user has permission to view
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<vn.com.ecopharma.hrm.model.Candidate> filterFindByfilterCandidate(
        java.lang.String first_name, java.lang.String middle_name,
        java.lang.String last_name, java.lang.String email, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .filterFindByfilterCandidate(first_name, middle_name,
            last_name, email, start, end);
    }

    /**
    * Returns an ordered range of all the candidates that the user has permissions to view where first_name LIKE &#63; and middle_name LIKE &#63; and last_name LIKE &#63; and email LIKE &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.com.ecopharma.hrm.model.impl.CandidateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param first_name the first_name
    * @param middle_name the middle_name
    * @param last_name the last_name
    * @param email the email
    * @param start the lower bound of the range of candidates
    * @param end the upper bound of the range of candidates (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching candidates that the user has permission to view
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<vn.com.ecopharma.hrm.model.Candidate> filterFindByfilterCandidate(
        java.lang.String first_name, java.lang.String middle_name,
        java.lang.String last_name, java.lang.String email, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .filterFindByfilterCandidate(first_name, middle_name,
            last_name, email, start, end, orderByComparator);
    }

    /**
    * Returns the candidates before and after the current candidate in the ordered set of candidates that the user has permission to view where first_name LIKE &#63; and middle_name LIKE &#63; and last_name LIKE &#63; and email LIKE &#63;.
    *
    * @param c_id the primary key of the current candidate
    * @param first_name the first_name
    * @param middle_name the middle_name
    * @param last_name the last_name
    * @param email the email
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next candidate
    * @throws vn.com.ecopharma.hrm.NoSuchCandidateException if a candidate with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static vn.com.ecopharma.hrm.model.Candidate[] filterFindByfilterCandidate_PrevAndNext(
        long c_id, java.lang.String first_name, java.lang.String middle_name,
        java.lang.String last_name, java.lang.String email,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            vn.com.ecopharma.hrm.NoSuchCandidateException {
        return getPersistence()
                   .filterFindByfilterCandidate_PrevAndNext(c_id, first_name,
            middle_name, last_name, email, orderByComparator);
    }

    /**
    * Returns all the candidates that the user has permission to view where first_name LIKE any &#63; and middle_name LIKE any &#63; and last_name LIKE any &#63; and email LIKE any &#63;.
    *
    * @param first_names the first_names
    * @param middle_names the middle_names
    * @param last_names the last_names
    * @param emails the emails
    * @return the matching candidates that the user has permission to view
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<vn.com.ecopharma.hrm.model.Candidate> filterFindByfilterCandidate(
        java.lang.String[] first_names, java.lang.String[] middle_names,
        java.lang.String[] last_names, java.lang.String[] emails)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .filterFindByfilterCandidate(first_names, middle_names,
            last_names, emails);
    }

    /**
    * Returns a range of all the candidates that the user has permission to view where first_name LIKE any &#63; and middle_name LIKE any &#63; and last_name LIKE any &#63; and email LIKE any &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.com.ecopharma.hrm.model.impl.CandidateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param first_names the first_names
    * @param middle_names the middle_names
    * @param last_names the last_names
    * @param emails the emails
    * @param start the lower bound of the range of candidates
    * @param end the upper bound of the range of candidates (not inclusive)
    * @return the range of matching candidates that the user has permission to view
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<vn.com.ecopharma.hrm.model.Candidate> filterFindByfilterCandidate(
        java.lang.String[] first_names, java.lang.String[] middle_names,
        java.lang.String[] last_names, java.lang.String[] emails, int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .filterFindByfilterCandidate(first_names, middle_names,
            last_names, emails, start, end);
    }

    /**
    * Returns an ordered range of all the candidates that the user has permission to view where first_name LIKE any &#63; and middle_name LIKE any &#63; and last_name LIKE any &#63; and email LIKE any &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.com.ecopharma.hrm.model.impl.CandidateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param first_names the first_names
    * @param middle_names the middle_names
    * @param last_names the last_names
    * @param emails the emails
    * @param start the lower bound of the range of candidates
    * @param end the upper bound of the range of candidates (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching candidates that the user has permission to view
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<vn.com.ecopharma.hrm.model.Candidate> filterFindByfilterCandidate(
        java.lang.String[] first_names, java.lang.String[] middle_names,
        java.lang.String[] last_names, java.lang.String[] emails, int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .filterFindByfilterCandidate(first_names, middle_names,
            last_names, emails, start, end, orderByComparator);
    }

    /**
    * Returns all the candidates where first_name LIKE any &#63; and middle_name LIKE any &#63; and last_name LIKE any &#63; and email LIKE any &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.com.ecopharma.hrm.model.impl.CandidateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param first_names the first_names
    * @param middle_names the middle_names
    * @param last_names the last_names
    * @param emails the emails
    * @return the matching candidates
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<vn.com.ecopharma.hrm.model.Candidate> findByfilterCandidate(
        java.lang.String[] first_names, java.lang.String[] middle_names,
        java.lang.String[] last_names, java.lang.String[] emails)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByfilterCandidate(first_names, middle_names,
            last_names, emails);
    }

    /**
    * Returns a range of all the candidates where first_name LIKE any &#63; and middle_name LIKE any &#63; and last_name LIKE any &#63; and email LIKE any &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.com.ecopharma.hrm.model.impl.CandidateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param first_names the first_names
    * @param middle_names the middle_names
    * @param last_names the last_names
    * @param emails the emails
    * @param start the lower bound of the range of candidates
    * @param end the upper bound of the range of candidates (not inclusive)
    * @return the range of matching candidates
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<vn.com.ecopharma.hrm.model.Candidate> findByfilterCandidate(
        java.lang.String[] first_names, java.lang.String[] middle_names,
        java.lang.String[] last_names, java.lang.String[] emails, int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByfilterCandidate(first_names, middle_names,
            last_names, emails, start, end);
    }

    /**
    * Returns an ordered range of all the candidates where first_name LIKE any &#63; and middle_name LIKE any &#63; and last_name LIKE any &#63; and email LIKE any &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.com.ecopharma.hrm.model.impl.CandidateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param first_names the first_names
    * @param middle_names the middle_names
    * @param last_names the last_names
    * @param emails the emails
    * @param start the lower bound of the range of candidates
    * @param end the upper bound of the range of candidates (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching candidates
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<vn.com.ecopharma.hrm.model.Candidate> findByfilterCandidate(
        java.lang.String[] first_names, java.lang.String[] middle_names,
        java.lang.String[] last_names, java.lang.String[] emails, int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByfilterCandidate(first_names, middle_names,
            last_names, emails, start, end, orderByComparator);
    }

    /**
    * Removes all the candidates where first_name LIKE &#63; and middle_name LIKE &#63; and last_name LIKE &#63; and email LIKE &#63; from the database.
    *
    * @param first_name the first_name
    * @param middle_name the middle_name
    * @param last_name the last_name
    * @param email the email
    * @throws SystemException if a system exception occurred
    */
    public static void removeByfilterCandidate(java.lang.String first_name,
        java.lang.String middle_name, java.lang.String last_name,
        java.lang.String email)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence()
            .removeByfilterCandidate(first_name, middle_name, last_name, email);
    }

    /**
    * Returns the number of candidates where first_name LIKE &#63; and middle_name LIKE &#63; and last_name LIKE &#63; and email LIKE &#63;.
    *
    * @param first_name the first_name
    * @param middle_name the middle_name
    * @param last_name the last_name
    * @param email the email
    * @return the number of matching candidates
    * @throws SystemException if a system exception occurred
    */
    public static int countByfilterCandidate(java.lang.String first_name,
        java.lang.String middle_name, java.lang.String last_name,
        java.lang.String email)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .countByfilterCandidate(first_name, middle_name, last_name,
            email);
    }

    /**
    * Returns the number of candidates where first_name LIKE any &#63; and middle_name LIKE any &#63; and last_name LIKE any &#63; and email LIKE any &#63;.
    *
    * @param first_names the first_names
    * @param middle_names the middle_names
    * @param last_names the last_names
    * @param emails the emails
    * @return the number of matching candidates
    * @throws SystemException if a system exception occurred
    */
    public static int countByfilterCandidate(java.lang.String[] first_names,
        java.lang.String[] middle_names, java.lang.String[] last_names,
        java.lang.String[] emails)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .countByfilterCandidate(first_names, middle_names,
            last_names, emails);
    }

    /**
    * Returns the number of candidates that the user has permission to view where first_name LIKE &#63; and middle_name LIKE &#63; and last_name LIKE &#63; and email LIKE &#63;.
    *
    * @param first_name the first_name
    * @param middle_name the middle_name
    * @param last_name the last_name
    * @param email the email
    * @return the number of matching candidates that the user has permission to view
    * @throws SystemException if a system exception occurred
    */
    public static int filterCountByfilterCandidate(
        java.lang.String first_name, java.lang.String middle_name,
        java.lang.String last_name, java.lang.String email)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .filterCountByfilterCandidate(first_name, middle_name,
            last_name, email);
    }

    /**
    * Returns the number of candidates that the user has permission to view where first_name LIKE any &#63; and middle_name LIKE any &#63; and last_name LIKE any &#63; and email LIKE any &#63;.
    *
    * @param first_names the first_names
    * @param middle_names the middle_names
    * @param last_names the last_names
    * @param emails the emails
    * @return the number of matching candidates that the user has permission to view
    * @throws SystemException if a system exception occurred
    */
    public static int filterCountByfilterCandidate(
        java.lang.String[] first_names, java.lang.String[] middle_names,
        java.lang.String[] last_names, java.lang.String[] emails)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .filterCountByfilterCandidate(first_names, middle_names,
            last_names, emails);
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

    /**
    * Returns all the vacancies associated with the candidate.
    *
    * @param pk the primary key of the candidate
    * @return the vacancies associated with the candidate
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<vn.com.ecopharma.hrm.model.Vacancy> getVacancies(
        long pk) throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().getVacancies(pk);
    }

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
    public static java.util.List<vn.com.ecopharma.hrm.model.Vacancy> getVacancies(
        long pk, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().getVacancies(pk, start, end);
    }

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
    public static java.util.List<vn.com.ecopharma.hrm.model.Vacancy> getVacancies(
        long pk, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().getVacancies(pk, start, end, orderByComparator);
    }

    /**
    * Returns the number of vacancies associated with the candidate.
    *
    * @param pk the primary key of the candidate
    * @return the number of vacancies associated with the candidate
    * @throws SystemException if a system exception occurred
    */
    public static int getVacanciesSize(long pk)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().getVacanciesSize(pk);
    }

    /**
    * Returns <code>true</code> if the vacancy is associated with the candidate.
    *
    * @param pk the primary key of the candidate
    * @param vacancyPK the primary key of the vacancy
    * @return <code>true</code> if the vacancy is associated with the candidate; <code>false</code> otherwise
    * @throws SystemException if a system exception occurred
    */
    public static boolean containsVacancy(long pk, long vacancyPK)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().containsVacancy(pk, vacancyPK);
    }

    /**
    * Returns <code>true</code> if the candidate has any vacancies associated with it.
    *
    * @param pk the primary key of the candidate to check for associations with vacancies
    * @return <code>true</code> if the candidate has any vacancies associated with it; <code>false</code> otherwise
    * @throws SystemException if a system exception occurred
    */
    public static boolean containsVacancies(long pk)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().containsVacancies(pk);
    }

    /**
    * Adds an association between the candidate and the vacancy. Also notifies the appropriate model listeners and clears the mapping table finder cache.
    *
    * @param pk the primary key of the candidate
    * @param vacancyPK the primary key of the vacancy
    * @throws SystemException if a system exception occurred
    */
    public static void addVacancy(long pk, long vacancyPK)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().addVacancy(pk, vacancyPK);
    }

    /**
    * Adds an association between the candidate and the vacancy. Also notifies the appropriate model listeners and clears the mapping table finder cache.
    *
    * @param pk the primary key of the candidate
    * @param vacancy the vacancy
    * @throws SystemException if a system exception occurred
    */
    public static void addVacancy(long pk,
        vn.com.ecopharma.hrm.model.Vacancy vacancy)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().addVacancy(pk, vacancy);
    }

    /**
    * Adds an association between the candidate and the vacancies. Also notifies the appropriate model listeners and clears the mapping table finder cache.
    *
    * @param pk the primary key of the candidate
    * @param vacancyPKs the primary keys of the vacancies
    * @throws SystemException if a system exception occurred
    */
    public static void addVacancies(long pk, long[] vacancyPKs)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().addVacancies(pk, vacancyPKs);
    }

    /**
    * Adds an association between the candidate and the vacancies. Also notifies the appropriate model listeners and clears the mapping table finder cache.
    *
    * @param pk the primary key of the candidate
    * @param vacancies the vacancies
    * @throws SystemException if a system exception occurred
    */
    public static void addVacancies(long pk,
        java.util.List<vn.com.ecopharma.hrm.model.Vacancy> vacancies)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().addVacancies(pk, vacancies);
    }

    /**
    * Clears all associations between the candidate and its vacancies. Also notifies the appropriate model listeners and clears the mapping table finder cache.
    *
    * @param pk the primary key of the candidate to clear the associated vacancies from
    * @throws SystemException if a system exception occurred
    */
    public static void clearVacancies(long pk)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().clearVacancies(pk);
    }

    /**
    * Removes the association between the candidate and the vacancy. Also notifies the appropriate model listeners and clears the mapping table finder cache.
    *
    * @param pk the primary key of the candidate
    * @param vacancyPK the primary key of the vacancy
    * @throws SystemException if a system exception occurred
    */
    public static void removeVacancy(long pk, long vacancyPK)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeVacancy(pk, vacancyPK);
    }

    /**
    * Removes the association between the candidate and the vacancy. Also notifies the appropriate model listeners and clears the mapping table finder cache.
    *
    * @param pk the primary key of the candidate
    * @param vacancy the vacancy
    * @throws SystemException if a system exception occurred
    */
    public static void removeVacancy(long pk,
        vn.com.ecopharma.hrm.model.Vacancy vacancy)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeVacancy(pk, vacancy);
    }

    /**
    * Removes the association between the candidate and the vacancies. Also notifies the appropriate model listeners and clears the mapping table finder cache.
    *
    * @param pk the primary key of the candidate
    * @param vacancyPKs the primary keys of the vacancies
    * @throws SystemException if a system exception occurred
    */
    public static void removeVacancies(long pk, long[] vacancyPKs)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeVacancies(pk, vacancyPKs);
    }

    /**
    * Removes the association between the candidate and the vacancies. Also notifies the appropriate model listeners and clears the mapping table finder cache.
    *
    * @param pk the primary key of the candidate
    * @param vacancies the vacancies
    * @throws SystemException if a system exception occurred
    */
    public static void removeVacancies(long pk,
        java.util.List<vn.com.ecopharma.hrm.model.Vacancy> vacancies)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeVacancies(pk, vacancies);
    }

    /**
    * Sets the vacancies associated with the candidate, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
    *
    * @param pk the primary key of the candidate
    * @param vacancyPKs the primary keys of the vacancies to be associated with the candidate
    * @throws SystemException if a system exception occurred
    */
    public static void setVacancies(long pk, long[] vacancyPKs)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().setVacancies(pk, vacancyPKs);
    }

    /**
    * Sets the vacancies associated with the candidate, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
    *
    * @param pk the primary key of the candidate
    * @param vacancies the vacancies to be associated with the candidate
    * @throws SystemException if a system exception occurred
    */
    public static void setVacancies(long pk,
        java.util.List<vn.com.ecopharma.hrm.model.Vacancy> vacancies)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().setVacancies(pk, vacancies);
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
