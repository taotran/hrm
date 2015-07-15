package vn.com.ecopharma.hrm.service.impl;

import java.util.List;

import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.service.ServiceContext;

import vn.com.ecopharma.hrm.model.Employee_Titles_History;
import vn.com.ecopharma.hrm.model.JTitle;
import vn.com.ecopharma.hrm.service.base.Employee_Titles_HistoryLocalServiceBaseImpl;

/**
 * The implementation of the employee_ titles_ history local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are
 * added, rerun ServiceBuilder to copy their definitions into the
 * {@link vn.com.ecopharma.hrm.service.Employee_Titles_HistoryLocalService}
 * interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security
 * checks based on the propagated JAAS credentials because this service can only
 * be accessed from within the same VM.
 * </p>
 *
 * @author tvt
 * @see vn.com.ecopharma.hrm.service.base.Employee_Titles_HistoryLocalServiceBaseImpl
 * @see vn.com.ecopharma.hrm.service.Employee_Titles_HistoryLocalServiceUtil
 */
public class Employee_Titles_HistoryLocalServiceImpl extends
		Employee_Titles_HistoryLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 * 
	 * Never reference this interface directly. Always use {@link
	 * vn.com.ecopharma.hrm.service.Employee_Titles_HistoryLocalServiceUtil} to
	 * access the employee_ titles_ history local service.
	 */
	public List<Employee_Titles_History> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS);
	}

	public List<Employee_Titles_History> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	public List<Employee_Titles_History> findAll(int start, int end,
			OrderByComparator orderByComparator) {
		try {
			return employee_Titles_HistoryPersistence.findAll(start, end,
					orderByComparator);
		} catch (SystemException e) {
			e.printStackTrace();
		}
		return null;
	}

	public Employee_Titles_History addEmployee_Titles_History(long employeeId,
			long titlesId, String note, java.util.Date set_date, ServiceContext serviceContext)
			throws SystemException {
		Employee_Titles_History model = employee_Titles_HistoryPersistence
				.create(counterLocalService.increment());

		model.setEmployeeId(employeeId);
		model.setTitlesId(titlesId);
		model.setNote(note);
		model.setSet_date(set_date);

		model = employee_Titles_HistoryPersistence.update(model);

		return model;
	}

}
