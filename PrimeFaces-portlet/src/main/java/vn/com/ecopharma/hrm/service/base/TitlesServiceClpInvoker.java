package vn.com.ecopharma.hrm.service.base;

import vn.com.ecopharma.hrm.service.TitlesServiceUtil;

import java.util.Arrays;

/**
 * @author tvt
 * @generated
 */
public class TitlesServiceClpInvoker {
    private String _methodName68;
    private String[] _methodParameterTypes68;
    private String _methodName69;
    private String[] _methodParameterTypes69;

    public TitlesServiceClpInvoker() {
        _methodName68 = "getBeanIdentifier";

        _methodParameterTypes68 = new String[] {  };

        _methodName69 = "setBeanIdentifier";

        _methodParameterTypes69 = new String[] { "java.lang.String" };
    }

    public Object invokeMethod(String name, String[] parameterTypes,
        Object[] arguments) throws Throwable {
        if (_methodName68.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes68, parameterTypes)) {
            return TitlesServiceUtil.getBeanIdentifier();
        }

        if (_methodName69.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes69, parameterTypes)) {
            TitlesServiceUtil.setBeanIdentifier((java.lang.String) arguments[0]);

            return null;
        }

        throw new UnsupportedOperationException();
    }
}
