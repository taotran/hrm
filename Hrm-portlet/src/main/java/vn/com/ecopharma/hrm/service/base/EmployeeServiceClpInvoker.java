package vn.com.ecopharma.hrm.service.base;

import vn.com.ecopharma.hrm.service.EmployeeServiceUtil;

import java.util.Arrays;

/**
 * @author tvt
 * @generated
 */
public class EmployeeServiceClpInvoker {
    private String _methodName104;
    private String[] _methodParameterTypes104;
    private String _methodName105;
    private String[] _methodParameterTypes105;

    public EmployeeServiceClpInvoker() {
        _methodName104 = "getBeanIdentifier";

        _methodParameterTypes104 = new String[] {  };

        _methodName105 = "setBeanIdentifier";

        _methodParameterTypes105 = new String[] { "java.lang.String" };
    }

    public Object invokeMethod(String name, String[] parameterTypes,
        Object[] arguments) throws Throwable {
        if (_methodName104.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes104, parameterTypes)) {
            return EmployeeServiceUtil.getBeanIdentifier();
        }

        if (_methodName105.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes105, parameterTypes)) {
            EmployeeServiceUtil.setBeanIdentifier((java.lang.String) arguments[0]);

            return null;
        }

        throw new UnsupportedOperationException();
    }
}
