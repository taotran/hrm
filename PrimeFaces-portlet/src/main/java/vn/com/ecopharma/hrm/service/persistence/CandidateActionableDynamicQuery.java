package vn.com.ecopharma.hrm.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

import vn.com.ecopharma.hrm.model.Candidate;
import vn.com.ecopharma.hrm.service.CandidateLocalServiceUtil;

/**
 * @author tvt
 * @generated
 */
public abstract class CandidateActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public CandidateActionableDynamicQuery() throws SystemException {
        setBaseLocalService(CandidateLocalServiceUtil.getService());
        setClass(Candidate.class);

        setClassLoader(vn.com.ecopharma.hrm.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("c_id");
    }
}
