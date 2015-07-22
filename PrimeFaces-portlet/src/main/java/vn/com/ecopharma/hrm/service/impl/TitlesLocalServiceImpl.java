package vn.com.ecopharma.hrm.service.impl;

import java.util.List;

import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;

import vn.com.ecopharma.hrm.model.Titles;
import vn.com.ecopharma.hrm.service.base.TitlesLocalServiceBaseImpl;

/**
 * The implementation of the titles local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link vn.com.ecopharma.hrm.service.TitlesLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author tvt
 * @see vn.com.ecopharma.hrm.service.base.TitlesLocalServiceBaseImpl
 * @see vn.com.ecopharma.hrm.service.TitlesLocalServiceUtil
 */
public class TitlesLocalServiceImpl extends TitlesLocalServiceBaseImpl {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never reference this interface directly. Always use {@link vn.com.ecopharma.hrm.service.TitlesLocalServiceUtil} to access the titles local service.
     */
	public List<Titles> findAll() {
		try {
			return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS);
		} catch (SystemException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public List<Titles> findAll(int start, int end) throws SystemException {
		return findAll(start, end, null);
	}
	
	public List<Titles> findAll(int start, int end, OrderByComparator orderByComparator) throws SystemException {
		return titlesPersistence.findAll(start, end, orderByComparator);
	}
	
}
