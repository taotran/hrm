package vn.com.ecopharma.hrm.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;


public class VacancyFinderUtil {
    private static VacancyFinder _finder;

    public static int getFilterVacanciesSize(java.lang.String globStr,
        java.lang.String name, java.lang.String jTitle,
        java.lang.String location, java.lang.String vacancy_status,
        java.lang.String sortColumnName, java.lang.String sortDirection) {
        return getFinder()
                   .getFilterVacanciesSize(globStr, name, jTitle, location,
            vacancy_status, sortColumnName, sortDirection);
    }

    public static java.util.List<vn.com.ecopharma.hrm.model.Vacancy> filterVacancies(
        java.lang.String globStr, java.lang.String name,
        java.lang.String jTitle, java.lang.String location,
        java.lang.String vacancy_status, java.lang.String sortColumnName,
        java.lang.String sortDirection, int start, int end) {
        return getFinder()
                   .filterVacancies(globStr, name, jTitle, location,
            vacancy_status, sortColumnName, sortDirection, start, end);
    }

    public static VacancyFinder getFinder() {
        if (_finder == null) {
            _finder = (VacancyFinder) PortletBeanLocatorUtil.locate(vn.com.ecopharma.hrm.service.ClpSerializer.getServletContextName(),
                    VacancyFinder.class.getName());

            ReferenceRegistry.registerReference(VacancyFinderUtil.class,
                "_finder");
        }

        return _finder;
    }

    public void setFinder(VacancyFinder finder) {
        _finder = finder;

        ReferenceRegistry.registerReference(VacancyFinderUtil.class, "_finder");
    }
}
