package vn.com.ecopharma.hrm.converter;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

import vn.com.ecopharma.hrm.model.SubUnit;
import vn.com.ecopharma.hrm.service.SubUnitLocalServiceUtil;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;

@FacesConverter("subUnitConverter")
public class SubUnitConverter implements Converter {

	@Override
	public Object getAsObject(FacesContext context, UIComponent component,
			String value) {
		if (value != null && value.trim().length() > 0) {
			try {
				return SubUnitLocalServiceUtil.getSubUnit(Long.valueOf(value));
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
		if (value instanceof SubUnit) {
			return String.valueOf(((SubUnit) value).getSubUnitId());
		}
		return "";
	}

}
