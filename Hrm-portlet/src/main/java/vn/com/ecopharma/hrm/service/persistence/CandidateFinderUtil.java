package vn.com.ecopharma.hrm.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;


public class CandidateFinderUtil {
    private static CandidateFinder _finder;

    public static java.util.List<vn.com.ecopharma.hrm.model.Candidate> filterCandidates(
        java.lang.String filterString) {
        return getFinder().filterCandidates(filterString);
    }

    public static java.util.List<vn.com.ecopharma.hrm.model.Candidate> filterCandidates(
        java.lang.String filterString, int start, int end) {
        return getFinder().filterCandidates(filterString, start, end);
    }

    public static java.lang.Long findVacancyByCandidate(long c_id) {
        return getFinder().findVacancyByCandidate(c_id);
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
