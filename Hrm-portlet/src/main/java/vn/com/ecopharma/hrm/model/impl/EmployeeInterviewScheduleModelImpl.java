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
import com.liferay.portal.util.PortalUtil;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;
import com.liferay.portlet.trash.model.TrashEntry;
import com.liferay.portlet.trash.service.TrashEntryLocalServiceUtil;

import vn.com.ecopharma.hrm.model.EmployeeInterviewSchedule;
import vn.com.ecopharma.hrm.model.EmployeeInterviewScheduleModel;
import vn.com.ecopharma.hrm.model.EmployeeInterviewScheduleSoap;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the EmployeeInterviewSchedule service. Represents a row in the &quot;HRM_Recruitment_EmployeeInterviewSchedule&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link vn.com.ecopharma.hrm.model.EmployeeInterviewScheduleModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link EmployeeInterviewScheduleImpl}.
 * </p>
 *
 * @author tvt
 * @see EmployeeInterviewScheduleImpl
 * @see vn.com.ecopharma.hrm.model.EmployeeInterviewSchedule
 * @see vn.com.ecopharma.hrm.model.EmployeeInterviewScheduleModel
 * @generated
 */
@JSON(strict = true)
public class EmployeeInterviewScheduleModelImpl extends BaseModelImpl<EmployeeInterviewSchedule>
    implements EmployeeInterviewScheduleModel {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. All methods that expect a employee interview schedule model instance should use the {@link vn.com.ecopharma.hrm.model.EmployeeInterviewSchedule} interface instead.
     */
    public static final String TABLE_NAME = "HRM_Recruitment_EmployeeInterviewSchedule";
    public static final Object[][] TABLE_COLUMNS = {
            { "employeeInterviewScheduleId", Types.BIGINT },
            { "employeeId", Types.BIGINT },
            { "interviewScheduleId", Types.BIGINT },
            { "groupId", Types.BIGINT },
            { "companyId", Types.BIGINT },
            { "userId", Types.BIGINT },
            { "createDate", Types.TIMESTAMP },
            { "modifiedDate", Types.TIMESTAMP },
            { "note", Types.VARCHAR }
        };
    public static final String TABLE_SQL_CREATE = "create table HRM_Recruitment_EmployeeInterviewSchedule (employeeInterviewScheduleId LONG not null primary key,employeeId LONG,interviewScheduleId LONG,groupId LONG,companyId LONG,userId LONG,createDate DATE null,modifiedDate DATE null,note VARCHAR(75) null)";
    public static final String TABLE_SQL_DROP = "drop table HRM_Recruitment_EmployeeInterviewSchedule";
    public static final String ORDER_BY_JPQL = " ORDER BY employeeInterviewSchedule.employeeInterviewScheduleId ASC";
    public static final String ORDER_BY_SQL = " ORDER BY HRM_Recruitment_EmployeeInterviewSchedule.employeeInterviewScheduleId ASC";
    public static final String DATA_SOURCE = "liferayDataSource";
    public static final String SESSION_FACTORY = "liferaySessionFactory";
    public static final String TX_MANAGER = "liferayTransactionManager";
    public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.entity.cache.enabled.vn.com.ecopharma.hrm.model.EmployeeInterviewSchedule"),
            true);
    public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.finder.cache.enabled.vn.com.ecopharma.hrm.model.EmployeeInterviewSchedule"),
            true);
    public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.column.bitmask.enabled.vn.com.ecopharma.hrm.model.EmployeeInterviewSchedule"),
            true);
    public static long EMPLOYEEID_COLUMN_BITMASK = 1L;
    public static long INTERVIEWSCHEDULEID_COLUMN_BITMASK = 2L;
    public static long EMPLOYEEINTERVIEWSCHEDULEID_COLUMN_BITMASK = 4L;
    public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
                "lock.expiration.time.vn.com.ecopharma.hrm.model.EmployeeInterviewSchedule"));
    private static ClassLoader _classLoader = EmployeeInterviewSchedule.class.getClassLoader();
    private static Class<?>[] _escapedModelInterfaces = new Class[] {
            EmployeeInterviewSchedule.class
        };
    private long _employeeInterviewScheduleId;
    private long _employeeId;
    private long _originalEmployeeId;
    private boolean _setOriginalEmployeeId;
    private long _interviewScheduleId;
    private long _originalInterviewScheduleId;
    private boolean _setOriginalInterviewScheduleId;
    private long _groupId;
    private long _companyId;
    private long _userId;
    private String _userUuid;
    private Date _createDate;
    private Date _modifiedDate;
    private String _note;
    private long _columnBitmask;
    private EmployeeInterviewSchedule _escapedModel;

    public EmployeeInterviewScheduleModelImpl() {
    }

    /**
     * Converts the soap model instance into a normal model instance.
     *
     * @param soapModel the soap model instance to convert
     * @return the normal model instance
     */
    public static EmployeeInterviewSchedule toModel(
        EmployeeInterviewScheduleSoap soapModel) {
        if (soapModel == null) {
            return null;
        }

        EmployeeInterviewSchedule model = new EmployeeInterviewScheduleImpl();

        model.setEmployeeInterviewScheduleId(soapModel.getEmployeeInterviewScheduleId());
        model.setEmployeeId(soapModel.getEmployeeId());
        model.setInterviewScheduleId(soapModel.getInterviewScheduleId());
        model.setGroupId(soapModel.getGroupId());
        model.setCompanyId(soapModel.getCompanyId());
        model.setUserId(soapModel.getUserId());
        model.setCreateDate(soapModel.getCreateDate());
        model.setModifiedDate(soapModel.getModifiedDate());
        model.setNote(soapModel.getNote());

        return model;
    }

    /**
     * Converts the soap model instances into normal model instances.
     *
     * @param soapModels the soap model instances to convert
     * @return the normal model instances
     */
    public static List<EmployeeInterviewSchedule> toModels(
        EmployeeInterviewScheduleSoap[] soapModels) {
        if (soapModels == null) {
            return null;
        }

        List<EmployeeInterviewSchedule> models = new ArrayList<EmployeeInterviewSchedule>(soapModels.length);

        for (EmployeeInterviewScheduleSoap soapModel : soapModels) {
            models.add(toModel(soapModel));
        }

        return models;
    }

    @Override
    public long getPrimaryKey() {
        return _employeeInterviewScheduleId;
    }

    @Override
    public void setPrimaryKey(long primaryKey) {
        setEmployeeInterviewScheduleId(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _employeeInterviewScheduleId;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Long) primaryKeyObj).longValue());
    }

    @Override
    public Class<?> getModelClass() {
        return EmployeeInterviewSchedule.class;
    }

    @Override
    public String getModelClassName() {
        return EmployeeInterviewSchedule.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("employeeInterviewScheduleId",
            getEmployeeInterviewScheduleId());
        attributes.put("employeeId", getEmployeeId());
        attributes.put("interviewScheduleId", getInterviewScheduleId());
        attributes.put("groupId", getGroupId());
        attributes.put("companyId", getCompanyId());
        attributes.put("userId", getUserId());
        attributes.put("createDate", getCreateDate());
        attributes.put("modifiedDate", getModifiedDate());
        attributes.put("note", getNote());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long employeeInterviewScheduleId = (Long) attributes.get(
                "employeeInterviewScheduleId");

        if (employeeInterviewScheduleId != null) {
            setEmployeeInterviewScheduleId(employeeInterviewScheduleId);
        }

        Long employeeId = (Long) attributes.get("employeeId");

        if (employeeId != null) {
            setEmployeeId(employeeId);
        }

        Long interviewScheduleId = (Long) attributes.get("interviewScheduleId");

        if (interviewScheduleId != null) {
            setInterviewScheduleId(interviewScheduleId);
        }

        Long groupId = (Long) attributes.get("groupId");

        if (groupId != null) {
            setGroupId(groupId);
        }

        Long companyId = (Long) attributes.get("companyId");

        if (companyId != null) {
            setCompanyId(companyId);
        }

        Long userId = (Long) attributes.get("userId");

        if (userId != null) {
            setUserId(userId);
        }

        Date createDate = (Date) attributes.get("createDate");

        if (createDate != null) {
            setCreateDate(createDate);
        }

        Date modifiedDate = (Date) attributes.get("modifiedDate");

        if (modifiedDate != null) {
            setModifiedDate(modifiedDate);
        }

        String note = (String) attributes.get("note");

        if (note != null) {
            setNote(note);
        }
    }

    @JSON
    @Override
    public long getEmployeeInterviewScheduleId() {
        return _employeeInterviewScheduleId;
    }

    @Override
    public void setEmployeeInterviewScheduleId(long employeeInterviewScheduleId) {
        _employeeInterviewScheduleId = employeeInterviewScheduleId;
    }

    @JSON
    @Override
    public long getEmployeeId() {
        return _employeeId;
    }

    @Override
    public void setEmployeeId(long employeeId) {
        _columnBitmask |= EMPLOYEEID_COLUMN_BITMASK;

        if (!_setOriginalEmployeeId) {
            _setOriginalEmployeeId = true;

            _originalEmployeeId = _employeeId;
        }

        _employeeId = employeeId;
    }

    public long getOriginalEmployeeId() {
        return _originalEmployeeId;
    }

    @JSON
    @Override
    public long getInterviewScheduleId() {
        return _interviewScheduleId;
    }

    @Override
    public void setInterviewScheduleId(long interviewScheduleId) {
        _columnBitmask |= INTERVIEWSCHEDULEID_COLUMN_BITMASK;

        if (!_setOriginalInterviewScheduleId) {
            _setOriginalInterviewScheduleId = true;

            _originalInterviewScheduleId = _interviewScheduleId;
        }

        _interviewScheduleId = interviewScheduleId;
    }

    public long getOriginalInterviewScheduleId() {
        return _originalInterviewScheduleId;
    }

    @JSON
    @Override
    public long getGroupId() {
        return _groupId;
    }

    @Override
    public void setGroupId(long groupId) {
        _groupId = groupId;
    }

    @JSON
    @Override
    public long getCompanyId() {
        return _companyId;
    }

    @Override
    public void setCompanyId(long companyId) {
        _companyId = companyId;
    }

    @JSON
    @Override
    public long getUserId() {
        return _userId;
    }

    @Override
    public void setUserId(long userId) {
        _userId = userId;
    }

    @Override
    public String getUserUuid() throws SystemException {
        return PortalUtil.getUserValue(getUserId(), "uuid", _userUuid);
    }

    @Override
    public void setUserUuid(String userUuid) {
        _userUuid = userUuid;
    }

    @JSON
    @Override
    public Date getCreateDate() {
        return _createDate;
    }

    @Override
    public void setCreateDate(Date createDate) {
        _createDate = createDate;
    }

    @JSON
    @Override
    public Date getModifiedDate() {
        return _modifiedDate;
    }

    @Override
    public void setModifiedDate(Date modifiedDate) {
        _modifiedDate = modifiedDate;
    }

    @JSON
    @Override
    public String getNote() {
        if (_note == null) {
            return StringPool.BLANK;
        } else {
            return _note;
        }
    }

    @Override
    public void setNote(String note) {
        _note = note;
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

    public long getColumnBitmask() {
        return _columnBitmask;
    }

    @Override
    public ExpandoBridge getExpandoBridge() {
        return ExpandoBridgeFactoryUtil.getExpandoBridge(getCompanyId(),
            EmployeeInterviewSchedule.class.getName(), getPrimaryKey());
    }

    @Override
    public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
        ExpandoBridge expandoBridge = getExpandoBridge();

        expandoBridge.setAttributes(serviceContext);
    }

    @Override
    public EmployeeInterviewSchedule toEscapedModel() {
        if (_escapedModel == null) {
            _escapedModel = (EmployeeInterviewSchedule) ProxyUtil.newProxyInstance(_classLoader,
                    _escapedModelInterfaces, new AutoEscapeBeanHandler(this));
        }

        return _escapedModel;
    }

    @Override
    public Object clone() {
        EmployeeInterviewScheduleImpl employeeInterviewScheduleImpl = new EmployeeInterviewScheduleImpl();

        employeeInterviewScheduleImpl.setEmployeeInterviewScheduleId(getEmployeeInterviewScheduleId());
        employeeInterviewScheduleImpl.setEmployeeId(getEmployeeId());
        employeeInterviewScheduleImpl.setInterviewScheduleId(getInterviewScheduleId());
        employeeInterviewScheduleImpl.setGroupId(getGroupId());
        employeeInterviewScheduleImpl.setCompanyId(getCompanyId());
        employeeInterviewScheduleImpl.setUserId(getUserId());
        employeeInterviewScheduleImpl.setCreateDate(getCreateDate());
        employeeInterviewScheduleImpl.setModifiedDate(getModifiedDate());
        employeeInterviewScheduleImpl.setNote(getNote());

        employeeInterviewScheduleImpl.resetOriginalValues();

        return employeeInterviewScheduleImpl;
    }

    @Override
    public int compareTo(EmployeeInterviewSchedule employeeInterviewSchedule) {
        long primaryKey = employeeInterviewSchedule.getPrimaryKey();

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

        if (!(obj instanceof EmployeeInterviewSchedule)) {
            return false;
        }

        EmployeeInterviewSchedule employeeInterviewSchedule = (EmployeeInterviewSchedule) obj;

        long primaryKey = employeeInterviewSchedule.getPrimaryKey();

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
        EmployeeInterviewScheduleModelImpl employeeInterviewScheduleModelImpl = this;

        employeeInterviewScheduleModelImpl._originalEmployeeId = employeeInterviewScheduleModelImpl._employeeId;

        employeeInterviewScheduleModelImpl._setOriginalEmployeeId = false;

        employeeInterviewScheduleModelImpl._originalInterviewScheduleId = employeeInterviewScheduleModelImpl._interviewScheduleId;

        employeeInterviewScheduleModelImpl._setOriginalInterviewScheduleId = false;

        employeeInterviewScheduleModelImpl._columnBitmask = 0;
    }

    @Override
    public CacheModel<EmployeeInterviewSchedule> toCacheModel() {
        EmployeeInterviewScheduleCacheModel employeeInterviewScheduleCacheModel = new EmployeeInterviewScheduleCacheModel();

        employeeInterviewScheduleCacheModel.employeeInterviewScheduleId = getEmployeeInterviewScheduleId();

        employeeInterviewScheduleCacheModel.employeeId = getEmployeeId();

        employeeInterviewScheduleCacheModel.interviewScheduleId = getInterviewScheduleId();

        employeeInterviewScheduleCacheModel.groupId = getGroupId();

        employeeInterviewScheduleCacheModel.companyId = getCompanyId();

        employeeInterviewScheduleCacheModel.userId = getUserId();

        Date createDate = getCreateDate();

        if (createDate != null) {
            employeeInterviewScheduleCacheModel.createDate = createDate.getTime();
        } else {
            employeeInterviewScheduleCacheModel.createDate = Long.MIN_VALUE;
        }

        Date modifiedDate = getModifiedDate();

        if (modifiedDate != null) {
            employeeInterviewScheduleCacheModel.modifiedDate = modifiedDate.getTime();
        } else {
            employeeInterviewScheduleCacheModel.modifiedDate = Long.MIN_VALUE;
        }

        employeeInterviewScheduleCacheModel.note = getNote();

        String note = employeeInterviewScheduleCacheModel.note;

        if ((note != null) && (note.length() == 0)) {
            employeeInterviewScheduleCacheModel.note = null;
        }

        return employeeInterviewScheduleCacheModel;
    }

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(19);

        sb.append("{employeeInterviewScheduleId=");
        sb.append(getEmployeeInterviewScheduleId());
        sb.append(", employeeId=");
        sb.append(getEmployeeId());
        sb.append(", interviewScheduleId=");
        sb.append(getInterviewScheduleId());
        sb.append(", groupId=");
        sb.append(getGroupId());
        sb.append(", companyId=");
        sb.append(getCompanyId());
        sb.append(", userId=");
        sb.append(getUserId());
        sb.append(", createDate=");
        sb.append(getCreateDate());
        sb.append(", modifiedDate=");
        sb.append(getModifiedDate());
        sb.append(", note=");
        sb.append(getNote());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(31);

        sb.append("<model><model-name>");
        sb.append("vn.com.ecopharma.hrm.model.EmployeeInterviewSchedule");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>employeeInterviewScheduleId</column-name><column-value><![CDATA[");
        sb.append(getEmployeeInterviewScheduleId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>employeeId</column-name><column-value><![CDATA[");
        sb.append(getEmployeeId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>interviewScheduleId</column-name><column-value><![CDATA[");
        sb.append(getInterviewScheduleId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>groupId</column-name><column-value><![CDATA[");
        sb.append(getGroupId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>companyId</column-name><column-value><![CDATA[");
        sb.append(getCompanyId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>userId</column-name><column-value><![CDATA[");
        sb.append(getUserId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>createDate</column-name><column-value><![CDATA[");
        sb.append(getCreateDate());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>modifiedDate</column-name><column-value><![CDATA[");
        sb.append(getModifiedDate());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>note</column-name><column-value><![CDATA[");
        sb.append(getNote());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}