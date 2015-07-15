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

import vn.com.ecopharma.hrm.NoSuchEmployee_Titles_HistoryException;
import vn.com.ecopharma.hrm.model.Employee_Titles_History;
import vn.com.ecopharma.hrm.model.impl.Employee_Titles_HistoryImpl;
import vn.com.ecopharma.hrm.model.impl.Employee_Titles_HistoryModelImpl;
import vn.com.ecopharma.hrm.service.persistence.Employee_Titles_HistoryPersistence;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the employee_ titles_ history service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author tvt
 * @see Employee_Titles_HistoryPersistence
 * @see Employee_Titles_HistoryUtil
 * @generated
 */
public class Employee_Titles_HistoryPersistenceImpl extends BasePersistenceImpl<Employee_Titles_History>
    implements Employee_Titles_HistoryPersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link Employee_Titles_HistoryUtil} to access the employee_ titles_ history persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = Employee_Titles_HistoryImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(Employee_Titles_HistoryModelImpl.ENTITY_CACHE_ENABLED,
            Employee_Titles_HistoryModelImpl.FINDER_CACHE_ENABLED,
            Employee_Titles_HistoryImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(Employee_Titles_HistoryModelImpl.ENTITY_CACHE_ENABLED,
            Employee_Titles_HistoryModelImpl.FINDER_CACHE_ENABLED,
            Employee_Titles_HistoryImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(Employee_Titles_HistoryModelImpl.ENTITY_CACHE_ENABLED,
            Employee_Titles_HistoryModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    private static final String _SQL_SELECT_EMPLOYEE_TITLES_HISTORY = "SELECT employee_Titles_History FROM Employee_Titles_History employee_Titles_History";
    private static final String _SQL_COUNT_EMPLOYEE_TITLES_HISTORY = "SELECT COUNT(employee_Titles_History) FROM Employee_Titles_History employee_Titles_History";
    private static final String _ORDER_BY_ENTITY_ALIAS = "employee_Titles_History.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Employee_Titles_History exists with the primary key ";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(Employee_Titles_HistoryPersistenceImpl.class);
    private static Employee_Titles_History _nullEmployee_Titles_History = new Employee_Titles_HistoryImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<Employee_Titles_History> toCacheModel() {
                return _nullEmployee_Titles_HistoryCacheModel;
            }
        };

    private static CacheModel<Employee_Titles_History> _nullEmployee_Titles_HistoryCacheModel =
        new CacheModel<Employee_Titles_History>() {
            @Override
            public Employee_Titles_History toEntityModel() {
                return _nullEmployee_Titles_History;
            }
        };

    public Employee_Titles_HistoryPersistenceImpl() {
        setModelClass(Employee_Titles_History.class);
    }

    /**
     * Caches the employee_ titles_ history in the entity cache if it is enabled.
     *
     * @param employee_Titles_History the employee_ titles_ history
     */
    @Override
    public void cacheResult(Employee_Titles_History employee_Titles_History) {
        EntityCacheUtil.putResult(Employee_Titles_HistoryModelImpl.ENTITY_CACHE_ENABLED,
            Employee_Titles_HistoryImpl.class,
            employee_Titles_History.getPrimaryKey(), employee_Titles_History);

        employee_Titles_History.resetOriginalValues();
    }

    /**
     * Caches the employee_ titles_ histories in the entity cache if it is enabled.
     *
     * @param employee_Titles_Histories the employee_ titles_ histories
     */
    @Override
    public void cacheResult(
        List<Employee_Titles_History> employee_Titles_Histories) {
        for (Employee_Titles_History employee_Titles_History : employee_Titles_Histories) {
            if (EntityCacheUtil.getResult(
                        Employee_Titles_HistoryModelImpl.ENTITY_CACHE_ENABLED,
                        Employee_Titles_HistoryImpl.class,
                        employee_Titles_History.getPrimaryKey()) == null) {
                cacheResult(employee_Titles_History);
            } else {
                employee_Titles_History.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all employee_ titles_ histories.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(Employee_Titles_HistoryImpl.class.getName());
        }

        EntityCacheUtil.clearCache(Employee_Titles_HistoryImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the employee_ titles_ history.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(Employee_Titles_History employee_Titles_History) {
        EntityCacheUtil.removeResult(Employee_Titles_HistoryModelImpl.ENTITY_CACHE_ENABLED,
            Employee_Titles_HistoryImpl.class,
            employee_Titles_History.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    @Override
    public void clearCache(
        List<Employee_Titles_History> employee_Titles_Histories) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (Employee_Titles_History employee_Titles_History : employee_Titles_Histories) {
            EntityCacheUtil.removeResult(Employee_Titles_HistoryModelImpl.ENTITY_CACHE_ENABLED,
                Employee_Titles_HistoryImpl.class,
                employee_Titles_History.getPrimaryKey());
        }
    }

    /**
     * Creates a new employee_ titles_ history with the primary key. Does not add the employee_ titles_ history to the database.
     *
     * @param employee_Titles_HistoryId the primary key for the new employee_ titles_ history
     * @return the new employee_ titles_ history
     */
    @Override
    public Employee_Titles_History create(long employee_Titles_HistoryId) {
        Employee_Titles_History employee_Titles_History = new Employee_Titles_HistoryImpl();

        employee_Titles_History.setNew(true);
        employee_Titles_History.setPrimaryKey(employee_Titles_HistoryId);

        return employee_Titles_History;
    }

    /**
     * Removes the employee_ titles_ history with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param employee_Titles_HistoryId the primary key of the employee_ titles_ history
     * @return the employee_ titles_ history that was removed
     * @throws vn.com.ecopharma.hrm.NoSuchEmployee_Titles_HistoryException if a employee_ titles_ history with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Employee_Titles_History remove(long employee_Titles_HistoryId)
        throws NoSuchEmployee_Titles_HistoryException, SystemException {
        return remove((Serializable) employee_Titles_HistoryId);
    }

    /**
     * Removes the employee_ titles_ history with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the employee_ titles_ history
     * @return the employee_ titles_ history that was removed
     * @throws vn.com.ecopharma.hrm.NoSuchEmployee_Titles_HistoryException if a employee_ titles_ history with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Employee_Titles_History remove(Serializable primaryKey)
        throws NoSuchEmployee_Titles_HistoryException, SystemException {
        Session session = null;

        try {
            session = openSession();

            Employee_Titles_History employee_Titles_History = (Employee_Titles_History) session.get(Employee_Titles_HistoryImpl.class,
                    primaryKey);

            if (employee_Titles_History == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchEmployee_Titles_HistoryException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(employee_Titles_History);
        } catch (NoSuchEmployee_Titles_HistoryException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected Employee_Titles_History removeImpl(
        Employee_Titles_History employee_Titles_History)
        throws SystemException {
        employee_Titles_History = toUnwrappedModel(employee_Titles_History);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(employee_Titles_History)) {
                employee_Titles_History = (Employee_Titles_History) session.get(Employee_Titles_HistoryImpl.class,
                        employee_Titles_History.getPrimaryKeyObj());
            }

            if (employee_Titles_History != null) {
                session.delete(employee_Titles_History);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (employee_Titles_History != null) {
            clearCache(employee_Titles_History);
        }

        return employee_Titles_History;
    }

    @Override
    public Employee_Titles_History updateImpl(
        vn.com.ecopharma.hrm.model.Employee_Titles_History employee_Titles_History)
        throws SystemException {
        employee_Titles_History = toUnwrappedModel(employee_Titles_History);

        boolean isNew = employee_Titles_History.isNew();

        Session session = null;

        try {
            session = openSession();

            if (employee_Titles_History.isNew()) {
                session.save(employee_Titles_History);

                employee_Titles_History.setNew(false);
            } else {
                session.merge(employee_Titles_History);
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

        EntityCacheUtil.putResult(Employee_Titles_HistoryModelImpl.ENTITY_CACHE_ENABLED,
            Employee_Titles_HistoryImpl.class,
            employee_Titles_History.getPrimaryKey(), employee_Titles_History);

        return employee_Titles_History;
    }

    protected Employee_Titles_History toUnwrappedModel(
        Employee_Titles_History employee_Titles_History) {
        if (employee_Titles_History instanceof Employee_Titles_HistoryImpl) {
            return employee_Titles_History;
        }

        Employee_Titles_HistoryImpl employee_Titles_HistoryImpl = new Employee_Titles_HistoryImpl();

        employee_Titles_HistoryImpl.setNew(employee_Titles_History.isNew());
        employee_Titles_HistoryImpl.setPrimaryKey(employee_Titles_History.getPrimaryKey());

        employee_Titles_HistoryImpl.setEmployee_Titles_HistoryId(employee_Titles_History.getEmployee_Titles_HistoryId());
        employee_Titles_HistoryImpl.setEmployeeId(employee_Titles_History.getEmployeeId());
        employee_Titles_HistoryImpl.setTitlesId(employee_Titles_History.getTitlesId());
        employee_Titles_HistoryImpl.setSet_date(employee_Titles_History.getSet_date());
        employee_Titles_HistoryImpl.setNote(employee_Titles_History.getNote());
        employee_Titles_HistoryImpl.setGroupId(employee_Titles_History.getGroupId());
        employee_Titles_HistoryImpl.setCompanyId(employee_Titles_History.getCompanyId());
        employee_Titles_HistoryImpl.setUserId(employee_Titles_History.getUserId());
        employee_Titles_HistoryImpl.setCreateDate(employee_Titles_History.getCreateDate());
        employee_Titles_HistoryImpl.setModifiedDate(employee_Titles_History.getModifiedDate());

        return employee_Titles_HistoryImpl;
    }

    /**
     * Returns the employee_ titles_ history with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the employee_ titles_ history
     * @return the employee_ titles_ history
     * @throws vn.com.ecopharma.hrm.NoSuchEmployee_Titles_HistoryException if a employee_ titles_ history with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Employee_Titles_History findByPrimaryKey(Serializable primaryKey)
        throws NoSuchEmployee_Titles_HistoryException, SystemException {
        Employee_Titles_History employee_Titles_History = fetchByPrimaryKey(primaryKey);

        if (employee_Titles_History == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchEmployee_Titles_HistoryException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return employee_Titles_History;
    }

    /**
     * Returns the employee_ titles_ history with the primary key or throws a {@link vn.com.ecopharma.hrm.NoSuchEmployee_Titles_HistoryException} if it could not be found.
     *
     * @param employee_Titles_HistoryId the primary key of the employee_ titles_ history
     * @return the employee_ titles_ history
     * @throws vn.com.ecopharma.hrm.NoSuchEmployee_Titles_HistoryException if a employee_ titles_ history with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Employee_Titles_History findByPrimaryKey(
        long employee_Titles_HistoryId)
        throws NoSuchEmployee_Titles_HistoryException, SystemException {
        return findByPrimaryKey((Serializable) employee_Titles_HistoryId);
    }

    /**
     * Returns the employee_ titles_ history with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the employee_ titles_ history
     * @return the employee_ titles_ history, or <code>null</code> if a employee_ titles_ history with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Employee_Titles_History fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        Employee_Titles_History employee_Titles_History = (Employee_Titles_History) EntityCacheUtil.getResult(Employee_Titles_HistoryModelImpl.ENTITY_CACHE_ENABLED,
                Employee_Titles_HistoryImpl.class, primaryKey);

        if (employee_Titles_History == _nullEmployee_Titles_History) {
            return null;
        }

        if (employee_Titles_History == null) {
            Session session = null;

            try {
                session = openSession();

                employee_Titles_History = (Employee_Titles_History) session.get(Employee_Titles_HistoryImpl.class,
                        primaryKey);

                if (employee_Titles_History != null) {
                    cacheResult(employee_Titles_History);
                } else {
                    EntityCacheUtil.putResult(Employee_Titles_HistoryModelImpl.ENTITY_CACHE_ENABLED,
                        Employee_Titles_HistoryImpl.class, primaryKey,
                        _nullEmployee_Titles_History);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(Employee_Titles_HistoryModelImpl.ENTITY_CACHE_ENABLED,
                    Employee_Titles_HistoryImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return employee_Titles_History;
    }

    /**
     * Returns the employee_ titles_ history with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param employee_Titles_HistoryId the primary key of the employee_ titles_ history
     * @return the employee_ titles_ history, or <code>null</code> if a employee_ titles_ history with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Employee_Titles_History fetchByPrimaryKey(
        long employee_Titles_HistoryId) throws SystemException {
        return fetchByPrimaryKey((Serializable) employee_Titles_HistoryId);
    }

    /**
     * Returns all the employee_ titles_ histories.
     *
     * @return the employee_ titles_ histories
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Employee_Titles_History> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the employee_ titles_ histories.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.com.ecopharma.hrm.model.impl.Employee_Titles_HistoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of employee_ titles_ histories
     * @param end the upper bound of the range of employee_ titles_ histories (not inclusive)
     * @return the range of employee_ titles_ histories
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Employee_Titles_History> findAll(int start, int end)
        throws SystemException {
        return findAll(start, end, null);
    }

    /**
     * Returns an ordered range of all the employee_ titles_ histories.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.com.ecopharma.hrm.model.impl.Employee_Titles_HistoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of employee_ titles_ histories
     * @param end the upper bound of the range of employee_ titles_ histories (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of employee_ titles_ histories
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Employee_Titles_History> findAll(int start, int end,
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

        List<Employee_Titles_History> list = (List<Employee_Titles_History>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_EMPLOYEE_TITLES_HISTORY);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_EMPLOYEE_TITLES_HISTORY;

                if (pagination) {
                    sql = sql.concat(Employee_Titles_HistoryModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<Employee_Titles_History>) QueryUtil.list(q,
                            getDialect(), start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<Employee_Titles_History>(list);
                } else {
                    list = (List<Employee_Titles_History>) QueryUtil.list(q,
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
     * Removes all the employee_ titles_ histories from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (Employee_Titles_History employee_Titles_History : findAll()) {
            remove(employee_Titles_History);
        }
    }

    /**
     * Returns the number of employee_ titles_ histories.
     *
     * @return the number of employee_ titles_ histories
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

                Query q = session.createQuery(_SQL_COUNT_EMPLOYEE_TITLES_HISTORY);

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
     * Initializes the employee_ titles_ history persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.vn.com.ecopharma.hrm.model.Employee_Titles_History")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<Employee_Titles_History>> listenersList = new ArrayList<ModelListener<Employee_Titles_History>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<Employee_Titles_History>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(Employee_Titles_HistoryImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
