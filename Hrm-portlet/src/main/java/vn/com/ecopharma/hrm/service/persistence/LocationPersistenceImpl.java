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

import vn.com.ecopharma.hrm.NoSuchLocationException;
import vn.com.ecopharma.hrm.model.Location;
import vn.com.ecopharma.hrm.model.impl.LocationImpl;
import vn.com.ecopharma.hrm.model.impl.LocationModelImpl;
import vn.com.ecopharma.hrm.service.persistence.LocationPersistence;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the location service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author tvt
 * @see LocationPersistence
 * @see LocationUtil
 * @generated
 */
public class LocationPersistenceImpl extends BasePersistenceImpl<Location>
    implements LocationPersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link LocationUtil} to access the location persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = LocationImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(LocationModelImpl.ENTITY_CACHE_ENABLED,
            LocationModelImpl.FINDER_CACHE_ENABLED, LocationImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(LocationModelImpl.ENTITY_CACHE_ENABLED,
            LocationModelImpl.FINDER_CACHE_ENABLED, LocationImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(LocationModelImpl.ENTITY_CACHE_ENABLED,
            LocationModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    private static final String _SQL_SELECT_LOCATION = "SELECT location FROM Location location";
    private static final String _SQL_COUNT_LOCATION = "SELECT COUNT(location) FROM Location location";
    private static final String _ORDER_BY_ENTITY_ALIAS = "location.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Location exists with the primary key ";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(LocationPersistenceImpl.class);
    private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
                "type"
            });
    private static Location _nullLocation = new LocationImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<Location> toCacheModel() {
                return _nullLocationCacheModel;
            }
        };

    private static CacheModel<Location> _nullLocationCacheModel = new CacheModel<Location>() {
            @Override
            public Location toEntityModel() {
                return _nullLocation;
            }
        };

    public LocationPersistenceImpl() {
        setModelClass(Location.class);
    }

    /**
     * Caches the location in the entity cache if it is enabled.
     *
     * @param location the location
     */
    @Override
    public void cacheResult(Location location) {
        EntityCacheUtil.putResult(LocationModelImpl.ENTITY_CACHE_ENABLED,
            LocationImpl.class, location.getPrimaryKey(), location);

        location.resetOriginalValues();
    }

    /**
     * Caches the locations in the entity cache if it is enabled.
     *
     * @param locations the locations
     */
    @Override
    public void cacheResult(List<Location> locations) {
        for (Location location : locations) {
            if (EntityCacheUtil.getResult(
                        LocationModelImpl.ENTITY_CACHE_ENABLED,
                        LocationImpl.class, location.getPrimaryKey()) == null) {
                cacheResult(location);
            } else {
                location.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all locations.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(LocationImpl.class.getName());
        }

        EntityCacheUtil.clearCache(LocationImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the location.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(Location location) {
        EntityCacheUtil.removeResult(LocationModelImpl.ENTITY_CACHE_ENABLED,
            LocationImpl.class, location.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    @Override
    public void clearCache(List<Location> locations) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (Location location : locations) {
            EntityCacheUtil.removeResult(LocationModelImpl.ENTITY_CACHE_ENABLED,
                LocationImpl.class, location.getPrimaryKey());
        }
    }

    /**
     * Creates a new location with the primary key. Does not add the location to the database.
     *
     * @param locationId the primary key for the new location
     * @return the new location
     */
    @Override
    public Location create(long locationId) {
        Location location = new LocationImpl();

        location.setNew(true);
        location.setPrimaryKey(locationId);

        return location;
    }

    /**
     * Removes the location with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param locationId the primary key of the location
     * @return the location that was removed
     * @throws vn.com.ecopharma.hrm.NoSuchLocationException if a location with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Location remove(long locationId)
        throws NoSuchLocationException, SystemException {
        return remove((Serializable) locationId);
    }

    /**
     * Removes the location with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the location
     * @return the location that was removed
     * @throws vn.com.ecopharma.hrm.NoSuchLocationException if a location with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Location remove(Serializable primaryKey)
        throws NoSuchLocationException, SystemException {
        Session session = null;

        try {
            session = openSession();

            Location location = (Location) session.get(LocationImpl.class,
                    primaryKey);

            if (location == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchLocationException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(location);
        } catch (NoSuchLocationException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected Location removeImpl(Location location) throws SystemException {
        location = toUnwrappedModel(location);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(location)) {
                location = (Location) session.get(LocationImpl.class,
                        location.getPrimaryKeyObj());
            }

            if (location != null) {
                session.delete(location);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (location != null) {
            clearCache(location);
        }

        return location;
    }

    @Override
    public Location updateImpl(vn.com.ecopharma.hrm.model.Location location)
        throws SystemException {
        location = toUnwrappedModel(location);

        boolean isNew = location.isNew();

        Session session = null;

        try {
            session = openSession();

            if (location.isNew()) {
                session.save(location);

                location.setNew(false);
            } else {
                session.merge(location);
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

        EntityCacheUtil.putResult(LocationModelImpl.ENTITY_CACHE_ENABLED,
            LocationImpl.class, location.getPrimaryKey(), location);

        return location;
    }

    protected Location toUnwrappedModel(Location location) {
        if (location instanceof LocationImpl) {
            return location;
        }

        LocationImpl locationImpl = new LocationImpl();

        locationImpl.setNew(location.isNew());
        locationImpl.setPrimaryKey(location.getPrimaryKey());

        locationImpl.setLocationId(location.getLocationId());
        locationImpl.setGroupId(location.getGroupId());
        locationImpl.setCompanyId(location.getCompanyId());
        locationImpl.setUserId(location.getUserId());
        locationImpl.setCreateDate(location.getCreateDate());
        locationImpl.setModifiedDate(location.getModifiedDate());
        locationImpl.setType(location.getType());
        locationImpl.setName(location.getName());
        locationImpl.setCountry_code(location.getCountry_code());
        locationImpl.setProvince(location.getProvince());
        locationImpl.setCity(location.getCity());
        locationImpl.setAddress(location.getAddress());
        locationImpl.setZip_code(location.getZip_code());
        locationImpl.setPhone(location.getPhone());
        locationImpl.setFax(location.getFax());
        locationImpl.setNote(location.getNote());

        return locationImpl;
    }

    /**
     * Returns the location with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the location
     * @return the location
     * @throws vn.com.ecopharma.hrm.NoSuchLocationException if a location with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Location findByPrimaryKey(Serializable primaryKey)
        throws NoSuchLocationException, SystemException {
        Location location = fetchByPrimaryKey(primaryKey);

        if (location == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchLocationException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return location;
    }

    /**
     * Returns the location with the primary key or throws a {@link vn.com.ecopharma.hrm.NoSuchLocationException} if it could not be found.
     *
     * @param locationId the primary key of the location
     * @return the location
     * @throws vn.com.ecopharma.hrm.NoSuchLocationException if a location with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Location findByPrimaryKey(long locationId)
        throws NoSuchLocationException, SystemException {
        return findByPrimaryKey((Serializable) locationId);
    }

    /**
     * Returns the location with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the location
     * @return the location, or <code>null</code> if a location with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Location fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        Location location = (Location) EntityCacheUtil.getResult(LocationModelImpl.ENTITY_CACHE_ENABLED,
                LocationImpl.class, primaryKey);

        if (location == _nullLocation) {
            return null;
        }

        if (location == null) {
            Session session = null;

            try {
                session = openSession();

                location = (Location) session.get(LocationImpl.class, primaryKey);

                if (location != null) {
                    cacheResult(location);
                } else {
                    EntityCacheUtil.putResult(LocationModelImpl.ENTITY_CACHE_ENABLED,
                        LocationImpl.class, primaryKey, _nullLocation);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(LocationModelImpl.ENTITY_CACHE_ENABLED,
                    LocationImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return location;
    }

    /**
     * Returns the location with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param locationId the primary key of the location
     * @return the location, or <code>null</code> if a location with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Location fetchByPrimaryKey(long locationId)
        throws SystemException {
        return fetchByPrimaryKey((Serializable) locationId);
    }

    /**
     * Returns all the locations.
     *
     * @return the locations
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Location> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the locations.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.com.ecopharma.hrm.model.impl.LocationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of locations
     * @param end the upper bound of the range of locations (not inclusive)
     * @return the range of locations
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Location> findAll(int start, int end) throws SystemException {
        return findAll(start, end, null);
    }

    /**
     * Returns an ordered range of all the locations.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.com.ecopharma.hrm.model.impl.LocationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of locations
     * @param end the upper bound of the range of locations (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of locations
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Location> findAll(int start, int end,
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

        List<Location> list = (List<Location>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_LOCATION);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_LOCATION;

                if (pagination) {
                    sql = sql.concat(LocationModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<Location>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<Location>(list);
                } else {
                    list = (List<Location>) QueryUtil.list(q, getDialect(),
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
     * Removes all the locations from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (Location location : findAll()) {
            remove(location);
        }
    }

    /**
     * Returns the number of locations.
     *
     * @return the number of locations
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

                Query q = session.createQuery(_SQL_COUNT_LOCATION);

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
     * Initializes the location persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.vn.com.ecopharma.hrm.model.Location")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<Location>> listenersList = new ArrayList<ModelListener<Location>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<Location>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(LocationImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
