package vn.com.ecopharma.hrm.service;

import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.portlet.PortletRequest;

import com.liferay.faces.util.portal.WebKeys;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.portlet.LiferayPortletSession;
import com.liferay.portal.security.auth.PrincipalException;
import com.liferay.portal.security.permission.PermissionChecker;
import com.liferay.portal.theme.ThemeDisplay;

@ManagedBean(name = "empoyeeModelPermission")
public class EmpoyeeModelPermission {
	public static final String RESOURCE_NAME = "vn.com.ecopharma.hrm.model";

	public static void check(PermissionChecker permissionChecker, long groupId,
			String actionId) throws PortalException {
		if (!contains(permissionChecker, groupId, actionId)) {
			throw new PrincipalException();
		}
	}

	public static boolean contains(PermissionChecker permissionChecker,
			long groupId, String actionId) {
		return permissionChecker.hasPermission(groupId, RESOURCE_NAME, groupId,
				actionId);
	}

	public boolean checkPermission(String actionKey) {
		PortletRequest request = ((PortletRequest) (FacesContext
				.getCurrentInstance().getExternalContext().getRequest()));

		ThemeDisplay themeDisplay = (ThemeDisplay) request
				.getAttribute(WebKeys.THEME_DISPLAY);
		PermissionChecker permissionChecker = themeDisplay
				.getPermissionChecker();

		/* String name = PortalUtil.getPortletId(request); */
		String primKey = themeDisplay.getLayout().getPlid()
				+ LiferayPortletSession.LAYOUT_SEPARATOR + "PrimeFaces-portlet";
		long groupId = themeDisplay.getScopeGroupId();

/*		return permissionChecker.hasPermission(groupId, "PrimeFaces-portlet",
				primKey, actionKey);*/
		boolean result = permissionChecker.hasPermission(groupId, RESOURCE_NAME, groupId, actionKey);
		System.out.println("groupId, RESOURCE_NAME, groupId, actionKey" + groupId +  RESOURCE_NAME + groupId + "__" + actionKey);
		System.out.println("CHECK RESULT " + result);
		return result;
	}

}
