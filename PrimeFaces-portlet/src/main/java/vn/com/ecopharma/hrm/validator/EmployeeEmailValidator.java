package vn.com.ecopharma.hrm.validator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

import com.liferay.faces.portal.context.LiferayFacesContext;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.service.UserLocalServiceUtil;

@FacesValidator("employeeEmailValidator")
public class EmployeeEmailValidator implements Validator {

	private static final String EMAIL_PATTERN = "^[_A-Za-z0-9-]+(\\." +
			"[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*" +
			"(\\.[A-Za-z]{2,})$";
	
	private Pattern pattern;
	private Matcher matcher;
	
	
	
	public EmployeeEmailValidator() {
		pattern = Pattern.compile(EMAIL_PATTERN);
	}

	@Override
	public void validate(FacesContext context, UIComponent component,
			Object value) throws ValidatorException {
		matcher = pattern.matcher(value.toString());
		LiferayFacesContext liferayFacesContext = LiferayFacesContext
				.getInstance();
		final ServiceContext serviceContext = liferayFacesContext
				.getServiceContext();
		if(!matcher.matches()) {
			FacesMessage msg = new FacesMessage("Email validation failed", "Invalid Email format.");
			msg.setSeverity(FacesMessage.SEVERITY_ERROR);
			throw new ValidatorException(msg);
		} else
			try {
				if (UserLocalServiceUtil.fetchUserByEmailAddress(serviceContext.getCompanyId(), value.toString()) != null){
					FacesMessage msg = new FacesMessage("Email has already existed", "Invalid Email format.");
					msg.setSeverity(FacesMessage.SEVERITY_ERROR);
					throw new ValidatorException(msg);
				}
			} catch (SystemException e) {
				e.printStackTrace();
			}
		
	}

	
}
