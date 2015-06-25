package vn.com.ecopharma.hrm.service.persistence;

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

import vn.com.ecopharma.hrm.NoSuchUniversityException;
import vn.com.ecopharma.hrm.model.University;
import vn.com.ecopharma.hrm.model.impl.UniversityImpl;
import vn.com.ecopharma.hrm.model.impl.UniversityModelImpl;
import vn.com.ecopharma.hrm.service.persistence.UniversityPersistence;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the university service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author tvt
 * @see UniversityPersistence
 * @see UniversityUtil
 * @generated
 */
public class UniversityPersistenceImpl extends BasePersistenceImpl<University>
    implements UniversityPersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link UniversityUtil} to access the university persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = UniversityImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(UniversityModelImpl.ENTITY_CACHE_ENABLED,
            UniversityModelImpl.FINDER_CACHE_ENABLED, UniversityImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(UniversityModelImpl.ENTITY_CACHE_ENABLED,
            UniversityModelImpl.FINDER_CACHE_ENABLED, UniversityImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(UniversityModelImpl.ENTITY_CACHE_ENABLED,
            UniversityModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    private static final String _SQL_SELECT_UNIVERSITY = "SELECT university FROM University university";
    private static final String _SQL_COUNT_UNIVERSITY = "SELECT COUNT(university) FROM University university";
    private static final String _ORDER_BY_ENTITY_ALIAS = "university.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No University exists with the primary key ";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(UniversityPersistenceImpl.class);
    private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
                "code"
            });
    private static University _nullUniversity = new UniversityImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<University> toCacheModel() {
                return _nullUniversityCacheModel;
            }
        };

    private static CacheModel<University> _nullUniversityCacheModel = new CacheModel<University>() {
            @Override
            public University toEntityModel() {
                return _nullUniversity;
            }
        };

    public UniversityPersistenceImpl() {
        setModelClass(University.class);
    }

    /**
     * Caches the university in the entity cache if it is enabled.
     *
     * @param university the university
     */
    @Override
    public void cacheResult(University university) {
        EntityCacheUtil.putResult(UniversityModelImpl.ENTITY_CACHE_ENABLED,
            UniversityImpl.class, university.getPrimaryKey(), university);

        university.resetOriginalValues();
    }

    /**
     * Caches the universities in the entity cache if it is enabled.
     *
     * @param universities the universities
     */
    @Override
    public void cacheResult(List<University> universities) {
        for (University university : universities) {
            if (EntityCacheUtil.getResult(
                        UniversityModelImpl.ENTITY_CACHE_ENABLED,
                        UniversityImpl.class, university.getPrimaryKey()) == null) {
                cacheResult(university);
            } else {
                university.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all universities.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(UniversityImpl.class.getName());
        }

        EntityCacheUtil.clearCache(UniversityImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the university.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(University university) {
        EntityCacheUtil.removeResult(UniversityModelImpl.ENTITY_CACHE_ENABLED,
            UniversityImpl.class, university.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    @Override
    public void clearCache(List<University> universities) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (University university : universities) {
            EntityCacheUtil.removeResult(UniversityModelImpl.ENTITY_CACHE_ENABLED,
                UniversityImpl.class, university.getPrimaryKey());
        }
    }

    /**
     * Creates a new university with the primary key. Does not add the university to the database.
     *
     * @param universityId the primary key for the new university
     * @return the new university
     */
    @Override
    public University create(long universityId) {
        University university = new UniversityImpl();

        university.setNew(true);
        university.setPrimaryKey(universityId);

        return university;
    }

    /**
     * Removes the university with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param universityId the primary key of the university
     * @return the university that was removed
     * @throws vn.com.ecopharma.hrm.NoSuchUniversityException if a university with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public University remove(long universityId)
        throws NoSuchUniversityException, SystemException {
        return remove((Serializable) universityId);
    }

    /**
     * Removes the university with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the university
     * @return the university that was removed
     * @throws vn.com.ecopharma.hrm.NoSuchUniversityException if a university with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public University remove(Serializable primaryKey)
        throws NoSuchUniversityException, SystemException {
        Session session = null;

        try {
            session = openSession();

            University university = (University) session.get(UniversityImpl.class,
                    primaryKey);

            if (university == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchUniversityException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(university);
        } catch (NoSuchUniversityException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected University removeImpl(University university)
        throws SystemException {
        university = toUnwrappedModel(university);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(university)) {
                university = (University) session.get(UniversityImpl.class,
                        university.getPrimaryKeyObj());
            }

            if (university != null) {
                session.delete(university);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (university != null) {
            clearCache(university);
        }

        return university;
    }

    @Override
    public University updateImpl(
        vn.com.ecopharma.hrm.model.University university)
        throws SystemException {
        university = toUnwrappedModel(university);

        boolean isNew = university.isNew();

        Session session = null;

        try {
            session = openSession();

            if (university.isNew()) {
                session.save(university);

                university.setNew(false);
            } else {
                session.merge(university);
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

        EntityCacheUtil.putResult(UniversityModelImpl.ENTITY_CACHE_ENABLED,
            UniversityImpl.class, university.getPrimaryKey(), university);

        return university;
    }

    protected University toUnwrappedModel(University university) {
        if (university instanceof UniversityImpl) {
            return university;
        }

        UniversityImpl universityImpl = new UniversityImpl();

        universityImpl.setNew(university.isNew());
        universityImpl.setPrimaryKey(university.getPrimaryKey());

        universityImpl.setUniversityId(university.getUniversityId());
        universityImpl.setName(university.getName());
        universityImpl.setCode(university.getCode());
        universityImpl.setTel_fax(university.getTel_fax());
        universityImpl.setGroupId(university.getGroupId());
        universityImpl.setCompanyId(university.getCompanyId());
        universityImpl.setUserId(university.getUserId());
        universityImpl.setCreateDate(university.getCreateDate());
        universityImpl.setModifiedDate(university.getModifiedDate());

        return universityImpl;
    }

    /**
     * Returns the university with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the university
     * @return the university
     * @throws vn.com.ecopharma.hrm.NoSuchUniversityException if a university with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public University findByPrimaryKey(Serializable primaryKey)
        throws NoSuchUniversityException, SystemException {
        University university = fetchByPrimaryKey(primaryKey);

        if (university == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchUniversityException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return university;
    }

    /**
     * Returns the university with the primary key or throws a {@link vn.com.ecopharma.hrm.NoSuchUniversityException} if it could not be found.
     *
     * @param universityId the primary key of the university
     * @return the university
     * @throws vn.com.ecopharma.hrm.NoSuchUniversityException if a university with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public University findByPrimaryKey(long universityId)
        throws NoSuchUniversityException, SystemException {
        return findByPrimaryKey((Serializable) universityId);
    }

    /**
     * Returns the university with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the university
     * @return the university, or <code>null</code> if a university with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public University fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        University university = (University) EntityCacheUtil.getResult(UniversityModelImpl.ENTITY_CACHE_ENABLED,
                UniversityImpl.class, primaryKey);

        if (university == _nullUniversity) {
            return null;
        }

        if (university == null) {
            Session session = null;

            try {
                session = openSession();

                university = (University) session.get(UniversityImpl.class,
                        primaryKey);

                if (university != null) {
                    cacheResult(university);
                } else {
                    EntityCacheUtil.putResult(UniversityModelImpl.ENTITY_CACHE_ENABLED,
                        UniversityImpl.class, primaryKey, _nullUniversity);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(UniversityModelImpl.ENTITY_CACHE_ENABLED,
                    UniversityImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return university;
    }

    /**
     * Returns the university with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param universityId the primary key of the university
     * @return the university, or <code>null</code> if a university with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public University fetchByPrimaryKey(long universityId)
        throws SystemException {
        return fetchByPrimaryKey((Serializable) universityId);
    }

    /**
     * Returns all the universities.
     *
     * @return the universities
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<University> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the universities.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.com.ecopharma.hrm.model.impl.UniversityModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of universities
     * @param end the upper bound of the range of universities (not inclusive)
     * @return the range of universities
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<University> findAll(int start, int end)
        throws SystemException {
        return findAll(start, end, null);
    }

    /**
     * Returns an ordered range of all the universities.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.com.ecopharma.hrm.model.impl.UniversityModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of universities
     * @param end the upper bound of the range of universities (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of universities
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<University> findAll(int start, int end,
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

        List<University> list = (List<University>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_UNIVERSITY);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_UNIVERSITY;

                if (pagination) {
                    sql = sql.concat(UniversityModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<University>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<University>(list);
                } else {
                    list = (List<University>) QueryUtil.list(q, getDialect(),
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
     * Removes all the universities from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (University university : findAll()) {
            remove(university);
        }
    }

    /**
     * Returns the number of universities.
     *
     * @return the number of universities
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

                Query q = session.createQuery(_SQL_COUNT_UNIVERSITY);

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

    @Override
    protected Set<String> getBadColumnNames() {
        return _badColumnNames;
    }

    /**
     * Initializes the university persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.vn.com.ecopharma.hrm.model.University")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<University>> listenersList = new ArrayList<ModelListener<University>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<University>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(UniversityImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
