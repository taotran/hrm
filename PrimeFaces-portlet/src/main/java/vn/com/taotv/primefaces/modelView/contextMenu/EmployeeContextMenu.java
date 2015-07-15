package vn.com.taotv.primefaces.modelView.contextMenu;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import vn.com.ecopharma.hrm.service.EmployeeLocalServiceUtil;
import vn.com.taotv.primefaces.modelView.item.EmployeeInfoItem;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;

@ManagedBean(name="contextMenu")
@ViewScoped
public class EmployeeContextMenu implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private EmployeeInfoItem selectedEmployee;

	public EmployeeInfoItem getSelectedEmployee() {
		return selectedEmployee;
	}
	
	public void setSelectedEmployee(EmployeeInfoItem selectedEmployee) {
		this.selectedEmployee = selectedEmployee;
	}

	public void deleteEmp() {
		try {
			EmployeeLocalServiceUtil.deleteEmployee(selectedEmployee.getEmployee().getEmployeeId());
			this.selectedEmployee = null;
		} catch (PortalException e) {
			e.printStackTrace();
		} catch (SystemException e) {
			e.printStackTrace();
		}
	}
}
