package vn.com.ecopharma.hrm.service.base;

import vn.com.ecopharma.hrm.service.VacancyLocalServiceUtil;

import java.util.Arrays;

/**
 * @author tvt
 * @generated
 */
public class VacancyLocalServiceClpInvoker {
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
    private String _methodName128;
    private String[] _methodParameterTypes128;
    private String _methodName129;
    private String[] _methodParameterTypes129;
    private String _methodName130;
    private String[] _methodParameterTypes130;
    private String _methodName131;
    private String[] _methodParameterTypes131;
    private String _methodName132;
    private String[] _methodParameterTypes132;
    private String _methodName133;
    private String[] _methodParameterTypes133;
    private String _methodName134;
    private String[] _methodParameterTypes134;
    private String _methodName135;
    private String[] _methodParameterTypes135;
    private String _methodName136;
    private String[] _methodParameterTypes136;
    private String _methodName137;
    private String[] _methodParameterTypes137;

    public VacancyLocalServiceClpInvoker() {
        _methodName0 = "addVacancy";

        _methodParameterTypes0 = new String[] {
                "vn.com.ecopharma.hrm.model.Vacancy"
            };

        _methodName1 = "createVacancy";

        _methodParameterTypes1 = new String[] { "long" };

        _methodName2 = "deleteVacancy";

        _methodParameterTypes2 = new String[] { "long" };

        _methodName3 = "deleteVacancy";

        _methodParameterTypes3 = new String[] {
                "vn.com.ecopharma.hrm.model.Vacancy"
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

        _methodName10 = "fetchVacancy";

        _methodParameterTypes10 = new String[] { "long" };

        _methodName11 = "getVacancy";

        _methodParameterTypes11 = new String[] { "long" };

        _methodName12 = "getPersistedModel";

        _methodParameterTypes12 = new String[] { "java.io.Serializable" };

        _methodName13 = "getVacancies";

        _methodParameterTypes13 = new String[] { "int", "int" };

        _methodName14 = "getVacanciesCount";

        _methodParameterTypes14 = new String[] {  };

        _methodName15 = "updateVacancy";

        _methodParameterTypes15 = new String[] {
                "vn.com.ecopharma.hrm.model.Vacancy"
            };

        _methodName120 = "getBeanIdentifier";

        _methodParameterTypes120 = new String[] {  };

        _methodName121 = "setBeanIdentifier";

        _methodParameterTypes121 = new String[] { "java.lang.String" };

        _methodName126 = "findAll";

        _methodParameterTypes126 = new String[] {  };

        _methodName127 = "findAll";

        _methodParameterTypes127 = new String[] { "int", "int" };

        _methodName128 = "findAll";

        _methodParameterTypes128 = new String[] {
                "int", "int", "com.liferay.portal.kernel.util.OrderByComparator"
            };

        _methodName129 = "create";

        _methodParameterTypes129 = new String[] {
                "long", "long", "long", "long", "java.util.List",
                "java.lang.String", "java.lang.String", "int",
                "java.lang.String", "java.lang.String", "long",
                "com.liferay.portal.service.ServiceContext"
            };

        _methodName130 = "edit";

        _methodParameterTypes130 = new String[] {
                "long", "long", "long", "long", "java.util.List",
                "java.lang.String", "java.lang.String", "int",
                "java.lang.String", "long", "java.lang.Boolean",
                "com.liferay.portal.service.ServiceContext"
            };

        _methodName131 = "delete";

        _methodParameterTypes131 = new String[] { "long" };

        _methodName132 = "getFilterVacanciesSize";

        _methodParameterTypes132 = new String[] {
                "java.lang.String", "java.lang.String", "java.lang.String",
                "java.lang.String", "java.lang.String", "java.lang.String",
                "java.lang.String"
            };

        _methodName133 = "getVacancyByCandidate_And_VALID_Status";

        _methodParameterTypes133 = new String[] { "long" };

        _methodName134 = "getVacancyNameByCandidate_And_VALID_Status";

        _methodParameterTypes134 = new String[] { "long" };

        _methodName135 = "filterVacancies";

        _methodParameterTypes135 = new String[] {
                "java.lang.String", "java.lang.String", "java.lang.String",
                "java.lang.String", "java.lang.String", "java.lang.String",
                "java.lang.String", "int", "int"
            };

        _methodName136 = "getVacancySuccessionReport";

        _methodParameterTypes136 = new String[] {  };

        _methodName137 = "countAll";

        _methodParameterTypes137 = new String[] {  };
    }

    public Object invokeMethod(String name, String[] parameterTypes,
        Object[] arguments) throws Throwable {
        if (_methodName0.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes0, parameterTypes)) {
            return VacancyLocalServiceUtil.addVacancy((vn.com.ecopharma.hrm.model.Vacancy) arguments[0]);
        }

        if (_methodName1.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes1, parameterTypes)) {
            return VacancyLocalServiceUtil.createVacancy(((Long) arguments[0]).longValue());
        }

        if (_methodName2.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes2, parameterTypes)) {
            return VacancyLocalServiceUtil.deleteVacancy(((Long) arguments[0]).longValue());
        }

        if (_methodName3.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes3, parameterTypes)) {
            return VacancyLocalServiceUtil.deleteVacancy((vn.com.ecopharma.hrm.model.Vacancy) arguments[0]);
        }

        if (_methodName4.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes4, parameterTypes)) {
            return VacancyLocalServiceUtil.dynamicQuery();
        }

        if (_methodName5.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes5, parameterTypes)) {
            return VacancyLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery) arguments[0]);
        }

        if (_methodName6.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes6, parameterTypes)) {
            return VacancyLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery) arguments[0],
                ((Integer) arguments[1]).intValue(),
                ((Integer) arguments[2]).intValue());
        }

        if (_methodName7.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes7, parameterTypes)) {
            return VacancyLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery) arguments[0],
                ((Integer) arguments[1]).intValue(),
                ((Integer) arguments[2]).intValue(),
                (com.liferay.portal.kernel.util.OrderByComparator) arguments[3]);
        }

        if (_methodName8.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes8, parameterTypes)) {
            return VacancyLocalServiceUtil.dynamicQueryCount((com.liferay.portal.kernel.dao.orm.DynamicQuery) arguments[0]);
        }

        if (_methodName9.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes9, parameterTypes)) {
            return VacancyLocalServiceUtil.dynamicQueryCount((com.liferay.portal.kernel.dao.orm.DynamicQuery) arguments[0],
                (com.liferay.portal.kernel.dao.orm.Projection) arguments[1]);
        }

        if (_methodName10.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes10, parameterTypes)) {
            return VacancyLocalServiceUtil.fetchVacancy(((Long) arguments[0]).longValue());
        }

        if (_methodName11.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes11, parameterTypes)) {
            return VacancyLocalServiceUtil.getVacancy(((Long) arguments[0]).longValue());
        }

        if (_methodName12.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes12, parameterTypes)) {
            return VacancyLocalServiceUtil.getPersistedModel((java.io.Serializable) arguments[0]);
        }

        if (_methodName13.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes13, parameterTypes)) {
            return VacancyLocalServiceUtil.getVacancies(((Integer) arguments[0]).intValue(),
                ((Integer) arguments[1]).intValue());
        }

        if (_methodName14.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes14, parameterTypes)) {
            return VacancyLocalServiceUtil.getVacanciesCount();
        }

        if (_methodName15.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes15, parameterTypes)) {
            return VacancyLocalServiceUtil.updateVacancy((vn.com.ecopharma.hrm.model.Vacancy) arguments[0]);
        }

        if (_methodName120.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes120, parameterTypes)) {
            return VacancyLocalServiceUtil.getBeanIdentifier();
        }

        if (_methodName121.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes121, parameterTypes)) {
            VacancyLocalServiceUtil.setBeanIdentifier((java.lang.String) arguments[0]);

            return null;
        }

        if (_methodName126.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes126, parameterTypes)) {
            return VacancyLocalServiceUtil.findAll();
        }

        if (_methodName127.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes127, parameterTypes)) {
            return VacancyLocalServiceUtil.findAll(((Integer) arguments[0]).intValue(),
                ((Integer) arguments[1]).intValue());
        }

        if (_methodName128.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes128, parameterTypes)) {
            return VacancyLocalServiceUtil.findAll(((Integer) arguments[0]).intValue(),
                ((Integer) arguments[1]).intValue(),
                (com.liferay.portal.kernel.util.OrderByComparator) arguments[2]);
        }

        if (_methodName129.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes129, parameterTypes)) {
            return VacancyLocalServiceUtil.create(((Long) arguments[0]).longValue(),
                ((Long) arguments[1]).longValue(),
                ((Long) arguments[2]).longValue(),
                ((Long) arguments[3]).longValue(),
                (java.util.List<java.lang.Long>) arguments[4],
                (java.lang.String) arguments[5],
                (java.lang.String) arguments[6],
                ((Integer) arguments[7]).intValue(),
                (java.lang.String) arguments[8],
                (java.lang.String) arguments[9],
                ((Long) arguments[10]).longValue(),
                (com.liferay.portal.service.ServiceContext) arguments[11]);
        }

        if (_methodName130.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes130, parameterTypes)) {
            return VacancyLocalServiceUtil.edit(((Long) arguments[0]).longValue(),
                ((Long) arguments[1]).longValue(),
                ((Long) arguments[2]).longValue(),
                ((Long) arguments[3]).longValue(),
                (java.util.List<java.lang.Long>) arguments[4],
                (java.lang.String) arguments[5],
                (java.lang.String) arguments[6],
                ((Integer) arguments[7]).intValue(),
                (java.lang.String) arguments[8],
                ((Long) arguments[9]).longValue(),
                (java.lang.Boolean) arguments[10],
                (com.liferay.portal.service.ServiceContext) arguments[11]);
        }

        if (_methodName131.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes131, parameterTypes)) {
            VacancyLocalServiceUtil.delete(((Long) arguments[0]).longValue());

            return null;
        }

        if (_methodName132.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes132, parameterTypes)) {
            return VacancyLocalServiceUtil.getFilterVacanciesSize((java.lang.String) arguments[0],
                (java.lang.String) arguments[1],
                (java.lang.String) arguments[2],
                (java.lang.String) arguments[3],
                (java.lang.String) arguments[4],
                (java.lang.String) arguments[5], (java.lang.String) arguments[6]);
        }

        if (_methodName133.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes133, parameterTypes)) {
            return VacancyLocalServiceUtil.getVacancyByCandidate_And_VALID_Status(((Long) arguments[0]).longValue());
        }

        if (_methodName134.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes134, parameterTypes)) {
            return VacancyLocalServiceUtil.getVacancyNameByCandidate_And_VALID_Status(((Long) arguments[0]).longValue());
        }

        if (_methodName135.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes135, parameterTypes)) {
            return VacancyLocalServiceUtil.filterVacancies((java.lang.String) arguments[0],
                (java.lang.String) arguments[1],
                (java.lang.String) arguments[2],
                (java.lang.String) arguments[3],
                (java.lang.String) arguments[4],
                (java.lang.String) arguments[5],
                (java.lang.String) arguments[6],
                ((Integer) arguments[7]).intValue(),
                ((Integer) arguments[8]).intValue());
        }

        if (_methodName136.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes136, parameterTypes)) {
            return VacancyLocalServiceUtil.getVacancySuccessionReport();
        }

        if (_methodName137.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes137, parameterTypes)) {
            return VacancyLocalServiceUtil.countAll();
        }

        throw new UnsupportedOperationException();
    }
}
