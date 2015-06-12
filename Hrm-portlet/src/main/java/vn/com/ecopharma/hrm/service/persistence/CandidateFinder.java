package vn.com.ecopharma.hrm.service.persistence;

public interface CandidateFinder {
    public int getFilterCandidatesSize(java.lang.String globStr,
        java.lang.String name, java.lang.String email,
        java.lang.String contact_number, java.lang.String candidate_status,
        java.lang.String vacancy_name, java.lang.String date_from,
        java.lang.String date_to, java.lang.String sortColumnName,
        java.lang.String sortDirection);

    public java.util.List<vn.com.ecopharma.hrm.model.Candidate> filterCandidates(
        java.lang.String globStr, java.lang.String name,
        java.lang.String email, java.lang.String contact_number,
        java.lang.String candidate_status, java.lang.String vacancy_name,
        java.lang.String date_from, java.lang.String date_to,
        java.lang.String sortColumnName, java.lang.String sortDirection,
        int start, int end);
}
