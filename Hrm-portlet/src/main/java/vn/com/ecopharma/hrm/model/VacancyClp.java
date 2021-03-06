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

import vn.com.ecopharma.hrm.service.ClpSerializer;
import vn.com.ecopharma.hrm.service.VacancyLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;


public class VacancyClp extends BaseModelImpl<Vacancy> implements Vacancy {
    private long _v_id;
    private long _jobtitleId;
    private String _name;
    private long _locationId;
    private String _description;
    private int _no_of_positions;
    private String _vacancy_status;
    private Date _insert_date;
    private Date _update_date;
    private long _user_id;
    private long _group_id;
    private long _subUnitId;
    private long _fileEntryId;
    private BaseModel<?> _vacancyRemoteModel;
    private Class<?> _clpSerializerClass = vn.com.ecopharma.hrm.service.ClpSerializer.class;

    public VacancyClp() {
    }

    @Override
    public Class<?> getModelClass() {
        return Vacancy.class;
    }

    @Override
    public String getModelClassName() {
        return Vacancy.class.getName();
    }

    @Override
    public long getPrimaryKey() {
        return _v_id;
    }

    @Override
    public void setPrimaryKey(long primaryKey) {
        setV_id(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _v_id;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Long) primaryKeyObj).longValue());
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("v_id", getV_id());
        attributes.put("jobtitleId", getJobtitleId());
        attributes.put("name", getName());
        attributes.put("locationId", getLocationId());
        attributes.put("description", getDescription());
        attributes.put("no_of_positions", getNo_of_positions());
        attributes.put("vacancy_status", getVacancy_status());
        attributes.put("insert_date", getInsert_date());
        attributes.put("update_date", getUpdate_date());
        attributes.put("user_id", getUser_id());
        attributes.put("group_id", getGroup_id());
        attributes.put("subUnitId", getSubUnitId());
        attributes.put("fileEntryId", getFileEntryId());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long v_id = (Long) attributes.get("v_id");

        if (v_id != null) {
            setV_id(v_id);
        }

        Long jobtitleId = (Long) attributes.get("jobtitleId");

        if (jobtitleId != null) {
            setJobtitleId(jobtitleId);
        }

        String name = (String) attributes.get("name");

        if (name != null) {
            setName(name);
        }

        Long locationId = (Long) attributes.get("locationId");

        if (locationId != null) {
            setLocationId(locationId);
        }

        String description = (String) attributes.get("description");

        if (description != null) {
            setDescription(description);
        }

        Integer no_of_positions = (Integer) attributes.get("no_of_positions");

        if (no_of_positions != null) {
            setNo_of_positions(no_of_positions);
        }

        String vacancy_status = (String) attributes.get("vacancy_status");

        if (vacancy_status != null) {
            setVacancy_status(vacancy_status);
        }

        Date insert_date = (Date) attributes.get("insert_date");

        if (insert_date != null) {
            setInsert_date(insert_date);
        }

        Date update_date = (Date) attributes.get("update_date");

        if (update_date != null) {
            setUpdate_date(update_date);
        }

        Long user_id = (Long) attributes.get("user_id");

        if (user_id != null) {
            setUser_id(user_id);
        }

        Long group_id = (Long) attributes.get("group_id");

        if (group_id != null) {
            setGroup_id(group_id);
        }

        Long subUnitId = (Long) attributes.get("subUnitId");

        if (subUnitId != null) {
            setSubUnitId(subUnitId);
        }

        Long fileEntryId = (Long) attributes.get("fileEntryId");

        if (fileEntryId != null) {
            setFileEntryId(fileEntryId);
        }
    }

    @Override
    public long getV_id() {
        return _v_id;
    }

    @Override
    public void setV_id(long v_id) {
        _v_id = v_id;

        if (_vacancyRemoteModel != null) {
            try {
                Class<?> clazz = _vacancyRemoteModel.getClass();

                Method method = clazz.getMethod("setV_id", long.class);

                method.invoke(_vacancyRemoteModel, v_id);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getJobtitleId() {
        return _jobtitleId;
    }

    @Override
    public void setJobtitleId(long jobtitleId) {
        _jobtitleId = jobtitleId;

        if (_vacancyRemoteModel != null) {
            try {
                Class<?> clazz = _vacancyRemoteModel.getClass();

                Method method = clazz.getMethod("setJobtitleId", long.class);

                method.invoke(_vacancyRemoteModel, jobtitleId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getName() {
        return _name;
    }

    @Override
    public void setName(String name) {
        _name = name;

        if (_vacancyRemoteModel != null) {
            try {
                Class<?> clazz = _vacancyRemoteModel.getClass();

                Method method = clazz.getMethod("setName", String.class);

                method.invoke(_vacancyRemoteModel, name);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getLocationId() {
        return _locationId;
    }

    @Override
    public void setLocationId(long locationId) {
        _locationId = locationId;

        if (_vacancyRemoteModel != null) {
            try {
                Class<?> clazz = _vacancyRemoteModel.getClass();

                Method method = clazz.getMethod("setLocationId", long.class);

                method.invoke(_vacancyRemoteModel, locationId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getDescription() {
        return _description;
    }

    @Override
    public void setDescription(String description) {
        _description = description;

        if (_vacancyRemoteModel != null) {
            try {
                Class<?> clazz = _vacancyRemoteModel.getClass();

                Method method = clazz.getMethod("setDescription", String.class);

                method.invoke(_vacancyRemoteModel, description);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getNo_of_positions() {
        return _no_of_positions;
    }

    @Override
    public void setNo_of_positions(int no_of_positions) {
        _no_of_positions = no_of_positions;

        if (_vacancyRemoteModel != null) {
            try {
                Class<?> clazz = _vacancyRemoteModel.getClass();

                Method method = clazz.getMethod("setNo_of_positions", int.class);

                method.invoke(_vacancyRemoteModel, no_of_positions);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getVacancy_status() {
        return _vacancy_status;
    }

    @Override
    public void setVacancy_status(String vacancy_status) {
        _vacancy_status = vacancy_status;

        if (_vacancyRemoteModel != null) {
            try {
                Class<?> clazz = _vacancyRemoteModel.getClass();

                Method method = clazz.getMethod("setVacancy_status",
                        String.class);

                method.invoke(_vacancyRemoteModel, vacancy_status);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public Date getInsert_date() {
        return _insert_date;
    }

    @Override
    public void setInsert_date(Date insert_date) {
        _insert_date = insert_date;

        if (_vacancyRemoteModel != null) {
            try {
                Class<?> clazz = _vacancyRemoteModel.getClass();

                Method method = clazz.getMethod("setInsert_date", Date.class);

                method.invoke(_vacancyRemoteModel, insert_date);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public Date getUpdate_date() {
        return _update_date;
    }

    @Override
    public void setUpdate_date(Date update_date) {
        _update_date = update_date;

        if (_vacancyRemoteModel != null) {
            try {
                Class<?> clazz = _vacancyRemoteModel.getClass();

                Method method = clazz.getMethod("setUpdate_date", Date.class);

                method.invoke(_vacancyRemoteModel, update_date);
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

        if (_vacancyRemoteModel != null) {
            try {
                Class<?> clazz = _vacancyRemoteModel.getClass();

                Method method = clazz.getMethod("setUser_id", long.class);

                method.invoke(_vacancyRemoteModel, user_id);
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

        if (_vacancyRemoteModel != null) {
            try {
                Class<?> clazz = _vacancyRemoteModel.getClass();

                Method method = clazz.getMethod("setGroup_id", long.class);

                method.invoke(_vacancyRemoteModel, group_id);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getSubUnitId() {
        return _subUnitId;
    }

    @Override
    public void setSubUnitId(long subUnitId) {
        _subUnitId = subUnitId;

        if (_vacancyRemoteModel != null) {
            try {
                Class<?> clazz = _vacancyRemoteModel.getClass();

                Method method = clazz.getMethod("setSubUnitId", long.class);

                method.invoke(_vacancyRemoteModel, subUnitId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getFileEntryId() {
        return _fileEntryId;
    }

    @Override
    public void setFileEntryId(long fileEntryId) {
        _fileEntryId = fileEntryId;

        if (_vacancyRemoteModel != null) {
            try {
                Class<?> clazz = _vacancyRemoteModel.getClass();

                Method method = clazz.getMethod("setFileEntryId", long.class);

                method.invoke(_vacancyRemoteModel, fileEntryId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public void set_candidates(
        java.util.List<vn.com.ecopharma.hrm.model.Candidate> _candidates) {
        try {
            String methodName = "set_candidates";

            Class<?>[] parameterTypes = new Class<?>[] { java.util.List.class };

            Object[] parameterValues = new Object[] { _candidates };

            invokeOnRemoteModel(methodName, parameterTypes, parameterValues);
        } catch (Exception e) {
            throw new UnsupportedOperationException(e);
        }
    }

    @Override
    public java.util.List<vn.com.ecopharma.hrm.model.Candidate> get_candidates() {
        try {
            String methodName = "get_candidates";

            Class<?>[] parameterTypes = new Class<?>[] {  };

            Object[] parameterValues = new Object[] {  };

            java.util.List<vn.com.ecopharma.hrm.model.Candidate> returnObj = (java.util.List<vn.com.ecopharma.hrm.model.Candidate>) invokeOnRemoteModel(methodName,
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

    public BaseModel<?> getVacancyRemoteModel() {
        return _vacancyRemoteModel;
    }

    public void setVacancyRemoteModel(BaseModel<?> vacancyRemoteModel) {
        _vacancyRemoteModel = vacancyRemoteModel;
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

        Class<?> remoteModelClass = _vacancyRemoteModel.getClass();

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

        Object returnValue = method.invoke(_vacancyRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            VacancyLocalServiceUtil.addVacancy(this);
        } else {
            VacancyLocalServiceUtil.updateVacancy(this);
        }
    }

    @Override
    public Vacancy toEscapedModel() {
        return (Vacancy) ProxyUtil.newProxyInstance(Vacancy.class.getClassLoader(),
            new Class[] { Vacancy.class }, new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        VacancyClp clone = new VacancyClp();

        clone.setV_id(getV_id());
        clone.setJobtitleId(getJobtitleId());
        clone.setName(getName());
        clone.setLocationId(getLocationId());
        clone.setDescription(getDescription());
        clone.setNo_of_positions(getNo_of_positions());
        clone.setVacancy_status(getVacancy_status());
        clone.setInsert_date(getInsert_date());
        clone.setUpdate_date(getUpdate_date());
        clone.setUser_id(getUser_id());
        clone.setGroup_id(getGroup_id());
        clone.setSubUnitId(getSubUnitId());
        clone.setFileEntryId(getFileEntryId());

        return clone;
    }

    @Override
    public int compareTo(Vacancy vacancy) {
        long primaryKey = vacancy.getPrimaryKey();

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

        if (!(obj instanceof VacancyClp)) {
            return false;
        }

        VacancyClp vacancy = (VacancyClp) obj;

        long primaryKey = vacancy.getPrimaryKey();

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
        StringBundler sb = new StringBundler(27);

        sb.append("{v_id=");
        sb.append(getV_id());
        sb.append(", jobtitleId=");
        sb.append(getJobtitleId());
        sb.append(", name=");
        sb.append(getName());
        sb.append(", locationId=");
        sb.append(getLocationId());
        sb.append(", description=");
        sb.append(getDescription());
        sb.append(", no_of_positions=");
        sb.append(getNo_of_positions());
        sb.append(", vacancy_status=");
        sb.append(getVacancy_status());
        sb.append(", insert_date=");
        sb.append(getInsert_date());
        sb.append(", update_date=");
        sb.append(getUpdate_date());
        sb.append(", user_id=");
        sb.append(getUser_id());
        sb.append(", group_id=");
        sb.append(getGroup_id());
        sb.append(", subUnitId=");
        sb.append(getSubUnitId());
        sb.append(", fileEntryId=");
        sb.append(getFileEntryId());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(43);

        sb.append("<model><model-name>");
        sb.append("vn.com.ecopharma.hrm.model.Vacancy");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>v_id</column-name><column-value><![CDATA[");
        sb.append(getV_id());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>jobtitleId</column-name><column-value><![CDATA[");
        sb.append(getJobtitleId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>name</column-name><column-value><![CDATA[");
        sb.append(getName());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>locationId</column-name><column-value><![CDATA[");
        sb.append(getLocationId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>description</column-name><column-value><![CDATA[");
        sb.append(getDescription());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>no_of_positions</column-name><column-value><![CDATA[");
        sb.append(getNo_of_positions());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>vacancy_status</column-name><column-value><![CDATA[");
        sb.append(getVacancy_status());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>insert_date</column-name><column-value><![CDATA[");
        sb.append(getInsert_date());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>update_date</column-name><column-value><![CDATA[");
        sb.append(getUpdate_date());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>user_id</column-name><column-value><![CDATA[");
        sb.append(getUser_id());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>group_id</column-name><column-value><![CDATA[");
        sb.append(getGroup_id());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>subUnitId</column-name><column-value><![CDATA[");
        sb.append(getSubUnitId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>fileEntryId</column-name><column-value><![CDATA[");
        sb.append(getFileEntryId());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
