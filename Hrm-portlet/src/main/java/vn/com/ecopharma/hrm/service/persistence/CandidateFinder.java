package vn.com.ecopharma.hrm.service.persistence;

public interface CandidateFinder {
    public java.util.List<vn.com.ecopharma.hrm.model.Candidate> filterCandidates(
        java.lang.String filterString);

    public java.util.List<vn.com.ecopharma.hrm.model.Candidate> filterCandidateByGlobalString(
        java.lang.String filterString);

    public java.lang.Long findVacancyByCandidate(long c_id);
}
