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
    private String _methodName16;
    private String[] _methodParameterTypes16;
    private String _methodName17;
    private String[] _methodParameterTypes17;
    private String _methodName18;
    private String[] _methodParameterTypes18;
    private String _methodName19;
    private String[] _methodParameterTypes19;
    private String _methodName20;
    private String[] _methodParameterTypes20;
    private String _methodName21;
    private String[] _methodParameterTypes21;
    private String _methodName22;
    private String[] _methodParameterTypes22;
    private String _methodName23;
    private String[] _methodParameterTypes23;
    private String _methodName24;
    private String[] _methodParameterTypes24;
    private String _methodName25;
    private String[] _methodParameterTypes25;
    private String _methodName26;
    private String[] _methodParameterTypes26;
    private String _methodName27;
    private String[] _methodParameterTypes27;
    private String _methodName28;
    private String[] _methodParameterTypes28;
    private String _methodName29;
    private String[] _methodParameterTypes29;
    private String _methodName30;
    private String[] _methodParameterTypes30;
    private String _methodName31;
    private String[] _methodParameterTypes31;
    private String _methodName70;
    private String[] _methodParameterTypes70;
    private String _methodName71;
    private String[] _methodParameterTypes71;
    private String _methodName76;
    private String[] _methodParameterTypes76;
    private String _methodName77;
    private String[] _methodParameterTypes77;
    private String _methodName78;
    private String[] _methodParameterTypes78;

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

        _methodName16 = "addCandidateVacancy";

        _methodParameterTypes16 = new String[] { "long", "long" };

        _methodName17 = "addCandidateVacancy";

        _methodParameterTypes17 = new String[] {
                "long", "vn.com.ecopharma.hrm.model.Vacancy"
            };

        _methodName18 = "addCandidateVacancies";

        _methodParameterTypes18 = new String[] { "long", "long[][]" };

        _methodName19 = "addCandidateVacancies";

        _methodParameterTypes19 = new String[] { "long", "java.util.List" };

        _methodName20 = "clearCandidateVacancies";

        _methodParameterTypes20 = new String[] { "long" };

        _methodName21 = "deleteCandidateVacancy";

        _methodParameterTypes21 = new String[] { "long", "long" };

        _methodName22 = "deleteCandidateVacancy";

        _methodParameterTypes22 = new String[] {
                "long", "vn.com.ecopharma.hrm.model.Vacancy"
            };

        _methodName23 = "deleteCandidateVacancies";

        _methodParameterTypes23 = new String[] { "long", "long[][]" };

        _methodName24 = "deleteCandidateVacancies";

        _methodParameterTypes24 = new String[] { "long", "java.util.List" };

        _methodName25 = "getCandidateVacancies";

        _methodParameterTypes25 = new String[] { "long" };

        _methodName26 = "getCandidateVacancies";

        _methodParameterTypes26 = new String[] { "long", "int", "int" };

        _methodName27 = "getCandidateVacancies";

        _methodParameterTypes27 = new String[] {
                "long", "int", "int",
                "com.liferay.portal.kernel.util.OrderByComparator"
            };

        _methodName28 = "getCandidateVacanciesCount";

        _methodParameterTypes28 = new String[] { "long" };

        _methodName29 = "hasCandidateVacancy";

        _methodParameterTypes29 = new String[] { "long", "long" };

        _methodName30 = "hasCandidateVacancies";

        _methodParameterTypes30 = new String[] { "long" };

        _methodName31 = "setCandidateVacancies";

        _methodParameterTypes31 = new String[] { "long", "long[][]" };

        _methodName70 = "getBeanIdentifier";

        _methodParameterTypes70 = new String[] {  };

        _methodName71 = "setBeanIdentifier";

        _methodParameterTypes71 = new String[] { "java.lang.String" };

        _methodName76 = "findAll";

        _methodParameterTypes76 = new String[] {  };

        _methodName77 = "createVacancy";

        _methodParameterTypes77 = new String[] {
                "long", "long", "long", "java.lang.String", "java.lang.String",
                "int", "boolean", "java.util.List",
                "com.liferay.portal.service.ServiceContext"
            };

        _methodName78 = "editVacancy";

        _methodParameterTypes78 = new String[] {
                "long", "long", "long", "java.lang.String", "java.lang.String",
                "int", "boolean", "java.util.Date"
            };
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

        if (_methodName16.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes16, parameterTypes)) {
            VacancyLocalServiceUtil.addCandidateVacancy(((Long) arguments[0]).longValue(),
                ((Long) arguments[1]).longValue());

            return null;
        }

        if (_methodName17.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes17, parameterTypes)) {
            VacancyLocalServiceUtil.addCandidateVacancy(((Long) arguments[0]).longValue(),
                (vn.com.ecopharma.hrm.model.Vacancy) arguments[1]);

            return null;
        }

        if (_methodName18.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes18, parameterTypes)) {
            VacancyLocalServiceUtil.addCandidateVacancies(((Long) arguments[0]).longValue(),
                (long[]) arguments[1]);

            return null;
        }

        if (_methodName19.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes19, parameterTypes)) {
            VacancyLocalServiceUtil.addCandidateVacancies(((Long) arguments[0]).longValue(),
                (java.util.List<vn.com.ecopharma.hrm.model.Vacancy>) arguments[1]);

            return null;
        }

        if (_methodName20.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes20, parameterTypes)) {
            VacancyLocalServiceUtil.clearCandidateVacancies(((Long) arguments[0]).longValue());

            return null;
        }

        if (_methodName21.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes21, parameterTypes)) {
            VacancyLocalServiceUtil.deleteCandidateVacancy(((Long) arguments[0]).longValue(),
                ((Long) arguments[1]).longValue());

            return null;
        }

        if (_methodName22.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes22, parameterTypes)) {
            VacancyLocalServiceUtil.deleteCandidateVacancy(((Long) arguments[0]).longValue(),
                (vn.com.ecopharma.hrm.model.Vacancy) arguments[1]);

            return null;
        }

        if (_methodName23.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes23, parameterTypes)) {
            VacancyLocalServiceUtil.deleteCandidateVacancies(((Long) arguments[0]).longValue(),
                (long[]) arguments[1]);

            return null;
        }

        if (_methodName24.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes24, parameterTypes)) {
            VacancyLocalServiceUtil.deleteCandidateVacancies(((Long) arguments[0]).longValue(),
                (java.util.List<vn.com.ecopharma.hrm.model.Vacancy>) arguments[1]);

            return null;
        }

        if (_methodName25.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes25, parameterTypes)) {
            return VacancyLocalServiceUtil.getCandidateVacancies(((Long) arguments[0]).longValue());
        }

        if (_methodName26.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes26, parameterTypes)) {
            return VacancyLocalServiceUtil.getCandidateVacancies(((Long) arguments[0]).longValue(),
                ((Integer) arguments[1]).intValue(),
                ((Integer) arguments[2]).intValue());
        }

        if (_methodName27.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes27, parameterTypes)) {
            return VacancyLocalServiceUtil.getCandidateVacancies(((Long) arguments[0]).longValue(),
                ((Integer) arguments[1]).intValue(),
                ((Integer) arguments[2]).intValue(),
                (com.liferay.portal.kernel.util.OrderByComparator) arguments[3]);
        }

        if (_methodName28.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes28, parameterTypes)) {
            return VacancyLocalServiceUtil.getCandidateVacanciesCount(((Long) arguments[0]).longValue());
        }

        if (_methodName29.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes29, parameterTypes)) {
            return VacancyLocalServiceUtil.hasCandidateVacancy(((Long) arguments[0]).longValue(),
                ((Long) arguments[1]).longValue());
        }

        if (_methodName30.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes30, parameterTypes)) {
            return VacancyLocalServiceUtil.hasCandidateVacancies(((Long) arguments[0]).longValue());
        }

        if (_methodName31.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes31, parameterTypes)) {
            VacancyLocalServiceUtil.setCandidateVacancies(((Long) arguments[0]).longValue(),
                (long[]) arguments[1]);

            return null;
        }

        if (_methodName70.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes70, parameterTypes)) {
            return VacancyLocalServiceUtil.getBeanIdentifier();
        }

        if (_methodName71.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes71, parameterTypes)) {
            VacancyLocalServiceUtil.setBeanIdentifier((java.lang.String) arguments[0]);

            return null;
        }

        if (_methodName76.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes76, parameterTypes)) {
            return VacancyLocalServiceUtil.findAll();
        }

        if (_methodName77.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes77, parameterTypes)) {
            return VacancyLocalServiceUtil.createVacancy(((Long) arguments[0]).longValue(),
                ((Long) arguments[1]).longValue(),
                ((Long) arguments[2]).longValue(),
                (java.lang.String) arguments[3],
                (java.lang.String) arguments[4],
                ((Integer) arguments[5]).intValue(),
                ((Boolean) arguments[6]).booleanValue(),
                (java.util.List<vn.com.ecopharma.hrm.model.Candidate>) arguments[7],
                (com.liferay.portal.service.ServiceContext) arguments[8]);
        }

        if (_methodName78.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes78, parameterTypes)) {
            return VacancyLocalServiceUtil.editVacancy(((Long) arguments[0]).longValue(),
                ((Long) arguments[1]).longValue(),
                ((Long) arguments[2]).longValue(),
                (java.lang.String) arguments[3],
                (java.lang.String) arguments[4],
                ((Integer) arguments[5]).intValue(),
                ((Boolean) arguments[6]).booleanValue(),
                (java.util.Date) arguments[7]);
        }

        throw new UnsupportedOperationException();
    }
}
