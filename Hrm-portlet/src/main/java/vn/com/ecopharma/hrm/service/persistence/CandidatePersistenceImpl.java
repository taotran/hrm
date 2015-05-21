package vn.com.ecopharma.hrm.service.persistence;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.cache.CacheRegistryUtil;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.ArrayUtil;
import com.liferay.portal.kernel.util.CharPool;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.InstanceFactory;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.SetUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.UnmodifiableList;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.security.permission.InlineSQLHelperUtil;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.service.persistence.impl.TableMapper;
import com.liferay.portal.service.persistence.impl.TableMapperFactory;

import vn.com.ecopharma.hrm.NoSuchCandidateException;
import vn.com.ecopharma.hrm.model.Candidate;
import vn.com.ecopharma.hrm.model.impl.CandidateImpl;
import vn.com.ecopharma.hrm.model.impl.CandidateModelImpl;
import vn.com.ecopharma.hrm.service.persistence.CandidatePersistence;
import vn.com.ecopharma.hrm.service.persistence.VacancyPersistence;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the candidate service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author tvt
 * @see CandidatePersistence
 * @see CandidateUtil
 * @generated
 */
public class CandidatePersistenceImpl extends BasePersistenceImpl<Candidate>
    implements CandidatePersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link CandidateUtil} to access the candidate persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = CandidateImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(CandidateModelImpl.ENTITY_CACHE_ENABLED,
            CandidateModelImpl.FINDER_CACHE_ENABLED, CandidateImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(CandidateModelImpl.ENTITY_CACHE_ENABLED,
            CandidateModelImpl.FINDER_CACHE_ENABLED, CandidateImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(CandidateModelImpl.ENTITY_CACHE_ENABLED,
            CandidateModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_FINDCANDIDATES =
        new FinderPath(CandidateModelImpl.ENTITY_CACHE_ENABLED,
            CandidateModelImpl.FINDER_CACHE_ENABLED, CandidateImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByfindCandidates",
            new String[] {
                Long.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FINDCANDIDATES =
        new FinderPath(CandidateModelImpl.ENTITY_CACHE_ENABLED,
            CandidateModelImpl.FINDER_CACHE_ENABLED, CandidateImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByfindCandidates",
            new String[] { Long.class.getName() },
            CandidateModelImpl.C_ID_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_FINDCANDIDATES = new FinderPath(CandidateModelImpl.ENTITY_CACHE_ENABLED,
            CandidateModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByfindCandidates",
            new String[] { Long.class.getName() });
    private static final String _FINDER_COLUMN_FINDCANDIDATES_C_ID_2 = "candidate.c_id = ?";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_FILTERCANDIDATE =
        new FinderPath(CandidateModelImpl.ENTITY_CACHE_ENABLED,
            CandidateModelImpl.FINDER_CACHE_ENABLED, CandidateImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByfilterCandidate",
            new String[] {
                String.class.getName(), String.class.getName(),
                String.class.getName(), String.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_COUNT_BY_FILTERCANDIDATE =
        new FinderPath(CandidateModelImpl.ENTITY_CACHE_ENABLED,
            CandidateModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "countByfilterCandidate",
            new String[] {
                String.class.getName(), String.class.getName(),
                String.class.getName(), String.class.getName()
            });
    private static final String _FINDER_COLUMN_FILTERCANDIDATE_FIRST_NAME_1 = "candidate.first_name LIKE NULL AND ";
    private static final String _FINDER_COLUMN_FILTERCANDIDATE_FIRST_NAME_2 = "candidate.first_name LIKE ? AND ";
    private static final String _FINDER_COLUMN_FILTERCANDIDATE_FIRST_NAME_3 = "(candidate.first_name IS NULL OR candidate.first_name LIKE '') AND ";
    private static final String _FINDER_COLUMN_FILTERCANDIDATE_FIRST_NAME_4 = "(" +
        removeConjunction(_FINDER_COLUMN_FILTERCANDIDATE_FIRST_NAME_1) + ")";
    private static final String _FINDER_COLUMN_FILTERCANDIDATE_FIRST_NAME_5 = "(" +
        removeConjunction(_FINDER_COLUMN_FILTERCANDIDATE_FIRST_NAME_2) + ")";
    private static final String _FINDER_COLUMN_FILTERCANDIDATE_FIRST_NAME_6 = "(" +
        removeConjunction(_FINDER_COLUMN_FILTERCANDIDATE_FIRST_NAME_3) + ")";
    private static final String _FINDER_COLUMN_FILTERCANDIDATE_MIDDLE_NAME_1 = "candidate.middle_name LIKE NULL AND ";
    private static final String _FINDER_COLUMN_FILTERCANDIDATE_MIDDLE_NAME_2 = "candidate.middle_name LIKE ? AND ";
    private static final String _FINDER_COLUMN_FILTERCANDIDATE_MIDDLE_NAME_3 = "(candidate.middle_name IS NULL OR candidate.middle_name LIKE '') AND ";
    private static final String _FINDER_COLUMN_FILTERCANDIDATE_MIDDLE_NAME_4 = "(" +
        removeConjunction(_FINDER_COLUMN_FILTERCANDIDATE_MIDDLE_NAME_1) + ")";
    private static final String _FINDER_COLUMN_FILTERCANDIDATE_MIDDLE_NAME_5 = "(" +
        removeConjunction(_FINDER_COLUMN_FILTERCANDIDATE_MIDDLE_NAME_2) + ")";
    private static final String _FINDER_COLUMN_FILTERCANDIDATE_MIDDLE_NAME_6 = "(" +
        removeConjunction(_FINDER_COLUMN_FILTERCANDIDATE_MIDDLE_NAME_3) + ")";
    private static final String _FINDER_COLUMN_FILTERCANDIDATE_LAST_NAME_1 = "candidate.last_name LIKE NULL AND ";
    private static final String _FINDER_COLUMN_FILTERCANDIDATE_LAST_NAME_2 = "candidate.last_name LIKE ? AND ";
    private static final String _FINDER_COLUMN_FILTERCANDIDATE_LAST_NAME_3 = "(candidate.last_name IS NULL OR candidate.last_name LIKE '') AND ";
    private static final String _FINDER_COLUMN_FILTERCANDIDATE_LAST_NAME_4 = "(" +
        removeConjunction(_FINDER_COLUMN_FILTERCANDIDATE_LAST_NAME_1) + ")";
    private static final String _FINDER_COLUMN_FILTERCANDIDATE_LAST_NAME_5 = "(" +
        removeConjunction(_FINDER_COLUMN_FILTERCANDIDATE_LAST_NAME_2) + ")";
    private static final String _FINDER_COLUMN_FILTERCANDIDATE_LAST_NAME_6 = "(" +
        removeConjunction(_FINDER_COLUMN_FILTERCANDIDATE_LAST_NAME_3) + ")";
    private static final String _FINDER_COLUMN_FILTERCANDIDATE_EMAIL_1 = "candidate.email LIKE NULL";
    private static final String _FINDER_COLUMN_FILTERCANDIDATE_EMAIL_2 = "candidate.email LIKE ?";
    private static final String _FINDER_COLUMN_FILTERCANDIDATE_EMAIL_3 = "(candidate.email IS NULL OR candidate.email LIKE '')";
    private static final String _FINDER_COLUMN_FILTERCANDIDATE_EMAIL_4 = "(" +
        removeConjunction(_FINDER_COLUMN_FILTERCANDIDATE_EMAIL_1) + ")";
    private static final String _FINDER_COLUMN_FILTERCANDIDATE_EMAIL_5 = "(" +
        removeConjunction(_FINDER_COLUMN_FILTERCANDIDATE_EMAIL_2) + ")";
    private static final String _FINDER_COLUMN_FILTERCANDIDATE_EMAIL_6 = "(" +
        removeConjunction(_FINDER_COLUMN_FILTERCANDIDATE_EMAIL_3) + ")";
    private static final String _SQL_SELECT_CANDIDATE = "SELECT candidate FROM Candidate candidate";
    private static final String _SQL_SELECT_CANDIDATE_WHERE = "SELECT candidate FROM Candidate candidate WHERE ";
    private static final String _SQL_COUNT_CANDIDATE = "SELECT COUNT(candidate) FROM Candidate candidate";
    private static final String _SQL_COUNT_CANDIDATE_WHERE = "SELECT COUNT(candidate) FROM Candidate candidate WHERE ";
    private static final String _FILTER_ENTITY_TABLE_FILTER_PK_COLUMN = "candidate.c_id";
    private static final String _FILTER_SQL_SELECT_CANDIDATE_WHERE = "SELECT DISTINCT {candidate.*} FROM HRM_Candidate candidate WHERE ";
    private static final String _FILTER_SQL_SELECT_CANDIDATE_NO_INLINE_DISTINCT_WHERE_1 =
        "SELECT {HRM_Candidate.*} FROM (SELECT DISTINCT candidate.c_id FROM HRM_Candidate candidate WHERE ";
    private static final String _FILTER_SQL_SELECT_CANDIDATE_NO_INLINE_DISTINCT_WHERE_2 =
        ") TEMP_TABLE INNER JOIN HRM_Candidate ON TEMP_TABLE.c_id = HRM_Candidate.c_id";
    private static final String _FILTER_SQL_COUNT_CANDIDATE_WHERE = "SELECT COUNT(DISTINCT candidate.c_id) AS COUNT_VALUE FROM HRM_Candidate candidate WHERE ";
    private static final String _FILTER_ENTITY_ALIAS = "candidate";
    private static final String _FILTER_ENTITY_TABLE = "HRM_Candidate";
    private static final String _ORDER_BY_ENTITY_ALIAS = "candidate.";
    private static final String _ORDER_BY_ENTITY_TABLE = "HRM_Candidate.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Candidate exists with the primary key ";
    private static final String _NO_SUCH_ENTITY_WITH_KEY = "No Candidate exists with the key {";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(CandidatePersistenceImpl.class);
    private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
                "comment"
            });
    private static Candidate _nullCandidate = new CandidateImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<Candidate> toCacheModel() {
                return _nullCandidateCacheModel;
            }
        };

    private static CacheModel<Candidate> _nullCandidateCacheModel = new CacheModel<Candidate>() {
            @Override
            public Candidate toEntityModel() {
                return _nullCandidate;
            }
        };

    @BeanReference(type = VacancyPersistence.class)
    protected VacancyPersistence vacancyPersistence;
    protected TableMapper<Candidate, vn.com.ecopharma.hrm.model.Vacancy> candidateToVacancyTableMapper;

    public CandidatePersistenceImpl() {
        setModelClass(Candidate.class);
    }

    /**
     * Returns all the candidates where c_id = &#63;.
     *
     * @param c_id the c_id
     * @return the matching candidates
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Candidate> findByfindCandidates(long c_id)
        throws SystemException {
        return findByfindCandidates(c_id, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
            null);
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
    @Override
    public List<Candidate> findByfindCandidates(long c_id, int start, int end)
        throws SystemException {
        return findByfindCandidates(c_id, start, end, null);
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
    @Override
    public List<Candidate> findByfindCandidates(long c_id, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FINDCANDIDATES;
            finderArgs = new Object[] { c_id };
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_FINDCANDIDATES;
            finderArgs = new Object[] { c_id, start, end, orderByComparator };
        }

        List<Candidate> list = (List<Candidate>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (Candidate candidate : list) {
                if ((c_id != candidate.getC_id())) {
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

            query.append(_SQL_SELECT_CANDIDATE_WHERE);

            query.append(_FINDER_COLUMN_FINDCANDIDATES_C_ID_2);

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(CandidateModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(c_id);

                if (!pagination) {
                    list = (List<Candidate>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<Candidate>(list);
                } else {
                    list = (List<Candidate>) QueryUtil.list(q, getDialect(),
                            start, end);
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
     * Returns the first candidate in the ordered set where c_id = &#63;.
     *
     * @param c_id the c_id
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching candidate
     * @throws vn.com.ecopharma.hrm.NoSuchCandidateException if a matching candidate could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Candidate findByfindCandidates_First(long c_id,
        OrderByComparator orderByComparator)
        throws NoSuchCandidateException, SystemException {
        Candidate candidate = fetchByfindCandidates_First(c_id,
                orderByComparator);

        if (candidate != null) {
            return candidate;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("c_id=");
        msg.append(c_id);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchCandidateException(msg.toString());
    }

    /**
     * Returns the first candidate in the ordered set where c_id = &#63;.
     *
     * @param c_id the c_id
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching candidate, or <code>null</code> if a matching candidate could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Candidate fetchByfindCandidates_First(long c_id,
        OrderByComparator orderByComparator) throws SystemException {
        List<Candidate> list = findByfindCandidates(c_id, 0, 1,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
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
    @Override
    public Candidate findByfindCandidates_Last(long c_id,
        OrderByComparator orderByComparator)
        throws NoSuchCandidateException, SystemException {
        Candidate candidate = fetchByfindCandidates_Last(c_id, orderByComparator);

        if (candidate != null) {
            return candidate;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("c_id=");
        msg.append(c_id);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchCandidateException(msg.toString());
    }

    /**
     * Returns the last candidate in the ordered set where c_id = &#63;.
     *
     * @param c_id the c_id
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching candidate, or <code>null</code> if a matching candidate could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Candidate fetchByfindCandidates_Last(long c_id,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countByfindCandidates(c_id);

        if (count == 0) {
            return null;
        }

        List<Candidate> list = findByfindCandidates(c_id, count - 1, count,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns all the candidates that the user has permission to view where c_id = &#63;.
     *
     * @param c_id the c_id
     * @return the matching candidates that the user has permission to view
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Candidate> filterFindByfindCandidates(long c_id)
        throws SystemException {
        return filterFindByfindCandidates(c_id, QueryUtil.ALL_POS,
            QueryUtil.ALL_POS, null);
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
    @Override
    public List<Candidate> filterFindByfindCandidates(long c_id, int start,
        int end) throws SystemException {
        return filterFindByfindCandidates(c_id, start, end, null);
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
    @Override
    public List<Candidate> filterFindByfindCandidates(long c_id, int start,
        int end, OrderByComparator orderByComparator) throws SystemException {
        if (!InlineSQLHelperUtil.isEnabled()) {
            return findByfindCandidates(c_id, start, end, orderByComparator);
        }

        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(3 +
                    (orderByComparator.getOrderByFields().length * 3));
        } else {
            query = new StringBundler(3);
        }

        if (getDB().isSupportsInlineDistinct()) {
            query.append(_FILTER_SQL_SELECT_CANDIDATE_WHERE);
        } else {
            query.append(_FILTER_SQL_SELECT_CANDIDATE_NO_INLINE_DISTINCT_WHERE_1);
        }

        query.append(_FINDER_COLUMN_FINDCANDIDATES_C_ID_2);

        if (!getDB().isSupportsInlineDistinct()) {
            query.append(_FILTER_SQL_SELECT_CANDIDATE_NO_INLINE_DISTINCT_WHERE_2);
        }

        if (orderByComparator != null) {
            if (getDB().isSupportsInlineDistinct()) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator, true);
            } else {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_TABLE,
                    orderByComparator, true);
            }
        } else {
            if (getDB().isSupportsInlineDistinct()) {
                query.append(CandidateModelImpl.ORDER_BY_JPQL);
            } else {
                query.append(CandidateModelImpl.ORDER_BY_SQL);
            }
        }

        String sql = InlineSQLHelperUtil.replacePermissionCheck(query.toString(),
                Candidate.class.getName(), _FILTER_ENTITY_TABLE_FILTER_PK_COLUMN);

        Session session = null;

        try {
            session = openSession();

            SQLQuery q = session.createSQLQuery(sql);

            if (getDB().isSupportsInlineDistinct()) {
                q.addEntity(_FILTER_ENTITY_ALIAS, CandidateImpl.class);
            } else {
                q.addEntity(_FILTER_ENTITY_TABLE, CandidateImpl.class);
            }

            QueryPos qPos = QueryPos.getInstance(q);

            qPos.add(c_id);

            return (List<Candidate>) QueryUtil.list(q, getDialect(), start, end);
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    /**
     * Removes all the candidates where c_id = &#63; from the database.
     *
     * @param c_id the c_id
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByfindCandidates(long c_id) throws SystemException {
        for (Candidate candidate : findByfindCandidates(c_id,
                QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
            remove(candidate);
        }
    }

    /**
     * Returns the number of candidates where c_id = &#63;.
     *
     * @param c_id the c_id
     * @return the number of matching candidates
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByfindCandidates(long c_id) throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_FINDCANDIDATES;

        Object[] finderArgs = new Object[] { c_id };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(2);

            query.append(_SQL_COUNT_CANDIDATE_WHERE);

            query.append(_FINDER_COLUMN_FINDCANDIDATES_C_ID_2);

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
     * Returns the number of candidates that the user has permission to view where c_id = &#63;.
     *
     * @param c_id the c_id
     * @return the number of matching candidates that the user has permission to view
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int filterCountByfindCandidates(long c_id) throws SystemException {
        if (!InlineSQLHelperUtil.isEnabled()) {
            return countByfindCandidates(c_id);
        }

        StringBundler query = new StringBundler(2);

        query.append(_FILTER_SQL_COUNT_CANDIDATE_WHERE);

        query.append(_FINDER_COLUMN_FINDCANDIDATES_C_ID_2);

        String sql = InlineSQLHelperUtil.replacePermissionCheck(query.toString(),
                Candidate.class.getName(), _FILTER_ENTITY_TABLE_FILTER_PK_COLUMN);

        Session session = null;

        try {
            session = openSession();

            SQLQuery q = session.createSQLQuery(sql);

            q.addScalar(COUNT_COLUMN_NAME,
                com.liferay.portal.kernel.dao.orm.Type.LONG);

            QueryPos qPos = QueryPos.getInstance(q);

            qPos.add(c_id);

            Long count = (Long) q.uniqueResult();

            return count.intValue();
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
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
    @Override
    public List<Candidate> findByfilterCandidate(String first_name,
        String middle_name, String last_name, String email)
        throws SystemException {
        return findByfilterCandidate(first_name, middle_name, last_name, email,
            QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
    @Override
    public List<Candidate> findByfilterCandidate(String first_name,
        String middle_name, String last_name, String email, int start, int end)
        throws SystemException {
        return findByfilterCandidate(first_name, middle_name, last_name, email,
            start, end, null);
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
    @Override
    public List<Candidate> findByfilterCandidate(String first_name,
        String middle_name, String last_name, String email, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_FILTERCANDIDATE;
        finderArgs = new Object[] {
                first_name, middle_name, last_name, email,
                
                start, end, orderByComparator
            };

        List<Candidate> list = (List<Candidate>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (Candidate candidate : list) {
                if (!StringUtil.wildcardMatches(candidate.getFirst_name(),
                            first_name, CharPool.UNDERLINE, CharPool.PERCENT,
                            CharPool.BACK_SLASH, true) ||
                        !StringUtil.wildcardMatches(
                            candidate.getMiddle_name(), middle_name,
                            CharPool.UNDERLINE, CharPool.PERCENT,
                            CharPool.BACK_SLASH, true) ||
                        !StringUtil.wildcardMatches(candidate.getLast_name(),
                            last_name, CharPool.UNDERLINE, CharPool.PERCENT,
                            CharPool.BACK_SLASH, true) ||
                        !StringUtil.wildcardMatches(candidate.getEmail(),
                            email, CharPool.UNDERLINE, CharPool.PERCENT,
                            CharPool.BACK_SLASH, true)) {
                    list = null;

                    break;
                }
            }
        }

        if (list == null) {
            StringBundler query = null;

            if (orderByComparator != null) {
                query = new StringBundler(6 +
                        (orderByComparator.getOrderByFields().length * 3));
            } else {
                query = new StringBundler(6);
            }

            query.append(_SQL_SELECT_CANDIDATE_WHERE);

            boolean bindFirst_name = false;

            if (first_name == null) {
                query.append(_FINDER_COLUMN_FILTERCANDIDATE_FIRST_NAME_1);
            } else if (first_name.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_FILTERCANDIDATE_FIRST_NAME_3);
            } else {
                bindFirst_name = true;

                query.append(_FINDER_COLUMN_FILTERCANDIDATE_FIRST_NAME_2);
            }

            boolean bindMiddle_name = false;

            if (middle_name == null) {
                query.append(_FINDER_COLUMN_FILTERCANDIDATE_MIDDLE_NAME_1);
            } else if (middle_name.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_FILTERCANDIDATE_MIDDLE_NAME_3);
            } else {
                bindMiddle_name = true;

                query.append(_FINDER_COLUMN_FILTERCANDIDATE_MIDDLE_NAME_2);
            }

            boolean bindLast_name = false;

            if (last_name == null) {
                query.append(_FINDER_COLUMN_FILTERCANDIDATE_LAST_NAME_1);
            } else if (last_name.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_FILTERCANDIDATE_LAST_NAME_3);
            } else {
                bindLast_name = true;

                query.append(_FINDER_COLUMN_FILTERCANDIDATE_LAST_NAME_2);
            }

            boolean bindEmail = false;

            if (email == null) {
                query.append(_FINDER_COLUMN_FILTERCANDIDATE_EMAIL_1);
            } else if (email.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_FILTERCANDIDATE_EMAIL_3);
            } else {
                bindEmail = true;

                query.append(_FINDER_COLUMN_FILTERCANDIDATE_EMAIL_2);
            }

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(CandidateModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (bindFirst_name) {
                    qPos.add(first_name);
                }

                if (bindMiddle_name) {
                    qPos.add(middle_name);
                }

                if (bindLast_name) {
                    qPos.add(last_name);
                }

                if (bindEmail) {
                    qPos.add(email);
                }

                if (!pagination) {
                    list = (List<Candidate>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<Candidate>(list);
                } else {
                    list = (List<Candidate>) QueryUtil.list(q, getDialect(),
                            start, end);
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
    @Override
    public Candidate findByfilterCandidate_First(String first_name,
        String middle_name, String last_name, String email,
        OrderByComparator orderByComparator)
        throws NoSuchCandidateException, SystemException {
        Candidate candidate = fetchByfilterCandidate_First(first_name,
                middle_name, last_name, email, orderByComparator);

        if (candidate != null) {
            return candidate;
        }

        StringBundler msg = new StringBundler(10);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("first_name=");
        msg.append(first_name);

        msg.append(", middle_name=");
        msg.append(middle_name);

        msg.append(", last_name=");
        msg.append(last_name);

        msg.append(", email=");
        msg.append(email);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchCandidateException(msg.toString());
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
    @Override
    public Candidate fetchByfilterCandidate_First(String first_name,
        String middle_name, String last_name, String email,
        OrderByComparator orderByComparator) throws SystemException {
        List<Candidate> list = findByfilterCandidate(first_name, middle_name,
                last_name, email, 0, 1, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
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
    @Override
    public Candidate findByfilterCandidate_Last(String first_name,
        String middle_name, String last_name, String email,
        OrderByComparator orderByComparator)
        throws NoSuchCandidateException, SystemException {
        Candidate candidate = fetchByfilterCandidate_Last(first_name,
                middle_name, last_name, email, orderByComparator);

        if (candidate != null) {
            return candidate;
        }

        StringBundler msg = new StringBundler(10);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("first_name=");
        msg.append(first_name);

        msg.append(", middle_name=");
        msg.append(middle_name);

        msg.append(", last_name=");
        msg.append(last_name);

        msg.append(", email=");
        msg.append(email);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchCandidateException(msg.toString());
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
    @Override
    public Candidate fetchByfilterCandidate_Last(String first_name,
        String middle_name, String last_name, String email,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countByfilterCandidate(first_name, middle_name, last_name,
                email);

        if (count == 0) {
            return null;
        }

        List<Candidate> list = findByfilterCandidate(first_name, middle_name,
                last_name, email, count - 1, count, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
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
    @Override
    public Candidate[] findByfilterCandidate_PrevAndNext(long c_id,
        String first_name, String middle_name, String last_name, String email,
        OrderByComparator orderByComparator)
        throws NoSuchCandidateException, SystemException {
        Candidate candidate = findByPrimaryKey(c_id);

        Session session = null;

        try {
            session = openSession();

            Candidate[] array = new CandidateImpl[3];

            array[0] = getByfilterCandidate_PrevAndNext(session, candidate,
                    first_name, middle_name, last_name, email,
                    orderByComparator, true);

            array[1] = candidate;

            array[2] = getByfilterCandidate_PrevAndNext(session, candidate,
                    first_name, middle_name, last_name, email,
                    orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected Candidate getByfilterCandidate_PrevAndNext(Session session,
        Candidate candidate, String first_name, String middle_name,
        String last_name, String email, OrderByComparator orderByComparator,
        boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_CANDIDATE_WHERE);

        boolean bindFirst_name = false;

        if (first_name == null) {
            query.append(_FINDER_COLUMN_FILTERCANDIDATE_FIRST_NAME_1);
        } else if (first_name.equals(StringPool.BLANK)) {
            query.append(_FINDER_COLUMN_FILTERCANDIDATE_FIRST_NAME_3);
        } else {
            bindFirst_name = true;

            query.append(_FINDER_COLUMN_FILTERCANDIDATE_FIRST_NAME_2);
        }

        boolean bindMiddle_name = false;

        if (middle_name == null) {
            query.append(_FINDER_COLUMN_FILTERCANDIDATE_MIDDLE_NAME_1);
        } else if (middle_name.equals(StringPool.BLANK)) {
            query.append(_FINDER_COLUMN_FILTERCANDIDATE_MIDDLE_NAME_3);
        } else {
            bindMiddle_name = true;

            query.append(_FINDER_COLUMN_FILTERCANDIDATE_MIDDLE_NAME_2);
        }

        boolean bindLast_name = false;

        if (last_name == null) {
            query.append(_FINDER_COLUMN_FILTERCANDIDATE_LAST_NAME_1);
        } else if (last_name.equals(StringPool.BLANK)) {
            query.append(_FINDER_COLUMN_FILTERCANDIDATE_LAST_NAME_3);
        } else {
            bindLast_name = true;

            query.append(_FINDER_COLUMN_FILTERCANDIDATE_LAST_NAME_2);
        }

        boolean bindEmail = false;

        if (email == null) {
            query.append(_FINDER_COLUMN_FILTERCANDIDATE_EMAIL_1);
        } else if (email.equals(StringPool.BLANK)) {
            query.append(_FINDER_COLUMN_FILTERCANDIDATE_EMAIL_3);
        } else {
            bindEmail = true;

            query.append(_FINDER_COLUMN_FILTERCANDIDATE_EMAIL_2);
        }

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
            query.append(CandidateModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        if (bindFirst_name) {
            qPos.add(first_name);
        }

        if (bindMiddle_name) {
            qPos.add(middle_name);
        }

        if (bindLast_name) {
            qPos.add(last_name);
        }

        if (bindEmail) {
            qPos.add(email);
        }

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(candidate);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<Candidate> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
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
    @Override
    public List<Candidate> filterFindByfilterCandidate(String first_name,
        String middle_name, String last_name, String email)
        throws SystemException {
        return filterFindByfilterCandidate(first_name, middle_name, last_name,
            email, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
    @Override
    public List<Candidate> filterFindByfilterCandidate(String first_name,
        String middle_name, String last_name, String email, int start, int end)
        throws SystemException {
        return filterFindByfilterCandidate(first_name, middle_name, last_name,
            email, start, end, null);
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
    @Override
    public List<Candidate> filterFindByfilterCandidate(String first_name,
        String middle_name, String last_name, String email, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        if (!InlineSQLHelperUtil.isEnabled()) {
            return findByfilterCandidate(first_name, middle_name, last_name,
                email, start, end, orderByComparator);
        }

        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 3));
        } else {
            query = new StringBundler(6);
        }

        if (getDB().isSupportsInlineDistinct()) {
            query.append(_FILTER_SQL_SELECT_CANDIDATE_WHERE);
        } else {
            query.append(_FILTER_SQL_SELECT_CANDIDATE_NO_INLINE_DISTINCT_WHERE_1);
        }

        boolean bindFirst_name = false;

        if (first_name == null) {
            query.append(_FINDER_COLUMN_FILTERCANDIDATE_FIRST_NAME_1);
        } else if (first_name.equals(StringPool.BLANK)) {
            query.append(_FINDER_COLUMN_FILTERCANDIDATE_FIRST_NAME_3);
        } else {
            bindFirst_name = true;

            query.append(_FINDER_COLUMN_FILTERCANDIDATE_FIRST_NAME_2);
        }

        boolean bindMiddle_name = false;

        if (middle_name == null) {
            query.append(_FINDER_COLUMN_FILTERCANDIDATE_MIDDLE_NAME_1);
        } else if (middle_name.equals(StringPool.BLANK)) {
            query.append(_FINDER_COLUMN_FILTERCANDIDATE_MIDDLE_NAME_3);
        } else {
            bindMiddle_name = true;

            query.append(_FINDER_COLUMN_FILTERCANDIDATE_MIDDLE_NAME_2);
        }

        boolean bindLast_name = false;

        if (last_name == null) {
            query.append(_FINDER_COLUMN_FILTERCANDIDATE_LAST_NAME_1);
        } else if (last_name.equals(StringPool.BLANK)) {
            query.append(_FINDER_COLUMN_FILTERCANDIDATE_LAST_NAME_3);
        } else {
            bindLast_name = true;

            query.append(_FINDER_COLUMN_FILTERCANDIDATE_LAST_NAME_2);
        }

        boolean bindEmail = false;

        if (email == null) {
            query.append(_FINDER_COLUMN_FILTERCANDIDATE_EMAIL_1);
        } else if (email.equals(StringPool.BLANK)) {
            query.append(_FINDER_COLUMN_FILTERCANDIDATE_EMAIL_3);
        } else {
            bindEmail = true;

            query.append(_FINDER_COLUMN_FILTERCANDIDATE_EMAIL_2);
        }

        if (!getDB().isSupportsInlineDistinct()) {
            query.append(_FILTER_SQL_SELECT_CANDIDATE_NO_INLINE_DISTINCT_WHERE_2);
        }

        if (orderByComparator != null) {
            if (getDB().isSupportsInlineDistinct()) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator, true);
            } else {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_TABLE,
                    orderByComparator, true);
            }
        } else {
            if (getDB().isSupportsInlineDistinct()) {
                query.append(CandidateModelImpl.ORDER_BY_JPQL);
            } else {
                query.append(CandidateModelImpl.ORDER_BY_SQL);
            }
        }

        String sql = InlineSQLHelperUtil.replacePermissionCheck(query.toString(),
                Candidate.class.getName(), _FILTER_ENTITY_TABLE_FILTER_PK_COLUMN);

        Session session = null;

        try {
            session = openSession();

            SQLQuery q = session.createSQLQuery(sql);

            if (getDB().isSupportsInlineDistinct()) {
                q.addEntity(_FILTER_ENTITY_ALIAS, CandidateImpl.class);
            } else {
                q.addEntity(_FILTER_ENTITY_TABLE, CandidateImpl.class);
            }

            QueryPos qPos = QueryPos.getInstance(q);

            if (bindFirst_name) {
                qPos.add(first_name);
            }

            if (bindMiddle_name) {
                qPos.add(middle_name);
            }

            if (bindLast_name) {
                qPos.add(last_name);
            }

            if (bindEmail) {
                qPos.add(email);
            }

            return (List<Candidate>) QueryUtil.list(q, getDialect(), start, end);
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
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
    @Override
    public Candidate[] filterFindByfilterCandidate_PrevAndNext(long c_id,
        String first_name, String middle_name, String last_name, String email,
        OrderByComparator orderByComparator)
        throws NoSuchCandidateException, SystemException {
        if (!InlineSQLHelperUtil.isEnabled()) {
            return findByfilterCandidate_PrevAndNext(c_id, first_name,
                middle_name, last_name, email, orderByComparator);
        }

        Candidate candidate = findByPrimaryKey(c_id);

        Session session = null;

        try {
            session = openSession();

            Candidate[] array = new CandidateImpl[3];

            array[0] = filterGetByfilterCandidate_PrevAndNext(session,
                    candidate, first_name, middle_name, last_name, email,
                    orderByComparator, true);

            array[1] = candidate;

            array[2] = filterGetByfilterCandidate_PrevAndNext(session,
                    candidate, first_name, middle_name, last_name, email,
                    orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected Candidate filterGetByfilterCandidate_PrevAndNext(
        Session session, Candidate candidate, String first_name,
        String middle_name, String last_name, String email,
        OrderByComparator orderByComparator, boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        if (getDB().isSupportsInlineDistinct()) {
            query.append(_FILTER_SQL_SELECT_CANDIDATE_WHERE);
        } else {
            query.append(_FILTER_SQL_SELECT_CANDIDATE_NO_INLINE_DISTINCT_WHERE_1);
        }

        boolean bindFirst_name = false;

        if (first_name == null) {
            query.append(_FINDER_COLUMN_FILTERCANDIDATE_FIRST_NAME_1);
        } else if (first_name.equals(StringPool.BLANK)) {
            query.append(_FINDER_COLUMN_FILTERCANDIDATE_FIRST_NAME_3);
        } else {
            bindFirst_name = true;

            query.append(_FINDER_COLUMN_FILTERCANDIDATE_FIRST_NAME_2);
        }

        boolean bindMiddle_name = false;

        if (middle_name == null) {
            query.append(_FINDER_COLUMN_FILTERCANDIDATE_MIDDLE_NAME_1);
        } else if (middle_name.equals(StringPool.BLANK)) {
            query.append(_FINDER_COLUMN_FILTERCANDIDATE_MIDDLE_NAME_3);
        } else {
            bindMiddle_name = true;

            query.append(_FINDER_COLUMN_FILTERCANDIDATE_MIDDLE_NAME_2);
        }

        boolean bindLast_name = false;

        if (last_name == null) {
            query.append(_FINDER_COLUMN_FILTERCANDIDATE_LAST_NAME_1);
        } else if (last_name.equals(StringPool.BLANK)) {
            query.append(_FINDER_COLUMN_FILTERCANDIDATE_LAST_NAME_3);
        } else {
            bindLast_name = true;

            query.append(_FINDER_COLUMN_FILTERCANDIDATE_LAST_NAME_2);
        }

        boolean bindEmail = false;

        if (email == null) {
            query.append(_FINDER_COLUMN_FILTERCANDIDATE_EMAIL_1);
        } else if (email.equals(StringPool.BLANK)) {
            query.append(_FINDER_COLUMN_FILTERCANDIDATE_EMAIL_3);
        } else {
            bindEmail = true;

            query.append(_FINDER_COLUMN_FILTERCANDIDATE_EMAIL_2);
        }

        if (!getDB().isSupportsInlineDistinct()) {
            query.append(_FILTER_SQL_SELECT_CANDIDATE_NO_INLINE_DISTINCT_WHERE_2);
        }

        if (orderByComparator != null) {
            String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

            if (orderByConditionFields.length > 0) {
                query.append(WHERE_AND);
            }

            for (int i = 0; i < orderByConditionFields.length; i++) {
                if (getDB().isSupportsInlineDistinct()) {
                    query.append(_ORDER_BY_ENTITY_ALIAS);
                } else {
                    query.append(_ORDER_BY_ENTITY_TABLE);
                }

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
                if (getDB().isSupportsInlineDistinct()) {
                    query.append(_ORDER_BY_ENTITY_ALIAS);
                } else {
                    query.append(_ORDER_BY_ENTITY_TABLE);
                }

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
            if (getDB().isSupportsInlineDistinct()) {
                query.append(CandidateModelImpl.ORDER_BY_JPQL);
            } else {
                query.append(CandidateModelImpl.ORDER_BY_SQL);
            }
        }

        String sql = InlineSQLHelperUtil.replacePermissionCheck(query.toString(),
                Candidate.class.getName(), _FILTER_ENTITY_TABLE_FILTER_PK_COLUMN);

        SQLQuery q = session.createSQLQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        if (getDB().isSupportsInlineDistinct()) {
            q.addEntity(_FILTER_ENTITY_ALIAS, CandidateImpl.class);
        } else {
            q.addEntity(_FILTER_ENTITY_TABLE, CandidateImpl.class);
        }

        QueryPos qPos = QueryPos.getInstance(q);

        if (bindFirst_name) {
            qPos.add(first_name);
        }

        if (bindMiddle_name) {
            qPos.add(middle_name);
        }

        if (bindLast_name) {
            qPos.add(last_name);
        }

        if (bindEmail) {
            qPos.add(email);
        }

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(candidate);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<Candidate> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
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
    @Override
    public List<Candidate> filterFindByfilterCandidate(String[] first_names,
        String[] middle_names, String[] last_names, String[] emails)
        throws SystemException {
        return filterFindByfilterCandidate(first_names, middle_names,
            last_names, emails, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
    @Override
    public List<Candidate> filterFindByfilterCandidate(String[] first_names,
        String[] middle_names, String[] last_names, String[] emails, int start,
        int end) throws SystemException {
        return filterFindByfilterCandidate(first_names, middle_names,
            last_names, emails, start, end, null);
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
    @Override
    public List<Candidate> filterFindByfilterCandidate(String[] first_names,
        String[] middle_names, String[] last_names, String[] emails, int start,
        int end, OrderByComparator orderByComparator) throws SystemException {
        if (!InlineSQLHelperUtil.isEnabled()) {
            return findByfilterCandidate(first_names, middle_names, last_names,
                emails, start, end, orderByComparator);
        }

        StringBundler query = new StringBundler();

        if (getDB().isSupportsInlineDistinct()) {
            query.append(_FILTER_SQL_SELECT_CANDIDATE_WHERE);
        } else {
            query.append(_FILTER_SQL_SELECT_CANDIDATE_NO_INLINE_DISTINCT_WHERE_1);
        }

        boolean conjunctionable = false;

        if ((first_names == null) || (first_names.length > 0)) {
            if (conjunctionable) {
                query.append(WHERE_AND);
            }

            query.append(StringPool.OPEN_PARENTHESIS);

            for (int i = 0; i < first_names.length; i++) {
                String first_name = first_names[i];

                if (first_name == null) {
                    query.append(_FINDER_COLUMN_FILTERCANDIDATE_FIRST_NAME_4);
                } else if (first_name.equals(StringPool.BLANK)) {
                    query.append(_FINDER_COLUMN_FILTERCANDIDATE_FIRST_NAME_6);
                } else {
                    query.append(_FINDER_COLUMN_FILTERCANDIDATE_FIRST_NAME_5);
                }

                if ((i + 1) < first_names.length) {
                    query.append(WHERE_OR);
                }
            }

            query.append(StringPool.CLOSE_PARENTHESIS);

            conjunctionable = true;
        }

        if ((middle_names == null) || (middle_names.length > 0)) {
            if (conjunctionable) {
                query.append(WHERE_AND);
            }

            query.append(StringPool.OPEN_PARENTHESIS);

            for (int i = 0; i < middle_names.length; i++) {
                String middle_name = middle_names[i];

                if (middle_name == null) {
                    query.append(_FINDER_COLUMN_FILTERCANDIDATE_MIDDLE_NAME_4);
                } else if (middle_name.equals(StringPool.BLANK)) {
                    query.append(_FINDER_COLUMN_FILTERCANDIDATE_MIDDLE_NAME_6);
                } else {
                    query.append(_FINDER_COLUMN_FILTERCANDIDATE_MIDDLE_NAME_5);
                }

                if ((i + 1) < middle_names.length) {
                    query.append(WHERE_OR);
                }
            }

            query.append(StringPool.CLOSE_PARENTHESIS);

            conjunctionable = true;
        }

        if ((last_names == null) || (last_names.length > 0)) {
            if (conjunctionable) {
                query.append(WHERE_AND);
            }

            query.append(StringPool.OPEN_PARENTHESIS);

            for (int i = 0; i < last_names.length; i++) {
                String last_name = last_names[i];

                if (last_name == null) {
                    query.append(_FINDER_COLUMN_FILTERCANDIDATE_LAST_NAME_4);
                } else if (last_name.equals(StringPool.BLANK)) {
                    query.append(_FINDER_COLUMN_FILTERCANDIDATE_LAST_NAME_6);
                } else {
                    query.append(_FINDER_COLUMN_FILTERCANDIDATE_LAST_NAME_5);
                }

                if ((i + 1) < last_names.length) {
                    query.append(WHERE_OR);
                }
            }

            query.append(StringPool.CLOSE_PARENTHESIS);

            conjunctionable = true;
        }

        if ((emails == null) || (emails.length > 0)) {
            if (conjunctionable) {
                query.append(WHERE_AND);
            }

            query.append(StringPool.OPEN_PARENTHESIS);

            for (int i = 0; i < emails.length; i++) {
                String email = emails[i];

                if (email == null) {
                    query.append(_FINDER_COLUMN_FILTERCANDIDATE_EMAIL_4);
                } else if (email.equals(StringPool.BLANK)) {
                    query.append(_FINDER_COLUMN_FILTERCANDIDATE_EMAIL_6);
                } else {
                    query.append(_FINDER_COLUMN_FILTERCANDIDATE_EMAIL_5);
                }

                if ((i + 1) < emails.length) {
                    query.append(WHERE_OR);
                }
            }

            query.append(StringPool.CLOSE_PARENTHESIS);

            conjunctionable = true;
        }

        if (!getDB().isSupportsInlineDistinct()) {
            query.append(_FILTER_SQL_SELECT_CANDIDATE_NO_INLINE_DISTINCT_WHERE_2);
        }

        if (orderByComparator != null) {
            if (getDB().isSupportsInlineDistinct()) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator, true);
            } else {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_TABLE,
                    orderByComparator, true);
            }
        } else {
            if (getDB().isSupportsInlineDistinct()) {
                query.append(CandidateModelImpl.ORDER_BY_JPQL);
            } else {
                query.append(CandidateModelImpl.ORDER_BY_SQL);
            }
        }

        String sql = InlineSQLHelperUtil.replacePermissionCheck(query.toString(),
                Candidate.class.getName(), _FILTER_ENTITY_TABLE_FILTER_PK_COLUMN);

        Session session = null;

        try {
            session = openSession();

            SQLQuery q = session.createSQLQuery(sql);

            if (getDB().isSupportsInlineDistinct()) {
                q.addEntity(_FILTER_ENTITY_ALIAS, CandidateImpl.class);
            } else {
                q.addEntity(_FILTER_ENTITY_TABLE, CandidateImpl.class);
            }

            QueryPos qPos = QueryPos.getInstance(q);

            if (first_names != null) {
                qPos.add(first_names);
            }

            if (middle_names != null) {
                qPos.add(middle_names);
            }

            if (last_names != null) {
                qPos.add(last_names);
            }

            if (emails != null) {
                qPos.add(emails);
            }

            return (List<Candidate>) QueryUtil.list(q, getDialect(), start, end);
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
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
    @Override
    public List<Candidate> findByfilterCandidate(String[] first_names,
        String[] middle_names, String[] last_names, String[] emails)
        throws SystemException {
        return findByfilterCandidate(first_names, middle_names, last_names,
            emails, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
    @Override
    public List<Candidate> findByfilterCandidate(String[] first_names,
        String[] middle_names, String[] last_names, String[] emails, int start,
        int end) throws SystemException {
        return findByfilterCandidate(first_names, middle_names, last_names,
            emails, start, end, null);
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
    @Override
    public List<Candidate> findByfilterCandidate(String[] first_names,
        String[] middle_names, String[] last_names, String[] emails, int start,
        int end, OrderByComparator orderByComparator) throws SystemException {
        if ((first_names != null) && (first_names.length == 1) &&
                (middle_names != null) && (middle_names.length == 1) &&
                (last_names != null) && (last_names.length == 1) &&
                (emails != null) && (emails.length == 1)) {
            return findByfilterCandidate(first_names[0], middle_names[0],
                last_names[0], emails[0], start, end, orderByComparator);
        }

        boolean pagination = true;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderArgs = new Object[] {
                    StringUtil.merge(first_names),
                    StringUtil.merge(middle_names), StringUtil.merge(last_names),
                    StringUtil.merge(emails)
                };
        } else {
            finderArgs = new Object[] {
                    StringUtil.merge(first_names),
                    StringUtil.merge(middle_names), StringUtil.merge(last_names),
                    StringUtil.merge(emails),
                    
                    start, end, orderByComparator
                };
        }

        List<Candidate> list = (List<Candidate>) FinderCacheUtil.getResult(FINDER_PATH_WITH_PAGINATION_FIND_BY_FILTERCANDIDATE,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (Candidate candidate : list) {
                if (!ArrayUtil.contains(first_names, candidate.getFirst_name()) ||
                        !ArrayUtil.contains(middle_names,
                            candidate.getMiddle_name()) ||
                        !ArrayUtil.contains(last_names, candidate.getLast_name()) ||
                        !ArrayUtil.contains(emails, candidate.getEmail())) {
                    list = null;

                    break;
                }
            }
        }

        if (list == null) {
            StringBundler query = new StringBundler();

            query.append(_SQL_SELECT_CANDIDATE_WHERE);

            boolean conjunctionable = false;

            if ((first_names == null) || (first_names.length > 0)) {
                if (conjunctionable) {
                    query.append(WHERE_AND);
                }

                query.append(StringPool.OPEN_PARENTHESIS);

                for (int i = 0; i < first_names.length; i++) {
                    String first_name = first_names[i];

                    if (first_name == null) {
                        query.append(_FINDER_COLUMN_FILTERCANDIDATE_FIRST_NAME_4);
                    } else if (first_name.equals(StringPool.BLANK)) {
                        query.append(_FINDER_COLUMN_FILTERCANDIDATE_FIRST_NAME_6);
                    } else {
                        query.append(_FINDER_COLUMN_FILTERCANDIDATE_FIRST_NAME_5);
                    }

                    if ((i + 1) < first_names.length) {
                        query.append(WHERE_OR);
                    }
                }

                query.append(StringPool.CLOSE_PARENTHESIS);

                conjunctionable = true;
            }

            if ((middle_names == null) || (middle_names.length > 0)) {
                if (conjunctionable) {
                    query.append(WHERE_AND);
                }

                query.append(StringPool.OPEN_PARENTHESIS);

                for (int i = 0; i < middle_names.length; i++) {
                    String middle_name = middle_names[i];

                    if (middle_name == null) {
                        query.append(_FINDER_COLUMN_FILTERCANDIDATE_MIDDLE_NAME_4);
                    } else if (middle_name.equals(StringPool.BLANK)) {
                        query.append(_FINDER_COLUMN_FILTERCANDIDATE_MIDDLE_NAME_6);
                    } else {
                        query.append(_FINDER_COLUMN_FILTERCANDIDATE_MIDDLE_NAME_5);
                    }

                    if ((i + 1) < middle_names.length) {
                        query.append(WHERE_OR);
                    }
                }

                query.append(StringPool.CLOSE_PARENTHESIS);

                conjunctionable = true;
            }

            if ((last_names == null) || (last_names.length > 0)) {
                if (conjunctionable) {
                    query.append(WHERE_AND);
                }

                query.append(StringPool.OPEN_PARENTHESIS);

                for (int i = 0; i < last_names.length; i++) {
                    String last_name = last_names[i];

                    if (last_name == null) {
                        query.append(_FINDER_COLUMN_FILTERCANDIDATE_LAST_NAME_4);
                    } else if (last_name.equals(StringPool.BLANK)) {
                        query.append(_FINDER_COLUMN_FILTERCANDIDATE_LAST_NAME_6);
                    } else {
                        query.append(_FINDER_COLUMN_FILTERCANDIDATE_LAST_NAME_5);
                    }

                    if ((i + 1) < last_names.length) {
                        query.append(WHERE_OR);
                    }
                }

                query.append(StringPool.CLOSE_PARENTHESIS);

                conjunctionable = true;
            }

            if ((emails == null) || (emails.length > 0)) {
                if (conjunctionable) {
                    query.append(WHERE_AND);
                }

                query.append(StringPool.OPEN_PARENTHESIS);

                for (int i = 0; i < emails.length; i++) {
                    String email = emails[i];

                    if (email == null) {
                        query.append(_FINDER_COLUMN_FILTERCANDIDATE_EMAIL_4);
                    } else if (email.equals(StringPool.BLANK)) {
                        query.append(_FINDER_COLUMN_FILTERCANDIDATE_EMAIL_6);
                    } else {
                        query.append(_FINDER_COLUMN_FILTERCANDIDATE_EMAIL_5);
                    }

                    if ((i + 1) < emails.length) {
                        query.append(WHERE_OR);
                    }
                }

                query.append(StringPool.CLOSE_PARENTHESIS);

                conjunctionable = true;
            }

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(CandidateModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (first_names != null) {
                    qPos.add(first_names);
                }

                if (middle_names != null) {
                    qPos.add(middle_names);
                }

                if (last_names != null) {
                    qPos.add(last_names);
                }

                if (emails != null) {
                    qPos.add(emails);
                }

                if (!pagination) {
                    list = (List<Candidate>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<Candidate>(list);
                } else {
                    list = (List<Candidate>) QueryUtil.list(q, getDialect(),
                            start, end);
                }

                cacheResult(list);

                FinderCacheUtil.putResult(FINDER_PATH_WITH_PAGINATION_FIND_BY_FILTERCANDIDATE,
                    finderArgs, list);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(FINDER_PATH_WITH_PAGINATION_FIND_BY_FILTERCANDIDATE,
                    finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return list;
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
    @Override
    public void removeByfilterCandidate(String first_name, String middle_name,
        String last_name, String email) throws SystemException {
        for (Candidate candidate : findByfilterCandidate(first_name,
                middle_name, last_name, email, QueryUtil.ALL_POS,
                QueryUtil.ALL_POS, null)) {
            remove(candidate);
        }
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
    @Override
    public int countByfilterCandidate(String first_name, String middle_name,
        String last_name, String email) throws SystemException {
        FinderPath finderPath = FINDER_PATH_WITH_PAGINATION_COUNT_BY_FILTERCANDIDATE;

        Object[] finderArgs = new Object[] {
                first_name, middle_name, last_name, email
            };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(5);

            query.append(_SQL_COUNT_CANDIDATE_WHERE);

            boolean bindFirst_name = false;

            if (first_name == null) {
                query.append(_FINDER_COLUMN_FILTERCANDIDATE_FIRST_NAME_1);
            } else if (first_name.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_FILTERCANDIDATE_FIRST_NAME_3);
            } else {
                bindFirst_name = true;

                query.append(_FINDER_COLUMN_FILTERCANDIDATE_FIRST_NAME_2);
            }

            boolean bindMiddle_name = false;

            if (middle_name == null) {
                query.append(_FINDER_COLUMN_FILTERCANDIDATE_MIDDLE_NAME_1);
            } else if (middle_name.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_FILTERCANDIDATE_MIDDLE_NAME_3);
            } else {
                bindMiddle_name = true;

                query.append(_FINDER_COLUMN_FILTERCANDIDATE_MIDDLE_NAME_2);
            }

            boolean bindLast_name = false;

            if (last_name == null) {
                query.append(_FINDER_COLUMN_FILTERCANDIDATE_LAST_NAME_1);
            } else if (last_name.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_FILTERCANDIDATE_LAST_NAME_3);
            } else {
                bindLast_name = true;

                query.append(_FINDER_COLUMN_FILTERCANDIDATE_LAST_NAME_2);
            }

            boolean bindEmail = false;

            if (email == null) {
                query.append(_FINDER_COLUMN_FILTERCANDIDATE_EMAIL_1);
            } else if (email.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_FILTERCANDIDATE_EMAIL_3);
            } else {
                bindEmail = true;

                query.append(_FINDER_COLUMN_FILTERCANDIDATE_EMAIL_2);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (bindFirst_name) {
                    qPos.add(first_name);
                }

                if (bindMiddle_name) {
                    qPos.add(middle_name);
                }

                if (bindLast_name) {
                    qPos.add(last_name);
                }

                if (bindEmail) {
                    qPos.add(email);
                }

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
     * Returns the number of candidates where first_name LIKE any &#63; and middle_name LIKE any &#63; and last_name LIKE any &#63; and email LIKE any &#63;.
     *
     * @param first_names the first_names
     * @param middle_names the middle_names
     * @param last_names the last_names
     * @param emails the emails
     * @return the number of matching candidates
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByfilterCandidate(String[] first_names,
        String[] middle_names, String[] last_names, String[] emails)
        throws SystemException {
        Object[] finderArgs = new Object[] {
                StringUtil.merge(first_names), StringUtil.merge(middle_names),
                StringUtil.merge(last_names), StringUtil.merge(emails)
            };

        Long count = (Long) FinderCacheUtil.getResult(FINDER_PATH_WITH_PAGINATION_COUNT_BY_FILTERCANDIDATE,
                finderArgs, this);

        if (count == null) {
            StringBundler query = new StringBundler();

            query.append(_SQL_COUNT_CANDIDATE_WHERE);

            boolean conjunctionable = false;

            if ((first_names == null) || (first_names.length > 0)) {
                if (conjunctionable) {
                    query.append(WHERE_AND);
                }

                query.append(StringPool.OPEN_PARENTHESIS);

                for (int i = 0; i < first_names.length; i++) {
                    String first_name = first_names[i];

                    if (first_name == null) {
                        query.append(_FINDER_COLUMN_FILTERCANDIDATE_FIRST_NAME_4);
                    } else if (first_name.equals(StringPool.BLANK)) {
                        query.append(_FINDER_COLUMN_FILTERCANDIDATE_FIRST_NAME_6);
                    } else {
                        query.append(_FINDER_COLUMN_FILTERCANDIDATE_FIRST_NAME_5);
                    }

                    if ((i + 1) < first_names.length) {
                        query.append(WHERE_OR);
                    }
                }

                query.append(StringPool.CLOSE_PARENTHESIS);

                conjunctionable = true;
            }

            if ((middle_names == null) || (middle_names.length > 0)) {
                if (conjunctionable) {
                    query.append(WHERE_AND);
                }

                query.append(StringPool.OPEN_PARENTHESIS);

                for (int i = 0; i < middle_names.length; i++) {
                    String middle_name = middle_names[i];

                    if (middle_name == null) {
                        query.append(_FINDER_COLUMN_FILTERCANDIDATE_MIDDLE_NAME_4);
                    } else if (middle_name.equals(StringPool.BLANK)) {
                        query.append(_FINDER_COLUMN_FILTERCANDIDATE_MIDDLE_NAME_6);
                    } else {
                        query.append(_FINDER_COLUMN_FILTERCANDIDATE_MIDDLE_NAME_5);
                    }

                    if ((i + 1) < middle_names.length) {
                        query.append(WHERE_OR);
                    }
                }

                query.append(StringPool.CLOSE_PARENTHESIS);

                conjunctionable = true;
            }

            if ((last_names == null) || (last_names.length > 0)) {
                if (conjunctionable) {
                    query.append(WHERE_AND);
                }

                query.append(StringPool.OPEN_PARENTHESIS);

                for (int i = 0; i < last_names.length; i++) {
                    String last_name = last_names[i];

                    if (last_name == null) {
                        query.append(_FINDER_COLUMN_FILTERCANDIDATE_LAST_NAME_4);
                    } else if (last_name.equals(StringPool.BLANK)) {
                        query.append(_FINDER_COLUMN_FILTERCANDIDATE_LAST_NAME_6);
                    } else {
                        query.append(_FINDER_COLUMN_FILTERCANDIDATE_LAST_NAME_5);
                    }

                    if ((i + 1) < last_names.length) {
                        query.append(WHERE_OR);
                    }
                }

                query.append(StringPool.CLOSE_PARENTHESIS);

                conjunctionable = true;
            }

            if ((emails == null) || (emails.length > 0)) {
                if (conjunctionable) {
                    query.append(WHERE_AND);
                }

                query.append(StringPool.OPEN_PARENTHESIS);

                for (int i = 0; i < emails.length; i++) {
                    String email = emails[i];

                    if (email == null) {
                        query.append(_FINDER_COLUMN_FILTERCANDIDATE_EMAIL_4);
                    } else if (email.equals(StringPool.BLANK)) {
                        query.append(_FINDER_COLUMN_FILTERCANDIDATE_EMAIL_6);
                    } else {
                        query.append(_FINDER_COLUMN_FILTERCANDIDATE_EMAIL_5);
                    }

                    if ((i + 1) < emails.length) {
                        query.append(WHERE_OR);
                    }
                }

                query.append(StringPool.CLOSE_PARENTHESIS);

                conjunctionable = true;
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (first_names != null) {
                    qPos.add(first_names);
                }

                if (middle_names != null) {
                    qPos.add(middle_names);
                }

                if (last_names != null) {
                    qPos.add(last_names);
                }

                if (emails != null) {
                    qPos.add(emails);
                }

                count = (Long) q.uniqueResult();

                FinderCacheUtil.putResult(FINDER_PATH_WITH_PAGINATION_COUNT_BY_FILTERCANDIDATE,
                    finderArgs, count);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(FINDER_PATH_WITH_PAGINATION_COUNT_BY_FILTERCANDIDATE,
                    finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return count.intValue();
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
    @Override
    public int filterCountByfilterCandidate(String first_name,
        String middle_name, String last_name, String email)
        throws SystemException {
        if (!InlineSQLHelperUtil.isEnabled()) {
            return countByfilterCandidate(first_name, middle_name, last_name,
                email);
        }

        StringBundler query = new StringBundler(5);

        query.append(_FILTER_SQL_COUNT_CANDIDATE_WHERE);

        boolean bindFirst_name = false;

        if (first_name == null) {
            query.append(_FINDER_COLUMN_FILTERCANDIDATE_FIRST_NAME_1);
        } else if (first_name.equals(StringPool.BLANK)) {
            query.append(_FINDER_COLUMN_FILTERCANDIDATE_FIRST_NAME_3);
        } else {
            bindFirst_name = true;

            query.append(_FINDER_COLUMN_FILTERCANDIDATE_FIRST_NAME_2);
        }

        boolean bindMiddle_name = false;

        if (middle_name == null) {
            query.append(_FINDER_COLUMN_FILTERCANDIDATE_MIDDLE_NAME_1);
        } else if (middle_name.equals(StringPool.BLANK)) {
            query.append(_FINDER_COLUMN_FILTERCANDIDATE_MIDDLE_NAME_3);
        } else {
            bindMiddle_name = true;

            query.append(_FINDER_COLUMN_FILTERCANDIDATE_MIDDLE_NAME_2);
        }

        boolean bindLast_name = false;

        if (last_name == null) {
            query.append(_FINDER_COLUMN_FILTERCANDIDATE_LAST_NAME_1);
        } else if (last_name.equals(StringPool.BLANK)) {
            query.append(_FINDER_COLUMN_FILTERCANDIDATE_LAST_NAME_3);
        } else {
            bindLast_name = true;

            query.append(_FINDER_COLUMN_FILTERCANDIDATE_LAST_NAME_2);
        }

        boolean bindEmail = false;

        if (email == null) {
            query.append(_FINDER_COLUMN_FILTERCANDIDATE_EMAIL_1);
        } else if (email.equals(StringPool.BLANK)) {
            query.append(_FINDER_COLUMN_FILTERCANDIDATE_EMAIL_3);
        } else {
            bindEmail = true;

            query.append(_FINDER_COLUMN_FILTERCANDIDATE_EMAIL_2);
        }

        String sql = InlineSQLHelperUtil.replacePermissionCheck(query.toString(),
                Candidate.class.getName(), _FILTER_ENTITY_TABLE_FILTER_PK_COLUMN);

        Session session = null;

        try {
            session = openSession();

            SQLQuery q = session.createSQLQuery(sql);

            q.addScalar(COUNT_COLUMN_NAME,
                com.liferay.portal.kernel.dao.orm.Type.LONG);

            QueryPos qPos = QueryPos.getInstance(q);

            if (bindFirst_name) {
                qPos.add(first_name);
            }

            if (bindMiddle_name) {
                qPos.add(middle_name);
            }

            if (bindLast_name) {
                qPos.add(last_name);
            }

            if (bindEmail) {
                qPos.add(email);
            }

            Long count = (Long) q.uniqueResult();

            return count.intValue();
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
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
    @Override
    public int filterCountByfilterCandidate(String[] first_names,
        String[] middle_names, String[] last_names, String[] emails)
        throws SystemException {
        if (!InlineSQLHelperUtil.isEnabled()) {
            return countByfilterCandidate(first_names, middle_names,
                last_names, emails);
        }

        StringBundler query = new StringBundler();

        query.append(_FILTER_SQL_COUNT_CANDIDATE_WHERE);

        boolean conjunctionable = false;

        if ((first_names == null) || (first_names.length > 0)) {
            if (conjunctionable) {
                query.append(WHERE_AND);
            }

            query.append(StringPool.OPEN_PARENTHESIS);

            for (int i = 0; i < first_names.length; i++) {
                String first_name = first_names[i];

                if (first_name == null) {
                    query.append(_FINDER_COLUMN_FILTERCANDIDATE_FIRST_NAME_4);
                } else if (first_name.equals(StringPool.BLANK)) {
                    query.append(_FINDER_COLUMN_FILTERCANDIDATE_FIRST_NAME_6);
                } else {
                    query.append(_FINDER_COLUMN_FILTERCANDIDATE_FIRST_NAME_5);
                }

                if ((i + 1) < first_names.length) {
                    query.append(WHERE_OR);
                }
            }

            query.append(StringPool.CLOSE_PARENTHESIS);

            conjunctionable = true;
        }

        if ((middle_names == null) || (middle_names.length > 0)) {
            if (conjunctionable) {
                query.append(WHERE_AND);
            }

            query.append(StringPool.OPEN_PARENTHESIS);

            for (int i = 0; i < middle_names.length; i++) {
                String middle_name = middle_names[i];

                if (middle_name == null) {
                    query.append(_FINDER_COLUMN_FILTERCANDIDATE_MIDDLE_NAME_4);
                } else if (middle_name.equals(StringPool.BLANK)) {
                    query.append(_FINDER_COLUMN_FILTERCANDIDATE_MIDDLE_NAME_6);
                } else {
                    query.append(_FINDER_COLUMN_FILTERCANDIDATE_MIDDLE_NAME_5);
                }

                if ((i + 1) < middle_names.length) {
                    query.append(WHERE_OR);
                }
            }

            query.append(StringPool.CLOSE_PARENTHESIS);

            conjunctionable = true;
        }

        if ((last_names == null) || (last_names.length > 0)) {
            if (conjunctionable) {
                query.append(WHERE_AND);
            }

            query.append(StringPool.OPEN_PARENTHESIS);

            for (int i = 0; i < last_names.length; i++) {
                String last_name = last_names[i];

                if (last_name == null) {
                    query.append(_FINDER_COLUMN_FILTERCANDIDATE_LAST_NAME_4);
                } else if (last_name.equals(StringPool.BLANK)) {
                    query.append(_FINDER_COLUMN_FILTERCANDIDATE_LAST_NAME_6);
                } else {
                    query.append(_FINDER_COLUMN_FILTERCANDIDATE_LAST_NAME_5);
                }

                if ((i + 1) < last_names.length) {
                    query.append(WHERE_OR);
                }
            }

            query.append(StringPool.CLOSE_PARENTHESIS);

            conjunctionable = true;
        }

        if ((emails == null) || (emails.length > 0)) {
            if (conjunctionable) {
                query.append(WHERE_AND);
            }

            query.append(StringPool.OPEN_PARENTHESIS);

            for (int i = 0; i < emails.length; i++) {
                String email = emails[i];

                if (email == null) {
                    query.append(_FINDER_COLUMN_FILTERCANDIDATE_EMAIL_4);
                } else if (email.equals(StringPool.BLANK)) {
                    query.append(_FINDER_COLUMN_FILTERCANDIDATE_EMAIL_6);
                } else {
                    query.append(_FINDER_COLUMN_FILTERCANDIDATE_EMAIL_5);
                }

                if ((i + 1) < emails.length) {
                    query.append(WHERE_OR);
                }
            }

            query.append(StringPool.CLOSE_PARENTHESIS);

            conjunctionable = true;
        }

        String sql = InlineSQLHelperUtil.replacePermissionCheck(query.toString(),
                Candidate.class.getName(), _FILTER_ENTITY_TABLE_FILTER_PK_COLUMN);

        Session session = null;

        try {
            session = openSession();

            SQLQuery q = session.createSQLQuery(sql);

            q.addScalar(COUNT_COLUMN_NAME,
                com.liferay.portal.kernel.dao.orm.Type.LONG);

            QueryPos qPos = QueryPos.getInstance(q);

            if (first_names != null) {
                qPos.add(first_names);
            }

            if (middle_names != null) {
                qPos.add(middle_names);
            }

            if (last_names != null) {
                qPos.add(last_names);
            }

            if (emails != null) {
                qPos.add(emails);
            }

            Long count = (Long) q.uniqueResult();

            return count.intValue();
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    /**
     * Caches the candidate in the entity cache if it is enabled.
     *
     * @param candidate the candidate
     */
    @Override
    public void cacheResult(Candidate candidate) {
        EntityCacheUtil.putResult(CandidateModelImpl.ENTITY_CACHE_ENABLED,
            CandidateImpl.class, candidate.getPrimaryKey(), candidate);

        candidate.resetOriginalValues();
    }

    /**
     * Caches the candidates in the entity cache if it is enabled.
     *
     * @param candidates the candidates
     */
    @Override
    public void cacheResult(List<Candidate> candidates) {
        for (Candidate candidate : candidates) {
            if (EntityCacheUtil.getResult(
                        CandidateModelImpl.ENTITY_CACHE_ENABLED,
                        CandidateImpl.class, candidate.getPrimaryKey()) == null) {
                cacheResult(candidate);
            } else {
                candidate.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all candidates.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(CandidateImpl.class.getName());
        }

        EntityCacheUtil.clearCache(CandidateImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the candidate.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(Candidate candidate) {
        EntityCacheUtil.removeResult(CandidateModelImpl.ENTITY_CACHE_ENABLED,
            CandidateImpl.class, candidate.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    @Override
    public void clearCache(List<Candidate> candidates) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (Candidate candidate : candidates) {
            EntityCacheUtil.removeResult(CandidateModelImpl.ENTITY_CACHE_ENABLED,
                CandidateImpl.class, candidate.getPrimaryKey());
        }
    }

    /**
     * Creates a new candidate with the primary key. Does not add the candidate to the database.
     *
     * @param c_id the primary key for the new candidate
     * @return the new candidate
     */
    @Override
    public Candidate create(long c_id) {
        Candidate candidate = new CandidateImpl();

        candidate.setNew(true);
        candidate.setPrimaryKey(c_id);

        return candidate;
    }

    /**
     * Removes the candidate with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param c_id the primary key of the candidate
     * @return the candidate that was removed
     * @throws vn.com.ecopharma.hrm.NoSuchCandidateException if a candidate with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Candidate remove(long c_id)
        throws NoSuchCandidateException, SystemException {
        return remove((Serializable) c_id);
    }

    /**
     * Removes the candidate with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the candidate
     * @return the candidate that was removed
     * @throws vn.com.ecopharma.hrm.NoSuchCandidateException if a candidate with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Candidate remove(Serializable primaryKey)
        throws NoSuchCandidateException, SystemException {
        Session session = null;

        try {
            session = openSession();

            Candidate candidate = (Candidate) session.get(CandidateImpl.class,
                    primaryKey);

            if (candidate == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchCandidateException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(candidate);
        } catch (NoSuchCandidateException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected Candidate removeImpl(Candidate candidate)
        throws SystemException {
        candidate = toUnwrappedModel(candidate);

        candidateToVacancyTableMapper.deleteLeftPrimaryKeyTableMappings(candidate.getPrimaryKey());

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(candidate)) {
                candidate = (Candidate) session.get(CandidateImpl.class,
                        candidate.getPrimaryKeyObj());
            }

            if (candidate != null) {
                session.delete(candidate);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (candidate != null) {
            clearCache(candidate);
        }

        return candidate;
    }

    @Override
    public Candidate updateImpl(vn.com.ecopharma.hrm.model.Candidate candidate)
        throws SystemException {
        candidate = toUnwrappedModel(candidate);

        boolean isNew = candidate.isNew();

        CandidateModelImpl candidateModelImpl = (CandidateModelImpl) candidate;

        Session session = null;

        try {
            session = openSession();

            if (candidate.isNew()) {
                session.save(candidate);

                candidate.setNew(false);
            } else {
                session.merge(candidate);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

        if (isNew || !CandidateModelImpl.COLUMN_BITMASK_ENABLED) {
            FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
        }
        else {
            if ((candidateModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FINDCANDIDATES.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        candidateModelImpl.getOriginalC_id()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_FINDCANDIDATES,
                    args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FINDCANDIDATES,
                    args);

                args = new Object[] { candidateModelImpl.getC_id() };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_FINDCANDIDATES,
                    args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FINDCANDIDATES,
                    args);
            }
        }

        EntityCacheUtil.putResult(CandidateModelImpl.ENTITY_CACHE_ENABLED,
            CandidateImpl.class, candidate.getPrimaryKey(), candidate);

        return candidate;
    }

    protected Candidate toUnwrappedModel(Candidate candidate) {
        if (candidate instanceof CandidateImpl) {
            return candidate;
        }

        CandidateImpl candidateImpl = new CandidateImpl();

        candidateImpl.setNew(candidate.isNew());
        candidateImpl.setPrimaryKey(candidate.getPrimaryKey());

        candidateImpl.setC_id(candidate.getC_id());
        candidateImpl.setFirst_name(candidate.getFirst_name());
        candidateImpl.setMiddle_name(candidate.getMiddle_name());
        candidateImpl.setLast_name(candidate.getLast_name());
        candidateImpl.setEmail(candidate.getEmail());
        candidateImpl.setContact_number(candidate.getContact_number());
        candidateImpl.setComment(candidate.getComment());
        candidateImpl.setMode_of_application(candidate.getMode_of_application());
        candidateImpl.setDate_of_application(candidate.getDate_of_application());
        candidateImpl.setCv_file_id(candidate.getCv_file_id());
        candidateImpl.setCv_text_version(candidate.getCv_text_version());
        candidateImpl.setKeywords(candidate.getKeywords());
        candidateImpl.setAdded_person(candidate.getAdded_person());
        candidateImpl.setUser_id(candidate.getUser_id());
        candidateImpl.setGroup_id(candidate.getGroup_id());

        return candidateImpl;
    }

    /**
     * Returns the candidate with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the candidate
     * @return the candidate
     * @throws vn.com.ecopharma.hrm.NoSuchCandidateException if a candidate with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Candidate findByPrimaryKey(Serializable primaryKey)
        throws NoSuchCandidateException, SystemException {
        Candidate candidate = fetchByPrimaryKey(primaryKey);

        if (candidate == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchCandidateException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return candidate;
    }

    /**
     * Returns the candidate with the primary key or throws a {@link vn.com.ecopharma.hrm.NoSuchCandidateException} if it could not be found.
     *
     * @param c_id the primary key of the candidate
     * @return the candidate
     * @throws vn.com.ecopharma.hrm.NoSuchCandidateException if a candidate with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Candidate findByPrimaryKey(long c_id)
        throws NoSuchCandidateException, SystemException {
        return findByPrimaryKey((Serializable) c_id);
    }

    /**
     * Returns the candidate with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the candidate
     * @return the candidate, or <code>null</code> if a candidate with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Candidate fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        Candidate candidate = (Candidate) EntityCacheUtil.getResult(CandidateModelImpl.ENTITY_CACHE_ENABLED,
                CandidateImpl.class, primaryKey);

        if (candidate == _nullCandidate) {
            return null;
        }

        if (candidate == null) {
            Session session = null;

            try {
                session = openSession();

                candidate = (Candidate) session.get(CandidateImpl.class,
                        primaryKey);

                if (candidate != null) {
                    cacheResult(candidate);
                } else {
                    EntityCacheUtil.putResult(CandidateModelImpl.ENTITY_CACHE_ENABLED,
                        CandidateImpl.class, primaryKey, _nullCandidate);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(CandidateModelImpl.ENTITY_CACHE_ENABLED,
                    CandidateImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return candidate;
    }

    /**
     * Returns the candidate with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param c_id the primary key of the candidate
     * @return the candidate, or <code>null</code> if a candidate with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Candidate fetchByPrimaryKey(long c_id) throws SystemException {
        return fetchByPrimaryKey((Serializable) c_id);
    }

    /**
     * Returns all the candidates.
     *
     * @return the candidates
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Candidate> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
    @Override
    public List<Candidate> findAll(int start, int end)
        throws SystemException {
        return findAll(start, end, null);
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
    @Override
    public List<Candidate> findAll(int start, int end,
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

        List<Candidate> list = (List<Candidate>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_CANDIDATE);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_CANDIDATE;

                if (pagination) {
                    sql = sql.concat(CandidateModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<Candidate>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<Candidate>(list);
                } else {
                    list = (List<Candidate>) QueryUtil.list(q, getDialect(),
                            start, end);
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
     * Removes all the candidates from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (Candidate candidate : findAll()) {
            remove(candidate);
        }
    }

    /**
     * Returns the number of candidates.
     *
     * @return the number of candidates
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

                Query q = session.createQuery(_SQL_COUNT_CANDIDATE);

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
     * Returns all the vacancies associated with the candidate.
     *
     * @param pk the primary key of the candidate
     * @return the vacancies associated with the candidate
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<vn.com.ecopharma.hrm.model.Vacancy> getVacancies(long pk)
        throws SystemException {
        return getVacancies(pk, QueryUtil.ALL_POS, QueryUtil.ALL_POS);
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
    @Override
    public List<vn.com.ecopharma.hrm.model.Vacancy> getVacancies(long pk,
        int start, int end) throws SystemException {
        return getVacancies(pk, start, end, null);
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
    @Override
    public List<vn.com.ecopharma.hrm.model.Vacancy> getVacancies(long pk,
        int start, int end, OrderByComparator orderByComparator)
        throws SystemException {
        return candidateToVacancyTableMapper.getRightBaseModels(pk, start, end,
            orderByComparator);
    }

    /**
     * Returns the number of vacancies associated with the candidate.
     *
     * @param pk the primary key of the candidate
     * @return the number of vacancies associated with the candidate
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int getVacanciesSize(long pk) throws SystemException {
        long[] pks = candidateToVacancyTableMapper.getRightPrimaryKeys(pk);

        return pks.length;
    }

    /**
     * Returns <code>true</code> if the vacancy is associated with the candidate.
     *
     * @param pk the primary key of the candidate
     * @param vacancyPK the primary key of the vacancy
     * @return <code>true</code> if the vacancy is associated with the candidate; <code>false</code> otherwise
     * @throws SystemException if a system exception occurred
     */
    @Override
    public boolean containsVacancy(long pk, long vacancyPK)
        throws SystemException {
        return candidateToVacancyTableMapper.containsTableMapping(pk, vacancyPK);
    }

    /**
     * Returns <code>true</code> if the candidate has any vacancies associated with it.
     *
     * @param pk the primary key of the candidate to check for associations with vacancies
     * @return <code>true</code> if the candidate has any vacancies associated with it; <code>false</code> otherwise
     * @throws SystemException if a system exception occurred
     */
    @Override
    public boolean containsVacancies(long pk) throws SystemException {
        if (getVacanciesSize(pk) > 0) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Adds an association between the candidate and the vacancy. Also notifies the appropriate model listeners and clears the mapping table finder cache.
     *
     * @param pk the primary key of the candidate
     * @param vacancyPK the primary key of the vacancy
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void addVacancy(long pk, long vacancyPK) throws SystemException {
        candidateToVacancyTableMapper.addTableMapping(pk, vacancyPK);
    }

    /**
     * Adds an association between the candidate and the vacancy. Also notifies the appropriate model listeners and clears the mapping table finder cache.
     *
     * @param pk the primary key of the candidate
     * @param vacancy the vacancy
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void addVacancy(long pk, vn.com.ecopharma.hrm.model.Vacancy vacancy)
        throws SystemException {
        candidateToVacancyTableMapper.addTableMapping(pk,
            vacancy.getPrimaryKey());
    }

    /**
     * Adds an association between the candidate and the vacancies. Also notifies the appropriate model listeners and clears the mapping table finder cache.
     *
     * @param pk the primary key of the candidate
     * @param vacancyPKs the primary keys of the vacancies
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void addVacancies(long pk, long[] vacancyPKs)
        throws SystemException {
        for (long vacancyPK : vacancyPKs) {
            candidateToVacancyTableMapper.addTableMapping(pk, vacancyPK);
        }
    }

    /**
     * Adds an association between the candidate and the vacancies. Also notifies the appropriate model listeners and clears the mapping table finder cache.
     *
     * @param pk the primary key of the candidate
     * @param vacancies the vacancies
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void addVacancies(long pk,
        List<vn.com.ecopharma.hrm.model.Vacancy> vacancies)
        throws SystemException {
        for (vn.com.ecopharma.hrm.model.Vacancy vacancy : vacancies) {
            candidateToVacancyTableMapper.addTableMapping(pk,
                vacancy.getPrimaryKey());
        }
    }

    /**
     * Clears all associations between the candidate and its vacancies. Also notifies the appropriate model listeners and clears the mapping table finder cache.
     *
     * @param pk the primary key of the candidate to clear the associated vacancies from
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void clearVacancies(long pk) throws SystemException {
        candidateToVacancyTableMapper.deleteLeftPrimaryKeyTableMappings(pk);
    }

    /**
     * Removes the association between the candidate and the vacancy. Also notifies the appropriate model listeners and clears the mapping table finder cache.
     *
     * @param pk the primary key of the candidate
     * @param vacancyPK the primary key of the vacancy
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeVacancy(long pk, long vacancyPK)
        throws SystemException {
        candidateToVacancyTableMapper.deleteTableMapping(pk, vacancyPK);
    }

    /**
     * Removes the association between the candidate and the vacancy. Also notifies the appropriate model listeners and clears the mapping table finder cache.
     *
     * @param pk the primary key of the candidate
     * @param vacancy the vacancy
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeVacancy(long pk,
        vn.com.ecopharma.hrm.model.Vacancy vacancy) throws SystemException {
        candidateToVacancyTableMapper.deleteTableMapping(pk,
            vacancy.getPrimaryKey());
    }

    /**
     * Removes the association between the candidate and the vacancies. Also notifies the appropriate model listeners and clears the mapping table finder cache.
     *
     * @param pk the primary key of the candidate
     * @param vacancyPKs the primary keys of the vacancies
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeVacancies(long pk, long[] vacancyPKs)
        throws SystemException {
        for (long vacancyPK : vacancyPKs) {
            candidateToVacancyTableMapper.deleteTableMapping(pk, vacancyPK);
        }
    }

    /**
     * Removes the association between the candidate and the vacancies. Also notifies the appropriate model listeners and clears the mapping table finder cache.
     *
     * @param pk the primary key of the candidate
     * @param vacancies the vacancies
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeVacancies(long pk,
        List<vn.com.ecopharma.hrm.model.Vacancy> vacancies)
        throws SystemException {
        for (vn.com.ecopharma.hrm.model.Vacancy vacancy : vacancies) {
            candidateToVacancyTableMapper.deleteTableMapping(pk,
                vacancy.getPrimaryKey());
        }
    }

    /**
     * Sets the vacancies associated with the candidate, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
     *
     * @param pk the primary key of the candidate
     * @param vacancyPKs the primary keys of the vacancies to be associated with the candidate
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void setVacancies(long pk, long[] vacancyPKs)
        throws SystemException {
        Set<Long> newVacancyPKsSet = SetUtil.fromArray(vacancyPKs);
        Set<Long> oldVacancyPKsSet = SetUtil.fromArray(candidateToVacancyTableMapper.getRightPrimaryKeys(
                    pk));

        Set<Long> removeVacancyPKsSet = new HashSet<Long>(oldVacancyPKsSet);

        removeVacancyPKsSet.removeAll(newVacancyPKsSet);

        for (long removeVacancyPK : removeVacancyPKsSet) {
            candidateToVacancyTableMapper.deleteTableMapping(pk, removeVacancyPK);
        }

        newVacancyPKsSet.removeAll(oldVacancyPKsSet);

        for (long newVacancyPK : newVacancyPKsSet) {
            candidateToVacancyTableMapper.addTableMapping(pk, newVacancyPK);
        }
    }

    /**
     * Sets the vacancies associated with the candidate, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
     *
     * @param pk the primary key of the candidate
     * @param vacancies the vacancies to be associated with the candidate
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void setVacancies(long pk,
        List<vn.com.ecopharma.hrm.model.Vacancy> vacancies)
        throws SystemException {
        try {
            long[] vacancyPKs = new long[vacancies.size()];

            for (int i = 0; i < vacancies.size(); i++) {
                vn.com.ecopharma.hrm.model.Vacancy vacancy = vacancies.get(i);

                vacancyPKs[i] = vacancy.getPrimaryKey();
            }

            setVacancies(pk, vacancyPKs);
        } catch (Exception e) {
            throw processException(e);
        } finally {
            FinderCacheUtil.clearCache(CandidateModelImpl.MAPPING_TABLE_HRM_VACANCIES_CANDIDATES_NAME);
        }
    }

    @Override
    protected Set<String> getBadColumnNames() {
        return _badColumnNames;
    }

    /**
     * Initializes the candidate persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.vn.com.ecopharma.hrm.model.Candidate")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<Candidate>> listenersList = new ArrayList<ModelListener<Candidate>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<Candidate>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }

        candidateToVacancyTableMapper = TableMapperFactory.getTableMapper("HRM_Vacancies_Candidates",
                "c_id", "v_id", this, vacancyPersistence);
    }

    public void destroy() {
        EntityCacheUtil.removeCache(CandidateImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
