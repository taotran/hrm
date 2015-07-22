package vn.com.ecopharma.hrm.service.base;

import vn.com.ecopharma.hrm.service.Employee_TitlesServiceUtil;

import java.util.Arrays;

/**
 * @author tvt
 * @generated
 */
public class Employee_TitlesServiceClpInvoker {
    private String _methodName62;
    private String[] _methodParameterTypes62;
    private String _methodName63;
    private String[] _methodParameterTypes63;

    public Employee_TitlesServiceClpInvoker() {
        _methodName62 = "getBeanIdentifier";

        _methodParameterTypes62 = new String[] {  };

        _methodName63 = "setBeanIdentifier";

        _methodParameterTypes63 = new String[] { "java.lang.String" };
    }

    public Object invokeMethod(String name, String[] parameterTypes,
        Object[] arguments) throws Throwable {
        if (_methodName62.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes62, parameterTypes)) {
            return Employee_TitlesServiceUtil.getBeanIdentifier();
        }

        if (_methodName63.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes63, parameterTypes)) {
            Employee_TitlesServiceUtil.setBeanIdentifier((java.lang.String) arguments[0]);

            return null;
        }

        throw new UnsupportedOperationException();
    }
}
