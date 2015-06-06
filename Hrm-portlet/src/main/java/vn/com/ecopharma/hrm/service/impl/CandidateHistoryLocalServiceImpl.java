package vn.com.ecopharma.hrm.service.impl;

import java.util.List;

import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.service.ServiceContext;

import vn.com.ecopharma.hrm.NoSuchCandidateHistoryException;
import vn.com.ecopharma.hrm.model.CandidateHistory;
import vn.com.ecopharma.hrm.service.base.CandidateHistoryLocalServiceBaseImpl;

/**
 * The implementation of the candidate history local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link vn.com.ecopharma.hrm.service.CandidateHistoryLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author tvt
 * @see vn.com.ecopharma.hrm.service.base.CandidateHistoryLocalServiceBaseImpl
 * @see vn.com.ecopharma.hrm.service.CandidateHistoryLocalServiceUtil
 */
public class CandidateHistoryLocalServiceImpl
    extends CandidateHistoryLocalServiceBaseImpl {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never reference this interface directly. Always use {@link vn.com.ecopharma.hrm.service.CandidateHistoryLocalServiceUtil} to access the candidate history local service.
     */
	
	public List<CandidateHistory> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS);
	}
	
	public List<CandidateHistory> findAll(int start, int end) throws SystemException {
		return findAll(start, end, null);
	}
	
	public List<CandidateHistory> findAll(int start, int end, OrderByComparator orderByComparator) throws SystemException {
		return candidateHistoryPersistence.findAll(start, end, orderByComparator);
	}
	
	public CandidateHistory create(long c_id, long v_id, long interviewId, long performer_id, 
			String note, String interviewers, String action, long userId, ServiceContext serviceContext) throws SystemException{
		final CandidateHistory candidateHistory = candidateHistoryPersistence.create(counterLocalService.increment());
		candidateHistory.setC_id(c_id);
		candidateHistory.setV_id(v_id);
		candidateHistory.setInterviewId(interviewId);
		candidateHistory.setPerformed_by(performer_id);
		candidateHistory.setAction(action);
		candidateHistory.setInterviewers(interviewers);
		candidateHistory.setUserId(userId);
		candidateHistory.setNote(note);
		candidateHistory.setGroupId(serviceContext.getScopeGroupId());
		candidateHistoryPersistence.update(candidateHistory);
		return candidateHistory;
	}
	
	public CandidateHistory edit(long candidateHistoryId, long c_id, long v_id, long interviewId, long performer_id, 
			String note, String interviewers, String action, long userId, ServiceContext serviceContext) throws SystemException, NoSuchCandidateHistoryException{
		final CandidateHistory candidateHistory = candidateHistoryPersistence.fetchByPrimaryKey(candidateHistoryId);
		candidateHistory.setV_id(v_id);
		candidateHistory.setInterviewId(interviewId);
		candidateHistory.setPerformed_by(performer_id);
		candidateHistory.setAction(action);
		candidateHistory.setInterviewers(interviewers);
		candidateHistory.setUserId(userId);
		candidateHistory.setGroupId(serviceContext.getScopeGroupId());
		candidateHistory.setNote(note);
		candidateHistoryPersistence.update(candidateHistory);
		return candidateHistory;
	}
	
	public List<CandidateHistory> findByCandidate(long c_id) throws SystemException {
		return candidateHistoryPersistence.findByC_Id(c_id);
	}
	
	
}
