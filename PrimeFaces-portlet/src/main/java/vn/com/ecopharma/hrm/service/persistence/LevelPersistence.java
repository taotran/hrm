package vn.com.ecopharma.hrm.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import vn.com.ecopharma.hrm.model.Level;

/**
 * The persistence interface for the level service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author tvt
 * @see LevelPersistenceImpl
 * @see LevelUtil
 * @generated
 */
public interface LevelPersistence extends BasePersistence<Level> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link LevelUtil} to access the level persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Caches the level in the entity cache if it is enabled.
    *
    * @param level the level
    */
    public void cacheResult(vn.com.ecopharma.hrm.model.Level level);

    /**
    * Caches the levels in the entity cache if it is enabled.
    *
    * @param levels the levels
    */
    public void cacheResult(
        java.util.List<vn.com.ecopharma.hrm.model.Level> levels);

    /**
    * Creates a new level with the primary key. Does not add the level to the database.
    *
    * @param levelId the primary key for the new level
    * @return the new level
    */
    public vn.com.ecopharma.hrm.model.Level create(long levelId);

    /**
    * Removes the level with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param levelId the primary key of the level
    * @return the level that was removed
    * @throws vn.com.ecopharma.hrm.NoSuchLevelException if a level with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public vn.com.ecopharma.hrm.model.Level remove(long levelId)
        throws com.liferay.portal.kernel.exception.SystemException,
            vn.com.ecopharma.hrm.NoSuchLevelException;

    public vn.com.ecopharma.hrm.model.Level updateImpl(
        vn.com.ecopharma.hrm.model.Level level)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the level with the primary key or throws a {@link vn.com.ecopharma.hrm.NoSuchLevelException} if it could not be found.
    *
    * @param levelId the primary key of the level
    * @return the level
    * @throws vn.com.ecopharma.hrm.NoSuchLevelException if a level with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public vn.com.ecopharma.hrm.model.Level findByPrimaryKey(long levelId)
        throws com.liferay.portal.kernel.exception.SystemException,
            vn.com.ecopharma.hrm.NoSuchLevelException;

    /**
    * Returns the level with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param levelId the primary key of the level
    * @return the level, or <code>null</code> if a level with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public vn.com.ecopharma.hrm.model.Level fetchByPrimaryKey(long levelId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the levels.
    *
    * @return the levels
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<vn.com.ecopharma.hrm.model.Level> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<vn.com.ecopharma.hrm.model.Level> findAll(int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<vn.com.ecopharma.hrm.model.Level> findAll(int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the levels from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of levels.
    *
    * @return the number of levels
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}
