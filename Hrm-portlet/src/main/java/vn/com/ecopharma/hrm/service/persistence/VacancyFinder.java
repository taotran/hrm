package vn.com.ecopharma.hrm.service.persistence;

public interface VacancyFinder {
    public int getFilterVacanciesSize(java.lang.String globStr,
        java.lang.String name, java.lang.String jTitle,
        java.lang.String location, java.lang.String vacancy_status,
        java.lang.String sortColumnName, java.lang.String sortDirection);

    public java.util.List<vn.com.ecopharma.hrm.model.Vacancy> filterVacancies(
        java.lang.String globStr, java.lang.String name,
        java.lang.String jTitle, java.lang.String location,
        java.lang.String vacancy_status, java.lang.String sortColumnName,
        java.lang.String sortDirection, int start, int end);

    public java.util.List<java.lang.Object[]> getVacancySuccessionReport();
}
