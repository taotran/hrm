package vn.com.ecopharma.hrm.service.persistence;

public interface UniversityFinder {
    public int filterUniversitiesByTermSize(java.lang.String term);

    public org.json.JSONArray filterUniversitiesByTerm(java.lang.String term,
        int start, int end);
}
