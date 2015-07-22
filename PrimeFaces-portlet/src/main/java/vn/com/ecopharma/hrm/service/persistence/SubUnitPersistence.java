package vn.com.ecopharma.hrm.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import vn.com.ecopharma.hrm.model.SubUnit;

/**
 * The persistence interface for the sub unit service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author tvt
 * @see SubUnitPersistenceImpl
 * @see SubUnitUtil
 * @generated
 */
public interface SubUnitPersistence extends BasePersistence<SubUnit> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link SubUnitUtil} to access the sub unit persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Caches the sub unit in the entity cache if it is enabled.
    *
    * @param subUnit the sub unit
    */
    public void cacheResult(vn.com.ecopharma.hrm.model.SubUnit subUnit);

    /**
    * Caches the sub units in the entity cache if it is enabled.
    *
    * @param subUnits the sub units
    */
    public void cacheResult(
        java.util.List<vn.com.ecopharma.hrm.model.SubUnit> subUnits);

    /**
    * Creates a new sub unit with the primary key. Does not add the sub unit to the database.
    *
    * @param subUnitId the primary key for the new sub unit
    * @return the new sub unit
    */
    public vn.com.ecopharma.hrm.model.SubUnit create(long subUnitId);

    /**
    * Removes the sub unit with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param subUnitId the primary key of the sub unit
    * @return the sub unit that was removed
    * @throws vn.com.ecopharma.hrm.NoSuchSubUnitException if a sub unit with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public vn.com.ecopharma.hrm.model.SubUnit remove(long subUnitId)
        throws com.liferay.portal.kernel.exception.SystemException,
            vn.com.ecopharma.hrm.NoSuchSubUnitException;

    public vn.com.ecopharma.hrm.model.SubUnit updateImpl(
        vn.com.ecopharma.hrm.model.SubUnit subUnit)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the sub unit with the primary key or throws a {@link vn.com.ecopharma.hrm.NoSuchSubUnitException} if it could not be found.
    *
    * @param subUnitId the primary key of the sub unit
    * @return the sub unit
    * @throws vn.com.ecopharma.hrm.NoSuchSubUnitException if a sub unit with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public vn.com.ecopharma.hrm.model.SubUnit findByPrimaryKey(long subUnitId)
        throws com.liferay.portal.kernel.exception.SystemException,
            vn.com.ecopharma.hrm.NoSuchSubUnitException;

    /**
    * Returns the sub unit with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param subUnitId the primary key of the sub unit
    * @return the sub unit, or <code>null</code> if a sub unit with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public vn.com.ecopharma.hrm.model.SubUnit fetchByPrimaryKey(long subUnitId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the sub units.
    *
    * @return the sub units
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<vn.com.ecopharma.hrm.model.SubUnit> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the sub units.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.com.ecopharma.hrm.model.impl.SubUnitModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of sub units
    * @param end the upper bound of the range of sub units (not inclusive)
    * @return the range of sub units
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<vn.com.ecopharma.hrm.model.SubUnit> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the sub units.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.com.ecopharma.hrm.model.impl.SubUnitModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of sub units
    * @param end the upper bound of the range of sub units (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of sub units
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<vn.com.ecopharma.hrm.model.SubUnit> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the sub units from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of sub units.
    *
    * @return the number of sub units
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}
