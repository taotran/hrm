package vn.com.ecopharma.hrm.service.base;

import vn.com.ecopharma.hrm.service.LocationServiceUtil;

import java.util.Arrays;

/**
 * @author tvt
 * @generated
 */
public class LocationServiceClpInvoker {
    private String _methodName96;
    private String[] _methodParameterTypes96;
    private String _methodName97;
    private String[] _methodParameterTypes97;

    public LocationServiceClpInvoker() {
        _methodName96 = "getBeanIdentifier";

        _methodParameterTypes96 = new String[] {  };

        _methodName97 = "setBeanIdentifier";

        _methodParameterTypes97 = new String[] { "java.lang.String" };
    }

    public Object invokeMethod(String name, String[] parameterTypes,
        Object[] arguments) throws Throwable {
        if (_methodName96.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes96, parameterTypes)) {
            return LocationServiceUtil.getBeanIdentifier();
        }

        if (_methodName97.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes97, parameterTypes)) {
            LocationServiceUtil.setBeanIdentifier((java.lang.String) arguments[0]);

            return null;
        }

        throw new UnsupportedOperationException();
    }
}
