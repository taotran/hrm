package vn.com.ecopharma.hrm.service.impl;

import java.util.List;

import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.model.User;
import com.liferay.portal.service.ServiceContext;

import vn.com.ecopharma.hrm.NoSuchJTitleException;
import vn.com.ecopharma.hrm.model.JTitle;
import vn.com.ecopharma.hrm.service.base.JTitleLocalServiceBaseImpl;

/**
 * The implementation of the j title local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are
 * added, rerun ServiceBuilder to copy their definitions into the
 * {@link vn.com.ecopharma.hrm.service.JTitleLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security
 * checks based on the propagated JAAS credentials because this service can only
 * be accessed from within the same VM.
 * </p>
 *
 * @author tvt
 * @see vn.com.ecopharma.hrm.service.base.JTitleLocalServiceBaseImpl
 * @see vn.com.ecopharma.hrm.service.JTitleLocalServiceUtil
 */
public class JTitleLocalServiceImpl extends JTitleLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 * 
	 * Never reference this interface directly. Always use {@link
	 * vn.com.ecopharma.hrm.service.JTitleLocalServiceUtil} to access the j
	 * title local service.
	 */
	public List<JTitle> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS);
	}

	public List<JTitle> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	public List<JTitle> findAll(int start, int end,
			OrderByComparator orderByComparator) {
		try {
			return jTitlePersistence.findAll(start, end, orderByComparator);
		} catch (SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public JTitle create(long user_Id, long group_Id, String title,
			String description, String note, boolean isDeleted,
			ServiceContext serviceContext) {
		try {
			long j_id = counterLocalService.increment();
			JTitle jTitle = jTitlePersistence.create(j_id);
			User user = userPersistence.fetchByPrimaryKey(user_Id);
			jTitle.setTitle(title);
			jTitle.setDescription(description);
			jTitle.setNote(note);
			jTitle.setIsDeleted(isDeleted);
			jTitle.setUserId(user_Id);
			jTitle.setGroupId(serviceContext.getScopeGroupId());
			jTitlePersistence.update(jTitle);
			return jTitle;
		} catch (SystemException e) {
			e.printStackTrace();
		}
		return null;
	}

	public JTitle edit(long user_Id, long group_Id, long j_id, String title,
			String description, String note, boolean isDeleted,
			ServiceContext serviceContext) {
		try {
			JTitle jTitle = jTitlePersistence.fetchByPrimaryKey(j_id);
			jTitle.setTitle(title);
			jTitle.setDescription(description);
			jTitle.setNote(note);
			jTitle.setIsDeleted(isDeleted);
			jTitlePersistence.update(jTitle);
			return jTitle;
		} catch (SystemException e) {
			e.printStackTrace();
		}
		return null;

	}

	public void delete(long jobtitleId) {
		try {
			jTitlePersistence.remove(jobtitleId);
		} catch (NoSuchJTitleException e) {
			e.printStackTrace();
		} catch (SystemException e) {
			e.printStackTrace();
		}
	}
}
