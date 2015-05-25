package vn.com.ecopharma.hrm.model;

import com.liferay.portal.model.PersistedModel;

/**
 * The extended model interface for the Candidate service. Represents a row in the &quot;HRM_Recruitment_Candidate&quot; database table, with each column mapped to a property of this class.
 *
 * @author tvt
 * @see CandidateModel
 * @see vn.com.ecopharma.hrm.model.impl.CandidateImpl
 * @see vn.com.ecopharma.hrm.model.impl.CandidateModelImpl
 * @generated
 */
public interface Candidate extends CandidateModel, PersistedModel {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this interface directly. Add methods to {@link vn.com.ecopharma.hrm.model.impl.CandidateImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
     */
    public java.util.List<vn.com.ecopharma.hrm.model.Vacancy> get_vacancies();

    public void set_vacancies(
        java.util.List<vn.com.ecopharma.hrm.model.Vacancy> _vacancies);

    public java.lang.String getFullName();
}
