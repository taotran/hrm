package vn.com.taotv.primefaces.modelView;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.el.ELContext;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.portlet.PortletRequest;
import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.StringUtils;
import org.primefaces.model.LazyDataModel;
import org.primefaces.model.SortOrder;

import vn.com.ecopharma.hrm.search.EmployeeField;
import vn.com.ecopharma.hrm.service.EmployeeLocalServiceUtil;
import vn.com.taotv.primefaces.modelView.filter.EmployeeFilterView;
import vn.com.taotv.primefaces.modelView.item.EmployeeIndexedItem;
import vn.com.taotv.primefaces.modelView.lazyDataModel.EmployeeIndexLazyDataModel;

import com.liferay.faces.portal.context.LiferayFacesContext;
import com.liferay.portal.kernel.search.SearchContext;
import com.liferay.portal.kernel.search.SearchContextFactory;
import com.liferay.portal.util.PortalUtil;

@ManagedBean(name = "employeeIndexedBean")
@ViewScoped
public class EmployeeIndexedBean implements Serializable {

	private static final long serialVersionUID = 1L;

	private LazyDataModel<EmployeeIndexedItem> lazyDataModel;
	private EmployeeIndexedItem selectedEmployeeIndexItem;

	@PostConstruct
	public void init() {
		lazyDataModel = new EmployeeIndexLazyDataModel() {

			private static final long serialVersionUID = 1L;

			@Override
			public List<EmployeeIndexedItem> load(int first, int pageSize,
					String sortField, SortOrder sortOrder,
					Map<String, Object> filters) {
				final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
				final ELContext elContext = FacesContext.getCurrentInstance()
						.getELContext();
				EmployeeFilterView employeeFilterView = (EmployeeFilterView) FacesContext
						.getCurrentInstance().getApplication().getELResolver()
						.getValue(elContext, null, "empFilterBean");
				String dateFromStr = employeeFilterView.getJoined_date_from() != null ? sdf
						.format(employeeFilterView.getJoined_date_from()) : "";
				String dateToStr = employeeFilterView.getJoined_date_to() != null ? sdf
						.format(employeeFilterView.getJoined_date_to()) : "";

				if (employeeFilterView.getGlobalString() != StringUtils.EMPTY) {
					filters.put("globalString",
							employeeFilterView.getGlobalString());
				}

				if (employeeFilterView.getEmp_code() != StringUtils.EMPTY) {
					filters.put(EmployeeField.EMPLOYEE_CODE,
							employeeFilterView.getEmp_code());
				}

				if (dateFromStr != StringUtils.EMPTY) {
					filters.put("joined_dateFrom", dateFromStr);
				}
				if (dateToStr != StringUtils.EMPTY) {
					filters.put("joined_dateTo", dateToStr);
				}

				if (employeeFilterView.getFullName() != StringUtils.EMPTY) {
					filters.put(EmployeeField.FULL_NAME,
							employeeFilterView.getFullName());
				}

				if (employeeFilterView.getSelectedJTitles() != null
						&& employeeFilterView.getSelectedJTitles().size() > 0) {
					filters.put(EmployeeField.JOB_TITLE,
							employeeFilterView.getSelectedJTitles());
				}
				
				if (employeeFilterView.getSelectedGenders() != null && employeeFilterView.getSelectedGenders().size() > 0) {
					filters.put(EmployeeField.GENDER,
							employeeFilterView.getSelectedGenders());
				}
				return super.load(first, pageSize, sortField, sortOrder,
						filters);
			}
		};
	}

	public void indexAllEmployees() {
		EmployeeLocalServiceUtil.indexAllEmployees();
	}

	public void removeIndexes() {
		final LiferayFacesContext liferayFacesContext = LiferayFacesContext
				.getInstance();

		final PortletRequest req = (PortletRequest) liferayFacesContext
				.getExternalContext().getRequest();
		final HttpServletRequest httpServletRequest = PortalUtil
				.getOriginalServletRequest(PortalUtil
						.getHttpServletRequest(req));

		final SearchContext searchContext = SearchContextFactory
				.getInstance(httpServletRequest);

		EmployeeLocalServiceUtil.removeAllEmployeeIndexes(searchContext,
				liferayFacesContext.getCompanyId());

	}

	public LazyDataModel<EmployeeIndexedItem> getLazyDataModel() {
		return lazyDataModel;
	}

	public void setLazyDataModel(
			LazyDataModel<EmployeeIndexedItem> lazyDataModel) {
		this.lazyDataModel = lazyDataModel;
	}

	public EmployeeIndexedItem getSelectedEmployeeIndexItem() {
		return selectedEmployeeIndexItem;
	}

	public void setSelectedEmployeeIndexItem(
			EmployeeIndexedItem selectedEmployeeIndexItem) {
		this.selectedEmployeeIndexItem = selectedEmployeeIndexItem;
	}
}
