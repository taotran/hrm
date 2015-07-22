package vn.com.ecopharma.hrm.search;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Locale;

import javax.portlet.PortletURL;

import vn.com.ecopharma.hrm.model.Employee;
import vn.com.ecopharma.hrm.service.EmployeeLocalServiceUtil;
import vn.com.ecopharma.hrm.service.EmpoyeeModelPermission;
import vn.com.ecopharma.hrm.service.persistence.EmployeeActionableDynamicQuery;

import com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.search.BaseIndexer;
import com.liferay.portal.kernel.search.Document;
import com.liferay.portal.kernel.search.Field;
import com.liferay.portal.kernel.search.SearchContext;
import com.liferay.portal.kernel.search.SearchEngineUtil;
import com.liferay.portal.kernel.search.Summary;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.security.permission.ActionKeys;
import com.liferay.portal.security.permission.PermissionChecker;
import com.liferay.portal.service.UserLocalServiceUtil;

public class EmployeeIndexer extends BaseIndexer {
	private static final String PORTLET_ID = "Primefaces-portlet";

	public static final String[] CLASS_NAMES = { Employee.class.getName() };

	public EmployeeIndexer() {
		setPermissionAware(true);
	}

	@Override
	public String[] getClassNames() {
		return CLASS_NAMES;
	}

	@Override
	public String getPortletId() {
		return PORTLET_ID;
	}

	@Override
	protected void doDelete(Object obj) throws Exception {
		Employee emp = (Employee) obj;
		emp.setIsDeleted(true);
	}

	@Override
	protected Document doGetDocument(Object obj) throws Exception {
		Employee emp = (Employee) obj;
		Document document = getBaseModelDocument(PORTLET_ID, emp);
		document.addNumber(EmployeeField.EMPLOYEE_ID, emp.getEmployeeId());
		document.addNumber(EmployeeField.EMPLOYEE_USER_ID, emp.getEmployee_userId());
		document.addText(EmployeeField.FULL_NAME, UserLocalServiceUtil.getUser(emp.getEmployee_userId()).getFullName());
		document.addDate(Field.MODIFIED_DATE, emp.getModifiedDate());
		document.addText(EmployeeField.EMPLOYEE_CODE, emp.getEmp_code());
		document.addDate(EmployeeField.BIRTHDAY, emp.getBirthday());
		document.addKeyword(Field.GROUP_ID, getSiteGroupId(emp.getGroupId()));
		document.addKeyword(Field.SCOPE_GROUP_ID, emp.getGroupId());
		return document;
	}

	@Override
	protected Summary doGetSummary(Document document, Locale locale,
			String snippet, PortletURL portletURL) throws Exception {
		Summary summary = createSummary(document);
		summary.setMaxContentLength(200);
		return summary;
	}

	@Override
	protected void doReindex(Object obj) throws Exception {
		Employee employee = (Employee) obj;
		Document document = getDocument(employee);

		SearchEngineUtil.updateDocument(getSearchEngineId(),
				employee.getCompanyId(), document);

	}

	@Override
	protected void doReindex(String className, long classPK) throws Exception {
		Employee employee = EmployeeLocalServiceUtil.getEmployee(classPK);
		doReindex(employee);
	}

	@Override
	protected void doReindex(String[] ids) throws Exception {
		long companyId = GetterUtil.getLong(ids[0]);
		reindexEmployees(companyId);
	}

	protected void reindexEmployees(long companyId) throws SystemException,
			PortalException {
		final Collection<Document> documents = new ArrayList<Document>();

		ActionableDynamicQuery actionableDynamicQuery = new EmployeeActionableDynamicQuery() {

			@Override
			protected void addCriteria(DynamicQuery dynamicQuery) {
				super.addCriteria(dynamicQuery);
			}

			@Override
			protected void performAction(Object object) throws PortalException,
					SystemException {
				Employee employee = (Employee) object;
				Document document = getDocument(employee);
				documents.add(document);
			}
		};

		actionableDynamicQuery.setCompanyId(companyId);
		actionableDynamicQuery.performActions();
		SearchEngineUtil.updateDocuments(getSearchEngineId(), companyId,
				documents);
	}

	@Override
	protected String getPortletId(SearchContext searchContext) {
		return PORTLET_ID;
	}

	@Override
	public boolean hasPermission(PermissionChecker permissionChecker,
			String entryClassName, long entryClassPK, String actionId)
			throws Exception {
		return EmpoyeeModelPermission.contains(permissionChecker, entryClassPK,
				ActionKeys.VIEW);
		/*
		 * return super.hasPermission(permissionChecker, entryClassName,
		 * entryClassPK, actionId);
		 */
	}

}
