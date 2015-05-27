package vn.com.ecopharma.hrm.model.impl;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.util.PortalUtil;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import vn.com.ecopharma.hrm.model.VacancyCandidate;
import vn.com.ecopharma.hrm.model.VacancyCandidateModel;
import vn.com.ecopharma.hrm.model.VacancyCandidateSoap;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the VacancyCandidate service. Represents a row in the &quot;HRM_Recruitment_VacancyCandidate&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link vn.com.ecopharma.hrm.model.VacancyCandidateModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link VacancyCandidateImpl}.
 * </p>
 *
 * @author tvt
 * @see VacancyCandidateImpl
 * @see vn.com.ecopharma.hrm.model.VacancyCandidate
 * @see vn.com.ecopharma.hrm.model.VacancyCandidateModel
 * @generated
 */
@JSON(strict = true)
public class VacancyCandidateModelImpl extends BaseModelImpl<VacancyCandidate>
    implements VacancyCandidateModel {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. All methods that expect a vacancy candidate model instance should use the {@link vn.com.ecopharma.hrm.model.VacancyCandidate} interface instead.
     */
    public static final String TABLE_NAME = "HRM_Recruitment_VacancyCandidate";
    public static final Object[][] TABLE_COLUMNS = {
            { "vacancyCandidateId", Types.BIGINT },
            { "c_id", Types.BIGINT },
            { "v_id", Types.BIGINT },
            { "groupId", Types.BIGINT },
            { "companyId", Types.BIGINT },
            { "userId", Types.BIGINT },
            { "createDate", Types.TIMESTAMP },
            { "modifiedDate", Types.TIMESTAMP }
        };
    public static final String TABLE_SQL_CREATE = "create table HRM_Recruitment_VacancyCandidate (vacancyCandidateId LONG not null primary key,c_id LONG,v_id LONG,groupId LONG,companyId LONG,userId LONG,createDate DATE null,modifiedDate DATE null)";
    public static final String TABLE_SQL_DROP = "drop table HRM_Recruitment_VacancyCandidate";
    public static final String ORDER_BY_JPQL = " ORDER BY vacancyCandidate.vacancyCandidateId ASC";
    public static final String ORDER_BY_SQL = " ORDER BY HRM_Recruitment_VacancyCandidate.vacancyCandidateId ASC";
    public static final String DATA_SOURCE = "liferayDataSource";
    public static final String SESSION_FACTORY = "liferaySessionFactory";
    public static final String TX_MANAGER = "liferayTransactionManager";
    public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.entity.cache.enabled.vn.com.ecopharma.hrm.model.VacancyCandidate"),
            true);
    public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.finder.cache.enabled.vn.com.ecopharma.hrm.model.VacancyCandidate"),
            true);
    public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.column.bitmask.enabled.vn.com.ecopharma.hrm.model.VacancyCandidate"),
            true);
    public static long C_ID_COLUMN_BITMASK = 1L;
    public static long V_ID_COLUMN_BITMASK = 2L;
    public static long VACANCYCANDIDATEID_COLUMN_BITMASK = 4L;
    public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
                "lock.expiration.time.vn.com.ecopharma.hrm.model.VacancyCandidate"));
    private static ClassLoader _classLoader = VacancyCandidate.class.getClassLoader();
    private static Class<?>[] _escapedModelInterfaces = new Class[] {
            VacancyCandidate.class
        };
    private long _vacancyCandidateId;
    private long _c_id;
    private long _originalC_id;
    private boolean _setOriginalC_id;
    private long _v_id;
    private long _originalV_id;
    private boolean _setOriginalV_id;
    private long _groupId;
    private long _companyId;
    private long _userId;
    private String _userUuid;
    private Date _createDate;
    private Date _modifiedDate;
    private long _columnBitmask;
    private VacancyCandidate _escapedModel;

    public VacancyCandidateModelImpl() {
    }

    /**
     * Converts the soap model instance into a normal model instance.
     *
     * @param soapModel the soap model instance to convert
     * @return the normal model instance
     */
    public static VacancyCandidate toModel(VacancyCandidateSoap soapModel) {
        if (soapModel == null) {
            return null;
        }

        VacancyCandidate model = new VacancyCandidateImpl();

        model.setVacancyCandidateId(soapModel.getVacancyCandidateId());
        model.setC_id(soapModel.getC_id());
        model.setV_id(soapModel.getV_id());
        model.setGroupId(soapModel.getGroupId());
        model.setCompanyId(soapModel.getCompanyId());
        model.setUserId(soapModel.getUserId());
        model.setCreateDate(soapModel.getCreateDate());
        model.setModifiedDate(soapModel.getModifiedDate());

        return model;
    }

    /**
     * Converts the soap model instances into normal model instances.
     *
     * @param soapModels the soap model instances to convert
     * @return the normal model instances
     */
    public static List<VacancyCandidate> toModels(
        VacancyCandidateSoap[] soapModels) {
        if (soapModels == null) {
            return null;
        }

        List<VacancyCandidate> models = new ArrayList<VacancyCandidate>(soapModels.length);

        for (VacancyCandidateSoap soapModel : soapModels) {
            models.add(toModel(soapModel));
        }

        return models;
    }

    @Override
    public long getPrimaryKey() {
        return _vacancyCandidateId;
    }

    @Override
    public void setPrimaryKey(long primaryKey) {
        setVacancyCandidateId(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _vacancyCandidateId;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Long) primaryKeyObj).longValue());
    }

    @Override
    public Class<?> getModelClass() {
        return VacancyCandidate.class;
    }

    @Override
    public String getModelClassName() {
        return VacancyCandidate.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("vacancyCandidateId", getVacancyCandidateId());
        attributes.put("c_id", getC_id());
        attributes.put("v_id", getV_id());
        attributes.put("groupId", getGroupId());
        attributes.put("companyId", getCompanyId());
        attributes.put("userId", getUserId());
        attributes.put("createDate", getCreateDate());
        attributes.put("modifiedDate", getModifiedDate());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long vacancyCandidateId = (Long) attributes.get("vacancyCandidateId");

        if (vacancyCandidateId != null) {
            setVacancyCandidateId(vacancyCandidateId);
        }

        Long c_id = (Long) attributes.get("c_id");

        if (c_id != null) {
            setC_id(c_id);
        }

        Long v_id = (Long) attributes.get("v_id");

        if (v_id != null) {
            setV_id(v_id);
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
    }

    @JSON
    @Override
    public long getVacancyCandidateId() {
        return _vacancyCandidateId;
    }

    @Override
    public void setVacancyCandidateId(long vacancyCandidateId) {
        _vacancyCandidateId = vacancyCandidateId;
    }

    @JSON
    @Override
    public long getC_id() {
        return _c_id;
    }

    @Override
    public void setC_id(long c_id) {
        _columnBitmask |= C_ID_COLUMN_BITMASK;

        if (!_setOriginalC_id) {
            _setOriginalC_id = true;

            _originalC_id = _c_id;
        }

        _c_id = c_id;
    }

    public long getOriginalC_id() {
        return _originalC_id;
    }

    @JSON
    @Override
    public long getV_id() {
        return _v_id;
    }

    @Override
    public void setV_id(long v_id) {
        _columnBitmask |= V_ID_COLUMN_BITMASK;

        if (!_setOriginalV_id) {
            _setOriginalV_id = true;

            _originalV_id = _v_id;
        }

        _v_id = v_id;
    }

    public long getOriginalV_id() {
        return _originalV_id;
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

    public long getColumnBitmask() {
        return _columnBitmask;
    }

    @Override
    public ExpandoBridge getExpandoBridge() {
        return ExpandoBridgeFactoryUtil.getExpandoBridge(getCompanyId(),
            VacancyCandidate.class.getName(), getPrimaryKey());
    }

    @Override
    public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
        ExpandoBridge expandoBridge = getExpandoBridge();

        expandoBridge.setAttributes(serviceContext);
    }

    @Override
    public VacancyCandidate toEscapedModel() {
        if (_escapedModel == null) {
            _escapedModel = (VacancyCandidate) ProxyUtil.newProxyInstance(_classLoader,
                    _escapedModelInterfaces, new AutoEscapeBeanHandler(this));
        }

        return _escapedModel;
    }

    @Override
    public Object clone() {
        VacancyCandidateImpl vacancyCandidateImpl = new VacancyCandidateImpl();

        vacancyCandidateImpl.setVacancyCandidateId(getVacancyCandidateId());
        vacancyCandidateImpl.setC_id(getC_id());
        vacancyCandidateImpl.setV_id(getV_id());
        vacancyCandidateImpl.setGroupId(getGroupId());
        vacancyCandidateImpl.setCompanyId(getCompanyId());
        vacancyCandidateImpl.setUserId(getUserId());
        vacancyCandidateImpl.setCreateDate(getCreateDate());
        vacancyCandidateImpl.setModifiedDate(getModifiedDate());

        vacancyCandidateImpl.resetOriginalValues();

        return vacancyCandidateImpl;
    }

    @Override
    public int compareTo(VacancyCandidate vacancyCandidate) {
        long primaryKey = vacancyCandidate.getPrimaryKey();

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

        if (!(obj instanceof VacancyCandidate)) {
            return false;
        }

        VacancyCandidate vacancyCandidate = (VacancyCandidate) obj;

        long primaryKey = vacancyCandidate.getPrimaryKey();

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
        VacancyCandidateModelImpl vacancyCandidateModelImpl = this;

        vacancyCandidateModelImpl._originalC_id = vacancyCandidateModelImpl._c_id;

        vacancyCandidateModelImpl._setOriginalC_id = false;

        vacancyCandidateModelImpl._originalV_id = vacancyCandidateModelImpl._v_id;

        vacancyCandidateModelImpl._setOriginalV_id = false;

        vacancyCandidateModelImpl._columnBitmask = 0;
    }

    @Override
    public CacheModel<VacancyCandidate> toCacheModel() {
        VacancyCandidateCacheModel vacancyCandidateCacheModel = new VacancyCandidateCacheModel();

        vacancyCandidateCacheModel.vacancyCandidateId = getVacancyCandidateId();

        vacancyCandidateCacheModel.c_id = getC_id();

        vacancyCandidateCacheModel.v_id = getV_id();

        vacancyCandidateCacheModel.groupId = getGroupId();

        vacancyCandidateCacheModel.companyId = getCompanyId();

        vacancyCandidateCacheModel.userId = getUserId();

        Date createDate = getCreateDate();

        if (createDate != null) {
            vacancyCandidateCacheModel.createDate = createDate.getTime();
        } else {
            vacancyCandidateCacheModel.createDate = Long.MIN_VALUE;
        }

        Date modifiedDate = getModifiedDate();

        if (modifiedDate != null) {
            vacancyCandidateCacheModel.modifiedDate = modifiedDate.getTime();
        } else {
            vacancyCandidateCacheModel.modifiedDate = Long.MIN_VALUE;
        }

        return vacancyCandidateCacheModel;
    }

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(17);

        sb.append("{vacancyCandidateId=");
        sb.append(getVacancyCandidateId());
        sb.append(", c_id=");
        sb.append(getC_id());
        sb.append(", v_id=");
        sb.append(getV_id());
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
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(28);

        sb.append("<model><model-name>");
        sb.append("vn.com.ecopharma.hrm.model.VacancyCandidate");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>vacancyCandidateId</column-name><column-value><![CDATA[");
        sb.append(getVacancyCandidateId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>c_id</column-name><column-value><![CDATA[");
        sb.append(getC_id());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>v_id</column-name><column-value><![CDATA[");
        sb.append(getV_id());
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

        sb.append("</model>");

        return sb.toString();
    }
}
