package vn.com.ecopharma.hrm.service;

import com.liferay.portal.service.InvokableLocalService;

/**
 * @author tvt
 * @generated
 */
public class CandidateLocalServiceClp implements CandidateLocalService {
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
    private String _methodName32;
    private String[] _methodParameterTypes32;
    private String _methodName33;
    private String[] _methodParameterTypes33;
    private String _methodName35;
    private String[] _methodParameterTypes35;
    private String _methodName36;
    private String[] _methodParameterTypes36;
    private String _methodName37;
    private String[] _methodParameterTypes37;
    private String _methodName38;
    private String[] _methodParameterTypes38;
    private String _methodName39;
    private String[] _methodParameterTypes39;
    private String _methodName40;
    private String[] _methodParameterTypes40;
    private String _methodName41;
    private String[] _methodParameterTypes41;
    private String _methodName42;
    private String[] _methodParameterTypes42;
    private String _methodName43;
    private String[] _methodParameterTypes43;
    private String _methodName44;
    private String[] _methodParameterTypes44;
    private String _methodName45;
    private String[] _methodParameterTypes45;
    private String _methodName46;
    private String[] _methodParameterTypes46;
    private String _methodName47;
    private String[] _methodParameterTypes47;
    private String _methodName48;
    private String[] _methodParameterTypes48;

    public CandidateLocalServiceClp(InvokableLocalService invokableLocalService) {
        _invokableLocalService = invokableLocalService;

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

        _methodName32 = "getBeanIdentifier";

        _methodParameterTypes32 = new String[] {  };

        _methodName33 = "setBeanIdentifier";

        _methodParameterTypes33 = new String[] { "java.lang.String" };

        _methodName35 = "findAll";

        _methodParameterTypes35 = new String[] {  };

        _methodName36 = "findAll";

        _methodParameterTypes36 = new String[] { "int", "int" };

        _methodName37 = "findCandidates";

        _methodParameterTypes37 = new String[] { "int", "int" };

        _methodName38 = "searchCandidates";

        _methodParameterTypes38 = new String[] {
                "long", "java.lang.String", "java.lang.String",
                "java.lang.String", "java.lang.String", "int", "int"
            };

        _methodName39 = "searchCandidates";

        _methodParameterTypes39 = new String[] {
                "long", "java.lang.String", "java.lang.String",
                "java.lang.String", "java.lang.String", "int", "int",
                "com.liferay.portal.kernel.util.OrderByComparator"
            };

        _methodName40 = "getVacanciesByCandidate";

        _methodParameterTypes40 = new String[] { "long" };

        _methodName41 = "createCandidate";

        _methodParameterTypes41 = new String[] {
                "long", "java.lang.String", "java.lang.String",
                "java.lang.String", "java.lang.String", "java.lang.String",
                "java.lang.String", "int", "java.sql.Date", "long",
                "java.lang.String", "int", "java.util.List",
                "com.liferay.portal.service.ServiceContext"
            };

        _methodName42 = "editCandidate";

        _methodParameterTypes42 = new String[] {
                "long", "java.lang.String", "java.lang.String",
                "java.lang.String", "java.lang.String", "java.lang.String",
                "java.lang.String", "int", "java.sql.Date", "long",
                "java.lang.String", "int", "java.util.List"
            };

        _methodName43 = "delele";

        _methodParameterTypes43 = new String[] { "long" };

        _methodName44 = "findCandidates";

        _methodParameterTypes44 = new String[] {
                "java.lang.String", "java.lang.String", "java.lang.String",
                "java.lang.String"
            };

        _methodName45 = "findCandidates";

        _methodParameterTypes45 = new String[] {
                "java.lang.String", "java.lang.String", "java.lang.String",
                "java.lang.String", "int", "int"
            };

        _methodName46 = "countAll";

        _methodParameterTypes46 = new String[] {  };

        _methodName47 = "filterCandidates";

        _methodParameterTypes47 = new String[] { "java.lang.String" };

        _methodName48 = "filterCandidates";

        _methodParameterTypes48 = new String[] { "java.lang.String", "int", "int" };
    }

    @Override
    public vn.com.ecopharma.hrm.model.Candidate addCandidate(
        vn.com.ecopharma.hrm.model.Candidate candidate)
        throws com.liferay.portal.kernel.exception.SystemException {
        Object returnObj = null;

        try {
            returnObj = _invokableLocalService.invokeMethod(_methodName0,
                    _methodParameterTypes0,
                    new Object[] { ClpSerializer.translateInput(candidate) });
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

        return (vn.com.ecopharma.hrm.model.Candidate) ClpSerializer.translateOutput(returnObj);
    }

    @Override
    public vn.com.ecopharma.hrm.model.Candidate createCandidate(long c_id) {
        Object returnObj = null;

        try {
            returnObj = _invokableLocalService.invokeMethod(_methodName1,
                    _methodParameterTypes1, new Object[] { c_id });
        } catch (Throwable t) {
            t = ClpSerializer.translateThrowable(t);

            if (t instanceof RuntimeException) {
                throw (RuntimeException) t;
            } else {
                throw new RuntimeException(t.getClass().getName() +
                    " is not a valid exception");
            }
        }

        return (vn.com.ecopharma.hrm.model.Candidate) ClpSerializer.translateOutput(returnObj);
    }

    @Override
    public vn.com.ecopharma.hrm.model.Candidate deleteCandidate(long c_id)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        Object returnObj = null;

        try {
            returnObj = _invokableLocalService.invokeMethod(_methodName2,
                    _methodParameterTypes2, new Object[] { c_id });
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

        return (vn.com.ecopharma.hrm.model.Candidate) ClpSerializer.translateOutput(returnObj);
    }

    @Override
    public vn.com.ecopharma.hrm.model.Candidate deleteCandidate(
        vn.com.ecopharma.hrm.model.Candidate candidate)
        throws com.liferay.portal.kernel.exception.SystemException {
        Object returnObj = null;

        try {
            returnObj = _invokableLocalService.invokeMethod(_methodName3,
                    _methodParameterTypes3,
                    new Object[] { ClpSerializer.translateInput(candidate) });
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

        return (vn.com.ecopharma.hrm.model.Candidate) ClpSerializer.translateOutput(returnObj);
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
    public vn.com.ecopharma.hrm.model.Candidate fetchCandidate(long c_id)
        throws com.liferay.portal.kernel.exception.SystemException {
        Object returnObj = null;

        try {
            returnObj = _invokableLocalService.invokeMethod(_methodName10,
                    _methodParameterTypes10, new Object[] { c_id });
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

        return (vn.com.ecopharma.hrm.model.Candidate) ClpSerializer.translateOutput(returnObj);
    }

    @Override
    public vn.com.ecopharma.hrm.model.Candidate getCandidate(long c_id)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        Object returnObj = null;

        try {
            returnObj = _invokableLocalService.invokeMethod(_methodName11,
                    _methodParameterTypes11, new Object[] { c_id });
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

        return (vn.com.ecopharma.hrm.model.Candidate) ClpSerializer.translateOutput(returnObj);
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
    public java.util.List<vn.com.ecopharma.hrm.model.Candidate> getCandidates(
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

        return (java.util.List<vn.com.ecopharma.hrm.model.Candidate>) ClpSerializer.translateOutput(returnObj);
    }

    @Override
    public int getCandidatesCount()
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
    public vn.com.ecopharma.hrm.model.Candidate updateCandidate(
        vn.com.ecopharma.hrm.model.Candidate candidate)
        throws com.liferay.portal.kernel.exception.SystemException {
        Object returnObj = null;

        try {
            returnObj = _invokableLocalService.invokeMethod(_methodName15,
                    _methodParameterTypes15,
                    new Object[] { ClpSerializer.translateInput(candidate) });
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

        return (vn.com.ecopharma.hrm.model.Candidate) ClpSerializer.translateOutput(returnObj);
    }

    @Override
    public void addVacancyCandidate(long v_id, long c_id)
        throws com.liferay.portal.kernel.exception.SystemException {
        try {
            _invokableLocalService.invokeMethod(_methodName16,
                _methodParameterTypes16, new Object[] { v_id, c_id });
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
    }

    @Override
    public void addVacancyCandidate(long v_id,
        vn.com.ecopharma.hrm.model.Candidate candidate)
        throws com.liferay.portal.kernel.exception.SystemException {
        try {
            _invokableLocalService.invokeMethod(_methodName17,
                _methodParameterTypes17,
                new Object[] { v_id, ClpSerializer.translateInput(candidate) });
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
    }

    @Override
    public void addVacancyCandidates(long v_id, long[] c_ids)
        throws com.liferay.portal.kernel.exception.SystemException {
        try {
            _invokableLocalService.invokeMethod(_methodName18,
                _methodParameterTypes18,
                new Object[] { v_id, ClpSerializer.translateInput(c_ids) });
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
    }

    @Override
    public void addVacancyCandidates(long v_id,
        java.util.List<vn.com.ecopharma.hrm.model.Candidate> Candidates)
        throws com.liferay.portal.kernel.exception.SystemException {
        try {
            _invokableLocalService.invokeMethod(_methodName19,
                _methodParameterTypes19,
                new Object[] { v_id, ClpSerializer.translateInput(Candidates) });
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
    }

    @Override
    public void clearVacancyCandidates(long v_id)
        throws com.liferay.portal.kernel.exception.SystemException {
        try {
            _invokableLocalService.invokeMethod(_methodName20,
                _methodParameterTypes20, new Object[] { v_id });
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
    }

    @Override
    public void deleteVacancyCandidate(long v_id, long c_id)
        throws com.liferay.portal.kernel.exception.SystemException {
        try {
            _invokableLocalService.invokeMethod(_methodName21,
                _methodParameterTypes21, new Object[] { v_id, c_id });
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
    }

    @Override
    public void deleteVacancyCandidate(long v_id,
        vn.com.ecopharma.hrm.model.Candidate candidate)
        throws com.liferay.portal.kernel.exception.SystemException {
        try {
            _invokableLocalService.invokeMethod(_methodName22,
                _methodParameterTypes22,
                new Object[] { v_id, ClpSerializer.translateInput(candidate) });
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
    }

    @Override
    public void deleteVacancyCandidates(long v_id, long[] c_ids)
        throws com.liferay.portal.kernel.exception.SystemException {
        try {
            _invokableLocalService.invokeMethod(_methodName23,
                _methodParameterTypes23,
                new Object[] { v_id, ClpSerializer.translateInput(c_ids) });
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
    }

    @Override
    public void deleteVacancyCandidates(long v_id,
        java.util.List<vn.com.ecopharma.hrm.model.Candidate> Candidates)
        throws com.liferay.portal.kernel.exception.SystemException {
        try {
            _invokableLocalService.invokeMethod(_methodName24,
                _methodParameterTypes24,
                new Object[] { v_id, ClpSerializer.translateInput(Candidates) });
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
    }

    @Override
    public java.util.List<vn.com.ecopharma.hrm.model.Candidate> getVacancyCandidates(
        long v_id) throws com.liferay.portal.kernel.exception.SystemException {
        Object returnObj = null;

        try {
            returnObj = _invokableLocalService.invokeMethod(_methodName25,
                    _methodParameterTypes25, new Object[] { v_id });
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

        return (java.util.List<vn.com.ecopharma.hrm.model.Candidate>) ClpSerializer.translateOutput(returnObj);
    }

    @Override
    public java.util.List<vn.com.ecopharma.hrm.model.Candidate> getVacancyCandidates(
        long v_id, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        Object returnObj = null;

        try {
            returnObj = _invokableLocalService.invokeMethod(_methodName26,
                    _methodParameterTypes26, new Object[] { v_id, start, end });
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

        return (java.util.List<vn.com.ecopharma.hrm.model.Candidate>) ClpSerializer.translateOutput(returnObj);
    }

    @Override
    public java.util.List<vn.com.ecopharma.hrm.model.Candidate> getVacancyCandidates(
        long v_id, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        Object returnObj = null;

        try {
            returnObj = _invokableLocalService.invokeMethod(_methodName27,
                    _methodParameterTypes27,
                    new Object[] {
                        v_id,
                        
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

        return (java.util.List<vn.com.ecopharma.hrm.model.Candidate>) ClpSerializer.translateOutput(returnObj);
    }

    @Override
    public int getVacancyCandidatesCount(long v_id)
        throws com.liferay.portal.kernel.exception.SystemException {
        Object returnObj = null;

        try {
            returnObj = _invokableLocalService.invokeMethod(_methodName28,
                    _methodParameterTypes28, new Object[] { v_id });
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
    public boolean hasVacancyCandidate(long v_id, long c_id)
        throws com.liferay.portal.kernel.exception.SystemException {
        Object returnObj = null;

        try {
            returnObj = _invokableLocalService.invokeMethod(_methodName29,
                    _methodParameterTypes29, new Object[] { v_id, c_id });
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

        return ((Boolean) returnObj).booleanValue();
    }

    @Override
    public boolean hasVacancyCandidates(long v_id)
        throws com.liferay.portal.kernel.exception.SystemException {
        Object returnObj = null;

        try {
            returnObj = _invokableLocalService.invokeMethod(_methodName30,
                    _methodParameterTypes30, new Object[] { v_id });
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

        return ((Boolean) returnObj).booleanValue();
    }

    @Override
    public void setVacancyCandidates(long v_id, long[] c_ids)
        throws com.liferay.portal.kernel.exception.SystemException {
        try {
            _invokableLocalService.invokeMethod(_methodName31,
                _methodParameterTypes31,
                new Object[] { v_id, ClpSerializer.translateInput(c_ids) });
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
    }

    @Override
    public java.lang.String getBeanIdentifier() {
        Object returnObj = null;

        try {
            returnObj = _invokableLocalService.invokeMethod(_methodName32,
                    _methodParameterTypes32, new Object[] {  });
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
            _invokableLocalService.invokeMethod(_methodName33,
                _methodParameterTypes33,
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
    public java.util.List<vn.com.ecopharma.hrm.model.Candidate> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        Object returnObj = null;

        try {
            returnObj = _invokableLocalService.invokeMethod(_methodName35,
                    _methodParameterTypes35, new Object[] {  });
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

        return (java.util.List<vn.com.ecopharma.hrm.model.Candidate>) ClpSerializer.translateOutput(returnObj);
    }

    @Override
    public java.util.List<vn.com.ecopharma.hrm.model.Candidate> findAll(
        int start, int end) {
        Object returnObj = null;

        try {
            returnObj = _invokableLocalService.invokeMethod(_methodName36,
                    _methodParameterTypes36, new Object[] { start, end });
        } catch (Throwable t) {
            t = ClpSerializer.translateThrowable(t);

            if (t instanceof RuntimeException) {
                throw (RuntimeException) t;
            } else {
                throw new RuntimeException(t.getClass().getName() +
                    " is not a valid exception");
            }
        }

        return (java.util.List<vn.com.ecopharma.hrm.model.Candidate>) ClpSerializer.translateOutput(returnObj);
    }

    @Override
    public java.util.List<vn.com.ecopharma.hrm.model.Candidate> findCandidates(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        Object returnObj = null;

        try {
            returnObj = _invokableLocalService.invokeMethod(_methodName37,
                    _methodParameterTypes37, new Object[] { start, end });
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

        return (java.util.List<vn.com.ecopharma.hrm.model.Candidate>) ClpSerializer.translateOutput(returnObj);
    }

    @Override
    public java.util.List<vn.com.ecopharma.hrm.model.Candidate> searchCandidates(
        long id, java.lang.String first_name, java.lang.String middle_name,
        java.lang.String last_name, java.lang.String email, int start, int end) {
        Object returnObj = null;

        try {
            returnObj = _invokableLocalService.invokeMethod(_methodName38,
                    _methodParameterTypes38,
                    new Object[] {
                        id,
                        
                    ClpSerializer.translateInput(first_name),
                        
                    ClpSerializer.translateInput(middle_name),
                        
                    ClpSerializer.translateInput(last_name),
                        
                    ClpSerializer.translateInput(email),
                        
                    start,
                        
                    end
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

        return (java.util.List<vn.com.ecopharma.hrm.model.Candidate>) ClpSerializer.translateOutput(returnObj);
    }

    @Override
    public java.util.List<vn.com.ecopharma.hrm.model.Candidate> searchCandidates(
        long id, java.lang.String first_name, java.lang.String middle_name,
        java.lang.String last_name, java.lang.String email, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator order) {
        Object returnObj = null;

        try {
            returnObj = _invokableLocalService.invokeMethod(_methodName39,
                    _methodParameterTypes39,
                    new Object[] {
                        id,
                        
                    ClpSerializer.translateInput(first_name),
                        
                    ClpSerializer.translateInput(middle_name),
                        
                    ClpSerializer.translateInput(last_name),
                        
                    ClpSerializer.translateInput(email),
                        
                    start,
                        
                    end,
                        
                    ClpSerializer.translateInput(order)
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

        return (java.util.List<vn.com.ecopharma.hrm.model.Candidate>) ClpSerializer.translateOutput(returnObj);
    }

    @Override
    public java.util.List<vn.com.ecopharma.hrm.model.Vacancy> getVacanciesByCandidate(
        long c_id) {
        Object returnObj = null;

        try {
            returnObj = _invokableLocalService.invokeMethod(_methodName40,
                    _methodParameterTypes40, new Object[] { c_id });
        } catch (Throwable t) {
            t = ClpSerializer.translateThrowable(t);

            if (t instanceof RuntimeException) {
                throw (RuntimeException) t;
            } else {
                throw new RuntimeException(t.getClass().getName() +
                    " is not a valid exception");
            }
        }

        return (java.util.List<vn.com.ecopharma.hrm.model.Vacancy>) ClpSerializer.translateOutput(returnObj);
    }

    @Override
    public vn.com.ecopharma.hrm.model.Candidate createCandidate(long user_id,
        java.lang.String first_name, java.lang.String middle_name,
        java.lang.String last_name, java.lang.String email,
        java.lang.String contact_number, java.lang.String comment,
        int mode_of_application, java.sql.Date date_of_application,
        long cv_file_id, java.lang.String cv_text_version, int added_person,
        java.util.List<vn.com.ecopharma.hrm.model.Vacancy> vacancies,
        com.liferay.portal.service.ServiceContext serviceContext)
        throws vn.com.ecopharma.hrm.NoSuchVacancyException {
        Object returnObj = null;

        try {
            returnObj = _invokableLocalService.invokeMethod(_methodName41,
                    _methodParameterTypes41,
                    new Object[] {
                        user_id,
                        
                    ClpSerializer.translateInput(first_name),
                        
                    ClpSerializer.translateInput(middle_name),
                        
                    ClpSerializer.translateInput(last_name),
                        
                    ClpSerializer.translateInput(email),
                        
                    ClpSerializer.translateInput(contact_number),
                        
                    ClpSerializer.translateInput(comment),
                        
                    mode_of_application,
                        
                    ClpSerializer.translateInput(date_of_application),
                        
                    cv_file_id,
                        
                    ClpSerializer.translateInput(cv_text_version),
                        
                    added_person,
                        
                    ClpSerializer.translateInput(vacancies),
                        
                    ClpSerializer.translateInput(serviceContext)
                    });
        } catch (Throwable t) {
            t = ClpSerializer.translateThrowable(t);

            if (t instanceof vn.com.ecopharma.hrm.NoSuchVacancyException) {
                throw (vn.com.ecopharma.hrm.NoSuchVacancyException) t;
            }

            if (t instanceof RuntimeException) {
                throw (RuntimeException) t;
            } else {
                throw new RuntimeException(t.getClass().getName() +
                    " is not a valid exception");
            }
        }

        return (vn.com.ecopharma.hrm.model.Candidate) ClpSerializer.translateOutput(returnObj);
    }

    @Override
    public vn.com.ecopharma.hrm.model.Candidate editCandidate(
        long candidateId, java.lang.String first_name,
        java.lang.String middle_name, java.lang.String last_name,
        java.lang.String email, java.lang.String contact_number,
        java.lang.String comment, int mode_of_application,
        java.sql.Date date_of_application, long cv_file_id,
        java.lang.String cv_text_version, int added_person,
        java.util.List<vn.com.ecopharma.hrm.model.Vacancy> vacancies)
        throws vn.com.ecopharma.hrm.NoSuchVacancyException {
        Object returnObj = null;

        try {
            returnObj = _invokableLocalService.invokeMethod(_methodName42,
                    _methodParameterTypes42,
                    new Object[] {
                        candidateId,
                        
                    ClpSerializer.translateInput(first_name),
                        
                    ClpSerializer.translateInput(middle_name),
                        
                    ClpSerializer.translateInput(last_name),
                        
                    ClpSerializer.translateInput(email),
                        
                    ClpSerializer.translateInput(contact_number),
                        
                    ClpSerializer.translateInput(comment),
                        
                    mode_of_application,
                        
                    ClpSerializer.translateInput(date_of_application),
                        
                    cv_file_id,
                        
                    ClpSerializer.translateInput(cv_text_version),
                        
                    added_person,
                        
                    ClpSerializer.translateInput(vacancies)
                    });
        } catch (Throwable t) {
            t = ClpSerializer.translateThrowable(t);

            if (t instanceof vn.com.ecopharma.hrm.NoSuchVacancyException) {
                throw (vn.com.ecopharma.hrm.NoSuchVacancyException) t;
            }

            if (t instanceof RuntimeException) {
                throw (RuntimeException) t;
            } else {
                throw new RuntimeException(t.getClass().getName() +
                    " is not a valid exception");
            }
        }

        return (vn.com.ecopharma.hrm.model.Candidate) ClpSerializer.translateOutput(returnObj);
    }

    @Override
    public void delele(long c_id) {
        try {
            _invokableLocalService.invokeMethod(_methodName43,
                _methodParameterTypes43, new Object[] { c_id });
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
    public java.util.List<vn.com.ecopharma.hrm.model.Candidate> findCandidates(
        java.lang.String first_name, java.lang.String middle_name,
        java.lang.String last_name, java.lang.String email) {
        Object returnObj = null;

        try {
            returnObj = _invokableLocalService.invokeMethod(_methodName44,
                    _methodParameterTypes44,
                    new Object[] {
                        ClpSerializer.translateInput(first_name),
                        
                    ClpSerializer.translateInput(middle_name),
                        
                    ClpSerializer.translateInput(last_name),
                        
                    ClpSerializer.translateInput(email)
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

        return (java.util.List<vn.com.ecopharma.hrm.model.Candidate>) ClpSerializer.translateOutput(returnObj);
    }

    @Override
    public java.util.List<vn.com.ecopharma.hrm.model.Candidate> findCandidates(
        java.lang.String first_name, java.lang.String middle_name,
        java.lang.String last_name, java.lang.String email, int start, int end) {
        Object returnObj = null;

        try {
            returnObj = _invokableLocalService.invokeMethod(_methodName45,
                    _methodParameterTypes45,
                    new Object[] {
                        ClpSerializer.translateInput(first_name),
                        
                    ClpSerializer.translateInput(middle_name),
                        
                    ClpSerializer.translateInput(last_name),
                        
                    ClpSerializer.translateInput(email),
                        
                    start,
                        
                    end
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

        return (java.util.List<vn.com.ecopharma.hrm.model.Candidate>) ClpSerializer.translateOutput(returnObj);
    }

    @Override
    public int countAll() {
        Object returnObj = null;

        try {
            returnObj = _invokableLocalService.invokeMethod(_methodName46,
                    _methodParameterTypes46, new Object[] {  });
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

    @Override
    public java.util.List<vn.com.ecopharma.hrm.model.Candidate> filterCandidates(
        java.lang.String filterString) {
        Object returnObj = null;

        try {
            returnObj = _invokableLocalService.invokeMethod(_methodName47,
                    _methodParameterTypes47,
                    new Object[] { ClpSerializer.translateInput(filterString) });
        } catch (Throwable t) {
            t = ClpSerializer.translateThrowable(t);

            if (t instanceof RuntimeException) {
                throw (RuntimeException) t;
            } else {
                throw new RuntimeException(t.getClass().getName() +
                    " is not a valid exception");
            }
        }

        return (java.util.List<vn.com.ecopharma.hrm.model.Candidate>) ClpSerializer.translateOutput(returnObj);
    }

    @Override
    public java.util.List<vn.com.ecopharma.hrm.model.Candidate> filterCandidates(
        java.lang.String filterString, int start, int end) {
        Object returnObj = null;

        try {
            returnObj = _invokableLocalService.invokeMethod(_methodName48,
                    _methodParameterTypes48,
                    new Object[] {
                        ClpSerializer.translateInput(filterString),
                        
                    start,
                        
                    end
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

        return (java.util.List<vn.com.ecopharma.hrm.model.Candidate>) ClpSerializer.translateOutput(returnObj);
    }
}
