package vn.com.ecopharma.hrm.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

import vn.com.ecopharma.hrm.model.VacancyCandidate;
import vn.com.ecopharma.hrm.service.VacancyCandidateLocalServiceUtil;

/**
 * @author tvt
 * @generated
 */
public abstract class VacancyCandidateActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public VacancyCandidateActionableDynamicQuery() throws SystemException {
        setBaseLocalService(VacancyCandidateLocalServiceUtil.getService());
        setClass(VacancyCandidate.class);

        setClassLoader(vn.com.ecopharma.hrm.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("vacancyCandidateId");
    }
}
