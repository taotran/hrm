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

import vn.com.ecopharma.hrm.NoSuchEmployee_TitlesException;
import vn.com.ecopharma.hrm.model.Employee_Titles;
import vn.com.ecopharma.hrm.model.impl.Employee_TitlesImpl;
import vn.com.ecopharma.hrm.model.impl.Employee_TitlesModelImpl;
import vn.com.ecopharma.hrm.service.persistence.Employee_TitlesPersistence;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the employee_ titles service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author tvt
 * @see Employee_TitlesPersistence
 * @see Employee_TitlesUtil
 * @generated
 */
public class Employee_TitlesPersistenceImpl extends BasePersistenceImpl<Employee_Titles>
    implements Employee_TitlesPersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link Employee_TitlesUtil} to access the employee_ titles persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = Employee_TitlesImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(Employee_TitlesModelImpl.ENTITY_CACHE_ENABLED,
            Employee_TitlesModelImpl.FINDER_CACHE_ENABLED,
            Employee_TitlesImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
            "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(Employee_TitlesModelImpl.ENTITY_CACHE_ENABLED,
            Employee_TitlesModelImpl.FINDER_CACHE_ENABLED,
            Employee_TitlesImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(Employee_TitlesModelImpl.ENTITY_CACHE_ENABLED,
            Employee_TitlesModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    private static final String _SQL_SELECT_EMPLOYEE_TITLES = "SELECT employee_Titles FROM Employee_Titles employee_Titles";
    private static final String _SQL_COUNT_EMPLOYEE_TITLES = "SELECT COUNT(employee_Titles) FROM Employee_Titles employee_Titles";
    private static final String _ORDER_BY_ENTITY_ALIAS = "employee_Titles.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Employee_Titles exists with the primary key ";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(Employee_TitlesPersistenceImpl.class);
    private static Employee_Titles _nullEmployee_Titles = new Employee_TitlesImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<Employee_Titles> toCacheModel() {
                return _nullEmployee_TitlesCacheModel;
            }
        };

    private static CacheModel<Employee_Titles> _nullEmployee_TitlesCacheModel = new CacheModel<Employee_Titles>() {
            @Override
            public Employee_Titles toEntityModel() {
                return _nullEmployee_Titles;
            }
        };

    public Employee_TitlesPersistenceImpl() {
        setModelClass(Employee_Titles.class);
    }

    /**
     * Caches the employee_ titles in the entity cache if it is enabled.
     *
     * @param employee_Titles the employee_ titles
     */
    @Override
    public void cacheResult(Employee_Titles employee_Titles) {
        EntityCacheUtil.putResult(Employee_TitlesModelImpl.ENTITY_CACHE_ENABLED,
            Employee_TitlesImpl.class, employee_Titles.getPrimaryKey(),
            employee_Titles);

        employee_Titles.resetOriginalValues();
    }

    /**
     * Caches the employee_ titleses in the entity cache if it is enabled.
     *
     * @param employee_Titleses the employee_ titleses
     */
    @Override
    public void cacheResult(List<Employee_Titles> employee_Titleses) {
        for (Employee_Titles employee_Titles : employee_Titleses) {
            if (EntityCacheUtil.getResult(
                        Employee_TitlesModelImpl.ENTITY_CACHE_ENABLED,
                        Employee_TitlesImpl.class,
                        employee_Titles.getPrimaryKey()) == null) {
                cacheResult(employee_Titles);
            } else {
                employee_Titles.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all employee_ titleses.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(Employee_TitlesImpl.class.getName());
        }

        EntityCacheUtil.clearCache(Employee_TitlesImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the employee_ titles.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(Employee_Titles employee_Titles) {
        EntityCacheUtil.removeResult(Employee_TitlesModelImpl.ENTITY_CACHE_ENABLED,
            Employee_TitlesImpl.class, employee_Titles.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    @Override
    public void clearCache(List<Employee_Titles> employee_Titleses) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (Employee_Titles employee_Titles : employee_Titleses) {
            EntityCacheUtil.removeResult(Employee_TitlesModelImpl.ENTITY_CACHE_ENABLED,
                Employee_TitlesImpl.class, employee_Titles.getPrimaryKey());
        }
    }

    /**
     * Creates a new employee_ titles with the primary key. Does not add the employee_ titles to the database.
     *
     * @param employee_TitlesId the primary key for the new employee_ titles
     * @return the new employee_ titles
     */
    @Override
    public Employee_Titles create(long employee_TitlesId) {
        Employee_Titles employee_Titles = new Employee_TitlesImpl();

        employee_Titles.setNew(true);
        employee_Titles.setPrimaryKey(employee_TitlesId);

        return employee_Titles;
    }

    /**
     * Removes the employee_ titles with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param employee_TitlesId the primary key of the employee_ titles
     * @return the employee_ titles that was removed
     * @throws vn.com.ecopharma.hrm.NoSuchEmployee_TitlesException if a employee_ titles with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Employee_Titles remove(long employee_TitlesId)
        throws NoSuchEmployee_TitlesException, SystemException {
        return remove((Serializable) employee_TitlesId);
    }

    /**
     * Removes the employee_ titles with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the employee_ titles
     * @return the employee_ titles that was removed
     * @throws vn.com.ecopharma.hrm.NoSuchEmployee_TitlesException if a employee_ titles with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Employee_Titles remove(Serializable primaryKey)
        throws NoSuchEmployee_TitlesException, SystemException {
        Session session = null;

        try {
            session = openSession();

            Employee_Titles employee_Titles = (Employee_Titles) session.get(Employee_TitlesImpl.class,
                    primaryKey);

            if (employee_Titles == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchEmployee_TitlesException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(employee_Titles);
        } catch (NoSuchEmployee_TitlesException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected Employee_Titles removeImpl(Employee_Titles employee_Titles)
        throws SystemException {
        employee_Titles = toUnwrappedModel(employee_Titles);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(employee_Titles)) {
                employee_Titles = (Employee_Titles) session.get(Employee_TitlesImpl.class,
                        employee_Titles.getPrimaryKeyObj());
            }

            if (employee_Titles != null) {
                session.delete(employee_Titles);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (employee_Titles != null) {
            clearCache(employee_Titles);
        }

        return employee_Titles;
    }

    @Override
    public Employee_Titles updateImpl(
        vn.com.ecopharma.hrm.model.Employee_Titles employee_Titles)
        throws SystemException {
        employee_Titles = toUnwrappedModel(employee_Titles);

        boolean isNew = employee_Titles.isNew();

        Session session = null;

        try {
            session = openSession();

            if (employee_Titles.isNew()) {
                session.save(employee_Titles);

                employee_Titles.setNew(false);
            } else {
                session.merge(employee_Titles);
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

        EntityCacheUtil.putResult(Employee_TitlesModelImpl.ENTITY_CACHE_ENABLED,
            Employee_TitlesImpl.class, employee_Titles.getPrimaryKey(),
            employee_Titles);

        return employee_Titles;
    }

    protected Employee_Titles toUnwrappedModel(Employee_Titles employee_Titles) {
        if (employee_Titles instanceof Employee_TitlesImpl) {
            return employee_Titles;
        }

        Employee_TitlesImpl employee_TitlesImpl = new Employee_TitlesImpl();

        employee_TitlesImpl.setNew(employee_Titles.isNew());
        employee_TitlesImpl.setPrimaryKey(employee_Titles.getPrimaryKey());

        employee_TitlesImpl.setEmployee_TitlesId(employee_Titles.getEmployee_TitlesId());
        employee_TitlesImpl.setEmployeeId(employee_Titles.getEmployeeId());
        employee_TitlesImpl.setTitlesId(employee_Titles.getTitlesId());
        employee_TitlesImpl.setSet_date(employee_Titles.getSet_date());
        employee_TitlesImpl.setNote(employee_Titles.getNote());
        employee_TitlesImpl.setGroupId(employee_Titles.getGroupId());
        employee_TitlesImpl.setCompanyId(employee_Titles.getCompanyId());
        employee_TitlesImpl.setUserId(employee_Titles.getUserId());
        employee_TitlesImpl.setCreateDate(employee_Titles.getCreateDate());
        employee_TitlesImpl.setModifiedDate(employee_Titles.getModifiedDate());

        return employee_TitlesImpl;
    }

    /**
     * Returns the employee_ titles with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the employee_ titles
     * @return the employee_ titles
     * @throws vn.com.ecopharma.hrm.NoSuchEmployee_TitlesException if a employee_ titles with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Employee_Titles findByPrimaryKey(Serializable primaryKey)
        throws NoSuchEmployee_TitlesException, SystemException {
        Employee_Titles employee_Titles = fetchByPrimaryKey(primaryKey);

        if (employee_Titles == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchEmployee_TitlesException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return employee_Titles;
    }

    /**
     * Returns the employee_ titles with the primary key or throws a {@link vn.com.ecopharma.hrm.NoSuchEmployee_TitlesException} if it could not be found.
     *
     * @param employee_TitlesId the primary key of the employee_ titles
     * @return the employee_ titles
     * @throws vn.com.ecopharma.hrm.NoSuchEmployee_TitlesException if a employee_ titles with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Employee_Titles findByPrimaryKey(long employee_TitlesId)
        throws NoSuchEmployee_TitlesException, SystemException {
        return findByPrimaryKey((Serializable) employee_TitlesId);
    }

    /**
     * Returns the employee_ titles with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the employee_ titles
     * @return the employee_ titles, or <code>null</code> if a employee_ titles with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Employee_Titles fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        Employee_Titles employee_Titles = (Employee_Titles) EntityCacheUtil.getResult(Employee_TitlesModelImpl.ENTITY_CACHE_ENABLED,
                Employee_TitlesImpl.class, primaryKey);

        if (employee_Titles == _nullEmployee_Titles) {
            return null;
        }

        if (employee_Titles == null) {
            Session session = null;

            try {
                session = openSession();

                employee_Titles = (Employee_Titles) session.get(Employee_TitlesImpl.class,
                        primaryKey);

                if (employee_Titles != null) {
                    cacheResult(employee_Titles);
                } else {
                    EntityCacheUtil.putResult(Employee_TitlesModelImpl.ENTITY_CACHE_ENABLED,
                        Employee_TitlesImpl.class, primaryKey,
                        _nullEmployee_Titles);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(Employee_TitlesModelImpl.ENTITY_CACHE_ENABLED,
                    Employee_TitlesImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return employee_Titles;
    }

    /**
     * Returns the employee_ titles with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param employee_TitlesId the primary key of the employee_ titles
     * @return the employee_ titles, or <code>null</code> if a employee_ titles with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Employee_Titles fetchByPrimaryKey(long employee_TitlesId)
        throws SystemException {
        return fetchByPrimaryKey((Serializable) employee_TitlesId);
    }

    /**
     * Returns all the employee_ titleses.
     *
     * @return the employee_ titleses
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Employee_Titles> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the employee_ titleses.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.com.ecopharma.hrm.model.impl.Employee_TitlesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of employee_ titleses
     * @param end the upper bound of the range of employee_ titleses (not inclusive)
     * @return the range of employee_ titleses
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Employee_Titles> findAll(int start, int end)
        throws SystemException {
        return findAll(start, end, null);
    }

    /**
     * Returns an ordered range of all the employee_ titleses.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.com.ecopharma.hrm.model.impl.Employee_TitlesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of employee_ titleses
     * @param end the upper bound of the range of employee_ titleses (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of employee_ titleses
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Employee_Titles> findAll(int start, int end,
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

        List<Employee_Titles> list = (List<Employee_Titles>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_EMPLOYEE_TITLES);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_EMPLOYEE_TITLES;

                if (pagination) {
                    sql = sql.concat(Employee_TitlesModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<Employee_Titles>) QueryUtil.list(q,
                            getDialect(), start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<Employee_Titles>(list);
                } else {
                    list = (List<Employee_Titles>) QueryUtil.list(q,
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
     * Removes all the employee_ titleses from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (Employee_Titles employee_Titles : findAll()) {
            remove(employee_Titles);
        }
    }

    /**
     * Returns the number of employee_ titleses.
     *
     * @return the number of employee_ titleses
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

                Query q = session.createQuery(_SQL_COUNT_EMPLOYEE_TITLES);

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
     * Initializes the employee_ titles persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.vn.com.ecopharma.hrm.model.Employee_Titles")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<Employee_Titles>> listenersList = new ArrayList<ModelListener<Employee_Titles>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<Employee_Titles>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(Employee_TitlesImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
