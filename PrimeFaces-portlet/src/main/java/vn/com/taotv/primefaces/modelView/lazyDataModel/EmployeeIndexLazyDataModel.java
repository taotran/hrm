package vn.com.taotv.primefaces.modelView.lazyDataModel;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.portlet.PortletRequest;
import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.StringUtils;
import org.primefaces.model.LazyDataModel;
import org.primefaces.model.SortOrder;

import vn.com.ecopharma.hrm.model.Employee;
import vn.com.ecopharma.hrm.model.JTitle;
import vn.com.ecopharma.hrm.search.EmployeeField;
import vn.com.ecopharma.hrm.service.EmployeeLocalServiceUtil;
import vn.com.taotv.primefaces.modelView.item.EmployeeIndexedItem;

import com.liferay.faces.portal.context.LiferayFacesContext;
import com.liferay.faces.util.logging.Logger;
import com.liferay.faces.util.logging.LoggerFactory;
import com.liferay.portal.kernel.search.BooleanClauseOccur;
import com.liferay.portal.kernel.search.BooleanQuery;
import com.liferay.portal.kernel.search.BooleanQueryFactoryUtil;
import com.liferay.portal.kernel.search.Field;
import com.liferay.portal.kernel.search.Hits;
import com.liferay.portal.kernel.search.ParseException;
import com.liferay.portal.kernel.search.Query;
import com.liferay.portal.kernel.search.SearchContext;
import com.liferay.portal.kernel.search.SearchContextFactory;
import com.liferay.portal.kernel.search.SearchEngineUtil;
import com.liferay.portal.kernel.search.SearchException;
import com.liferay.portal.kernel.search.Sort;
import com.liferay.portal.kernel.search.TermRangeQuery;
import com.liferay.portal.kernel.search.TermRangeQueryFactoryUtil;
import com.liferay.portal.util.PortalUtil;

public class EmployeeIndexLazyDataModel extends
		LazyDataModel<EmployeeIndexedItem> {

	private static final long serialVersionUID = 1L;

	private static final Logger LOGGER = LoggerFactory
			.getLogger(EmployeeIndexLazyDataModel.class);

	private static final String PORTLET_ID = "Primefaces-portlet";

	@Override
	public EmployeeIndexedItem getRowData(String rowKey) {
		long employeeId = Long.valueOf(rowKey);
		final LiferayFacesContext liferayFacesContext = LiferayFacesContext
				.getInstance();

		final PortletRequest req = (PortletRequest) liferayFacesContext
				.getExternalContext().getRequest();

		final HttpServletRequest httpServletRequest = PortalUtil
				.getOriginalServletRequest(PortalUtil
						.getHttpServletRequest(req));

		final SearchContext searchContext = SearchContextFactory
				.getInstance(httpServletRequest);

		searchContext.setPortletIds(new String[] { PORTLET_ID });

		BooleanQuery fullQuery = BooleanQueryFactoryUtil.create(searchContext);
		BooleanQuery booleanQuery = BooleanQueryFactoryUtil
				.create(searchContext);
		booleanQuery.addRequiredTerm(Field.ENTRY_CLASS_NAME,
				Employee.class.getName());
		booleanQuery.addExactTerm(EmployeeField.EMPLOYEE_ID, employeeId);

		try {
			fullQuery.add(booleanQuery, BooleanClauseOccur.MUST);
			Hits hits = SearchEngineUtil.search(searchContext, fullQuery);
			System.out.println("HERE INSIDE GETTING RowData");
			return new EmployeeIndexedItem(hits.toList().get(0));
		} catch (ParseException e) {
			e.printStackTrace();
		} catch (SearchException e) {
			e.printStackTrace();
		}

		return null;
	}

	@Override
	public Object getRowKey(EmployeeIndexedItem object) {
		return Long.valueOf(object.getEmployeeDocument()
				.getField(EmployeeField.EMPLOYEE_ID).getValue());
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<EmployeeIndexedItem> load(int first, int pageSize,
			String sortField, SortOrder sortOrder, Map<String, Object> filters) {
		String globalFilter = StringUtils.EMPTY;
		String fullName = StringUtils.EMPTY;
		String emp_code = StringUtils.EMPTY;
		String joined_dateFrom = StringUtils.EMPTY;
		String joined_dateTo = StringUtils.EMPTY;
		final List<JTitle> selectedJTitles = new ArrayList<JTitle>();
		final List<String> genders = new ArrayList<String>();
		if (filters != null) {
			globalFilter = filters.get("globalString") != null ? (String) filters
					.get("globalString") : StringUtils.EMPTY;

			fullName = filters.get(EmployeeField.FULL_NAME) != null ? (String) filters
					.get(EmployeeField.FULL_NAME) : StringUtils.EMPTY;
			emp_code = filters.get(EmployeeField.EMPLOYEE_CODE) != null ? (String) filters
					.get(EmployeeField.EMPLOYEE_CODE) : StringUtils.EMPTY;

			joined_dateFrom = filters.get("joined_dateFrom") != null ? (String) filters
					.get("joined_dateFrom") : StringUtils.EMPTY;

			joined_dateTo = filters.get("joined_dateTo") != null ? (String) filters
					.get("joined_dateTo") : StringUtils.EMPTY;

			boolean isJobTitleFiltered = false;
			boolean isGenderFiltered = false;
			for (Iterator<String> it = filters.keySet().iterator(); it
					.hasNext();) {
				final String filterProperty = it.next();
				final Object filterValue = filters.get(filterProperty);
				LOGGER.info("Filter Property: " + filterProperty);

				if (filterValue instanceof String) {
					LOGGER.info("Filter Property Value: " + filterValue);
				} else if (filterValue instanceof List<?>) {
					if (filterProperty
							.equalsIgnoreCase(EmployeeField.JOB_TITLE)) {
						isJobTitleFiltered = true;
					} else if (filterProperty
							.equalsIgnoreCase(EmployeeField.GENDER)) {
						isGenderFiltered = true;
					}
				}
			}

			if (isJobTitleFiltered) {
				selectedJTitles.addAll((List<JTitle>) filters
						.get(EmployeeField.JOB_TITLE));
			}

			if (isGenderFiltered) {
				genders.addAll((List<String>) filters.get(EmployeeField.GENDER));
			}
		}

		final LiferayFacesContext liferayFacesContext = LiferayFacesContext
				.getInstance();

		final PortletRequest req = (PortletRequest) liferayFacesContext
				.getExternalContext().getRequest();

		final HttpServletRequest httpServletRequest = PortalUtil
				.getOriginalServletRequest(PortalUtil
						.getHttpServletRequest(req));
		final SearchContext searchContext = SearchContextFactory
				.getInstance(httpServletRequest);

		/* ################################################### */
		String[] fields = new String[] { EmployeeField.EMPLOYEE_CODE,
				EmployeeField.FULL_NAME, EmployeeField.JOB_TITLE };

		final List<Query> queries = new ArrayList<Query>();

		BooleanQuery fullQuery = BooleanQueryFactoryUtil.create(searchContext);

		final BooleanQuery allEntriesBooleanQuery = BooleanQueryFactoryUtil
				.create(searchContext);
		final BooleanQuery globalFilterBooleanQuery = BooleanQueryFactoryUtil
				.create(searchContext);

		final BooleanQuery empCodeFilterBooleanQuery = BooleanQueryFactoryUtil
				.create(searchContext);

		final BooleanQuery fullNameFilterBooleanQuery = BooleanQueryFactoryUtil
				.create(searchContext);

		final BooleanQuery jobTitleFilterBooleanQuery = BooleanQueryFactoryUtil
				.create(searchContext);

		final BooleanQuery genderFilterBooleanQuery = BooleanQueryFactoryUtil
				.create(searchContext);

		Sort searchSort = null;
		try {
			final SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddhhmmss");
			final SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
			final String defaultDateFromString = "19700101000000";
			final String defaultDateToString = sdf.format(new Date(System
					.currentTimeMillis()));
			System.out.println(joined_dateFrom);
			final String filterJoined_date_from = joined_dateFrom != StringUtils.EMPTY ? sdf
					.format(sdf1.parse(joined_dateFrom))
					: defaultDateFromString;
			final String filterJoined_date_to = joined_dateTo != StringUtils.EMPTY ? sdf
					.format(sdf1.parse(joined_dateTo)) : defaultDateToString;

			final TermRangeQuery joinedDateTermRangeQuery = TermRangeQueryFactoryUtil
					.create(searchContext, EmployeeField.JOINED_DATE,
							filterJoined_date_from, filterJoined_date_to, true,
							true);
			queries.add(allEntriesBooleanQuery);
			queries.add(joinedDateTermRangeQuery);

			allEntriesBooleanQuery.addRequiredTerm(Field.ENTRY_CLASS_NAME,
					Employee.class.getName());
			if (globalFilter != StringUtils.EMPTY) {
				globalFilterBooleanQuery.addTerms(fields, globalFilter + "*",
						true);
				queries.add(globalFilterBooleanQuery);
			}

			if (emp_code != StringUtils.EMPTY) {
				empCodeFilterBooleanQuery.addTerm(EmployeeField.EMPLOYEE_CODE,
						emp_code, true);
				queries.add(empCodeFilterBooleanQuery);
			}

			if (fullName != StringUtils.EMPTY) {
				fullNameFilterBooleanQuery.addTerm(EmployeeField.FULL_NAME,
						fullName, true);
				queries.add(fullNameFilterBooleanQuery);
			}

			if (!genders.isEmpty()) {
				for (String gender : genders) {
					genderFilterBooleanQuery.addTerm(EmployeeField.GENDER,
							gender);
				}
				queries.add(genderFilterBooleanQuery);
			}

			if (!selectedJTitles.isEmpty()) {
				for (JTitle j : selectedJTitles) {
					jobTitleFilterBooleanQuery.addTerm(EmployeeField.JOB_TITLE,
							j.getTitle(), false);
				}
				queries.add(jobTitleFilterBooleanQuery);
			}

			for (Query query : queries) {
				fullQuery.add(query, BooleanClauseOccur.MUST);
			}

			/* SORT */
			if (sortField != null) {
				searchSort = new Sort(sortField,
						sortOrder.equals(SortOrder.ASCENDING) ? false : true);
			} else {
				searchSort = new Sort(EmployeeField.EMPLOYEE_ID, false);
			}

		} catch (ParseException e) {
			e.printStackTrace();
		} catch (java.text.ParseException e) {
			e.printStackTrace();
		}

		final List<EmployeeIndexedItem> emps = EmployeeLocalServiceUtil
				.searchAllUnDeletedEmployeeIndexedItems(searchContext, queries,
						liferayFacesContext.getCompanyId(), searchSort, first,
						first + pageSize);

		setPageSize(pageSize);
		setRowCount(EmployeeLocalServiceUtil
				.countAllUnDeletedIndexedEmployeeDocuments(searchContext,
						queries, liferayFacesContext.getCompanyId(), searchSort));

		return emps;
	}

}
