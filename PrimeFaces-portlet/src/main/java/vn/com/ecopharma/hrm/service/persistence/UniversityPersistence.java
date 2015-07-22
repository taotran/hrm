package vn.com.ecopharma.hrm.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import vn.com.ecopharma.hrm.model.University;

/**
 * The persistence interface for the university service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author tvt
 * @see UniversityPersistenceImpl
 * @see UniversityUtil
 * @generated
 */
public interface UniversityPersistence extends BasePersistence<University> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link UniversityUtil} to access the university persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Caches the university in the entity cache if it is enabled.
    *
    * @param university the university
    */
    public void cacheResult(vn.com.ecopharma.hrm.model.University university);

    /**
    * Caches the universities in the entity cache if it is enabled.
    *
    * @param universities the universities
    */
    public void cacheResult(
        java.util.List<vn.com.ecopharma.hrm.model.University> universities);

    /**
    * Creates a new university with the primary key. Does not add the university to the database.
    *
    * @param universityId the primary key for the new university
    * @return the new university
    */
    public vn.com.ecopharma.hrm.model.University create(long universityId);

    /**
    * Removes the university with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param universityId the primary key of the university
    * @return the university that was removed
    * @throws vn.com.ecopharma.hrm.NoSuchUniversityException if a university with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public vn.com.ecopharma.hrm.model.University remove(long universityId)
        throws com.liferay.portal.kernel.exception.SystemException,
            vn.com.ecopharma.hrm.NoSuchUniversityException;

    public vn.com.ecopharma.hrm.model.University updateImpl(
        vn.com.ecopharma.hrm.model.University university)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the university with the primary key or throws a {@link vn.com.ecopharma.hrm.NoSuchUniversityException} if it could not be found.
    *
    * @param universityId the primary key of the university
    * @return the university
    * @throws vn.com.ecopharma.hrm.NoSuchUniversityException if a university with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public vn.com.ecopharma.hrm.model.University findByPrimaryKey(
        long universityId)
        throws com.liferay.portal.kernel.exception.SystemException,
            vn.com.ecopharma.hrm.NoSuchUniversityException;

    /**
    * Returns the university with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param universityId the primary key of the university
    * @return the university, or <code>null</code> if a university with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public vn.com.ecopharma.hrm.model.University fetchByPrimaryKey(
        long universityId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the universities.
    *
    * @return the universities
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<vn.com.ecopharma.hrm.model.University> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the universities.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.com.ecopharma.hrm.model.impl.UniversityModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of universities
    * @param end the upper bound of the range of universities (not inclusive)
    * @return the range of universities
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<vn.com.ecopharma.hrm.model.University> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the universities.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.com.ecopharma.hrm.model.impl.UniversityModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of universities
    * @param end the upper bound of the range of universities (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of universities
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<vn.com.ecopharma.hrm.model.University> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the universities from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of universities.
    *
    * @return the number of universities
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}
