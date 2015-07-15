package vn.com.ecopharma.hrm.service.persistence;

public interface EmployeeFinder {
    public java.util.List<vn.com.ecopharma.hrm.model.Employee> filterEmployees(
        java.lang.String globStr, java.lang.String fullName,
        java.lang.String emp_code, java.lang.String gender,
        java.lang.String contact_number, java.lang.String joined_date_from,
        java.lang.String joined_date_to,
        java.util.List<java.lang.String> jobTitles, java.lang.Long subUnitId,
        java.lang.String promoted_date_from, java.lang.String promoted_date_to,
        int start, int end, boolean isDeleted, java.lang.String sortField,
        java.lang.String sortOrder);

    public int filterEmployeeByTermSize(java.lang.String term);

    public org.json.JSONArray filterEmployeeByTerm(java.lang.String term,
        int start, int end);
}
