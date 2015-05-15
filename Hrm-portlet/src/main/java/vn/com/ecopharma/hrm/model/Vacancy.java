package vn.com.ecopharma.hrm.model;

import com.liferay.portal.model.PersistedModel;

/**
 * The extended model interface for the Vacancy service. Represents a row in the &quot;HRM_Vacancy&quot; database table, with each column mapped to a property of this class.
 *
 * @author tvt
 * @see VacancyModel
 * @see vn.com.ecopharma.hrm.model.impl.VacancyImpl
 * @see vn.com.ecopharma.hrm.model.impl.VacancyModelImpl
 * @generated
 */
public interface Vacancy extends VacancyModel, PersistedModel {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this interface directly. Add methods to {@link vn.com.ecopharma.hrm.model.impl.VacancyImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
     */
    public java.util.List<vn.com.ecopharma.hrm.model.Candidate> get_candidates();

    public void set_candidates(
        java.util.List<vn.com.ecopharma.hrm.model.Candidate> _candidates);
}
