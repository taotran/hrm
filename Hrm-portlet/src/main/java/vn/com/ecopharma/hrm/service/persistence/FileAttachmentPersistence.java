package vn.com.ecopharma.hrm.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import vn.com.ecopharma.hrm.model.FileAttachment;

/**
 * The persistence interface for the file attachment service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author tvt
 * @see FileAttachmentPersistenceImpl
 * @see FileAttachmentUtil
 * @generated
 */
public interface FileAttachmentPersistence extends BasePersistence<FileAttachment> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link FileAttachmentUtil} to access the file attachment persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Caches the file attachment in the entity cache if it is enabled.
    *
    * @param fileAttachment the file attachment
    */
    public void cacheResult(
        vn.com.ecopharma.hrm.model.FileAttachment fileAttachment);

    /**
    * Caches the file attachments in the entity cache if it is enabled.
    *
    * @param fileAttachments the file attachments
    */
    public void cacheResult(
        java.util.List<vn.com.ecopharma.hrm.model.FileAttachment> fileAttachments);

    /**
    * Creates a new file attachment with the primary key. Does not add the file attachment to the database.
    *
    * @param f_id the primary key for the new file attachment
    * @return the new file attachment
    */
    public vn.com.ecopharma.hrm.model.FileAttachment create(long f_id);

    /**
    * Removes the file attachment with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param f_id the primary key of the file attachment
    * @return the file attachment that was removed
    * @throws vn.com.ecopharma.hrm.NoSuchFileAttachmentException if a file attachment with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public vn.com.ecopharma.hrm.model.FileAttachment remove(long f_id)
        throws com.liferay.portal.kernel.exception.SystemException,
            vn.com.ecopharma.hrm.NoSuchFileAttachmentException;

    public vn.com.ecopharma.hrm.model.FileAttachment updateImpl(
        vn.com.ecopharma.hrm.model.FileAttachment fileAttachment)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the file attachment with the primary key or throws a {@link vn.com.ecopharma.hrm.NoSuchFileAttachmentException} if it could not be found.
    *
    * @param f_id the primary key of the file attachment
    * @return the file attachment
    * @throws vn.com.ecopharma.hrm.NoSuchFileAttachmentException if a file attachment with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public vn.com.ecopharma.hrm.model.FileAttachment findByPrimaryKey(long f_id)
        throws com.liferay.portal.kernel.exception.SystemException,
            vn.com.ecopharma.hrm.NoSuchFileAttachmentException;

    /**
    * Returns the file attachment with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param f_id the primary key of the file attachment
    * @return the file attachment, or <code>null</code> if a file attachment with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public vn.com.ecopharma.hrm.model.FileAttachment fetchByPrimaryKey(
        long f_id) throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the file attachments.
    *
    * @return the file attachments
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<vn.com.ecopharma.hrm.model.FileAttachment> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the file attachments.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.com.ecopharma.hrm.model.impl.FileAttachmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of file attachments
    * @param end the upper bound of the range of file attachments (not inclusive)
    * @return the range of file attachments
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<vn.com.ecopharma.hrm.model.FileAttachment> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the file attachments.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.com.ecopharma.hrm.model.impl.FileAttachmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of file attachments
    * @param end the upper bound of the range of file attachments (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of file attachments
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<vn.com.ecopharma.hrm.model.FileAttachment> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the file attachments from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of file attachments.
    *
    * @return the number of file attachments
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}
