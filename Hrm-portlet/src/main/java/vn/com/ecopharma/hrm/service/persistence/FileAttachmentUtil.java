package vn.com.ecopharma.hrm.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import vn.com.ecopharma.hrm.model.FileAttachment;

import java.util.List;

/**
 * The persistence utility for the file attachment service. This utility wraps {@link FileAttachmentPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author tvt
 * @see FileAttachmentPersistence
 * @see FileAttachmentPersistenceImpl
 * @generated
 */
public class FileAttachmentUtil {
    private static FileAttachmentPersistence _persistence;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
     */
    public static void clearCache() {
        getPersistence().clearCache();
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
     */
    public static void clearCache(FileAttachment fileAttachment) {
        getPersistence().clearCache(fileAttachment);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
     */
    public static long countWithDynamicQuery(DynamicQuery dynamicQuery)
        throws SystemException {
        return getPersistence().countWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
     */
    public static List<FileAttachment> findWithDynamicQuery(
        DynamicQuery dynamicQuery) throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<FileAttachment> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<FileAttachment> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
     */
    public static FileAttachment update(FileAttachment fileAttachment)
        throws SystemException {
        return getPersistence().update(fileAttachment);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
     */
    public static FileAttachment update(FileAttachment fileAttachment,
        ServiceContext serviceContext) throws SystemException {
        return getPersistence().update(fileAttachment, serviceContext);
    }

    /**
    * Caches the file attachment in the entity cache if it is enabled.
    *
    * @param fileAttachment the file attachment
    */
    public static void cacheResult(
        vn.com.ecopharma.hrm.model.FileAttachment fileAttachment) {
        getPersistence().cacheResult(fileAttachment);
    }

    /**
    * Caches the file attachments in the entity cache if it is enabled.
    *
    * @param fileAttachments the file attachments
    */
    public static void cacheResult(
        java.util.List<vn.com.ecopharma.hrm.model.FileAttachment> fileAttachments) {
        getPersistence().cacheResult(fileAttachments);
    }

    /**
    * Creates a new file attachment with the primary key. Does not add the file attachment to the database.
    *
    * @param f_id the primary key for the new file attachment
    * @return the new file attachment
    */
    public static vn.com.ecopharma.hrm.model.FileAttachment create(long f_id) {
        return getPersistence().create(f_id);
    }

    /**
    * Removes the file attachment with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param f_id the primary key of the file attachment
    * @return the file attachment that was removed
    * @throws vn.com.ecopharma.hrm.NoSuchFileAttachmentException if a file attachment with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static vn.com.ecopharma.hrm.model.FileAttachment remove(long f_id)
        throws com.liferay.portal.kernel.exception.SystemException,
            vn.com.ecopharma.hrm.NoSuchFileAttachmentException {
        return getPersistence().remove(f_id);
    }

    public static vn.com.ecopharma.hrm.model.FileAttachment updateImpl(
        vn.com.ecopharma.hrm.model.FileAttachment fileAttachment)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(fileAttachment);
    }

    /**
    * Returns the file attachment with the primary key or throws a {@link vn.com.ecopharma.hrm.NoSuchFileAttachmentException} if it could not be found.
    *
    * @param f_id the primary key of the file attachment
    * @return the file attachment
    * @throws vn.com.ecopharma.hrm.NoSuchFileAttachmentException if a file attachment with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static vn.com.ecopharma.hrm.model.FileAttachment findByPrimaryKey(
        long f_id)
        throws com.liferay.portal.kernel.exception.SystemException,
            vn.com.ecopharma.hrm.NoSuchFileAttachmentException {
        return getPersistence().findByPrimaryKey(f_id);
    }

    /**
    * Returns the file attachment with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param f_id the primary key of the file attachment
    * @return the file attachment, or <code>null</code> if a file attachment with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static vn.com.ecopharma.hrm.model.FileAttachment fetchByPrimaryKey(
        long f_id) throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(f_id);
    }

    /**
    * Returns all the file attachments.
    *
    * @return the file attachments
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<vn.com.ecopharma.hrm.model.FileAttachment> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
    }

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
    public static java.util.List<vn.com.ecopharma.hrm.model.FileAttachment> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
    }

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
    public static java.util.List<vn.com.ecopharma.hrm.model.FileAttachment> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the file attachments from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of file attachments.
    *
    * @return the number of file attachments
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    public static FileAttachmentPersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (FileAttachmentPersistence) PortletBeanLocatorUtil.locate(vn.com.ecopharma.hrm.service.ClpSerializer.getServletContextName(),
                    FileAttachmentPersistence.class.getName());

            ReferenceRegistry.registerReference(FileAttachmentUtil.class,
                "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setPersistence(FileAttachmentPersistence persistence) {
    }
}
