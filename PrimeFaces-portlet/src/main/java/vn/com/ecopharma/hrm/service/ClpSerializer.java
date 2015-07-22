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
import vn.com.ecopharma.hrm.model.DistrictClp;
import vn.com.ecopharma.hrm.model.EmployeeClp;
import vn.com.ecopharma.hrm.model.Employee_Titles_HistoryClp;
import vn.com.ecopharma.hrm.model.JTitleClp;
import vn.com.ecopharma.hrm.model.LevelClp;
import vn.com.ecopharma.hrm.model.SubUnitClp;
import vn.com.ecopharma.hrm.model.TitlesClp;
import vn.com.ecopharma.hrm.model.UniversityClp;

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
                        "PrimeFaces-portlet-deployment-context");

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
                            "PrimeFaces-portlet-deployment-context");

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
                _servletContextName = "PrimeFaces-portlet";
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

        if (oldModelClassName.equals(DistrictClp.class.getName())) {
            return translateInputDistrict(oldModel);
        }

        if (oldModelClassName.equals(EmployeeClp.class.getName())) {
            return translateInputEmployee(oldModel);
        }

        if (oldModelClassName.equals(Employee_Titles_HistoryClp.class.getName())) {
            return translateInputEmployee_Titles_History(oldModel);
        }

        if (oldModelClassName.equals(JTitleClp.class.getName())) {
            return translateInputJTitle(oldModel);
        }

        if (oldModelClassName.equals(LevelClp.class.getName())) {
            return translateInputLevel(oldModel);
        }

        if (oldModelClassName.equals(SubUnitClp.class.getName())) {
            return translateInputSubUnit(oldModel);
        }

        if (oldModelClassName.equals(TitlesClp.class.getName())) {
            return translateInputTitles(oldModel);
        }

        if (oldModelClassName.equals(UniversityClp.class.getName())) {
            return translateInputUniversity(oldModel);
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

    public static Object translateInputDistrict(BaseModel<?> oldModel) {
        DistrictClp oldClpModel = (DistrictClp) oldModel;

        BaseModel<?> newModel = oldClpModel.getDistrictRemoteModel();

        newModel.setModelAttributes(oldClpModel.getModelAttributes());

        return newModel;
    }

    public static Object translateInputEmployee(BaseModel<?> oldModel) {
        EmployeeClp oldClpModel = (EmployeeClp) oldModel;

        BaseModel<?> newModel = oldClpModel.getEmployeeRemoteModel();

        newModel.setModelAttributes(oldClpModel.getModelAttributes());

        return newModel;
    }

    public static Object translateInputEmployee_Titles_History(
        BaseModel<?> oldModel) {
        Employee_Titles_HistoryClp oldClpModel = (Employee_Titles_HistoryClp) oldModel;

        BaseModel<?> newModel = oldClpModel.getEmployee_Titles_HistoryRemoteModel();

        newModel.setModelAttributes(oldClpModel.getModelAttributes());

        return newModel;
    }

    public static Object translateInputJTitle(BaseModel<?> oldModel) {
        JTitleClp oldClpModel = (JTitleClp) oldModel;

        BaseModel<?> newModel = oldClpModel.getJTitleRemoteModel();

        newModel.setModelAttributes(oldClpModel.getModelAttributes());

        return newModel;
    }

    public static Object translateInputLevel(BaseModel<?> oldModel) {
        LevelClp oldClpModel = (LevelClp) oldModel;

        BaseModel<?> newModel = oldClpModel.getLevelRemoteModel();

        newModel.setModelAttributes(oldClpModel.getModelAttributes());

        return newModel;
    }

    public static Object translateInputSubUnit(BaseModel<?> oldModel) {
        SubUnitClp oldClpModel = (SubUnitClp) oldModel;

        BaseModel<?> newModel = oldClpModel.getSubUnitRemoteModel();

        newModel.setModelAttributes(oldClpModel.getModelAttributes());

        return newModel;
    }

    public static Object translateInputTitles(BaseModel<?> oldModel) {
        TitlesClp oldClpModel = (TitlesClp) oldModel;

        BaseModel<?> newModel = oldClpModel.getTitlesRemoteModel();

        newModel.setModelAttributes(oldClpModel.getModelAttributes());

        return newModel;
    }

    public static Object translateInputUniversity(BaseModel<?> oldModel) {
        UniversityClp oldClpModel = (UniversityClp) oldModel;

        BaseModel<?> newModel = oldClpModel.getUniversityRemoteModel();

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
                    "vn.com.ecopharma.hrm.model.impl.DistrictImpl")) {
            return translateOutputDistrict(oldModel);
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
                    "vn.com.ecopharma.hrm.model.impl.Employee_Titles_HistoryImpl")) {
            return translateOutputEmployee_Titles_History(oldModel);
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
                    "vn.com.ecopharma.hrm.model.impl.LevelImpl")) {
            return translateOutputLevel(oldModel);
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
                    "vn.com.ecopharma.hrm.model.impl.TitlesImpl")) {
            return translateOutputTitles(oldModel);
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

        if (className.equals("vn.com.ecopharma.hrm.NoSuchDistrictException")) {
            return new vn.com.ecopharma.hrm.NoSuchDistrictException();
        }

        if (className.equals("vn.com.ecopharma.hrm.NoSuchEmployeeException")) {
            return new vn.com.ecopharma.hrm.NoSuchEmployeeException();
        }

        if (className.equals(
                    "vn.com.ecopharma.hrm.NoSuchEmployee_Titles_HistoryException")) {
            return new vn.com.ecopharma.hrm.NoSuchEmployee_Titles_HistoryException();
        }

        if (className.equals("vn.com.ecopharma.hrm.NoSuchJTitleException")) {
            return new vn.com.ecopharma.hrm.NoSuchJTitleException();
        }

        if (className.equals("vn.com.ecopharma.hrm.NoSuchLevelException")) {
            return new vn.com.ecopharma.hrm.NoSuchLevelException();
        }

        if (className.equals("vn.com.ecopharma.hrm.NoSuchSubUnitException")) {
            return new vn.com.ecopharma.hrm.NoSuchSubUnitException();
        }

        if (className.equals("vn.com.ecopharma.hrm.NoSuchTitlesException")) {
            return new vn.com.ecopharma.hrm.NoSuchTitlesException();
        }

        if (className.equals("vn.com.ecopharma.hrm.NoSuchUniversityException")) {
            return new vn.com.ecopharma.hrm.NoSuchUniversityException();
        }

        return throwable;
    }

    public static Object translateOutputCandidate(BaseModel<?> oldModel) {
        CandidateClp newModel = new CandidateClp();

        newModel.setModelAttributes(oldModel.getModelAttributes());

        newModel.setCandidateRemoteModel(oldModel);

        return newModel;
    }

    public static Object translateOutputDistrict(BaseModel<?> oldModel) {
        DistrictClp newModel = new DistrictClp();

        newModel.setModelAttributes(oldModel.getModelAttributes());

        newModel.setDistrictRemoteModel(oldModel);

        return newModel;
    }

    public static Object translateOutputEmployee(BaseModel<?> oldModel) {
        EmployeeClp newModel = new EmployeeClp();

        newModel.setModelAttributes(oldModel.getModelAttributes());

        newModel.setEmployeeRemoteModel(oldModel);

        return newModel;
    }

    public static Object translateOutputEmployee_Titles_History(
        BaseModel<?> oldModel) {
        Employee_Titles_HistoryClp newModel = new Employee_Titles_HistoryClp();

        newModel.setModelAttributes(oldModel.getModelAttributes());

        newModel.setEmployee_Titles_HistoryRemoteModel(oldModel);

        return newModel;
    }

    public static Object translateOutputJTitle(BaseModel<?> oldModel) {
        JTitleClp newModel = new JTitleClp();

        newModel.setModelAttributes(oldModel.getModelAttributes());

        newModel.setJTitleRemoteModel(oldModel);

        return newModel;
    }

    public static Object translateOutputLevel(BaseModel<?> oldModel) {
        LevelClp newModel = new LevelClp();

        newModel.setModelAttributes(oldModel.getModelAttributes());

        newModel.setLevelRemoteModel(oldModel);

        return newModel;
    }

    public static Object translateOutputSubUnit(BaseModel<?> oldModel) {
        SubUnitClp newModel = new SubUnitClp();

        newModel.setModelAttributes(oldModel.getModelAttributes());

        newModel.setSubUnitRemoteModel(oldModel);

        return newModel;
    }

    public static Object translateOutputTitles(BaseModel<?> oldModel) {
        TitlesClp newModel = new TitlesClp();

        newModel.setModelAttributes(oldModel.getModelAttributes());

        newModel.setTitlesRemoteModel(oldModel);

        return newModel;
    }

    public static Object translateOutputUniversity(BaseModel<?> oldModel) {
        UniversityClp newModel = new UniversityClp();

        newModel.setModelAttributes(oldModel.getModelAttributes());

        newModel.setUniversityRemoteModel(oldModel);

        return newModel;
    }
}
