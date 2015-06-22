package vn.com.ecopharma.hrm.service.persistence;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import vn.com.ecopharma.hrm.model.Candidate;
import vn.com.ecopharma.hrm.model.impl.CandidateImpl;

import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

public class CandidateFinderImpl extends BasePersistenceImpl<Candidate>
		implements CandidateFinder {

	private static final String VACANCY_NAME_COL = "vacancy";
	private static final String FULL_NAME_COL = "fullname";	

	private StringBuilder getFilterQuery(String vacancy_name,
			String sortColumnName, String sortDirection) {
		final StringBuilder query = new StringBuilder();
		query.append("SELECT c.* FROM hrm_recruitment_candidate c ");
		query.append("WHERE (CONCAT(c.first_name, ' ', c.middle_name, ' ', c.last_name) LIKE ? "
				+ "OR c.email LIKE ? "
				+ "OR c.contact_number LIKE ? "
				+ "OR c.candidate_status LIKE ? "
				+ "OR c.c_id "
					+ "IN (SELECT cd.c_id FROM hrm_recruitment_candidate cd "
					+ "JOIN hrm_recruitment_vacancycandidate vc ON vc.c_id = cd.c_id "
					+ "JOIN hrm_recruitment_vacancy v ON vc.v_id = v.v_id "
					+ "WHERE v.name LIKE ?)) ");
		query.append("AND  CONCAT(c.first_name, ' ', c.middle_name, ' ', c.last_name) LIKE ? "
				+ "AND c.email LIKE ? "
				+ "AND c.contact_number LIKE ? "
				+ "AND c.candidate_status LIKE ? "
				+ "AND (c.date_of_application >= STR_TO_DATE(?,'%m/%d/%Y') AND c.date_of_application <= STR_TO_DATE(?,'%m/%d/%Y')) ");
		if (vacancy_name != null && !vacancy_name.isEmpty()) {
			query.append("AND c.c_id "
					+ "IN (SELECT cd.c_id FROM hrm_recruitment_candidate cd "
					+ "JOIN hrm_recruitment_vacancycandidate vc ON vc.c_id = cd.c_id "
					+ "JOIN hrm_recruitment_vacancy v ON vc.v_id = v.v_id "
					+ "WHERE v.name LIKE ?) ");
		} 
		
		/* ORDER Part */
		
		if (FULL_NAME_COL.equalsIgnoreCase(sortColumnName)) {
			query.append("ORDER BY c.first_name " + sortDirection + ", c.middle_name " + sortDirection + ", c.last_name " + sortDirection + " "); 
		} else if (VACANCY_NAME_COL.equalsIgnoreCase(sortColumnName)) {
			query.append("ORDER BY "
								+ "(SELECT v.name "
								+ "FROM hrm_recruitment_candidate cd "
								+ "JOIN hrm_recruitment_vacancycandidate vc ON vc.c_id = cd.c_id "
								+ "JOIN hrm_recruitment_vacancy v ON vc.v_id = v.v_id "
								+ "WHERE cd.c_id = c.c_id AND vc.vc_status = 'VALID') "
								+ sortDirection 
								+ " ");
		} else {
			query.append("ORDER BY " + sortColumnName + " " + sortDirection 
						+ " "); 
		}
		
		return query;
	}

	private QueryPos getFilterCandidatesQueryPos(SQLQuery q, String globStr,
			String name, String email, String contact_number,
			String candidate_status, String vacancy_name, String date_from,
			String date_to) {
		final QueryPos qPos = QueryPos.getInstance(q);
		/* Filter by GLOBAL (OR) */
		qPos.add("%" + globStr + "%"); // name
		qPos.add("%" + globStr + "%"); // email
		qPos.add("%" + globStr + "%"); // contact number
		qPos.add("%" + globStr + "%"); // candidate status
		qPos.add("%" + globStr + "%"); // vacancy_name

		/* Filter by FIELD (AND) */
		qPos.add("%" + name + "%"); // name

		qPos.add("%" + email + "%"); // email
		qPos.add("%" + contact_number + "%"); // contact number
		qPos.add("%" + candidate_status + "%"); // candidate status

		final SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");

		if (date_from == null || date_from.isEmpty()) {
			date_from = "01/01/1970";
		}

		if (date_to == null || date_to.isEmpty()) {
			date_to = sdf.format(new Date(System.currentTimeMillis()));
		}
		System.out.println(date_from + "/n" + date_to);
		qPos.add(date_from); // date_from
		qPos.add(date_to); // date_to
		if (vacancy_name != null && !vacancy_name.isEmpty()) {
			qPos.add("%" + vacancy_name + "%"); // vacancy_name
		}
		return qPos;
	}

	public int getFilterCandidatesSize(String globStr, String name,
			String email, String contact_number, String candidate_status,
			String vacancy_name, String date_from, String date_to,
			String sortColumnName, String sortDirection) {
		Session session = null;
		try {
			session = openSession();
			final StringBuilder query = getFilterQuery(vacancy_name,
					sortColumnName, sortDirection);
			final SQLQuery q = session.createSQLQuery(query.toString());
			q.addEntity("c", CandidateImpl.class);
			getFilterCandidatesQueryPos(q, globStr, name, email,
					contact_number, candidate_status, vacancy_name, date_from,
					date_to);
			return q.list().size();
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			closeSession(session);
		}
		return 0;
	}

	@SuppressWarnings("unchecked")
	public List<Candidate> filterCandidates(String globStr, String name,
			String email, String contact_number, String candidate_status,
			String vacancy_name, String date_from, String date_to,
			String sortColumnName, String sortDirection, int start, int end) {
		Session session = null;
		try {
			session = openSession();
			final StringBuilder query = getFilterQuery(vacancy_name,
					sortColumnName, sortDirection);
			final StringBuilder sb_limit = new StringBuilder();
			sb_limit.append("LIMIT ?, ?");
			query.append(sb_limit);
			final SQLQuery q = session.createSQLQuery(query.toString());
			q.addEntity("c", CandidateImpl.class);
			final QueryPos qPos = getFilterCandidatesQueryPos(q, globStr, name,
					email, contact_number, candidate_status, vacancy_name,
					date_from, date_to);

			/*
			 * LIMIT Notice:start FROM 0
			 */
			qPos.add(start);
			qPos.add(end);

			return (List<Candidate>) q.list();
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			closeSession(session);
		}
		return null;
	}
}
