package vn.com.taotv.primefaces.modelView.validation;

import javax.faces.bean.ManagedBean;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@ManagedBean(name = "employeeValidationView")
public class EmployeeValidationView {
	private static final String EMAIL_PATTERN = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
			+ "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

	/*@Size(min = 2, max = 20)*/
	/*@NotEmpty*/
	private String firstName;

	/*@Pattern(regexp = EMAIL_PATTERN)*/
	/*@Size(min = 2, max = 30)*/
	private String email;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
