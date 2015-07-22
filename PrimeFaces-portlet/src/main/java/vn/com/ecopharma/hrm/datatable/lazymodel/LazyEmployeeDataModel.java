package vn.com.ecopharma.hrm.datatable.lazymodel;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.primefaces.model.LazyDataModel;
import org.primefaces.model.SortMeta;

import com.liferay.portal.kernel.exception.SystemException;

import vn.com.ecopharma.hrm.model.Employee;
import vn.com.ecopharma.hrm.service.EmployeeLocalServiceUtil;

public class LazyEmployeeDataModel extends LazyDataModel<Employee> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/*
	private List<Employee> datasource;

	public LazyEmployeeDataModel(List<Employee> datasource) {
		this.datasource = datasource;
	}

	@Override
	public Employee getRowData(String rowKey) {
		for(Employee e : datasource) {
			if (e.getEmp_code().equalsIgnoreCase(rowKey))
			return super.getRowData(rowKey);
		}
		return null;
	}

	@Override
	public Object getRowKey(Employee object) {
		return object.getEmployeeId();
	}*/

/*	@Override
	public List<Employee> load(int first, int pageSize,
			List<SortMeta> multiSortMeta, Map<String, Object> filters) {
		try {
			return EmployeeLocalServiceUtil.findAll(first, pageSize);
		} catch (SystemException e) {
			e.printStackTrace();
		}
		return new ArrayList<Employee>();
	}*/
	
	
	
	
	
	

}
