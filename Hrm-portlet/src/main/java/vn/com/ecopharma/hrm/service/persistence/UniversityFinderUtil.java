package vn.com.ecopharma.hrm.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;


public class UniversityFinderUtil {
    private static UniversityFinder _finder;

    public static int filterUniversitiesByTermSize(java.lang.String term) {
        return getFinder().filterUniversitiesByTermSize(term);
    }

    public static org.json.JSONArray filterUniversitiesByTerm(
        java.lang.String term, int start, int end) {
        return getFinder().filterUniversitiesByTerm(term, start, end);
    }

    public static UniversityFinder getFinder() {
        if (_finder == null) {
            _finder = (UniversityFinder) PortletBeanLocatorUtil.locate(vn.com.ecopharma.hrm.service.ClpSerializer.getServletContextName(),
                    UniversityFinder.class.getName());

            ReferenceRegistry.registerReference(UniversityFinderUtil.class,
                "_finder");
        }

        return _finder;
    }

    public void setFinder(UniversityFinder finder) {
        _finder = finder;

        ReferenceRegistry.registerReference(UniversityFinderUtil.class,
            "_finder");
    }
}
