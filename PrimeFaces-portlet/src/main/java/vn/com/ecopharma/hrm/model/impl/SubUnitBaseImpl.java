package vn.com.ecopharma.hrm.model.impl;

import com.liferay.portal.kernel.exception.SystemException;

import vn.com.ecopharma.hrm.model.SubUnit;
import vn.com.ecopharma.hrm.service.SubUnitLocalServiceUtil;

/**
 * The extended model base implementation for the SubUnit service. Represents a row in the &quot;pf_SubUnit&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link SubUnitImpl}.
 * </p>
 *
 * @author tvt
 * @see SubUnitImpl
 * @see vn.com.ecopharma.hrm.model.SubUnit
 * @generated
 */
public abstract class SubUnitBaseImpl extends SubUnitModelImpl
    implements SubUnit {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. All methods that expect a sub unit model instance should use the {@link SubUnit} interface instead.
     */
    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            SubUnitLocalServiceUtil.addSubUnit(this);
        } else {
            SubUnitLocalServiceUtil.updateSubUnit(this);
        }
    }
}
