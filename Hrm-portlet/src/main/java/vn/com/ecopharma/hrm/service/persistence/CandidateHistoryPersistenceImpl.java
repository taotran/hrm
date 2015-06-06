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

import vn.com.ecopharma.hrm.NoSuchCandidateHistoryException;
import vn.com.ecopharma.hrm.model.CandidateHistory;
import vn.com.ecopharma.hrm.model.impl.CandidateHistoryImpl;
import vn.com.ecopharma.hrm.model.impl.CandidateHistoryModelImpl;
import vn.com.ecopharma.hrm.service.persistence.CandidateHistoryPersistence;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the candidate history service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author tvt
 * @see CandidateHistoryPersistence
 * @see CandidateHistoryUtil
 * @generated
 */
public class CandidateHistoryPersistenceImpl extends BasePersistenceImpl<CandidateHistory>
    implements CandidateHistoryPersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link CandidateHistoryUtil} to access the candidate history persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = CandidateHistoryImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(CandidateHistoryModelImpl.ENTITY_CACHE_ENABLED,
            CandidateHistoryModelImpl.FINDER_CACHE_ENABLED,
            CandidateHistoryImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
            "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(CandidateHistoryModelImpl.ENTITY_CACHE_ENABLED,
            CandidateHistoryModelImpl.FINDER_CACHE_ENABLED,
            CandidateHistoryImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(CandidateHistoryModelImpl.ENTITY_CACHE_ENABLED,
            CandidateHistoryModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_C_ID = new FinderPath(CandidateHistoryModelImpl.ENTITY_CACHE_ENABLED,
            CandidateHistoryModelImpl.FINDER_CACHE_ENABLED,
            CandidateHistoryImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
            "findByC_Id",
            new String[] {
                Long.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C_ID = new FinderPath(CandidateHistoryModelImpl.ENTITY_CACHE_ENABLED,
            CandidateHistoryModelImpl.FINDER_CACHE_ENABLED,
            CandidateHistoryImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByC_Id",
            new String[] { Long.class.getName() },
            CandidateHistoryModelImpl.C_ID_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_C_ID = new FinderPath(CandidateHistoryModelImpl.ENTITY_CACHE_ENABLED,
            CandidateHistoryModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByC_Id",
            new String[] { Long.class.getName() });
    private static final String _FINDER_COLUMN_C_ID_C_ID_2 = "candidateHistory.c_id = ?";
    private static final String _SQL_SELECT_CANDIDATEHISTORY = "SELECT candidateHistory FROM CandidateHistory candidateHistory";
    private static final String _SQL_SELECT_CANDIDATEHISTORY_WHERE = "SELECT candidateHistory FROM CandidateHistory candidateHistory WHERE ";
    private static final String _SQL_COUNT_CANDIDATEHISTORY = "SELECT COUNT(candidateHistory) FROM CandidateHistory candidateHistory";
    private static final String _SQL_COUNT_CANDIDATEHISTORY_WHERE = "SELECT COUNT(candidateHistory) FROM CandidateHistory candidateHistory WHERE ";
    private static final String _ORDER_BY_ENTITY_ALIAS = "candidateHistory.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No CandidateHistory exists with the primary key ";
    private static final String _NO_SUCH_ENTITY_WITH_KEY = "No CandidateHistory exists with the key {";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(CandidateHistoryPersistenceImpl.class);
    private static CandidateHistory _nullCandidateHistory = new CandidateHistoryImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<CandidateHistory> toCacheModel() {
                return _nullCandidateHistoryCacheModel;
            }
        };

    private static CacheModel<CandidateHistory> _nullCandidateHistoryCacheModel = new CacheModel<CandidateHistory>() {
            @Override
            public CandidateHistory toEntityModel() {
                return _nullCandidateHistory;
            }
        };

    public CandidateHistoryPersistenceImpl() {
        setModelClass(CandidateHistory.class);
    }

    /**
     * Returns all the candidate histories where c_id = &#63;.
     *
     * @param c_id the c_id
     * @return the matching candidate histories
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<CandidateHistory> findByC_Id(long c_id)
        throws SystemException {
        return findByC_Id(c_id, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
    @Override
    public List<CandidateHistory> findByC_Id(long c_id, int start, int end)
        throws SystemException {
        return findByC_Id(c_id, start, end, null);
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
    @Override
    public List<CandidateHistory> findByC_Id(long c_id, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C_ID;
            finderArgs = new Object[] { c_id };
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_C_ID;
            finderArgs = new Object[] { c_id, start, end, orderByComparator };
        }

        List<CandidateHistory> list = (List<CandidateHistory>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (CandidateHistory candidateHistory : list) {
                if ((c_id != candidateHistory.getC_id())) {
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

            query.append(_SQL_SELECT_CANDIDATEHISTORY_WHERE);

            query.append(_FINDER_COLUMN_C_ID_C_ID_2);

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(CandidateHistoryModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(c_id);

                if (!pagination) {
                    list = (List<CandidateHistory>) QueryUtil.list(q,
                            getDialect(), start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<CandidateHistory>(list);
                } else {
                    list = (List<CandidateHistory>) QueryUtil.list(q,
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
     * Returns the first candidate history in the ordered set where c_id = &#63;.
     *
     * @param c_id the c_id
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching candidate history
     * @throws vn.com.ecopharma.hrm.NoSuchCandidateHistoryException if a matching candidate history could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public CandidateHistory findByC_Id_First(long c_id,
        OrderByComparator orderByComparator)
        throws NoSuchCandidateHistoryException, SystemException {
        CandidateHistory candidateHistory = fetchByC_Id_First(c_id,
                orderByComparator);

        if (candidateHistory != null) {
            return candidateHistory;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("c_id=");
        msg.append(c_id);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchCandidateHistoryException(msg.toString());
    }

    /**
     * Returns the first candidate history in the ordered set where c_id = &#63;.
     *
     * @param c_id the c_id
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching candidate history, or <code>null</code> if a matching candidate history could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public CandidateHistory fetchByC_Id_First(long c_id,
        OrderByComparator orderByComparator) throws SystemException {
        List<CandidateHistory> list = findByC_Id(c_id, 0, 1, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
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
    @Override
    public CandidateHistory findByC_Id_Last(long c_id,
        OrderByComparator orderByComparator)
        throws NoSuchCandidateHistoryException, SystemException {
        CandidateHistory candidateHistory = fetchByC_Id_Last(c_id,
                orderByComparator);

        if (candidateHistory != null) {
            return candidateHistory;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("c_id=");
        msg.append(c_id);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchCandidateHistoryException(msg.toString());
    }

    /**
     * Returns the last candidate history in the ordered set where c_id = &#63;.
     *
     * @param c_id the c_id
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching candidate history, or <code>null</code> if a matching candidate history could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public CandidateHistory fetchByC_Id_Last(long c_id,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countByC_Id(c_id);

        if (count == 0) {
            return null;
        }

        List<CandidateHistory> list = findByC_Id(c_id, count - 1, count,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
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
    @Override
    public CandidateHistory[] findByC_Id_PrevAndNext(long candidateHistoryId,
        long c_id, OrderByComparator orderByComparator)
        throws NoSuchCandidateHistoryException, SystemException {
        CandidateHistory candidateHistory = findByPrimaryKey(candidateHistoryId);

        Session session = null;

        try {
            session = openSession();

            CandidateHistory[] array = new CandidateHistoryImpl[3];

            array[0] = getByC_Id_PrevAndNext(session, candidateHistory, c_id,
                    orderByComparator, true);

            array[1] = candidateHistory;

            array[2] = getByC_Id_PrevAndNext(session, candidateHistory, c_id,
                    orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected CandidateHistory getByC_Id_PrevAndNext(Session session,
        CandidateHistory candidateHistory, long c_id,
        OrderByComparator orderByComparator, boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_CANDIDATEHISTORY_WHERE);

        query.append(_FINDER_COLUMN_C_ID_C_ID_2);

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
            query.append(CandidateHistoryModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        qPos.add(c_id);

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(candidateHistory);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<CandidateHistory> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the candidate histories where c_id = &#63; from the database.
     *
     * @param c_id the c_id
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByC_Id(long c_id) throws SystemException {
        for (CandidateHistory candidateHistory : findByC_Id(c_id,
                QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
            remove(candidateHistory);
        }
    }

    /**
     * Returns the number of candidate histories where c_id = &#63;.
     *
     * @param c_id the c_id
     * @return the number of matching candidate histories
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByC_Id(long c_id) throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_C_ID;

        Object[] finderArgs = new Object[] { c_id };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(2);

            query.append(_SQL_COUNT_CANDIDATEHISTORY_WHERE);

            query.append(_FINDER_COLUMN_C_ID_C_ID_2);

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(c_id);

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
     * Caches the candidate history in the entity cache if it is enabled.
     *
     * @param candidateHistory the candidate history
     */
    @Override
    public void cacheResult(CandidateHistory candidateHistory) {
        EntityCacheUtil.putResult(CandidateHistoryModelImpl.ENTITY_CACHE_ENABLED,
            CandidateHistoryImpl.class, candidateHistory.getPrimaryKey(),
            candidateHistory);

        candidateHistory.resetOriginalValues();
    }

    /**
     * Caches the candidate histories in the entity cache if it is enabled.
     *
     * @param candidateHistories the candidate histories
     */
    @Override
    public void cacheResult(List<CandidateHistory> candidateHistories) {
        for (CandidateHistory candidateHistory : candidateHistories) {
            if (EntityCacheUtil.getResult(
                        CandidateHistoryModelImpl.ENTITY_CACHE_ENABLED,
                        CandidateHistoryImpl.class,
                        candidateHistory.getPrimaryKey()) == null) {
                cacheResult(candidateHistory);
            } else {
                candidateHistory.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all candidate histories.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(CandidateHistoryImpl.class.getName());
        }

        EntityCacheUtil.clearCache(CandidateHistoryImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the candidate history.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(CandidateHistory candidateHistory) {
        EntityCacheUtil.removeResult(CandidateHistoryModelImpl.ENTITY_CACHE_ENABLED,
            CandidateHistoryImpl.class, candidateHistory.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    @Override
    public void clearCache(List<CandidateHistory> candidateHistories) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (CandidateHistory candidateHistory : candidateHistories) {
            EntityCacheUtil.removeResult(CandidateHistoryModelImpl.ENTITY_CACHE_ENABLED,
                CandidateHistoryImpl.class, candidateHistory.getPrimaryKey());
        }
    }

    /**
     * Creates a new candidate history with the primary key. Does not add the candidate history to the database.
     *
     * @param candidateHistoryId the primary key for the new candidate history
     * @return the new candidate history
     */
    @Override
    public CandidateHistory create(long candidateHistoryId) {
        CandidateHistory candidateHistory = new CandidateHistoryImpl();

        candidateHistory.setNew(true);
        candidateHistory.setPrimaryKey(candidateHistoryId);

        return candidateHistory;
    }

    /**
     * Removes the candidate history with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param candidateHistoryId the primary key of the candidate history
     * @return the candidate history that was removed
     * @throws vn.com.ecopharma.hrm.NoSuchCandidateHistoryException if a candidate history with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public CandidateHistory remove(long candidateHistoryId)
        throws NoSuchCandidateHistoryException, SystemException {
        return remove((Serializable) candidateHistoryId);
    }

    /**
     * Removes the candidate history with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the candidate history
     * @return the candidate history that was removed
     * @throws vn.com.ecopharma.hrm.NoSuchCandidateHistoryException if a candidate history with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public CandidateHistory remove(Serializable primaryKey)
        throws NoSuchCandidateHistoryException, SystemException {
        Session session = null;

        try {
            session = openSession();

            CandidateHistory candidateHistory = (CandidateHistory) session.get(CandidateHistoryImpl.class,
                    primaryKey);

            if (candidateHistory == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchCandidateHistoryException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(candidateHistory);
        } catch (NoSuchCandidateHistoryException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected CandidateHistory removeImpl(CandidateHistory candidateHistory)
        throws SystemException {
        candidateHistory = toUnwrappedModel(candidateHistory);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(candidateHistory)) {
                candidateHistory = (CandidateHistory) session.get(CandidateHistoryImpl.class,
                        candidateHistory.getPrimaryKeyObj());
            }

            if (candidateHistory != null) {
                session.delete(candidateHistory);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (candidateHistory != null) {
            clearCache(candidateHistory);
        }

        return candidateHistory;
    }

    @Override
    public CandidateHistory updateImpl(
        vn.com.ecopharma.hrm.model.CandidateHistory candidateHistory)
        throws SystemException {
        candidateHistory = toUnwrappedModel(candidateHistory);

        boolean isNew = candidateHistory.isNew();

        CandidateHistoryModelImpl candidateHistoryModelImpl = (CandidateHistoryModelImpl) candidateHistory;

        Session session = null;

        try {
            session = openSession();

            if (candidateHistory.isNew()) {
                session.save(candidateHistory);

                candidateHistory.setNew(false);
            } else {
                session.merge(candidateHistory);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

        if (isNew || !CandidateHistoryModelImpl.COLUMN_BITMASK_ENABLED) {
            FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
        }
        else {
            if ((candidateHistoryModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C_ID.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        candidateHistoryModelImpl.getOriginalC_id()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_C_ID, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C_ID,
                    args);

                args = new Object[] { candidateHistoryModelImpl.getC_id() };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_C_ID, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C_ID,
                    args);
            }
        }

        EntityCacheUtil.putResult(CandidateHistoryModelImpl.ENTITY_CACHE_ENABLED,
            CandidateHistoryImpl.class, candidateHistory.getPrimaryKey(),
            candidateHistory);

        return candidateHistory;
    }

    protected CandidateHistory toUnwrappedModel(
        CandidateHistory candidateHistory) {
        if (candidateHistory instanceof CandidateHistoryImpl) {
            return candidateHistory;
        }

        CandidateHistoryImpl candidateHistoryImpl = new CandidateHistoryImpl();

        candidateHistoryImpl.setNew(candidateHistory.isNew());
        candidateHistoryImpl.setPrimaryKey(candidateHistory.getPrimaryKey());

        candidateHistoryImpl.setCandidateHistoryId(candidateHistory.getCandidateHistoryId());
        candidateHistoryImpl.setC_id(candidateHistory.getC_id());
        candidateHistoryImpl.setV_id(candidateHistory.getV_id());
        candidateHistoryImpl.setInterviewId(candidateHistory.getInterviewId());
        candidateHistoryImpl.setPerformed_by(candidateHistory.getPerformed_by());
        candidateHistoryImpl.setNote(candidateHistory.getNote());
        candidateHistoryImpl.setInterviewers(candidateHistory.getInterviewers());
        candidateHistoryImpl.setAction(candidateHistory.getAction());
        candidateHistoryImpl.setGroupId(candidateHistory.getGroupId());
        candidateHistoryImpl.setCompanyId(candidateHistory.getCompanyId());
        candidateHistoryImpl.setUserId(candidateHistory.getUserId());
        candidateHistoryImpl.setUserName(candidateHistory.getUserName());

        return candidateHistoryImpl;
    }

    /**
     * Returns the candidate history with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the candidate history
     * @return the candidate history
     * @throws vn.com.ecopharma.hrm.NoSuchCandidateHistoryException if a candidate history with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public CandidateHistory findByPrimaryKey(Serializable primaryKey)
        throws NoSuchCandidateHistoryException, SystemException {
        CandidateHistory candidateHistory = fetchByPrimaryKey(primaryKey);

        if (candidateHistory == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchCandidateHistoryException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return candidateHistory;
    }

    /**
     * Returns the candidate history with the primary key or throws a {@link vn.com.ecopharma.hrm.NoSuchCandidateHistoryException} if it could not be found.
     *
     * @param candidateHistoryId the primary key of the candidate history
     * @return the candidate history
     * @throws vn.com.ecopharma.hrm.NoSuchCandidateHistoryException if a candidate history with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public CandidateHistory findByPrimaryKey(long candidateHistoryId)
        throws NoSuchCandidateHistoryException, SystemException {
        return findByPrimaryKey((Serializable) candidateHistoryId);
    }

    /**
     * Returns the candidate history with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the candidate history
     * @return the candidate history, or <code>null</code> if a candidate history with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public CandidateHistory fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        CandidateHistory candidateHistory = (CandidateHistory) EntityCacheUtil.getResult(CandidateHistoryModelImpl.ENTITY_CACHE_ENABLED,
                CandidateHistoryImpl.class, primaryKey);

        if (candidateHistory == _nullCandidateHistory) {
            return null;
        }

        if (candidateHistory == null) {
            Session session = null;

            try {
                session = openSession();

                candidateHistory = (CandidateHistory) session.get(CandidateHistoryImpl.class,
                        primaryKey);

                if (candidateHistory != null) {
                    cacheResult(candidateHistory);
                } else {
                    EntityCacheUtil.putResult(CandidateHistoryModelImpl.ENTITY_CACHE_ENABLED,
                        CandidateHistoryImpl.class, primaryKey,
                        _nullCandidateHistory);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(CandidateHistoryModelImpl.ENTITY_CACHE_ENABLED,
                    CandidateHistoryImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return candidateHistory;
    }

    /**
     * Returns the candidate history with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param candidateHistoryId the primary key of the candidate history
     * @return the candidate history, or <code>null</code> if a candidate history with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public CandidateHistory fetchByPrimaryKey(long candidateHistoryId)
        throws SystemException {
        return fetchByPrimaryKey((Serializable) candidateHistoryId);
    }

    /**
     * Returns all the candidate histories.
     *
     * @return the candidate histories
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<CandidateHistory> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
    @Override
    public List<CandidateHistory> findAll(int start, int end)
        throws SystemException {
        return findAll(start, end, null);
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
    @Override
    public List<CandidateHistory> findAll(int start, int end,
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

        List<CandidateHistory> list = (List<CandidateHistory>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_CANDIDATEHISTORY);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_CANDIDATEHISTORY;

                if (pagination) {
                    sql = sql.concat(CandidateHistoryModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<CandidateHistory>) QueryUtil.list(q,
                            getDialect(), start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<CandidateHistory>(list);
                } else {
                    list = (List<CandidateHistory>) QueryUtil.list(q,
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
     * Removes all the candidate histories from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (CandidateHistory candidateHistory : findAll()) {
            remove(candidateHistory);
        }
    }

    /**
     * Returns the number of candidate histories.
     *
     * @return the number of candidate histories
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

                Query q = session.createQuery(_SQL_COUNT_CANDIDATEHISTORY);

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
     * Initializes the candidate history persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.vn.com.ecopharma.hrm.model.CandidateHistory")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<CandidateHistory>> listenersList = new ArrayList<ModelListener<CandidateHistory>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<CandidateHistory>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(CandidateHistoryImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
