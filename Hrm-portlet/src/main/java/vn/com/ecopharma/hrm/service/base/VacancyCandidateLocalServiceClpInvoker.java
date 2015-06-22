package vn.com.ecopharma.hrm.service.base;

import vn.com.ecopharma.hrm.service.VacancyCandidateLocalServiceUtil;

import java.util.Arrays;

/**
 * @author tvt
 * @generated
 */
public class VacancyCandidateLocalServiceClpInvoker {
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

    public VacancyCandidateLocalServiceClpInvoker() {
        _methodName0 = "addVacancyCandidate";

        _methodParameterTypes0 = new String[] {
                "vn.com.ecopharma.hrm.model.VacancyCandidate"
            };

        _methodName1 = "createVacancyCandidate";

        _methodParameterTypes1 = new String[] { "long" };

        _methodName2 = "deleteVacancyCandidate";

        _methodParameterTypes2 = new String[] { "long" };

        _methodName3 = "deleteVacancyCandidate";

        _methodParameterTypes3 = new String[] {
                "vn.com.ecopharma.hrm.model.VacancyCandidate"
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

        _methodName10 = "fetchVacancyCandidate";

        _methodParameterTypes10 = new String[] { "long" };

        _methodName11 = "getVacancyCandidate";

        _methodParameterTypes11 = new String[] { "long" };

        _methodName12 = "getPersistedModel";

        _methodParameterTypes12 = new String[] { "java.io.Serializable" };

        _methodName13 = "getVacancyCandidates";

        _methodParameterTypes13 = new String[] { "int", "int" };

        _methodName14 = "getVacancyCandidatesCount";

        _methodParameterTypes14 = new String[] {  };

        _methodName15 = "updateVacancyCandidate";

        _methodParameterTypes15 = new String[] {
                "vn.com.ecopharma.hrm.model.VacancyCandidate"
            };

        _methodName112 = "getBeanIdentifier";

        _methodParameterTypes112 = new String[] {  };

        _methodName113 = "setBeanIdentifier";

        _methodParameterTypes113 = new String[] { "java.lang.String" };

        _methodName118 = "create";

        _methodParameterTypes118 = new String[] {
                "long", "long", "long",
                "com.liferay.portal.service.ServiceContext"
            };

        _methodName119 = "findByCandidate";

        _methodParameterTypes119 = new String[] { "long" };

        _methodName120 = "findByVacancy";

        _methodParameterTypes120 = new String[] { "long" };

        _methodName121 = "findByVacancyAndCandidate";

        _methodParameterTypes121 = new String[] { "long", "long" };

        _methodName122 = "findByCandidate_And_VALID_Status";

        _methodParameterTypes122 = new String[] { "long" };

        _methodName123 = "findByVacancy_And_VALID_Status";

        _methodParameterTypes123 = new String[] { "long" };

        _methodName124 = "deleteByVacancyAndCandidate";

        _methodParameterTypes124 = new String[] { "long", "long" };

        _methodName125 = "deleteByVacancy";

        _methodParameterTypes125 = new String[] { "long" };

        _methodName126 = "delete";

        _methodParameterTypes126 = new String[] { "long" };
    }

    public Object invokeMethod(String name, String[] parameterTypes,
        Object[] arguments) throws Throwable {
        if (_methodName0.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes0, parameterTypes)) {
            return VacancyCandidateLocalServiceUtil.addVacancyCandidate((vn.com.ecopharma.hrm.model.VacancyCandidate) arguments[0]);
        }

        if (_methodName1.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes1, parameterTypes)) {
            return VacancyCandidateLocalServiceUtil.createVacancyCandidate(((Long) arguments[0]).longValue());
        }

        if (_methodName2.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes2, parameterTypes)) {
            return VacancyCandidateLocalServiceUtil.deleteVacancyCandidate(((Long) arguments[0]).longValue());
        }

        if (_methodName3.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes3, parameterTypes)) {
            return VacancyCandidateLocalServiceUtil.deleteVacancyCandidate((vn.com.ecopharma.hrm.model.VacancyCandidate) arguments[0]);
        }

        if (_methodName4.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes4, parameterTypes)) {
            return VacancyCandidateLocalServiceUtil.dynamicQuery();
        }

        if (_methodName5.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes5, parameterTypes)) {
            return VacancyCandidateLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery) arguments[0]);
        }

        if (_methodName6.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes6, parameterTypes)) {
            return VacancyCandidateLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery) arguments[0],
                ((Integer) arguments[1]).intValue(),
                ((Integer) arguments[2]).intValue());
        }

        if (_methodName7.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes7, parameterTypes)) {
            return VacancyCandidateLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery) arguments[0],
                ((Integer) arguments[1]).intValue(),
                ((Integer) arguments[2]).intValue(),
                (com.liferay.portal.kernel.util.OrderByComparator) arguments[3]);
        }

        if (_methodName8.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes8, parameterTypes)) {
            return VacancyCandidateLocalServiceUtil.dynamicQueryCount((com.liferay.portal.kernel.dao.orm.DynamicQuery) arguments[0]);
        }

        if (_methodName9.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes9, parameterTypes)) {
            return VacancyCandidateLocalServiceUtil.dynamicQueryCount((com.liferay.portal.kernel.dao.orm.DynamicQuery) arguments[0],
                (com.liferay.portal.kernel.dao.orm.Projection) arguments[1]);
        }

        if (_methodName10.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes10, parameterTypes)) {
            return VacancyCandidateLocalServiceUtil.fetchVacancyCandidate(((Long) arguments[0]).longValue());
        }

        if (_methodName11.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes11, parameterTypes)) {
            return VacancyCandidateLocalServiceUtil.getVacancyCandidate(((Long) arguments[0]).longValue());
        }

        if (_methodName12.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes12, parameterTypes)) {
            return VacancyCandidateLocalServiceUtil.getPersistedModel((java.io.Serializable) arguments[0]);
        }

        if (_methodName13.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes13, parameterTypes)) {
            return VacancyCandidateLocalServiceUtil.getVacancyCandidates(((Integer) arguments[0]).intValue(),
                ((Integer) arguments[1]).intValue());
        }

        if (_methodName14.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes14, parameterTypes)) {
            return VacancyCandidateLocalServiceUtil.getVacancyCandidatesCount();
        }

        if (_methodName15.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes15, parameterTypes)) {
            return VacancyCandidateLocalServiceUtil.updateVacancyCandidate((vn.com.ecopharma.hrm.model.VacancyCandidate) arguments[0]);
        }

        if (_methodName112.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes112, parameterTypes)) {
            return VacancyCandidateLocalServiceUtil.getBeanIdentifier();
        }

        if (_methodName113.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes113, parameterTypes)) {
            VacancyCandidateLocalServiceUtil.setBeanIdentifier((java.lang.String) arguments[0]);

            return null;
        }

        if (_methodName118.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes118, parameterTypes)) {
            return VacancyCandidateLocalServiceUtil.create(((Long) arguments[0]).longValue(),
                ((Long) arguments[1]).longValue(),
                ((Long) arguments[2]).longValue(),
                (com.liferay.portal.service.ServiceContext) arguments[3]);
        }

        if (_methodName119.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes119, parameterTypes)) {
            return VacancyCandidateLocalServiceUtil.findByCandidate(((Long) arguments[0]).longValue());
        }

        if (_methodName120.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes120, parameterTypes)) {
            return VacancyCandidateLocalServiceUtil.findByVacancy(((Long) arguments[0]).longValue());
        }

        if (_methodName121.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes121, parameterTypes)) {
            return VacancyCandidateLocalServiceUtil.findByVacancyAndCandidate(((Long) arguments[0]).longValue(),
                ((Long) arguments[1]).longValue());
        }

        if (_methodName122.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes122, parameterTypes)) {
            return VacancyCandidateLocalServiceUtil.findByCandidate_And_VALID_Status(((Long) arguments[0]).longValue());
        }

        if (_methodName123.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes123, parameterTypes)) {
            return VacancyCandidateLocalServiceUtil.findByVacancy_And_VALID_Status(((Long) arguments[0]).longValue());
        }

        if (_methodName124.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes124, parameterTypes)) {
            VacancyCandidateLocalServiceUtil.deleteByVacancyAndCandidate(((Long) arguments[0]).longValue(),
                ((Long) arguments[1]).longValue());

            return null;
        }

        if (_methodName125.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes125, parameterTypes)) {
            VacancyCandidateLocalServiceUtil.deleteByVacancy(((Long) arguments[0]).longValue());

            return null;
        }

        if (_methodName126.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes126, parameterTypes)) {
            VacancyCandidateLocalServiceUtil.delete(((Long) arguments[0]).longValue());

            return null;
        }

        throw new UnsupportedOperationException();
    }
}
