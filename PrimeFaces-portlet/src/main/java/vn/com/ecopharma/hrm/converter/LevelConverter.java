package vn.com.ecopharma.hrm.converter;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

import vn.com.ecopharma.hrm.model.Level;
import vn.com.ecopharma.hrm.service.LevelLocalServiceUtil;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;

@FacesConverter(value = "levelConverter")
public class LevelConverter implements Converter {

	@Override
	public Object getAsObject(FacesContext context, UIComponent component,
			String value) {
		if (value != null && value.trim().length() > 0) {
			try {
				return LevelLocalServiceUtil.getLevel(Long.valueOf(value));
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
	public String getAsString(FacesContext context, UIComponent component,
			Object value) {
		if (value instanceof Level) {
			return String.valueOf(((Level) value).getLevelId());
		}
		return "";
	}

}
