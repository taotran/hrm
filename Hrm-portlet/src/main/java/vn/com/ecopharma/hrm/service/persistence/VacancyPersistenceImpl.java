package vn.com.ecopharma.hrm.service.persistence;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.cache.CacheRegistryUtil;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
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
import com.liferay.portal.kernel.util.SetUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.UnmodifiableList;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.service.persistence.impl.TableMapper;
import com.liferay.portal.service.persistence.impl.TableMapperFactory;

import vn.com.ecopharma.hrm.NoSuchVacancyException;
import vn.com.ecopharma.hrm.model.Vacancy;
import vn.com.ecopharma.hrm.model.impl.VacancyImpl;
import vn.com.ecopharma.hrm.model.impl.VacancyModelImpl;
import vn.com.ecopharma.hrm.service.persistence.CandidatePersistence;
import vn.com.ecopharma.hrm.service.persistence.VacancyPersistence;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the vacancy service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author tvt
 * @see VacancyPersistence
 * @see VacancyUtil
 * @generated
 */
public class VacancyPersistenceImpl extends BasePersistenceImpl<Vacancy>
    implements VacancyPersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link VacancyUtil} to access the vacancy persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = VacancyImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(VacancyModelImpl.ENTITY_CACHE_ENABLED,
            VacancyModelImpl.FINDER_CACHE_ENABLED, VacancyImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(VacancyModelImpl.ENTITY_CACHE_ENABLED,
            VacancyModelImpl.FINDER_CACHE_ENABLED, VacancyImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(VacancyModelImpl.ENTITY_CACHE_ENABLED,
            VacancyModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    private static final String _SQL_SELECT_VACANCY = "SELECT vacancy FROM Vacancy vacancy";
    private static final String _SQL_COUNT_VACANCY = "SELECT COUNT(vacancy) FROM Vacancy vacancy";
    private static final String _ORDER_BY_ENTITY_ALIAS = "vacancy.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Vacancy exists with the primary key ";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(VacancyPersistenceImpl.class);
    private static Vacancy _nullVacancy = new VacancyImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<Vacancy> toCacheModel() {
                return _nullVacancyCacheModel;
            }
        };

    private static CacheModel<Vacancy> _nullVacancyCacheModel = new CacheModel<Vacancy>() {
            @Override
            public Vacancy toEntityModel() {
                return _nullVacancy;
            }
        };

    @BeanReference(type = CandidatePersistence.class)
    protected CandidatePersistence candidatePersistence;
    protected TableMapper<Vacancy, vn.com.ecopharma.hrm.model.Candidate> vacancyToCandidateTableMapper;

    public VacancyPersistenceImpl() {
        setModelClass(Vacancy.class);
    }

    /**
     * Caches the vacancy in the entity cache if it is enabled.
     *
     * @param vacancy the vacancy
     */
    @Override
    public void cacheResult(Vacancy vacancy) {
        EntityCacheUtil.putResult(VacancyModelImpl.ENTITY_CACHE_ENABLED,
            VacancyImpl.class, vacancy.getPrimaryKey(), vacancy);

        vacancy.resetOriginalValues();
    }

    /**
     * Caches the vacancies in the entity cache if it is enabled.
     *
     * @param vacancies the vacancies
     */
    @Override
    public void cacheResult(List<Vacancy> vacancies) {
        for (Vacancy vacancy : vacancies) {
            if (EntityCacheUtil.getResult(
                        VacancyModelImpl.ENTITY_CACHE_ENABLED,
                        VacancyImpl.class, vacancy.getPrimaryKey()) == null) {
                cacheResult(vacancy);
            } else {
                vacancy.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all vacancies.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(VacancyImpl.class.getName());
        }

        EntityCacheUtil.clearCache(VacancyImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the vacancy.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(Vacancy vacancy) {
        EntityCacheUtil.removeResult(VacancyModelImpl.ENTITY_CACHE_ENABLED,
            VacancyImpl.class, vacancy.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    @Override
    public void clearCache(List<Vacancy> vacancies) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (Vacancy vacancy : vacancies) {
            EntityCacheUtil.removeResult(VacancyModelImpl.ENTITY_CACHE_ENABLED,
                VacancyImpl.class, vacancy.getPrimaryKey());
        }
    }

    /**
     * Creates a new vacancy with the primary key. Does not add the vacancy to the database.
     *
     * @param v_id the primary key for the new vacancy
     * @return the new vacancy
     */
    @Override
    public Vacancy create(long v_id) {
        Vacancy vacancy = new VacancyImpl();

        vacancy.setNew(true);
        vacancy.setPrimaryKey(v_id);

        return vacancy;
    }

    /**
     * Removes the vacancy with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param v_id the primary key of the vacancy
     * @return the vacancy that was removed
     * @throws vn.com.ecopharma.hrm.NoSuchVacancyException if a vacancy with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Vacancy remove(long v_id)
        throws NoSuchVacancyException, SystemException {
        return remove((Serializable) v_id);
    }

    /**
     * Removes the vacancy with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the vacancy
     * @return the vacancy that was removed
     * @throws vn.com.ecopharma.hrm.NoSuchVacancyException if a vacancy with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Vacancy remove(Serializable primaryKey)
        throws NoSuchVacancyException, SystemException {
        Session session = null;

        try {
            session = openSession();

            Vacancy vacancy = (Vacancy) session.get(VacancyImpl.class,
                    primaryKey);

            if (vacancy == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchVacancyException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(vacancy);
        } catch (NoSuchVacancyException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected Vacancy removeImpl(Vacancy vacancy) throws SystemException {
        vacancy = toUnwrappedModel(vacancy);

        vacancyToCandidateTableMapper.deleteLeftPrimaryKeyTableMappings(vacancy.getPrimaryKey());

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(vacancy)) {
                vacancy = (Vacancy) session.get(VacancyImpl.class,
                        vacancy.getPrimaryKeyObj());
            }

            if (vacancy != null) {
                session.delete(vacancy);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (vacancy != null) {
            clearCache(vacancy);
        }

        return vacancy;
    }

    @Override
    public Vacancy updateImpl(vn.com.ecopharma.hrm.model.Vacancy vacancy)
        throws SystemException {
        vacancy = toUnwrappedModel(vacancy);

        boolean isNew = vacancy.isNew();

        Session session = null;

        try {
            session = openSession();

            if (vacancy.isNew()) {
                session.save(vacancy);

                vacancy.setNew(false);
            } else {
                session.merge(vacancy);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

        if (isNew) {
            FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
        }

        EntityCacheUtil.putResult(VacancyModelImpl.ENTITY_CACHE_ENABLED,
            VacancyImpl.class, vacancy.getPrimaryKey(), vacancy);

        return vacancy;
    }

    protected Vacancy toUnwrappedModel(Vacancy vacancy) {
        if (vacancy instanceof VacancyImpl) {
            return vacancy;
        }

        VacancyImpl vacancyImpl = new VacancyImpl();

        vacancyImpl.setNew(vacancy.isNew());
        vacancyImpl.setPrimaryKey(vacancy.getPrimaryKey());

        vacancyImpl.setV_id(vacancy.getV_id());
        vacancyImpl.setJtitle_id(vacancy.getJtitle_id());
        vacancyImpl.setHiring_manager_id(vacancy.getHiring_manager_id());
        vacancyImpl.setName(vacancy.getName());
        vacancyImpl.setDescription(vacancy.getDescription());
        vacancyImpl.setNo_of_positions(vacancy.getNo_of_positions());
        vacancyImpl.setPublished_in_feed(vacancy.isPublished_in_feed());
        vacancyImpl.setInsert_date(vacancy.getInsert_date());
        vacancyImpl.setUpdate_date(vacancy.getUpdate_date());
        vacancyImpl.setUser_id(vacancy.getUser_id());
        vacancyImpl.setGroup_id(vacancy.getGroup_id());

        return vacancyImpl;
    }

    /**
     * Returns the vacancy with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the vacancy
     * @return the vacancy
     * @throws vn.com.ecopharma.hrm.NoSuchVacancyException if a vacancy with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Vacancy findByPrimaryKey(Serializable primaryKey)
        throws NoSuchVacancyException, SystemException {
        Vacancy vacancy = fetchByPrimaryKey(primaryKey);

        if (vacancy == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchVacancyException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return vacancy;
    }

    /**
     * Returns the vacancy with the primary key or throws a {@link vn.com.ecopharma.hrm.NoSuchVacancyException} if it could not be found.
     *
     * @param v_id the primary key of the vacancy
     * @return the vacancy
     * @throws vn.com.ecopharma.hrm.NoSuchVacancyException if a vacancy with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Vacancy findByPrimaryKey(long v_id)
        throws NoSuchVacancyException, SystemException {
        return findByPrimaryKey((Serializable) v_id);
    }

    /**
     * Returns the vacancy with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the vacancy
     * @return the vacancy, or <code>null</code> if a vacancy with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Vacancy fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        Vacancy vacancy = (Vacancy) EntityCacheUtil.getResult(VacancyModelImpl.ENTITY_CACHE_ENABLED,
                VacancyImpl.class, primaryKey);

        if (vacancy == _nullVacancy) {
            return null;
        }

        if (vacancy == null) {
            Session session = null;

            try {
                session = openSession();

                vacancy = (Vacancy) session.get(VacancyImpl.class, primaryKey);

                if (vacancy != null) {
                    cacheResult(vacancy);
                } else {
                    EntityCacheUtil.putResult(VacancyModelImpl.ENTITY_CACHE_ENABLED,
                        VacancyImpl.class, primaryKey, _nullVacancy);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(VacancyModelImpl.ENTITY_CACHE_ENABLED,
                    VacancyImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return vacancy;
    }

    /**
     * Returns the vacancy with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param v_id the primary key of the vacancy
     * @return the vacancy, or <code>null</code> if a vacancy with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Vacancy fetchByPrimaryKey(long v_id) throws SystemException {
        return fetchByPrimaryKey((Serializable) v_id);
    }

    /**
     * Returns all the vacancies.
     *
     * @return the vacancies
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Vacancy> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
    @Override
    public List<Vacancy> findAll(int start, int end) throws SystemException {
        return findAll(start, end, null);
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
    @Override
    public List<Vacancy> findAll(int start, int end,
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

        List<Vacancy> list = (List<Vacancy>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_VACANCY);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_VACANCY;

                if (pagination) {
                    sql = sql.concat(VacancyModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<Vacancy>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<Vacancy>(list);
                } else {
                    list = (List<Vacancy>) QueryUtil.list(q, getDialect(),
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
     * Removes all the vacancies from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (Vacancy vacancy : findAll()) {
            remove(vacancy);
        }
    }

    /**
     * Returns the number of vacancies.
     *
     * @return the number of vacancies
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

                Query q = session.createQuery(_SQL_COUNT_VACANCY);

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
     * Returns all the candidates associated with the vacancy.
     *
     * @param pk the primary key of the vacancy
     * @return the candidates associated with the vacancy
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<vn.com.ecopharma.hrm.model.Candidate> getCandidates(long pk)
        throws SystemException {
        return getCandidates(pk, QueryUtil.ALL_POS, QueryUtil.ALL_POS);
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
    @Override
    public List<vn.com.ecopharma.hrm.model.Candidate> getCandidates(long pk,
        int start, int end) throws SystemException {
        return getCandidates(pk, start, end, null);
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
    @Override
    public List<vn.com.ecopharma.hrm.model.Candidate> getCandidates(long pk,
        int start, int end, OrderByComparator orderByComparator)
        throws SystemException {
        return vacancyToCandidateTableMapper.getRightBaseModels(pk, start, end,
            orderByComparator);
    }

    /**
     * Returns the number of candidates associated with the vacancy.
     *
     * @param pk the primary key of the vacancy
     * @return the number of candidates associated with the vacancy
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int getCandidatesSize(long pk) throws SystemException {
        long[] pks = vacancyToCandidateTableMapper.getRightPrimaryKeys(pk);

        return pks.length;
    }

    /**
     * Returns <code>true</code> if the candidate is associated with the vacancy.
     *
     * @param pk the primary key of the vacancy
     * @param candidatePK the primary key of the candidate
     * @return <code>true</code> if the candidate is associated with the vacancy; <code>false</code> otherwise
     * @throws SystemException if a system exception occurred
     */
    @Override
    public boolean containsCandidate(long pk, long candidatePK)
        throws SystemException {
        return vacancyToCandidateTableMapper.containsTableMapping(pk,
            candidatePK);
    }

    /**
     * Returns <code>true</code> if the vacancy has any candidates associated with it.
     *
     * @param pk the primary key of the vacancy to check for associations with candidates
     * @return <code>true</code> if the vacancy has any candidates associated with it; <code>false</code> otherwise
     * @throws SystemException if a system exception occurred
     */
    @Override
    public boolean containsCandidates(long pk) throws SystemException {
        if (getCandidatesSize(pk) > 0) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Adds an association between the vacancy and the candidate. Also notifies the appropriate model listeners and clears the mapping table finder cache.
     *
     * @param pk the primary key of the vacancy
     * @param candidatePK the primary key of the candidate
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void addCandidate(long pk, long candidatePK)
        throws SystemException {
        vacancyToCandidateTableMapper.addTableMapping(pk, candidatePK);
    }

    /**
     * Adds an association between the vacancy and the candidate. Also notifies the appropriate model listeners and clears the mapping table finder cache.
     *
     * @param pk the primary key of the vacancy
     * @param candidate the candidate
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void addCandidate(long pk,
        vn.com.ecopharma.hrm.model.Candidate candidate)
        throws SystemException {
        vacancyToCandidateTableMapper.addTableMapping(pk,
            candidate.getPrimaryKey());
    }

    /**
     * Adds an association between the vacancy and the candidates. Also notifies the appropriate model listeners and clears the mapping table finder cache.
     *
     * @param pk the primary key of the vacancy
     * @param candidatePKs the primary keys of the candidates
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void addCandidates(long pk, long[] candidatePKs)
        throws SystemException {
        for (long candidatePK : candidatePKs) {
            vacancyToCandidateTableMapper.addTableMapping(pk, candidatePK);
        }
    }

    /**
     * Adds an association between the vacancy and the candidates. Also notifies the appropriate model listeners and clears the mapping table finder cache.
     *
     * @param pk the primary key of the vacancy
     * @param candidates the candidates
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void addCandidates(long pk,
        List<vn.com.ecopharma.hrm.model.Candidate> candidates)
        throws SystemException {
        for (vn.com.ecopharma.hrm.model.Candidate candidate : candidates) {
            vacancyToCandidateTableMapper.addTableMapping(pk,
                candidate.getPrimaryKey());
        }
    }

    /**
     * Clears all associations between the vacancy and its candidates. Also notifies the appropriate model listeners and clears the mapping table finder cache.
     *
     * @param pk the primary key of the vacancy to clear the associated candidates from
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void clearCandidates(long pk) throws SystemException {
        vacancyToCandidateTableMapper.deleteLeftPrimaryKeyTableMappings(pk);
    }

    /**
     * Removes the association between the vacancy and the candidate. Also notifies the appropriate model listeners and clears the mapping table finder cache.
     *
     * @param pk the primary key of the vacancy
     * @param candidatePK the primary key of the candidate
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeCandidate(long pk, long candidatePK)
        throws SystemException {
        vacancyToCandidateTableMapper.deleteTableMapping(pk, candidatePK);
    }

    /**
     * Removes the association between the vacancy and the candidate. Also notifies the appropriate model listeners and clears the mapping table finder cache.
     *
     * @param pk the primary key of the vacancy
     * @param candidate the candidate
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeCandidate(long pk,
        vn.com.ecopharma.hrm.model.Candidate candidate)
        throws SystemException {
        vacancyToCandidateTableMapper.deleteTableMapping(pk,
            candidate.getPrimaryKey());
    }

    /**
     * Removes the association between the vacancy and the candidates. Also notifies the appropriate model listeners and clears the mapping table finder cache.
     *
     * @param pk the primary key of the vacancy
     * @param candidatePKs the primary keys of the candidates
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeCandidates(long pk, long[] candidatePKs)
        throws SystemException {
        for (long candidatePK : candidatePKs) {
            vacancyToCandidateTableMapper.deleteTableMapping(pk, candidatePK);
        }
    }

    /**
     * Removes the association between the vacancy and the candidates. Also notifies the appropriate model listeners and clears the mapping table finder cache.
     *
     * @param pk the primary key of the vacancy
     * @param candidates the candidates
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeCandidates(long pk,
        List<vn.com.ecopharma.hrm.model.Candidate> candidates)
        throws SystemException {
        for (vn.com.ecopharma.hrm.model.Candidate candidate : candidates) {
            vacancyToCandidateTableMapper.deleteTableMapping(pk,
                candidate.getPrimaryKey());
        }
    }

    /**
     * Sets the candidates associated with the vacancy, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
     *
     * @param pk the primary key of the vacancy
     * @param candidatePKs the primary keys of the candidates to be associated with the vacancy
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void setCandidates(long pk, long[] candidatePKs)
        throws SystemException {
        Set<Long> newCandidatePKsSet = SetUtil.fromArray(candidatePKs);
        Set<Long> oldCandidatePKsSet = SetUtil.fromArray(vacancyToCandidateTableMapper.getRightPrimaryKeys(
                    pk));

        Set<Long> removeCandidatePKsSet = new HashSet<Long>(oldCandidatePKsSet);

        removeCandidatePKsSet.removeAll(newCandidatePKsSet);

        for (long removeCandidatePK : removeCandidatePKsSet) {
            vacancyToCandidateTableMapper.deleteTableMapping(pk,
                removeCandidatePK);
        }

        newCandidatePKsSet.removeAll(oldCandidatePKsSet);

        for (long newCandidatePK : newCandidatePKsSet) {
            vacancyToCandidateTableMapper.addTableMapping(pk, newCandidatePK);
        }
    }

    /**
     * Sets the candidates associated with the vacancy, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
     *
     * @param pk the primary key of the vacancy
     * @param candidates the candidates to be associated with the vacancy
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void setCandidates(long pk,
        List<vn.com.ecopharma.hrm.model.Candidate> candidates)
        throws SystemException {
        try {
            long[] candidatePKs = new long[candidates.size()];

            for (int i = 0; i < candidates.size(); i++) {
                vn.com.ecopharma.hrm.model.Candidate candidate = candidates.get(i);

                candidatePKs[i] = candidate.getPrimaryKey();
            }

            setCandidates(pk, candidatePKs);
        } catch (Exception e) {
            throw processException(e);
        } finally {
            FinderCacheUtil.clearCache(VacancyModelImpl.MAPPING_TABLE_HRM_VACANCIES_CANDIDATES_NAME);
        }
    }

    /**
     * Initializes the vacancy persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.vn.com.ecopharma.hrm.model.Vacancy")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<Vacancy>> listenersList = new ArrayList<ModelListener<Vacancy>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<Vacancy>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }

        vacancyToCandidateTableMapper = TableMapperFactory.getTableMapper("HRM_Vacancies_Candidates",
                "v_id", "c_id", this, candidatePersistence);
    }

    public void destroy() {
        EntityCacheUtil.removeCache(VacancyImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
