package vn.com.ecopharma.hrm.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

import vn.com.ecopharma.hrm.model.FileAttachment;
import vn.com.ecopharma.hrm.service.FileAttachmentLocalServiceUtil;

/**
 * @author tvt
 * @generated
 */
public abstract class FileAttachmentActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public FileAttachmentActionableDynamicQuery() throws SystemException {
        setBaseLocalService(FileAttachmentLocalServiceUtil.getService());
        setClass(FileAttachment.class);

        setClassLoader(vn.com.ecopharma.hrm.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("f_id");
    }
}
