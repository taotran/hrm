package vn.com.ecopharma.hrm.service.base;

import vn.com.ecopharma.hrm.service.VacancyServiceUtil;

import java.util.Arrays;

/**
 * @author tvt
 * @generated
 */
public class VacancyServiceClpInvoker {
    private String _methodName44;
    private String[] _methodParameterTypes44;
    private String _methodName45;
    private String[] _methodParameterTypes45;

    public VacancyServiceClpInvoker() {
        _methodName44 = "getBeanIdentifier";

        _methodParameterTypes44 = new String[] {  };

        _methodName45 = "setBeanIdentifier";

        _methodParameterTypes45 = new String[] { "java.lang.String" };
    }

    public Object invokeMethod(String name, String[] parameterTypes,
        Object[] arguments) throws Throwable {
        if (_methodName44.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes44, parameterTypes)) {
            return VacancyServiceUtil.getBeanIdentifier();
        }

        if (_methodName45.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes45, parameterTypes)) {
            VacancyServiceUtil.setBeanIdentifier((java.lang.String) arguments[0]);

            return null;
        }

        throw new UnsupportedOperationException();
    }
}
