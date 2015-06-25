package vn.com.ecopharma.hrm.service;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.io.unsync.UnsyncByteArrayInputStream;
import com.liferay.portal.kernel.io.unsync.UnsyncByteArrayOutputStream;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.ClassLoaderObjectInputStream;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.BaseModel;

import vn.com.ecopharma.hrm.model.CandidateClp;
import vn.com.ecopharma.hrm.model.CandidateHistoryClp;
import vn.com.ecopharma.hrm.model.EmployeeClp;
import vn.com.ecopharma.hrm.model.EmployeeInterviewScheduleClp;
import vn.com.ecopharma.hrm.model.EmployeeVacancyClp;
import vn.com.ecopharma.hrm.model.FileAttachmentClp;
import vn.com.ecopharma.hrm.model.InterviewClp;
import vn.com.ecopharma.hrm.model.InterviewScheduleClp;
import vn.com.ecopharma.hrm.model.JTitleClp;
import vn.com.ecopharma.hrm.model.LocationClp;
import vn.com.ecopharma.hrm.model.SubUnitClp;
import vn.com.ecopharma.hrm.model.UniversityClp;
import vn.com.ecopharma.hrm.model.VacancyCandidateClp;
import vn.com.ecopharma.hrm.model.VacancyClp;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import java.lang.reflect.Method;

import java.util.ArrayList;
import java.util.List;


public class ClpSerializer {
    private static Log _log = LogFactoryUtil.getLog(ClpSerializer.class);
    private static String _servletContextName;
    private static boolean _useReflectionToTranslateThrowable = true;

    public static String getServletContextName() {
        if (Validator.isNotNull(_servletContextName)) {
            return _servletContextName;
        }

        synchronized (ClpSerializer.class) {
            if (Validator.isNotNull(_servletContextName)) {
                return _servletContextName;
            }

            try {
                ClassLoader classLoader = ClpSerializer.class.getClassLoader();

                Class<?> portletPropsClass = classLoader.loadClass(
                        "com.liferay.util.portlet.PortletProps");

                Method getMethod = portletPropsClass.getMethod("get",
                        new Class<?>[] { String.class });

                String portletPropsServletContextName = (String) getMethod.invoke(null,
                        "Hrm-portlet-deployment-context");

                if (Validator.isNotNull(portletPropsServletContextName)) {
                    _servletContextName = portletPropsServletContextName;
                }
            } catch (Throwable t) {
                if (_log.isInfoEnabled()) {
                    _log.info(
                        "Unable to locate deployment context from portlet properties");
                }
            }

            if (Validator.isNull(_servletContextName)) {
                try {
                    String propsUtilServletContextName = PropsUtil.get(
                            "Hrm-portlet-deployment-context");

                    if (Validator.isNotNull(propsUtilServletContextName)) {
                        _servletContextName = propsUtilServletContextName;
                    }
                } catch (Throwable t) {
                    if (_log.isInfoEnabled()) {
                        _log.info(
                            "Unable to locate deployment context from portal properties");
                    }
                }
            }

            if (Validator.isNull(_servletContextName)) {
                _servletContextName = "Hrm-portlet";
            }

            return _servletContextName;
        }
    }

    public static Object translateInput(BaseModel<?> oldModel) {
        Class<?> oldModelClass = oldModel.getClass();

        String oldModelClassName = oldModelClass.getName();

        if (oldModelClassName.equals(CandidateClp.class.getName())) {
            return translateInputCandidate(oldModel);
        }

        if (oldModelClassName.equals(CandidateHistoryClp.class.getName())) {
            return translateInputCandidateHistory(oldModel);
        }

        if (oldModelClassName.equals(EmployeeClp.class.getName())) {
            return translateInputEmployee(oldModel);
        }

        if (oldModelClassName.equals(
                    EmployeeInterviewScheduleClp.class.getName())) {
            return translateInputEmployeeInterviewSchedule(oldModel);
        }

        if (oldModelClassName.equals(EmployeeVacancyClp.class.getName())) {
            return translateInputEmployeeVacancy(oldModel);
        }

        if (oldModelClassName.equals(FileAttachmentClp.class.getName())) {
            return translateInputFileAttachment(oldModel);
        }

        if (oldModelClassName.equals(InterviewClp.class.getName())) {
            return translateInputInterview(oldModel);
        }

        if (oldModelClassName.equals(InterviewScheduleClp.class.getName())) {
            return translateInputInterviewSchedule(oldModel);
        }

        if (oldModelClassName.equals(JTitleClp.class.getName())) {
            return translateInputJTitle(oldModel);
        }

        if (oldModelClassName.equals(LocationClp.class.getName())) {
            return translateInputLocation(oldModel);
        }

        if (oldModelClassName.equals(SubUnitClp.class.getName())) {
            return translateInputSubUnit(oldModel);
        }

        if (oldModelClassName.equals(UniversityClp.class.getName())) {
            return translateInputUniversity(oldModel);
        }

        if (oldModelClassName.equals(VacancyClp.class.getName())) {
            return translateInputVacancy(oldModel);
        }

        if (oldModelClassName.equals(VacancyCandidateClp.class.getName())) {
            return translateInputVacancyCandidate(oldModel);
        }

        return oldModel;
    }

    public static Object translateInput(List<Object> oldList) {
        List<Object> newList = new ArrayList<Object>(oldList.size());

        for (int i = 0; i < oldList.size(); i++) {
            Object curObj = oldList.get(i);

            newList.add(translateInput(curObj));
        }

        return newList;
    }

    public static Object translateInputCandidate(BaseModel<?> oldModel) {
        CandidateClp oldClpModel = (CandidateClp) oldModel;

        BaseModel<?> newModel = oldClpModel.getCandidateRemoteModel();

        newModel.setModelAttributes(oldClpModel.getModelAttributes());

        return newModel;
    }

    public static Object translateInputCandidateHistory(BaseModel<?> oldModel) {
        CandidateHistoryClp oldClpModel = (CandidateHistoryClp) oldModel;

        BaseModel<?> newModel = oldClpModel.getCandidateHistoryRemoteModel();

        newModel.setModelAttributes(oldClpModel.getModelAttributes());

        return newModel;
    }

    public static Object translateInputEmployee(BaseModel<?> oldModel) {
        EmployeeClp oldClpModel = (EmployeeClp) oldModel;

        BaseModel<?> newModel = oldClpModel.getEmployeeRemoteModel();

        newModel.setModelAttributes(oldClpModel.getModelAttributes());

        return newModel;
    }

    public static Object translateInputEmployeeInterviewSchedule(
        BaseModel<?> oldModel) {
        EmployeeInterviewScheduleClp oldClpModel = (EmployeeInterviewScheduleClp) oldModel;

        BaseModel<?> newModel = oldClpModel.getEmployeeInterviewScheduleRemoteModel();

        newModel.setModelAttributes(oldClpModel.getModelAttributes());

        return newModel;
    }

    public static Object translateInputEmployeeVacancy(BaseModel<?> oldModel) {
        EmployeeVacancyClp oldClpModel = (EmployeeVacancyClp) oldModel;

        BaseModel<?> newModel = oldClpModel.getEmployeeVacancyRemoteModel();

        newModel.setModelAttributes(oldClpModel.getModelAttributes());

        return newModel;
    }

    public static Object translateInputFileAttachment(BaseModel<?> oldModel) {
        FileAttachmentClp oldClpModel = (FileAttachmentClp) oldModel;

        BaseModel<?> newModel = oldClpModel.getFileAttachmentRemoteModel();

        newModel.setModelAttributes(oldClpModel.getModelAttributes());

        return newModel;
    }

    public static Object translateInputInterview(BaseModel<?> oldModel) {
        InterviewClp oldClpModel = (InterviewClp) oldModel;

        BaseModel<?> newModel = oldClpModel.getInterviewRemoteModel();

        newModel.setModelAttributes(oldClpModel.getModelAttributes());

        return newModel;
    }

    public static Object translateInputInterviewSchedule(BaseModel<?> oldModel) {
        InterviewScheduleClp oldClpModel = (InterviewScheduleClp) oldModel;

        BaseModel<?> newModel = oldClpModel.getInterviewScheduleRemoteModel();

        newModel.setModelAttributes(oldClpModel.getModelAttributes());

        return newModel;
    }

    public static Object translateInputJTitle(BaseModel<?> oldModel) {
        JTitleClp oldClpModel = (JTitleClp) oldModel;

        BaseModel<?> newModel = oldClpModel.getJTitleRemoteModel();

        newModel.setModelAttributes(oldClpModel.getModelAttributes());

        return newModel;
    }

    public static Object translateInputLocation(BaseModel<?> oldModel) {
        LocationClp oldClpModel = (LocationClp) oldModel;

        BaseModel<?> newModel = oldClpModel.getLocationRemoteModel();

        newModel.setModelAttributes(oldClpModel.getModelAttributes());

        return newModel;
    }

    public static Object translateInputSubUnit(BaseModel<?> oldModel) {
        SubUnitClp oldClpModel = (SubUnitClp) oldModel;

        BaseModel<?> newModel = oldClpModel.getSubUnitRemoteModel();

        newModel.setModelAttributes(oldClpModel.getModelAttributes());

        return newModel;
    }

    public static Object translateInputUniversity(BaseModel<?> oldModel) {
        UniversityClp oldClpModel = (UniversityClp) oldModel;

        BaseModel<?> newModel = oldClpModel.getUniversityRemoteModel();

        newModel.setModelAttributes(oldClpModel.getModelAttributes());

        return newModel;
    }

    public static Object translateInputVacancy(BaseModel<?> oldModel) {
        VacancyClp oldClpModel = (VacancyClp) oldModel;

        BaseModel<?> newModel = oldClpModel.getVacancyRemoteModel();

        newModel.setModelAttributes(oldClpModel.getModelAttributes());

        return newModel;
    }

    public static Object translateInputVacancyCandidate(BaseModel<?> oldModel) {
        VacancyCandidateClp oldClpModel = (VacancyCandidateClp) oldModel;

        BaseModel<?> newModel = oldClpModel.getVacancyCandidateRemoteModel();

        newModel.setModelAttributes(oldClpModel.getModelAttributes());

        return newModel;
    }

    public static Object translateInput(Object obj) {
        if (obj instanceof BaseModel<?>) {
            return translateInput((BaseModel<?>) obj);
        } else if (obj instanceof List<?>) {
            return translateInput((List<Object>) obj);
        } else {
            return obj;
        }
    }

    public static Object translateOutput(BaseModel<?> oldModel) {
        Class<?> oldModelClass = oldModel.getClass();

        String oldModelClassName = oldModelClass.getName();

        if (oldModelClassName.equals(
                    "vn.com.ecopharma.hrm.model.impl.CandidateImpl")) {
            return translateOutputCandidate(oldModel);
        } else if (oldModelClassName.endsWith("Clp")) {
            try {
                ClassLoader classLoader = ClpSerializer.class.getClassLoader();

                Method getClpSerializerClassMethod = oldModelClass.getMethod(
                        "getClpSerializerClass");

                Class<?> oldClpSerializerClass = (Class<?>) getClpSerializerClassMethod.invoke(oldModel);

                Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

                Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
                        BaseModel.class);

                Class<?> oldModelModelClass = oldModel.getModelClass();

                Method getRemoteModelMethod = oldModelClass.getMethod("get" +
                        oldModelModelClass.getSimpleName() + "RemoteModel");

                Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

                BaseModel<?> newModel = (BaseModel<?>) translateOutputMethod.invoke(null,
                        oldRemoteModel);

                return newModel;
            } catch (Throwable t) {
                if (_log.isInfoEnabled()) {
                    _log.info("Unable to translate " + oldModelClassName, t);
                }
            }
        }

        if (oldModelClassName.equals(
                    "vn.com.ecopharma.hrm.model.impl.CandidateHistoryImpl")) {
            return translateOutputCandidateHistory(oldModel);
        } else if (oldModelClassName.endsWith("Clp")) {
            try {
                ClassLoader classLoader = ClpSerializer.class.getClassLoader();

                Method getClpSerializerClassMethod = oldModelClass.getMethod(
                        "getClpSerializerClass");

                Class<?> oldClpSerializerClass = (Class<?>) getClpSerializerClassMethod.invoke(oldModel);

                Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

                Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
                        BaseModel.class);

                Class<?> oldModelModelClass = oldModel.getModelClass();

                Method getRemoteModelMethod = oldModelClass.getMethod("get" +
                        oldModelModelClass.getSimpleName() + "RemoteModel");

                Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

                BaseModel<?> newModel = (BaseModel<?>) translateOutputMethod.invoke(null,
                        oldRemoteModel);

                return newModel;
            } catch (Throwable t) {
                if (_log.isInfoEnabled()) {
                    _log.info("Unable to translate " + oldModelClassName, t);
                }
            }
        }

        if (oldModelClassName.equals(
                    "vn.com.ecopharma.hrm.model.impl.EmployeeImpl")) {
            return translateOutputEmployee(oldModel);
        } else if (oldModelClassName.endsWith("Clp")) {
            try {
                ClassLoader classLoader = ClpSerializer.class.getClassLoader();

                Method getClpSerializerClassMethod = oldModelClass.getMethod(
                        "getClpSerializerClass");

                Class<?> oldClpSerializerClass = (Class<?>) getClpSerializerClassMethod.invoke(oldModel);

                Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

                Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
                        BaseModel.class);

                Class<?> oldModelModelClass = oldModel.getModelClass();

                Method getRemoteModelMethod = oldModelClass.getMethod("get" +
                        oldModelModelClass.getSimpleName() + "RemoteModel");

                Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

                BaseModel<?> newModel = (BaseModel<?>) translateOutputMethod.invoke(null,
                        oldRemoteModel);

                return newModel;
            } catch (Throwable t) {
                if (_log.isInfoEnabled()) {
                    _log.info("Unable to translate " + oldModelClassName, t);
                }
            }
        }

        if (oldModelClassName.equals(
                    "vn.com.ecopharma.hrm.model.impl.EmployeeInterviewScheduleImpl")) {
            return translateOutputEmployeeInterviewSchedule(oldModel);
        } else if (oldModelClassName.endsWith("Clp")) {
            try {
                ClassLoader classLoader = ClpSerializer.class.getClassLoader();

                Method getClpSerializerClassMethod = oldModelClass.getMethod(
                        "getClpSerializerClass");

                Class<?> oldClpSerializerClass = (Class<?>) getClpSerializerClassMethod.invoke(oldModel);

                Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

                Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
                        BaseModel.class);

                Class<?> oldModelModelClass = oldModel.getModelClass();

                Method getRemoteModelMethod = oldModelClass.getMethod("get" +
                        oldModelModelClass.getSimpleName() + "RemoteModel");

                Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

                BaseModel<?> newModel = (BaseModel<?>) translateOutputMethod.invoke(null,
                        oldRemoteModel);

                return newModel;
            } catch (Throwable t) {
                if (_log.isInfoEnabled()) {
                    _log.info("Unable to translate " + oldModelClassName, t);
                }
            }
        }

        if (oldModelClassName.equals(
                    "vn.com.ecopharma.hrm.model.impl.EmployeeVacancyImpl")) {
            return translateOutputEmployeeVacancy(oldModel);
        } else if (oldModelClassName.endsWith("Clp")) {
            try {
                ClassLoader classLoader = ClpSerializer.class.getClassLoader();

                Method getClpSerializerClassMethod = oldModelClass.getMethod(
                        "getClpSerializerClass");

                Class<?> oldClpSerializerClass = (Class<?>) getClpSerializerClassMethod.invoke(oldModel);

                Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

                Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
                        BaseModel.class);

                Class<?> oldModelModelClass = oldModel.getModelClass();

                Method getRemoteModelMethod = oldModelClass.getMethod("get" +
                        oldModelModelClass.getSimpleName() + "RemoteModel");

                Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

                BaseModel<?> newModel = (BaseModel<?>) translateOutputMethod.invoke(null,
                        oldRemoteModel);

                return newModel;
            } catch (Throwable t) {
                if (_log.isInfoEnabled()) {
                    _log.info("Unable to translate " + oldModelClassName, t);
                }
            }
        }

        if (oldModelClassName.equals(
                    "vn.com.ecopharma.hrm.model.impl.FileAttachmentImpl")) {
            return translateOutputFileAttachment(oldModel);
        } else if (oldModelClassName.endsWith("Clp")) {
            try {
                ClassLoader classLoader = ClpSerializer.class.getClassLoader();

                Method getClpSerializerClassMethod = oldModelClass.getMethod(
                        "getClpSerializerClass");

                Class<?> oldClpSerializerClass = (Class<?>) getClpSerializerClassMethod.invoke(oldModel);

                Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

                Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
                        BaseModel.class);

                Class<?> oldModelModelClass = oldModel.getModelClass();

                Method getRemoteModelMethod = oldModelClass.getMethod("get" +
                        oldModelModelClass.getSimpleName() + "RemoteModel");

                Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

                BaseModel<?> newModel = (BaseModel<?>) translateOutputMethod.invoke(null,
                        oldRemoteModel);

                return newModel;
            } catch (Throwable t) {
                if (_log.isInfoEnabled()) {
                    _log.info("Unable to translate " + oldModelClassName, t);
                }
            }
        }

        if (oldModelClassName.equals(
                    "vn.com.ecopharma.hrm.model.impl.InterviewImpl")) {
            return translateOutputInterview(oldModel);
        } else if (oldModelClassName.endsWith("Clp")) {
            try {
                ClassLoader classLoader = ClpSerializer.class.getClassLoader();

                Method getClpSerializerClassMethod = oldModelClass.getMethod(
                        "getClpSerializerClass");

                Class<?> oldClpSerializerClass = (Class<?>) getClpSerializerClassMethod.invoke(oldModel);

                Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

                Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
                        BaseModel.class);

                Class<?> oldModelModelClass = oldModel.getModelClass();

                Method getRemoteModelMethod = oldModelClass.getMethod("get" +
                        oldModelModelClass.getSimpleName() + "RemoteModel");

                Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

                BaseModel<?> newModel = (BaseModel<?>) translateOutputMethod.invoke(null,
                        oldRemoteModel);

                return newModel;
            } catch (Throwable t) {
                if (_log.isInfoEnabled()) {
                    _log.info("Unable to translate " + oldModelClassName, t);
                }
            }
        }

        if (oldModelClassName.equals(
                    "vn.com.ecopharma.hrm.model.impl.InterviewScheduleImpl")) {
            return translateOutputInterviewSchedule(oldModel);
        } else if (oldModelClassName.endsWith("Clp")) {
            try {
                ClassLoader classLoader = ClpSerializer.class.getClassLoader();

                Method getClpSerializerClassMethod = oldModelClass.getMethod(
                        "getClpSerializerClass");

                Class<?> oldClpSerializerClass = (Class<?>) getClpSerializerClassMethod.invoke(oldModel);

                Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

                Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
                        BaseModel.class);

                Class<?> oldModelModelClass = oldModel.getModelClass();

                Method getRemoteModelMethod = oldModelClass.getMethod("get" +
                        oldModelModelClass.getSimpleName() + "RemoteModel");

                Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

                BaseModel<?> newModel = (BaseModel<?>) translateOutputMethod.invoke(null,
                        oldRemoteModel);

                return newModel;
            } catch (Throwable t) {
                if (_log.isInfoEnabled()) {
                    _log.info("Unable to translate " + oldModelClassName, t);
                }
            }
        }

        if (oldModelClassName.equals(
                    "vn.com.ecopharma.hrm.model.impl.JTitleImpl")) {
            return translateOutputJTitle(oldModel);
        } else if (oldModelClassName.endsWith("Clp")) {
            try {
                ClassLoader classLoader = ClpSerializer.class.getClassLoader();

                Method getClpSerializerClassMethod = oldModelClass.getMethod(
                        "getClpSerializerClass");

                Class<?> oldClpSerializerClass = (Class<?>) getClpSerializerClassMethod.invoke(oldModel);

                Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

                Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
                        BaseModel.class);

                Class<?> oldModelModelClass = oldModel.getModelClass();

                Method getRemoteModelMethod = oldModelClass.getMethod("get" +
                        oldModelModelClass.getSimpleName() + "RemoteModel");

                Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

                BaseModel<?> newModel = (BaseModel<?>) translateOutputMethod.invoke(null,
                        oldRemoteModel);

                return newModel;
            } catch (Throwable t) {
                if (_log.isInfoEnabled()) {
                    _log.info("Unable to translate " + oldModelClassName, t);
                }
            }
        }

        if (oldModelClassName.equals(
                    "vn.com.ecopharma.hrm.model.impl.LocationImpl")) {
            return translateOutputLocation(oldModel);
        } else if (oldModelClassName.endsWith("Clp")) {
            try {
                ClassLoader classLoader = ClpSerializer.class.getClassLoader();

                Method getClpSerializerClassMethod = oldModelClass.getMethod(
                        "getClpSerializerClass");

                Class<?> oldClpSerializerClass = (Class<?>) getClpSerializerClassMethod.invoke(oldModel);

                Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

                Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
                        BaseModel.class);

                Class<?> oldModelModelClass = oldModel.getModelClass();

                Method getRemoteModelMethod = oldModelClass.getMethod("get" +
                        oldModelModelClass.getSimpleName() + "RemoteModel");

                Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

                BaseModel<?> newModel = (BaseModel<?>) translateOutputMethod.invoke(null,
                        oldRemoteModel);

                return newModel;
            } catch (Throwable t) {
                if (_log.isInfoEnabled()) {
                    _log.info("Unable to translate " + oldModelClassName, t);
                }
            }
        }

        if (oldModelClassName.equals(
                    "vn.com.ecopharma.hrm.model.impl.SubUnitImpl")) {
            return translateOutputSubUnit(oldModel);
        } else if (oldModelClassName.endsWith("Clp")) {
            try {
                ClassLoader classLoader = ClpSerializer.class.getClassLoader();

                Method getClpSerializerClassMethod = oldModelClass.getMethod(
                        "getClpSerializerClass");

                Class<?> oldClpSerializerClass = (Class<?>) getClpSerializerClassMethod.invoke(oldModel);

                Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

                Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
                        BaseModel.class);

                Class<?> oldModelModelClass = oldModel.getModelClass();

                Method getRemoteModelMethod = oldModelClass.getMethod("get" +
                        oldModelModelClass.getSimpleName() + "RemoteModel");

                Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

                BaseModel<?> newModel = (BaseModel<?>) translateOutputMethod.invoke(null,
                        oldRemoteModel);

                return newModel;
            } catch (Throwable t) {
                if (_log.isInfoEnabled()) {
                    _log.info("Unable to translate " + oldModelClassName, t);
                }
            }
        }

        if (oldModelClassName.equals(
                    "vn.com.ecopharma.hrm.model.impl.UniversityImpl")) {
            return translateOutputUniversity(oldModel);
        } else if (oldModelClassName.endsWith("Clp")) {
            try {
                ClassLoader classLoader = ClpSerializer.class.getClassLoader();

                Method getClpSerializerClassMethod = oldModelClass.getMethod(
                        "getClpSerializerClass");

                Class<?> oldClpSerializerClass = (Class<?>) getClpSerializerClassMethod.invoke(oldModel);

                Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

                Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
                        BaseModel.class);

                Class<?> oldModelModelClass = oldModel.getModelClass();

                Method getRemoteModelMethod = oldModelClass.getMethod("get" +
                        oldModelModelClass.getSimpleName() + "RemoteModel");

                Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

                BaseModel<?> newModel = (BaseModel<?>) translateOutputMethod.invoke(null,
                        oldRemoteModel);

                return newModel;
            } catch (Throwable t) {
                if (_log.isInfoEnabled()) {
                    _log.info("Unable to translate " + oldModelClassName, t);
                }
            }
        }

        if (oldModelClassName.equals(
                    "vn.com.ecopharma.hrm.model.impl.VacancyImpl")) {
            return translateOutputVacancy(oldModel);
        } else if (oldModelClassName.endsWith("Clp")) {
            try {
                ClassLoader classLoader = ClpSerializer.class.getClassLoader();

                Method getClpSerializerClassMethod = oldModelClass.getMethod(
                        "getClpSerializerClass");

                Class<?> oldClpSerializerClass = (Class<?>) getClpSerializerClassMethod.invoke(oldModel);

                Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

                Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
                        BaseModel.class);

                Class<?> oldModelModelClass = oldModel.getModelClass();

                Method getRemoteModelMethod = oldModelClass.getMethod("get" +
                        oldModelModelClass.getSimpleName() + "RemoteModel");

                Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

                BaseModel<?> newModel = (BaseModel<?>) translateOutputMethod.invoke(null,
                        oldRemoteModel);

                return newModel;
            } catch (Throwable t) {
                if (_log.isInfoEnabled()) {
                    _log.info("Unable to translate " + oldModelClassName, t);
                }
            }
        }

        if (oldModelClassName.equals(
                    "vn.com.ecopharma.hrm.model.impl.VacancyCandidateImpl")) {
            return translateOutputVacancyCandidate(oldModel);
        } else if (oldModelClassName.endsWith("Clp")) {
            try {
                ClassLoader classLoader = ClpSerializer.class.getClassLoader();

                Method getClpSerializerClassMethod = oldModelClass.getMethod(
                        "getClpSerializerClass");

                Class<?> oldClpSerializerClass = (Class<?>) getClpSerializerClassMethod.invoke(oldModel);

                Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

                Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
                        BaseModel.class);

                Class<?> oldModelModelClass = oldModel.getModelClass();

                Method getRemoteModelMethod = oldModelClass.getMethod("get" +
                        oldModelModelClass.getSimpleName() + "RemoteModel");

                Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

                BaseModel<?> newModel = (BaseModel<?>) translateOutputMethod.invoke(null,
                        oldRemoteModel);

                return newModel;
            } catch (Throwable t) {
                if (_log.isInfoEnabled()) {
                    _log.info("Unable to translate " + oldModelClassName, t);
                }
            }
        }

        return oldModel;
    }

    public static Object translateOutput(List<Object> oldList) {
        List<Object> newList = new ArrayList<Object>(oldList.size());

        for (int i = 0; i < oldList.size(); i++) {
            Object curObj = oldList.get(i);

            newList.add(translateOutput(curObj));
        }

        return newList;
    }

    public static Object translateOutput(Object obj) {
        if (obj instanceof BaseModel<?>) {
            return translateOutput((BaseModel<?>) obj);
        } else if (obj instanceof List<?>) {
            return translateOutput((List<Object>) obj);
        } else {
            return obj;
        }
    }

    public static Throwable translateThrowable(Throwable throwable) {
        if (_useReflectionToTranslateThrowable) {
            try {
                UnsyncByteArrayOutputStream unsyncByteArrayOutputStream = new UnsyncByteArrayOutputStream();
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(unsyncByteArrayOutputStream);

                objectOutputStream.writeObject(throwable);

                objectOutputStream.flush();
                objectOutputStream.close();

                UnsyncByteArrayInputStream unsyncByteArrayInputStream = new UnsyncByteArrayInputStream(unsyncByteArrayOutputStream.unsafeGetByteArray(),
                        0, unsyncByteArrayOutputStream.size());

                Thread currentThread = Thread.currentThread();

                ClassLoader contextClassLoader = currentThread.getContextClassLoader();

                ObjectInputStream objectInputStream = new ClassLoaderObjectInputStream(unsyncByteArrayInputStream,
                        contextClassLoader);

                throwable = (Throwable) objectInputStream.readObject();

                objectInputStream.close();

                return throwable;
            } catch (SecurityException se) {
                if (_log.isInfoEnabled()) {
                    _log.info("Do not use reflection to translate throwable");
                }

                _useReflectionToTranslateThrowable = false;
            } catch (Throwable throwable2) {
                _log.error(throwable2, throwable2);

                return throwable2;
            }
        }

        Class<?> clazz = throwable.getClass();

        String className = clazz.getName();

        if (className.equals(PortalException.class.getName())) {
            return new PortalException();
        }

        if (className.equals(SystemException.class.getName())) {
            return new SystemException();
        }

        if (className.equals("vn.com.ecopharma.hrm.NoSuchCandidateException")) {
            return new vn.com.ecopharma.hrm.NoSuchCandidateException();
        }

        if (className.equals(
                    "vn.com.ecopharma.hrm.NoSuchCandidateHistoryException")) {
            return new vn.com.ecopharma.hrm.NoSuchCandidateHistoryException();
        }

        if (className.equals("vn.com.ecopharma.hrm.NoSuchEmployeeException")) {
            return new vn.com.ecopharma.hrm.NoSuchEmployeeException();
        }

        if (className.equals(
                    "vn.com.ecopharma.hrm.NoSuchEmployeeInterviewScheduleException")) {
            return new vn.com.ecopharma.hrm.NoSuchEmployeeInterviewScheduleException();
        }

        if (className.equals(
                    "vn.com.ecopharma.hrm.NoSuchEmployeeVacancyException")) {
            return new vn.com.ecopharma.hrm.NoSuchEmployeeVacancyException();
        }

        if (className.equals(
                    "vn.com.ecopharma.hrm.NoSuchFileAttachmentException")) {
            return new vn.com.ecopharma.hrm.NoSuchFileAttachmentException();
        }

        if (className.equals("vn.com.ecopharma.hrm.NoSuchInterviewException")) {
            return new vn.com.ecopharma.hrm.NoSuchInterviewException();
        }

        if (className.equals(
                    "vn.com.ecopharma.hrm.NoSuchInterviewScheduleException")) {
            return new vn.com.ecopharma.hrm.NoSuchInterviewScheduleException();
        }

        if (className.equals("vn.com.ecopharma.hrm.NoSuchJTitleException")) {
            return new vn.com.ecopharma.hrm.NoSuchJTitleException();
        }

        if (className.equals("vn.com.ecopharma.hrm.NoSuchLocationException")) {
            return new vn.com.ecopharma.hrm.NoSuchLocationException();
        }

        if (className.equals("vn.com.ecopharma.hrm.NoSuchSubUnitException")) {
            return new vn.com.ecopharma.hrm.NoSuchSubUnitException();
        }

        if (className.equals("vn.com.ecopharma.hrm.NoSuchUniversityException")) {
            return new vn.com.ecopharma.hrm.NoSuchUniversityException();
        }

        if (className.equals("vn.com.ecopharma.hrm.NoSuchVacancyException")) {
            return new vn.com.ecopharma.hrm.NoSuchVacancyException();
        }

        if (className.equals(
                    "vn.com.ecopharma.hrm.NoSuchVacancyCandidateException")) {
            return new vn.com.ecopharma.hrm.NoSuchVacancyCandidateException();
        }

        return throwable;
    }

    public static Object translateOutputCandidate(BaseModel<?> oldModel) {
        CandidateClp newModel = new CandidateClp();

        newModel.setModelAttributes(oldModel.getModelAttributes());

        newModel.setCandidateRemoteModel(oldModel);

        return newModel;
    }

    public static Object translateOutputCandidateHistory(BaseModel<?> oldModel) {
        CandidateHistoryClp newModel = new CandidateHistoryClp();

        newModel.setModelAttributes(oldModel.getModelAttributes());

        newModel.setCandidateHistoryRemoteModel(oldModel);

        return newModel;
    }

    public static Object translateOutputEmployee(BaseModel<?> oldModel) {
        EmployeeClp newModel = new EmployeeClp();

        newModel.setModelAttributes(oldModel.getModelAttributes());

        newModel.setEmployeeRemoteModel(oldModel);

        return newModel;
    }

    public static Object translateOutputEmployeeInterviewSchedule(
        BaseModel<?> oldModel) {
        EmployeeInterviewScheduleClp newModel = new EmployeeInterviewScheduleClp();

        newModel.setModelAttributes(oldModel.getModelAttributes());

        newModel.setEmployeeInterviewScheduleRemoteModel(oldModel);

        return newModel;
    }

    public static Object translateOutputEmployeeVacancy(BaseModel<?> oldModel) {
        EmployeeVacancyClp newModel = new EmployeeVacancyClp();

        newModel.setModelAttributes(oldModel.getModelAttributes());

        newModel.setEmployeeVacancyRemoteModel(oldModel);

        return newModel;
    }

    public static Object translateOutputFileAttachment(BaseModel<?> oldModel) {
        FileAttachmentClp newModel = new FileAttachmentClp();

        newModel.setModelAttributes(oldModel.getModelAttributes());

        newModel.setFileAttachmentRemoteModel(oldModel);

        return newModel;
    }

    public static Object translateOutputInterview(BaseModel<?> oldModel) {
        InterviewClp newModel = new InterviewClp();

        newModel.setModelAttributes(oldModel.getModelAttributes());

        newModel.setInterviewRemoteModel(oldModel);

        return newModel;
    }

    public static Object translateOutputInterviewSchedule(BaseModel<?> oldModel) {
        InterviewScheduleClp newModel = new InterviewScheduleClp();

        newModel.setModelAttributes(oldModel.getModelAttributes());

        newModel.setInterviewScheduleRemoteModel(oldModel);

        return newModel;
    }

    public static Object translateOutputJTitle(BaseModel<?> oldModel) {
        JTitleClp newModel = new JTitleClp();

        newModel.setModelAttributes(oldModel.getModelAttributes());

        newModel.setJTitleRemoteModel(oldModel);

        return newModel;
    }

    public static Object translateOutputLocation(BaseModel<?> oldModel) {
        LocationClp newModel = new LocationClp();

        newModel.setModelAttributes(oldModel.getModelAttributes());

        newModel.setLocationRemoteModel(oldModel);

        return newModel;
    }

    public static Object translateOutputSubUnit(BaseModel<?> oldModel) {
        SubUnitClp newModel = new SubUnitClp();

        newModel.setModelAttributes(oldModel.getModelAttributes());

        newModel.setSubUnitRemoteModel(oldModel);

        return newModel;
    }

    public static Object translateOutputUniversity(BaseModel<?> oldModel) {
        UniversityClp newModel = new UniversityClp();

        newModel.setModelAttributes(oldModel.getModelAttributes());

        newModel.setUniversityRemoteModel(oldModel);

        return newModel;
    }

    public static Object translateOutputVacancy(BaseModel<?> oldModel) {
        VacancyClp newModel = new VacancyClp();

        newModel.setModelAttributes(oldModel.getModelAttributes());

        newModel.setVacancyRemoteModel(oldModel);

        return newModel;
    }

    public static Object translateOutputVacancyCandidate(BaseModel<?> oldModel) {
        VacancyCandidateClp newModel = new VacancyCandidateClp();

        newModel.setModelAttributes(oldModel.getModelAttributes());

        newModel.setVacancyCandidateRemoteModel(oldModel);

        return newModel;
    }
}
