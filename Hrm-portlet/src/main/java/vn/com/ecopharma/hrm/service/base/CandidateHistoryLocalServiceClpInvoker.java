package vn.com.ecopharma.hrm.service.base;

import vn.com.ecopharma.hrm.service.CandidateHistoryLocalServiceUtil;

import java.util.Arrays;

/**
 * @author tvt
 * @generated
 */
public class CandidateHistoryLocalServiceClpInvoker {
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

    public CandidateHistoryLocalServiceClpInvoker() {
        _methodName0 = "addCandidateHistory";

        _methodParameterTypes0 = new String[] {
                "vn.com.ecopharma.hrm.model.CandidateHistory"
            };

        _methodName1 = "createCandidateHistory";

        _methodParameterTypes1 = new String[] { "long" };

        _methodName2 = "deleteCandidateHistory";

        _methodParameterTypes2 = new String[] { "long" };

        _methodName3 = "deleteCandidateHistory";

        _methodParameterTypes3 = new String[] {
                "vn.com.ecopharma.hrm.model.CandidateHistory"
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

        _methodName10 = "fetchCandidateHistory";

        _methodParameterTypes10 = new String[] { "long" };

        _methodName11 = "getCandidateHistory";

        _methodParameterTypes11 = new String[] { "long" };

        _methodName12 = "getPersistedModel";

        _methodParameterTypes12 = new String[] { "java.io.Serializable" };

        _methodName13 = "getCandidateHistories";

        _methodParameterTypes13 = new String[] { "int", "int" };

        _methodName14 = "getCandidateHistoriesCount";

        _methodParameterTypes14 = new String[] {  };

        _methodName15 = "updateCandidateHistory";

        _methodParameterTypes15 = new String[] {
                "vn.com.ecopharma.hrm.model.CandidateHistory"
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
                "long", "long", "long", "long", "java.lang.String",
                "java.sql.Date", "java.lang.String", "java.lang.String", "long",
                "com.liferay.portal.service.ServiceContext"
            };

        _methodName130 = "edit";

        _methodParameterTypes130 = new String[] {
                "long", "long", "long", "long", "long", "java.lang.String",
                "java.sql.Date", "java.lang.String", "java.lang.String", "long",
                "com.liferay.portal.service.ServiceContext"
            };

        _methodName131 = "findByCandidate";

        _methodParameterTypes131 = new String[] { "long" };
    }

    public Object invokeMethod(String name, String[] parameterTypes,
        Object[] arguments) throws Throwable {
        if (_methodName0.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes0, parameterTypes)) {
            return CandidateHistoryLocalServiceUtil.addCandidateHistory((vn.com.ecopharma.hrm.model.CandidateHistory) arguments[0]);
        }

        if (_methodName1.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes1, parameterTypes)) {
            return CandidateHistoryLocalServiceUtil.createCandidateHistory(((Long) arguments[0]).longValue());
        }

        if (_methodName2.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes2, parameterTypes)) {
            return CandidateHistoryLocalServiceUtil.deleteCandidateHistory(((Long) arguments[0]).longValue());
        }

        if (_methodName3.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes3, parameterTypes)) {
            return CandidateHistoryLocalServiceUtil.deleteCandidateHistory((vn.com.ecopharma.hrm.model.CandidateHistory) arguments[0]);
        }

        if (_methodName4.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes4, parameterTypes)) {
            return CandidateHistoryLocalServiceUtil.dynamicQuery();
        }

        if (_methodName5.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes5, parameterTypes)) {
            return CandidateHistoryLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery) arguments[0]);
        }

        if (_methodName6.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes6, parameterTypes)) {
            return CandidateHistoryLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery) arguments[0],
                ((Integer) arguments[1]).intValue(),
                ((Integer) arguments[2]).intValue());
        }

        if (_methodName7.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes7, parameterTypes)) {
            return CandidateHistoryLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery) arguments[0],
                ((Integer) arguments[1]).intValue(),
                ((Integer) arguments[2]).intValue(),
                (com.liferay.portal.kernel.util.OrderByComparator) arguments[3]);
        }

        if (_methodName8.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes8, parameterTypes)) {
            return CandidateHistoryLocalServiceUtil.dynamicQueryCount((com.liferay.portal.kernel.dao.orm.DynamicQuery) arguments[0]);
        }

        if (_methodName9.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes9, parameterTypes)) {
            return CandidateHistoryLocalServiceUtil.dynamicQueryCount((com.liferay.portal.kernel.dao.orm.DynamicQuery) arguments[0],
                (com.liferay.portal.kernel.dao.orm.Projection) arguments[1]);
        }

        if (_methodName10.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes10, parameterTypes)) {
            return CandidateHistoryLocalServiceUtil.fetchCandidateHistory(((Long) arguments[0]).longValue());
        }

        if (_methodName11.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes11, parameterTypes)) {
            return CandidateHistoryLocalServiceUtil.getCandidateHistory(((Long) arguments[0]).longValue());
        }

        if (_methodName12.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes12, parameterTypes)) {
            return CandidateHistoryLocalServiceUtil.getPersistedModel((java.io.Serializable) arguments[0]);
        }

        if (_methodName13.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes13, parameterTypes)) {
            return CandidateHistoryLocalServiceUtil.getCandidateHistories(((Integer) arguments[0]).intValue(),
                ((Integer) arguments[1]).intValue());
        }

        if (_methodName14.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes14, parameterTypes)) {
            return CandidateHistoryLocalServiceUtil.getCandidateHistoriesCount();
        }

        if (_methodName15.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes15, parameterTypes)) {
            return CandidateHistoryLocalServiceUtil.updateCandidateHistory((vn.com.ecopharma.hrm.model.CandidateHistory) arguments[0]);
        }

        if (_methodName120.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes120, parameterTypes)) {
            return CandidateHistoryLocalServiceUtil.getBeanIdentifier();
        }

        if (_methodName121.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes121, parameterTypes)) {
            CandidateHistoryLocalServiceUtil.setBeanIdentifier((java.lang.String) arguments[0]);

            return null;
        }

        if (_methodName126.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes126, parameterTypes)) {
            return CandidateHistoryLocalServiceUtil.findAll();
        }

        if (_methodName127.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes127, parameterTypes)) {
            return CandidateHistoryLocalServiceUtil.findAll(((Integer) arguments[0]).intValue(),
                ((Integer) arguments[1]).intValue());
        }

        if (_methodName128.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes128, parameterTypes)) {
            return CandidateHistoryLocalServiceUtil.findAll(((Integer) arguments[0]).intValue(),
                ((Integer) arguments[1]).intValue(),
                (com.liferay.portal.kernel.util.OrderByComparator) arguments[2]);
        }

        if (_methodName129.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes129, parameterTypes)) {
            return CandidateHistoryLocalServiceUtil.create(((Long) arguments[0]).longValue(),
                ((Long) arguments[1]).longValue(),
                ((Long) arguments[2]).longValue(),
                ((Long) arguments[3]).longValue(),
                (java.lang.String) arguments[4], (java.sql.Date) arguments[5],
                (java.lang.String) arguments[6],
                (java.lang.String) arguments[7],
                ((Long) arguments[8]).longValue(),
                (com.liferay.portal.service.ServiceContext) arguments[9]);
        }

        if (_methodName130.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes130, parameterTypes)) {
            return CandidateHistoryLocalServiceUtil.edit(((Long) arguments[0]).longValue(),
                ((Long) arguments[1]).longValue(),
                ((Long) arguments[2]).longValue(),
                ((Long) arguments[3]).longValue(),
                ((Long) arguments[4]).longValue(),
                (java.lang.String) arguments[5], (java.sql.Date) arguments[6],
                (java.lang.String) arguments[7],
                (java.lang.String) arguments[8],
                ((Long) arguments[9]).longValue(),
                (com.liferay.portal.service.ServiceContext) arguments[10]);
        }

        if (_methodName131.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes131, parameterTypes)) {
            return CandidateHistoryLocalServiceUtil.findByCandidate(((Long) arguments[0]).longValue());
        }

        throw new UnsupportedOperationException();
    }
}
