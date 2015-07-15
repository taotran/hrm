package vn.com.ecopharma.hrm.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

import vn.com.ecopharma.hrm.model.Employee_Titles;
import vn.com.ecopharma.hrm.service.Employee_TitlesLocalServiceUtil;

/**
 * @author tvt
 * @generated
 */
public abstract class Employee_TitlesActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public Employee_TitlesActionableDynamicQuery() throws SystemException {
        setBaseLocalService(Employee_TitlesLocalServiceUtil.getService());
        setClass(Employee_Titles.class);

        setClassLoader(vn.com.ecopharma.hrm.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("employee_TitlesId");
    }
}
