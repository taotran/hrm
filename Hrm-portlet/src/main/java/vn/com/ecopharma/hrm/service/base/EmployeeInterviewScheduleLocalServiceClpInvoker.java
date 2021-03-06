package vn.com.ecopharma.hrm.service.base;

import vn.com.ecopharma.hrm.service.EmployeeInterviewScheduleLocalServiceUtil;

import java.util.Arrays;

/**
 * @author tvt
 * @generated
 */
public class EmployeeInterviewScheduleLocalServiceClpInvoker {
    private String _methodName0;
    private String[] _methodParameterTypes0;
    private String _methodName1;
    private String[] _methodParameterTypes1;
    private String _methodName2;
    private String[] _methodParameterTypes2;
    private String _methodName3;
    private String[] _methodParameterTypes3;
    private String _methodName4;
    private String[] _methodParameterTypes4;
    private String _methodName5;
    private String[] _methodParameterTypes5;
    private String _methodName6;
    private String[] _methodParameterTypes6;
    private String _methodName7;
    private String[] _methodParameterTypes7;
    private String _methodName8;
    private String[] _methodParameterTypes8;
    private String _methodName9;
    private String[] _methodParameterTypes9;
    private String _methodName10;
    private String[] _methodParameterTypes10;
    private String _methodName11;
    private String[] _methodParameterTypes11;
    private String _methodName12;
    private String[] _methodParameterTypes12;
    private String _methodName13;
    private String[] _methodParameterTypes13;
    private String _methodName14;
    private String[] _methodParameterTypes14;
    private String _methodName15;
    private String[] _methodParameterTypes15;
    private String _methodName120;
    private String[] _methodParameterTypes120;
    private String _methodName121;
    private String[] _methodParameterTypes121;
    private String _methodName126;
    private String[] _methodParameterTypes126;
    private String _methodName127;
    private String[] _methodParameterTypes127;

    public EmployeeInterviewScheduleLocalServiceClpInvoker() {
        _methodName0 = "addEmployeeInterviewSchedule";

        _methodParameterTypes0 = new String[] {
                "vn.com.ecopharma.hrm.model.EmployeeInterviewSchedule"
            };

        _methodName1 = "createEmployeeInterviewSchedule";

        _methodParameterTypes1 = new String[] { "long" };

        _methodName2 = "deleteEmployeeInterviewSchedule";

        _methodParameterTypes2 = new String[] { "long" };

        _methodName3 = "deleteEmployeeInterviewSchedule";

        _methodParameterTypes3 = new String[] {
                "vn.com.ecopharma.hrm.model.EmployeeInterviewSchedule"
            };

        _methodName4 = "dynamicQuery";

        _methodParameterTypes4 = new String[] {  };

        _methodName5 = "dynamicQuery";

        _methodParameterTypes5 = new String[] {
                "com.liferay.portal.kernel.dao.orm.DynamicQuery"
            };

        _methodName6 = "dynamicQuery";

        _methodParameterTypes6 = new String[] {
                "com.liferay.portal.kernel.dao.orm.DynamicQuery", "int", "int"
            };

        _methodName7 = "dynamicQuery";

        _methodParameterTypes7 = new String[] {
                "com.liferay.portal.kernel.dao.orm.DynamicQuery", "int", "int",
                "com.liferay.portal.kernel.util.OrderByComparator"
            };

        _methodName8 = "dynamicQueryCount";

        _methodParameterTypes8 = new String[] {
                "com.liferay.portal.kernel.dao.orm.DynamicQuery"
            };

        _methodName9 = "dynamicQueryCount";

        _methodParameterTypes9 = new String[] {
                "com.liferay.portal.kernel.dao.orm.DynamicQuery",
                "com.liferay.portal.kernel.dao.orm.Projection"
            };

        _methodName10 = "fetchEmployeeInterviewSchedule";

        _methodParameterTypes10 = new String[] { "long" };

        _methodName11 = "getEmployeeInterviewSchedule";

        _methodParameterTypes11 = new String[] { "long" };

        _methodName12 = "getPersistedModel";

        _methodParameterTypes12 = new String[] { "java.io.Serializable" };

        _methodName13 = "getEmployeeInterviewSchedules";

        _methodParameterTypes13 = new String[] { "int", "int" };

        _methodName14 = "getEmployeeInterviewSchedulesCount";

        _methodParameterTypes14 = new String[] {  };

        _methodName15 = "updateEmployeeInterviewSchedule";

        _methodParameterTypes15 = new String[] {
                "vn.com.ecopharma.hrm.model.EmployeeInterviewSchedule"
            };

        _methodName120 = "getBeanIdentifier";

        _methodParameterTypes120 = new String[] {  };

        _methodName121 = "setBeanIdentifier";

        _methodParameterTypes121 = new String[] { "java.lang.String" };

        _methodName126 = "create";

        _methodParameterTypes126 = new String[] {
                "long", "long", "long",
                "com.liferay.portal.service.ServiceContext"
            };

        _methodName127 = "delete";

        _methodParameterTypes127 = new String[] { "long" };
    }

    public Object invokeMethod(String name, String[] parameterTypes,
        Object[] arguments) throws Throwable {
        if (_methodName0.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes0, parameterTypes)) {
            return EmployeeInterviewScheduleLocalServiceUtil.addEmployeeInterviewSchedule((vn.com.ecopharma.hrm.model.EmployeeInterviewSchedule) arguments[0]);
        }

        if (_methodName1.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes1, parameterTypes)) {
            return EmployeeInterviewScheduleLocalServiceUtil.createEmployeeInterviewSchedule(((Long) arguments[0]).longValue());
        }

        if (_methodName2.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes2, parameterTypes)) {
            return EmployeeInterviewScheduleLocalServiceUtil.deleteEmployeeInterviewSchedule(((Long) arguments[0]).longValue());
        }

        if (_methodName3.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes3, parameterTypes)) {
            return EmployeeInterviewScheduleLocalServiceUtil.deleteEmployeeInterviewSchedule((vn.com.ecopharma.hrm.model.EmployeeInterviewSchedule) arguments[0]);
        }

        if (_methodName4.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes4, parameterTypes)) {
            return EmployeeInterviewScheduleLocalServiceUtil.dynamicQuery();
        }

        if (_methodName5.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes5, parameterTypes)) {
            return EmployeeInterviewScheduleLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery) arguments[0]);
        }

        if (_methodName6.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes6, parameterTypes)) {
            return EmployeeInterviewScheduleLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery) arguments[0],
                ((Integer) arguments[1]).intValue(),
                ((Integer) arguments[2]).intValue());
        }

        if (_methodName7.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes7, parameterTypes)) {
            return EmployeeInterviewScheduleLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery) arguments[0],
                ((Integer) arguments[1]).intValue(),
                ((Integer) arguments[2]).intValue(),
                (com.liferay.portal.kernel.util.OrderByComparator) arguments[3]);
        }

        if (_methodName8.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes8, parameterTypes)) {
            return EmployeeInterviewScheduleLocalServiceUtil.dynamicQueryCount((com.liferay.portal.kernel.dao.orm.DynamicQuery) arguments[0]);
        }

        if (_methodName9.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes9, parameterTypes)) {
            return EmployeeInterviewScheduleLocalServiceUtil.dynamicQueryCount((com.liferay.portal.kernel.dao.orm.DynamicQuery) arguments[0],
                (com.liferay.portal.kernel.dao.orm.Projection) arguments[1]);
        }

        if (_methodName10.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes10, parameterTypes)) {
            return EmployeeInterviewScheduleLocalServiceUtil.fetchEmployeeInterviewSchedule(((Long) arguments[0]).longValue());
        }

        if (_methodName11.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes11, parameterTypes)) {
            return EmployeeInterviewScheduleLocalServiceUtil.getEmployeeInterviewSchedule(((Long) arguments[0]).longValue());
        }

        if (_methodName12.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes12, parameterTypes)) {
            return EmployeeInterviewScheduleLocalServiceUtil.getPersistedModel((java.io.Serializable) arguments[0]);
        }

        if (_methodName13.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes13, parameterTypes)) {
            return EmployeeInterviewScheduleLocalServiceUtil.getEmployeeInterviewSchedules(((Integer) arguments[0]).intValue(),
                ((Integer) arguments[1]).intValue());
        }

        if (_methodName14.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes14, parameterTypes)) {
            return EmployeeInterviewScheduleLocalServiceUtil.getEmployeeInterviewSchedulesCount();
        }

        if (_methodName15.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes15, parameterTypes)) {
            return EmployeeInterviewScheduleLocalServiceUtil.updateEmployeeInterviewSchedule((vn.com.ecopharma.hrm.model.EmployeeInterviewSchedule) arguments[0]);
        }

        if (_methodName120.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes120, parameterTypes)) {
            return EmployeeInterviewScheduleLocalServiceUtil.getBeanIdentifier();
        }

        if (_methodName121.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes121, parameterTypes)) {
            EmployeeInterviewScheduleLocalServiceUtil.setBeanIdentifier((java.lang.String) arguments[0]);

            return null;
        }

        if (_methodName126.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes126, parameterTypes)) {
            return EmployeeInterviewScheduleLocalServiceUtil.create(((Long) arguments[0]).longValue(),
                ((Long) arguments[1]).longValue(),
                ((Long) arguments[2]).longValue(),
                (com.liferay.portal.service.ServiceContext) arguments[3]);
        }

        if (_methodName127.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes127, parameterTypes)) {
            EmployeeInterviewScheduleLocalServiceUtil.delete(((Long) arguments[0]).longValue());

            return null;
        }

        throw new UnsupportedOperationException();
    }
}
