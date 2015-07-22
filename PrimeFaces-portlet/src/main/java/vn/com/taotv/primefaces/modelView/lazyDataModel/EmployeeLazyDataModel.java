package vn.com.taotv.primefaces.modelView.lazyDataModel;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

import org.apache.commons.lang3.StringUtils;
import org.primefaces.context.RequestContext;
import org.primefaces.model.LazyDataModel;
import org.primefaces.model.SortOrder;

import vn.com.ecopharma.hrm.model.Employee;
import vn.com.ecopharma.hrm.model.JTitle;
import vn.com.ecopharma.hrm.service.EmployeeLocalServiceUtil;
import vn.com.taotv.primefaces.modelView.item.EmployeeInfoItem;

import com.liferay.faces.util.logging.Logger;
import com.liferay.faces.util.logging.LoggerFactory;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;

public class EmployeeLazyDataModel extends LazyDataModel<EmployeeInfoItem> {

	private static final long serialVersionUID = 1L;

	private static final Logger LOGGER = LoggerFactory
			.getLogger(EmployeeLazyDataModel.class);

	@Override
	public EmployeeInfoItem getRowData(String rowKey) {
		long id = Long.valueOf(rowKey);
		try {
			return new EmployeeInfoItem(
					EmployeeLocalServiceUtil.getEmployee(id));
		} catch (PortalException e) {
			e.printStackTrace();
		} catch (SystemException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Object getRowKey(EmployeeInfoItem object) {
		return object.getEmployee().getEmployeeId();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<EmployeeInfoItem> load(int first, int pageSize,
			String sortField, SortOrder sortOrder, Map<String, Object> filters) {
		int dataSize = EmployeeLocalServiceUtil.countAll();
		setPageSize(pageSize);
		setRowCount(dataSize);
		String globalFilter = StringUtils.EMPTY;
		String fullName = StringUtils.EMPTY;
		String emp_code = StringUtils.EMPTY;
		String gender = StringUtils.EMPTY;
		String joined_dateFrom = StringUtils.EMPTY;
		String joined_dateTo = StringUtils.EMPTY;		
		final List<JTitle> selectedJTitles = new ArrayList<JTitle>();
		if (filters != null) {
			globalFilter = "";
			fullName = filters.get("fullName") != null ? (String) filters
					.get("fullName") : StringUtils.EMPTY;
			emp_code = filters.get("employee.emp_code") != null ? (String) filters
					.get("employee.emp_code") : StringUtils.EMPTY;
			;
			gender = filters.get("employee.gender") != null ? (String) filters
					.get("employee.gender") : StringUtils.EMPTY;
			
			joined_dateFrom = filters.get("joined_dateFrom") != null ? (String)filters.get("joined_dateFrom") :StringUtils.EMPTY;		
				
			joined_dateTo = filters.get("joined_dateTo") != null ? (String)filters.get("joined_dateTo") :StringUtils.EMPTY;	
			
			boolean isJobTitleFiltered = false;
			for (Iterator<String> it = filters.keySet().iterator(); it
					.hasNext();) {
				String filterProperty = it.next();
				Object filterValue = filters.get(filterProperty);
				LOGGER.info("Filter Property: " + filterProperty);

				if (filterValue instanceof String) {
					LOGGER.info("Filter Property Value: " + filterValue);
				} else if (filterValue instanceof List<?>) {
					if (filterProperty.equalsIgnoreCase("selectedJTitles")) {
						List<JTitle> jTitles = (List<JTitle>) filterValue;

						LOGGER.info("Filter selected size: " + jTitles.size());
						isJobTitleFiltered = true;
					}
				}
			}
			if (isJobTitleFiltered) {
				selectedJTitles.addAll((List<JTitle>) filters
						.get("selectedJTitles"));
			}

		}
		final List<EmployeeInfoItem> employeeInfoItems = new ArrayList<EmployeeInfoItem>();

		List<String> jTitleStrs = new ArrayList<String>();
		for (JTitle j : selectedJTitles) {
			jTitleStrs.add(j.getTitle());
		}
		if (sortField != null) {
			sortField = sortField.substring(sortField.indexOf(".") + 1, sortField.length());
		}
		for (Employee emp : EmployeeLocalServiceUtil.filterEmployees(
				globalFilter, fullName, emp_code, gender, "", joined_dateFrom, joined_dateTo,
				jTitleStrs, 0l, null, "", first, first + pageSize, false, sortField, sortOrder.equals(SortOrder.ASCENDING) ? "asc": "desc")) {
			employeeInfoItems.add(new EmployeeInfoItem(emp));
		}

		LOGGER.info("Loading employee data from " + first + ", size: "
				+ pageSize);
		
		return employeeInfoItems;
	}

}
