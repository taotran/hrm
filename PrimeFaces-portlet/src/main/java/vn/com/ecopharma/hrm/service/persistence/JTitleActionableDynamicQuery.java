package vn.com.ecopharma.hrm.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

import vn.com.ecopharma.hrm.model.JTitle;
import vn.com.ecopharma.hrm.service.JTitleLocalServiceUtil;

/**
 * @author tvt
 * @generated
 */
public abstract class JTitleActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public JTitleActionableDynamicQuery() throws SystemException {
        setBaseLocalService(JTitleLocalServiceUtil.getService());
        setClass(JTitle.class);

        setClassLoader(vn.com.ecopharma.hrm.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("jobtitleId");
    }
}
