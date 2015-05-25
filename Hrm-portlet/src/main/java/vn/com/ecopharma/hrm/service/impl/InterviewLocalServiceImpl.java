package vn.com.ecopharma.hrm.service.impl;

import java.util.List;

import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.service.ServiceContext;

import vn.com.ecopharma.hrm.model.Interview;
import vn.com.ecopharma.hrm.service.base.InterviewLocalServiceBaseImpl;

/**
 * The implementation of the interview local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link vn.com.ecopharma.hrm.service.InterviewLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author tvt
 * @see vn.com.ecopharma.hrm.service.base.InterviewLocalServiceBaseImpl
 * @see vn.com.ecopharma.hrm.service.InterviewLocalServiceUtil
 */
public class InterviewLocalServiceImpl extends InterviewLocalServiceBaseImpl {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never reference this interface directly. Always use {@link vn.com.ecopharma.hrm.service.InterviewLocalServiceUtil} to access the interview local service.
     */
	
	public List<Interview> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS);
	}
	
	public List<Interview> findAll(int start, int end) {
		return findAll(start, end, null);
	}
	
	public List<Interview> findAll(int start, int end, OrderByComparator orderByComparator) {
		try {
			return interviewPersistence.findAll(start, end, orderByComparator);
		} catch (SystemException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public Interview create(long userId, String name,
			ServiceContext serviceContext) {
		try {
			final Interview itv = interviewPersistence.create(counterLocalService.increment());
			itv.setName(name);
			itv.setUserId(userId);
			itv.setGroupId(serviceContext.getScopeGroupId());
			itv.setCompanyId(serviceContext.getCompanyId());
			itv.setCreateDate(new java.util.Date(System.currentTimeMillis()));
			interviewPersistence.update(itv);
			return itv;
		} catch (SystemException e) {
			e.printStackTrace();
		}
		
		return null;
	}
}
