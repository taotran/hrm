package vn.com.ecopharma.hrm.service.persistence;

public interface CandidateFinder {
    public java.util.List<vn.com.ecopharma.hrm.model.Candidate> filterCandidates(
        java.lang.String filterString);

    public java.util.List<vn.com.ecopharma.hrm.model.Candidate> filterCandidates(
        java.lang.String filterString, int start, int end);
}
