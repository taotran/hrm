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
    private String _methodName112;
    private String[] _methodParameterTypes112;
    private String _methodName113;
    private String[] _methodParameterTypes113;
    private String _methodName118;
    private String[] _methodParameterTypes118;
    private String _methodName119;
    private String[] _methodParameterTypes119;
    private String _methodName120;
    private String[] _methodParameterTypes120;
    private String _methodName121;
    private String[] _methodParameterTypes121;
    private String _methodName122;
    private String[] _methodParameterTypes122;
    private String _methodName123;
    private String[] _methodParameterTypes123;
    private String _methodName124;
    private String[] _methodParameterTypes124;
    private String _methodName125;
    private String[] _methodParameterTypes125;
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

        _methodName112 = "getBeanIdentifier";

        _methodParameterTypes112 = new String[] {  };

        _methodName113 = "setBeanIdentifier";

        _methodParameterTypes113 = new String[] { "java.lang.String" };

        _methodName118 = "findAll";

        _methodParameterTypes118 = new String[] {  };

        _methodName119 = "findAll";

        _methodParameterTypes119 = new String[] { "int", "int" };

        _methodName120 = "findAll";

        _methodParameterTypes120 = new String[] {
                "int", "int", "com.liferay.portal.kernel.util.OrderByComparator"
            };

        _methodName121 = "searchCandidates";

        _methodParameterTypes121 = new String[] {
                "long", "java.lang.String", "java.lang.String",
                "java.lang.String", "java.lang.String", "int", "int"
            };

        _methodName122 = "searchCandidates";

        _methodParameterTypes122 = new String[] {
                "long", "java.lang.String", "java.lang.String",
                "java.lang.String", "java.lang.String", "int", "int",
                "com.liferay.portal.kernel.util.OrderByComparator"
            };

        _methodName123 = "create";

        _methodParameterTypes123 = new String[] {
                "long", "java.lang.String", "java.lang.String",
                "java.lang.String", "java.lang.String", "java.lang.String",
                "java.lang.String", "int", "java.sql.Date", "long",
                "java.lang.String", "int", "java.lang.Long",
                "com.liferay.portal.service.ServiceContext"
            };

        _methodName124 = "edit";

        _methodParameterTypes124 = new String[] {
                "long", "long", "java.lang.String", "java.lang.String",
                "java.lang.String", "java.lang.String", "java.lang.String",
                "java.lang.String", "int", "java.sql.Date", "long", "boolean",
                "java.lang.String", "int", "java.lang.Long",
                "com.liferay.portal.service.ServiceContext"
            };

        _methodName125 = "changeCandidateStatus";

        _methodParameterTypes125 = new String[] {
                "long", "long", "long",
                "vn.com.ecopharma.hrm.constant.CandidateStatus",
                "com.liferay.portal.service.ServiceContext"
            };

        _methodName126 = "delele";

        _methodParameterTypes126 = new String[] { "long" };

        _methodName127 = "findCandidates";

        _methodParameterTypes127 = new String[] {
                "java.lang.String", "java.lang.String", "java.lang.String",
                "java.lang.String"
            };

        _methodName128 = "findCandidates";

        _methodParameterTypes128 = new String[] {
                "java.lang.String", "java.lang.String", "java.lang.String",
                "java.lang.String", "int", "int"
            };

        _methodName129 = "countAll";

        _methodParameterTypes129 = new String[] {  };

        _methodName130 = "filterCandidates";

        _methodParameterTypes130 = new String[] {
                "java.lang.String", "java.lang.String", "java.lang.String",
                "java.lang.String", "java.lang.String", "java.lang.String",
                "java.lang.String", "java.lang.String", "java.lang.String",
                "java.lang.String", "int", "int"
            };

        _methodName131 = "getFilterCandidatesSize";

        _methodParameterTypes131 = new String[] {
                "java.lang.String", "java.lang.String", "java.lang.String",
                "java.lang.String", "java.lang.String", "java.lang.String",
                "java.lang.String", "java.lang.String", "java.lang.String",
                "java.lang.String"
            };

        _methodName132 = "dynamicQueryTest";

        _methodParameterTypes132 = new String[] { "java.lang.String", "int", "int" };

        _methodName133 = "filterCandidateForExport";

        _methodParameterTypes133 = new String[] { "com.google.gson.JsonArray" };
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

        if (_methodName112.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes112, parameterTypes)) {
            return CandidateLocalServiceUtil.getBeanIdentifier();
        }

        if (_methodName113.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes113, parameterTypes)) {
            CandidateLocalServiceUtil.setBeanIdentifier((java.lang.String) arguments[0]);

            return null;
        }

        if (_methodName118.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes118, parameterTypes)) {
            return CandidateLocalServiceUtil.findAll();
        }

        if (_methodName119.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes119, parameterTypes)) {
            return CandidateLocalServiceUtil.findAll(((Integer) arguments[0]).intValue(),
                ((Integer) arguments[1]).intValue());
        }

        if (_methodName120.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes120, parameterTypes)) {
            return CandidateLocalServiceUtil.findAll(((Integer) arguments[0]).intValue(),
                ((Integer) arguments[1]).intValue(),
                (com.liferay.portal.kernel.util.OrderByComparator) arguments[2]);
        }

        if (_methodName121.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes121, parameterTypes)) {
            return CandidateLocalServiceUtil.searchCandidates(((Long) arguments[0]).longValue(),
                (java.lang.String) arguments[1],
                (java.lang.String) arguments[2],
                (java.lang.String) arguments[3],
                (java.lang.String) arguments[4],
                ((Integer) arguments[5]).intValue(),
                ((Integer) arguments[6]).intValue());
        }

        if (_methodName122.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes122, parameterTypes)) {
            return CandidateLocalServiceUtil.searchCandidates(((Long) arguments[0]).longValue(),
                (java.lang.String) arguments[1],
                (java.lang.String) arguments[2],
                (java.lang.String) arguments[3],
                (java.lang.String) arguments[4],
                ((Integer) arguments[5]).intValue(),
                ((Integer) arguments[6]).intValue(),
                (com.liferay.portal.kernel.util.OrderByComparator) arguments[7]);
        }

        if (_methodName123.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes123, parameterTypes)) {
            return CandidateLocalServiceUtil.create(((Long) arguments[0]).longValue(),
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
                (java.lang.Long) arguments[12],
                (com.liferay.portal.service.ServiceContext) arguments[13]);
        }

        if (_methodName124.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes124, parameterTypes)) {
            return CandidateLocalServiceUtil.edit(((Long) arguments[0]).longValue(),
                ((Long) arguments[1]).longValue(),
                (java.lang.String) arguments[2],
                (java.lang.String) arguments[3],
                (java.lang.String) arguments[4],
                (java.lang.String) arguments[5],
                (java.lang.String) arguments[6],
                (java.lang.String) arguments[7],
                ((Integer) arguments[8]).intValue(),
                (java.sql.Date) arguments[9],
                ((Long) arguments[10]).longValue(),
                ((Boolean) arguments[11]).booleanValue(),
                (java.lang.String) arguments[12],
                ((Integer) arguments[13]).intValue(),
                (java.lang.Long) arguments[14],
                (com.liferay.portal.service.ServiceContext) arguments[15]);
        }

        if (_methodName125.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes125, parameterTypes)) {
            return CandidateLocalServiceUtil.changeCandidateStatus(((Long) arguments[0]).longValue(),
                ((Long) arguments[1]).longValue(),
                ((Long) arguments[2]).longValue(),
                (vn.com.ecopharma.hrm.constant.CandidateStatus) arguments[3],
                (com.liferay.portal.service.ServiceContext) arguments[4]);
        }

        if (_methodName126.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes126, parameterTypes)) {
            CandidateLocalServiceUtil.delele(((Long) arguments[0]).longValue());

            return null;
        }

        if (_methodName127.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes127, parameterTypes)) {
            return CandidateLocalServiceUtil.findCandidates((java.lang.String) arguments[0],
                (java.lang.String) arguments[1],
                (java.lang.String) arguments[2], (java.lang.String) arguments[3]);
        }

        if (_methodName128.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes128, parameterTypes)) {
            return CandidateLocalServiceUtil.findCandidates((java.lang.String) arguments[0],
                (java.lang.String) arguments[1],
                (java.lang.String) arguments[2],
                (java.lang.String) arguments[3],
                ((Integer) arguments[4]).intValue(),
                ((Integer) arguments[5]).intValue());
        }

        if (_methodName129.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes129, parameterTypes)) {
            return CandidateLocalServiceUtil.countAll();
        }

        if (_methodName130.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes130, parameterTypes)) {
            return CandidateLocalServiceUtil.filterCandidates((java.lang.String) arguments[0],
                (java.lang.String) arguments[1],
                (java.lang.String) arguments[2],
                (java.lang.String) arguments[3],
                (java.lang.String) arguments[4],
                (java.lang.String) arguments[5],
                (java.lang.String) arguments[6],
                (java.lang.String) arguments[7],
                (java.lang.String) arguments[8],
                (java.lang.String) arguments[9],
                ((Integer) arguments[10]).intValue(),
                ((Integer) arguments[11]).intValue());
        }

        if (_methodName131.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes131, parameterTypes)) {
            return CandidateLocalServiceUtil.getFilterCandidatesSize((java.lang.String) arguments[0],
                (java.lang.String) arguments[1],
                (java.lang.String) arguments[2],
                (java.lang.String) arguments[3],
                (java.lang.String) arguments[4],
                (java.lang.String) arguments[5],
                (java.lang.String) arguments[6],
                (java.lang.String) arguments[7],
                (java.lang.String) arguments[8], (java.lang.String) arguments[9]);
        }

        if (_methodName132.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes132, parameterTypes)) {
            return CandidateLocalServiceUtil.dynamicQueryTest((java.lang.String) arguments[0],
                ((Integer) arguments[1]).intValue(),
                ((Integer) arguments[2]).intValue());
        }

        if (_methodName133.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes133, parameterTypes)) {
            return CandidateLocalServiceUtil.filterCandidateForExport((com.google.gson.JsonArray) arguments[0]);
        }

        throw new UnsupportedOperationException();
    }
}
