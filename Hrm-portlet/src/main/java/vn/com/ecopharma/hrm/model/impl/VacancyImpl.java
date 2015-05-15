package vn.com.ecopharma.hrm.model.impl;

import java.util.List;

import vn.com.ecopharma.hrm.model.Candidate;

/**
 * The extended model implementation for the Vacancy service. Represents a row
 * in the &quot;HRM_Vacancy&quot; database table, with each column mapped to a
 * property of this class.
 *
 * <p>
 * Helper methods and all application logic should be put in this class.
 * Whenever methods are added, rerun ServiceBuilder to copy their definitions
 * into the {@link vn.com.ecopharma.hrm.model.Vacancy} interface.
 * </p>
 *
 * @author tvt
 */
public class VacancyImpl extends VacancyBaseImpl {

	private List<Candidate> _candidates;

	/*
	 * NOTE FOR DEVELOPERS:
	 * 
	 * Never reference this class directly. All methods that expect a vacancy
	 * model instance should use the {@link vn.com.ecopharma.hrm.model.Vacancy}
	 * interface instead.
	 */
	public VacancyImpl() {
	}

	public List<Candidate> get_candidates() {
		return _candidates;
	}

	public void set_candidates(List<Candidate> _candidates) {
		this._candidates = _candidates;
	}

}
