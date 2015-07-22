package vn.com.ecopharma.hrm.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

import vn.com.ecopharma.hrm.model.Employee_Titles_History;
import vn.com.ecopharma.hrm.service.Employee_Titles_HistoryLocalServiceUtil;

/**
 * @author tvt
 * @generated
 */
public abstract class Employee_Titles_HistoryActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public Employee_Titles_HistoryActionableDynamicQuery()
        throws SystemException {
        setBaseLocalService(Employee_Titles_HistoryLocalServiceUtil.getService());
        setClass(Employee_Titles_History.class);

        setClassLoader(vn.com.ecopharma.hrm.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("employee_Titles_HistoryId");
    }
}
