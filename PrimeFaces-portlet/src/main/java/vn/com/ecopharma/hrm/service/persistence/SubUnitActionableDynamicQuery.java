package vn.com.ecopharma.hrm.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

import vn.com.ecopharma.hrm.model.SubUnit;
import vn.com.ecopharma.hrm.service.SubUnitLocalServiceUtil;

/**
 * @author tvt
 * @generated
 */
public abstract class SubUnitActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public SubUnitActionableDynamicQuery() throws SystemException {
        setBaseLocalService(SubUnitLocalServiceUtil.getService());
        setClass(SubUnit.class);

        setClassLoader(vn.com.ecopharma.hrm.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("subUnitId");
    }
}
