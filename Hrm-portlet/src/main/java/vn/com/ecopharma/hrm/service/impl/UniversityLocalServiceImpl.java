package vn.com.ecopharma.hrm.service.impl;

import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;

import com.liferay.portal.kernel.dao.orm.Criterion;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.OrderFactoryUtil;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.RestrictionsFactoryUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PortalClassLoaderUtil;
import com.liferay.portal.service.ServiceContext;

import vn.com.ecopharma.hrm.model.University;
import vn.com.ecopharma.hrm.model.impl.UniversityImpl;
import vn.com.ecopharma.hrm.service.base.UniversityLocalServiceBaseImpl;
import vn.com.ecopharma.hrm.service.persistence.UniversityFinderImpl;
import vn.com.ecopharma.hrm.service.persistence.UniversityFinderUtil;

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
	
	@SuppressWarnings("unchecked")
	public JSONArray filterUniversitiesByTermDynamicQuery(String term, int start, int end) throws SystemException {
		System.out.println("TERM: " + term);
		System.out.println("start: " + start);
		System.out.println("end: " + end);
		final DynamicQuery query = DynamicQueryFactoryUtil.forClass(UniversityImpl.class, PortalClassLoaderUtil.getClassLoader());
		
		Criterion crit = null;
		
		crit = RestrictionsFactoryUtil.like("name", "%" + term + "%");
		
		query.add(crit);
		query.addOrder(OrderFactoryUtil.asc("name"));
		query.setLimit(start, end);
		System.out.println("SIZE: " + userLocalService.dynamicQueryCount(query));
		System.out.println("SIZE: " + findAll(start, end).size());
		final JSONArray resultArr = new JSONArray();
		for (University u: (java.util.List<UniversityImpl>)userLocalService.dynamicQuery(query)) {
			final JSONObject uObj = new JSONObject();
			uObj.put("id", u.getUniversityId());
			uObj.put("text", u.getName());
			resultArr.put(uObj);
		}
		return resultArr;
	}
	
	public int filterUniversitiesByTermSizeDynamicQuery(String term) throws SystemException {
		return filterUniversitiesByTerm(term, QueryUtil.ALL_POS, QueryUtil.ALL_POS).length();
	}
	
	
	public JSONArray filterUniversitiesByTerm(String term, int start, int end) {
		return UniversityFinderUtil.filterUniversitiesByTerm(term, start, end);
	}
	
	public int filterUniversitiesByTermSize(String term) {
		return UniversityFinderUtil.filterUniversitiesByTermSize(term);
	}
	
	
	public int countAll() throws SystemException {
		return universityPersistence.countAll();
	}
}
