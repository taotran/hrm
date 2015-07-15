package vn.com.ecopharma.hrm.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

import vn.com.ecopharma.hrm.model.University;
import vn.com.ecopharma.hrm.service.UniversityLocalServiceUtil;

/**
 * @author tvt
 * @generated
 */
public abstract class UniversityActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public UniversityActionableDynamicQuery() throws SystemException {
        setBaseLocalService(UniversityLocalServiceUtil.getService());
        setClass(University.class);

        setClassLoader(vn.com.ecopharma.hrm.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("universityId");
    }
}
