package vn.com.ecopharma.hrm.service.persistence;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.json.JSONArray;
import org.json.JSONObject;

import vn.com.ecopharma.hrm.model.Employee;
import vn.com.ecopharma.hrm.model.impl.EmployeeImpl;

import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

public class EmployeeFinderImpl extends BasePersistenceImpl<Employee> implements
		EmployeeFinder {

	private StringBuilder getFilterQuery(String globStr, String fullName,
			String emp_code, String contact_number, String joined_date_from,
			String joined_date_to, List<String> jobTitles, Long subUnitId,
			String promoted_date_from, String promoted_date_to, String sortField, String sortOrder) {
		final StringBuilder query = new StringBuilder();
		query.append("SELECT e.* FROM pf_employee e "
				+ "WHERE (e.emp_code LIKE ? "
				+ "OR e.employee_userId "
				+ "IN "
				+ "	(SELECT u.userId FROM user_ u JOIN pf_employee emp ON emp.employee_userId = u.userId WHERE CONCAT(u.firstName, ' ', u.middleName, ' ', u.lastName) LIKE ?) "
				+ "OR e.subUnitId "
				+ "	IN  "
				+ "    (SELECT s.subUnitId FROM pf_subunit s JOIN pf_employee emp ON emp.subUnitId = s.subUnitId WHERE s.subUnitId LIKE ?) "
				+ "OR e.jobtitleId "
				+ "	IN "
				+ "    (SELECT j.jobtitleId FROM pf_jtitle j JOIN pf_employee emp ON emp.jobtitleId = j.jobtitleId WHERE j.title LIKE ?) "
				+ "OR e.gender LIKE ? "
				+ "    ) "
				+ "AND e.emp_code LIKE ? "
				+ "AND e.gender LIKE ? "
				+ "AND e.employee_userId "
				+ "	IN "
				+ "	(SELECT u.userId FROM user_ u JOIN pf_employee emp ON emp.employee_userId = u.userId WHERE CONCAT(u.firstName, ' ', u.middleName, ' ', u.lastName) LIKE ?) "
				+ "AND (e.joined_date >= STR_TO_DATE(?,'%d/%m/%Y') AND e.joined_date <= STR_TO_DATE(?,'%d/%m/%Y')) ");
		query.toString();
		if (jobTitles != null && jobTitles.size() > 0) {
			query.append("AND e.jobtitleId "
					+ "	IN "
					+ "    (SELECT j.jobtitleId FROM pf_jtitle j JOIN pf_employee emp ON emp.jobtitleId = j.jobtitleId WHERE ");
			int count = 0;
			for (String title : jobTitles) {
				if (count < jobTitles.size() - 1) {
					query.append("j.title LIKE '%" + title + "%' OR ");
					count++;
				} else {
					query.append("j.title LIKE '%" + title + "%' )");
				}
			}
		}
		query.append(" ");
		if(sortField != null && sortField != StringUtils.EMPTY) {
			if (sortField.equalsIgnoreCase("fullName")) {
				query.append("ORDER BY "
						+ "(SELECT CONCAT(u.firstName, ' ', u.middleName, ' ', u.lastName) "
						+ "FROM user_ u "
						+ "JOIN pf_employee e ON u.userId = e.employee_userId) "
						+ sortOrder + " ");
			} else if (sortField.equalsIgnoreCase("selectedJTitles")) {
				query.append("ORDER BY "
						+ "(SELECT j.title "
						+ "FROM pf_jTitle j "
						+ "JOIN pf_employee e ON j.jobTitleId = e.jobTitleId WHERE j.jobTitleId = e.jobtitleId) "
						+ sortOrder + " ");
			} else {
				query.append("ORDER BY " + sortField + " " + sortOrder);
			}
			
		}
		query.append(" ");
		return query;
	}

	@SuppressWarnings("unchecked")
	public List<Employee> filterEmployees(String globStr, String fullName,
			String emp_code, String gender, String contact_number, String joined_date_from,
			String joined_date_to, List<String> jobTitles, Long subUnitId,
			String promoted_date_from, String promoted_date_to, int start, int end, boolean isDeleted, String sortField, String sortOrder) {
			Session session = null;
			final StringBuilder queryBuilder = new StringBuilder();
			queryBuilder.append(getFilterQuery(globStr, fullName, emp_code, contact_number, joined_date_from, joined_date_to, jobTitles, subUnitId, promoted_date_from, promoted_date_to, sortField, sortOrder));
			queryBuilder.append("LIMIT ?, ?");
			System.out.println(queryBuilder.toString());
			session = openSession();
			SQLQuery sqlQuery = session.createSQLQuery(queryBuilder.toString());
			sqlQuery.addEntity("e", EmployeeImpl.class);
			
			QueryPos qPos = QueryPos.getInstance(sqlQuery);
			//OR
			
			qPos.add("%" + globStr + "%");//emp_code
			qPos.add("%" + globStr + "%");//full name
			qPos.add("%" + globStr + "%");//sub unit
			qPos.add("%" + globStr + "%");//job title
			qPos.add("%" + globStr + "%");//gender
			//AND 
			
			qPos.add("%" + emp_code + "%");//emp_code
			qPos.add("%" + gender + "%");//emp_code
			qPos.add("%" + fullName + "%");//full name
			qPos.add(joined_date_from != StringUtils.EMPTY ? joined_date_from : "01/01/1970"); // joined date from
			qPos.add(joined_date_to != StringUtils.EMPTY ? joined_date_to : "01/01/2030"); // joined date to	
			
			//LIMIT
			
			qPos.add(start);
			qPos.add(end);
		return (List<Employee>)sqlQuery.list();
	}

	public int filterEmployeeByTermSize(String term) {
		Session session = null;
		final StringBuilder queryBuilder = new StringBuilder();
		queryBuilder
				.append("SELECT e.* "
						+ "FROM hrm_recruitment_employee e "
						+ "WHERE CONCAT(e.firstname, ' ', e.middle_name,' ', e.lastname) LIKE ? ");
		session = openSession();
		SQLQuery sqlQuery = session.createSQLQuery(queryBuilder.toString());
		QueryPos qPos = QueryPos.getInstance(sqlQuery);
		qPos.add("%" + term + "%");
		return sqlQuery.list().size();
	}

	public JSONArray filterEmployeeByTerm(String term, int start, int end) {
		final JSONArray result = new JSONArray();
		Session session = null;
		final StringBuilder queryBuilder = new StringBuilder();
		queryBuilder
				.append("SELECT e.* "
						+ "FROM hrm_recruitment_employee e "
						+ "WHERE CONCAT(e.firstname, ' ', e.middle_name,' ', e.lastname) LIKE ? ");
		queryBuilder.append("LIMIT ?, ?");
		session = openSession();
		SQLQuery sqlQuery = session.createSQLQuery(queryBuilder.toString());
		QueryPos qPos = QueryPos.getInstance(sqlQuery);
		sqlQuery.addEntity("e", EmployeeImpl.class);
		qPos.add("%" + term + "%");
		qPos.add(start);
		qPos.add(end);
		@SuppressWarnings("unchecked")
		final List<Employee> emps = (List<Employee>) sqlQuery.list();
		for (Employee e : emps) {
			final JSONObject obj = new JSONObject();
			obj.put("id", e.getEmployeeId());
			/*
			 * obj.put("text", e.getFirstname() + " " + e.getMiddle_name() + " "
			 * + e.getLastname());
			 */
			result.put(obj);
		}
		return result;
	}

}
