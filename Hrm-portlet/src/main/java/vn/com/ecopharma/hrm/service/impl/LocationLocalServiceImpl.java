package vn.com.ecopharma.hrm.service.impl;

import java.util.List;

import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.service.ServiceContext;

import vn.com.ecopharma.hrm.NoSuchLocationException;
import vn.com.ecopharma.hrm.model.Location;
import vn.com.ecopharma.hrm.service.base.LocationLocalServiceBaseImpl;

/**
 * The implementation of the location local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link vn.com.ecopharma.hrm.service.LocationLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author tvt
 * @see vn.com.ecopharma.hrm.service.base.LocationLocalServiceBaseImpl
 * @see vn.com.ecopharma.hrm.service.LocationLocalServiceUtil
 */
public class LocationLocalServiceImpl extends LocationLocalServiceBaseImpl {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never reference this interface directly. Always use {@link vn.com.ecopharma.hrm.service.LocationLocalServiceUtil} to access the location local service.
     */
	
	public List<Location> findAll() throws SystemException {
		return locationPersistence.findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS);
	}
	
	public List<Location> findAll(int start, int end) throws SystemException {
		return locationPersistence.findAll(start, end, null);
	}
	
	
	public List<Location> findAll(int start, int end, OrderByComparator orderByComparator) throws SystemException {
		return locationPersistence.findAll(start, end, orderByComparator);
	}
	
	public Location create(String name, String province, String city, String address, String zip_code, String phone, String fax, String note, long userId, ServiceContext serviceContext) throws SystemException {
		final Location location = locationPersistence.create(counterLocalService.increment());
		
		location.setName(name);
		location.setProvince(province);
		location.setCity(city);
		location.setAddress(address);
		location.setZip_code(zip_code);
		location.setPhone(phone);
		location.setFax(fax);
		location.setNote(note);
		location.setUserId(userId);
		location.setGroupId(serviceContext.getScopeGroupId());
		locationPersistence.update(location);
		return location;
	}
	
	public Location edit(long locationId, String name, String province, String city, String address, String zip_code, String phone, String fax, String note) throws SystemException, NoSuchLocationException {
		final Location location = locationPersistence.findByPrimaryKey(locationId);
		location.setName(name);
		location.setProvince(province);
		location.setCity(city);
		location.setAddress(address);
		location.setZip_code(zip_code);
		location.setPhone(phone);
		location.setFax(fax);
		location.setNote(note);
		locationPersistence.update(location);
		return location;
	}
	
	public String getLocationNameById(long locationId) throws NoSuchLocationException, SystemException {
		return locationPersistence.findByPrimaryKey(locationId).getName();
	}
}
