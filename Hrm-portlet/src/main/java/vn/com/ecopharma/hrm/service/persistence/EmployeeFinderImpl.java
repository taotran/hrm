package vn.com.ecopharma.hrm.service.persistence;

import java.util.List;

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
	
	public int filterEmployeeByTermSize(String term) {
		Session session = null;
		final StringBuilder queryBuilder = new StringBuilder();
		queryBuilder.append("SELECT e.* "
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
		queryBuilder.append("SELECT e.* "
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
		final List<Employee> emps = (List<Employee>)sqlQuery.list();
		for (Employee e : emps) {
			final JSONObject obj = new JSONObject();
			obj.put("id", e.getEmployeeId());
			/*obj.put("text", e.getFirstname() + " " + e.getMiddle_name() + " " + e.getLastname());*/
			result.put(obj);
		}
		return result;
	}

}
