package vn.com.ecopharma.hrm.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

import vn.com.ecopharma.hrm.model.District;
import vn.com.ecopharma.hrm.service.DistrictLocalServiceUtil;

/**
 * @author tvt
 * @generated
 */
public abstract class DistrictActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public DistrictActionableDynamicQuery() throws SystemException {
        setBaseLocalService(DistrictLocalServiceUtil.getService());
        setClass(District.class);

        setClassLoader(vn.com.ecopharma.hrm.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("districtId");
    }
}
