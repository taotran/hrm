package vn.com.ecopharma.hrm.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

import vn.com.ecopharma.hrm.model.Level;
import vn.com.ecopharma.hrm.service.LevelLocalServiceUtil;

/**
 * @author tvt
 * @generated
 */
public abstract class LevelActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public LevelActionableDynamicQuery() throws SystemException {
        setBaseLocalService(LevelLocalServiceUtil.getService());
        setClass(Level.class);

        setClassLoader(vn.com.ecopharma.hrm.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("levelId");
    }
}
