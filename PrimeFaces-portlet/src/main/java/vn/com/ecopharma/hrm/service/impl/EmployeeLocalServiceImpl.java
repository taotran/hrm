package vn.com.ecopharma.hrm.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import vn.com.ecopharma.hrm.model.Employee;
import vn.com.ecopharma.hrm.model.JTitle;
import vn.com.ecopharma.hrm.model.Level;
import vn.com.ecopharma.hrm.model.SubUnit;
import vn.com.ecopharma.hrm.model.Titles;
import vn.com.ecopharma.hrm.model.University;
import vn.com.ecopharma.hrm.search.EmployeeField;
import vn.com.ecopharma.hrm.service.EmployeeLocalServiceUtil;
import vn.com.ecopharma.hrm.service.base.EmployeeLocalServiceBaseImpl;
import vn.com.ecopharma.hrm.service.persistence.EmployeeFinderUtil;
import vn.com.taotv.primefaces.modelView.item.AddressObjectItem;
import vn.com.taotv.primefaces.modelView.item.EmployeeIndexedItem;

import com.liferay.faces.util.logging.Logger;
import com.liferay.faces.util.logging.LoggerFactory;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.search.BooleanClauseOccur;
import com.liferay.portal.kernel.search.BooleanQuery;
import com.liferay.portal.kernel.search.BooleanQueryFactoryUtil;
import com.liferay.portal.kernel.search.Document;
import com.liferay.portal.kernel.search.Field;
import com.liferay.portal.kernel.search.Hits;
import com.liferay.portal.kernel.search.Indexer;
import com.liferay.portal.kernel.search.IndexerRegistryUtil;
import com.liferay.portal.kernel.search.ParseException;
import com.liferay.portal.kernel.search.Query;
import com.liferay.portal.kernel.search.SearchContext;
import com.liferay.portal.kernel.search.SearchEngineUtil;
import com.liferay.portal.kernel.search.SearchException;
import com.liferay.portal.kernel.search.Sort;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.model.User;
import com.liferay.portal.service.AddressLocalServiceUtil;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.service.UserLocalServiceUtil;

/**
 * The implementation of the employee local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are
 * added, rerun ServiceBuilder to copy their definitions into the
 * {@link vn.com.ecopharma.hrm.service.EmployeeLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security
 * checks based on the propagated JAAS credentials because this service can only
 * be accessed from within the same VM.
 * </p>
 *
 * @author tvt
 * @see vn.com.ecopharma.hrm.service.base.EmployeeLocalServiceBaseImpl
 * @see vn.com.ecopharma.hrm.service.EmployeeLocalServiceUtil
 */
public class EmployeeLocalServiceImpl extends EmployeeLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 * 
	 * Never reference this interface directly. Always use {@link
	 * vn.com.ecopharma.hrm.service.EmployeeLocalServiceUtil} to access the
	 * employee local service.
	 */

	public static final Logger LOGGER = LoggerFactory
			.getLogger(EmployeeLocalServiceImpl.class);

	public void indexAllEmployees() {
		final Indexer indexer = IndexerRegistryUtil
				.nullSafeGetIndexer(Employee.class);
		final List<Employee> allEmps = findAll();
		LOGGER.info("EMPLOYEE total size: " + allEmps.size());
		for (Employee employee : findAll()) {
			// index employee
			try {
				indexer.reindex(employee);
			} catch (SearchException e) {
				e.printStackTrace();
			}
		}
	}

	public void removeAllEmployeeIndexes(SearchContext searchContext,
			long companyId) {
		final BooleanQuery booleanQuery = BooleanQueryFactoryUtil
				.create(searchContext);
		booleanQuery.addExactTerm(Field.ENTRY_CLASS_NAME,
				Employee.class.getName());
		try {
			final Hits hits = SearchEngineUtil.search(
					SearchEngineUtil.getDefaultSearchEngineId(), companyId,
					booleanQuery, QueryUtil.ALL_POS, QueryUtil.ALL_POS);
			final List<Document> docs = hits.toList();
			for (Document doc : docs) {
				LOGGER.info("DELETE employee's Index UID: " + doc.getUID());
				SearchEngineUtil.deleteDocument(
						SearchEngineUtil.getDefaultSearchEngineId(), companyId,
						doc.getUID());

			}
		} catch (SearchException e) {
			e.printStackTrace();
		}
	}

	public int countAllIndexedEmployeeDocuments(SearchContext searchContext,
			long companyId) {
		BooleanQuery booleanQuery = BooleanQueryFactoryUtil
				.create(searchContext);
		booleanQuery.addRequiredTerm(Field.ENTRY_CLASS_NAME,
				Employee.class.getName());
		try {
			final Hits hits = SearchEngineUtil.search(
					SearchEngineUtil.getDefaultSearchEngineId(), companyId,
					booleanQuery, QueryUtil.ALL_POS, QueryUtil.ALL_POS);
			return hits.getLength();
		} catch (SearchException e) {
			e.printStackTrace();
		}
		return 0;
	}

	public int countAllUnDeletedIndexedEmployeeDocuments(
			SearchContext searchContext, List<Query> filterQueries,
			long companyId, Sort sort) {
		return searchAllUnDeletedEmployeeIndexedItems(searchContext,
				filterQueries, companyId, sort, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS).size();
	}

	public List<EmployeeIndexedItem> searchAllUnDeletedEmployeeIndexedItems(
			SearchContext searchContext, List<Query> filterQueries,
			long companyId, Sort sort, int start, int end) {
		final List<EmployeeIndexedItem> results = new ArrayList<EmployeeIndexedItem>();
		final BooleanQuery fullQuery = BooleanQueryFactoryUtil
				.create(searchContext);
		final BooleanQuery allEmployeeEntriesBooleanQuery = BooleanQueryFactoryUtil
				.create(searchContext);
		final BooleanQuery noneDeletedEmployeesBooleanQuery = BooleanQueryFactoryUtil
				.create(searchContext);

		allEmployeeEntriesBooleanQuery.addRequiredTerm(Field.ENTRY_CLASS_NAME,
				Employee.class.getName());
		noneDeletedEmployeesBooleanQuery.addExactTerm(EmployeeField.IS_DELETED,
				"false");

		try {
			// add filter queries
			fullQuery.add(allEmployeeEntriesBooleanQuery,
					BooleanClauseOccur.MUST);
			if (filterQueries != null && filterQueries.size() > 0) {
				for (Query query : filterQueries) {
					fullQuery.add(query, BooleanClauseOccur.MUST);
				}
			}

			// always filter for none-delete item
			fullQuery.add(noneDeletedEmployeesBooleanQuery,
					BooleanClauseOccur.MUST);

			System.out.println("SORT by " + sort.getFieldName() + " reverse: "
					+ sort.isReverse());

			final Hits hits = SearchEngineUtil.search(
					SearchEngineUtil.getDefaultSearchEngineId(), companyId,
					fullQuery, sort, start, end);
			for (Document document : hits.toList()) {
				EmployeeIndexedItem employeeIndexedItem = new EmployeeIndexedItem(
						document);
				results.add(employeeIndexedItem);
			}
		} catch (SearchException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return results;
	}

	public List<EmployeeIndexedItem> searchAllEmployeeIndexedItems(
			SearchContext searchContext, long companyId) {
		return searchAllEmployeeIndexedItems(searchContext, null, companyId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS);
	}

	public List<EmployeeIndexedItem> searchAllEmployeeIndexedItems(
			SearchContext searchContext, List<Query> filterQueries,
			long companyId, int start, int end) {
		Sort sort = new Sort();
		sort.setFieldName(EmployeeField.EMPLOYEE_ID);
		return searchAllEmployeeIndexedItems(searchContext, filterQueries,
				companyId, sort, start, end);
	}

	public List<EmployeeIndexedItem> searchAllEmployeeIndexedItems(
			SearchContext searchContext, List<Query> filterQueries,
			long companyId, Sort sort, int start, int end) {
		final List<EmployeeIndexedItem> results = new ArrayList<EmployeeIndexedItem>();
		final BooleanQuery fullQuery = BooleanQueryFactoryUtil
				.create(searchContext);
		final BooleanQuery allEmployeeEntriesBooleanQuery = BooleanQueryFactoryUtil
				.create(searchContext);

		allEmployeeEntriesBooleanQuery.addRequiredTerm(Field.ENTRY_CLASS_NAME,
				Employee.class.getName());

		try {
			// add filter queries
			fullQuery.add(allEmployeeEntriesBooleanQuery,
					BooleanClauseOccur.MUST);
			if (filterQueries != null && filterQueries.size() > 0) {
				for (Query query : filterQueries) {
					fullQuery.add(query, BooleanClauseOccur.MUST);
				}
			}

			// always filter for none-delete item

			System.out.println("SORT by " + sort.getFieldName() + " reverse: "
					+ sort.isReverse());

			final Hits hits = SearchEngineUtil.search(
					SearchEngineUtil.getDefaultSearchEngineId(), companyId,
					fullQuery, sort, start, end);
			for (Document document : hits.toList()) {
				EmployeeIndexedItem employeeIndexedItem = new EmployeeIndexedItem(
						document);
				results.add(employeeIndexedItem);
			}
		} catch (SearchException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return results;
	}

	public List<Employee> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS);
	}

	public List<Employee> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	public List<Employee> findAll(int start, int end,
			OrderByComparator orderByComparator) {
		try {
			return employeePersistence.findAll(start, end, orderByComparator);
		} catch (SystemException e) {
			e.printStackTrace();
		}
		return null;
	}

	public List<Employee> filterEmployees(String globStr, String fullName,
			String emp_code, String gender, String contact_number,
			String joined_date_from, String joined_date_to,
			List<String> jobTitles, Long subUnitId, String promoted_date_from,
			String promoted_date_to, int start, int end, boolean isDeleted,
			String sortField, String sortOrder) {
		return EmployeeFinderUtil.filterEmployees(globStr, fullName, emp_code,
				gender, contact_number, joined_date_from, joined_date_to,
				jobTitles, subUnitId, promoted_date_from, promoted_date_to,
				start, end, isDeleted, sortField, sortOrder);
	}

	public Employee addEmployee(long creatorUserId, long companyId,
			boolean autoPassword, String password1,
			String password2,
			boolean autoScreenName,
			String screenName,
			String emailAddress,
			long facebookId,
			String openId,
			Locale locale,
			String firstName,
			String middleName,
			String lastName,
			int prefixId,
			int suffixId,
			boolean male,
			int birthdayMonth,
			int birthdayDay,
			int birthdayYear,
			long[] groupIds,
			long[] organizationIds,
			long[] roleIds,
			long[] userGroupIds,
			boolean sendEmail, // End user part
			String emp_code,
			String contact_number,
			long jobtitleId,
			Date joined_date, //
			long subUnitId,
			long titles_id,
			long level_id,
			Date promoted_date, //
			Date labour_contract_signed_date,
			Date labour_contract_expired_date,
			String labour_contract_type, //
			String gender,
			String place_of_birth,
			String education,
			String education_specialize,
			long universityId, //
			String marital_status,
			String identityCardNo,
			Date issued_date,
			String issued_place,
			long addressId, //
			String company_email,
			String personal_tax_code,
			int number_of_dependents,
			String dependent_names, // tax & dependents
			String social_insurance_no, String health_insurance_no,
			String bank_account_no,
			String bank_branch_name, // banking & insurances
			double base_wage_rates, double position_wage_rates,
			double capacity_salary, double total_salary, double bonus, // salary
			Date resigned_date, long emp_userId, ServiceContext serviceContext)
			throws SystemException, PortalException {
		final long empId = counterLocalService.increment();
		Employee e = employeePersistence.create(empId);
		e.setEmp_code(emp_code);
		e.setContact_number(contact_number);
		e.setJobtitleId(jobtitleId);
		e.setJoined_date(joined_date);
		e.setLabour_contract_signed_date(labour_contract_signed_date);
		e.setLabour_contract_expired_date(labour_contract_expired_date);
		e.setLabour_contract_type(labour_contract_type);
		e.setGender(gender);
		e.setPlace_of_birth(place_of_birth);
		e.setEducation(education_specialize);
		e.setEducation_specialize(education_specialize);
		e.setUniversityId(universityId);
		e.setMarital_status(marital_status);
		e.setIdentityCardNo(identityCardNo);
		e.setIssued_date(issued_date);
		e.setIssued_place(issued_place);
		e.setAddressId(addressId);
		e.setCompany_email(company_email);
		e.setPersonal_tax_code(personal_tax_code);
		e.setNumber_of_dependents(number_of_dependents);
		e.setDependent_names(dependent_names);
		e.setSocial_insurance_no(social_insurance_no);
		e.setHealth_insurance_no(health_insurance_no);
		e.setBank_account_no(bank_account_no);
		e.setBank_branch_name(bank_branch_name);
		e.setBase_wage_rates(base_wage_rates);
		e.setPosition_wage_rates(position_wage_rates);
		e.setCapacity_salary(capacity_salary);
		e.setTotal_salary(total_salary);
		e.setBonus(bonus);
		e.setResigned_date(resigned_date);
		e.setUserId(serviceContext.getUserId());
		e.setGroupId(serviceContext.getScopeGroupId());
		e = employeePersistence.update(e);

		// Add User Part
		User user = UserLocalServiceUtil.addUser(creatorUserId, companyId,
				autoPassword, password1, password2, autoScreenName, screenName,
				emailAddress, facebookId, openId, locale, firstName,
				middleName, lastName, prefixId, suffixId, male, birthdayMonth,
				birthdayDay, birthdayYear,
				jTitleLocalService.getJTitle(jobtitleId).getTitle(), groupIds,
				organizationIds, roleIds, userGroupIds, sendEmail,
				serviceContext);

		e.setEmployee_userId(user.getUserId());

		return employeePersistence.update(e);
	}

	public Employee addEmployee(Employee e, long creatorUserId, long companyId,
			boolean autoPassword, String password1, String password2,
			boolean autoScreenName, String screenName, String emailAddress,
			long facebookId, String openId, Locale locale, String firstName,
			String middleName, String lastName, int prefixId, int suffixId,
			boolean male, int birthdayMonth, int birthdayDay, int birthdayYear,
			long[] groupIds, long[] organizationIds, long[] roleIds,
			long[] userGroupIds,
			boolean sendEmail, // End user part
			long emp_userId, List<AddressObjectItem> addresses,
			ServiceContext serviceContext) throws SystemException,
			PortalException {
		e.setUserId(serviceContext.getUserId());
		e.setGroupId(serviceContext.getScopeGroupId());
		e.setCompanyId(serviceContext.getCompanyId());
		e.setCreateDate(new Date(System.currentTimeMillis()));
		e.setModifiedDate(new Date(System.currentTimeMillis()));
		e = employeePersistence.update(e);

		// Add to Employee_Titles History
		employee_Titles_HistoryLocalService.addEmployee_Titles_History(
				e.getEmployeeId(), e.getTitlesId(), "FIRST PROMOTED",
				e.getPromoted_date(), serviceContext);

		// Add employee's addresses

		for (AddressObjectItem address : addresses) {
			if (!address.isUIDeleted()) {
				AddressLocalServiceUtil.addAddress(serviceContext.getUserId(),
						Employee.class.getName(), e.getEmployeeId(),
						address.getStreet1(), address.getStreet2(),
						address.getStreet3(), address.getCity(), "70000",
						address.getRegion().getRegionId(), 17L, 0, false,
						false, serviceContext);
			}
		}

		// Add User Part
		User user = UserLocalServiceUtil.addUser(creatorUserId, companyId,
				autoPassword, password1, password2, autoScreenName, screenName,
				emailAddress, facebookId, openId, locale, firstName,
				middleName, lastName, prefixId, suffixId, male, birthdayMonth,
				birthdayDay, birthdayYear,
				jTitleLocalService.getJTitle(e.getJobtitleId()).getTitle(),
				groupIds, organizationIds, roleIds, userGroupIds, sendEmail,
				serviceContext);

		e.setEmployee_userId(user.getUserId());

		// add permission
		resourceLocalService.addResources(e.getCompanyId(), e.getGroupId(),
				e.getUserId(), Employee.class.getName(), e.getEmployeeId(),
				false, true, true);

		// index new employee
		Indexer indexer = IndexerRegistryUtil
				.nullSafeGetIndexer(Employee.class);
		indexer.reindex(e);
		return employeePersistence.update(e);
	}

	public Employee update(Employee employee, User user, JTitle jTitle,
			SubUnit subUnit, Titles titles, Level level, University university,
			List<AddressObjectItem> addresses, ServiceContext serviceContext)
			throws SystemException, PortalException {
		boolean isPositionChanged = false;
		employee.setJobtitleId(jTitle != null ? jTitle.getJobtitleId() : 0);
		employee.setSubUnitId(subUnit != null ? subUnit.getSubUnitId() : 0);
		isPositionChanged = employee.getTitlesId() != titles.getTitlesId();
		employee.setTitlesId(titles != null ? titles.getTitlesId() : 0);
		employee.setLevelId(level != null ? level.getLevelId() : 0);
		employee.setUniversityId(university != null ? university
				.getUniversityId() : 0);
		employee.setModifiedDate(new Date(System.currentTimeMillis()));
		// Update User for Email, name info
		userPersistence.update(user);

		// Insert log (history) in case Employee is promoted to new position
		if (isPositionChanged) {
			employee_Titles_HistoryLocalService.addEmployee_Titles_History(
					employee.getEmployeeId(), employee.getTitlesId(),
					"PROMOTED TO NEW TITLES",
					new Date(System.currentTimeMillis()), serviceContext);
		}

		// update/add addresses
		for (AddressObjectItem address : addresses) {
			if (address.getAddressId() == 0 && !address.isUIDeleted()) {
				try {
					AddressLocalServiceUtil.addAddress(
							serviceContext.getUserId(),
							Employee.class.getName(), employee.getEmployeeId(),
							address.getStreet1(), address.getStreet2(),
							address.getStreet3(), address.getCity(), "70000",
							address.getRegion().getRegionId(), 17L, 0, false,
							false, serviceContext);
				} catch (PortalException e) {
					e.printStackTrace();
				}
			} else {
				try {
					if (!address.isUIDeleted()) {
						AddressLocalServiceUtil.updateAddress(address
								.getAddressId(), address.getStreet1(), address
								.getStreet2(), address.getStreet3(), address
								.getCity(), "70000", address.getRegion()
								.getRegionId(), 17L, 0, false, false);
					} else {
						// delete address
						AddressLocalServiceUtil.deleteAddress(address
								.getAddressId());
					}
				} catch (PortalException e) {
					e.printStackTrace();
				}
			}
		}

		resourceLocalService.updateResources(employee.getCompanyId(),
				employee.getGroupId(), Employee.class.getName(),
				employee.getEmployeeId(), serviceContext.getGroupPermissions(),
				serviceContext.getGuestPermissions());

		// re-index modified employee
		Indexer indexer = IndexerRegistryUtil
				.nullSafeGetIndexer(Employee.class);
		indexer.reindex(employee);
		return employeePersistence.update(employee);
	}

	public Employee markDeletedEmployee(Employee employee)
			throws SystemException, SearchException {

		employee.setIsDeleted(true);

		// re-index modified employee
		Indexer indexer = IndexerRegistryUtil
				.nullSafeGetIndexer(Employee.class);
		indexer.reindex(employee);
		return employeePersistence.update(employee);

	}

	public Employee markDeletedEmployee(long employeeId)
			throws SystemException, PortalException {

		final Employee employee = EmployeeLocalServiceUtil
				.getEmployee(employeeId);
		employee.setIsDeleted(true);

		// re-index modified employee
		Indexer indexer = IndexerRegistryUtil
				.nullSafeGetIndexer(Employee.class);
		indexer.reindex(employee);
		return employeePersistence.update(employee);

	}

	/*
	 * public Employee addEmployee(Employee e, User user, boolean autoPassword,
	 * boolean autoScreenName, long emp_userId, ServiceContext serviceContext)
	 * throws SystemException, PortalException {
	 * e.setUserId(serviceContext.getUserId());
	 * e.setGroupId(serviceContext.getScopeGroupId()); e =
	 * employeePersistence.update(e);
	 * 
	 * // Add User Part user.setUserId(serviceContext.getUserId());
	 * user.setCompanyId(serviceContext.getCompanyId());
	 * user.setPassword(password);
	 * user.setLanguageId(LocaleUtil.getDefault().getLanguage());
	 * 
	 * 
	 * user = UserLocalServiceUtil.addUser(creatorUserId, companyId,
	 * autoPassword, password1, password2, autoScreenName, screenName,
	 * emailAddress, facebookId, openId, locale, firstName, middleName,
	 * lastName, prefixId, suffixId, male, birthdayMonth, birthdayDay,
	 * birthdayYear, jTitleLocalService.getJTitle(e.getJobtitleId()).getTitle(),
	 * groupIds, organizationIds, roleIds, userGroupIds, sendEmail,
	 * serviceContext);
	 * 
	 * e.setEmployee_userId(user.getUserId());
	 * 
	 * return employeePersistence.update(e); }
	 */

	public int countAll() {
		try {
			return employeePersistence.countAll();
		} catch (SystemException e) {
			e.printStackTrace();
		}
		return 0;
	}
}
