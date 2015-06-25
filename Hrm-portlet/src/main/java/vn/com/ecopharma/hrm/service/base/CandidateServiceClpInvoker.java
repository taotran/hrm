package vn.com.ecopharma.hrm.service.base;

import vn.com.ecopharma.hrm.service.CandidateServiceUtil;

import java.util.Arrays;

/**
 * @author tvt
 * @generated
 */
public class CandidateServiceClpInvoker {
    private String _methodName104;
    private String[] _methodParameterTypes104;
    private String _methodName105;
    private String[] _methodParameterTypes105;
    private String _methodName110;
    private String[] _methodParameterTypes110;

    public CandidateServiceClpInvoker() {
        _methodName104 = "getBeanIdentifier";

        _methodParameterTypes104 = new String[] {  };

        _methodName105 = "setBeanIdentifier";

        _methodParameterTypes105 = new String[] { "java.lang.String" };

        _methodName110 = "findAll";

        _methodParameterTypes110 = new String[] {  };
    }

    public Object invokeMethod(String name, String[] parameterTypes,
        Object[] arguments) throws Throwable {
        if (_methodName104.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes104, parameterTypes)) {
            return CandidateServiceUtil.getBeanIdentifier();
        }

        if (_methodName105.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes105, parameterTypes)) {
            CandidateServiceUtil.setBeanIdentifier((java.lang.String) arguments[0]);

            return null;
        }

        if (_methodName110.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes110, parameterTypes)) {
            return CandidateServiceUtil.findAll();
        }

        throw new UnsupportedOperationException();
    }
}
