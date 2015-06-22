package vn.com.ecopharma.hrm.service.impl;

import java.util.Date;
import java.util.List;

import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.service.ServiceContext;

import vn.com.ecopharma.hrm.model.SubUnit;
import vn.com.ecopharma.hrm.service.base.SubUnitLocalServiceBaseImpl;

/**
 * The implementation of the sub unit local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link vn.com.ecopharma.hrm.service.SubUnitLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author tvt
 * @see vn.com.ecopharma.hrm.service.base.SubUnitLocalServiceBaseImpl
 * @see vn.com.ecopharma.hrm.service.SubUnitLocalServiceUtil
 */
public class SubUnitLocalServiceImpl extends SubUnitLocalServiceBaseImpl {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never reference this interface directly. Always use {@link vn.com.ecopharma.hrm.service.SubUnitLocalServiceUtil} to access the sub unit local service.
     */
	public List<SubUnit> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS);
	}
	
	
	public List<SubUnit> findAll(int start, int end) throws SystemException {
		return findAll(start, end, null);
	}
	
	public List<SubUnit> findAll(int start, int end, OrderByComparator orderByComparator) throws SystemException {
		return subUnitPersistence.findAll(start, end, orderByComparator);
	}
	
	public SubUnit create(String name, long userId, ServiceContext serviceContext) throws SystemException {
		SubUnit subUnit = subUnitPersistence.create(counterLocalService.increment());
		subUnit.setName(name);
		subUnit.setUserId(userId);
		subUnit.setGroupId(serviceContext.getScopeGroupId());
		subUnit.setCompanyId(serviceContext.getCompanyId());
		subUnit.setCreateDate(new Date(System.currentTimeMillis()));
		subUnit.setModifiedDate(new Date(System.currentTimeMillis()));
		subUnit = subUnitPersistence.update(subUnit);
		return subUnit;
	}
	
}
