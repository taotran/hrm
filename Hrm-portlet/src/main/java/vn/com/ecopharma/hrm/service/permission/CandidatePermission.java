package vn.com.ecopharma.hrm.service.permission;

import vn.com.ecopharma.hrm.model.Candidate;
import vn.com.ecopharma.hrm.service.CandidateLocalServiceUtil;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.security.permission.PermissionChecker;

public class CandidatePermission {
	public static void check(PermissionChecker permissionChecker, long c_id, String actionId) {
		
	}
	
	public static boolean contains(PermissionChecker permissionChecker, long c_id, String actionId) throws PortalException, SystemException {
		Candidate candidate = CandidateLocalServiceUtil.getCandidate(c_id);
		return permissionChecker.hasPermission(candidate.getGroup_id(), Candidate.class.getName(), c_id, actionId);
	}
}
