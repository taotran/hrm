package vn.com.ecopharma.hrm.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link FileAttachmentService}.
 *
 * @author tvt
 * @see FileAttachmentService
 * @generated
 */
public class FileAttachmentServiceWrapper implements FileAttachmentService,
    ServiceWrapper<FileAttachmentService> {
    private FileAttachmentService _fileAttachmentService;

    public FileAttachmentServiceWrapper(
        FileAttachmentService fileAttachmentService) {
        _fileAttachmentService = fileAttachmentService;
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _fileAttachmentService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _fileAttachmentService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _fileAttachmentService.invokeMethod(name, parameterTypes,
            arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public FileAttachmentService getWrappedFileAttachmentService() {
        return _fileAttachmentService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedFileAttachmentService(
        FileAttachmentService fileAttachmentService) {
        _fileAttachmentService = fileAttachmentService;
    }

    @Override
    public FileAttachmentService getWrappedService() {
        return _fileAttachmentService;
    }

    @Override
    public void setWrappedService(FileAttachmentService fileAttachmentService) {
        _fileAttachmentService = fileAttachmentService;
    }
}
