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

import vn.com.ecopharma.hrm.NoSuchVacancyCandidateException;
import vn.com.ecopharma.hrm.model.VacancyCandidate;
import vn.com.ecopharma.hrm.model.impl.VacancyCandidateImpl;
import vn.com.ecopharma.hrm.model.impl.VacancyCandidateModelImpl;
import vn.com.ecopharma.hrm.service.persistence.VacancyCandidatePersistence;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the vacancy candidate service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author tvt
 * @see VacancyCandidatePersistence
 * @see VacancyCandidateUtil
 * @generated
 */
public class VacancyCandidatePersistenceImpl extends BasePersistenceImpl<VacancyCandidate>
    implements VacancyCandidatePersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link VacancyCandidateUtil} to access the vacancy candidate persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = VacancyCandidateImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(VacancyCandidateModelImpl.ENTITY_CACHE_ENABLED,
            VacancyCandidateModelImpl.FINDER_CACHE_ENABLED,
            VacancyCandidateImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
            "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(VacancyCandidateModelImpl.ENTITY_CACHE_ENABLED,
            VacancyCandidateModelImpl.FINDER_CACHE_ENABLED,
            VacancyCandidateImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(VacancyCandidateModelImpl.ENTITY_CACHE_ENABLED,
            VacancyCandidateModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_C_ID = new FinderPath(VacancyCandidateModelImpl.ENTITY_CACHE_ENABLED,
            VacancyCandidateModelImpl.FINDER_CACHE_ENABLED,
            VacancyCandidateImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
            "findByC_Id",
            new String[] {
                Long.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C_ID = new FinderPath(VacancyCandidateModelImpl.ENTITY_CACHE_ENABLED,
            VacancyCandidateModelImpl.FINDER_CACHE_ENABLED,
            VacancyCandidateImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByC_Id",
            new String[] { Long.class.getName() },
            VacancyCandidateModelImpl.C_ID_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_C_ID = new FinderPath(VacancyCandidateModelImpl.ENTITY_CACHE_ENABLED,
            VacancyCandidateModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByC_Id",
            new String[] { Long.class.getName() });
    private static final String _FINDER_COLUMN_C_ID_C_ID_2 = "vacancyCandidate.c_id = ?";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_V_ID = new FinderPath(VacancyCandidateModelImpl.ENTITY_CACHE_ENABLED,
            VacancyCandidateModelImpl.FINDER_CACHE_ENABLED,
            VacancyCandidateImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
            "findByV_Id",
            new String[] {
                Long.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_V_ID = new FinderPath(VacancyCandidateModelImpl.ENTITY_CACHE_ENABLED,
            VacancyCandidateModelImpl.FINDER_CACHE_ENABLED,
            VacancyCandidateImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByV_Id",
            new String[] { Long.class.getName() },
            VacancyCandidateModelImpl.V_ID_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_V_ID = new FinderPath(VacancyCandidateModelImpl.ENTITY_CACHE_ENABLED,
            VacancyCandidateModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByV_Id",
            new String[] { Long.class.getName() });
    private static final String _FINDER_COLUMN_V_ID_V_ID_2 = "vacancyCandidate.v_id = ?";
    public static final FinderPath FINDER_PATH_FETCH_BY_V_ID_AND_C_ID = new FinderPath(VacancyCandidateModelImpl.ENTITY_CACHE_ENABLED,
            VacancyCandidateModelImpl.FINDER_CACHE_ENABLED,
            VacancyCandidateImpl.class, FINDER_CLASS_NAME_ENTITY,
            "fetchByV_Id_And_C_Id",
            new String[] { Long.class.getName(), Long.class.getName() },
            VacancyCandidateModelImpl.V_ID_COLUMN_BITMASK |
            VacancyCandidateModelImpl.C_ID_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_V_ID_AND_C_ID = new FinderPath(VacancyCandidateModelImpl.ENTITY_CACHE_ENABLED,
            VacancyCandidateModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByV_Id_And_C_Id",
            new String[] { Long.class.getName(), Long.class.getName() });
    private static final String _FINDER_COLUMN_V_ID_AND_C_ID_V_ID_2 = "vacancyCandidate.v_id = ? AND ";
    private static final String _FINDER_COLUMN_V_ID_AND_C_ID_C_ID_2 = "vacancyCandidate.c_id = ?";
    public static final FinderPath FINDER_PATH_FETCH_BY_CANDIDATE_AND_VALID_STATUS =
        new FinderPath(VacancyCandidateModelImpl.ENTITY_CACHE_ENABLED,
            VacancyCandidateModelImpl.FINDER_CACHE_ENABLED,
            VacancyCandidateImpl.class, FINDER_CLASS_NAME_ENTITY,
            "fetchByCandidate_And_VALID_Status",
            new String[] { Long.class.getName() },
            VacancyCandidateModelImpl.C_ID_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_CANDIDATE_AND_VALID_STATUS =
        new FinderPath(VacancyCandidateModelImpl.ENTITY_CACHE_ENABLED,
            VacancyCandidateModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
            "countByCandidate_And_VALID_Status",
            new String[] { Long.class.getName() });
    private static final String _FINDER_COLUMN_CANDIDATE_AND_VALID_STATUS_C_ID_2 =
        "vacancyCandidate.c_id = ? AND vacancyCandidate.vc_status = 'VALID'";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_VACANCY_AND_VALID_STATUS =
        new FinderPath(VacancyCandidateModelImpl.ENTITY_CACHE_ENABLED,
            VacancyCandidateModelImpl.FINDER_CACHE_ENABLED,
            VacancyCandidateImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
            "findByVacancy_And_VALID_Status",
            new String[] {
                Long.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_VACANCY_AND_VALID_STATUS =
        new FinderPath(VacancyCandidateModelImpl.ENTITY_CACHE_ENABLED,
            VacancyCandidateModelImpl.FINDER_CACHE_ENABLED,
            VacancyCandidateImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
            "findByVacancy_And_VALID_Status",
            new String[] { Long.class.getName() },
            VacancyCandidateModelImpl.V_ID_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_VACANCY_AND_VALID_STATUS =
        new FinderPath(VacancyCandidateModelImpl.ENTITY_CACHE_ENABLED,
            VacancyCandidateModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
            "countByVacancy_And_VALID_Status",
            new String[] { Long.class.getName() });
    private static final String _FINDER_COLUMN_VACANCY_AND_VALID_STATUS_V_ID_2 = "vacancyCandidate.v_id = ? AND vacancyCandidate.vc_status = 'VALID'";
    private static final String _SQL_SELECT_VACANCYCANDIDATE = "SELECT vacancyCandidate FROM VacancyCandidate vacancyCandidate";
    private static final String _SQL_SELECT_VACANCYCANDIDATE_WHERE = "SELECT vacancyCandidate FROM VacancyCandidate vacancyCandidate WHERE ";
    private static final String _SQL_COUNT_VACANCYCANDIDATE = "SELECT COUNT(vacancyCandidate) FROM VacancyCandidate vacancyCandidate";
    private static final String _SQL_COUNT_VACANCYCANDIDATE_WHERE = "SELECT COUNT(vacancyCandidate) FROM VacancyCandidate vacancyCandidate WHERE ";
    private static final String _ORDER_BY_ENTITY_ALIAS = "vacancyCandidate.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No VacancyCandidate exists with the primary key ";
    private static final String _NO_SUCH_ENTITY_WITH_KEY = "No VacancyCandidate exists with the key {";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(VacancyCandidatePersistenceImpl.class);
    private static VacancyCandidate _nullVacancyCandidate = new VacancyCandidateImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<VacancyCandidate> toCacheModel() {
                return _nullVacancyCandidateCacheModel;
            }
        };

    private static CacheModel<VacancyCandidate> _nullVacancyCandidateCacheModel = new CacheModel<VacancyCandidate>() {
            @Override
            public VacancyCandidate toEntityModel() {
                return _nullVacancyCandidate;
            }
        };

    public VacancyCandidatePersistenceImpl() {
        setModelClass(VacancyCandidate.class);
    }

    /**
     * Returns all the vacancy candidates where c_id = &#63;.
     *
     * @param c_id the c_id
     * @return the matching vacancy candidates
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<VacancyCandidate> findByC_Id(long c_id)
        throws SystemException {
        return findByC_Id(c_id, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

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
    @Override
    public List<VacancyCandidate> findByC_Id(long c_id, int start, int end)
        throws SystemException {
        return findByC_Id(c_id, start, end, null);
    }

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
    @Override
    public List<VacancyCandidate> findByC_Id(long c_id, int start, int end,
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

        List<VacancyCandidate> list = (List<VacancyCandidate>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (VacancyCandidate vacancyCandidate : list) {
                if ((c_id != vacancyCandidate.getC_id())) {
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

            query.append(_SQL_SELECT_VACANCYCANDIDATE_WHERE);

            query.append(_FINDER_COLUMN_C_ID_C_ID_2);

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(VacancyCandidateModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(c_id);

                if (!pagination) {
                    list = (List<VacancyCandidate>) QueryUtil.list(q,
                            getDialect(), start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<VacancyCandidate>(list);
                } else {
                    list = (List<VacancyCandidate>) QueryUtil.list(q,
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
     * Returns the first vacancy candidate in the ordered set where c_id = &#63;.
     *
     * @param c_id the c_id
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching vacancy candidate
     * @throws vn.com.ecopharma.hrm.NoSuchVacancyCandidateException if a matching vacancy candidate could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public VacancyCandidate findByC_Id_First(long c_id,
        OrderByComparator orderByComparator)
        throws NoSuchVacancyCandidateException, SystemException {
        VacancyCandidate vacancyCandidate = fetchByC_Id_First(c_id,
                orderByComparator);

        if (vacancyCandidate != null) {
            return vacancyCandidate;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("c_id=");
        msg.append(c_id);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchVacancyCandidateException(msg.toString());
    }

    /**
     * Returns the first vacancy candidate in the ordered set where c_id = &#63;.
     *
     * @param c_id the c_id
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching vacancy candidate, or <code>null</code> if a matching vacancy candidate could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public VacancyCandidate fetchByC_Id_First(long c_id,
        OrderByComparator orderByComparator) throws SystemException {
        List<VacancyCandidate> list = findByC_Id(c_id, 0, 1, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the last vacancy candidate in the ordered set where c_id = &#63;.
     *
     * @param c_id the c_id
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching vacancy candidate
     * @throws vn.com.ecopharma.hrm.NoSuchVacancyCandidateException if a matching vacancy candidate could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public VacancyCandidate findByC_Id_Last(long c_id,
        OrderByComparator orderByComparator)
        throws NoSuchVacancyCandidateException, SystemException {
        VacancyCandidate vacancyCandidate = fetchByC_Id_Last(c_id,
                orderByComparator);

        if (vacancyCandidate != null) {
            return vacancyCandidate;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("c_id=");
        msg.append(c_id);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchVacancyCandidateException(msg.toString());
    }

    /**
     * Returns the last vacancy candidate in the ordered set where c_id = &#63;.
     *
     * @param c_id the c_id
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching vacancy candidate, or <code>null</code> if a matching vacancy candidate could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public VacancyCandidate fetchByC_Id_Last(long c_id,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countByC_Id(c_id);

        if (count == 0) {
            return null;
        }

        List<VacancyCandidate> list = findByC_Id(c_id, count - 1, count,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

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
    @Override
    public VacancyCandidate[] findByC_Id_PrevAndNext(long vacancyCandidateId,
        long c_id, OrderByComparator orderByComparator)
        throws NoSuchVacancyCandidateException, SystemException {
        VacancyCandidate vacancyCandidate = findByPrimaryKey(vacancyCandidateId);

        Session session = null;

        try {
            session = openSession();

            VacancyCandidate[] array = new VacancyCandidateImpl[3];

            array[0] = getByC_Id_PrevAndNext(session, vacancyCandidate, c_id,
                    orderByComparator, true);

            array[1] = vacancyCandidate;

            array[2] = getByC_Id_PrevAndNext(session, vacancyCandidate, c_id,
                    orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected VacancyCandidate getByC_Id_PrevAndNext(Session session,
        VacancyCandidate vacancyCandidate, long c_id,
        OrderByComparator orderByComparator, boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_VACANCYCANDIDATE_WHERE);

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
            query.append(VacancyCandidateModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        qPos.add(c_id);

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(vacancyCandidate);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<VacancyCandidate> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the vacancy candidates where c_id = &#63; from the database.
     *
     * @param c_id the c_id
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByC_Id(long c_id) throws SystemException {
        for (VacancyCandidate vacancyCandidate : findByC_Id(c_id,
                QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
            remove(vacancyCandidate);
        }
    }

    /**
     * Returns the number of vacancy candidates where c_id = &#63;.
     *
     * @param c_id the c_id
     * @return the number of matching vacancy candidates
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

            query.append(_SQL_COUNT_VACANCYCANDIDATE_WHERE);

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
     * Returns all the vacancy candidates where v_id = &#63;.
     *
     * @param v_id the v_id
     * @return the matching vacancy candidates
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<VacancyCandidate> findByV_Id(long v_id)
        throws SystemException {
        return findByV_Id(v_id, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

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
    @Override
    public List<VacancyCandidate> findByV_Id(long v_id, int start, int end)
        throws SystemException {
        return findByV_Id(v_id, start, end, null);
    }

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
    @Override
    public List<VacancyCandidate> findByV_Id(long v_id, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_V_ID;
            finderArgs = new Object[] { v_id };
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_V_ID;
            finderArgs = new Object[] { v_id, start, end, orderByComparator };
        }

        List<VacancyCandidate> list = (List<VacancyCandidate>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (VacancyCandidate vacancyCandidate : list) {
                if ((v_id != vacancyCandidate.getV_id())) {
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

            query.append(_SQL_SELECT_VACANCYCANDIDATE_WHERE);

            query.append(_FINDER_COLUMN_V_ID_V_ID_2);

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(VacancyCandidateModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(v_id);

                if (!pagination) {
                    list = (List<VacancyCandidate>) QueryUtil.list(q,
                            getDialect(), start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<VacancyCandidate>(list);
                } else {
                    list = (List<VacancyCandidate>) QueryUtil.list(q,
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
     * Returns the first vacancy candidate in the ordered set where v_id = &#63;.
     *
     * @param v_id the v_id
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching vacancy candidate
     * @throws vn.com.ecopharma.hrm.NoSuchVacancyCandidateException if a matching vacancy candidate could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public VacancyCandidate findByV_Id_First(long v_id,
        OrderByComparator orderByComparator)
        throws NoSuchVacancyCandidateException, SystemException {
        VacancyCandidate vacancyCandidate = fetchByV_Id_First(v_id,
                orderByComparator);

        if (vacancyCandidate != null) {
            return vacancyCandidate;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("v_id=");
        msg.append(v_id);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchVacancyCandidateException(msg.toString());
    }

    /**
     * Returns the first vacancy candidate in the ordered set where v_id = &#63;.
     *
     * @param v_id the v_id
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching vacancy candidate, or <code>null</code> if a matching vacancy candidate could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public VacancyCandidate fetchByV_Id_First(long v_id,
        OrderByComparator orderByComparator) throws SystemException {
        List<VacancyCandidate> list = findByV_Id(v_id, 0, 1, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the last vacancy candidate in the ordered set where v_id = &#63;.
     *
     * @param v_id the v_id
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching vacancy candidate
     * @throws vn.com.ecopharma.hrm.NoSuchVacancyCandidateException if a matching vacancy candidate could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public VacancyCandidate findByV_Id_Last(long v_id,
        OrderByComparator orderByComparator)
        throws NoSuchVacancyCandidateException, SystemException {
        VacancyCandidate vacancyCandidate = fetchByV_Id_Last(v_id,
                orderByComparator);

        if (vacancyCandidate != null) {
            return vacancyCandidate;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("v_id=");
        msg.append(v_id);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchVacancyCandidateException(msg.toString());
    }

    /**
     * Returns the last vacancy candidate in the ordered set where v_id = &#63;.
     *
     * @param v_id the v_id
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching vacancy candidate, or <code>null</code> if a matching vacancy candidate could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public VacancyCandidate fetchByV_Id_Last(long v_id,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countByV_Id(v_id);

        if (count == 0) {
            return null;
        }

        List<VacancyCandidate> list = findByV_Id(v_id, count - 1, count,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

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
    @Override
    public VacancyCandidate[] findByV_Id_PrevAndNext(long vacancyCandidateId,
        long v_id, OrderByComparator orderByComparator)
        throws NoSuchVacancyCandidateException, SystemException {
        VacancyCandidate vacancyCandidate = findByPrimaryKey(vacancyCandidateId);

        Session session = null;

        try {
            session = openSession();

            VacancyCandidate[] array = new VacancyCandidateImpl[3];

            array[0] = getByV_Id_PrevAndNext(session, vacancyCandidate, v_id,
                    orderByComparator, true);

            array[1] = vacancyCandidate;

            array[2] = getByV_Id_PrevAndNext(session, vacancyCandidate, v_id,
                    orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected VacancyCandidate getByV_Id_PrevAndNext(Session session,
        VacancyCandidate vacancyCandidate, long v_id,
        OrderByComparator orderByComparator, boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_VACANCYCANDIDATE_WHERE);

        query.append(_FINDER_COLUMN_V_ID_V_ID_2);

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
            query.append(VacancyCandidateModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        qPos.add(v_id);

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(vacancyCandidate);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<VacancyCandidate> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the vacancy candidates where v_id = &#63; from the database.
     *
     * @param v_id the v_id
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByV_Id(long v_id) throws SystemException {
        for (VacancyCandidate vacancyCandidate : findByV_Id(v_id,
                QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
            remove(vacancyCandidate);
        }
    }

    /**
     * Returns the number of vacancy candidates where v_id = &#63;.
     *
     * @param v_id the v_id
     * @return the number of matching vacancy candidates
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByV_Id(long v_id) throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_V_ID;

        Object[] finderArgs = new Object[] { v_id };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(2);

            query.append(_SQL_COUNT_VACANCYCANDIDATE_WHERE);

            query.append(_FINDER_COLUMN_V_ID_V_ID_2);

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
     * Returns the vacancy candidate where v_id = &#63; and c_id = &#63; or throws a {@link vn.com.ecopharma.hrm.NoSuchVacancyCandidateException} if it could not be found.
     *
     * @param v_id the v_id
     * @param c_id the c_id
     * @return the matching vacancy candidate
     * @throws vn.com.ecopharma.hrm.NoSuchVacancyCandidateException if a matching vacancy candidate could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public VacancyCandidate findByV_Id_And_C_Id(long v_id, long c_id)
        throws NoSuchVacancyCandidateException, SystemException {
        VacancyCandidate vacancyCandidate = fetchByV_Id_And_C_Id(v_id, c_id);

        if (vacancyCandidate == null) {
            StringBundler msg = new StringBundler(6);

            msg.append(_NO_SUCH_ENTITY_WITH_KEY);

            msg.append("v_id=");
            msg.append(v_id);

            msg.append(", c_id=");
            msg.append(c_id);

            msg.append(StringPool.CLOSE_CURLY_BRACE);

            if (_log.isWarnEnabled()) {
                _log.warn(msg.toString());
            }

            throw new NoSuchVacancyCandidateException(msg.toString());
        }

        return vacancyCandidate;
    }

    /**
     * Returns the vacancy candidate where v_id = &#63; and c_id = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
     *
     * @param v_id the v_id
     * @param c_id the c_id
     * @return the matching vacancy candidate, or <code>null</code> if a matching vacancy candidate could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public VacancyCandidate fetchByV_Id_And_C_Id(long v_id, long c_id)
        throws SystemException {
        return fetchByV_Id_And_C_Id(v_id, c_id, true);
    }

    /**
     * Returns the vacancy candidate where v_id = &#63; and c_id = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
     *
     * @param v_id the v_id
     * @param c_id the c_id
     * @param retrieveFromCache whether to use the finder cache
     * @return the matching vacancy candidate, or <code>null</code> if a matching vacancy candidate could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public VacancyCandidate fetchByV_Id_And_C_Id(long v_id, long c_id,
        boolean retrieveFromCache) throws SystemException {
        Object[] finderArgs = new Object[] { v_id, c_id };

        Object result = null;

        if (retrieveFromCache) {
            result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_V_ID_AND_C_ID,
                    finderArgs, this);
        }

        if (result instanceof VacancyCandidate) {
            VacancyCandidate vacancyCandidate = (VacancyCandidate) result;

            if ((v_id != vacancyCandidate.getV_id()) ||
                    (c_id != vacancyCandidate.getC_id())) {
                result = null;
            }
        }

        if (result == null) {
            StringBundler query = new StringBundler(4);

            query.append(_SQL_SELECT_VACANCYCANDIDATE_WHERE);

            query.append(_FINDER_COLUMN_V_ID_AND_C_ID_V_ID_2);

            query.append(_FINDER_COLUMN_V_ID_AND_C_ID_C_ID_2);

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(v_id);

                qPos.add(c_id);

                List<VacancyCandidate> list = q.list();

                if (list.isEmpty()) {
                    FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_V_ID_AND_C_ID,
                        finderArgs, list);
                } else {
                    if ((list.size() > 1) && _log.isWarnEnabled()) {
                        _log.warn(
                            "VacancyCandidatePersistenceImpl.fetchByV_Id_And_C_Id(long, long, boolean) with parameters (" +
                            StringUtil.merge(finderArgs) +
                            ") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
                    }

                    VacancyCandidate vacancyCandidate = list.get(0);

                    result = vacancyCandidate;

                    cacheResult(vacancyCandidate);

                    if ((vacancyCandidate.getV_id() != v_id) ||
                            (vacancyCandidate.getC_id() != c_id)) {
                        FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_V_ID_AND_C_ID,
                            finderArgs, vacancyCandidate);
                    }
                }
            } catch (Exception e) {
                FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_V_ID_AND_C_ID,
                    finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        if (result instanceof List<?>) {
            return null;
        } else {
            return (VacancyCandidate) result;
        }
    }

    /**
     * Removes the vacancy candidate where v_id = &#63; and c_id = &#63; from the database.
     *
     * @param v_id the v_id
     * @param c_id the c_id
     * @return the vacancy candidate that was removed
     * @throws SystemException if a system exception occurred
     */
    @Override
    public VacancyCandidate removeByV_Id_And_C_Id(long v_id, long c_id)
        throws NoSuchVacancyCandidateException, SystemException {
        VacancyCandidate vacancyCandidate = findByV_Id_And_C_Id(v_id, c_id);

        return remove(vacancyCandidate);
    }

    /**
     * Returns the number of vacancy candidates where v_id = &#63; and c_id = &#63;.
     *
     * @param v_id the v_id
     * @param c_id the c_id
     * @return the number of matching vacancy candidates
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByV_Id_And_C_Id(long v_id, long c_id)
        throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_V_ID_AND_C_ID;

        Object[] finderArgs = new Object[] { v_id, c_id };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(3);

            query.append(_SQL_COUNT_VACANCYCANDIDATE_WHERE);

            query.append(_FINDER_COLUMN_V_ID_AND_C_ID_V_ID_2);

            query.append(_FINDER_COLUMN_V_ID_AND_C_ID_C_ID_2);

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(v_id);

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
     * Returns the vacancy candidate where c_id = &#63; or throws a {@link vn.com.ecopharma.hrm.NoSuchVacancyCandidateException} if it could not be found.
     *
     * @param c_id the c_id
     * @return the matching vacancy candidate
     * @throws vn.com.ecopharma.hrm.NoSuchVacancyCandidateException if a matching vacancy candidate could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public VacancyCandidate findByCandidate_And_VALID_Status(long c_id)
        throws NoSuchVacancyCandidateException, SystemException {
        VacancyCandidate vacancyCandidate = fetchByCandidate_And_VALID_Status(c_id);

        if (vacancyCandidate == null) {
            StringBundler msg = new StringBundler(4);

            msg.append(_NO_SUCH_ENTITY_WITH_KEY);

            msg.append("c_id=");
            msg.append(c_id);

            msg.append(StringPool.CLOSE_CURLY_BRACE);

            if (_log.isWarnEnabled()) {
                _log.warn(msg.toString());
            }

            throw new NoSuchVacancyCandidateException(msg.toString());
        }

        return vacancyCandidate;
    }

    /**
     * Returns the vacancy candidate where c_id = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
     *
     * @param c_id the c_id
     * @return the matching vacancy candidate, or <code>null</code> if a matching vacancy candidate could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public VacancyCandidate fetchByCandidate_And_VALID_Status(long c_id)
        throws SystemException {
        return fetchByCandidate_And_VALID_Status(c_id, true);
    }

    /**
     * Returns the vacancy candidate where c_id = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
     *
     * @param c_id the c_id
     * @param retrieveFromCache whether to use the finder cache
     * @return the matching vacancy candidate, or <code>null</code> if a matching vacancy candidate could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public VacancyCandidate fetchByCandidate_And_VALID_Status(long c_id,
        boolean retrieveFromCache) throws SystemException {
        Object[] finderArgs = new Object[] { c_id };

        Object result = null;

        if (retrieveFromCache) {
            result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_CANDIDATE_AND_VALID_STATUS,
                    finderArgs, this);
        }

        if (result instanceof VacancyCandidate) {
            VacancyCandidate vacancyCandidate = (VacancyCandidate) result;

            if ((c_id != vacancyCandidate.getC_id())) {
                result = null;
            }
        }

        if (result == null) {
            StringBundler query = new StringBundler(3);

            query.append(_SQL_SELECT_VACANCYCANDIDATE_WHERE);

            query.append(_FINDER_COLUMN_CANDIDATE_AND_VALID_STATUS_C_ID_2);

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(c_id);

                List<VacancyCandidate> list = q.list();

                if (list.isEmpty()) {
                    FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_CANDIDATE_AND_VALID_STATUS,
                        finderArgs, list);
                } else {
                    if ((list.size() > 1) && _log.isWarnEnabled()) {
                        _log.warn(
                            "VacancyCandidatePersistenceImpl.fetchByCandidate_And_VALID_Status(long, boolean) with parameters (" +
                            StringUtil.merge(finderArgs) +
                            ") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
                    }

                    VacancyCandidate vacancyCandidate = list.get(0);

                    result = vacancyCandidate;

                    cacheResult(vacancyCandidate);

                    if ((vacancyCandidate.getC_id() != c_id)) {
                        FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_CANDIDATE_AND_VALID_STATUS,
                            finderArgs, vacancyCandidate);
                    }
                }
            } catch (Exception e) {
                FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_CANDIDATE_AND_VALID_STATUS,
                    finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        if (result instanceof List<?>) {
            return null;
        } else {
            return (VacancyCandidate) result;
        }
    }

    /**
     * Removes the vacancy candidate where c_id = &#63; from the database.
     *
     * @param c_id the c_id
     * @return the vacancy candidate that was removed
     * @throws SystemException if a system exception occurred
     */
    @Override
    public VacancyCandidate removeByCandidate_And_VALID_Status(long c_id)
        throws NoSuchVacancyCandidateException, SystemException {
        VacancyCandidate vacancyCandidate = findByCandidate_And_VALID_Status(c_id);

        return remove(vacancyCandidate);
    }

    /**
     * Returns the number of vacancy candidates where c_id = &#63;.
     *
     * @param c_id the c_id
     * @return the number of matching vacancy candidates
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByCandidate_And_VALID_Status(long c_id)
        throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_CANDIDATE_AND_VALID_STATUS;

        Object[] finderArgs = new Object[] { c_id };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(2);

            query.append(_SQL_COUNT_VACANCYCANDIDATE_WHERE);

            query.append(_FINDER_COLUMN_CANDIDATE_AND_VALID_STATUS_C_ID_2);

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
     * Returns all the vacancy candidates where v_id = &#63;.
     *
     * @param v_id the v_id
     * @return the matching vacancy candidates
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<VacancyCandidate> findByVacancy_And_VALID_Status(long v_id)
        throws SystemException {
        return findByVacancy_And_VALID_Status(v_id, QueryUtil.ALL_POS,
            QueryUtil.ALL_POS, null);
    }

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
    @Override
    public List<VacancyCandidate> findByVacancy_And_VALID_Status(long v_id,
        int start, int end) throws SystemException {
        return findByVacancy_And_VALID_Status(v_id, start, end, null);
    }

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
    @Override
    public List<VacancyCandidate> findByVacancy_And_VALID_Status(long v_id,
        int start, int end, OrderByComparator orderByComparator)
        throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_VACANCY_AND_VALID_STATUS;
            finderArgs = new Object[] { v_id };
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_VACANCY_AND_VALID_STATUS;
            finderArgs = new Object[] { v_id, start, end, orderByComparator };
        }

        List<VacancyCandidate> list = (List<VacancyCandidate>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (VacancyCandidate vacancyCandidate : list) {
                if ((v_id != vacancyCandidate.getV_id())) {
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

            query.append(_SQL_SELECT_VACANCYCANDIDATE_WHERE);

            query.append(_FINDER_COLUMN_VACANCY_AND_VALID_STATUS_V_ID_2);

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(VacancyCandidateModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(v_id);

                if (!pagination) {
                    list = (List<VacancyCandidate>) QueryUtil.list(q,
                            getDialect(), start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<VacancyCandidate>(list);
                } else {
                    list = (List<VacancyCandidate>) QueryUtil.list(q,
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
     * Returns the first vacancy candidate in the ordered set where v_id = &#63;.
     *
     * @param v_id the v_id
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching vacancy candidate
     * @throws vn.com.ecopharma.hrm.NoSuchVacancyCandidateException if a matching vacancy candidate could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public VacancyCandidate findByVacancy_And_VALID_Status_First(long v_id,
        OrderByComparator orderByComparator)
        throws NoSuchVacancyCandidateException, SystemException {
        VacancyCandidate vacancyCandidate = fetchByVacancy_And_VALID_Status_First(v_id,
                orderByComparator);

        if (vacancyCandidate != null) {
            return vacancyCandidate;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("v_id=");
        msg.append(v_id);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchVacancyCandidateException(msg.toString());
    }

    /**
     * Returns the first vacancy candidate in the ordered set where v_id = &#63;.
     *
     * @param v_id the v_id
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching vacancy candidate, or <code>null</code> if a matching vacancy candidate could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public VacancyCandidate fetchByVacancy_And_VALID_Status_First(long v_id,
        OrderByComparator orderByComparator) throws SystemException {
        List<VacancyCandidate> list = findByVacancy_And_VALID_Status(v_id, 0,
                1, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the last vacancy candidate in the ordered set where v_id = &#63;.
     *
     * @param v_id the v_id
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching vacancy candidate
     * @throws vn.com.ecopharma.hrm.NoSuchVacancyCandidateException if a matching vacancy candidate could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public VacancyCandidate findByVacancy_And_VALID_Status_Last(long v_id,
        OrderByComparator orderByComparator)
        throws NoSuchVacancyCandidateException, SystemException {
        VacancyCandidate vacancyCandidate = fetchByVacancy_And_VALID_Status_Last(v_id,
                orderByComparator);

        if (vacancyCandidate != null) {
            return vacancyCandidate;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("v_id=");
        msg.append(v_id);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchVacancyCandidateException(msg.toString());
    }

    /**
     * Returns the last vacancy candidate in the ordered set where v_id = &#63;.
     *
     * @param v_id the v_id
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching vacancy candidate, or <code>null</code> if a matching vacancy candidate could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public VacancyCandidate fetchByVacancy_And_VALID_Status_Last(long v_id,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countByVacancy_And_VALID_Status(v_id);

        if (count == 0) {
            return null;
        }

        List<VacancyCandidate> list = findByVacancy_And_VALID_Status(v_id,
                count - 1, count, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

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
    @Override
    public VacancyCandidate[] findByVacancy_And_VALID_Status_PrevAndNext(
        long vacancyCandidateId, long v_id, OrderByComparator orderByComparator)
        throws NoSuchVacancyCandidateException, SystemException {
        VacancyCandidate vacancyCandidate = findByPrimaryKey(vacancyCandidateId);

        Session session = null;

        try {
            session = openSession();

            VacancyCandidate[] array = new VacancyCandidateImpl[3];

            array[0] = getByVacancy_And_VALID_Status_PrevAndNext(session,
                    vacancyCandidate, v_id, orderByComparator, true);

            array[1] = vacancyCandidate;

            array[2] = getByVacancy_And_VALID_Status_PrevAndNext(session,
                    vacancyCandidate, v_id, orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected VacancyCandidate getByVacancy_And_VALID_Status_PrevAndNext(
        Session session, VacancyCandidate vacancyCandidate, long v_id,
        OrderByComparator orderByComparator, boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_VACANCYCANDIDATE_WHERE);

        query.append(_FINDER_COLUMN_VACANCY_AND_VALID_STATUS_V_ID_2);

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
            query.append(VacancyCandidateModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        qPos.add(v_id);

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(vacancyCandidate);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<VacancyCandidate> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the vacancy candidates where v_id = &#63; from the database.
     *
     * @param v_id the v_id
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByVacancy_And_VALID_Status(long v_id)
        throws SystemException {
        for (VacancyCandidate vacancyCandidate : findByVacancy_And_VALID_Status(
                v_id, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
            remove(vacancyCandidate);
        }
    }

    /**
     * Returns the number of vacancy candidates where v_id = &#63;.
     *
     * @param v_id the v_id
     * @return the number of matching vacancy candidates
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByVacancy_And_VALID_Status(long v_id)
        throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_VACANCY_AND_VALID_STATUS;

        Object[] finderArgs = new Object[] { v_id };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(2);

            query.append(_SQL_COUNT_VACANCYCANDIDATE_WHERE);

            query.append(_FINDER_COLUMN_VACANCY_AND_VALID_STATUS_V_ID_2);

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
     * Caches the vacancy candidate in the entity cache if it is enabled.
     *
     * @param vacancyCandidate the vacancy candidate
     */
    @Override
    public void cacheResult(VacancyCandidate vacancyCandidate) {
        EntityCacheUtil.putResult(VacancyCandidateModelImpl.ENTITY_CACHE_ENABLED,
            VacancyCandidateImpl.class, vacancyCandidate.getPrimaryKey(),
            vacancyCandidate);

        FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_V_ID_AND_C_ID,
            new Object[] { vacancyCandidate.getV_id(), vacancyCandidate.getC_id() },
            vacancyCandidate);

        FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_CANDIDATE_AND_VALID_STATUS,
            new Object[] { vacancyCandidate.getC_id() }, vacancyCandidate);

        vacancyCandidate.resetOriginalValues();
    }

    /**
     * Caches the vacancy candidates in the entity cache if it is enabled.
     *
     * @param vacancyCandidates the vacancy candidates
     */
    @Override
    public void cacheResult(List<VacancyCandidate> vacancyCandidates) {
        for (VacancyCandidate vacancyCandidate : vacancyCandidates) {
            if (EntityCacheUtil.getResult(
                        VacancyCandidateModelImpl.ENTITY_CACHE_ENABLED,
                        VacancyCandidateImpl.class,
                        vacancyCandidate.getPrimaryKey()) == null) {
                cacheResult(vacancyCandidate);
            } else {
                vacancyCandidate.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all vacancy candidates.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(VacancyCandidateImpl.class.getName());
        }

        EntityCacheUtil.clearCache(VacancyCandidateImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the vacancy candidate.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(VacancyCandidate vacancyCandidate) {
        EntityCacheUtil.removeResult(VacancyCandidateModelImpl.ENTITY_CACHE_ENABLED,
            VacancyCandidateImpl.class, vacancyCandidate.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        clearUniqueFindersCache(vacancyCandidate);
    }

    @Override
    public void clearCache(List<VacancyCandidate> vacancyCandidates) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (VacancyCandidate vacancyCandidate : vacancyCandidates) {
            EntityCacheUtil.removeResult(VacancyCandidateModelImpl.ENTITY_CACHE_ENABLED,
                VacancyCandidateImpl.class, vacancyCandidate.getPrimaryKey());

            clearUniqueFindersCache(vacancyCandidate);
        }
    }

    protected void cacheUniqueFindersCache(VacancyCandidate vacancyCandidate) {
        if (vacancyCandidate.isNew()) {
            Object[] args = new Object[] {
                    vacancyCandidate.getV_id(), vacancyCandidate.getC_id()
                };

            FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_V_ID_AND_C_ID, args,
                Long.valueOf(1));
            FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_V_ID_AND_C_ID, args,
                vacancyCandidate);

            args = new Object[] { vacancyCandidate.getC_id() };

            FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_CANDIDATE_AND_VALID_STATUS,
                args, Long.valueOf(1));
            FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_CANDIDATE_AND_VALID_STATUS,
                args, vacancyCandidate);
        } else {
            VacancyCandidateModelImpl vacancyCandidateModelImpl = (VacancyCandidateModelImpl) vacancyCandidate;

            if ((vacancyCandidateModelImpl.getColumnBitmask() &
                    FINDER_PATH_FETCH_BY_V_ID_AND_C_ID.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        vacancyCandidate.getV_id(), vacancyCandidate.getC_id()
                    };

                FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_V_ID_AND_C_ID,
                    args, Long.valueOf(1));
                FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_V_ID_AND_C_ID,
                    args, vacancyCandidate);
            }

            if ((vacancyCandidateModelImpl.getColumnBitmask() &
                    FINDER_PATH_FETCH_BY_CANDIDATE_AND_VALID_STATUS.getColumnBitmask()) != 0) {
                Object[] args = new Object[] { vacancyCandidate.getC_id() };

                FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_CANDIDATE_AND_VALID_STATUS,
                    args, Long.valueOf(1));
                FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_CANDIDATE_AND_VALID_STATUS,
                    args, vacancyCandidate);
            }
        }
    }

    protected void clearUniqueFindersCache(VacancyCandidate vacancyCandidate) {
        VacancyCandidateModelImpl vacancyCandidateModelImpl = (VacancyCandidateModelImpl) vacancyCandidate;

        Object[] args = new Object[] {
                vacancyCandidate.getV_id(), vacancyCandidate.getC_id()
            };

        FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_V_ID_AND_C_ID, args);
        FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_V_ID_AND_C_ID, args);

        if ((vacancyCandidateModelImpl.getColumnBitmask() &
                FINDER_PATH_FETCH_BY_V_ID_AND_C_ID.getColumnBitmask()) != 0) {
            args = new Object[] {
                    vacancyCandidateModelImpl.getOriginalV_id(),
                    vacancyCandidateModelImpl.getOriginalC_id()
                };

            FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_V_ID_AND_C_ID,
                args);
            FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_V_ID_AND_C_ID,
                args);
        }

        args = new Object[] { vacancyCandidate.getC_id() };

        FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_CANDIDATE_AND_VALID_STATUS,
            args);
        FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_CANDIDATE_AND_VALID_STATUS,
            args);

        if ((vacancyCandidateModelImpl.getColumnBitmask() &
                FINDER_PATH_FETCH_BY_CANDIDATE_AND_VALID_STATUS.getColumnBitmask()) != 0) {
            args = new Object[] { vacancyCandidateModelImpl.getOriginalC_id() };

            FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_CANDIDATE_AND_VALID_STATUS,
                args);
            FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_CANDIDATE_AND_VALID_STATUS,
                args);
        }
    }

    /**
     * Creates a new vacancy candidate with the primary key. Does not add the vacancy candidate to the database.
     *
     * @param vacancyCandidateId the primary key for the new vacancy candidate
     * @return the new vacancy candidate
     */
    @Override
    public VacancyCandidate create(long vacancyCandidateId) {
        VacancyCandidate vacancyCandidate = new VacancyCandidateImpl();

        vacancyCandidate.setNew(true);
        vacancyCandidate.setPrimaryKey(vacancyCandidateId);

        return vacancyCandidate;
    }

    /**
     * Removes the vacancy candidate with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param vacancyCandidateId the primary key of the vacancy candidate
     * @return the vacancy candidate that was removed
     * @throws vn.com.ecopharma.hrm.NoSuchVacancyCandidateException if a vacancy candidate with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public VacancyCandidate remove(long vacancyCandidateId)
        throws NoSuchVacancyCandidateException, SystemException {
        return remove((Serializable) vacancyCandidateId);
    }

    /**
     * Removes the vacancy candidate with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the vacancy candidate
     * @return the vacancy candidate that was removed
     * @throws vn.com.ecopharma.hrm.NoSuchVacancyCandidateException if a vacancy candidate with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public VacancyCandidate remove(Serializable primaryKey)
        throws NoSuchVacancyCandidateException, SystemException {
        Session session = null;

        try {
            session = openSession();

            VacancyCandidate vacancyCandidate = (VacancyCandidate) session.get(VacancyCandidateImpl.class,
                    primaryKey);

            if (vacancyCandidate == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchVacancyCandidateException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(vacancyCandidate);
        } catch (NoSuchVacancyCandidateException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected VacancyCandidate removeImpl(VacancyCandidate vacancyCandidate)
        throws SystemException {
        vacancyCandidate = toUnwrappedModel(vacancyCandidate);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(vacancyCandidate)) {
                vacancyCandidate = (VacancyCandidate) session.get(VacancyCandidateImpl.class,
                        vacancyCandidate.getPrimaryKeyObj());
            }

            if (vacancyCandidate != null) {
                session.delete(vacancyCandidate);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (vacancyCandidate != null) {
            clearCache(vacancyCandidate);
        }

        return vacancyCandidate;
    }

    @Override
    public VacancyCandidate updateImpl(
        vn.com.ecopharma.hrm.model.VacancyCandidate vacancyCandidate)
        throws SystemException {
        vacancyCandidate = toUnwrappedModel(vacancyCandidate);

        boolean isNew = vacancyCandidate.isNew();

        VacancyCandidateModelImpl vacancyCandidateModelImpl = (VacancyCandidateModelImpl) vacancyCandidate;

        Session session = null;

        try {
            session = openSession();

            if (vacancyCandidate.isNew()) {
                session.save(vacancyCandidate);

                vacancyCandidate.setNew(false);
            } else {
                session.merge(vacancyCandidate);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

        if (isNew || !VacancyCandidateModelImpl.COLUMN_BITMASK_ENABLED) {
            FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
        }
        else {
            if ((vacancyCandidateModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C_ID.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        vacancyCandidateModelImpl.getOriginalC_id()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_C_ID, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C_ID,
                    args);

                args = new Object[] { vacancyCandidateModelImpl.getC_id() };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_C_ID, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C_ID,
                    args);
            }

            if ((vacancyCandidateModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_V_ID.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        vacancyCandidateModelImpl.getOriginalV_id()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_V_ID, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_V_ID,
                    args);

                args = new Object[] { vacancyCandidateModelImpl.getV_id() };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_V_ID, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_V_ID,
                    args);
            }

            if ((vacancyCandidateModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_VACANCY_AND_VALID_STATUS.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        vacancyCandidateModelImpl.getOriginalV_id()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_VACANCY_AND_VALID_STATUS,
                    args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_VACANCY_AND_VALID_STATUS,
                    args);

                args = new Object[] { vacancyCandidateModelImpl.getV_id() };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_VACANCY_AND_VALID_STATUS,
                    args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_VACANCY_AND_VALID_STATUS,
                    args);
            }
        }

        EntityCacheUtil.putResult(VacancyCandidateModelImpl.ENTITY_CACHE_ENABLED,
            VacancyCandidateImpl.class, vacancyCandidate.getPrimaryKey(),
            vacancyCandidate);

        clearUniqueFindersCache(vacancyCandidate);
        cacheUniqueFindersCache(vacancyCandidate);

        return vacancyCandidate;
    }

    protected VacancyCandidate toUnwrappedModel(
        VacancyCandidate vacancyCandidate) {
        if (vacancyCandidate instanceof VacancyCandidateImpl) {
            return vacancyCandidate;
        }

        VacancyCandidateImpl vacancyCandidateImpl = new VacancyCandidateImpl();

        vacancyCandidateImpl.setNew(vacancyCandidate.isNew());
        vacancyCandidateImpl.setPrimaryKey(vacancyCandidate.getPrimaryKey());

        vacancyCandidateImpl.setVacancyCandidateId(vacancyCandidate.getVacancyCandidateId());
        vacancyCandidateImpl.setC_id(vacancyCandidate.getC_id());
        vacancyCandidateImpl.setV_id(vacancyCandidate.getV_id());
        vacancyCandidateImpl.setGroupId(vacancyCandidate.getGroupId());
        vacancyCandidateImpl.setCompanyId(vacancyCandidate.getCompanyId());
        vacancyCandidateImpl.setUserId(vacancyCandidate.getUserId());
        vacancyCandidateImpl.setCreateDate(vacancyCandidate.getCreateDate());
        vacancyCandidateImpl.setModifiedDate(vacancyCandidate.getModifiedDate());
        vacancyCandidateImpl.setVc_status(vacancyCandidate.getVc_status());

        return vacancyCandidateImpl;
    }

    /**
     * Returns the vacancy candidate with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the vacancy candidate
     * @return the vacancy candidate
     * @throws vn.com.ecopharma.hrm.NoSuchVacancyCandidateException if a vacancy candidate with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public VacancyCandidate findByPrimaryKey(Serializable primaryKey)
        throws NoSuchVacancyCandidateException, SystemException {
        VacancyCandidate vacancyCandidate = fetchByPrimaryKey(primaryKey);

        if (vacancyCandidate == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchVacancyCandidateException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return vacancyCandidate;
    }

    /**
     * Returns the vacancy candidate with the primary key or throws a {@link vn.com.ecopharma.hrm.NoSuchVacancyCandidateException} if it could not be found.
     *
     * @param vacancyCandidateId the primary key of the vacancy candidate
     * @return the vacancy candidate
     * @throws vn.com.ecopharma.hrm.NoSuchVacancyCandidateException if a vacancy candidate with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public VacancyCandidate findByPrimaryKey(long vacancyCandidateId)
        throws NoSuchVacancyCandidateException, SystemException {
        return findByPrimaryKey((Serializable) vacancyCandidateId);
    }

    /**
     * Returns the vacancy candidate with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the vacancy candidate
     * @return the vacancy candidate, or <code>null</code> if a vacancy candidate with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public VacancyCandidate fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        VacancyCandidate vacancyCandidate = (VacancyCandidate) EntityCacheUtil.getResult(VacancyCandidateModelImpl.ENTITY_CACHE_ENABLED,
                VacancyCandidateImpl.class, primaryKey);

        if (vacancyCandidate == _nullVacancyCandidate) {
            return null;
        }

        if (vacancyCandidate == null) {
            Session session = null;

            try {
                session = openSession();

                vacancyCandidate = (VacancyCandidate) session.get(VacancyCandidateImpl.class,
                        primaryKey);

                if (vacancyCandidate != null) {
                    cacheResult(vacancyCandidate);
                } else {
                    EntityCacheUtil.putResult(VacancyCandidateModelImpl.ENTITY_CACHE_ENABLED,
                        VacancyCandidateImpl.class, primaryKey,
                        _nullVacancyCandidate);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(VacancyCandidateModelImpl.ENTITY_CACHE_ENABLED,
                    VacancyCandidateImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return vacancyCandidate;
    }

    /**
     * Returns the vacancy candidate with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param vacancyCandidateId the primary key of the vacancy candidate
     * @return the vacancy candidate, or <code>null</code> if a vacancy candidate with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public VacancyCandidate fetchByPrimaryKey(long vacancyCandidateId)
        throws SystemException {
        return fetchByPrimaryKey((Serializable) vacancyCandidateId);
    }

    /**
     * Returns all the vacancy candidates.
     *
     * @return the vacancy candidates
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<VacancyCandidate> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

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
    @Override
    public List<VacancyCandidate> findAll(int start, int end)
        throws SystemException {
        return findAll(start, end, null);
    }

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
    @Override
    public List<VacancyCandidate> findAll(int start, int end,
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

        List<VacancyCandidate> list = (List<VacancyCandidate>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_VACANCYCANDIDATE);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_VACANCYCANDIDATE;

                if (pagination) {
                    sql = sql.concat(VacancyCandidateModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<VacancyCandidate>) QueryUtil.list(q,
                            getDialect(), start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<VacancyCandidate>(list);
                } else {
                    list = (List<VacancyCandidate>) QueryUtil.list(q,
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
     * Removes all the vacancy candidates from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (VacancyCandidate vacancyCandidate : findAll()) {
            remove(vacancyCandidate);
        }
    }

    /**
     * Returns the number of vacancy candidates.
     *
     * @return the number of vacancy candidates
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

                Query q = session.createQuery(_SQL_COUNT_VACANCYCANDIDATE);

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
     * Initializes the vacancy candidate persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.vn.com.ecopharma.hrm.model.VacancyCandidate")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<VacancyCandidate>> listenersList = new ArrayList<ModelListener<VacancyCandidate>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<VacancyCandidate>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(VacancyCandidateImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
