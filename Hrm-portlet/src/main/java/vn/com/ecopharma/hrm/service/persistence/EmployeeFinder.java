package vn.com.ecopharma.hrm.service.persistence;

public interface EmployeeFinder {
    public int filterEmployeeByTermSize(java.lang.String term);

    public org.json.JSONArray filterEmployeeByTerm(java.lang.String term,
        int start, int end);
}
