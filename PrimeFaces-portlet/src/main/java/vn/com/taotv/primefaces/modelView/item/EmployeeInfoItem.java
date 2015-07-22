package vn.com.taotv.primefaces.modelView.item;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import vn.com.ecopharma.hrm.model.Employee;
import vn.com.ecopharma.hrm.model.JTitle;
import vn.com.ecopharma.hrm.model.Level;
import vn.com.ecopharma.hrm.model.SubUnit;
import vn.com.ecopharma.hrm.model.Titles;
import vn.com.ecopharma.hrm.model.University;
import vn.com.ecopharma.hrm.service.JTitleLocalServiceUtil;
import vn.com.ecopharma.hrm.service.LevelLocalServiceUtil;
import vn.com.ecopharma.hrm.service.SubUnitLocalServiceUtil;
import vn.com.ecopharma.hrm.service.TitlesLocalServiceUtil;
import vn.com.ecopharma.hrm.service.UniversityLocalServiceUtil;

import com.liferay.faces.portal.context.LiferayFacesContext;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.Address;
import com.liferay.portal.model.User;
import com.liferay.portal.service.AddressLocalServiceUtil;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.service.UserLocalServiceUtil;

/**
 * @author TaoTran
 *
 */
public class EmployeeInfoItem implements Serializable {
	private static final long serialVersionUID = 1L;
	private Employee employee;
	private JTitle jTitle;
	private User user;
	private University university;
	private SubUnit subUnit;
	private Titles titles;
	private Level level;
	
	/* For creating employee's user */
	private String userName;
	private String userPassword1;
	private String userPassword2;

	private List<AddressObjectItem> addresses;
	
	private List<String> dependentNames;

	public EmployeeInfoItem(Employee employee) {
		this.employee = employee;
		LiferayFacesContext liferayFacesContext = LiferayFacesContext
				.getInstance();
		final ServiceContext serviceContext = liferayFacesContext
				.getServiceContext();
		
		this.dependentNames = new ArrayList<String>();
		dependentNames.add("Tran Van A");
		dependentNames.add("Tran Van B");
		
		try {
			final List<Address> addressList = AddressLocalServiceUtil
					.getAddresses(serviceContext.getCompanyId(),
							Employee.class.getName(), employee.getEmployeeId());
			addresses = new ArrayList<AddressObjectItem>();

			for (Address address : addressList) {
				addresses.add(new AddressObjectItem(address));
			}
		} catch (SystemException e) {
			e.printStackTrace();
		}
	}

	public Employee getEmployee() {
		return employee;
	}

	public User getUser() {
		try {
			if (user == null) {
				return user = employee.getEmployee_userId() != 0 ? UserLocalServiceUtil
						.getUser(employee.getEmployee_userId()) : null;
			}
			return user;
		} catch (PortalException e) {
			e.printStackTrace();
		} catch (SystemException e) {
			e.printStackTrace();
		}
		return user;
	}

	public University getUniversity() {
		try {
			if (university == null) {
				return university = employee.getUniversityId() != 0 ? UniversityLocalServiceUtil
						.getUniversity(employee.getUniversityId()) : null;
			}
			return university;
		} catch (PortalException e) {
			e.printStackTrace();
		} catch (SystemException e) {
			e.printStackTrace();
		}
		return university;
	}

	public JTitle getjTitle() {
		try {
			if (jTitle == null) {
				return jTitle = employee.getJobtitleId() != 0 ? JTitleLocalServiceUtil
						.getJTitle(employee.getJobtitleId()) : null;
			}
			return jTitle;

		} catch (PortalException e) {
			e.printStackTrace();
		} catch (SystemException e) {
			e.printStackTrace();
		}
		return jTitle;
	}

	public SubUnit getSubUnit() {
		try {
			if (subUnit == null) {
				return subUnit = employee.getSubUnitId() != 0 ? SubUnitLocalServiceUtil
						.getSubUnit(employee.getSubUnitId()) : null;
			}
			return subUnit;
		} catch (PortalException e) {
			e.printStackTrace();
		} catch (SystemException e) {
			e.printStackTrace();
		}
		return subUnit;
	}

	public Titles getTitles() {
		try {
			if (titles == null) {
				return titles = employee.getTitlesId() != 0 ? TitlesLocalServiceUtil
						.getTitles(employee.getTitlesId()) : null;
			}
			return titles;
		} catch (PortalException e) {
			e.printStackTrace();
		} catch (SystemException e) {
			e.printStackTrace();
		}
		return titles;
	}

	public Level getLevel() {
		try {
			if (level == null) {
				return level = employee.getLevelId() != 0 ? LevelLocalServiceUtil
						.getLevel(employee.getLevelId()) : null;
			}
			return level;
		} catch (PortalException e) {
			e.printStackTrace();
		} catch (SystemException e) {
			e.printStackTrace();
		}
		return level;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public void setTitles(Titles titles) {
		this.titles = titles;
	}

	public void setLevel(Level level) {
		this.level = level;
	}

	public void setjTitle(JTitle jTitle) {
		this.jTitle = jTitle;
	}

	public void setUniversity(University university) {
		this.university = university;
	}

	public void setSubUnit(SubUnit subUnit) {
		this.subUnit = subUnit;
	}

	public List<AddressObjectItem> getAddresses() {
		return addresses;
	}

	public void setAddresses(List<AddressObjectItem> addresses) {
		this.addresses = addresses;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPassword1() {
		return userPassword1;
	}

	public void setUserPassword1(String userPassword1) {
		this.userPassword1 = userPassword1;
	}

	public String getUserPassword2() {
		return userPassword2;
	}

	public void setUserPassword2(String userPassword2) {
		this.userPassword2 = userPassword2;
	}

	public List<String> getDependentNames() {
		return dependentNames;
	}

	public void setDependentNames(List<String> dependentNames) {
		this.dependentNames = dependentNames;
	}
	
}
