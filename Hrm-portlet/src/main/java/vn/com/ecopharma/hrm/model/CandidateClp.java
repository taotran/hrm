package vn.com.ecopharma.hrm.model;

import com.liferay.portal.NoSuchModelException;
import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.trash.TrashHandler;
import com.liferay.portal.kernel.trash.TrashHandlerRegistryUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.workflow.WorkflowConstants;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.ContainerModel;
import com.liferay.portal.model.TrashedModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import com.liferay.portlet.trash.model.TrashEntry;
import com.liferay.portlet.trash.service.TrashEntryLocalServiceUtil;

import vn.com.ecopharma.hrm.service.CandidateLocalServiceUtil;
import vn.com.ecopharma.hrm.service.ClpSerializer;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;


public class CandidateClp extends BaseModelImpl<Candidate> implements Candidate {
    private long _c_id;
    private String _first_name;
    private String _middle_name;
    private String _last_name;
    private String _email;
    private String _contact_number;
    private String _comment;
    private int _mode_of_application;
    private Date _date_of_application;
    private long _cv_file_id;
    private String _cv_text_version;
    private String _keywords;
    private int _added_person;
    private long _user_id;
    private long _group_id;
    private BaseModel<?> _candidateRemoteModel;
    private Class<?> _clpSerializerClass = vn.com.ecopharma.hrm.service.ClpSerializer.class;

    public CandidateClp() {
    }

    @Override
    public Class<?> getModelClass() {
        return Candidate.class;
    }

    @Override
    public String getModelClassName() {
        return Candidate.class.getName();
    }

    @Override
    public long getPrimaryKey() {
        return _c_id;
    }

    @Override
    public void setPrimaryKey(long primaryKey) {
        setC_id(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _c_id;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Long) primaryKeyObj).longValue());
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("c_id", getC_id());
        attributes.put("first_name", getFirst_name());
        attributes.put("middle_name", getMiddle_name());
        attributes.put("last_name", getLast_name());
        attributes.put("email", getEmail());
        attributes.put("contact_number", getContact_number());
        attributes.put("comment", getComment());
        attributes.put("mode_of_application", getMode_of_application());
        attributes.put("date_of_application", getDate_of_application());
        attributes.put("cv_file_id", getCv_file_id());
        attributes.put("cv_text_version", getCv_text_version());
        attributes.put("keywords", getKeywords());
        attributes.put("added_person", getAdded_person());
        attributes.put("user_id", getUser_id());
        attributes.put("group_id", getGroup_id());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long c_id = (Long) attributes.get("c_id");

        if (c_id != null) {
            setC_id(c_id);
        }

        String first_name = (String) attributes.get("first_name");

        if (first_name != null) {
            setFirst_name(first_name);
        }

        String middle_name = (String) attributes.get("middle_name");

        if (middle_name != null) {
            setMiddle_name(middle_name);
        }

        String last_name = (String) attributes.get("last_name");

        if (last_name != null) {
            setLast_name(last_name);
        }

        String email = (String) attributes.get("email");

        if (email != null) {
            setEmail(email);
        }

        String contact_number = (String) attributes.get("contact_number");

        if (contact_number != null) {
            setContact_number(contact_number);
        }

        String comment = (String) attributes.get("comment");

        if (comment != null) {
            setComment(comment);
        }

        Integer mode_of_application = (Integer) attributes.get(
                "mode_of_application");

        if (mode_of_application != null) {
            setMode_of_application(mode_of_application);
        }

        Date date_of_application = (Date) attributes.get("date_of_application");

        if (date_of_application != null) {
            setDate_of_application(date_of_application);
        }

        Long cv_file_id = (Long) attributes.get("cv_file_id");

        if (cv_file_id != null) {
            setCv_file_id(cv_file_id);
        }

        String cv_text_version = (String) attributes.get("cv_text_version");

        if (cv_text_version != null) {
            setCv_text_version(cv_text_version);
        }

        String keywords = (String) attributes.get("keywords");

        if (keywords != null) {
            setKeywords(keywords);
        }

        Integer added_person = (Integer) attributes.get("added_person");

        if (added_person != null) {
            setAdded_person(added_person);
        }

        Long user_id = (Long) attributes.get("user_id");

        if (user_id != null) {
            setUser_id(user_id);
        }

        Long group_id = (Long) attributes.get("group_id");

        if (group_id != null) {
            setGroup_id(group_id);
        }
    }

    @Override
    public long getC_id() {
        return _c_id;
    }

    @Override
    public void setC_id(long c_id) {
        _c_id = c_id;

        if (_candidateRemoteModel != null) {
            try {
                Class<?> clazz = _candidateRemoteModel.getClass();

                Method method = clazz.getMethod("setC_id", long.class);

                method.invoke(_candidateRemoteModel, c_id);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getFirst_name() {
        return _first_name;
    }

    @Override
    public void setFirst_name(String first_name) {
        _first_name = first_name;

        if (_candidateRemoteModel != null) {
            try {
                Class<?> clazz = _candidateRemoteModel.getClass();

                Method method = clazz.getMethod("setFirst_name", String.class);

                method.invoke(_candidateRemoteModel, first_name);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getMiddle_name() {
        return _middle_name;
    }

    @Override
    public void setMiddle_name(String middle_name) {
        _middle_name = middle_name;

        if (_candidateRemoteModel != null) {
            try {
                Class<?> clazz = _candidateRemoteModel.getClass();

                Method method = clazz.getMethod("setMiddle_name", String.class);

                method.invoke(_candidateRemoteModel, middle_name);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getLast_name() {
        return _last_name;
    }

    @Override
    public void setLast_name(String last_name) {
        _last_name = last_name;

        if (_candidateRemoteModel != null) {
            try {
                Class<?> clazz = _candidateRemoteModel.getClass();

                Method method = clazz.getMethod("setLast_name", String.class);

                method.invoke(_candidateRemoteModel, last_name);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getEmail() {
        return _email;
    }

    @Override
    public void setEmail(String email) {
        _email = email;

        if (_candidateRemoteModel != null) {
            try {
                Class<?> clazz = _candidateRemoteModel.getClass();

                Method method = clazz.getMethod("setEmail", String.class);

                method.invoke(_candidateRemoteModel, email);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getContact_number() {
        return _contact_number;
    }

    @Override
    public void setContact_number(String contact_number) {
        _contact_number = contact_number;

        if (_candidateRemoteModel != null) {
            try {
                Class<?> clazz = _candidateRemoteModel.getClass();

                Method method = clazz.getMethod("setContact_number",
                        String.class);

                method.invoke(_candidateRemoteModel, contact_number);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getComment() {
        return _comment;
    }

    @Override
    public void setComment(String comment) {
        _comment = comment;

        if (_candidateRemoteModel != null) {
            try {
                Class<?> clazz = _candidateRemoteModel.getClass();

                Method method = clazz.getMethod("setComment", String.class);

                method.invoke(_candidateRemoteModel, comment);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getMode_of_application() {
        return _mode_of_application;
    }

    @Override
    public void setMode_of_application(int mode_of_application) {
        _mode_of_application = mode_of_application;

        if (_candidateRemoteModel != null) {
            try {
                Class<?> clazz = _candidateRemoteModel.getClass();

                Method method = clazz.getMethod("setMode_of_application",
                        int.class);

                method.invoke(_candidateRemoteModel, mode_of_application);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public Date getDate_of_application() {
        return _date_of_application;
    }

    @Override
    public void setDate_of_application(Date date_of_application) {
        _date_of_application = date_of_application;

        if (_candidateRemoteModel != null) {
            try {
                Class<?> clazz = _candidateRemoteModel.getClass();

                Method method = clazz.getMethod("setDate_of_application",
                        Date.class);

                method.invoke(_candidateRemoteModel, date_of_application);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getCv_file_id() {
        return _cv_file_id;
    }

    @Override
    public void setCv_file_id(long cv_file_id) {
        _cv_file_id = cv_file_id;

        if (_candidateRemoteModel != null) {
            try {
                Class<?> clazz = _candidateRemoteModel.getClass();

                Method method = clazz.getMethod("setCv_file_id", long.class);

                method.invoke(_candidateRemoteModel, cv_file_id);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getCv_text_version() {
        return _cv_text_version;
    }

    @Override
    public void setCv_text_version(String cv_text_version) {
        _cv_text_version = cv_text_version;

        if (_candidateRemoteModel != null) {
            try {
                Class<?> clazz = _candidateRemoteModel.getClass();

                Method method = clazz.getMethod("setCv_text_version",
                        String.class);

                method.invoke(_candidateRemoteModel, cv_text_version);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getKeywords() {
        return _keywords;
    }

    @Override
    public void setKeywords(String keywords) {
        _keywords = keywords;

        if (_candidateRemoteModel != null) {
            try {
                Class<?> clazz = _candidateRemoteModel.getClass();

                Method method = clazz.getMethod("setKeywords", String.class);

                method.invoke(_candidateRemoteModel, keywords);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getAdded_person() {
        return _added_person;
    }

    @Override
    public void setAdded_person(int added_person) {
        _added_person = added_person;

        if (_candidateRemoteModel != null) {
            try {
                Class<?> clazz = _candidateRemoteModel.getClass();

                Method method = clazz.getMethod("setAdded_person", int.class);

                method.invoke(_candidateRemoteModel, added_person);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getUser_id() {
        return _user_id;
    }

    @Override
    public void setUser_id(long user_id) {
        _user_id = user_id;

        if (_candidateRemoteModel != null) {
            try {
                Class<?> clazz = _candidateRemoteModel.getClass();

                Method method = clazz.getMethod("setUser_id", long.class);

                method.invoke(_candidateRemoteModel, user_id);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getGroup_id() {
        return _group_id;
    }

    @Override
    public void setGroup_id(long group_id) {
        _group_id = group_id;

        if (_candidateRemoteModel != null) {
            try {
                Class<?> clazz = _candidateRemoteModel.getClass();

                Method method = clazz.getMethod("setGroup_id", long.class);

                method.invoke(_candidateRemoteModel, group_id);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public java.util.List<vn.com.ecopharma.hrm.model.Vacancy> get_vacancies() {
        try {
            String methodName = "get_vacancies";

            Class<?>[] parameterTypes = new Class<?>[] {  };

            Object[] parameterValues = new Object[] {  };

            java.util.List<vn.com.ecopharma.hrm.model.Vacancy> returnObj = (java.util.List<vn.com.ecopharma.hrm.model.Vacancy>) invokeOnRemoteModel(methodName,
                    parameterTypes, parameterValues);

            return returnObj;
        } catch (Exception e) {
            throw new UnsupportedOperationException(e);
        }
    }

    @Override
    public void set_vacancies(
        java.util.List<vn.com.ecopharma.hrm.model.Vacancy> _vacancies) {
        try {
            String methodName = "set_vacancies";

            Class<?>[] parameterTypes = new Class<?>[] { java.util.List.class };

            Object[] parameterValues = new Object[] { _vacancies };

            invokeOnRemoteModel(methodName, parameterTypes, parameterValues);
        } catch (Exception e) {
            throw new UnsupportedOperationException(e);
        }
    }

    @Override
    public java.lang.String getFullName() {
        try {
            String methodName = "getFullName";

            Class<?>[] parameterTypes = new Class<?>[] {  };

            Object[] parameterValues = new Object[] {  };

            java.lang.String returnObj = (java.lang.String) invokeOnRemoteModel(methodName,
                    parameterTypes, parameterValues);

            return returnObj;
        } catch (Exception e) {
            throw new UnsupportedOperationException(e);
        }
    }

    @Override
    public int getStatus() {
        return 0;
    }

    @Override
    public TrashEntry getTrashEntry() throws PortalException, SystemException {
        if (!isInTrash()) {
            return null;
        }

        TrashEntry trashEntry = TrashEntryLocalServiceUtil.fetchEntry(getModelClassName(),
                getTrashEntryClassPK());

        if (trashEntry != null) {
            return trashEntry;
        }

        TrashHandler trashHandler = getTrashHandler();

        if (!Validator.isNull(trashHandler.getContainerModelClassName())) {
            ContainerModel containerModel = null;

            try {
                containerModel = trashHandler.getParentContainerModel(this);
            } catch (NoSuchModelException nsme) {
                return null;
            }

            while (containerModel != null) {
                if (containerModel instanceof TrashedModel) {
                    TrashedModel trashedModel = (TrashedModel) containerModel;

                    return trashedModel.getTrashEntry();
                }

                trashHandler = TrashHandlerRegistryUtil.getTrashHandler(trashHandler.getContainerModelClassName());

                if (trashHandler == null) {
                    return null;
                }

                containerModel = trashHandler.getContainerModel(containerModel.getParentContainerModelId());
            }
        }

        return null;
    }

    @Override
    public long getTrashEntryClassPK() {
        return getPrimaryKey();
    }

    @Override
    public TrashHandler getTrashHandler() {
        return TrashHandlerRegistryUtil.getTrashHandler(getModelClassName());
    }

    @Override
    public boolean isInTrash() {
        if (getStatus() == WorkflowConstants.STATUS_IN_TRASH) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean isInTrashContainer() {
        TrashHandler trashHandler = getTrashHandler();

        if ((trashHandler == null) ||
                Validator.isNull(trashHandler.getContainerModelClassName())) {
            return false;
        }

        try {
            ContainerModel containerModel = trashHandler.getParentContainerModel(this);

            if (containerModel == null) {
                return false;
            }

            if (containerModel instanceof TrashedModel) {
                return ((TrashedModel) containerModel).isInTrash();
            }
        } catch (Exception e) {
        }

        return false;
    }

    public BaseModel<?> getCandidateRemoteModel() {
        return _candidateRemoteModel;
    }

    public void setCandidateRemoteModel(BaseModel<?> candidateRemoteModel) {
        _candidateRemoteModel = candidateRemoteModel;
    }

    public Object invokeOnRemoteModel(String methodName,
        Class<?>[] parameterTypes, Object[] parameterValues)
        throws Exception {
        Object[] remoteParameterValues = new Object[parameterValues.length];

        for (int i = 0; i < parameterValues.length; i++) {
            if (parameterValues[i] != null) {
                remoteParameterValues[i] = ClpSerializer.translateInput(parameterValues[i]);
            }
        }

        Class<?> remoteModelClass = _candidateRemoteModel.getClass();

        ClassLoader remoteModelClassLoader = remoteModelClass.getClassLoader();

        Class<?>[] remoteParameterTypes = new Class[parameterTypes.length];

        for (int i = 0; i < parameterTypes.length; i++) {
            if (parameterTypes[i].isPrimitive()) {
                remoteParameterTypes[i] = parameterTypes[i];
            } else {
                String parameterTypeName = parameterTypes[i].getName();

                remoteParameterTypes[i] = remoteModelClassLoader.loadClass(parameterTypeName);
            }
        }

        Method method = remoteModelClass.getMethod(methodName,
                remoteParameterTypes);

        Object returnValue = method.invoke(_candidateRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            CandidateLocalServiceUtil.addCandidate(this);
        } else {
            CandidateLocalServiceUtil.updateCandidate(this);
        }
    }

    @Override
    public Candidate toEscapedModel() {
        return (Candidate) ProxyUtil.newProxyInstance(Candidate.class.getClassLoader(),
            new Class[] { Candidate.class }, new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        CandidateClp clone = new CandidateClp();

        clone.setC_id(getC_id());
        clone.setFirst_name(getFirst_name());
        clone.setMiddle_name(getMiddle_name());
        clone.setLast_name(getLast_name());
        clone.setEmail(getEmail());
        clone.setContact_number(getContact_number());
        clone.setComment(getComment());
        clone.setMode_of_application(getMode_of_application());
        clone.setDate_of_application(getDate_of_application());
        clone.setCv_file_id(getCv_file_id());
        clone.setCv_text_version(getCv_text_version());
        clone.setKeywords(getKeywords());
        clone.setAdded_person(getAdded_person());
        clone.setUser_id(getUser_id());
        clone.setGroup_id(getGroup_id());

        return clone;
    }

    @Override
    public int compareTo(Candidate candidate) {
        long primaryKey = candidate.getPrimaryKey();

        if (getPrimaryKey() < primaryKey) {
            return -1;
        } else if (getPrimaryKey() > primaryKey) {
            return 1;
        } else {
            return 0;
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof CandidateClp)) {
            return false;
        }

        CandidateClp candidate = (CandidateClp) obj;

        long primaryKey = candidate.getPrimaryKey();

        if (getPrimaryKey() == primaryKey) {
            return true;
        } else {
            return false;
        }
    }

    public Class<?> getClpSerializerClass() {
        return _clpSerializerClass;
    }

    @Override
    public int hashCode() {
        return (int) getPrimaryKey();
    }

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(31);

        sb.append("{c_id=");
        sb.append(getC_id());
        sb.append(", first_name=");
        sb.append(getFirst_name());
        sb.append(", middle_name=");
        sb.append(getMiddle_name());
        sb.append(", last_name=");
        sb.append(getLast_name());
        sb.append(", email=");
        sb.append(getEmail());
        sb.append(", contact_number=");
        sb.append(getContact_number());
        sb.append(", comment=");
        sb.append(getComment());
        sb.append(", mode_of_application=");
        sb.append(getMode_of_application());
        sb.append(", date_of_application=");
        sb.append(getDate_of_application());
        sb.append(", cv_file_id=");
        sb.append(getCv_file_id());
        sb.append(", cv_text_version=");
        sb.append(getCv_text_version());
        sb.append(", keywords=");
        sb.append(getKeywords());
        sb.append(", added_person=");
        sb.append(getAdded_person());
        sb.append(", user_id=");
        sb.append(getUser_id());
        sb.append(", group_id=");
        sb.append(getGroup_id());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(49);

        sb.append("<model><model-name>");
        sb.append("vn.com.ecopharma.hrm.model.Candidate");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>c_id</column-name><column-value><![CDATA[");
        sb.append(getC_id());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>first_name</column-name><column-value><![CDATA[");
        sb.append(getFirst_name());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>middle_name</column-name><column-value><![CDATA[");
        sb.append(getMiddle_name());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>last_name</column-name><column-value><![CDATA[");
        sb.append(getLast_name());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>email</column-name><column-value><![CDATA[");
        sb.append(getEmail());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>contact_number</column-name><column-value><![CDATA[");
        sb.append(getContact_number());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>comment</column-name><column-value><![CDATA[");
        sb.append(getComment());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>mode_of_application</column-name><column-value><![CDATA[");
        sb.append(getMode_of_application());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>date_of_application</column-name><column-value><![CDATA[");
        sb.append(getDate_of_application());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>cv_file_id</column-name><column-value><![CDATA[");
        sb.append(getCv_file_id());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>cv_text_version</column-name><column-value><![CDATA[");
        sb.append(getCv_text_version());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>keywords</column-name><column-value><![CDATA[");
        sb.append(getKeywords());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>added_person</column-name><column-value><![CDATA[");
        sb.append(getAdded_person());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>user_id</column-name><column-value><![CDATA[");
        sb.append(getUser_id());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>group_id</column-name><column-value><![CDATA[");
        sb.append(getGroup_id());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
