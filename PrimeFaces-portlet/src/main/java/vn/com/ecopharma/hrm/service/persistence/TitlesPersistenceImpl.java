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

import vn.com.ecopharma.hrm.NoSuchTitlesException;
import vn.com.ecopharma.hrm.model.Titles;
import vn.com.ecopharma.hrm.model.impl.TitlesImpl;
import vn.com.ecopharma.hrm.model.impl.TitlesModelImpl;
import vn.com.ecopharma.hrm.service.persistence.TitlesPersistence;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the titles service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author tvt
 * @see TitlesPersistence
 * @see TitlesUtil
 * @generated
 */
public class TitlesPersistenceImpl extends BasePersistenceImpl<Titles>
    implements TitlesPersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link TitlesUtil} to access the titles persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = TitlesImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(TitlesModelImpl.ENTITY_CACHE_ENABLED,
            TitlesModelImpl.FINDER_CACHE_ENABLED, TitlesImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(TitlesModelImpl.ENTITY_CACHE_ENABLED,
            TitlesModelImpl.FINDER_CACHE_ENABLED, TitlesImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(TitlesModelImpl.ENTITY_CACHE_ENABLED,
            TitlesModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    private static final String _SQL_SELECT_TITLES = "SELECT titles FROM Titles titles";
    private static final String _SQL_COUNT_TITLES = "SELECT COUNT(titles) FROM Titles titles";
    private static final String _ORDER_BY_ENTITY_ALIAS = "titles.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Titles exists with the primary key ";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(TitlesPersistenceImpl.class);
    private static Titles _nullTitles = new TitlesImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<Titles> toCacheModel() {
                return _nullTitlesCacheModel;
            }
        };

    private static CacheModel<Titles> _nullTitlesCacheModel = new CacheModel<Titles>() {
            @Override
            public Titles toEntityModel() {
                return _nullTitles;
            }
        };

    public TitlesPersistenceImpl() {
        setModelClass(Titles.class);
    }

    /**
     * Caches the titles in the entity cache if it is enabled.
     *
     * @param titles the titles
     */
    @Override
    public void cacheResult(Titles titles) {
        EntityCacheUtil.putResult(TitlesModelImpl.ENTITY_CACHE_ENABLED,
            TitlesImpl.class, titles.getPrimaryKey(), titles);

        titles.resetOriginalValues();
    }

    /**
     * Caches the titleses in the entity cache if it is enabled.
     *
     * @param titleses the titleses
     */
    @Override
    public void cacheResult(List<Titles> titleses) {
        for (Titles titles : titleses) {
            if (EntityCacheUtil.getResult(
                        TitlesModelImpl.ENTITY_CACHE_ENABLED, TitlesImpl.class,
                        titles.getPrimaryKey()) == null) {
                cacheResult(titles);
            } else {
                titles.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all titleses.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(TitlesImpl.class.getName());
        }

        EntityCacheUtil.clearCache(TitlesImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the titles.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(Titles titles) {
        EntityCacheUtil.removeResult(TitlesModelImpl.ENTITY_CACHE_ENABLED,
            TitlesImpl.class, titles.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    @Override
    public void clearCache(List<Titles> titleses) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (Titles titles : titleses) {
            EntityCacheUtil.removeResult(TitlesModelImpl.ENTITY_CACHE_ENABLED,
                TitlesImpl.class, titles.getPrimaryKey());
        }
    }

    /**
     * Creates a new titles with the primary key. Does not add the titles to the database.
     *
     * @param titlesId the primary key for the new titles
     * @return the new titles
     */
    @Override
    public Titles create(long titlesId) {
        Titles titles = new TitlesImpl();

        titles.setNew(true);
        titles.setPrimaryKey(titlesId);

        return titles;
    }

    /**
     * Removes the titles with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param titlesId the primary key of the titles
     * @return the titles that was removed
     * @throws vn.com.ecopharma.hrm.NoSuchTitlesException if a titles with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Titles remove(long titlesId)
        throws NoSuchTitlesException, SystemException {
        return remove((Serializable) titlesId);
    }

    /**
     * Removes the titles with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the titles
     * @return the titles that was removed
     * @throws vn.com.ecopharma.hrm.NoSuchTitlesException if a titles with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Titles remove(Serializable primaryKey)
        throws NoSuchTitlesException, SystemException {
        Session session = null;

        try {
            session = openSession();

            Titles titles = (Titles) session.get(TitlesImpl.class, primaryKey);

            if (titles == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchTitlesException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(titles);
        } catch (NoSuchTitlesException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected Titles removeImpl(Titles titles) throws SystemException {
        titles = toUnwrappedModel(titles);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(titles)) {
                titles = (Titles) session.get(TitlesImpl.class,
                        titles.getPrimaryKeyObj());
            }

            if (titles != null) {
                session.delete(titles);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (titles != null) {
            clearCache(titles);
        }

        return titles;
    }

    @Override
    public Titles updateImpl(vn.com.ecopharma.hrm.model.Titles titles)
        throws SystemException {
        titles = toUnwrappedModel(titles);

        boolean isNew = titles.isNew();

        Session session = null;

        try {
            session = openSession();

            if (titles.isNew()) {
                session.save(titles);

                titles.setNew(false);
            } else {
                session.merge(titles);
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

        EntityCacheUtil.putResult(TitlesModelImpl.ENTITY_CACHE_ENABLED,
            TitlesImpl.class, titles.getPrimaryKey(), titles);

        return titles;
    }

    protected Titles toUnwrappedModel(Titles titles) {
        if (titles instanceof TitlesImpl) {
            return titles;
        }

        TitlesImpl titlesImpl = new TitlesImpl();

        titlesImpl.setNew(titles.isNew());
        titlesImpl.setPrimaryKey(titles.getPrimaryKey());

        titlesImpl.setTitlesId(titles.getTitlesId());
        titlesImpl.setName(titles.getName());
        titlesImpl.setGroupId(titles.getGroupId());
        titlesImpl.setCompanyId(titles.getCompanyId());
        titlesImpl.setUserId(titles.getUserId());
        titlesImpl.setCreateDate(titles.getCreateDate());
        titlesImpl.setModifiedDate(titles.getModifiedDate());

        return titlesImpl;
    }

    /**
     * Returns the titles with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the titles
     * @return the titles
     * @throws vn.com.ecopharma.hrm.NoSuchTitlesException if a titles with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Titles findByPrimaryKey(Serializable primaryKey)
        throws NoSuchTitlesException, SystemException {
        Titles titles = fetchByPrimaryKey(primaryKey);

        if (titles == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchTitlesException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return titles;
    }

    /**
     * Returns the titles with the primary key or throws a {@link vn.com.ecopharma.hrm.NoSuchTitlesException} if it could not be found.
     *
     * @param titlesId the primary key of the titles
     * @return the titles
     * @throws vn.com.ecopharma.hrm.NoSuchTitlesException if a titles with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Titles findByPrimaryKey(long titlesId)
        throws NoSuchTitlesException, SystemException {
        return findByPrimaryKey((Serializable) titlesId);
    }

    /**
     * Returns the titles with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the titles
     * @return the titles, or <code>null</code> if a titles with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Titles fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        Titles titles = (Titles) EntityCacheUtil.getResult(TitlesModelImpl.ENTITY_CACHE_ENABLED,
                TitlesImpl.class, primaryKey);

        if (titles == _nullTitles) {
            return null;
        }

        if (titles == null) {
            Session session = null;

            try {
                session = openSession();

                titles = (Titles) session.get(TitlesImpl.class, primaryKey);

                if (titles != null) {
                    cacheResult(titles);
                } else {
                    EntityCacheUtil.putResult(TitlesModelImpl.ENTITY_CACHE_ENABLED,
                        TitlesImpl.class, primaryKey, _nullTitles);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(TitlesModelImpl.ENTITY_CACHE_ENABLED,
                    TitlesImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return titles;
    }

    /**
     * Returns the titles with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param titlesId the primary key of the titles
     * @return the titles, or <code>null</code> if a titles with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Titles fetchByPrimaryKey(long titlesId) throws SystemException {
        return fetchByPrimaryKey((Serializable) titlesId);
    }

    /**
     * Returns all the titleses.
     *
     * @return the titleses
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Titles> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the titleses.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.com.ecopharma.hrm.model.impl.TitlesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of titleses
     * @param end the upper bound of the range of titleses (not inclusive)
     * @return the range of titleses
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Titles> findAll(int start, int end) throws SystemException {
        return findAll(start, end, null);
    }

    /**
     * Returns an ordered range of all the titleses.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.com.ecopharma.hrm.model.impl.TitlesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of titleses
     * @param end the upper bound of the range of titleses (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of titleses
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Titles> findAll(int start, int end,
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

        List<Titles> list = (List<Titles>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_TITLES);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_TITLES;

                if (pagination) {
                    sql = sql.concat(TitlesModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<Titles>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<Titles>(list);
                } else {
                    list = (List<Titles>) QueryUtil.list(q, getDialect(),
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
     * Removes all the titleses from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (Titles titles : findAll()) {
            remove(titles);
        }
    }

    /**
     * Returns the number of titleses.
     *
     * @return the number of titleses
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

                Query q = session.createQuery(_SQL_COUNT_TITLES);

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
     * Initializes the titles persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.vn.com.ecopharma.hrm.model.Titles")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<Titles>> listenersList = new ArrayList<ModelListener<Titles>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<Titles>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(TitlesImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
