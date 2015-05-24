package vn.com.ecopharma.hrm.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

import vn.com.ecopharma.hrm.model.Interview;
import vn.com.ecopharma.hrm.service.InterviewLocalServiceUtil;

/**
 * @author tvt
 * @generated
 */
public abstract class InterviewActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public InterviewActionableDynamicQuery() throws SystemException {
        setBaseLocalService(InterviewLocalServiceUtil.getService());
        setClass(Interview.class);

        setClassLoader(vn.com.ecopharma.hrm.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("interviewId");
    }
}
