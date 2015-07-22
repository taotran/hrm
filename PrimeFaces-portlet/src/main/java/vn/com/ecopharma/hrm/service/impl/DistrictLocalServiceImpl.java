package vn.com.ecopharma.hrm.service.impl;

import java.util.List;

import com.liferay.portal.kernel.exception.SystemException;

import vn.com.ecopharma.hrm.model.District;
import vn.com.ecopharma.hrm.service.base.DistrictLocalServiceBaseImpl;

/**
 * The implementation of the district local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link vn.com.ecopharma.hrm.service.DistrictLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author tvt
 * @see vn.com.ecopharma.hrm.service.base.DistrictLocalServiceBaseImpl
 * @see vn.com.ecopharma.hrm.service.DistrictLocalServiceUtil
 */
public class DistrictLocalServiceImpl extends DistrictLocalServiceBaseImpl {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never reference this interface directly. Always use {@link vn.com.ecopharma.hrm.service.DistrictLocalServiceUtil} to access the district local service.
     */
	
	public List<District> getDistricts(long regionId) {
		try {
			return districtPersistence.findByregionId(regionId);
		} catch (SystemException e) {
			e.printStackTrace();
		}
		return null;
	}
	
}
