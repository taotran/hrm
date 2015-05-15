package vn.com.ecopharma.hrm.model.impl;

import java.util.List;

import vn.com.ecopharma.hrm.model.Vacancy;

/**
 * The extended model implementation for the Candidate service. Represents a row
 * in the &quot;HRM_Candidate&quot; database table, with each column mapped to a
 * property of this class.
 *
 * <p>
 * Helper methods and all application logic should be put in this class.
 * Whenever methods are added, rerun ServiceBuilder to copy their definitions
 * into the {@link vn.com.ecopharma.hrm.model.Candidate} interface.
 * </p>
 *
 * @author tvt
 */
public class CandidateImpl extends CandidateBaseImpl {

	private List<Vacancy> _vacancies;

	/*
	 * NOTE FOR DEVELOPERS:
	 * 
	 * Never reference this class directly. All methods that expect a candidate
	 * model instance should use the {@link
	 * vn.com.ecopharma.hrm.model.Candidate} interface instead.
	 */
	public CandidateImpl() {
	}

	public List<Vacancy> get_vacancies() {
		return _vacancies;
	}

	public void set_vacancies(List<Vacancy> _vacancies) {
		this._vacancies = _vacancies;
	}

}
