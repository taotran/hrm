package vn.com.ecopharma.hrm.model.impl;

import com.liferay.portal.kernel.exception.SystemException;

import vn.com.ecopharma.hrm.model.District;
import vn.com.ecopharma.hrm.service.DistrictLocalServiceUtil;

/**
 * The extended model base implementation for the District service. Represents a row in the &quot;pf_District&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link DistrictImpl}.
 * </p>
 *
 * @author tvt
 * @see DistrictImpl
 * @see vn.com.ecopharma.hrm.model.District
 * @generated
 */
public abstract class DistrictBaseImpl extends DistrictModelImpl
    implements District {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. All methods that expect a district model instance should use the {@link District} interface instead.
     */
    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            DistrictLocalServiceUtil.addDistrict(this);
        } else {
            DistrictLocalServiceUtil.updateDistrict(this);
        }
    }
}
