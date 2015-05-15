package vn.com.ecopharma.hrm.service.impl;

import java.util.List;

import vn.com.ecopharma.hrm.model.Candidate;
import vn.com.ecopharma.hrm.service.base.CandidateServiceBaseImpl;

import com.liferay.portal.kernel.exception.SystemException;

/**
 * The implementation of the candidate remote service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are
 * added, rerun ServiceBuilder to copy their definitions into the
 * {@link vn.com.ecopharma.hrm.service.CandidateService} interface.
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have
 * security checks based on the propagated JAAS credentials because this service
 * can be accessed remotely.
 * </p>
 *
 * @author tvt
 * @see vn.com.ecopharma.hrm.service.base.CandidateServiceBaseImpl
 * @see vn.com.ecopharma.hrm.service.CandidateServiceUtil
 */
public class CandidateServiceImpl extends CandidateServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 * 
	 * Never reference this interface directly. Always use {@link
	 * vn.com.ecopharma.hrm.service.CandidateServiceUtil} to access the
	 * candidate remote service.
	 */

	public List<Candidate> findAll() throws SystemException {
		return candidatePersistence.findAll();
	}
}
