package vn.com.ecopharma.hrm.service.base;

import vn.com.ecopharma.hrm.service.EmployeeLocalServiceUtil;

import java.util.Arrays;

/**
 * @author tvt
 * @generated
 */
public class EmployeeLocalServiceClpInvoker {
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
    private String _methodName84;
    private String[] _methodParameterTypes84;
    private String _methodName85;
    private String[] _methodParameterTypes85;
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
    private String _methodName97;
    private String[] _methodParameterTypes97;
    private String _methodName98;
    private String[] _methodParameterTypes98;
    private String _methodName99;
    private String[] _methodParameterTypes99;
    private String _methodName100;
    private String[] _methodParameterTypes100;
    private String _methodName101;
    private String[] _methodParameterTypes101;
    private String _methodName102;
    private String[] _methodParameterTypes102;
    private String _methodName103;
    private String[] _methodParameterTypes103;
    private String _methodName104;
    private String[] _methodParameterTypes104;
    private String _methodName105;
    private String[] _methodParameterTypes105;
    private String _methodName106;
    private String[] _methodParameterTypes106;
    private String _methodName107;
    private String[] _methodParameterTypes107;

    public EmployeeLocalServiceClpInvoker() {
        _methodName0 = "addEmployee";

        _methodParameterTypes0 = new String[] {
                "vn.com.ecopharma.hrm.model.Employee"
            };

        _methodName1 = "createEmployee";

        _methodParameterTypes1 = new String[] { "long" };

        _methodName2 = "deleteEmployee";

        _methodParameterTypes2 = new String[] { "long" };

        _methodName3 = "deleteEmployee";

        _methodParameterTypes3 = new String[] {
                "vn.com.ecopharma.hrm.model.Employee"
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

        _methodName10 = "fetchEmployee";

        _methodParameterTypes10 = new String[] { "long" };

        _methodName11 = "getEmployee";

        _methodParameterTypes11 = new String[] { "long" };

        _methodName12 = "getPersistedModel";

        _methodParameterTypes12 = new String[] { "java.io.Serializable" };

        _methodName13 = "getEmployees";

        _methodParameterTypes13 = new String[] { "int", "int" };

        _methodName14 = "getEmployeesCount";

        _methodParameterTypes14 = new String[] {  };

        _methodName15 = "updateEmployee";

        _methodParameterTypes15 = new String[] {
                "vn.com.ecopharma.hrm.model.Employee"
            };

        _methodName84 = "getBeanIdentifier";

        _methodParameterTypes84 = new String[] {  };

        _methodName85 = "setBeanIdentifier";

        _methodParameterTypes85 = new String[] { "java.lang.String" };

        _methodName90 = "indexAllEmployees";

        _methodParameterTypes90 = new String[] {  };

        _methodName91 = "removeAllEmployeeIndexes";

        _methodParameterTypes91 = new String[] {
                "com.liferay.portal.kernel.search.SearchContext", "long"
            };

        _methodName92 = "countAllIndexedEmployeeDocuments";

        _methodParameterTypes92 = new String[] {
                "com.liferay.portal.kernel.search.SearchContext", "long"
            };

        _methodName93 = "countAllUnDeletedIndexedEmployeeDocuments";

        _methodParameterTypes93 = new String[] {
                "com.liferay.portal.kernel.search.SearchContext",
                "java.util.List", "long",
                "com.liferay.portal.kernel.search.Sort"
            };

        _methodName94 = "searchAllUnDeletedEmployeeIndexedItems";

        _methodParameterTypes94 = new String[] {
                "com.liferay.portal.kernel.search.SearchContext",
                "java.util.List", "long",
                "com.liferay.portal.kernel.search.Sort", "int", "int"
            };

        _methodName95 = "searchAllEmployeeIndexedItems";

        _methodParameterTypes95 = new String[] {
                "com.liferay.portal.kernel.search.SearchContext", "long"
            };

        _methodName96 = "searchAllEmployeeIndexedItems";

        _methodParameterTypes96 = new String[] {
                "com.liferay.portal.kernel.search.SearchContext",
                "java.util.List", "long", "int", "int"
            };

        _methodName97 = "searchAllEmployeeIndexedItems";

        _methodParameterTypes97 = new String[] {
                "com.liferay.portal.kernel.search.SearchContext",
                "java.util.List", "long",
                "com.liferay.portal.kernel.search.Sort", "int", "int"
            };

        _methodName98 = "findAll";

        _methodParameterTypes98 = new String[] {  };

        _methodName99 = "findAll";

        _methodParameterTypes99 = new String[] { "int", "int" };

        _methodName100 = "findAll";

        _methodParameterTypes100 = new String[] {
                "int", "int", "com.liferay.portal.kernel.util.OrderByComparator"
            };

        _methodName101 = "filterEmployees";

        _methodParameterTypes101 = new String[] {
                "java.lang.String", "java.lang.String", "java.lang.String",
                "java.lang.String", "java.lang.String", "java.lang.String",
                "java.lang.String", "java.util.List", "java.lang.Long",
                "java.lang.String", "java.lang.String", "int", "int", "boolean",
                "java.lang.String", "java.lang.String"
            };

        _methodName102 = "addEmployee";

        _methodParameterTypes102 = new String[] {
                "long", "long", "boolean", "java.lang.String",
                "java.lang.String", "boolean", "java.lang.String",
                "java.lang.String", "long", "java.lang.String",
                "java.util.Locale", "java.lang.String", "java.lang.String",
                "java.lang.String", "int", "int", "boolean", "int", "int", "int",
                "long[][]", "long[][]", "long[][]", "long[][]", "boolean",
                "java.lang.String", "java.lang.String", "long", "java.util.Date",
                "long", "long", "long", "java.util.Date", "java.util.Date",
                "java.util.Date", "java.lang.String", "java.lang.String",
                "java.lang.String", "java.lang.String", "java.lang.String",
                "long", "java.lang.String", "java.lang.String", "java.util.Date",
                "java.lang.String", "long", "java.lang.String",
                "java.lang.String", "int", "java.lang.String",
                "java.lang.String", "java.lang.String", "java.lang.String",
                "java.lang.String", "double", "double", "double", "double",
                "double", "java.util.Date", "long",
                "com.liferay.portal.service.ServiceContext"
            };

        _methodName103 = "addEmployee";

        _methodParameterTypes103 = new String[] {
                "vn.com.ecopharma.hrm.model.Employee", "long", "long", "boolean",
                "java.lang.String", "java.lang.String", "boolean",
                "java.lang.String", "java.lang.String", "long",
                "java.lang.String", "java.util.Locale", "java.lang.String",
                "java.lang.String", "java.lang.String", "int", "int", "boolean",
                "int", "int", "int", "long[][]", "long[][]", "long[][]",
                "long[][]", "boolean", "long", "java.util.List",
                "com.liferay.portal.service.ServiceContext"
            };

        _methodName104 = "update";

        _methodParameterTypes104 = new String[] {
                "vn.com.ecopharma.hrm.model.Employee",
                "com.liferay.portal.model.User",
                "vn.com.ecopharma.hrm.model.JTitle",
                "vn.com.ecopharma.hrm.model.SubUnit",
                "vn.com.ecopharma.hrm.model.Titles",
                "vn.com.ecopharma.hrm.model.Level",
                "vn.com.ecopharma.hrm.model.University", "java.util.List",
                "com.liferay.portal.service.ServiceContext"
            };

        _methodName105 = "markDeletedEmployee";

        _methodParameterTypes105 = new String[] {
                "vn.com.ecopharma.hrm.model.Employee"
            };

        _methodName106 = "markDeletedEmployee";

        _methodParameterTypes106 = new String[] { "long" };

        _methodName107 = "countAll";

        _methodParameterTypes107 = new String[] {  };
    }

    public Object invokeMethod(String name, String[] parameterTypes,
        Object[] arguments) throws Throwable {
        if (_methodName0.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes0, parameterTypes)) {
            return EmployeeLocalServiceUtil.addEmployee((vn.com.ecopharma.hrm.model.Employee) arguments[0]);
        }

        if (_methodName1.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes1, parameterTypes)) {
            return EmployeeLocalServiceUtil.createEmployee(((Long) arguments[0]).longValue());
        }

        if (_methodName2.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes2, parameterTypes)) {
            return EmployeeLocalServiceUtil.deleteEmployee(((Long) arguments[0]).longValue());
        }

        if (_methodName3.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes3, parameterTypes)) {
            return EmployeeLocalServiceUtil.deleteEmployee((vn.com.ecopharma.hrm.model.Employee) arguments[0]);
        }

        if (_methodName4.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes4, parameterTypes)) {
            return EmployeeLocalServiceUtil.dynamicQuery();
        }

        if (_methodName5.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes5, parameterTypes)) {
            return EmployeeLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery) arguments[0]);
        }

        if (_methodName6.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes6, parameterTypes)) {
            return EmployeeLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery) arguments[0],
                ((Integer) arguments[1]).intValue(),
                ((Integer) arguments[2]).intValue());
        }

        if (_methodName7.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes7, parameterTypes)) {
            return EmployeeLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery) arguments[0],
                ((Integer) arguments[1]).intValue(),
                ((Integer) arguments[2]).intValue(),
                (com.liferay.portal.kernel.util.OrderByComparator) arguments[3]);
        }

        if (_methodName8.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes8, parameterTypes)) {
            return EmployeeLocalServiceUtil.dynamicQueryCount((com.liferay.portal.kernel.dao.orm.DynamicQuery) arguments[0]);
        }

        if (_methodName9.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes9, parameterTypes)) {
            return EmployeeLocalServiceUtil.dynamicQueryCount((com.liferay.portal.kernel.dao.orm.DynamicQuery) arguments[0],
                (com.liferay.portal.kernel.dao.orm.Projection) arguments[1]);
        }

        if (_methodName10.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes10, parameterTypes)) {
            return EmployeeLocalServiceUtil.fetchEmployee(((Long) arguments[0]).longValue());
        }

        if (_methodName11.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes11, parameterTypes)) {
            return EmployeeLocalServiceUtil.getEmployee(((Long) arguments[0]).longValue());
        }

        if (_methodName12.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes12, parameterTypes)) {
            return EmployeeLocalServiceUtil.getPersistedModel((java.io.Serializable) arguments[0]);
        }

        if (_methodName13.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes13, parameterTypes)) {
            return EmployeeLocalServiceUtil.getEmployees(((Integer) arguments[0]).intValue(),
                ((Integer) arguments[1]).intValue());
        }

        if (_methodName14.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes14, parameterTypes)) {
            return EmployeeLocalServiceUtil.getEmployeesCount();
        }

        if (_methodName15.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes15, parameterTypes)) {
            return EmployeeLocalServiceUtil.updateEmployee((vn.com.ecopharma.hrm.model.Employee) arguments[0]);
        }

        if (_methodName84.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes84, parameterTypes)) {
            return EmployeeLocalServiceUtil.getBeanIdentifier();
        }

        if (_methodName85.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes85, parameterTypes)) {
            EmployeeLocalServiceUtil.setBeanIdentifier((java.lang.String) arguments[0]);

            return null;
        }

        if (_methodName90.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes90, parameterTypes)) {
            EmployeeLocalServiceUtil.indexAllEmployees();

            return null;
        }

        if (_methodName91.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes91, parameterTypes)) {
            EmployeeLocalServiceUtil.removeAllEmployeeIndexes((com.liferay.portal.kernel.search.SearchContext) arguments[0],
                ((Long) arguments[1]).longValue());

            return null;
        }

        if (_methodName92.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes92, parameterTypes)) {
            return EmployeeLocalServiceUtil.countAllIndexedEmployeeDocuments((com.liferay.portal.kernel.search.SearchContext) arguments[0],
                ((Long) arguments[1]).longValue());
        }

        if (_methodName93.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes93, parameterTypes)) {
            return EmployeeLocalServiceUtil.countAllUnDeletedIndexedEmployeeDocuments((com.liferay.portal.kernel.search.SearchContext) arguments[0],
                (java.util.List<com.liferay.portal.kernel.search.Query>) arguments[1],
                ((Long) arguments[2]).longValue(),
                (com.liferay.portal.kernel.search.Sort) arguments[3]);
        }

        if (_methodName94.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes94, parameterTypes)) {
            return EmployeeLocalServiceUtil.searchAllUnDeletedEmployeeIndexedItems((com.liferay.portal.kernel.search.SearchContext) arguments[0],
                (java.util.List<com.liferay.portal.kernel.search.Query>) arguments[1],
                ((Long) arguments[2]).longValue(),
                (com.liferay.portal.kernel.search.Sort) arguments[3],
                ((Integer) arguments[4]).intValue(),
                ((Integer) arguments[5]).intValue());
        }

        if (_methodName95.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes95, parameterTypes)) {
            return EmployeeLocalServiceUtil.searchAllEmployeeIndexedItems((com.liferay.portal.kernel.search.SearchContext) arguments[0],
                ((Long) arguments[1]).longValue());
        }

        if (_methodName96.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes96, parameterTypes)) {
            return EmployeeLocalServiceUtil.searchAllEmployeeIndexedItems((com.liferay.portal.kernel.search.SearchContext) arguments[0],
                (java.util.List<com.liferay.portal.kernel.search.Query>) arguments[1],
                ((Long) arguments[2]).longValue(),
                ((Integer) arguments[3]).intValue(),
                ((Integer) arguments[4]).intValue());
        }

        if (_methodName97.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes97, parameterTypes)) {
            return EmployeeLocalServiceUtil.searchAllEmployeeIndexedItems((com.liferay.portal.kernel.search.SearchContext) arguments[0],
                (java.util.List<com.liferay.portal.kernel.search.Query>) arguments[1],
                ((Long) arguments[2]).longValue(),
                (com.liferay.portal.kernel.search.Sort) arguments[3],
                ((Integer) arguments[4]).intValue(),
                ((Integer) arguments[5]).intValue());
        }

        if (_methodName98.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes98, parameterTypes)) {
            return EmployeeLocalServiceUtil.findAll();
        }

        if (_methodName99.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes99, parameterTypes)) {
            return EmployeeLocalServiceUtil.findAll(((Integer) arguments[0]).intValue(),
                ((Integer) arguments[1]).intValue());
        }

        if (_methodName100.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes100, parameterTypes)) {
            return EmployeeLocalServiceUtil.findAll(((Integer) arguments[0]).intValue(),
                ((Integer) arguments[1]).intValue(),
                (com.liferay.portal.kernel.util.OrderByComparator) arguments[2]);
        }

        if (_methodName101.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes101, parameterTypes)) {
            return EmployeeLocalServiceUtil.filterEmployees((java.lang.String) arguments[0],
                (java.lang.String) arguments[1],
                (java.lang.String) arguments[2],
                (java.lang.String) arguments[3],
                (java.lang.String) arguments[4],
                (java.lang.String) arguments[5],
                (java.lang.String) arguments[6],
                (java.util.List<java.lang.String>) arguments[7],
                (java.lang.Long) arguments[8], (java.lang.String) arguments[9],
                (java.lang.String) arguments[10],
                ((Integer) arguments[11]).intValue(),
                ((Integer) arguments[12]).intValue(),
                ((Boolean) arguments[13]).booleanValue(),
                (java.lang.String) arguments[14],
                (java.lang.String) arguments[15]);
        }

        if (_methodName102.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes102, parameterTypes)) {
            return EmployeeLocalServiceUtil.addEmployee(((Long) arguments[0]).longValue(),
                ((Long) arguments[1]).longValue(),
                ((Boolean) arguments[2]).booleanValue(),
                (java.lang.String) arguments[3],
                (java.lang.String) arguments[4],
                ((Boolean) arguments[5]).booleanValue(),
                (java.lang.String) arguments[6],
                (java.lang.String) arguments[7],
                ((Long) arguments[8]).longValue(),
                (java.lang.String) arguments[9],
                (java.util.Locale) arguments[10],
                (java.lang.String) arguments[11],
                (java.lang.String) arguments[12],
                (java.lang.String) arguments[13],
                ((Integer) arguments[14]).intValue(),
                ((Integer) arguments[15]).intValue(),
                ((Boolean) arguments[16]).booleanValue(),
                ((Integer) arguments[17]).intValue(),
                ((Integer) arguments[18]).intValue(),
                ((Integer) arguments[19]).intValue(), (long[]) arguments[20],
                (long[]) arguments[21], (long[]) arguments[22],
                (long[]) arguments[23],
                ((Boolean) arguments[24]).booleanValue(),
                (java.lang.String) arguments[25],
                (java.lang.String) arguments[26],
                ((Long) arguments[27]).longValue(),
                (java.util.Date) arguments[28],
                ((Long) arguments[29]).longValue(),
                ((Long) arguments[30]).longValue(),
                ((Long) arguments[31]).longValue(),
                (java.util.Date) arguments[32], (java.util.Date) arguments[33],
                (java.util.Date) arguments[34],
                (java.lang.String) arguments[35],
                (java.lang.String) arguments[36],
                (java.lang.String) arguments[37],
                (java.lang.String) arguments[38],
                (java.lang.String) arguments[39],
                ((Long) arguments[40]).longValue(),
                (java.lang.String) arguments[41],
                (java.lang.String) arguments[42],
                (java.util.Date) arguments[43],
                (java.lang.String) arguments[44],
                ((Long) arguments[45]).longValue(),
                (java.lang.String) arguments[46],
                (java.lang.String) arguments[47],
                ((Integer) arguments[48]).intValue(),
                (java.lang.String) arguments[49],
                (java.lang.String) arguments[50],
                (java.lang.String) arguments[51],
                (java.lang.String) arguments[52],
                (java.lang.String) arguments[53],
                ((Double) arguments[54]).doubleValue(),
                ((Double) arguments[55]).doubleValue(),
                ((Double) arguments[56]).doubleValue(),
                ((Double) arguments[57]).doubleValue(),
                ((Double) arguments[58]).doubleValue(),
                (java.util.Date) arguments[59],
                ((Long) arguments[60]).longValue(),
                (com.liferay.portal.service.ServiceContext) arguments[61]);
        }

        if (_methodName103.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes103, parameterTypes)) {
            return EmployeeLocalServiceUtil.addEmployee((vn.com.ecopharma.hrm.model.Employee) arguments[0],
                ((Long) arguments[1]).longValue(),
                ((Long) arguments[2]).longValue(),
                ((Boolean) arguments[3]).booleanValue(),
                (java.lang.String) arguments[4],
                (java.lang.String) arguments[5],
                ((Boolean) arguments[6]).booleanValue(),
                (java.lang.String) arguments[7],
                (java.lang.String) arguments[8],
                ((Long) arguments[9]).longValue(),
                (java.lang.String) arguments[10],
                (java.util.Locale) arguments[11],
                (java.lang.String) arguments[12],
                (java.lang.String) arguments[13],
                (java.lang.String) arguments[14],
                ((Integer) arguments[15]).intValue(),
                ((Integer) arguments[16]).intValue(),
                ((Boolean) arguments[17]).booleanValue(),
                ((Integer) arguments[18]).intValue(),
                ((Integer) arguments[19]).intValue(),
                ((Integer) arguments[20]).intValue(), (long[]) arguments[21],
                (long[]) arguments[22], (long[]) arguments[23],
                (long[]) arguments[24],
                ((Boolean) arguments[25]).booleanValue(),
                ((Long) arguments[26]).longValue(),
                (java.util.List<vn.com.taotv.primefaces.modelView.item.AddressObjectItem>) arguments[27],
                (com.liferay.portal.service.ServiceContext) arguments[28]);
        }

        if (_methodName104.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes104, parameterTypes)) {
            return EmployeeLocalServiceUtil.update((vn.com.ecopharma.hrm.model.Employee) arguments[0],
                (com.liferay.portal.model.User) arguments[1],
                (vn.com.ecopharma.hrm.model.JTitle) arguments[2],
                (vn.com.ecopharma.hrm.model.SubUnit) arguments[3],
                (vn.com.ecopharma.hrm.model.Titles) arguments[4],
                (vn.com.ecopharma.hrm.model.Level) arguments[5],
                (vn.com.ecopharma.hrm.model.University) arguments[6],
                (java.util.List<vn.com.taotv.primefaces.modelView.item.AddressObjectItem>) arguments[7],
                (com.liferay.portal.service.ServiceContext) arguments[8]);
        }

        if (_methodName105.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes105, parameterTypes)) {
            return EmployeeLocalServiceUtil.markDeletedEmployee((vn.com.ecopharma.hrm.model.Employee) arguments[0]);
        }

        if (_methodName106.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes106, parameterTypes)) {
            return EmployeeLocalServiceUtil.markDeletedEmployee(((Long) arguments[0]).longValue());
        }

        if (_methodName107.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes107, parameterTypes)) {
            return EmployeeLocalServiceUtil.countAll();
        }

        throw new UnsupportedOperationException();
    }
}
