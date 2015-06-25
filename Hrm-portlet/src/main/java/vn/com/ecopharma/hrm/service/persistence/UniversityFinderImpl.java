package vn.com.ecopharma.hrm.service.persistence;

import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;

import vn.com.ecopharma.hrm.model.University;
import vn.com.ecopharma.hrm.model.impl.UniversityImpl;

import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

public class UniversityFinderImpl extends BasePersistenceImpl<University>
	implements UniversityFinder {
	
	public int filterUniversitiesByTermSize(String term) {
		Session session = null;
		final StringBuilder queryBuilder = new StringBuilder();
		queryBuilder.append("SELECT u.* "
							+ "FROM hrm_recruitment_university u "
							+ "WHERE u.name LIKE ? ");
		session = openSession();
		SQLQuery sqlQuery = session.createSQLQuery(queryBuilder.toString());
		QueryPos qPos = QueryPos.getInstance(sqlQuery);
		sqlQuery.addEntity("u", UniversityImpl.class);
		qPos.add("%" + term + "%");
		return sqlQuery.list().size();
	}
	
	public JSONArray filterUniversitiesByTerm(String term, int start, int end) {
		final JSONArray result = new JSONArray();
		Session session = null;
		final StringBuilder queryBuilder = new StringBuilder();
		queryBuilder.append("SELECT u.* "
							+ "FROM hrm_recruitment_university u "
							+ "WHERE u.name LIKE ? ");
		queryBuilder.append("LIMIT ?, ?");
		session = openSession();
		SQLQuery sqlQuery = session.createSQLQuery(queryBuilder.toString());
		QueryPos qPos = QueryPos.getInstance(sqlQuery);
		sqlQuery.addEntity("u", UniversityImpl.class);
		qPos.add("%" + term + "%");
		qPos.add(start);
		qPos.add(end);
		@SuppressWarnings("unchecked")
		final List<University> us = (List<University>)sqlQuery.list();
		for (University u : us) {
			final JSONObject obj = new JSONObject();
			obj.put("id", u.getUniversityId());
			obj.put("text", u.getName());
			result.put(obj);
		}
		return result;
	}

}
