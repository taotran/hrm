package vn.com.ecopharma.hrm.service;

import com.liferay.portal.service.InvokableLocalService;

/**
 * @author tvt
 * @generated
 */
public class EmployeeLocalServiceClp implements EmployeeLocalService {
    private InvokableLocalService _invokableLocalService;
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

    public EmployeeLocalServiceClp(InvokableLocalService invokableLocalService) {
        _invokableLocalService = invokableLocalService;

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

        _methodName16 = "getBeanIdentifier";

        _methodParameterTypes16 = new String[] {  };

        _methodName17 = "setBeanIdentifier";

        _methodParameterTypes17 = new String[] { "java.lang.String" };

        _methodName19 = "findAll";

        _methodParameterTypes19 = new String[] {  };

        _methodName20 = "findAll";

        _methodParameterTypes20 = new String[] { "int", "int" };

        _methodName21 = "findAll";

        _methodParameterTypes21 = new String[] {
                "int", "int", "com.liferay.portal.kernel.util.OrderByComparator"
            };

        _methodName22 = "filterEmployees";

        _methodParameterTypes22 = new String[] {
                "java.lang.String", "java.lang.String", "java.lang.String",
                "java.lang.String", "java.lang.String", "java.lang.String",
                "java.lang.String", "java.util.List", "java.lang.Long",
                "java.lang.String", "java.lang.String", "int", "int", "boolean",
                "java.lang.String", "java.lang.String"
            };

        _methodName23 = "addEmployee";

        _methodParameterTypes23 = new String[] {
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

        _methodName24 = "addEmployee";

        _methodParameterTypes24 = new String[] {
                "vn.com.ecopharma.hrm.model.Employee", "long", "long", "boolean",
                "java.lang.String", "java.lang.String", "boolean",
                "java.lang.String", "java.lang.String", "long",
                "java.lang.String", "java.util.Locale", "java.lang.String",
                "java.lang.String", "java.lang.String", "int", "int", "boolean",
                "int", "int", "int", "long[][]", "long[][]", "long[][]",
                "long[][]", "boolean", "long", "java.util.List",
                "com.liferay.portal.service.ServiceContext"
            };

        _methodName25 = "update";

        _methodParameterTypes25 = new String[] {
                "vn.com.ecopharma.hrm.model.Employee",
                "com.liferay.portal.model.User",
                "vn.com.ecopharma.hrm.model.JTitle",
                "vn.com.ecopharma.hrm.model.SubUnit",
                "vn.com.ecopharma.hrm.model.Titles",
                "vn.com.ecopharma.hrm.model.Level",
                "vn.com.ecopharma.hrm.model.University", "java.util.List",
                "com.liferay.portal.service.ServiceContext"
            };

        _methodName26 = "countAll";

        _methodParameterTypes26 = new String[] {  };
    }

    @Override
    public vn.com.ecopharma.hrm.model.Employee addEmployee(
        vn.com.ecopharma.hrm.model.Employee employee)
        throws com.liferay.portal.kernel.exception.SystemException {
        Object returnObj = null;

        try {
            returnObj = _invokableLocalService.invokeMethod(_methodName0,
                    _methodParameterTypes0,
                    new Object[] { ClpSerializer.translateInput(employee) });
        } catch (Throwable t) {
            t = ClpSerializer.translateThrowable(t);

            if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
                throw (com.liferay.portal.kernel.exception.SystemException) t;
            }

            if (t instanceof RuntimeException) {
                throw (RuntimeException) t;
            } else {
                throw new RuntimeException(t.getClass().getName() +
                    " is not a valid exception");
            }
        }

        return (vn.com.ecopharma.hrm.model.Employee) ClpSerializer.translateOutput(returnObj);
    }

    @Override
    public vn.com.ecopharma.hrm.model.Employee createEmployee(long employeeId) {
        Object returnObj = null;

        try {
            returnObj = _invokableLocalService.invokeMethod(_methodName1,
                    _methodParameterTypes1, new Object[] { employeeId });
        } catch (Throwable t) {
            t = ClpSerializer.translateThrowable(t);

            if (t instanceof RuntimeException) {
                throw (RuntimeException) t;
            } else {
                throw new RuntimeException(t.getClass().getName() +
                    " is not a valid exception");
            }
        }

        return (vn.com.ecopharma.hrm.model.Employee) ClpSerializer.translateOutput(returnObj);
    }

    @Override
    public vn.com.ecopharma.hrm.model.Employee deleteEmployee(long employeeId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        Object returnObj = null;

        try {
            returnObj = _invokableLocalService.invokeMethod(_methodName2,
                    _methodParameterTypes2, new Object[] { employeeId });
        } catch (Throwable t) {
            t = ClpSerializer.translateThrowable(t);

            if (t instanceof com.liferay.portal.kernel.exception.PortalException) {
                throw (com.liferay.portal.kernel.exception.PortalException) t;
            }

            if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
                throw (com.liferay.portal.kernel.exception.SystemException) t;
            }

            if (t instanceof RuntimeException) {
                throw (RuntimeException) t;
            } else {
                throw new RuntimeException(t.getClass().getName() +
                    " is not a valid exception");
            }
        }

        return (vn.com.ecopharma.hrm.model.Employee) ClpSerializer.translateOutput(returnObj);
    }

    @Override
    public vn.com.ecopharma.hrm.model.Employee deleteEmployee(
        vn.com.ecopharma.hrm.model.Employee employee)
        throws com.liferay.portal.kernel.exception.SystemException {
        Object returnObj = null;

        try {
            returnObj = _invokableLocalService.invokeMethod(_methodName3,
                    _methodParameterTypes3,
                    new Object[] { ClpSerializer.translateInput(employee) });
        } catch (Throwable t) {
            t = ClpSerializer.translateThrowable(t);

            if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
                throw (com.liferay.portal.kernel.exception.SystemException) t;
            }

            if (t instanceof RuntimeException) {
                throw (RuntimeException) t;
            } else {
                throw new RuntimeException(t.getClass().getName() +
                    " is not a valid exception");
            }
        }

        return (vn.com.ecopharma.hrm.model.Employee) ClpSerializer.translateOutput(returnObj);
    }

    @Override
    public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        Object returnObj = null;

        try {
            returnObj = _invokableLocalService.invokeMethod(_methodName4,
                    _methodParameterTypes4, new Object[] {  });
        } catch (Throwable t) {
            t = ClpSerializer.translateThrowable(t);

            if (t instanceof RuntimeException) {
                throw (RuntimeException) t;
            } else {
                throw new RuntimeException(t.getClass().getName() +
                    " is not a valid exception");
            }
        }

        return (com.liferay.portal.kernel.dao.orm.DynamicQuery) ClpSerializer.translateOutput(returnObj);
    }

    @Override
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        Object returnObj = null;

        try {
            returnObj = _invokableLocalService.invokeMethod(_methodName5,
                    _methodParameterTypes5,
                    new Object[] { ClpSerializer.translateInput(dynamicQuery) });
        } catch (Throwable t) {
            t = ClpSerializer.translateThrowable(t);

            if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
                throw (com.liferay.portal.kernel.exception.SystemException) t;
            }

            if (t instanceof RuntimeException) {
                throw (RuntimeException) t;
            } else {
                throw new RuntimeException(t.getClass().getName() +
                    " is not a valid exception");
            }
        }

        return (java.util.List) ClpSerializer.translateOutput(returnObj);
    }

    @Override
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException {
        Object returnObj = null;

        try {
            returnObj = _invokableLocalService.invokeMethod(_methodName6,
                    _methodParameterTypes6,
                    new Object[] {
                        ClpSerializer.translateInput(dynamicQuery),
                        
                    start,
                        
                    end
                    });
        } catch (Throwable t) {
            t = ClpSerializer.translateThrowable(t);

            if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
                throw (com.liferay.portal.kernel.exception.SystemException) t;
            }

            if (t instanceof RuntimeException) {
                throw (RuntimeException) t;
            } else {
                throw new RuntimeException(t.getClass().getName() +
                    " is not a valid exception");
            }
        }

        return (java.util.List) ClpSerializer.translateOutput(returnObj);
    }

    @Override
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        Object returnObj = null;

        try {
            returnObj = _invokableLocalService.invokeMethod(_methodName7,
                    _methodParameterTypes7,
                    new Object[] {
                        ClpSerializer.translateInput(dynamicQuery),
                        
                    start,
                        
                    end,
                        
                    ClpSerializer.translateInput(orderByComparator)
                    });
        } catch (Throwable t) {
            t = ClpSerializer.translateThrowable(t);

            if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
                throw (com.liferay.portal.kernel.exception.SystemException) t;
            }

            if (t instanceof RuntimeException) {
                throw (RuntimeException) t;
            } else {
                throw new RuntimeException(t.getClass().getName() +
                    " is not a valid exception");
            }
        }

        return (java.util.List) ClpSerializer.translateOutput(returnObj);
    }

    @Override
    public long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        Object returnObj = null;

        try {
            returnObj = _invokableLocalService.invokeMethod(_methodName8,
                    _methodParameterTypes8,
                    new Object[] { ClpSerializer.translateInput(dynamicQuery) });
        } catch (Throwable t) {
            t = ClpSerializer.translateThrowable(t);

            if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
                throw (com.liferay.portal.kernel.exception.SystemException) t;
            }

            if (t instanceof RuntimeException) {
                throw (RuntimeException) t;
            } else {
                throw new RuntimeException(t.getClass().getName() +
                    " is not a valid exception");
            }
        }

        return ((Long) returnObj).longValue();
    }

    @Override
    public long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
        com.liferay.portal.kernel.dao.orm.Projection projection)
        throws com.liferay.portal.kernel.exception.SystemException {
        Object returnObj = null;

        try {
            returnObj = _invokableLocalService.invokeMethod(_methodName9,
                    _methodParameterTypes9,
                    new Object[] {
                        ClpSerializer.translateInput(dynamicQuery),
                        
                    ClpSerializer.translateInput(projection)
                    });
        } catch (Throwable t) {
            t = ClpSerializer.translateThrowable(t);

            if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
                throw (com.liferay.portal.kernel.exception.SystemException) t;
            }

            if (t instanceof RuntimeException) {
                throw (RuntimeException) t;
            } else {
                throw new RuntimeException(t.getClass().getName() +
                    " is not a valid exception");
            }
        }

        return ((Long) returnObj).longValue();
    }

    @Override
    public vn.com.ecopharma.hrm.model.Employee fetchEmployee(long employeeId)
        throws com.liferay.portal.kernel.exception.SystemException {
        Object returnObj = null;

        try {
            returnObj = _invokableLocalService.invokeMethod(_methodName10,
                    _methodParameterTypes10, new Object[] { employeeId });
        } catch (Throwable t) {
            t = ClpSerializer.translateThrowable(t);

            if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
                throw (com.liferay.portal.kernel.exception.SystemException) t;
            }

            if (t instanceof RuntimeException) {
                throw (RuntimeException) t;
            } else {
                throw new RuntimeException(t.getClass().getName() +
                    " is not a valid exception");
            }
        }

        return (vn.com.ecopharma.hrm.model.Employee) ClpSerializer.translateOutput(returnObj);
    }

    @Override
    public vn.com.ecopharma.hrm.model.Employee getEmployee(long employeeId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        Object returnObj = null;

        try {
            returnObj = _invokableLocalService.invokeMethod(_methodName11,
                    _methodParameterTypes11, new Object[] { employeeId });
        } catch (Throwable t) {
            t = ClpSerializer.translateThrowable(t);

            if (t instanceof com.liferay.portal.kernel.exception.PortalException) {
                throw (com.liferay.portal.kernel.exception.PortalException) t;
            }

            if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
                throw (com.liferay.portal.kernel.exception.SystemException) t;
            }

            if (t instanceof RuntimeException) {
                throw (RuntimeException) t;
            } else {
                throw new RuntimeException(t.getClass().getName() +
                    " is not a valid exception");
            }
        }

        return (vn.com.ecopharma.hrm.model.Employee) ClpSerializer.translateOutput(returnObj);
    }

    @Override
    public com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        Object returnObj = null;

        try {
            returnObj = _invokableLocalService.invokeMethod(_methodName12,
                    _methodParameterTypes12,
                    new Object[] { ClpSerializer.translateInput(primaryKeyObj) });
        } catch (Throwable t) {
            t = ClpSerializer.translateThrowable(t);

            if (t instanceof com.liferay.portal.kernel.exception.PortalException) {
                throw (com.liferay.portal.kernel.exception.PortalException) t;
            }

            if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
                throw (com.liferay.portal.kernel.exception.SystemException) t;
            }

            if (t instanceof RuntimeException) {
                throw (RuntimeException) t;
            } else {
                throw new RuntimeException(t.getClass().getName() +
                    " is not a valid exception");
            }
        }

        return (com.liferay.portal.model.PersistedModel) ClpSerializer.translateOutput(returnObj);
    }

    @Override
    public java.util.List<vn.com.ecopharma.hrm.model.Employee> getEmployees(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        Object returnObj = null;

        try {
            returnObj = _invokableLocalService.invokeMethod(_methodName13,
                    _methodParameterTypes13, new Object[] { start, end });
        } catch (Throwable t) {
            t = ClpSerializer.translateThrowable(t);

            if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
                throw (com.liferay.portal.kernel.exception.SystemException) t;
            }

            if (t instanceof RuntimeException) {
                throw (RuntimeException) t;
            } else {
                throw new RuntimeException(t.getClass().getName() +
                    " is not a valid exception");
            }
        }

        return (java.util.List<vn.com.ecopharma.hrm.model.Employee>) ClpSerializer.translateOutput(returnObj);
    }

    @Override
    public int getEmployeesCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        Object returnObj = null;

        try {
            returnObj = _invokableLocalService.invokeMethod(_methodName14,
                    _methodParameterTypes14, new Object[] {  });
        } catch (Throwable t) {
            t = ClpSerializer.translateThrowable(t);

            if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
                throw (com.liferay.portal.kernel.exception.SystemException) t;
            }

            if (t instanceof RuntimeException) {
                throw (RuntimeException) t;
            } else {
                throw new RuntimeException(t.getClass().getName() +
                    " is not a valid exception");
            }
        }

        return ((Integer) returnObj).intValue();
    }

    @Override
    public vn.com.ecopharma.hrm.model.Employee updateEmployee(
        vn.com.ecopharma.hrm.model.Employee employee)
        throws com.liferay.portal.kernel.exception.SystemException {
        Object returnObj = null;

        try {
            returnObj = _invokableLocalService.invokeMethod(_methodName15,
                    _methodParameterTypes15,
                    new Object[] { ClpSerializer.translateInput(employee) });
        } catch (Throwable t) {
            t = ClpSerializer.translateThrowable(t);

            if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
                throw (com.liferay.portal.kernel.exception.SystemException) t;
            }

            if (t instanceof RuntimeException) {
                throw (RuntimeException) t;
            } else {
                throw new RuntimeException(t.getClass().getName() +
                    " is not a valid exception");
            }
        }

        return (vn.com.ecopharma.hrm.model.Employee) ClpSerializer.translateOutput(returnObj);
    }

    @Override
    public java.lang.String getBeanIdentifier() {
        Object returnObj = null;

        try {
            returnObj = _invokableLocalService.invokeMethod(_methodName16,
                    _methodParameterTypes16, new Object[] {  });
        } catch (Throwable t) {
            t = ClpSerializer.translateThrowable(t);

            if (t instanceof RuntimeException) {
                throw (RuntimeException) t;
            } else {
                throw new RuntimeException(t.getClass().getName() +
                    " is not a valid exception");
            }
        }

        return (java.lang.String) ClpSerializer.translateOutput(returnObj);
    }

    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        try {
            _invokableLocalService.invokeMethod(_methodName17,
                _methodParameterTypes17,
                new Object[] { ClpSerializer.translateInput(beanIdentifier) });
        } catch (Throwable t) {
            t = ClpSerializer.translateThrowable(t);

            if (t instanceof RuntimeException) {
                throw (RuntimeException) t;
            } else {
                throw new RuntimeException(t.getClass().getName() +
                    " is not a valid exception");
            }
        }
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        throw new UnsupportedOperationException();
    }

    @Override
    public java.util.List<vn.com.ecopharma.hrm.model.Employee> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        Object returnObj = null;

        try {
            returnObj = _invokableLocalService.invokeMethod(_methodName19,
                    _methodParameterTypes19, new Object[] {  });
        } catch (Throwable t) {
            t = ClpSerializer.translateThrowable(t);

            if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
                throw (com.liferay.portal.kernel.exception.SystemException) t;
            }

            if (t instanceof RuntimeException) {
                throw (RuntimeException) t;
            } else {
                throw new RuntimeException(t.getClass().getName() +
                    " is not a valid exception");
            }
        }

        return (java.util.List<vn.com.ecopharma.hrm.model.Employee>) ClpSerializer.translateOutput(returnObj);
    }

    @Override
    public java.util.List<vn.com.ecopharma.hrm.model.Employee> findAll(
        int start, int end) {
        Object returnObj = null;

        try {
            returnObj = _invokableLocalService.invokeMethod(_methodName20,
                    _methodParameterTypes20, new Object[] { start, end });
        } catch (Throwable t) {
            t = ClpSerializer.translateThrowable(t);

            if (t instanceof RuntimeException) {
                throw (RuntimeException) t;
            } else {
                throw new RuntimeException(t.getClass().getName() +
                    " is not a valid exception");
            }
        }

        return (java.util.List<vn.com.ecopharma.hrm.model.Employee>) ClpSerializer.translateOutput(returnObj);
    }

    @Override
    public java.util.List<vn.com.ecopharma.hrm.model.Employee> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        Object returnObj = null;

        try {
            returnObj = _invokableLocalService.invokeMethod(_methodName21,
                    _methodParameterTypes21,
                    new Object[] {
                        start,
                        
                    end,
                        
                    ClpSerializer.translateInput(orderByComparator)
                    });
        } catch (Throwable t) {
            t = ClpSerializer.translateThrowable(t);

            if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
                throw (com.liferay.portal.kernel.exception.SystemException) t;
            }

            if (t instanceof RuntimeException) {
                throw (RuntimeException) t;
            } else {
                throw new RuntimeException(t.getClass().getName() +
                    " is not a valid exception");
            }
        }

        return (java.util.List<vn.com.ecopharma.hrm.model.Employee>) ClpSerializer.translateOutput(returnObj);
    }

    @Override
    public java.util.List<vn.com.ecopharma.hrm.model.Employee> filterEmployees(
        java.lang.String globStr, java.lang.String fullName,
        java.lang.String emp_code, java.lang.String gender,
        java.lang.String contact_number, java.lang.String joined_date_from,
        java.lang.String joined_date_to,
        java.util.List<java.lang.String> jobTitles, java.lang.Long subUnitId,
        java.lang.String promoted_date_from, java.lang.String promoted_date_to,
        int start, int end, boolean isDeleted, java.lang.String sortField,
        java.lang.String sortOrder) {
        Object returnObj = null;

        try {
            returnObj = _invokableLocalService.invokeMethod(_methodName22,
                    _methodParameterTypes22,
                    new Object[] {
                        ClpSerializer.translateInput(globStr),
                        
                    ClpSerializer.translateInput(fullName),
                        
                    ClpSerializer.translateInput(emp_code),
                        
                    ClpSerializer.translateInput(gender),
                        
                    ClpSerializer.translateInput(contact_number),
                        
                    ClpSerializer.translateInput(joined_date_from),
                        
                    ClpSerializer.translateInput(joined_date_to),
                        
                    ClpSerializer.translateInput(jobTitles),
                        
                    ClpSerializer.translateInput(subUnitId),
                        
                    ClpSerializer.translateInput(promoted_date_from),
                        
                    ClpSerializer.translateInput(promoted_date_to),
                        
                    start,
                        
                    end,
                        
                    isDeleted,
                        
                    ClpSerializer.translateInput(sortField),
                        
                    ClpSerializer.translateInput(sortOrder)
                    });
        } catch (Throwable t) {
            t = ClpSerializer.translateThrowable(t);

            if (t instanceof RuntimeException) {
                throw (RuntimeException) t;
            } else {
                throw new RuntimeException(t.getClass().getName() +
                    " is not a valid exception");
            }
        }

        return (java.util.List<vn.com.ecopharma.hrm.model.Employee>) ClpSerializer.translateOutput(returnObj);
    }

    @Override
    public vn.com.ecopharma.hrm.model.Employee addEmployee(long creatorUserId,
        long companyId, boolean autoPassword, java.lang.String password1,
        java.lang.String password2, boolean autoScreenName,
        java.lang.String screenName, java.lang.String emailAddress,
        long facebookId, java.lang.String openId, java.util.Locale locale,
        java.lang.String firstName, java.lang.String middleName,
        java.lang.String lastName, int prefixId, int suffixId, boolean male,
        int birthdayMonth, int birthdayDay, int birthdayYear, long[] groupIds,
        long[] organizationIds, long[] roleIds, long[] userGroupIds,
        boolean sendEmail, java.lang.String emp_code,
        java.lang.String contact_number, long jobtitleId,
        java.util.Date joined_date, long subUnitId, long titles_id,
        long level_id, java.util.Date promoted_date,
        java.util.Date labour_contract_signed_date,
        java.util.Date labour_contract_expired_date,
        java.lang.String labour_contract_type, java.lang.String gender,
        java.lang.String place_of_birth, java.lang.String education,
        java.lang.String education_specialize, long universityId,
        java.lang.String marital_status, java.lang.String identityCardNo,
        java.util.Date issued_date, java.lang.String issued_place,
        long addressId, java.lang.String company_email,
        java.lang.String personal_tax_code, int number_of_dependents,
        java.lang.String dependent_names, java.lang.String social_insurance_no,
        java.lang.String health_insurance_no, java.lang.String bank_account_no,
        java.lang.String bank_branch_name, double base_wage_rates,
        double position_wage_rates, double capacity_salary,
        double total_salary, double bonus, java.util.Date resigned_date,
        long emp_userId,
        com.liferay.portal.service.ServiceContext serviceContext)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        Object returnObj = null;

        try {
            returnObj = _invokableLocalService.invokeMethod(_methodName23,
                    _methodParameterTypes23,
                    new Object[] {
                        creatorUserId,
                        
                    companyId,
                        
                    autoPassword,
                        
                    ClpSerializer.translateInput(password1),
                        
                    ClpSerializer.translateInput(password2),
                        
                    autoScreenName,
                        
                    ClpSerializer.translateInput(screenName),
                        
                    ClpSerializer.translateInput(emailAddress),
                        
                    facebookId,
                        
                    ClpSerializer.translateInput(openId),
                        
                    ClpSerializer.translateInput(locale),
                        
                    ClpSerializer.translateInput(firstName),
                        
                    ClpSerializer.translateInput(middleName),
                        
                    ClpSerializer.translateInput(lastName),
                        
                    prefixId,
                        
                    suffixId,
                        
                    male,
                        
                    birthdayMonth,
                        
                    birthdayDay,
                        
                    birthdayYear,
                        
                    ClpSerializer.translateInput(groupIds),
                        
                    ClpSerializer.translateInput(organizationIds),
                        
                    ClpSerializer.translateInput(roleIds),
                        
                    ClpSerializer.translateInput(userGroupIds),
                        
                    sendEmail,
                        
                    ClpSerializer.translateInput(emp_code),
                        
                    ClpSerializer.translateInput(contact_number),
                        
                    jobtitleId,
                        
                    ClpSerializer.translateInput(joined_date),
                        
                    subUnitId,
                        
                    titles_id,
                        
                    level_id,
                        
                    ClpSerializer.translateInput(promoted_date),
                        
                    ClpSerializer.translateInput(labour_contract_signed_date),
                        
                    ClpSerializer.translateInput(labour_contract_expired_date),
                        
                    ClpSerializer.translateInput(labour_contract_type),
                        
                    ClpSerializer.translateInput(gender),
                        
                    ClpSerializer.translateInput(place_of_birth),
                        
                    ClpSerializer.translateInput(education),
                        
                    ClpSerializer.translateInput(education_specialize),
                        
                    universityId,
                        
                    ClpSerializer.translateInput(marital_status),
                        
                    ClpSerializer.translateInput(identityCardNo),
                        
                    ClpSerializer.translateInput(issued_date),
                        
                    ClpSerializer.translateInput(issued_place),
                        
                    addressId,
                        
                    ClpSerializer.translateInput(company_email),
                        
                    ClpSerializer.translateInput(personal_tax_code),
                        
                    number_of_dependents,
                        
                    ClpSerializer.translateInput(dependent_names),
                        
                    ClpSerializer.translateInput(social_insurance_no),
                        
                    ClpSerializer.translateInput(health_insurance_no),
                        
                    ClpSerializer.translateInput(bank_account_no),
                        
                    ClpSerializer.translateInput(bank_branch_name),
                        
                    base_wage_rates,
                        
                    position_wage_rates,
                        
                    capacity_salary,
                        
                    total_salary,
                        
                    bonus,
                        
                    ClpSerializer.translateInput(resigned_date),
                        
                    emp_userId,
                        
                    ClpSerializer.translateInput(serviceContext)
                    });
        } catch (Throwable t) {
            t = ClpSerializer.translateThrowable(t);

            if (t instanceof com.liferay.portal.kernel.exception.PortalException) {
                throw (com.liferay.portal.kernel.exception.PortalException) t;
            }

            if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
                throw (com.liferay.portal.kernel.exception.SystemException) t;
            }

            if (t instanceof RuntimeException) {
                throw (RuntimeException) t;
            } else {
                throw new RuntimeException(t.getClass().getName() +
                    " is not a valid exception");
            }
        }

        return (vn.com.ecopharma.hrm.model.Employee) ClpSerializer.translateOutput(returnObj);
    }

    @Override
    public vn.com.ecopharma.hrm.model.Employee addEmployee(
        vn.com.ecopharma.hrm.model.Employee e, long creatorUserId,
        long companyId, boolean autoPassword, java.lang.String password1,
        java.lang.String password2, boolean autoScreenName,
        java.lang.String screenName, java.lang.String emailAddress,
        long facebookId, java.lang.String openId, java.util.Locale locale,
        java.lang.String firstName, java.lang.String middleName,
        java.lang.String lastName, int prefixId, int suffixId, boolean male,
        int birthdayMonth, int birthdayDay, int birthdayYear, long[] groupIds,
        long[] organizationIds, long[] roleIds, long[] userGroupIds,
        boolean sendEmail, long emp_userId,
        java.util.List<vn.com.taotv.primefaces.modelView.item.AddressObjectItem> addresses,
        com.liferay.portal.service.ServiceContext serviceContext)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        Object returnObj = null;

        try {
            returnObj = _invokableLocalService.invokeMethod(_methodName24,
                    _methodParameterTypes24,
                    new Object[] {
                        ClpSerializer.translateInput(e),
                        
                    creatorUserId,
                        
                    companyId,
                        
                    autoPassword,
                        
                    ClpSerializer.translateInput(password1),
                        
                    ClpSerializer.translateInput(password2),
                        
                    autoScreenName,
                        
                    ClpSerializer.translateInput(screenName),
                        
                    ClpSerializer.translateInput(emailAddress),
                        
                    facebookId,
                        
                    ClpSerializer.translateInput(openId),
                        
                    ClpSerializer.translateInput(locale),
                        
                    ClpSerializer.translateInput(firstName),
                        
                    ClpSerializer.translateInput(middleName),
                        
                    ClpSerializer.translateInput(lastName),
                        
                    prefixId,
                        
                    suffixId,
                        
                    male,
                        
                    birthdayMonth,
                        
                    birthdayDay,
                        
                    birthdayYear,
                        
                    ClpSerializer.translateInput(groupIds),
                        
                    ClpSerializer.translateInput(organizationIds),
                        
                    ClpSerializer.translateInput(roleIds),
                        
                    ClpSerializer.translateInput(userGroupIds),
                        
                    sendEmail,
                        
                    emp_userId,
                        
                    ClpSerializer.translateInput(addresses),
                        
                    ClpSerializer.translateInput(serviceContext)
                    });
        } catch (Throwable t) {
            t = ClpSerializer.translateThrowable(t);

            if (t instanceof com.liferay.portal.kernel.exception.PortalException) {
                throw (com.liferay.portal.kernel.exception.PortalException) t;
            }

            if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
                throw (com.liferay.portal.kernel.exception.SystemException) t;
            }

            if (t instanceof RuntimeException) {
                throw (RuntimeException) t;
            } else {
                throw new RuntimeException(t.getClass().getName() +
                    " is not a valid exception");
            }
        }

        return (vn.com.ecopharma.hrm.model.Employee) ClpSerializer.translateOutput(returnObj);
    }

    @Override
    public vn.com.ecopharma.hrm.model.Employee update(
        vn.com.ecopharma.hrm.model.Employee employee,
        com.liferay.portal.model.User user,
        vn.com.ecopharma.hrm.model.JTitle jTitle,
        vn.com.ecopharma.hrm.model.SubUnit subUnit,
        vn.com.ecopharma.hrm.model.Titles titles,
        vn.com.ecopharma.hrm.model.Level level,
        vn.com.ecopharma.hrm.model.University university,
        java.util.List<vn.com.taotv.primefaces.modelView.item.AddressObjectItem> addresses,
        com.liferay.portal.service.ServiceContext serviceContext)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        Object returnObj = null;

        try {
            returnObj = _invokableLocalService.invokeMethod(_methodName25,
                    _methodParameterTypes25,
                    new Object[] {
                        ClpSerializer.translateInput(employee),
                        
                    ClpSerializer.translateInput(user),
                        
                    ClpSerializer.translateInput(jTitle),
                        
                    ClpSerializer.translateInput(subUnit),
                        
                    ClpSerializer.translateInput(titles),
                        
                    ClpSerializer.translateInput(level),
                        
                    ClpSerializer.translateInput(university),
                        
                    ClpSerializer.translateInput(addresses),
                        
                    ClpSerializer.translateInput(serviceContext)
                    });
        } catch (Throwable t) {
            t = ClpSerializer.translateThrowable(t);

            if (t instanceof com.liferay.portal.kernel.exception.PortalException) {
                throw (com.liferay.portal.kernel.exception.PortalException) t;
            }

            if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
                throw (com.liferay.portal.kernel.exception.SystemException) t;
            }

            if (t instanceof RuntimeException) {
                throw (RuntimeException) t;
            } else {
                throw new RuntimeException(t.getClass().getName() +
                    " is not a valid exception");
            }
        }

        return (vn.com.ecopharma.hrm.model.Employee) ClpSerializer.translateOutput(returnObj);
    }

    @Override
    public int countAll() {
        Object returnObj = null;

        try {
            returnObj = _invokableLocalService.invokeMethod(_methodName26,
                    _methodParameterTypes26, new Object[] {  });
        } catch (Throwable t) {
            t = ClpSerializer.translateThrowable(t);

            if (t instanceof RuntimeException) {
                throw (RuntimeException) t;
            } else {
                throw new RuntimeException(t.getClass().getName() +
                    " is not a valid exception");
            }
        }

        return ((Integer) returnObj).intValue();
    }
}
