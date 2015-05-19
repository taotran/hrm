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

import vn.com.ecopharma.hrm.NoSuchJTitleException;
import vn.com.ecopharma.hrm.model.JTitle;
import vn.com.ecopharma.hrm.model.impl.JTitleImpl;
import vn.com.ecopharma.hrm.model.impl.JTitleModelImpl;
import vn.com.ecopharma.hrm.service.persistence.JTitlePersistence;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the j title service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author tvt
 * @see JTitlePersistence
 * @see JTitleUtil
 * @generated
 */
public class JTitlePersistenceImpl extends BasePersistenceImpl<JTitle>
    implements JTitlePersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link JTitleUtil} to access the j title persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = JTitleImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(JTitleModelImpl.ENTITY_CACHE_ENABLED,
            JTitleModelImpl.FINDER_CACHE_ENABLED, JTitleImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(JTitleModelImpl.ENTITY_CACHE_ENABLED,
            JTitleModelImpl.FINDER_CACHE_ENABLED, JTitleImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(JTitleModelImpl.ENTITY_CACHE_ENABLED,
            JTitleModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    private static final String _SQL_SELECT_JTITLE = "SELECT jTitle FROM JTitle jTitle";
    private static final String _SQL_COUNT_JTITLE = "SELECT COUNT(jTitle) FROM JTitle jTitle";
    private static final String _ORDER_BY_ENTITY_ALIAS = "jTitle.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No JTitle exists with the primary key ";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(JTitlePersistenceImpl.class);
    private static JTitle _nullJTitle = new JTitleImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<JTitle> toCacheModel() {
                return _nullJTitleCacheModel;
            }
        };

    private static CacheModel<JTitle> _nullJTitleCacheModel = new CacheModel<JTitle>() {
            @Override
            public JTitle toEntityModel() {
                return _nullJTitle;
            }
        };

    public JTitlePersistenceImpl() {
        setModelClass(JTitle.class);
    }

    /**
     * Caches the j title in the entity cache if it is enabled.
     *
     * @param jTitle the j title
     */
    @Override
    public void cacheResult(JTitle jTitle) {
        EntityCacheUtil.putResult(JTitleModelImpl.ENTITY_CACHE_ENABLED,
            JTitleImpl.class, jTitle.getPrimaryKey(), jTitle);

        jTitle.resetOriginalValues();
    }

    /**
     * Caches the j titles in the entity cache if it is enabled.
     *
     * @param jTitles the j titles
     */
    @Override
    public void cacheResult(List<JTitle> jTitles) {
        for (JTitle jTitle : jTitles) {
            if (EntityCacheUtil.getResult(
                        JTitleModelImpl.ENTITY_CACHE_ENABLED, JTitleImpl.class,
                        jTitle.getPrimaryKey()) == null) {
                cacheResult(jTitle);
            } else {
                jTitle.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all j titles.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(JTitleImpl.class.getName());
        }

        EntityCacheUtil.clearCache(JTitleImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the j title.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(JTitle jTitle) {
        EntityCacheUtil.removeResult(JTitleModelImpl.ENTITY_CACHE_ENABLED,
            JTitleImpl.class, jTitle.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    @Override
    public void clearCache(List<JTitle> jTitles) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (JTitle jTitle : jTitles) {
            EntityCacheUtil.removeResult(JTitleModelImpl.ENTITY_CACHE_ENABLED,
                JTitleImpl.class, jTitle.getPrimaryKey());
        }
    }

    /**
     * Creates a new j title with the primary key. Does not add the j title to the database.
     *
     * @param jobtitleId the primary key for the new j title
     * @return the new j title
     */
    @Override
    public JTitle create(long jobtitleId) {
        JTitle jTitle = new JTitleImpl();

        jTitle.setNew(true);
        jTitle.setPrimaryKey(jobtitleId);

        return jTitle;
    }

    /**
     * Removes the j title with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param jobtitleId the primary key of the j title
     * @return the j title that was removed
     * @throws vn.com.ecopharma.hrm.NoSuchJTitleException if a j title with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public JTitle remove(long jobtitleId)
        throws NoSuchJTitleException, SystemException {
        return remove((Serializable) jobtitleId);
    }

    /**
     * Removes the j title with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the j title
     * @return the j title that was removed
     * @throws vn.com.ecopharma.hrm.NoSuchJTitleException if a j title with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public JTitle remove(Serializable primaryKey)
        throws NoSuchJTitleException, SystemException {
        Session session = null;

        try {
            session = openSession();

            JTitle jTitle = (JTitle) session.get(JTitleImpl.class, primaryKey);

            if (jTitle == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchJTitleException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(jTitle);
        } catch (NoSuchJTitleException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected JTitle removeImpl(JTitle jTitle) throws SystemException {
        jTitle = toUnwrappedModel(jTitle);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(jTitle)) {
                jTitle = (JTitle) session.get(JTitleImpl.class,
                        jTitle.getPrimaryKeyObj());
            }

            if (jTitle != null) {
                session.delete(jTitle);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (jTitle != null) {
            clearCache(jTitle);
        }

        return jTitle;
    }

    @Override
    public JTitle updateImpl(vn.com.ecopharma.hrm.model.JTitle jTitle)
        throws SystemException {
        jTitle = toUnwrappedModel(jTitle);

        boolean isNew = jTitle.isNew();

        Session session = null;

        try {
            session = openSession();

            if (jTitle.isNew()) {
                session.save(jTitle);

                jTitle.setNew(false);
            } else {
                session.merge(jTitle);
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

        EntityCacheUtil.putResult(JTitleModelImpl.ENTITY_CACHE_ENABLED,
            JTitleImpl.class, jTitle.getPrimaryKey(), jTitle);

        return jTitle;
    }

    protected JTitle toUnwrappedModel(JTitle jTitle) {
        if (jTitle instanceof JTitleImpl) {
            return jTitle;
        }

        JTitleImpl jTitleImpl = new JTitleImpl();

        jTitleImpl.setNew(jTitle.isNew());
        jTitleImpl.setPrimaryKey(jTitle.getPrimaryKey());

        jTitleImpl.setJobtitleId(jTitle.getJobtitleId());
        jTitleImpl.setTitle(jTitle.getTitle());
        jTitleImpl.setDescription(jTitle.getDescription());
        jTitleImpl.setNote(jTitle.getNote());
        jTitleImpl.setIsDeleted(jTitle.isIsDeleted());
        jTitleImpl.setUser_id(jTitle.getUser_id());
        jTitleImpl.setGroup_id(jTitle.getGroup_id());

        return jTitleImpl;
    }

    /**
     * Returns the j title with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the j title
     * @return the j title
     * @throws vn.com.ecopharma.hrm.NoSuchJTitleException if a j title with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public JTitle findByPrimaryKey(Serializable primaryKey)
        throws NoSuchJTitleException, SystemException {
        JTitle jTitle = fetchByPrimaryKey(primaryKey);

        if (jTitle == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchJTitleException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return jTitle;
    }

    /**
     * Returns the j title with the primary key or throws a {@link vn.com.ecopharma.hrm.NoSuchJTitleException} if it could not be found.
     *
     * @param jobtitleId the primary key of the j title
     * @return the j title
     * @throws vn.com.ecopharma.hrm.NoSuchJTitleException if a j title with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public JTitle findByPrimaryKey(long jobtitleId)
        throws NoSuchJTitleException, SystemException {
        return findByPrimaryKey((Serializable) jobtitleId);
    }

    /**
     * Returns the j title with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the j title
     * @return the j title, or <code>null</code> if a j title with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public JTitle fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        JTitle jTitle = (JTitle) EntityCacheUtil.getResult(JTitleModelImpl.ENTITY_CACHE_ENABLED,
                JTitleImpl.class, primaryKey);

        if (jTitle == _nullJTitle) {
            return null;
        }

        if (jTitle == null) {
            Session session = null;

            try {
                session = openSession();

                jTitle = (JTitle) session.get(JTitleImpl.class, primaryKey);

                if (jTitle != null) {
                    cacheResult(jTitle);
                } else {
                    EntityCacheUtil.putResult(JTitleModelImpl.ENTITY_CACHE_ENABLED,
                        JTitleImpl.class, primaryKey, _nullJTitle);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(JTitleModelImpl.ENTITY_CACHE_ENABLED,
                    JTitleImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return jTitle;
    }

    /**
     * Returns the j title with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param jobtitleId the primary key of the j title
     * @return the j title, or <code>null</code> if a j title with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public JTitle fetchByPrimaryKey(long jobtitleId) throws SystemException {
        return fetchByPrimaryKey((Serializable) jobtitleId);
    }

    /**
     * Returns all the j titles.
     *
     * @return the j titles
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<JTitle> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the j titles.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.com.ecopharma.hrm.model.impl.JTitleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of j titles
     * @param end the upper bound of the range of j titles (not inclusive)
     * @return the range of j titles
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<JTitle> findAll(int start, int end) throws SystemException {
        return findAll(start, end, null);
    }

    /**
     * Returns an ordered range of all the j titles.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.com.ecopharma.hrm.model.impl.JTitleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of j titles
     * @param end the upper bound of the range of j titles (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of j titles
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<JTitle> findAll(int start, int end,
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

        List<JTitle> list = (List<JTitle>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_JTITLE);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_JTITLE;

                if (pagination) {
                    sql = sql.concat(JTitleModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<JTitle>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<JTitle>(list);
                } else {
                    list = (List<JTitle>) QueryUtil.list(q, getDialect(),
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
     * Removes all the j titles from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (JTitle jTitle : findAll()) {
            remove(jTitle);
        }
    }

    /**
     * Returns the number of j titles.
     *
     * @return the number of j titles
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

                Query q = session.createQuery(_SQL_COUNT_JTITLE);

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
     * Initializes the j title persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.vn.com.ecopharma.hrm.model.JTitle")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<JTitle>> listenersList = new ArrayList<ModelListener<JTitle>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<JTitle>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(JTitleImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
