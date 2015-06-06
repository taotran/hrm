package vn.com.ecopharma.hrm.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

import vn.com.ecopharma.hrm.model.CandidateHistory;
import vn.com.ecopharma.hrm.service.CandidateHistoryLocalServiceUtil;

/**
 * @author tvt
 * @generated
 */
public abstract class CandidateHistoryActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public CandidateHistoryActionableDynamicQuery() throws SystemException {
        setBaseLocalService(CandidateHistoryLocalServiceUtil.getService());
        setClass(CandidateHistory.class);

        setClassLoader(vn.com.ecopharma.hrm.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("candidateHistoryId");
    }
}
