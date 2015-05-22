package vn.com.ecopharma.hrm.service.persistence;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import vn.com.ecopharma.hrm.model.Candidate;
import vn.com.ecopharma.hrm.model.Vacancy;
import vn.com.ecopharma.hrm.model.impl.CandidateImpl;
import vn.com.ecopharma.hrm.model.impl.VacancyImpl;

import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;
import com.liferay.util.dao.orm.CustomSQLUtil;

public class CandidateFinderImpl extends BasePersistenceImpl<Candidate>
		implements CandidateFinder {

	public List<Candidate> filterCandidates(String filterString) {
		Session session = null;
		try {
			session = openSession();
//			String sql = CustomSQLUtil.get("candidateSQLFilter");
//			SQLQuery query = session.createSQLQuery(sql);
			String sql = "SELECT * FROM lportal.hrm_candidate c WHERE c.first_name LIKE %"+ filterString +"% OR c.middle_name LIKE %"+ filterString +"% OR c.last_name LIKE %"+ filterString +"%";
/*			List<Object> args = new ArrayList<Object>();
			args.add(filterString);
			args.add(filterString);
			args.add(filterString);
			sql = String.format(sql, args);*/
			SQLQuery query = session.createSQLQuery(sql);
			query.setCacheable(false);
			query.addEntity("Candidate", CandidateImpl.class);
			/*QueryPos qPos = QueryPos.getInstance(query);
			qPos.add(filterString);
			qPos.add(filterString);
			qPos.add(filterString);*/
			return (List<Candidate>) query.list();

		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			closeSession(session);
		}
		return null;
	}
	
	public List<Candidate> filterCandidateByGlobalString(String filterString) {
		Session session = null;
		try {
			session = openSession();
			String sql = CustomSQLUtil.get("candidateSQLFilter");
			SQLQuery query = session.createSQLQuery(sql);
			query.setCacheable(false);
			query.addEntity("Candidate", CandidateImpl.class);
			QueryPos qPos = QueryPos.getInstance(query);
			String param = "first_name LIKE '%" + filterString + "%' OR email LIKE '%" + filterString + "%'";
			qPos.add(param);
			return (List<Candidate>) query.list();

		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			closeSession(session);
		}
		return null;
	}
	
	public Long findVacancyByCandidate(long c_id) {
		Session session = null;
		try {
			session = openSession();
			String sql = CustomSQLUtil.get("getVacanciesByCandidate");
			SQLQuery query = session.createSQLQuery(sql);
			query.setCacheable(false);
			
			QueryPos qPos = QueryPos.getInstance(query);
			qPos.add(c_id);
			
			return ((BigInteger) query.list().get(0)).longValue();

		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			closeSession(session);
		}
		return null;
	}
}
