package vn.com.ecopharma.hrm.service.base;

import vn.com.ecopharma.hrm.service.CandidateLocalServiceUtil;

import java.util.Arrays;

/**
 * @author tvt
 * @generated
 */
public class CandidateLocalServiceClpInvoker {
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
    private String _methodName76;
    private String[] _methodParameterTypes76;
    private String _methodName77;
    private String[] _methodParameterTypes77;
    private String _methodName82;
    private String[] _methodParameterTypes82;
    private String _methodName83;
    private String[] _methodParameterTypes83;
    private String _methodName84;
    private String[] _methodParameterTypes84;
    private String _methodName85;
    private String[] _methodParameterTypes85;
    private String _methodName86;
    private String[] _methodParameterTypes86;
    private String _methodName87;
    private String[] _methodParameterTypes87;
    private String _methodName88;
    private String[] _methodParameterTypes88;
    private String _methodName89;
    private String[] _methodParameterTypes89;
    private String _methodName90;
    private String[] _methodParameterTypes90;
    private String _methodName91;
    private String[] _methodParameterTypes91;
    private String _methodName92;
    private String[] _methodParameterTypes92;
    private String _methodName93;
    private String[] _methodParameterTypes93;
    private String _methodName94;
    private String[] _methodParameterTypes94;
    private String _methodName95;
    private String[] _methodParameterTypes95;
    private String _methodName96;
    private String[] _methodParameterTypes96;

    public CandidateLocalServiceClpInvoker() {
        _methodName0 = "addCandidate";

        _methodParameterTypes0 = new String[] {
                "vn.com.ecopharma.hrm.model.Candidate"
            };

        _methodName1 = "createCandidate";

        _methodParameterTypes1 = new String[] { "long" };

        _methodName2 = "deleteCandidate";

        _methodParameterTypes2 = new String[] { "long" };

        _methodName3 = "deleteCandidate";

        _methodParameterTypes3 = new String[] {
                "vn.com.ecopharma.hrm.model.Candidate"
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

        _methodName10 = "fetchCandidate";

        _methodParameterTypes10 = new String[] { "long" };

        _methodName11 = "getCandidate";

        _methodParameterTypes11 = new String[] { "long" };

        _methodName12 = "getPersistedModel";

        _methodParameterTypes12 = new String[] { "java.io.Serializable" };

        _methodName13 = "getCandidates";

        _methodParameterTypes13 = new String[] { "int", "int" };

        _methodName14 = "getCandidatesCount";

        _methodParameterTypes14 = new String[] {  };

        _methodName15 = "updateCandidate";

        _methodParameterTypes15 = new String[] {
                "vn.com.ecopharma.hrm.model.Candidate"
            };

        _methodName16 = "addVacancyCandidate";

        _methodParameterTypes16 = new String[] { "long", "long" };

        _methodName17 = "addVacancyCandidate";

        _methodParameterTypes17 = new String[] {
                "long", "vn.com.ecopharma.hrm.model.Candidate"
            };

        _methodName18 = "addVacancyCandidates";

        _methodParameterTypes18 = new String[] { "long", "long[][]" };

        _methodName19 = "addVacancyCandidates";

        _methodParameterTypes19 = new String[] { "long", "java.util.List" };

        _methodName20 = "clearVacancyCandidates";

        _methodParameterTypes20 = new String[] { "long" };

        _methodName21 = "deleteVacancyCandidate";

        _methodParameterTypes21 = new String[] { "long", "long" };

        _methodName22 = "deleteVacancyCandidate";

        _methodParameterTypes22 = new String[] {
                "long", "vn.com.ecopharma.hrm.model.Candidate"
            };

        _methodName23 = "deleteVacancyCandidates";

        _methodParameterTypes23 = new String[] { "long", "long[][]" };

        _methodName24 = "deleteVacancyCandidates";

        _methodParameterTypes24 = new String[] { "long", "java.util.List" };

        _methodName25 = "getVacancyCandidates";

        _methodParameterTypes25 = new String[] { "long" };

        _methodName26 = "getVacancyCandidates";

        _methodParameterTypes26 = new String[] { "long", "int", "int" };

        _methodName27 = "getVacancyCandidates";

        _methodParameterTypes27 = new String[] {
                "long", "int", "int",
                "com.liferay.portal.kernel.util.OrderByComparator"
            };

        _methodName28 = "getVacancyCandidatesCount";

        _methodParameterTypes28 = new String[] { "long" };

        _methodName29 = "hasVacancyCandidate";

        _methodParameterTypes29 = new String[] { "long", "long" };

        _methodName30 = "hasVacancyCandidates";

        _methodParameterTypes30 = new String[] { "long" };

        _methodName31 = "setVacancyCandidates";

        _methodParameterTypes31 = new String[] { "long", "long[][]" };

        _methodName76 = "getBeanIdentifier";

        _methodParameterTypes76 = new String[] {  };

        _methodName77 = "setBeanIdentifier";

        _methodParameterTypes77 = new String[] { "java.lang.String" };

        _methodName82 = "findAll";

        _methodParameterTypes82 = new String[] {  };

        _methodName83 = "findAll";

        _methodParameterTypes83 = new String[] { "int", "int" };

        _methodName84 = "findCandidates";

        _methodParameterTypes84 = new String[] { "int", "int" };

        _methodName85 = "searchCandidates";

        _methodParameterTypes85 = new String[] {
                "long", "java.lang.String", "java.lang.String",
                "java.lang.String", "java.lang.String", "int", "int"
            };

        _methodName86 = "searchCandidates";

        _methodParameterTypes86 = new String[] {
                "long", "java.lang.String", "java.lang.String",
                "java.lang.String", "java.lang.String", "int", "int",
                "com.liferay.portal.kernel.util.OrderByComparator"
            };

        _methodName87 = "getVacanciesByCandidate";

        _methodParameterTypes87 = new String[] { "long" };

        _methodName88 = "createCandidate";

        _methodParameterTypes88 = new String[] {
                "long", "java.lang.String", "java.lang.String",
                "java.lang.String", "java.lang.String", "java.lang.String",
                "java.lang.String", "int", "java.sql.Date", "long",
                "java.lang.String", "int", "java.util.List",
                "com.liferay.portal.service.ServiceContext"
            };

        _methodName89 = "editCandidate";

        _methodParameterTypes89 = new String[] {
                "long", "java.lang.String", "java.lang.String",
                "java.lang.String", "java.lang.String", "java.lang.String",
                "java.lang.String", "int", "java.sql.Date", "long",
                "java.lang.String", "int", "java.util.List"
            };

        _methodName90 = "delele";

        _methodParameterTypes90 = new String[] { "long" };

        _methodName91 = "findCandidates";

        _methodParameterTypes91 = new String[] {
                "java.lang.String", "java.lang.String", "java.lang.String",
                "java.lang.String"
            };

        _methodName92 = "findCandidates";

        _methodParameterTypes92 = new String[] {
                "java.lang.String", "java.lang.String", "java.lang.String",
                "java.lang.String", "int", "int"
            };

        _methodName93 = "countAll";

        _methodParameterTypes93 = new String[] {  };

        _methodName94 = "filterCandidates";

        _methodParameterTypes94 = new String[] { "java.lang.String" };

        _methodName95 = "filterCandidateByGlobalString";

        _methodParameterTypes95 = new String[] { "java.lang.String" };

        _methodName96 = "findVacancyByCandidate";

        _methodParameterTypes96 = new String[] { "long" };
    }

    public Object invokeMethod(String name, String[] parameterTypes,
        Object[] arguments) throws Throwable {
        if (_methodName0.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes0, parameterTypes)) {
            return CandidateLocalServiceUtil.addCandidate((vn.com.ecopharma.hrm.model.Candidate) arguments[0]);
        }

        if (_methodName1.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes1, parameterTypes)) {
            return CandidateLocalServiceUtil.createCandidate(((Long) arguments[0]).longValue());
        }

        if (_methodName2.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes2, parameterTypes)) {
            return CandidateLocalServiceUtil.deleteCandidate(((Long) arguments[0]).longValue());
        }

        if (_methodName3.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes3, parameterTypes)) {
            return CandidateLocalServiceUtil.deleteCandidate((vn.com.ecopharma.hrm.model.Candidate) arguments[0]);
        }

        if (_methodName4.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes4, parameterTypes)) {
            return CandidateLocalServiceUtil.dynamicQuery();
        }

        if (_methodName5.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes5, parameterTypes)) {
            return CandidateLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery) arguments[0]);
        }

        if (_methodName6.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes6, parameterTypes)) {
            return CandidateLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery) arguments[0],
                ((Integer) arguments[1]).intValue(),
                ((Integer) arguments[2]).intValue());
        }

        if (_methodName7.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes7, parameterTypes)) {
            return CandidateLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery) arguments[0],
                ((Integer) arguments[1]).intValue(),
                ((Integer) arguments[2]).intValue(),
                (com.liferay.portal.kernel.util.OrderByComparator) arguments[3]);
        }

        if (_methodName8.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes8, parameterTypes)) {
            return CandidateLocalServiceUtil.dynamicQueryCount((com.liferay.portal.kernel.dao.orm.DynamicQuery) arguments[0]);
        }

        if (_methodName9.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes9, parameterTypes)) {
            return CandidateLocalServiceUtil.dynamicQueryCount((com.liferay.portal.kernel.dao.orm.DynamicQuery) arguments[0],
                (com.liferay.portal.kernel.dao.orm.Projection) arguments[1]);
        }

        if (_methodName10.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes10, parameterTypes)) {
            return CandidateLocalServiceUtil.fetchCandidate(((Long) arguments[0]).longValue());
        }

        if (_methodName11.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes11, parameterTypes)) {
            return CandidateLocalServiceUtil.getCandidate(((Long) arguments[0]).longValue());
        }

        if (_methodName12.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes12, parameterTypes)) {
            return CandidateLocalServiceUtil.getPersistedModel((java.io.Serializable) arguments[0]);
        }

        if (_methodName13.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes13, parameterTypes)) {
            return CandidateLocalServiceUtil.getCandidates(((Integer) arguments[0]).intValue(),
                ((Integer) arguments[1]).intValue());
        }

        if (_methodName14.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes14, parameterTypes)) {
            return CandidateLocalServiceUtil.getCandidatesCount();
        }

        if (_methodName15.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes15, parameterTypes)) {
            return CandidateLocalServiceUtil.updateCandidate((vn.com.ecopharma.hrm.model.Candidate) arguments[0]);
        }

        if (_methodName16.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes16, parameterTypes)) {
            CandidateLocalServiceUtil.addVacancyCandidate(((Long) arguments[0]).longValue(),
                ((Long) arguments[1]).longValue());

            return null;
        }

        if (_methodName17.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes17, parameterTypes)) {
            CandidateLocalServiceUtil.addVacancyCandidate(((Long) arguments[0]).longValue(),
                (vn.com.ecopharma.hrm.model.Candidate) arguments[1]);

            return null;
        }

        if (_methodName18.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes18, parameterTypes)) {
            CandidateLocalServiceUtil.addVacancyCandidates(((Long) arguments[0]).longValue(),
                (long[]) arguments[1]);

            return null;
        }

        if (_methodName19.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes19, parameterTypes)) {
            CandidateLocalServiceUtil.addVacancyCandidates(((Long) arguments[0]).longValue(),
                (java.util.List<vn.com.ecopharma.hrm.model.Candidate>) arguments[1]);

            return null;
        }

        if (_methodName20.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes20, parameterTypes)) {
            CandidateLocalServiceUtil.clearVacancyCandidates(((Long) arguments[0]).longValue());

            return null;
        }

        if (_methodName21.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes21, parameterTypes)) {
            CandidateLocalServiceUtil.deleteVacancyCandidate(((Long) arguments[0]).longValue(),
                ((Long) arguments[1]).longValue());

            return null;
        }

        if (_methodName22.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes22, parameterTypes)) {
            CandidateLocalServiceUtil.deleteVacancyCandidate(((Long) arguments[0]).longValue(),
                (vn.com.ecopharma.hrm.model.Candidate) arguments[1]);

            return null;
        }

        if (_methodName23.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes23, parameterTypes)) {
            CandidateLocalServiceUtil.deleteVacancyCandidates(((Long) arguments[0]).longValue(),
                (long[]) arguments[1]);

            return null;
        }

        if (_methodName24.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes24, parameterTypes)) {
            CandidateLocalServiceUtil.deleteVacancyCandidates(((Long) arguments[0]).longValue(),
                (java.util.List<vn.com.ecopharma.hrm.model.Candidate>) arguments[1]);

            return null;
        }

        if (_methodName25.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes25, parameterTypes)) {
            return CandidateLocalServiceUtil.getVacancyCandidates(((Long) arguments[0]).longValue());
        }

        if (_methodName26.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes26, parameterTypes)) {
            return CandidateLocalServiceUtil.getVacancyCandidates(((Long) arguments[0]).longValue(),
                ((Integer) arguments[1]).intValue(),
                ((Integer) arguments[2]).intValue());
        }

        if (_methodName27.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes27, parameterTypes)) {
            return CandidateLocalServiceUtil.getVacancyCandidates(((Long) arguments[0]).longValue(),
                ((Integer) arguments[1]).intValue(),
                ((Integer) arguments[2]).intValue(),
                (com.liferay.portal.kernel.util.OrderByComparator) arguments[3]);
        }

        if (_methodName28.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes28, parameterTypes)) {
            return CandidateLocalServiceUtil.getVacancyCandidatesCount(((Long) arguments[0]).longValue());
        }

        if (_methodName29.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes29, parameterTypes)) {
            return CandidateLocalServiceUtil.hasVacancyCandidate(((Long) arguments[0]).longValue(),
                ((Long) arguments[1]).longValue());
        }

        if (_methodName30.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes30, parameterTypes)) {
            return CandidateLocalServiceUtil.hasVacancyCandidates(((Long) arguments[0]).longValue());
        }

        if (_methodName31.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes31, parameterTypes)) {
            CandidateLocalServiceUtil.setVacancyCandidates(((Long) arguments[0]).longValue(),
                (long[]) arguments[1]);

            return null;
        }

        if (_methodName76.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes76, parameterTypes)) {
            return CandidateLocalServiceUtil.getBeanIdentifier();
        }

        if (_methodName77.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes77, parameterTypes)) {
            CandidateLocalServiceUtil.setBeanIdentifier((java.lang.String) arguments[0]);

            return null;
        }

        if (_methodName82.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes82, parameterTypes)) {
            return CandidateLocalServiceUtil.findAll();
        }

        if (_methodName83.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes83, parameterTypes)) {
            return CandidateLocalServiceUtil.findAll(((Integer) arguments[0]).intValue(),
                ((Integer) arguments[1]).intValue());
        }

        if (_methodName84.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes84, parameterTypes)) {
            return CandidateLocalServiceUtil.findCandidates(((Integer) arguments[0]).intValue(),
                ((Integer) arguments[1]).intValue());
        }

        if (_methodName85.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes85, parameterTypes)) {
            return CandidateLocalServiceUtil.searchCandidates(((Long) arguments[0]).longValue(),
                (java.lang.String) arguments[1],
                (java.lang.String) arguments[2],
                (java.lang.String) arguments[3],
                (java.lang.String) arguments[4],
                ((Integer) arguments[5]).intValue(),
                ((Integer) arguments[6]).intValue());
        }

        if (_methodName86.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes86, parameterTypes)) {
            return CandidateLocalServiceUtil.searchCandidates(((Long) arguments[0]).longValue(),
                (java.lang.String) arguments[1],
                (java.lang.String) arguments[2],
                (java.lang.String) arguments[3],
                (java.lang.String) arguments[4],
                ((Integer) arguments[5]).intValue(),
                ((Integer) arguments[6]).intValue(),
                (com.liferay.portal.kernel.util.OrderByComparator) arguments[7]);
        }

        if (_methodName87.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes87, parameterTypes)) {
            return CandidateLocalServiceUtil.getVacanciesByCandidate(((Long) arguments[0]).longValue());
        }

        if (_methodName88.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes88, parameterTypes)) {
            return CandidateLocalServiceUtil.createCandidate(((Long) arguments[0]).longValue(),
                (java.lang.String) arguments[1],
                (java.lang.String) arguments[2],
                (java.lang.String) arguments[3],
                (java.lang.String) arguments[4],
                (java.lang.String) arguments[5],
                (java.lang.String) arguments[6],
                ((Integer) arguments[7]).intValue(),
                (java.sql.Date) arguments[8],
                ((Long) arguments[9]).longValue(),
                (java.lang.String) arguments[10],
                ((Integer) arguments[11]).intValue(),
                (java.util.List<vn.com.ecopharma.hrm.model.Vacancy>) arguments[12],
                (com.liferay.portal.service.ServiceContext) arguments[13]);
        }

        if (_methodName89.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes89, parameterTypes)) {
            return CandidateLocalServiceUtil.editCandidate(((Long) arguments[0]).longValue(),
                (java.lang.String) arguments[1],
                (java.lang.String) arguments[2],
                (java.lang.String) arguments[3],
                (java.lang.String) arguments[4],
                (java.lang.String) arguments[5],
                (java.lang.String) arguments[6],
                ((Integer) arguments[7]).intValue(),
                (java.sql.Date) arguments[8],
                ((Long) arguments[9]).longValue(),
                (java.lang.String) arguments[10],
                ((Integer) arguments[11]).intValue(),
                (java.util.List<vn.com.ecopharma.hrm.model.Vacancy>) arguments[12]);
        }

        if (_methodName90.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes90, parameterTypes)) {
            CandidateLocalServiceUtil.delele(((Long) arguments[0]).longValue());

            return null;
        }

        if (_methodName91.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes91, parameterTypes)) {
            return CandidateLocalServiceUtil.findCandidates((java.lang.String) arguments[0],
                (java.lang.String) arguments[1],
                (java.lang.String) arguments[2], (java.lang.String) arguments[3]);
        }

        if (_methodName92.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes92, parameterTypes)) {
            return CandidateLocalServiceUtil.findCandidates((java.lang.String) arguments[0],
                (java.lang.String) arguments[1],
                (java.lang.String) arguments[2],
                (java.lang.String) arguments[3],
                ((Integer) arguments[4]).intValue(),
                ((Integer) arguments[5]).intValue());
        }

        if (_methodName93.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes93, parameterTypes)) {
            return CandidateLocalServiceUtil.countAll();
        }

        if (_methodName94.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes94, parameterTypes)) {
            return CandidateLocalServiceUtil.filterCandidates((java.lang.String) arguments[0]);
        }

        if (_methodName95.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes95, parameterTypes)) {
            return CandidateLocalServiceUtil.filterCandidateByGlobalString((java.lang.String) arguments[0]);
        }

        if (_methodName96.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes96, parameterTypes)) {
            return CandidateLocalServiceUtil.findVacancyByCandidate(((Long) arguments[0]).longValue());
        }

        throw new UnsupportedOperationException();
    }
}
