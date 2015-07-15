package vn.com.ecopharma.hrm.service.impl;

import java.util.List;

import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.service.ServiceContext;

import vn.com.ecopharma.hrm.model.University;
import vn.com.ecopharma.hrm.service.base.UniversityLocalServiceBaseImpl;

/**
 * The implementation of the university local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link vn.com.ecopharma.hrm.service.UniversityLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author tvt
 * @see vn.com.ecopharma.hrm.service.base.UniversityLocalServiceBaseImpl
 * @see vn.com.ecopharma.hrm.service.UniversityLocalServiceUtil
 */
public class UniversityLocalServiceImpl extends UniversityLocalServiceBaseImpl {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never reference this interface directly. Always use {@link vn.com.ecopharma.hrm.service.UniversityLocalServiceUtil} to access the university local service.
     */
	public List<University> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS);
	}
	
	public List<University> findAll(int start, int end) throws SystemException {
		return findAll(start, end, null);
	}
	
	public List<University> findAll(int start, int end, OrderByComparator orderByComparator) throws SystemException {
		return universityPersistence.findAll(start, end, orderByComparator);
	}

	public University addUniversity(String name, String code, String tel_fax, ServiceContext serviceContext) throws SystemException {
		long id = counterLocalService.increment();
		University university = universityPersistence.create(id);
		university.setName(name);
		university.setCode(code);
		university.setTel_fax(tel_fax);
		university.setGroupId(serviceContext.getScopeGroupId());
		university.setCompanyId(serviceContext.getCompanyId());
		university.setUserId(serviceContext.getUserId());
		university = universityPersistence.update(university);
		return university;
	}
}
