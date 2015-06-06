package vn.com.ecopharma.hrm.service.persistence;

import com.liferay.portal.kernel.cache.CacheRegistryUtil;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.InstanceFactory;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.UnmodifiableList;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import vn.com.ecopharma.hrm.NoSuchEmployeeVacancyException;
import vn.com.ecopharma.hrm.model.EmployeeVacancy;
import vn.com.ecopharma.hrm.model.impl.EmployeeVacancyImpl;
import vn.com.ecopharma.hrm.model.impl.EmployeeVacancyModelImpl;
import vn.com.ecopharma.hrm.service.persistence.EmployeeVacancyPersistence;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the employee vacancy service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author tvt
 * @see EmployeeVacancyPersistence
 * @see EmployeeVacancyUtil
 * @generated
 */
public class EmployeeVacancyPersistenceImpl extends BasePersistenceImpl<EmployeeVacancy>
    implements EmployeeVacancyPersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link EmployeeVacancyUtil} to access the employee vacancy persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = EmployeeVacancyImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(EmployeeVacancyModelImpl.ENTITY_CACHE_ENABLED,
            EmployeeVacancyModelImpl.FINDER_CACHE_ENABLED,
            EmployeeVacancyImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
            "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(EmployeeVacancyModelImpl.ENTITY_CACHE_ENABLED,
            EmployeeVacancyModelImpl.FINDER_CACHE_ENABLED,
            EmployeeVacancyImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(EmployeeVacancyModelImpl.ENTITY_CACHE_ENABLED,
            EmployeeVacancyModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    public static final FinderPath FINDER_PATH_FETCH_BY_VACANCYID_EMPLOYEEID = new FinderPath(EmployeeVacancyModelImpl.ENTITY_CACHE_ENABLED,
            EmployeeVacancyModelImpl.FINDER_CACHE_ENABLED,
            EmployeeVacancyImpl.class, FINDER_CLASS_NAME_ENTITY,
            "fetchByVacancyId_EmployeeId",
            new String[] { Long.class.getName(), Long.class.getName() },
            EmployeeVacancyModelImpl.V_ID_COLUMN_BITMASK |
            EmployeeVacancyModelImpl.EMPLOYEEID_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_VACANCYID_EMPLOYEEID = new FinderPath(EmployeeVacancyModelImpl.ENTITY_CACHE_ENABLED,
            EmployeeVacancyModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
            "countByVacancyId_EmployeeId",
            new String[] { Long.class.getName(), Long.class.getName() });
    private static final String _FINDER_COLUMN_VACANCYID_EMPLOYEEID_V_ID_2 = "employeeVacancy.v_id = ? AND ";
    private static final String _FINDER_COLUMN_VACANCYID_EMPLOYEEID_EMPLOYEEID_2 =
        "employeeVacancy.employeeId = ?";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_EMPLOYEEID =
        new FinderPath(EmployeeVacancyModelImpl.ENTITY_CACHE_ENABLED,
            EmployeeVacancyModelImpl.FINDER_CACHE_ENABLED,
            EmployeeVacancyImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
            "findByEmployeeId",
            new String[] {
                Long.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_EMPLOYEEID =
        new FinderPath(EmployeeVacancyModelImpl.ENTITY_CACHE_ENABLED,
            EmployeeVacancyModelImpl.FINDER_CACHE_ENABLED,
            EmployeeVacancyImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByEmployeeId",
            new String[] { Long.class.getName() },
            EmployeeVacancyModelImpl.EMPLOYEEID_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_EMPLOYEEID = new FinderPath(EmployeeVacancyModelImpl.ENTITY_CACHE_ENABLED,
            EmployeeVacancyModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByEmployeeId",
            new String[] { Long.class.getName() });
    private static final String _FINDER_COLUMN_EMPLOYEEID_EMPLOYEEID_2 = "employeeVacancy.employeeId = ?";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_VACANCYID =
        new FinderPath(EmployeeVacancyModelImpl.ENTITY_CACHE_ENABLED,
            EmployeeVacancyModelImpl.FINDER_CACHE_ENABLED,
            EmployeeVacancyImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
            "findByVacancyId",
            new String[] {
                Long.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_VACANCYID =
        new FinderPath(EmployeeVacancyModelImpl.ENTITY_CACHE_ENABLED,
            EmployeeVacancyModelImpl.FINDER_CACHE_ENABLED,
            EmployeeVacancyImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByVacancyId",
            new String[] { Long.class.getName() },
            EmployeeVacancyModelImpl.V_ID_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_VACANCYID = new FinderPath(EmployeeVacancyModelImpl.ENTITY_CACHE_ENABLED,
            EmployeeVacancyModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByVacancyId",
            new String[] { Long.class.getName() });
    private static final String _FINDER_COLUMN_VACANCYID_V_ID_2 = "employeeVacancy.v_id = ?";
    private static final String _SQL_SELECT_EMPLOYEEVACANCY = "SELECT employeeVacancy FROM EmployeeVacancy employeeVacancy";
    private static final String _SQL_SELECT_EMPLOYEEVACANCY_WHERE = "SELECT employeeVacancy FROM EmployeeVacancy employeeVacancy WHERE ";
    private static final String _SQL_COUNT_EMPLOYEEVACANCY = "SELECT COUNT(employeeVacancy) FROM EmployeeVacancy employeeVacancy";
    private static final String _SQL_COUNT_EMPLOYEEVACANCY_WHERE = "SELECT COUNT(employeeVacancy) FROM EmployeeVacancy employeeVacancy WHERE ";
    private static final String _ORDER_BY_ENTITY_ALIAS = "employeeVacancy.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No EmployeeVacancy exists with the primary key ";
    private static final String _NO_SUCH_ENTITY_WITH_KEY = "No EmployeeVacancy exists with the key {";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(EmployeeVacancyPersistenceImpl.class);
    private static EmployeeVacancy _nullEmployeeVacancy = new EmployeeVacancyImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<EmployeeVacancy> toCacheModel() {
                return _nullEmployeeVacancyCacheModel;
            }
        };

    private static CacheModel<EmployeeVacancy> _nullEmployeeVacancyCacheModel = new CacheModel<EmployeeVacancy>() {
            @Override
            public EmployeeVacancy toEntityModel() {
                return _nullEmployeeVacancy;
            }
        };

    public EmployeeVacancyPersistenceImpl() {
        setModelClass(EmployeeVacancy.class);
    }

    /**
     * Returns the employee vacancy where v_id = &#63; and employeeId = &#63; or throws a {@link vn.com.ecopharma.hrm.NoSuchEmployeeVacancyException} if it could not be found.
     *
     * @param v_id the v_id
     * @param employeeId the employee ID
     * @return the matching employee vacancy
     * @throws vn.com.ecopharma.hrm.NoSuchEmployeeVacancyException if a matching employee vacancy could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EmployeeVacancy findByVacancyId_EmployeeId(long v_id, long employeeId)
        throws NoSuchEmployeeVacancyException, SystemException {
        EmployeeVacancy employeeVacancy = fetchByVacancyId_EmployeeId(v_id,
                employeeId);

        if (employeeVacancy == null) {
            StringBundler msg = new StringBundler(6);

            msg.append(_NO_SUCH_ENTITY_WITH_KEY);

            msg.append("v_id=");
            msg.append(v_id);

            msg.append(", employeeId=");
            msg.append(employeeId);

            msg.append(StringPool.CLOSE_CURLY_BRACE);

            if (_log.isWarnEnabled()) {
                _log.warn(msg.toString());
            }

            throw new NoSuchEmployeeVacancyException(msg.toString());
        }

        return employeeVacancy;
    }

    /**
     * Returns the employee vacancy where v_id = &#63; and employeeId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
     *
     * @param v_id the v_id
     * @param employeeId the employee ID
     * @return the matching employee vacancy, or <code>null</code> if a matching employee vacancy could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EmployeeVacancy fetchByVacancyId_EmployeeId(long v_id,
        long employeeId) throws SystemException {
        return fetchByVacancyId_EmployeeId(v_id, employeeId, true);
    }

    /**
     * Returns the employee vacancy where v_id = &#63; and employeeId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
     *
     * @param v_id the v_id
     * @param employeeId the employee ID
     * @param retrieveFromCache whether to use the finder cache
     * @return the matching employee vacancy, or <code>null</code> if a matching employee vacancy could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EmployeeVacancy fetchByVacancyId_EmployeeId(long v_id,
        long employeeId, boolean retrieveFromCache) throws SystemException {
        Object[] finderArgs = new Object[] { v_id, employeeId };

        Object result = null;

        if (retrieveFromCache) {
            result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_VACANCYID_EMPLOYEEID,
                    finderArgs, this);
        }

        if (result instanceof EmployeeVacancy) {
            EmployeeVacancy employeeVacancy = (EmployeeVacancy) result;

            if ((v_id != employeeVacancy.getV_id()) ||
                    (employeeId != employeeVacancy.getEmployeeId())) {
                result = null;
            }
        }

        if (result == null) {
            StringBundler query = new StringBundler(4);

            query.append(_SQL_SELECT_EMPLOYEEVACANCY_WHERE);

            query.append(_FINDER_COLUMN_VACANCYID_EMPLOYEEID_V_ID_2);

            query.append(_FINDER_COLUMN_VACANCYID_EMPLOYEEID_EMPLOYEEID_2);

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(v_id);

                qPos.add(employeeId);

                List<EmployeeVacancy> list = q.list();

                if (list.isEmpty()) {
                    FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_VACANCYID_EMPLOYEEID,
                        finderArgs, list);
                } else {
                    if ((list.size() > 1) && _log.isWarnEnabled()) {
                        _log.warn(
                            "EmployeeVacancyPersistenceImpl.fetchByVacancyId_EmployeeId(long, long, boolean) with parameters (" +
                            StringUtil.merge(finderArgs) +
                            ") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
                    }

                    EmployeeVacancy employeeVacancy = list.get(0);

                    result = employeeVacancy;

                    cacheResult(employeeVacancy);

                    if ((employeeVacancy.getV_id() != v_id) ||
                            (employeeVacancy.getEmployeeId() != employeeId)) {
                        FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_VACANCYID_EMPLOYEEID,
                            finderArgs, employeeVacancy);
                    }
                }
            } catch (Exception e) {
                FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_VACANCYID_EMPLOYEEID,
                    finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        if (result instanceof List<?>) {
            return null;
        } else {
            return (EmployeeVacancy) result;
        }
    }

    /**
     * Removes the employee vacancy where v_id = &#63; and employeeId = &#63; from the database.
     *
     * @param v_id the v_id
     * @param employeeId the employee ID
     * @return the employee vacancy that was removed
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EmployeeVacancy removeByVacancyId_EmployeeId(long v_id,
        long employeeId) throws NoSuchEmployeeVacancyException, SystemException {
        EmployeeVacancy employeeVacancy = findByVacancyId_EmployeeId(v_id,
                employeeId);

        return remove(employeeVacancy);
    }

    /**
     * Returns the number of employee vacancies where v_id = &#63; and employeeId = &#63;.
     *
     * @param v_id the v_id
     * @param employeeId the employee ID
     * @return the number of matching employee vacancies
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByVacancyId_EmployeeId(long v_id, long employeeId)
        throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_VACANCYID_EMPLOYEEID;

        Object[] finderArgs = new Object[] { v_id, employeeId };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(3);

            query.append(_SQL_COUNT_EMPLOYEEVACANCY_WHERE);

            query.append(_FINDER_COLUMN_VACANCYID_EMPLOYEEID_V_ID_2);

            query.append(_FINDER_COLUMN_VACANCYID_EMPLOYEEID_EMPLOYEEID_2);

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(v_id);

                qPos.add(employeeId);

                count = (Long) q.uniqueResult();

                FinderCacheUtil.putResult(finderPath, finderArgs, count);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return count.intValue();
    }

    /**
     * Returns all the employee vacancies where employeeId = &#63;.
     *
     * @param employeeId the employee ID
     * @return the matching employee vacancies
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<EmployeeVacancy> findByEmployeeId(long employeeId)
        throws SystemException {
        return findByEmployeeId(employeeId, QueryUtil.ALL_POS,
            QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the employee vacancies where employeeId = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.com.ecopharma.hrm.model.impl.EmployeeVacancyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param employeeId the employee ID
     * @param start the lower bound of the range of employee vacancies
     * @param end the upper bound of the range of employee vacancies (not inclusive)
     * @return the range of matching employee vacancies
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<EmployeeVacancy> findByEmployeeId(long employeeId, int start,
        int end) throws SystemException {
        return findByEmployeeId(employeeId, start, end, null);
    }

    /**
     * Returns an ordered range of all the employee vacancies where employeeId = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.com.ecopharma.hrm.model.impl.EmployeeVacancyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param employeeId the employee ID
     * @param start the lower bound of the range of employee vacancies
     * @param end the upper bound of the range of employee vacancies (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of matching employee vacancies
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<EmployeeVacancy> findByEmployeeId(long employeeId, int start,
        int end, OrderByComparator orderByComparator) throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_EMPLOYEEID;
            finderArgs = new Object[] { employeeId };
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_EMPLOYEEID;
            finderArgs = new Object[] { employeeId, start, end, orderByComparator };
        }

        List<EmployeeVacancy> list = (List<EmployeeVacancy>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (EmployeeVacancy employeeVacancy : list) {
                if ((employeeId != employeeVacancy.getEmployeeId())) {
                    list = null;

                    break;
                }
            }
        }

        if (list == null) {
            StringBundler query = null;

            if (orderByComparator != null) {
                query = new StringBundler(3 +
                        (orderByComparator.getOrderByFields().length * 3));
            } else {
                query = new StringBundler(3);
            }

            query.append(_SQL_SELECT_EMPLOYEEVACANCY_WHERE);

            query.append(_FINDER_COLUMN_EMPLOYEEID_EMPLOYEEID_2);

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(EmployeeVacancyModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(employeeId);

                if (!pagination) {
                    list = (List<EmployeeVacancy>) QueryUtil.list(q,
                            getDialect(), start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<EmployeeVacancy>(list);
                } else {
                    list = (List<EmployeeVacancy>) QueryUtil.list(q,
                            getDialect(), start, end);
                }

                cacheResult(list);

                FinderCacheUtil.putResult(finderPath, finderArgs, list);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return list;
    }

    /**
     * Returns the first employee vacancy in the ordered set where employeeId = &#63;.
     *
     * @param employeeId the employee ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching employee vacancy
     * @throws vn.com.ecopharma.hrm.NoSuchEmployeeVacancyException if a matching employee vacancy could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EmployeeVacancy findByEmployeeId_First(long employeeId,
        OrderByComparator orderByComparator)
        throws NoSuchEmployeeVacancyException, SystemException {
        EmployeeVacancy employeeVacancy = fetchByEmployeeId_First(employeeId,
                orderByComparator);

        if (employeeVacancy != null) {
            return employeeVacancy;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("employeeId=");
        msg.append(employeeId);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchEmployeeVacancyException(msg.toString());
    }

    /**
     * Returns the first employee vacancy in the ordered set where employeeId = &#63;.
     *
     * @param employeeId the employee ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching employee vacancy, or <code>null</code> if a matching employee vacancy could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EmployeeVacancy fetchByEmployeeId_First(long employeeId,
        OrderByComparator orderByComparator) throws SystemException {
        List<EmployeeVacancy> list = findByEmployeeId(employeeId, 0, 1,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the last employee vacancy in the ordered set where employeeId = &#63;.
     *
     * @param employeeId the employee ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching employee vacancy
     * @throws vn.com.ecopharma.hrm.NoSuchEmployeeVacancyException if a matching employee vacancy could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EmployeeVacancy findByEmployeeId_Last(long employeeId,
        OrderByComparator orderByComparator)
        throws NoSuchEmployeeVacancyException, SystemException {
        EmployeeVacancy employeeVacancy = fetchByEmployeeId_Last(employeeId,
                orderByComparator);

        if (employeeVacancy != null) {
            return employeeVacancy;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("employeeId=");
        msg.append(employeeId);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchEmployeeVacancyException(msg.toString());
    }

    /**
     * Returns the last employee vacancy in the ordered set where employeeId = &#63;.
     *
     * @param employeeId the employee ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching employee vacancy, or <code>null</code> if a matching employee vacancy could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EmployeeVacancy fetchByEmployeeId_Last(long employeeId,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countByEmployeeId(employeeId);

        if (count == 0) {
            return null;
        }

        List<EmployeeVacancy> list = findByEmployeeId(employeeId, count - 1,
                count, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the employee vacancies before and after the current employee vacancy in the ordered set where employeeId = &#63;.
     *
     * @param employeeVacancyId the primary key of the current employee vacancy
     * @param employeeId the employee ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the previous, current, and next employee vacancy
     * @throws vn.com.ecopharma.hrm.NoSuchEmployeeVacancyException if a employee vacancy with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EmployeeVacancy[] findByEmployeeId_PrevAndNext(
        long employeeVacancyId, long employeeId,
        OrderByComparator orderByComparator)
        throws NoSuchEmployeeVacancyException, SystemException {
        EmployeeVacancy employeeVacancy = findByPrimaryKey(employeeVacancyId);

        Session session = null;

        try {
            session = openSession();

            EmployeeVacancy[] array = new EmployeeVacancyImpl[3];

            array[0] = getByEmployeeId_PrevAndNext(session, employeeVacancy,
                    employeeId, orderByComparator, true);

            array[1] = employeeVacancy;

            array[2] = getByEmployeeId_PrevAndNext(session, employeeVacancy,
                    employeeId, orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected EmployeeVacancy getByEmployeeId_PrevAndNext(Session session,
        EmployeeVacancy employeeVacancy, long employeeId,
        OrderByComparator orderByComparator, boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_EMPLOYEEVACANCY_WHERE);

        query.append(_FINDER_COLUMN_EMPLOYEEID_EMPLOYEEID_2);

        if (orderByComparator != null) {
            String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

            if (orderByConditionFields.length > 0) {
                query.append(WHERE_AND);
            }

            for (int i = 0; i < orderByConditionFields.length; i++) {
                query.append(_ORDER_BY_ENTITY_ALIAS);
                query.append(orderByConditionFields[i]);

                if ((i + 1) < orderByConditionFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN_HAS_NEXT);
                    } else {
                        query.append(WHERE_LESSER_THAN_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN);
                    } else {
                        query.append(WHERE_LESSER_THAN);
                    }
                }
            }

            query.append(ORDER_BY_CLAUSE);

            String[] orderByFields = orderByComparator.getOrderByFields();

            for (int i = 0; i < orderByFields.length; i++) {
                query.append(_ORDER_BY_ENTITY_ALIAS);
                query.append(orderByFields[i]);

                if ((i + 1) < orderByFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC_HAS_NEXT);
                    } else {
                        query.append(ORDER_BY_DESC_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC);
                    } else {
                        query.append(ORDER_BY_DESC);
                    }
                }
            }
        } else {
            query.append(EmployeeVacancyModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        qPos.add(employeeId);

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(employeeVacancy);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<EmployeeVacancy> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the employee vacancies where employeeId = &#63; from the database.
     *
     * @param employeeId the employee ID
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByEmployeeId(long employeeId) throws SystemException {
        for (EmployeeVacancy employeeVacancy : findByEmployeeId(employeeId,
                QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
            remove(employeeVacancy);
        }
    }

    /**
     * Returns the number of employee vacancies where employeeId = &#63;.
     *
     * @param employeeId the employee ID
     * @return the number of matching employee vacancies
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByEmployeeId(long employeeId) throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_EMPLOYEEID;

        Object[] finderArgs = new Object[] { employeeId };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(2);

            query.append(_SQL_COUNT_EMPLOYEEVACANCY_WHERE);

            query.append(_FINDER_COLUMN_EMPLOYEEID_EMPLOYEEID_2);

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(employeeId);

                count = (Long) q.uniqueResult();

                FinderCacheUtil.putResult(finderPath, finderArgs, count);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return count.intValue();
    }

    /**
     * Returns all the employee vacancies where v_id = &#63;.
     *
     * @param v_id the v_id
     * @return the matching employee vacancies
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<EmployeeVacancy> findByVacancyId(long v_id)
        throws SystemException {
        return findByVacancyId(v_id, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the employee vacancies where v_id = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.com.ecopharma.hrm.model.impl.EmployeeVacancyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param v_id the v_id
     * @param start the lower bound of the range of employee vacancies
     * @param end the upper bound of the range of employee vacancies (not inclusive)
     * @return the range of matching employee vacancies
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<EmployeeVacancy> findByVacancyId(long v_id, int start, int end)
        throws SystemException {
        return findByVacancyId(v_id, start, end, null);
    }

    /**
     * Returns an ordered range of all the employee vacancies where v_id = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.com.ecopharma.hrm.model.impl.EmployeeVacancyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param v_id the v_id
     * @param start the lower bound of the range of employee vacancies
     * @param end the upper bound of the range of employee vacancies (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of matching employee vacancies
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<EmployeeVacancy> findByVacancyId(long v_id, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_VACANCYID;
            finderArgs = new Object[] { v_id };
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_VACANCYID;
            finderArgs = new Object[] { v_id, start, end, orderByComparator };
        }

        List<EmployeeVacancy> list = (List<EmployeeVacancy>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (EmployeeVacancy employeeVacancy : list) {
                if ((v_id != employeeVacancy.getV_id())) {
                    list = null;

                    break;
                }
            }
        }

        if (list == null) {
            StringBundler query = null;

            if (orderByComparator != null) {
                query = new StringBundler(3 +
                        (orderByComparator.getOrderByFields().length * 3));
            } else {
                query = new StringBundler(3);
            }

            query.append(_SQL_SELECT_EMPLOYEEVACANCY_WHERE);

            query.append(_FINDER_COLUMN_VACANCYID_V_ID_2);

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(EmployeeVacancyModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(v_id);

                if (!pagination) {
                    list = (List<EmployeeVacancy>) QueryUtil.list(q,
                            getDialect(), start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<EmployeeVacancy>(list);
                } else {
                    list = (List<EmployeeVacancy>) QueryUtil.list(q,
                            getDialect(), start, end);
                }

                cacheResult(list);

                FinderCacheUtil.putResult(finderPath, finderArgs, list);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return list;
    }

    /**
     * Returns the first employee vacancy in the ordered set where v_id = &#63;.
     *
     * @param v_id the v_id
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching employee vacancy
     * @throws vn.com.ecopharma.hrm.NoSuchEmployeeVacancyException if a matching employee vacancy could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EmployeeVacancy findByVacancyId_First(long v_id,
        OrderByComparator orderByComparator)
        throws NoSuchEmployeeVacancyException, SystemException {
        EmployeeVacancy employeeVacancy = fetchByVacancyId_First(v_id,
                orderByComparator);

        if (employeeVacancy != null) {
            return employeeVacancy;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("v_id=");
        msg.append(v_id);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchEmployeeVacancyException(msg.toString());
    }

    /**
     * Returns the first employee vacancy in the ordered set where v_id = &#63;.
     *
     * @param v_id the v_id
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching employee vacancy, or <code>null</code> if a matching employee vacancy could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EmployeeVacancy fetchByVacancyId_First(long v_id,
        OrderByComparator orderByComparator) throws SystemException {
        List<EmployeeVacancy> list = findByVacancyId(v_id, 0, 1,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the last employee vacancy in the ordered set where v_id = &#63;.
     *
     * @param v_id the v_id
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching employee vacancy
     * @throws vn.com.ecopharma.hrm.NoSuchEmployeeVacancyException if a matching employee vacancy could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EmployeeVacancy findByVacancyId_Last(long v_id,
        OrderByComparator orderByComparator)
        throws NoSuchEmployeeVacancyException, SystemException {
        EmployeeVacancy employeeVacancy = fetchByVacancyId_Last(v_id,
                orderByComparator);

        if (employeeVacancy != null) {
            return employeeVacancy;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("v_id=");
        msg.append(v_id);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchEmployeeVacancyException(msg.toString());
    }

    /**
     * Returns the last employee vacancy in the ordered set where v_id = &#63;.
     *
     * @param v_id the v_id
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching employee vacancy, or <code>null</code> if a matching employee vacancy could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EmployeeVacancy fetchByVacancyId_Last(long v_id,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countByVacancyId(v_id);

        if (count == 0) {
            return null;
        }

        List<EmployeeVacancy> list = findByVacancyId(v_id, count - 1, count,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the employee vacancies before and after the current employee vacancy in the ordered set where v_id = &#63;.
     *
     * @param employeeVacancyId the primary key of the current employee vacancy
     * @param v_id the v_id
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the previous, current, and next employee vacancy
     * @throws vn.com.ecopharma.hrm.NoSuchEmployeeVacancyException if a employee vacancy with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EmployeeVacancy[] findByVacancyId_PrevAndNext(
        long employeeVacancyId, long v_id, OrderByComparator orderByComparator)
        throws NoSuchEmployeeVacancyException, SystemException {
        EmployeeVacancy employeeVacancy = findByPrimaryKey(employeeVacancyId);

        Session session = null;

        try {
            session = openSession();

            EmployeeVacancy[] array = new EmployeeVacancyImpl[3];

            array[0] = getByVacancyId_PrevAndNext(session, employeeVacancy,
                    v_id, orderByComparator, true);

            array[1] = employeeVacancy;

            array[2] = getByVacancyId_PrevAndNext(session, employeeVacancy,
                    v_id, orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected EmployeeVacancy getByVacancyId_PrevAndNext(Session session,
        EmployeeVacancy employeeVacancy, long v_id,
        OrderByComparator orderByComparator, boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_EMPLOYEEVACANCY_WHERE);

        query.append(_FINDER_COLUMN_VACANCYID_V_ID_2);

        if (orderByComparator != null) {
            String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

            if (orderByConditionFields.length > 0) {
                query.append(WHERE_AND);
            }

            for (int i = 0; i < orderByConditionFields.length; i++) {
                query.append(_ORDER_BY_ENTITY_ALIAS);
                query.append(orderByConditionFields[i]);

                if ((i + 1) < orderByConditionFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN_HAS_NEXT);
                    } else {
                        query.append(WHERE_LESSER_THAN_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN);
                    } else {
                        query.append(WHERE_LESSER_THAN);
                    }
                }
            }

            query.append(ORDER_BY_CLAUSE);

            String[] orderByFields = orderByComparator.getOrderByFields();

            for (int i = 0; i < orderByFields.length; i++) {
                query.append(_ORDER_BY_ENTITY_ALIAS);
                query.append(orderByFields[i]);

                if ((i + 1) < orderByFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC_HAS_NEXT);
                    } else {
                        query.append(ORDER_BY_DESC_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC);
                    } else {
                        query.append(ORDER_BY_DESC);
                    }
                }
            }
        } else {
            query.append(EmployeeVacancyModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        qPos.add(v_id);

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(employeeVacancy);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<EmployeeVacancy> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the employee vacancies where v_id = &#63; from the database.
     *
     * @param v_id the v_id
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByVacancyId(long v_id) throws SystemException {
        for (EmployeeVacancy employeeVacancy : findByVacancyId(v_id,
                QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
            remove(employeeVacancy);
        }
    }

    /**
     * Returns the number of employee vacancies where v_id = &#63;.
     *
     * @param v_id the v_id
     * @return the number of matching employee vacancies
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByVacancyId(long v_id) throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_VACANCYID;

        Object[] finderArgs = new Object[] { v_id };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(2);

            query.append(_SQL_COUNT_EMPLOYEEVACANCY_WHERE);

            query.append(_FINDER_COLUMN_VACANCYID_V_ID_2);

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(v_id);

                count = (Long) q.uniqueResult();

                FinderCacheUtil.putResult(finderPath, finderArgs, count);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return count.intValue();
    }

    /**
     * Caches the employee vacancy in the entity cache if it is enabled.
     *
     * @param employeeVacancy the employee vacancy
     */
    @Override
    public void cacheResult(EmployeeVacancy employeeVacancy) {
        EntityCacheUtil.putResult(EmployeeVacancyModelImpl.ENTITY_CACHE_ENABLED,
            EmployeeVacancyImpl.class, employeeVacancy.getPrimaryKey(),
            employeeVacancy);

        FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_VACANCYID_EMPLOYEEID,
            new Object[] {
                employeeVacancy.getV_id(), employeeVacancy.getEmployeeId()
            }, employeeVacancy);

        employeeVacancy.resetOriginalValues();
    }

    /**
     * Caches the employee vacancies in the entity cache if it is enabled.
     *
     * @param employeeVacancies the employee vacancies
     */
    @Override
    public void cacheResult(List<EmployeeVacancy> employeeVacancies) {
        for (EmployeeVacancy employeeVacancy : employeeVacancies) {
            if (EntityCacheUtil.getResult(
                        EmployeeVacancyModelImpl.ENTITY_CACHE_ENABLED,
                        EmployeeVacancyImpl.class,
                        employeeVacancy.getPrimaryKey()) == null) {
                cacheResult(employeeVacancy);
            } else {
                employeeVacancy.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all employee vacancies.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(EmployeeVacancyImpl.class.getName());
        }

        EntityCacheUtil.clearCache(EmployeeVacancyImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the employee vacancy.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(EmployeeVacancy employeeVacancy) {
        EntityCacheUtil.removeResult(EmployeeVacancyModelImpl.ENTITY_CACHE_ENABLED,
            EmployeeVacancyImpl.class, employeeVacancy.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        clearUniqueFindersCache(employeeVacancy);
    }

    @Override
    public void clearCache(List<EmployeeVacancy> employeeVacancies) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (EmployeeVacancy employeeVacancy : employeeVacancies) {
            EntityCacheUtil.removeResult(EmployeeVacancyModelImpl.ENTITY_CACHE_ENABLED,
                EmployeeVacancyImpl.class, employeeVacancy.getPrimaryKey());

            clearUniqueFindersCache(employeeVacancy);
        }
    }

    protected void cacheUniqueFindersCache(EmployeeVacancy employeeVacancy) {
        if (employeeVacancy.isNew()) {
            Object[] args = new Object[] {
                    employeeVacancy.getV_id(), employeeVacancy.getEmployeeId()
                };

            FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_VACANCYID_EMPLOYEEID,
                args, Long.valueOf(1));
            FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_VACANCYID_EMPLOYEEID,
                args, employeeVacancy);
        } else {
            EmployeeVacancyModelImpl employeeVacancyModelImpl = (EmployeeVacancyModelImpl) employeeVacancy;

            if ((employeeVacancyModelImpl.getColumnBitmask() &
                    FINDER_PATH_FETCH_BY_VACANCYID_EMPLOYEEID.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        employeeVacancy.getV_id(),
                        employeeVacancy.getEmployeeId()
                    };

                FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_VACANCYID_EMPLOYEEID,
                    args, Long.valueOf(1));
                FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_VACANCYID_EMPLOYEEID,
                    args, employeeVacancy);
            }
        }
    }

    protected void clearUniqueFindersCache(EmployeeVacancy employeeVacancy) {
        EmployeeVacancyModelImpl employeeVacancyModelImpl = (EmployeeVacancyModelImpl) employeeVacancy;

        Object[] args = new Object[] {
                employeeVacancy.getV_id(), employeeVacancy.getEmployeeId()
            };

        FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_VACANCYID_EMPLOYEEID,
            args);
        FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_VACANCYID_EMPLOYEEID,
            args);

        if ((employeeVacancyModelImpl.getColumnBitmask() &
                FINDER_PATH_FETCH_BY_VACANCYID_EMPLOYEEID.getColumnBitmask()) != 0) {
            args = new Object[] {
                    employeeVacancyModelImpl.getOriginalV_id(),
                    employeeVacancyModelImpl.getOriginalEmployeeId()
                };

            FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_VACANCYID_EMPLOYEEID,
                args);
            FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_VACANCYID_EMPLOYEEID,
                args);
        }
    }

    /**
     * Creates a new employee vacancy with the primary key. Does not add the employee vacancy to the database.
     *
     * @param employeeVacancyId the primary key for the new employee vacancy
     * @return the new employee vacancy
     */
    @Override
    public EmployeeVacancy create(long employeeVacancyId) {
        EmployeeVacancy employeeVacancy = new EmployeeVacancyImpl();

        employeeVacancy.setNew(true);
        employeeVacancy.setPrimaryKey(employeeVacancyId);

        return employeeVacancy;
    }

    /**
     * Removes the employee vacancy with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param employeeVacancyId the primary key of the employee vacancy
     * @return the employee vacancy that was removed
     * @throws vn.com.ecopharma.hrm.NoSuchEmployeeVacancyException if a employee vacancy with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EmployeeVacancy remove(long employeeVacancyId)
        throws NoSuchEmployeeVacancyException, SystemException {
        return remove((Serializable) employeeVacancyId);
    }

    /**
     * Removes the employee vacancy with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the employee vacancy
     * @return the employee vacancy that was removed
     * @throws vn.com.ecopharma.hrm.NoSuchEmployeeVacancyException if a employee vacancy with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EmployeeVacancy remove(Serializable primaryKey)
        throws NoSuchEmployeeVacancyException, SystemException {
        Session session = null;

        try {
            session = openSession();

            EmployeeVacancy employeeVacancy = (EmployeeVacancy) session.get(EmployeeVacancyImpl.class,
                    primaryKey);

            if (employeeVacancy == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchEmployeeVacancyException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(employeeVacancy);
        } catch (NoSuchEmployeeVacancyException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected EmployeeVacancy removeImpl(EmployeeVacancy employeeVacancy)
        throws SystemException {
        employeeVacancy = toUnwrappedModel(employeeVacancy);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(employeeVacancy)) {
                employeeVacancy = (EmployeeVacancy) session.get(EmployeeVacancyImpl.class,
                        employeeVacancy.getPrimaryKeyObj());
            }

            if (employeeVacancy != null) {
                session.delete(employeeVacancy);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (employeeVacancy != null) {
            clearCache(employeeVacancy);
        }

        return employeeVacancy;
    }

    @Override
    public EmployeeVacancy updateImpl(
        vn.com.ecopharma.hrm.model.EmployeeVacancy employeeVacancy)
        throws SystemException {
        employeeVacancy = toUnwrappedModel(employeeVacancy);

        boolean isNew = employeeVacancy.isNew();

        EmployeeVacancyModelImpl employeeVacancyModelImpl = (EmployeeVacancyModelImpl) employeeVacancy;

        Session session = null;

        try {
            session = openSession();

            if (employeeVacancy.isNew()) {
                session.save(employeeVacancy);

                employeeVacancy.setNew(false);
            } else {
                session.merge(employeeVacancy);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

        if (isNew || !EmployeeVacancyModelImpl.COLUMN_BITMASK_ENABLED) {
            FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
        }
        else {
            if ((employeeVacancyModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_EMPLOYEEID.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        employeeVacancyModelImpl.getOriginalEmployeeId()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_EMPLOYEEID,
                    args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_EMPLOYEEID,
                    args);

                args = new Object[] { employeeVacancyModelImpl.getEmployeeId() };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_EMPLOYEEID,
                    args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_EMPLOYEEID,
                    args);
            }

            if ((employeeVacancyModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_VACANCYID.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        employeeVacancyModelImpl.getOriginalV_id()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_VACANCYID,
                    args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_VACANCYID,
                    args);

                args = new Object[] { employeeVacancyModelImpl.getV_id() };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_VACANCYID,
                    args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_VACANCYID,
                    args);
            }
        }

        EntityCacheUtil.putResult(EmployeeVacancyModelImpl.ENTITY_CACHE_ENABLED,
            EmployeeVacancyImpl.class, employeeVacancy.getPrimaryKey(),
            employeeVacancy);

        clearUniqueFindersCache(employeeVacancy);
        cacheUniqueFindersCache(employeeVacancy);

        return employeeVacancy;
    }

    protected EmployeeVacancy toUnwrappedModel(EmployeeVacancy employeeVacancy) {
        if (employeeVacancy instanceof EmployeeVacancyImpl) {
            return employeeVacancy;
        }

        EmployeeVacancyImpl employeeVacancyImpl = new EmployeeVacancyImpl();

        employeeVacancyImpl.setNew(employeeVacancy.isNew());
        employeeVacancyImpl.setPrimaryKey(employeeVacancy.getPrimaryKey());

        employeeVacancyImpl.setEmployeeVacancyId(employeeVacancy.getEmployeeVacancyId());
        employeeVacancyImpl.setEmployeeId(employeeVacancy.getEmployeeId());
        employeeVacancyImpl.setV_id(employeeVacancy.getV_id());
        employeeVacancyImpl.setGroupId(employeeVacancy.getGroupId());
        employeeVacancyImpl.setCompanyId(employeeVacancy.getCompanyId());
        employeeVacancyImpl.setUserId(employeeVacancy.getUserId());
        employeeVacancyImpl.setCreateDate(employeeVacancy.getCreateDate());
        employeeVacancyImpl.setModifiedDate(employeeVacancy.getModifiedDate());

        return employeeVacancyImpl;
    }

    /**
     * Returns the employee vacancy with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the employee vacancy
     * @return the employee vacancy
     * @throws vn.com.ecopharma.hrm.NoSuchEmployeeVacancyException if a employee vacancy with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EmployeeVacancy findByPrimaryKey(Serializable primaryKey)
        throws NoSuchEmployeeVacancyException, SystemException {
        EmployeeVacancy employeeVacancy = fetchByPrimaryKey(primaryKey);

        if (employeeVacancy == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchEmployeeVacancyException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return employeeVacancy;
    }

    /**
     * Returns the employee vacancy with the primary key or throws a {@link vn.com.ecopharma.hrm.NoSuchEmployeeVacancyException} if it could not be found.
     *
     * @param employeeVacancyId the primary key of the employee vacancy
     * @return the employee vacancy
     * @throws vn.com.ecopharma.hrm.NoSuchEmployeeVacancyException if a employee vacancy with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EmployeeVacancy findByPrimaryKey(long employeeVacancyId)
        throws NoSuchEmployeeVacancyException, SystemException {
        return findByPrimaryKey((Serializable) employeeVacancyId);
    }

    /**
     * Returns the employee vacancy with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the employee vacancy
     * @return the employee vacancy, or <code>null</code> if a employee vacancy with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EmployeeVacancy fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        EmployeeVacancy employeeVacancy = (EmployeeVacancy) EntityCacheUtil.getResult(EmployeeVacancyModelImpl.ENTITY_CACHE_ENABLED,
                EmployeeVacancyImpl.class, primaryKey);

        if (employeeVacancy == _nullEmployeeVacancy) {
            return null;
        }

        if (employeeVacancy == null) {
            Session session = null;

            try {
                session = openSession();

                employeeVacancy = (EmployeeVacancy) session.get(EmployeeVacancyImpl.class,
                        primaryKey);

                if (employeeVacancy != null) {
                    cacheResult(employeeVacancy);
                } else {
                    EntityCacheUtil.putResult(EmployeeVacancyModelImpl.ENTITY_CACHE_ENABLED,
                        EmployeeVacancyImpl.class, primaryKey,
                        _nullEmployeeVacancy);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(EmployeeVacancyModelImpl.ENTITY_CACHE_ENABLED,
                    EmployeeVacancyImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return employeeVacancy;
    }

    /**
     * Returns the employee vacancy with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param employeeVacancyId the primary key of the employee vacancy
     * @return the employee vacancy, or <code>null</code> if a employee vacancy with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public EmployeeVacancy fetchByPrimaryKey(long employeeVacancyId)
        throws SystemException {
        return fetchByPrimaryKey((Serializable) employeeVacancyId);
    }

    /**
     * Returns all the employee vacancies.
     *
     * @return the employee vacancies
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<EmployeeVacancy> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the employee vacancies.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.com.ecopharma.hrm.model.impl.EmployeeVacancyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of employee vacancies
     * @param end the upper bound of the range of employee vacancies (not inclusive)
     * @return the range of employee vacancies
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<EmployeeVacancy> findAll(int start, int end)
        throws SystemException {
        return findAll(start, end, null);
    }

    /**
     * Returns an ordered range of all the employee vacancies.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.com.ecopharma.hrm.model.impl.EmployeeVacancyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of employee vacancies
     * @param end the upper bound of the range of employee vacancies (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of employee vacancies
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<EmployeeVacancy> findAll(int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
            finderArgs = FINDER_ARGS_EMPTY;
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
            finderArgs = new Object[] { start, end, orderByComparator };
        }

        List<EmployeeVacancy> list = (List<EmployeeVacancy>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_EMPLOYEEVACANCY);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_EMPLOYEEVACANCY;

                if (pagination) {
                    sql = sql.concat(EmployeeVacancyModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<EmployeeVacancy>) QueryUtil.list(q,
                            getDialect(), start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<EmployeeVacancy>(list);
                } else {
                    list = (List<EmployeeVacancy>) QueryUtil.list(q,
                            getDialect(), start, end);
                }

                cacheResult(list);

                FinderCacheUtil.putResult(finderPath, finderArgs, list);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return list;
    }

    /**
     * Removes all the employee vacancies from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (EmployeeVacancy employeeVacancy : findAll()) {
            remove(employeeVacancy);
        }
    }

    /**
     * Returns the number of employee vacancies.
     *
     * @return the number of employee vacancies
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countAll() throws SystemException {
        Long count = (Long) FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
                FINDER_ARGS_EMPTY, this);

        if (count == null) {
            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(_SQL_COUNT_EMPLOYEEVACANCY);

                count = (Long) q.uniqueResult();

                FinderCacheUtil.putResult(FINDER_PATH_COUNT_ALL,
                    FINDER_ARGS_EMPTY, count);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_ALL,
                    FINDER_ARGS_EMPTY);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return count.intValue();
    }

    /**
     * Initializes the employee vacancy persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.vn.com.ecopharma.hrm.model.EmployeeVacancy")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<EmployeeVacancy>> listenersList = new ArrayList<ModelListener<EmployeeVacancy>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<EmployeeVacancy>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(EmployeeVacancyImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
