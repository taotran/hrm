package vn.com.ecopharma.hrm.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import vn.com.ecopharma.hrm.model.JTitle;

/**
 * The persistence interface for the j title service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author tvt
 * @see JTitlePersistenceImpl
 * @see JTitleUtil
 * @generated
 */
public interface JTitlePersistence extends BasePersistence<JTitle> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link JTitleUtil} to access the j title persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Caches the j title in the entity cache if it is enabled.
    *
    * @param jTitle the j title
    */
    public void cacheResult(vn.com.ecopharma.hrm.model.JTitle jTitle);

    /**
    * Caches the j titles in the entity cache if it is enabled.
    *
    * @param jTitles the j titles
    */
    public void cacheResult(
        java.util.List<vn.com.ecopharma.hrm.model.JTitle> jTitles);

    /**
    * Creates a new j title with the primary key. Does not add the j title to the database.
    *
    * @param jobtitleId the primary key for the new j title
    * @return the new j title
    */
    public vn.com.ecopharma.hrm.model.JTitle create(long jobtitleId);

    /**
    * Removes the j title with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param jobtitleId the primary key of the j title
    * @return the j title that was removed
    * @throws vn.com.ecopharma.hrm.NoSuchJTitleException if a j title with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public vn.com.ecopharma.hrm.model.JTitle remove(long jobtitleId)
        throws com.liferay.portal.kernel.exception.SystemException,
            vn.com.ecopharma.hrm.NoSuchJTitleException;

    public vn.com.ecopharma.hrm.model.JTitle updateImpl(
        vn.com.ecopharma.hrm.model.JTitle jTitle)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the j title with the primary key or throws a {@link vn.com.ecopharma.hrm.NoSuchJTitleException} if it could not be found.
    *
    * @param jobtitleId the primary key of the j title
    * @return the j title
    * @throws vn.com.ecopharma.hrm.NoSuchJTitleException if a j title with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public vn.com.ecopharma.hrm.model.JTitle findByPrimaryKey(long jobtitleId)
        throws com.liferay.portal.kernel.exception.SystemException,
            vn.com.ecopharma.hrm.NoSuchJTitleException;

    /**
    * Returns the j title with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param jobtitleId the primary key of the j title
    * @return the j title, or <code>null</code> if a j title with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public vn.com.ecopharma.hrm.model.JTitle fetchByPrimaryKey(long jobtitleId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the j titles.
    *
    * @return the j titles
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<vn.com.ecopharma.hrm.model.JTitle> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<vn.com.ecopharma.hrm.model.JTitle> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<vn.com.ecopharma.hrm.model.JTitle> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the j titles from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of j titles.
    *
    * @return the number of j titles
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}
