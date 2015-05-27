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

import vn.com.ecopharma.hrm.NoSuchInterviewScheduleException;
import vn.com.ecopharma.hrm.model.InterviewSchedule;
import vn.com.ecopharma.hrm.model.impl.InterviewScheduleImpl;
import vn.com.ecopharma.hrm.model.impl.InterviewScheduleModelImpl;
import vn.com.ecopharma.hrm.service.persistence.InterviewSchedulePersistence;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the interview schedule service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author tvt
 * @see InterviewSchedulePersistence
 * @see InterviewScheduleUtil
 * @generated
 */
public class InterviewSchedulePersistenceImpl extends BasePersistenceImpl<InterviewSchedule>
    implements InterviewSchedulePersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link InterviewScheduleUtil} to access the interview schedule persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = InterviewScheduleImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(InterviewScheduleModelImpl.ENTITY_CACHE_ENABLED,
            InterviewScheduleModelImpl.FINDER_CACHE_ENABLED,
            InterviewScheduleImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(InterviewScheduleModelImpl.ENTITY_CACHE_ENABLED,
            InterviewScheduleModelImpl.FINDER_CACHE_ENABLED,
            InterviewScheduleImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(InterviewScheduleModelImpl.ENTITY_CACHE_ENABLED,
            InterviewScheduleModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    private static final String _SQL_SELECT_INTERVIEWSCHEDULE = "SELECT interviewSchedule FROM InterviewSchedule interviewSchedule";
    private static final String _SQL_COUNT_INTERVIEWSCHEDULE = "SELECT COUNT(interviewSchedule) FROM InterviewSchedule interviewSchedule";
    private static final String _ORDER_BY_ENTITY_ALIAS = "interviewSchedule.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No InterviewSchedule exists with the primary key ";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(InterviewSchedulePersistenceImpl.class);
    private static InterviewSchedule _nullInterviewSchedule = new InterviewScheduleImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<InterviewSchedule> toCacheModel() {
                return _nullInterviewScheduleCacheModel;
            }
        };

    private static CacheModel<InterviewSchedule> _nullInterviewScheduleCacheModel =
        new CacheModel<InterviewSchedule>() {
            @Override
            public InterviewSchedule toEntityModel() {
                return _nullInterviewSchedule;
            }
        };

    public InterviewSchedulePersistenceImpl() {
        setModelClass(InterviewSchedule.class);
    }

    /**
     * Caches the interview schedule in the entity cache if it is enabled.
     *
     * @param interviewSchedule the interview schedule
     */
    @Override
    public void cacheResult(InterviewSchedule interviewSchedule) {
        EntityCacheUtil.putResult(InterviewScheduleModelImpl.ENTITY_CACHE_ENABLED,
            InterviewScheduleImpl.class, interviewSchedule.getPrimaryKey(),
            interviewSchedule);

        interviewSchedule.resetOriginalValues();
    }

    /**
     * Caches the interview schedules in the entity cache if it is enabled.
     *
     * @param interviewSchedules the interview schedules
     */
    @Override
    public void cacheResult(List<InterviewSchedule> interviewSchedules) {
        for (InterviewSchedule interviewSchedule : interviewSchedules) {
            if (EntityCacheUtil.getResult(
                        InterviewScheduleModelImpl.ENTITY_CACHE_ENABLED,
                        InterviewScheduleImpl.class,
                        interviewSchedule.getPrimaryKey()) == null) {
                cacheResult(interviewSchedule);
            } else {
                interviewSchedule.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all interview schedules.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(InterviewScheduleImpl.class.getName());
        }

        EntityCacheUtil.clearCache(InterviewScheduleImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the interview schedule.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(InterviewSchedule interviewSchedule) {
        EntityCacheUtil.removeResult(InterviewScheduleModelImpl.ENTITY_CACHE_ENABLED,
            InterviewScheduleImpl.class, interviewSchedule.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    @Override
    public void clearCache(List<InterviewSchedule> interviewSchedules) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (InterviewSchedule interviewSchedule : interviewSchedules) {
            EntityCacheUtil.removeResult(InterviewScheduleModelImpl.ENTITY_CACHE_ENABLED,
                InterviewScheduleImpl.class, interviewSchedule.getPrimaryKey());
        }
    }

    /**
     * Creates a new interview schedule with the primary key. Does not add the interview schedule to the database.
     *
     * @param interviewScheduleId the primary key for the new interview schedule
     * @return the new interview schedule
     */
    @Override
    public InterviewSchedule create(long interviewScheduleId) {
        InterviewSchedule interviewSchedule = new InterviewScheduleImpl();

        interviewSchedule.setNew(true);
        interviewSchedule.setPrimaryKey(interviewScheduleId);

        return interviewSchedule;
    }

    /**
     * Removes the interview schedule with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param interviewScheduleId the primary key of the interview schedule
     * @return the interview schedule that was removed
     * @throws vn.com.ecopharma.hrm.NoSuchInterviewScheduleException if a interview schedule with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public InterviewSchedule remove(long interviewScheduleId)
        throws NoSuchInterviewScheduleException, SystemException {
        return remove((Serializable) interviewScheduleId);
    }

    /**
     * Removes the interview schedule with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the interview schedule
     * @return the interview schedule that was removed
     * @throws vn.com.ecopharma.hrm.NoSuchInterviewScheduleException if a interview schedule with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public InterviewSchedule remove(Serializable primaryKey)
        throws NoSuchInterviewScheduleException, SystemException {
        Session session = null;

        try {
            session = openSession();

            InterviewSchedule interviewSchedule = (InterviewSchedule) session.get(InterviewScheduleImpl.class,
                    primaryKey);

            if (interviewSchedule == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchInterviewScheduleException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(interviewSchedule);
        } catch (NoSuchInterviewScheduleException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected InterviewSchedule removeImpl(InterviewSchedule interviewSchedule)
        throws SystemException {
        interviewSchedule = toUnwrappedModel(interviewSchedule);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(interviewSchedule)) {
                interviewSchedule = (InterviewSchedule) session.get(InterviewScheduleImpl.class,
                        interviewSchedule.getPrimaryKeyObj());
            }

            if (interviewSchedule != null) {
                session.delete(interviewSchedule);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (interviewSchedule != null) {
            clearCache(interviewSchedule);
        }

        return interviewSchedule;
    }

    @Override
    public InterviewSchedule updateImpl(
        vn.com.ecopharma.hrm.model.InterviewSchedule interviewSchedule)
        throws SystemException {
        interviewSchedule = toUnwrappedModel(interviewSchedule);

        boolean isNew = interviewSchedule.isNew();

        Session session = null;

        try {
            session = openSession();

            if (interviewSchedule.isNew()) {
                session.save(interviewSchedule);

                interviewSchedule.setNew(false);
            } else {
                session.merge(interviewSchedule);
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

        EntityCacheUtil.putResult(InterviewScheduleModelImpl.ENTITY_CACHE_ENABLED,
            InterviewScheduleImpl.class, interviewSchedule.getPrimaryKey(),
            interviewSchedule);

        return interviewSchedule;
    }

    protected InterviewSchedule toUnwrappedModel(
        InterviewSchedule interviewSchedule) {
        if (interviewSchedule instanceof InterviewScheduleImpl) {
            return interviewSchedule;
        }

        InterviewScheduleImpl interviewScheduleImpl = new InterviewScheduleImpl();

        interviewScheduleImpl.setNew(interviewSchedule.isNew());
        interviewScheduleImpl.setPrimaryKey(interviewSchedule.getPrimaryKey());

        interviewScheduleImpl.setInterviewScheduleId(interviewSchedule.getInterviewScheduleId());
        interviewScheduleImpl.setC_id(interviewSchedule.getC_id());
        interviewScheduleImpl.setV_id(interviewSchedule.getV_id());
        interviewScheduleImpl.setInterviewId(interviewSchedule.getInterviewId());
        interviewScheduleImpl.setInterviewDate(interviewSchedule.getInterviewDate());
        interviewScheduleImpl.setInterviewTime(interviewSchedule.getInterviewTime());
        interviewScheduleImpl.setNote(interviewSchedule.getNote());
        interviewScheduleImpl.setGroupId(interviewSchedule.getGroupId());
        interviewScheduleImpl.setCompanyId(interviewSchedule.getCompanyId());
        interviewScheduleImpl.setUserId(interviewSchedule.getUserId());
        interviewScheduleImpl.setCreateDate(interviewSchedule.getCreateDate());
        interviewScheduleImpl.setModifiedDate(interviewSchedule.getModifiedDate());

        return interviewScheduleImpl;
    }

    /**
     * Returns the interview schedule with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the interview schedule
     * @return the interview schedule
     * @throws vn.com.ecopharma.hrm.NoSuchInterviewScheduleException if a interview schedule with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public InterviewSchedule findByPrimaryKey(Serializable primaryKey)
        throws NoSuchInterviewScheduleException, SystemException {
        InterviewSchedule interviewSchedule = fetchByPrimaryKey(primaryKey);

        if (interviewSchedule == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchInterviewScheduleException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return interviewSchedule;
    }

    /**
     * Returns the interview schedule with the primary key or throws a {@link vn.com.ecopharma.hrm.NoSuchInterviewScheduleException} if it could not be found.
     *
     * @param interviewScheduleId the primary key of the interview schedule
     * @return the interview schedule
     * @throws vn.com.ecopharma.hrm.NoSuchInterviewScheduleException if a interview schedule with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public InterviewSchedule findByPrimaryKey(long interviewScheduleId)
        throws NoSuchInterviewScheduleException, SystemException {
        return findByPrimaryKey((Serializable) interviewScheduleId);
    }

    /**
     * Returns the interview schedule with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the interview schedule
     * @return the interview schedule, or <code>null</code> if a interview schedule with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public InterviewSchedule fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        InterviewSchedule interviewSchedule = (InterviewSchedule) EntityCacheUtil.getResult(InterviewScheduleModelImpl.ENTITY_CACHE_ENABLED,
                InterviewScheduleImpl.class, primaryKey);

        if (interviewSchedule == _nullInterviewSchedule) {
            return null;
        }

        if (interviewSchedule == null) {
            Session session = null;

            try {
                session = openSession();

                interviewSchedule = (InterviewSchedule) session.get(InterviewScheduleImpl.class,
                        primaryKey);

                if (interviewSchedule != null) {
                    cacheResult(interviewSchedule);
                } else {
                    EntityCacheUtil.putResult(InterviewScheduleModelImpl.ENTITY_CACHE_ENABLED,
                        InterviewScheduleImpl.class, primaryKey,
                        _nullInterviewSchedule);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(InterviewScheduleModelImpl.ENTITY_CACHE_ENABLED,
                    InterviewScheduleImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return interviewSchedule;
    }

    /**
     * Returns the interview schedule with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param interviewScheduleId the primary key of the interview schedule
     * @return the interview schedule, or <code>null</code> if a interview schedule with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public InterviewSchedule fetchByPrimaryKey(long interviewScheduleId)
        throws SystemException {
        return fetchByPrimaryKey((Serializable) interviewScheduleId);
    }

    /**
     * Returns all the interview schedules.
     *
     * @return the interview schedules
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<InterviewSchedule> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the interview schedules.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.com.ecopharma.hrm.model.impl.InterviewScheduleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of interview schedules
     * @param end the upper bound of the range of interview schedules (not inclusive)
     * @return the range of interview schedules
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<InterviewSchedule> findAll(int start, int end)
        throws SystemException {
        return findAll(start, end, null);
    }

    /**
     * Returns an ordered range of all the interview schedules.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.com.ecopharma.hrm.model.impl.InterviewScheduleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of interview schedules
     * @param end the upper bound of the range of interview schedules (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of interview schedules
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<InterviewSchedule> findAll(int start, int end,
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

        List<InterviewSchedule> list = (List<InterviewSchedule>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_INTERVIEWSCHEDULE);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_INTERVIEWSCHEDULE;

                if (pagination) {
                    sql = sql.concat(InterviewScheduleModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<InterviewSchedule>) QueryUtil.list(q,
                            getDialect(), start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<InterviewSchedule>(list);
                } else {
                    list = (List<InterviewSchedule>) QueryUtil.list(q,
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
     * Removes all the interview schedules from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (InterviewSchedule interviewSchedule : findAll()) {
            remove(interviewSchedule);
        }
    }

    /**
     * Returns the number of interview schedules.
     *
     * @return the number of interview schedules
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

                Query q = session.createQuery(_SQL_COUNT_INTERVIEWSCHEDULE);

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
     * Initializes the interview schedule persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.vn.com.ecopharma.hrm.model.InterviewSchedule")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<InterviewSchedule>> listenersList = new ArrayList<ModelListener<InterviewSchedule>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<InterviewSchedule>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(InterviewScheduleImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
