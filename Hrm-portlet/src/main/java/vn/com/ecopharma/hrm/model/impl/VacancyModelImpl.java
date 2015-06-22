package vn.com.ecopharma.hrm.model.impl;

import com.liferay.portal.NoSuchModelException;
import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.trash.TrashHandler;
import com.liferay.portal.kernel.trash.TrashHandlerRegistryUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.workflow.WorkflowConstants;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ContainerModel;
import com.liferay.portal.model.TrashedModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;
import com.liferay.portlet.trash.model.TrashEntry;
import com.liferay.portlet.trash.service.TrashEntryLocalServiceUtil;

import vn.com.ecopharma.hrm.model.Vacancy;
import vn.com.ecopharma.hrm.model.VacancyModel;
import vn.com.ecopharma.hrm.model.VacancySoap;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the Vacancy service. Represents a row in the &quot;HRM_Recruitment_Vacancy&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link vn.com.ecopharma.hrm.model.VacancyModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link VacancyImpl}.
 * </p>
 *
 * @author tvt
 * @see VacancyImpl
 * @see vn.com.ecopharma.hrm.model.Vacancy
 * @see vn.com.ecopharma.hrm.model.VacancyModel
 * @generated
 */
@JSON(strict = true)
public class VacancyModelImpl extends BaseModelImpl<Vacancy>
    implements VacancyModel {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. All methods that expect a vacancy model instance should use the {@link vn.com.ecopharma.hrm.model.Vacancy} interface instead.
     */
    public static final String TABLE_NAME = "HRM_Recruitment_Vacancy";
    public static final Object[][] TABLE_COLUMNS = {
            { "v_id", Types.BIGINT },
            { "jobtitleId", Types.BIGINT },
            { "name", Types.VARCHAR },
            { "locationId", Types.BIGINT },
            { "description", Types.VARCHAR },
            { "no_of_positions", Types.INTEGER },
            { "vacancy_status", Types.VARCHAR },
            { "insert_date", Types.TIMESTAMP },
            { "update_date", Types.TIMESTAMP },
            { "user_id", Types.BIGINT },
            { "group_id", Types.BIGINT },
            { "subUnitId", Types.BIGINT },
            { "fileEntryId", Types.BIGINT }
        };
    public static final String TABLE_SQL_CREATE = "create table HRM_Recruitment_Vacancy (v_id LONG not null primary key,jobtitleId LONG,name VARCHAR(75) null,locationId LONG,description VARCHAR(75) null,no_of_positions INTEGER,vacancy_status VARCHAR(75) null,insert_date DATE null,update_date DATE null,user_id LONG,group_id LONG,subUnitId LONG,fileEntryId LONG)";
    public static final String TABLE_SQL_DROP = "drop table HRM_Recruitment_Vacancy";
    public static final String ORDER_BY_JPQL = " ORDER BY vacancy.v_id ASC";
    public static final String ORDER_BY_SQL = " ORDER BY HRM_Recruitment_Vacancy.v_id ASC";
    public static final String DATA_SOURCE = "liferayDataSource";
    public static final String SESSION_FACTORY = "liferaySessionFactory";
    public static final String TX_MANAGER = "liferayTransactionManager";
    public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.entity.cache.enabled.vn.com.ecopharma.hrm.model.Vacancy"),
            true);
    public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.finder.cache.enabled.vn.com.ecopharma.hrm.model.Vacancy"),
            true);
    public static final boolean COLUMN_BITMASK_ENABLED = false;
    public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
                "lock.expiration.time.vn.com.ecopharma.hrm.model.Vacancy"));
    private static ClassLoader _classLoader = Vacancy.class.getClassLoader();
    private static Class<?>[] _escapedModelInterfaces = new Class[] {
            Vacancy.class
        };
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
    private Vacancy _escapedModel;

    public VacancyModelImpl() {
    }

    /**
     * Converts the soap model instance into a normal model instance.
     *
     * @param soapModel the soap model instance to convert
     * @return the normal model instance
     */
    public static Vacancy toModel(VacancySoap soapModel) {
        if (soapModel == null) {
            return null;
        }

        Vacancy model = new VacancyImpl();

        model.setV_id(soapModel.getV_id());
        model.setJobtitleId(soapModel.getJobtitleId());
        model.setName(soapModel.getName());
        model.setLocationId(soapModel.getLocationId());
        model.setDescription(soapModel.getDescription());
        model.setNo_of_positions(soapModel.getNo_of_positions());
        model.setVacancy_status(soapModel.getVacancy_status());
        model.setInsert_date(soapModel.getInsert_date());
        model.setUpdate_date(soapModel.getUpdate_date());
        model.setUser_id(soapModel.getUser_id());
        model.setGroup_id(soapModel.getGroup_id());
        model.setSubUnitId(soapModel.getSubUnitId());
        model.setFileEntryId(soapModel.getFileEntryId());

        return model;
    }

    /**
     * Converts the soap model instances into normal model instances.
     *
     * @param soapModels the soap model instances to convert
     * @return the normal model instances
     */
    public static List<Vacancy> toModels(VacancySoap[] soapModels) {
        if (soapModels == null) {
            return null;
        }

        List<Vacancy> models = new ArrayList<Vacancy>(soapModels.length);

        for (VacancySoap soapModel : soapModels) {
            models.add(toModel(soapModel));
        }

        return models;
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
    public Class<?> getModelClass() {
        return Vacancy.class;
    }

    @Override
    public String getModelClassName() {
        return Vacancy.class.getName();
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

    @JSON
    @Override
    public long getV_id() {
        return _v_id;
    }

    @Override
    public void setV_id(long v_id) {
        _v_id = v_id;
    }

    @JSON
    @Override
    public long getJobtitleId() {
        return _jobtitleId;
    }

    @Override
    public void setJobtitleId(long jobtitleId) {
        _jobtitleId = jobtitleId;
    }

    @JSON
    @Override
    public String getName() {
        if (_name == null) {
            return StringPool.BLANK;
        } else {
            return _name;
        }
    }

    @Override
    public void setName(String name) {
        _name = name;
    }

    @JSON
    @Override
    public long getLocationId() {
        return _locationId;
    }

    @Override
    public void setLocationId(long locationId) {
        _locationId = locationId;
    }

    @JSON
    @Override
    public String getDescription() {
        if (_description == null) {
            return StringPool.BLANK;
        } else {
            return _description;
        }
    }

    @Override
    public void setDescription(String description) {
        _description = description;
    }

    @JSON
    @Override
    public int getNo_of_positions() {
        return _no_of_positions;
    }

    @Override
    public void setNo_of_positions(int no_of_positions) {
        _no_of_positions = no_of_positions;
    }

    @JSON
    @Override
    public String getVacancy_status() {
        if (_vacancy_status == null) {
            return StringPool.BLANK;
        } else {
            return _vacancy_status;
        }
    }

    @Override
    public void setVacancy_status(String vacancy_status) {
        _vacancy_status = vacancy_status;
    }

    @JSON
    @Override
    public Date getInsert_date() {
        return _insert_date;
    }

    @Override
    public void setInsert_date(Date insert_date) {
        _insert_date = insert_date;
    }

    @JSON
    @Override
    public Date getUpdate_date() {
        return _update_date;
    }

    @Override
    public void setUpdate_date(Date update_date) {
        _update_date = update_date;
    }

    @JSON
    @Override
    public long getUser_id() {
        return _user_id;
    }

    @Override
    public void setUser_id(long user_id) {
        _user_id = user_id;
    }

    @JSON
    @Override
    public long getGroup_id() {
        return _group_id;
    }

    @Override
    public void setGroup_id(long group_id) {
        _group_id = group_id;
    }

    @JSON
    @Override
    public long getSubUnitId() {
        return _subUnitId;
    }

    @Override
    public void setSubUnitId(long subUnitId) {
        _subUnitId = subUnitId;
    }

    @JSON
    @Override
    public long getFileEntryId() {
        return _fileEntryId;
    }

    @Override
    public void setFileEntryId(long fileEntryId) {
        _fileEntryId = fileEntryId;
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

    @Override
    public ExpandoBridge getExpandoBridge() {
        return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
            Vacancy.class.getName(), getPrimaryKey());
    }

    @Override
    public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
        ExpandoBridge expandoBridge = getExpandoBridge();

        expandoBridge.setAttributes(serviceContext);
    }

    @Override
    public Vacancy toEscapedModel() {
        if (_escapedModel == null) {
            _escapedModel = (Vacancy) ProxyUtil.newProxyInstance(_classLoader,
                    _escapedModelInterfaces, new AutoEscapeBeanHandler(this));
        }

        return _escapedModel;
    }

    @Override
    public Object clone() {
        VacancyImpl vacancyImpl = new VacancyImpl();

        vacancyImpl.setV_id(getV_id());
        vacancyImpl.setJobtitleId(getJobtitleId());
        vacancyImpl.setName(getName());
        vacancyImpl.setLocationId(getLocationId());
        vacancyImpl.setDescription(getDescription());
        vacancyImpl.setNo_of_positions(getNo_of_positions());
        vacancyImpl.setVacancy_status(getVacancy_status());
        vacancyImpl.setInsert_date(getInsert_date());
        vacancyImpl.setUpdate_date(getUpdate_date());
        vacancyImpl.setUser_id(getUser_id());
        vacancyImpl.setGroup_id(getGroup_id());
        vacancyImpl.setSubUnitId(getSubUnitId());
        vacancyImpl.setFileEntryId(getFileEntryId());

        vacancyImpl.resetOriginalValues();

        return vacancyImpl;
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

        if (!(obj instanceof Vacancy)) {
            return false;
        }

        Vacancy vacancy = (Vacancy) obj;

        long primaryKey = vacancy.getPrimaryKey();

        if (getPrimaryKey() == primaryKey) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return (int) getPrimaryKey();
    }

    @Override
    public void resetOriginalValues() {
    }

    @Override
    public CacheModel<Vacancy> toCacheModel() {
        VacancyCacheModel vacancyCacheModel = new VacancyCacheModel();

        vacancyCacheModel.v_id = getV_id();

        vacancyCacheModel.jobtitleId = getJobtitleId();

        vacancyCacheModel.name = getName();

        String name = vacancyCacheModel.name;

        if ((name != null) && (name.length() == 0)) {
            vacancyCacheModel.name = null;
        }

        vacancyCacheModel.locationId = getLocationId();

        vacancyCacheModel.description = getDescription();

        String description = vacancyCacheModel.description;

        if ((description != null) && (description.length() == 0)) {
            vacancyCacheModel.description = null;
        }

        vacancyCacheModel.no_of_positions = getNo_of_positions();

        vacancyCacheModel.vacancy_status = getVacancy_status();

        String vacancy_status = vacancyCacheModel.vacancy_status;

        if ((vacancy_status != null) && (vacancy_status.length() == 0)) {
            vacancyCacheModel.vacancy_status = null;
        }

        Date insert_date = getInsert_date();

        if (insert_date != null) {
            vacancyCacheModel.insert_date = insert_date.getTime();
        } else {
            vacancyCacheModel.insert_date = Long.MIN_VALUE;
        }

        Date update_date = getUpdate_date();

        if (update_date != null) {
            vacancyCacheModel.update_date = update_date.getTime();
        } else {
            vacancyCacheModel.update_date = Long.MIN_VALUE;
        }

        vacancyCacheModel.user_id = getUser_id();

        vacancyCacheModel.group_id = getGroup_id();

        vacancyCacheModel.subUnitId = getSubUnitId();

        vacancyCacheModel.fileEntryId = getFileEntryId();

        return vacancyCacheModel;
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
