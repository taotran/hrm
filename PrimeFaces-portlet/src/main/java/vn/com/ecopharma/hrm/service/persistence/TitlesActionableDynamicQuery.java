package vn.com.ecopharma.hrm.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

import vn.com.ecopharma.hrm.model.Titles;
import vn.com.ecopharma.hrm.service.TitlesLocalServiceUtil;

/**
 * @author tvt
 * @generated
 */
public abstract class TitlesActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public TitlesActionableDynamicQuery() throws SystemException {
        setBaseLocalService(TitlesLocalServiceUtil.getService());
        setClass(Titles.class);

        setClassLoader(vn.com.ecopharma.hrm.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("titlesId");
    }
}
