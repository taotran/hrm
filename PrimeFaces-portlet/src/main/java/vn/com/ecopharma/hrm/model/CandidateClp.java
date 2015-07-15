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
        StringBundler sb = new StringBundler(15);

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
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(25);

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

        sb.append("</model>");

        return sb.toString();
    }
}
