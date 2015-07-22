package vn.com.ecopharma.hrm.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import vn.com.ecopharma.hrm.model.District;

/**
 * The persistence interface for the district service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author tvt
 * @see DistrictPersistenceImpl
 * @see DistrictUtil
 * @generated
 */
public interface DistrictPersistence extends BasePersistence<District> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link DistrictUtil} to access the district persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Returns all the districts where regionId = &#63;.
    *
    * @param regionId the region ID
    * @return the matching districts
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<vn.com.ecopharma.hrm.model.District> findByregionId(
        long regionId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the districts where regionId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.com.ecopharma.hrm.model.impl.DistrictModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param regionId the region ID
    * @param start the lower bound of the range of districts
    * @param end the upper bound of the range of districts (not inclusive)
    * @return the range of matching districts
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<vn.com.ecopharma.hrm.model.District> findByregionId(
        long regionId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the districts where regionId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.com.ecopharma.hrm.model.impl.DistrictModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param regionId the region ID
    * @param start the lower bound of the range of districts
    * @param end the upper bound of the range of districts (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching districts
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<vn.com.ecopharma.hrm.model.District> findByregionId(
        long regionId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first district in the ordered set where regionId = &#63;.
    *
    * @param regionId the region ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching district
    * @throws vn.com.ecopharma.hrm.NoSuchDistrictException if a matching district could not be found
    * @throws SystemException if a system exception occurred
    */
    public vn.com.ecopharma.hrm.model.District findByregionId_First(
        long regionId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            vn.com.ecopharma.hrm.NoSuchDistrictException;

    /**
    * Returns the first district in the ordered set where regionId = &#63;.
    *
    * @param regionId the region ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching district, or <code>null</code> if a matching district could not be found
    * @throws SystemException if a system exception occurred
    */
    public vn.com.ecopharma.hrm.model.District fetchByregionId_First(
        long regionId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last district in the ordered set where regionId = &#63;.
    *
    * @param regionId the region ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching district
    * @throws vn.com.ecopharma.hrm.NoSuchDistrictException if a matching district could not be found
    * @throws SystemException if a system exception occurred
    */
    public vn.com.ecopharma.hrm.model.District findByregionId_Last(
        long regionId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            vn.com.ecopharma.hrm.NoSuchDistrictException;

    /**
    * Returns the last district in the ordered set where regionId = &#63;.
    *
    * @param regionId the region ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching district, or <code>null</code> if a matching district could not be found
    * @throws SystemException if a system exception occurred
    */
    public vn.com.ecopharma.hrm.model.District fetchByregionId_Last(
        long regionId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the districts before and after the current district in the ordered set where regionId = &#63;.
    *
    * @param districtId the primary key of the current district
    * @param regionId the region ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next district
    * @throws vn.com.ecopharma.hrm.NoSuchDistrictException if a district with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public vn.com.ecopharma.hrm.model.District[] findByregionId_PrevAndNext(
        long districtId, long regionId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            vn.com.ecopharma.hrm.NoSuchDistrictException;

    /**
    * Removes all the districts where regionId = &#63; from the database.
    *
    * @param regionId the region ID
    * @throws SystemException if a system exception occurred
    */
    public void removeByregionId(long regionId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of districts where regionId = &#63;.
    *
    * @param regionId the region ID
    * @return the number of matching districts
    * @throws SystemException if a system exception occurred
    */
    public int countByregionId(long regionId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Caches the district in the entity cache if it is enabled.
    *
    * @param district the district
    */
    public void cacheResult(vn.com.ecopharma.hrm.model.District district);

    /**
    * Caches the districts in the entity cache if it is enabled.
    *
    * @param districts the districts
    */
    public void cacheResult(
        java.util.List<vn.com.ecopharma.hrm.model.District> districts);

    /**
    * Creates a new district with the primary key. Does not add the district to the database.
    *
    * @param districtId the primary key for the new district
    * @return the new district
    */
    public vn.com.ecopharma.hrm.model.District create(long districtId);

    /**
    * Removes the district with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param districtId the primary key of the district
    * @return the district that was removed
    * @throws vn.com.ecopharma.hrm.NoSuchDistrictException if a district with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public vn.com.ecopharma.hrm.model.District remove(long districtId)
        throws com.liferay.portal.kernel.exception.SystemException,
            vn.com.ecopharma.hrm.NoSuchDistrictException;

    public vn.com.ecopharma.hrm.model.District updateImpl(
        vn.com.ecopharma.hrm.model.District district)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the district with the primary key or throws a {@link vn.com.ecopharma.hrm.NoSuchDistrictException} if it could not be found.
    *
    * @param districtId the primary key of the district
    * @return the district
    * @throws vn.com.ecopharma.hrm.NoSuchDistrictException if a district with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public vn.com.ecopharma.hrm.model.District findByPrimaryKey(long districtId)
        throws com.liferay.portal.kernel.exception.SystemException,
            vn.com.ecopharma.hrm.NoSuchDistrictException;

    /**
    * Returns the district with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param districtId the primary key of the district
    * @return the district, or <code>null</code> if a district with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public vn.com.ecopharma.hrm.model.District fetchByPrimaryKey(
        long districtId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the districts.
    *
    * @return the districts
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<vn.com.ecopharma.hrm.model.District> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the districts.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.com.ecopharma.hrm.model.impl.DistrictModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of districts
    * @param end the upper bound of the range of districts (not inclusive)
    * @return the range of districts
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<vn.com.ecopharma.hrm.model.District> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the districts.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.com.ecopharma.hrm.model.impl.DistrictModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of districts
    * @param end the upper bound of the range of districts (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of districts
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<vn.com.ecopharma.hrm.model.District> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the districts from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of districts.
    *
    * @return the number of districts
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}
