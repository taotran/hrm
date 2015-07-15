package vn.com.ecopharma.hrm.service.base;

import vn.com.ecopharma.hrm.service.JTitleServiceUtil;

import java.util.Arrays;

/**
 * @author tvt
 * @generated
 */
public class JTitleServiceClpInvoker {
    private String _methodName68;
    private String[] _methodParameterTypes68;
    private String _methodName69;
    private String[] _methodParameterTypes69;

    public JTitleServiceClpInvoker() {
        _methodName68 = "getBeanIdentifier";

        _methodParameterTypes68 = new String[] {  };

        _methodName69 = "setBeanIdentifier";

        _methodParameterTypes69 = new String[] { "java.lang.String" };
    }

    public Object invokeMethod(String name, String[] parameterTypes,
        Object[] arguments) throws Throwable {
        if (_methodName68.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes68, parameterTypes)) {
            return JTitleServiceUtil.getBeanIdentifier();
        }

        if (_methodName69.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes69, parameterTypes)) {
            JTitleServiceUtil.setBeanIdentifier((java.lang.String) arguments[0]);

            return null;
        }

        throw new UnsupportedOperationException();
    }
}
