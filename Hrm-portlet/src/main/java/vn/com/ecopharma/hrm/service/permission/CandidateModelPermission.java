package vn.com.ecopharma.hrm.service.permission;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.security.permission.PermissionChecker;

public class CandidateModelPermission {
	private static final String RESOURCE_NAME = "vn.com.ecopharma.hrm.model";

	public static void check(PermissionChecker permissionChecker, long groupId,
			String actionId) throws PortalException {
		if (!contains(permissionChecker, groupId, actionId)) {

		}
	}

	public static boolean contains(PermissionChecker permissionChecker,
			long groupId, String actionId) {
		return permissionChecker.hasPermission(groupId, RESOURCE_NAME, groupId,
				actionId);
	}
}
