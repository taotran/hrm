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

import vn.com.ecopharma.hrm.NoSuchFileAttachmentException;
import vn.com.ecopharma.hrm.model.FileAttachment;
import vn.com.ecopharma.hrm.model.impl.FileAttachmentImpl;
import vn.com.ecopharma.hrm.model.impl.FileAttachmentModelImpl;
import vn.com.ecopharma.hrm.service.persistence.FileAttachmentPersistence;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the file attachment service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author tvt
 * @see FileAttachmentPersistence
 * @see FileAttachmentUtil
 * @generated
 */
public class FileAttachmentPersistenceImpl extends BasePersistenceImpl<FileAttachment>
    implements FileAttachmentPersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link FileAttachmentUtil} to access the file attachment persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = FileAttachmentImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(FileAttachmentModelImpl.ENTITY_CACHE_ENABLED,
            FileAttachmentModelImpl.FINDER_CACHE_ENABLED,
            FileAttachmentImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
            "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(FileAttachmentModelImpl.ENTITY_CACHE_ENABLED,
            FileAttachmentModelImpl.FINDER_CACHE_ENABLED,
            FileAttachmentImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(FileAttachmentModelImpl.ENTITY_CACHE_ENABLED,
            FileAttachmentModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    private static final String _SQL_SELECT_FILEATTACHMENT = "SELECT fileAttachment FROM FileAttachment fileAttachment";
    private static final String _SQL_COUNT_FILEATTACHMENT = "SELECT COUNT(fileAttachment) FROM FileAttachment fileAttachment";
    private static final String _ORDER_BY_ENTITY_ALIAS = "fileAttachment.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No FileAttachment exists with the primary key ";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(FileAttachmentPersistenceImpl.class);
    private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
                "size"
            });
    private static FileAttachment _nullFileAttachment = new FileAttachmentImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<FileAttachment> toCacheModel() {
                return _nullFileAttachmentCacheModel;
            }
        };

    private static CacheModel<FileAttachment> _nullFileAttachmentCacheModel = new CacheModel<FileAttachment>() {
            @Override
            public FileAttachment toEntityModel() {
                return _nullFileAttachment;
            }
        };

    public FileAttachmentPersistenceImpl() {
        setModelClass(FileAttachment.class);
    }

    /**
     * Caches the file attachment in the entity cache if it is enabled.
     *
     * @param fileAttachment the file attachment
     */
    @Override
    public void cacheResult(FileAttachment fileAttachment) {
        EntityCacheUtil.putResult(FileAttachmentModelImpl.ENTITY_CACHE_ENABLED,
            FileAttachmentImpl.class, fileAttachment.getPrimaryKey(),
            fileAttachment);

        fileAttachment.resetOriginalValues();
    }

    /**
     * Caches the file attachments in the entity cache if it is enabled.
     *
     * @param fileAttachments the file attachments
     */
    @Override
    public void cacheResult(List<FileAttachment> fileAttachments) {
        for (FileAttachment fileAttachment : fileAttachments) {
            if (EntityCacheUtil.getResult(
                        FileAttachmentModelImpl.ENTITY_CACHE_ENABLED,
                        FileAttachmentImpl.class, fileAttachment.getPrimaryKey()) == null) {
                cacheResult(fileAttachment);
            } else {
                fileAttachment.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all file attachments.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(FileAttachmentImpl.class.getName());
        }

        EntityCacheUtil.clearCache(FileAttachmentImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the file attachment.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(FileAttachment fileAttachment) {
        EntityCacheUtil.removeResult(FileAttachmentModelImpl.ENTITY_CACHE_ENABLED,
            FileAttachmentImpl.class, fileAttachment.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    @Override
    public void clearCache(List<FileAttachment> fileAttachments) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (FileAttachment fileAttachment : fileAttachments) {
            EntityCacheUtil.removeResult(FileAttachmentModelImpl.ENTITY_CACHE_ENABLED,
                FileAttachmentImpl.class, fileAttachment.getPrimaryKey());
        }
    }

    /**
     * Creates a new file attachment with the primary key. Does not add the file attachment to the database.
     *
     * @param f_id the primary key for the new file attachment
     * @return the new file attachment
     */
    @Override
    public FileAttachment create(long f_id) {
        FileAttachment fileAttachment = new FileAttachmentImpl();

        fileAttachment.setNew(true);
        fileAttachment.setPrimaryKey(f_id);

        return fileAttachment;
    }

    /**
     * Removes the file attachment with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param f_id the primary key of the file attachment
     * @return the file attachment that was removed
     * @throws vn.com.ecopharma.hrm.NoSuchFileAttachmentException if a file attachment with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public FileAttachment remove(long f_id)
        throws NoSuchFileAttachmentException, SystemException {
        return remove((Serializable) f_id);
    }

    /**
     * Removes the file attachment with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the file attachment
     * @return the file attachment that was removed
     * @throws vn.com.ecopharma.hrm.NoSuchFileAttachmentException if a file attachment with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public FileAttachment remove(Serializable primaryKey)
        throws NoSuchFileAttachmentException, SystemException {
        Session session = null;

        try {
            session = openSession();

            FileAttachment fileAttachment = (FileAttachment) session.get(FileAttachmentImpl.class,
                    primaryKey);

            if (fileAttachment == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchFileAttachmentException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(fileAttachment);
        } catch (NoSuchFileAttachmentException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected FileAttachment removeImpl(FileAttachment fileAttachment)
        throws SystemException {
        fileAttachment = toUnwrappedModel(fileAttachment);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(fileAttachment)) {
                fileAttachment = (FileAttachment) session.get(FileAttachmentImpl.class,
                        fileAttachment.getPrimaryKeyObj());
            }

            if (fileAttachment != null) {
                session.delete(fileAttachment);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (fileAttachment != null) {
            clearCache(fileAttachment);
        }

        return fileAttachment;
    }

    @Override
    public FileAttachment updateImpl(
        vn.com.ecopharma.hrm.model.FileAttachment fileAttachment)
        throws SystemException {
        fileAttachment = toUnwrappedModel(fileAttachment);

        boolean isNew = fileAttachment.isNew();

        Session session = null;

        try {
            session = openSession();

            if (fileAttachment.isNew()) {
                session.save(fileAttachment);

                fileAttachment.setNew(false);
            } else {
                session.merge(fileAttachment);
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

        EntityCacheUtil.putResult(FileAttachmentModelImpl.ENTITY_CACHE_ENABLED,
            FileAttachmentImpl.class, fileAttachment.getPrimaryKey(),
            fileAttachment);

        return fileAttachment;
    }

    protected FileAttachment toUnwrappedModel(FileAttachment fileAttachment) {
        if (fileAttachment instanceof FileAttachmentImpl) {
            return fileAttachment;
        }

        FileAttachmentImpl fileAttachmentImpl = new FileAttachmentImpl();

        fileAttachmentImpl.setNew(fileAttachment.isNew());
        fileAttachmentImpl.setPrimaryKey(fileAttachment.getPrimaryKey());

        fileAttachmentImpl.setF_id(fileAttachment.getF_id());
        fileAttachmentImpl.setGroupId(fileAttachment.getGroupId());
        fileAttachmentImpl.setCompanyId(fileAttachment.getCompanyId());
        fileAttachmentImpl.setUserId(fileAttachment.getUserId());
        fileAttachmentImpl.setCreateDate(fileAttachment.getCreateDate());
        fileAttachmentImpl.setModifiedDate(fileAttachment.getModifiedDate());
        fileAttachmentImpl.setC_id(fileAttachment.getC_id());
        fileAttachmentImpl.setName(fileAttachment.getName());
        fileAttachmentImpl.setFile_type(fileAttachment.getFile_type());
        fileAttachmentImpl.setSize(fileAttachment.getSize());
        fileAttachmentImpl.setContent(fileAttachment.getContent());
        fileAttachmentImpl.setAttachment_type(fileAttachment.getAttachment_type());

        return fileAttachmentImpl;
    }

    /**
     * Returns the file attachment with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the file attachment
     * @return the file attachment
     * @throws vn.com.ecopharma.hrm.NoSuchFileAttachmentException if a file attachment with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public FileAttachment findByPrimaryKey(Serializable primaryKey)
        throws NoSuchFileAttachmentException, SystemException {
        FileAttachment fileAttachment = fetchByPrimaryKey(primaryKey);

        if (fileAttachment == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchFileAttachmentException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return fileAttachment;
    }

    /**
     * Returns the file attachment with the primary key or throws a {@link vn.com.ecopharma.hrm.NoSuchFileAttachmentException} if it could not be found.
     *
     * @param f_id the primary key of the file attachment
     * @return the file attachment
     * @throws vn.com.ecopharma.hrm.NoSuchFileAttachmentException if a file attachment with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public FileAttachment findByPrimaryKey(long f_id)
        throws NoSuchFileAttachmentException, SystemException {
        return findByPrimaryKey((Serializable) f_id);
    }

    /**
     * Returns the file attachment with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the file attachment
     * @return the file attachment, or <code>null</code> if a file attachment with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public FileAttachment fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        FileAttachment fileAttachment = (FileAttachment) EntityCacheUtil.getResult(FileAttachmentModelImpl.ENTITY_CACHE_ENABLED,
                FileAttachmentImpl.class, primaryKey);

        if (fileAttachment == _nullFileAttachment) {
            return null;
        }

        if (fileAttachment == null) {
            Session session = null;

            try {
                session = openSession();

                fileAttachment = (FileAttachment) session.get(FileAttachmentImpl.class,
                        primaryKey);

                if (fileAttachment != null) {
                    cacheResult(fileAttachment);
                } else {
                    EntityCacheUtil.putResult(FileAttachmentModelImpl.ENTITY_CACHE_ENABLED,
                        FileAttachmentImpl.class, primaryKey,
                        _nullFileAttachment);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(FileAttachmentModelImpl.ENTITY_CACHE_ENABLED,
                    FileAttachmentImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return fileAttachment;
    }

    /**
     * Returns the file attachment with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param f_id the primary key of the file attachment
     * @return the file attachment, or <code>null</code> if a file attachment with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public FileAttachment fetchByPrimaryKey(long f_id)
        throws SystemException {
        return fetchByPrimaryKey((Serializable) f_id);
    }

    /**
     * Returns all the file attachments.
     *
     * @return the file attachments
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<FileAttachment> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the file attachments.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.com.ecopharma.hrm.model.impl.FileAttachmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of file attachments
     * @param end the upper bound of the range of file attachments (not inclusive)
     * @return the range of file attachments
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<FileAttachment> findAll(int start, int end)
        throws SystemException {
        return findAll(start, end, null);
    }

    /**
     * Returns an ordered range of all the file attachments.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.com.ecopharma.hrm.model.impl.FileAttachmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of file attachments
     * @param end the upper bound of the range of file attachments (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of file attachments
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<FileAttachment> findAll(int start, int end,
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

        List<FileAttachment> list = (List<FileAttachment>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_FILEATTACHMENT);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_FILEATTACHMENT;

                if (pagination) {
                    sql = sql.concat(FileAttachmentModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<FileAttachment>) QueryUtil.list(q,
                            getDialect(), start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<FileAttachment>(list);
                } else {
                    list = (List<FileAttachment>) QueryUtil.list(q,
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
     * Removes all the file attachments from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (FileAttachment fileAttachment : findAll()) {
            remove(fileAttachment);
        }
    }

    /**
     * Returns the number of file attachments.
     *
     * @return the number of file attachments
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

                Query q = session.createQuery(_SQL_COUNT_FILEATTACHMENT);

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
     * Initializes the file attachment persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.vn.com.ecopharma.hrm.model.FileAttachment")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<FileAttachment>> listenersList = new ArrayList<ModelListener<FileAttachment>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<FileAttachment>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(FileAttachmentImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
