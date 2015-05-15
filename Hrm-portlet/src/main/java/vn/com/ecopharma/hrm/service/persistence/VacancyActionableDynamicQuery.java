package vn.com.ecopharma.hrm.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

import vn.com.ecopharma.hrm.model.Vacancy;
import vn.com.ecopharma.hrm.service.VacancyLocalServiceUtil;

/**
 * @author tvt
 * @generated
 */
public abstract class VacancyActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public VacancyActionableDynamicQuery() throws SystemException {
        setBaseLocalService(VacancyLocalServiceUtil.getService());
        setClass(Vacancy.class);

        setClassLoader(vn.com.ecopharma.hrm.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("v_id");
    }
}
