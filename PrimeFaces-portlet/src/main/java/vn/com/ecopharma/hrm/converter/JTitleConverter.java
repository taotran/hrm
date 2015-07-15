package vn.com.ecopharma.hrm.converter;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;

import vn.com.ecopharma.hrm.model.JTitle;
import vn.com.ecopharma.hrm.service.JTitleLocalServiceUtil;

@FacesConverter(value = "jtitleConverter")
public class JTitleConverter implements Converter {

	@Override
	public Object getAsObject(FacesContext arg0, UIComponent arg1, String arg2) {
		if (arg2 != null && arg2.trim().length() > 0) {
			try {
				return JTitleLocalServiceUtil.getJTitle(Long.valueOf(arg2));
			} catch (NumberFormatException e) {
				e.printStackTrace();
			} catch (PortalException e) {
				e.printStackTrace();
			} catch (SystemException e) {
				e.printStackTrace();
			} 
		}
		return null;
	}

	@Override
	public String getAsString(FacesContext arg0, UIComponent arg1, Object arg2) {
		if (arg2 instanceof JTitle)
			return String.valueOf(((JTitle) arg2).getJobtitleId());
		return "";
	}

}
