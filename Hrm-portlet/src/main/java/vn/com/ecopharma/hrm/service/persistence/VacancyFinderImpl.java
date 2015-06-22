package vn.com.ecopharma.hrm.service.persistence;

import java.util.List;

import vn.com.ecopharma.hrm.customModel.VacancyReport;
import vn.com.ecopharma.hrm.model.Vacancy;
import vn.com.ecopharma.hrm.model.impl.VacancyImpl;

import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

public class VacancyFinderImpl extends BasePersistenceImpl<Vacancy> implements
		VacancyFinder {

	private static final String JOB_TITLE = "job_title";
	private static final String LOCATION = "location";

	private StringBuilder getFilterQuery(String jobtitle, String locationName,
			String sortColumnName, String sortDirection) {
		final StringBuilder query = new StringBuilder();
		query.append("SELECT v.* FROM hrm_recruitment_vacancy v ");
		query.append("WHERE (v.name LIKE ? ");
		query.append("OR v.jobtitleId "
				+ "IN (SELECT j.jobtitleId FROM hrm_recruitment_jtitle j "
				+ "JOIN hrm_recruitment_vacancy vc ON vc.jobtitleId = j.jobtitleId "
				+ "WHERE j.title LIKE ?) ");
		query.append("OR v.locationId "
				+ "IN (SELECT l.locationId FROM hrm_recruitment_location l "
				+ "JOIN hrm_recruitment_vacancy vc ON vc.locationId = l.locationid "
				+ "WHERE l.name LIKE ?) ");
		query.append("OR v.vacancy_status LIKE ?) ");
		query.append("AND v.name LIKE ? " + "AND v.vacancy_status LIKE ? ");
		if (jobtitle != null && !jobtitle.isEmpty()) {
			query.append("AND v.jobtitleId "
					+ "IN (SELECT j.jobtitleId FROM hrm_recruitment_jtitle j "
					+ "JOIN hrm_recruitment_vacancy vc ON vc.jobtitleId = j.jobtitleId "
					+ "WHERE j.title LIKE ?) ");
		}

		if (locationName != null && !locationName.isEmpty()) {
			query.append("AND v.locationId "
					+ "IN (SELECT l.locationId FROM hrm_recruitment_location l "
					+ "JOIN hrm_recruitment_vacancy vc ON vc.locationId = l.locationid "
					+ "WHERE l.name LIKE ?) ");
		}

		/* ORDER Part */

		if (JOB_TITLE.equalsIgnoreCase(sortColumnName)) {
			query.append("ORDER BY "
					+ "(SELECT j.title "
					+ "FROM hrm_recruitment_jtitle j "
					+ "WHERE j.jobtitleId = v.jobtitleId) " + sortDirection + " ");
		} else if (LOCATION.equalsIgnoreCase(sortColumnName)) {
			query.append("ORDER BY "
					+ "(SELECT l.name "
					+ "FROM hrm_recruitment_location l "
					+ "WHERE l.locationId = v.locationId) " + sortDirection + " ");
		} else {
			query.append("ORDER BY " + sortColumnName + " " + sortDirection
					+ " ");
		}

		return query;
	}

	private QueryPos getFilterVacanciesQueryPos(SQLQuery q, String globStr,
			String name, String jTitle, String location, String vacancy_status) {
		final QueryPos qPos = QueryPos.getInstance(q);
		/* Filter by GLOBAL (OR) */
		qPos.add("%" + globStr + "%"); // name
		qPos.add("%" + globStr + "%"); // jTitle
		qPos.add("%" + globStr + "%"); // location
		qPos.add("%" + globStr + "%"); // status

		/* Filter by FIELD (AND) */
		qPos.add("%" + name + "%"); // name
		qPos.add("%" + vacancy_status + "%"); // vacancy status

		if (jTitle != null && !jTitle.isEmpty()) {
			qPos.add("%" + jTitle + "%"); // vacancy_name
		}

		if (location != null && !location.isEmpty()) {
			qPos.add("%" + location + "%"); // vacancy_name
		}
		return qPos;
	}

	public int getFilterVacanciesSize(String globStr, String name,
			String jTitle, String location, String vacancy_status,
			String sortColumnName, String sortDirection) {
		Session session = null;
		try {
			session = openSession();
			final StringBuilder query = getFilterQuery(jTitle, location,
					sortColumnName, sortDirection);
			final SQLQuery q = session.createSQLQuery(query.toString());
			q.addEntity("v", VacancyImpl.class);
			getFilterVacanciesQueryPos(q, globStr, name, jTitle, location,
					vacancy_status);
			return q.list().size();
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			closeSession(session);
		}
		return 0;
	}

	@SuppressWarnings("unchecked")
	public List<Vacancy> filterVacancies(String globStr, String name,
			String jTitle, String location, String vacancy_status,
			String sortColumnName, String sortDirection, int start, int end) {
		Session session = null;
		try {
			session = openSession();
			final StringBuilder query = getFilterQuery(jTitle, location,
					sortColumnName, sortDirection);
			final StringBuilder sb_limit = new StringBuilder();
			sb_limit.append("LIMIT ?, ?");
			query.append(sb_limit);
			final SQLQuery q = session.createSQLQuery(query.toString());
			q.addEntity("v", VacancyImpl.class);
			final QueryPos qPos = getFilterVacanciesQueryPos(q, globStr, name,
					jTitle, location, vacancy_status);

			/*
			 * LIMIT Notice:start FROM 0
			 */
			qPos.add(start);
			qPos.add(end);

			return (List<Vacancy>) q.list();
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			closeSession(session);
		}
		return null;
	}
	
	public List<Object[]> getVacancySuccessionReport(){
		Session session = null;
		try {
			session = openSession();
			final StringBuilder query = new StringBuilder();
			query.append("SELECT distinct(j.title) as 'Job Title',  v.name as 'Vacancy Name', date_format(v.insert_date, '%d/%m/%Y') AS 'Vacancy Added Date', v.no_of_positions as 'Number of Positions', "
							+ "(SELECT count(*) from lportal.hrm_recruitment_candidate c "
							+ "JOIN lportal.hrm_recruitment_vacancycandidate vc ON c.c_id = vc.c_id "
							+ "JOIN lportal.hrm_recruitment_vacancy vv ON vv.v_id = vc.v_id WHERE vv.v_id = v.v_id) AS 'Number of Applicants', "
							+ "(SELECT count(*) from lportal.hrm_recruitment_candidate c "
							+ "JOIN lportal.hrm_recruitment_vacancycandidate vc ON c.c_id = vc.c_id "
							+ "JOIN lportal.hrm_recruitment_vacancy vv ON vv.v_id = vc.v_id WHERE vv.v_id = v.v_id AND c.candidate_status='SHORTLIST') AS 'Number of Shortlisted', "
							+ "(SELECT count(*) from lportal.hrm_recruitment_candidate c "
							+ "JOIN lportal.hrm_recruitment_vacancycandidate vc ON c.c_id = vc.c_id "
							+ "JOIN lportal.hrm_recruitment_vacancy vv ON vv.v_id = vc.v_id WHERE vv.v_id = v.v_id AND c.candidate_status='HIRE') AS 'Number of Hire' "
						+ "FROM lportal.hrm_recruitment_vacancy v "
						+ "JOIN lportal.hrm_recruitment_jtitle j ON v.jobtitleId = j.jobtitleId;");
			final SQLQuery q = session.createSQLQuery(query.toString());
			return (List<Object[]>)q.list();
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			closeSession(session);
		}
		return null;
	}

}
