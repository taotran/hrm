package vn.com.ecopharma.hrm.service.base;

import vn.com.ecopharma.hrm.service.EmployeeInterviewScheduleServiceUtil;

import java.util.Arrays;

/**
 * @author tvt
 * @generated
 */
public class EmployeeInterviewScheduleServiceClpInvoker {
    private String _methodName88;
    private String[] _methodParameterTypes88;
    private String _methodName89;
    private String[] _methodParameterTypes89;

    public EmployeeInterviewScheduleServiceClpInvoker() {
        _methodName88 = "getBeanIdentifier";

        _methodParameterTypes88 = new String[] {  };

        _methodName89 = "setBeanIdentifier";

        _methodParameterTypes89 = new String[] { "java.lang.String" };
    }

    public Object invokeMethod(String name, String[] parameterTypes,
        Object[] arguments) throws Throwable {
        if (_methodName88.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes88, parameterTypes)) {
            return EmployeeInterviewScheduleServiceUtil.getBeanIdentifier();
        }

        if (_methodName89.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes89, parameterTypes)) {
            EmployeeInterviewScheduleServiceUtil.setBeanIdentifier((java.lang.String) arguments[0]);

            return null;
        }

        throw new UnsupportedOperationException();
    }
}
