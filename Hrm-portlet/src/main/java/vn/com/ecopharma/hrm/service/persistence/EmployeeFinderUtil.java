package vn.com.ecopharma.hrm.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;


public class EmployeeFinderUtil {
    private static EmployeeFinder _finder;

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
