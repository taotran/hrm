package vn.com.ecopharma.hrm.service.http;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import vn.com.ecopharma.hrm.service.CandidateServiceUtil;

import java.rmi.RemoteException;

/**
 * Provides the SOAP utility for the
 * {@link vn.com.ecopharma.hrm.service.CandidateServiceUtil} service utility. The
 * static methods of this class calls the same methods of the service utility.
 * However, the signatures are different because it is difficult for SOAP to
 * support certain types.
 *
 * <p>
 * ServiceBuilder follows certain rules in translating the methods. For example,
 * if the method in the service utility returns a {@link java.util.List}, that
 * is translated to an array of {@link vn.com.ecopharma.hrm.model.CandidateSoap}.
 * If the method in the service utility returns a
 * {@link vn.com.ecopharma.hrm.model.Candidate}, that is translated to a
 * {@link vn.com.ecopharma.hrm.model.CandidateSoap}. Methods that SOAP cannot
 * safely wire are skipped.
 * </p>
 *
 * <p>
 * The benefits of using the SOAP utility is that it is cross platform
 * compatible. SOAP allows different languages like Java, .NET, C++, PHP, and
 * even Perl, to call the generated services. One drawback of SOAP is that it is
 * slow because it needs to serialize all calls into a text format (XML).
 * </p>
 *
 * <p>
 * You can see a list of services at http://localhost:8080/api/axis. Set the
 * property <b>axis.servlet.hosts.allowed</b> in portal.properties to configure
 * security.
 * </p>
 *
 * <p>
 * The SOAP utility is only generated for remote services.
 * </p>
 *
 * @author tvt
 * @see CandidateServiceHttp
 * @see vn.com.ecopharma.hrm.model.CandidateSoap
 * @see vn.com.ecopharma.hrm.service.CandidateServiceUtil
 * @generated
 */
public class CandidateServiceSoap {
    private static Log _log = LogFactoryUtil.getLog(CandidateServiceSoap.class);

    public static vn.com.ecopharma.hrm.model.CandidateSoap[] findAll()
        throws RemoteException {
        try {
            java.util.List<vn.com.ecopharma.hrm.model.Candidate> returnValue = CandidateServiceUtil.findAll();

            return vn.com.ecopharma.hrm.model.CandidateSoap.toSoapModels(returnValue);
        } catch (Exception e) {
            _log.error(e, e);

            throw new RemoteException(e.getMessage());
        }
    }
}
