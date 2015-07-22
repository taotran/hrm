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
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.UnmodifiableList;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import vn.com.ecopharma.hrm.NoSuchLevelException;
import vn.com.ecopharma.hrm.model.Level;
import vn.com.ecopharma.hrm.model.impl.LevelImpl;
import vn.com.ecopharma.hrm.model.impl.LevelModelImpl;
import vn.com.ecopharma.hrm.service.persistence.LevelPersistence;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the level service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author tvt
 * @see LevelPersistence
 * @see LevelUtil
 * @generated
 */
public class LevelPersistenceImpl extends BasePersistenceImpl<Level>
    implements LevelPersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link LevelUtil} to access the level persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = LevelImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(LevelModelImpl.ENTITY_CACHE_ENABLED,
            LevelModelImpl.FINDER_CACHE_ENABLED, LevelImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(LevelModelImpl.ENTITY_CACHE_ENABLED,
            LevelModelImpl.FINDER_CACHE_ENABLED, LevelImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(LevelModelImpl.ENTITY_CACHE_ENABLED,
            LevelModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    private static final String _SQL_SELECT_LEVEL = "SELECT level FROM Level level";
    private static final String _SQL_COUNT_LEVEL = "SELECT COUNT(level) FROM Level level";
    private static final String _ORDER_BY_ENTITY_ALIAS = "level.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Level exists with the primary key ";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(LevelPersistenceImpl.class);
    private static Level _nullLevel = new LevelImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<Level> toCacheModel() {
                return _nullLevelCacheModel;
            }
        };

    private static CacheModel<Level> _nullLevelCacheModel = new CacheModel<Level>() {
            @Override
            public Level toEntityModel() {
                return _nullLevel;
            }
        };

    public LevelPersistenceImpl() {
        setModelClass(Level.class);
    }

    /**
     * Caches the level in the entity cache if it is enabled.
     *
     * @param level the level
     */
    @Override
    public void cacheResult(Level level) {
        EntityCacheUtil.putResult(LevelModelImpl.ENTITY_CACHE_ENABLED,
            LevelImpl.class, level.getPrimaryKey(), level);

        level.resetOriginalValues();
    }

    /**
     * Caches the levels in the entity cache if it is enabled.
     *
     * @param levels the levels
     */
    @Override
    public void cacheResult(List<Level> levels) {
        for (Level level : levels) {
            if (EntityCacheUtil.getResult(LevelModelImpl.ENTITY_CACHE_ENABLED,
                        LevelImpl.class, level.getPrimaryKey()) == null) {
                cacheResult(level);
            } else {
                level.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all levels.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(LevelImpl.class.getName());
        }

        EntityCacheUtil.clearCache(LevelImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the level.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(Level level) {
        EntityCacheUtil.removeResult(LevelModelImpl.ENTITY_CACHE_ENABLED,
            LevelImpl.class, level.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    @Override
    public void clearCache(List<Level> levels) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (Level level : levels) {
            EntityCacheUtil.removeResult(LevelModelImpl.ENTITY_CACHE_ENABLED,
                LevelImpl.class, level.getPrimaryKey());
        }
    }

    /**
     * Creates a new level with the primary key. Does not add the level to the database.
     *
     * @param levelId the primary key for the new level
     * @return the new level
     */
    @Override
    public Level create(long levelId) {
        Level level = new LevelImpl();

        level.setNew(true);
        level.setPrimaryKey(levelId);

        return level;
    }

    /**
     * Removes the level with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param levelId the primary key of the level
     * @return the level that was removed
     * @throws vn.com.ecopharma.hrm.NoSuchLevelException if a level with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Level remove(long levelId)
        throws NoSuchLevelException, SystemException {
        return remove((Serializable) levelId);
    }

    /**
     * Removes the level with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the level
     * @return the level that was removed
     * @throws vn.com.ecopharma.hrm.NoSuchLevelException if a level with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Level remove(Serializable primaryKey)
        throws NoSuchLevelException, SystemException {
        Session session = null;

        try {
            session = openSession();

            Level level = (Level) session.get(LevelImpl.class, primaryKey);

            if (level == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchLevelException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(level);
        } catch (NoSuchLevelException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected Level removeImpl(Level level) throws SystemException {
        level = toUnwrappedModel(level);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(level)) {
                level = (Level) session.get(LevelImpl.class,
                        level.getPrimaryKeyObj());
            }

            if (level != null) {
                session.delete(level);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (level != null) {
            clearCache(level);
        }

        return level;
    }

    @Override
    public Level updateImpl(vn.com.ecopharma.hrm.model.Level level)
        throws SystemException {
        level = toUnwrappedModel(level);

        boolean isNew = level.isNew();

        Session session = null;

        try {
            session = openSession();

            if (level.isNew()) {
                session.save(level);

                level.setNew(false);
            } else {
                session.merge(level);
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

        EntityCacheUtil.putResult(LevelModelImpl.ENTITY_CACHE_ENABLED,
            LevelImpl.class, level.getPrimaryKey(), level);

        return level;
    }

    protected Level toUnwrappedModel(Level level) {
        if (level instanceof LevelImpl) {
            return level;
        }

        LevelImpl levelImpl = new LevelImpl();

        levelImpl.setNew(level.isNew());
        levelImpl.setPrimaryKey(level.getPrimaryKey());

        levelImpl.setLevelId(level.getLevelId());
        levelImpl.setName(level.getName());
        levelImpl.setGroupId(level.getGroupId());
        levelImpl.setCompanyId(level.getCompanyId());
        levelImpl.setUserId(level.getUserId());
        levelImpl.setCreateDate(level.getCreateDate());
        levelImpl.setModifiedDate(level.getModifiedDate());

        return levelImpl;
    }

    /**
     * Returns the level with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the level
     * @return the level
     * @throws vn.com.ecopharma.hrm.NoSuchLevelException if a level with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Level findByPrimaryKey(Serializable primaryKey)
        throws NoSuchLevelException, SystemException {
        Level level = fetchByPrimaryKey(primaryKey);

        if (level == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchLevelException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return level;
    }

    /**
     * Returns the level with the primary key or throws a {@link vn.com.ecopharma.hrm.NoSuchLevelException} if it could not be found.
     *
     * @param levelId the primary key of the level
     * @return the level
     * @throws vn.com.ecopharma.hrm.NoSuchLevelException if a level with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Level findByPrimaryKey(long levelId)
        throws NoSuchLevelException, SystemException {
        return findByPrimaryKey((Serializable) levelId);
    }

    /**
     * Returns the level with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the level
     * @return the level, or <code>null</code> if a level with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Level fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        Level level = (Level) EntityCacheUtil.getResult(LevelModelImpl.ENTITY_CACHE_ENABLED,
                LevelImpl.class, primaryKey);

        if (level == _nullLevel) {
            return null;
        }

        if (level == null) {
            Session session = null;

            try {
                session = openSession();

                level = (Level) session.get(LevelImpl.class, primaryKey);

                if (level != null) {
                    cacheResult(level);
                } else {
                    EntityCacheUtil.putResult(LevelModelImpl.ENTITY_CACHE_ENABLED,
                        LevelImpl.class, primaryKey, _nullLevel);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(LevelModelImpl.ENTITY_CACHE_ENABLED,
                    LevelImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return level;
    }

    /**
     * Returns the level with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param levelId the primary key of the level
     * @return the level, or <code>null</code> if a level with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Level fetchByPrimaryKey(long levelId) throws SystemException {
        return fetchByPrimaryKey((Serializable) levelId);
    }

    /**
     * Returns all the levels.
     *
     * @return the levels
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Level> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the levels.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.com.ecopharma.hrm.model.impl.LevelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of levels
     * @param end the upper bound of the range of levels (not inclusive)
     * @return the range of levels
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Level> findAll(int start, int end) throws SystemException {
        return findAll(start, end, null);
    }

    /**
     * Returns an ordered range of all the levels.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.com.ecopharma.hrm.model.impl.LevelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of levels
     * @param end the upper bound of the range of levels (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of levels
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Level> findAll(int start, int end,
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

        List<Level> list = (List<Level>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_LEVEL);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_LEVEL;

                if (pagination) {
                    sql = sql.concat(LevelModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<Level>) QueryUtil.list(q, getDialect(), start,
                            end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<Level>(list);
                } else {
                    list = (List<Level>) QueryUtil.list(q, getDialect(), start,
                            end);
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
     * Removes all the levels from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (Level level : findAll()) {
            remove(level);
        }
    }

    /**
     * Returns the number of levels.
     *
     * @return the number of levels
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

                Query q = session.createQuery(_SQL_COUNT_LEVEL);

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
     * Initializes the level persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.vn.com.ecopharma.hrm.model.Level")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<Level>> listenersList = new ArrayList<ModelListener<Level>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<Level>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(LevelImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
