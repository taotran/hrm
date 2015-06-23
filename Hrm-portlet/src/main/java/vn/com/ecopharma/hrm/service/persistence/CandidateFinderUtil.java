package vn.com.ecopharma.hrm.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;


public class CandidateFinderUtil {
    private static CandidateFinder _finder;

    public static int getFilterCandidatesSize(java.lang.String globStr,
        java.lang.String name, java.lang.String email,
        java.lang.String contact_number, java.lang.String candidate_status,
        java.lang.String vacancy_name, java.lang.String date_from,
        java.lang.String date_to, java.lang.String sortColumnName,
        java.lang.String sortDirection) {
        return getFinder()
                   .getFilterCandidatesSize(globStr, name, email,
            contact_number, candidate_status, vacancy_name, date_from, date_to,
            sortColumnName, sortDirection);
    }

    public static java.util.List<vn.com.ecopharma.hrm.model.Candidate> filterCandidates(
        java.lang.String globStr, java.lang.String name,
        java.lang.String email, java.lang.String contact_number,
        java.lang.String candidate_status, java.lang.String vacancy_name,
        java.lang.String date_from, java.lang.String date_to,
        java.lang.String sortColumnName, java.lang.String sortDirection,
        int start, int end) {
        return getFinder()
                   .filterCandidates(globStr, name, email, contact_number,
            candidate_status, vacancy_name, date_from, date_to, sortColumnName,
            sortDirection, start, end);
    }

    public static java.util.List<vn.com.ecopharma.hrm.model.Candidate> filterCandidateForExport(
        com.google.gson.JsonArray conditions) {
        return getFinder().filterCandidateForExport(conditions);
    }

    public static CandidateFinder getFinder() {
        if (_finder == null) {
            _finder = (CandidateFinder) PortletBeanLocatorUtil.locate(vn.com.ecopharma.hrm.service.ClpSerializer.getServletContextName(),
                    CandidateFinder.class.getName());

            ReferenceRegistry.registerReference(CandidateFinderUtil.class,
                "_finder");
        }

        return _finder;
    }

    public void setFinder(CandidateFinder finder) {
        _finder = finder;

        ReferenceRegistry.registerReference(CandidateFinderUtil.class, "_finder");
    }
}
