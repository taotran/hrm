package vn.com.ecopharma.hrm.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;


public class EmployeeFinderUtil {
    private static EmployeeFinder _finder;

    public static java.util.List<vn.com.ecopharma.hrm.model.Employee> filterEmployees(
        java.lang.String globStr, java.lang.String fullName,
        java.lang.String emp_code, java.lang.String gender,
        java.lang.String contact_number, java.lang.String joined_date_from,
        java.lang.String joined_date_to,
        java.util.List<java.lang.String> jobTitles, java.lang.Long subUnitId,
        java.lang.String promoted_date_from, java.lang.String promoted_date_to,
        int start, int end, boolean isDeleted, java.lang.String sortField,
        java.lang.String sortOrder) {
        return getFinder()
                   .filterEmployees(globStr, fullName, emp_code, gender,
            contact_number, joined_date_from, joined_date_to, jobTitles,
            subUnitId, promoted_date_from, promoted_date_to, start, end,
            isDeleted, sortField, sortOrder);
    }

    public static int filterEmployeeByTermSize(java.lang.String term) {
        return getFinder().filterEmployeeByTermSize(term);
    }

    public static org.json.JSONArray filterEmployeeByTerm(
        java.lang.String term, int start, int end) {
        return getFinder().filterEmployeeByTerm(term, start, end);
    }

    public static EmployeeFinder getFinder() {
        if (_finder == null) {
            _finder = (EmployeeFinder) PortletBeanLocatorUtil.locate(vn.com.ecopharma.hrm.service.ClpSerializer.getServletContextName(),
                    EmployeeFinder.class.getName());

            ReferenceRegistry.registerReference(EmployeeFinderUtil.class,
                "_finder");
        }

        return _finder;
    }

    public void setFinder(EmployeeFinder finder) {
        _finder = finder;

        ReferenceRegistry.registerReference(EmployeeFinderUtil.class, "_finder");
    }
}
