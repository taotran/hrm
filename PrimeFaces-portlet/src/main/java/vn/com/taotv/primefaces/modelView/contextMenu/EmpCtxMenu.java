package vn.com.taotv.primefaces.modelView.contextMenu;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import vn.com.taotv.primefaces.modelView.item.EmployeeInfoItem;

@ManagedBean(name = "empCtxMenu")
@ViewScoped
public class EmpCtxMenu implements Serializable {

	private static final long serialVersionUID = 1L;
	private EmployeeInfoItem selectedEmployeeInfoItem;

	public EmployeeInfoItem getSelectedEmployeeInfoItem() {
		return selectedEmployeeInfoItem;
	}

	public void setSelectedEmployeeInfoItem(
			EmployeeInfoItem selectedEmployeeInfoItem) {
		this.selectedEmployeeInfoItem = selectedEmployeeInfoItem;
	}

	public void delete() {

	}

	public void save() {
		/*try {
			EmployeeLocalServiceUtil.update(
					selectedEmployeeInfoItem.getEmployee(),
					selectedEmployeeInfoItem.getUser(),
					selectedEmployeeInfoItem.getjTitle(),
					selectedEmployeeInfoItem.getSubUnit(),
					selectedEmployeeInfoItem.getTitles(),
					selectedEmployeeInfoItem.getLevel(),
					selectedEmployeeInfoItem.getUniversity());
			selectedEmployeeInfoItem = null;
		} catch (SystemException e) {
			e.printStackTrace();
		}*/
	}

	public void onCloseOrFinish() {
		selectedEmployeeInfoItem = null;
	}
}
