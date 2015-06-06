package vn.com.ecopharma.hrm.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

import vn.com.ecopharma.hrm.model.EmployeeVacancy;
import vn.com.ecopharma.hrm.service.EmployeeVacancyLocalServiceUtil;

/**
 * @author tvt
 * @generated
 */
public abstract class EmployeeVacancyActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public EmployeeVacancyActionableDynamicQuery() throws SystemException {
        setBaseLocalService(EmployeeVacancyLocalServiceUtil.getService());
        setClass(EmployeeVacancy.class);

        setClassLoader(vn.com.ecopharma.hrm.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("employeeVacancyId");
    }
}
