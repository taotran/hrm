package vn.com.ecopharma.hrm.model.impl;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.util.PortalUtil;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import vn.com.ecopharma.hrm.model.Level;
import vn.com.ecopharma.hrm.model.LevelModel;
import vn.com.ecopharma.hrm.model.LevelSoap;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the Level service. Represents a row in the &quot;pf_Level&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link vn.com.ecopharma.hrm.model.LevelModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link LevelImpl}.
 * </p>
 *
 * @author tvt
 * @see LevelImpl
 * @see vn.com.ecopharma.hrm.model.Level
 * @see vn.com.ecopharma.hrm.model.LevelModel
 * @generated
 */
@JSON(strict = true)
public class LevelModelImpl extends BaseModelImpl<Level> implements LevelModel {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. All methods that expect a level model instance should use the {@link vn.com.ecopharma.hrm.model.Level} interface instead.
     */
    public static final String TABLE_NAME = "pf_Level";
    public static final Object[][] TABLE_COLUMNS = {
            { "levelId", Types.BIGINT },
            { "name", Types.VARCHAR },
            { "groupId", Types.BIGINT },
            { "companyId", Types.BIGINT },
            { "userId", Types.BIGINT },
            { "createDate", Types.TIMESTAMP },
            { "modifiedDate", Types.TIMESTAMP }
        };
    public static final String TABLE_SQL_CREATE = "create table pf_Level (levelId LONG not null primary key,name VARCHAR(75) null,groupId LONG,companyId LONG,userId LONG,createDate DATE null,modifiedDate DATE null)";
    public static final String TABLE_SQL_DROP = "drop table pf_Level";
    public static final String ORDER_BY_JPQL = " ORDER BY level.levelId ASC";
    public static final String ORDER_BY_SQL = " ORDER BY pf_Level.levelId ASC";
    public static final String DATA_SOURCE = "liferayDataSource";
    public static final String SESSION_FACTORY = "liferaySessionFactory";
    public static final String TX_MANAGER = "liferayTransactionManager";
    public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.entity.cache.enabled.vn.com.ecopharma.hrm.model.Level"),
            true);
    public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.finder.cache.enabled.vn.com.ecopharma.hrm.model.Level"),
            true);
    public static final boolean COLUMN_BITMASK_ENABLED = false;
    public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
                "lock.expiration.time.vn.com.ecopharma.hrm.model.Level"));
    private static ClassLoader _classLoader = Level.class.getClassLoader();
    private static Class<?>[] _escapedModelInterfaces = new Class[] { Level.class };
    private long _levelId;
    private String _name;
    private long _groupId;
    private long _companyId;
    private long _userId;
    private String _userUuid;
    private Date _createDate;
    private Date _modifiedDate;
    private Level _escapedModel;

    public LevelModelImpl() {
    }

    /**
     * Converts the soap model instance into a normal model instance.
     *
     * @param soapModel the soap model instance to convert
     * @return the normal model instance
     */
    public static Level toModel(LevelSoap soapModel) {
        if (soapModel == null) {
            return null;
        }

        Level model = new LevelImpl();

        model.setLevelId(soapModel.getLevelId());
        model.setName(soapModel.getName());
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
    public static List<Level> toModels(LevelSoap[] soapModels) {
        if (soapModels == null) {
            return null;
        }

        List<Level> models = new ArrayList<Level>(soapModels.length);

        for (LevelSoap soapModel : soapModels) {
            models.add(toModel(soapModel));
        }

        return models;
    }

    @Override
    public long getPrimaryKey() {
        return _levelId;
    }

    @Override
    public void setPrimaryKey(long primaryKey) {
        setLevelId(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _levelId;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Long) primaryKeyObj).longValue());
    }

    @Override
    public Class<?> getModelClass() {
        return Level.class;
    }

    @Override
    public String getModelClassName() {
        return Level.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("levelId", getLevelId());
        attributes.put("name", getName());
        attributes.put("groupId", getGroupId());
        attributes.put("companyId", getCompanyId());
        attributes.put("userId", getUserId());
        attributes.put("createDate", getCreateDate());
        attributes.put("modifiedDate", getModifiedDate());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long levelId = (Long) attributes.get("levelId");

        if (levelId != null) {
            setLevelId(levelId);
        }

        String name = (String) attributes.get("name");

        if (name != null) {
            setName(name);
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
    public long getLevelId() {
        return _levelId;
    }

    @Override
    public void setLevelId(long levelId) {
        _levelId = levelId;
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

    @Override
    public ExpandoBridge getExpandoBridge() {
        return ExpandoBridgeFactoryUtil.getExpandoBridge(getCompanyId(),
            Level.class.getName(), getPrimaryKey());
    }

    @Override
    public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
        ExpandoBridge expandoBridge = getExpandoBridge();

        expandoBridge.setAttributes(serviceContext);
    }

    @Override
    public Level toEscapedModel() {
        if (_escapedModel == null) {
            _escapedModel = (Level) ProxyUtil.newProxyInstance(_classLoader,
                    _escapedModelInterfaces, new AutoEscapeBeanHandler(this));
        }

        return _escapedModel;
    }

    @Override
    public Object clone() {
        LevelImpl levelImpl = new LevelImpl();

        levelImpl.setLevelId(getLevelId());
        levelImpl.setName(getName());
        levelImpl.setGroupId(getGroupId());
        levelImpl.setCompanyId(getCompanyId());
        levelImpl.setUserId(getUserId());
        levelImpl.setCreateDate(getCreateDate());
        levelImpl.setModifiedDate(getModifiedDate());

        levelImpl.resetOriginalValues();

        return levelImpl;
    }

    @Override
    public int compareTo(Level level) {
        long primaryKey = level.getPrimaryKey();

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

        if (!(obj instanceof Level)) {
            return false;
        }

        Level level = (Level) obj;

        long primaryKey = level.getPrimaryKey();

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
    public CacheModel<Level> toCacheModel() {
        LevelCacheModel levelCacheModel = new LevelCacheModel();

        levelCacheModel.levelId = getLevelId();

        levelCacheModel.name = getName();

        String name = levelCacheModel.name;

        if ((name != null) && (name.length() == 0)) {
            levelCacheModel.name = null;
        }

        levelCacheModel.groupId = getGroupId();

        levelCacheModel.companyId = getCompanyId();

        levelCacheModel.userId = getUserId();

        Date createDate = getCreateDate();

        if (createDate != null) {
            levelCacheModel.createDate = createDate.getTime();
        } else {
            levelCacheModel.createDate = Long.MIN_VALUE;
        }

        Date modifiedDate = getModifiedDate();

        if (modifiedDate != null) {
            levelCacheModel.modifiedDate = modifiedDate.getTime();
        } else {
            levelCacheModel.modifiedDate = Long.MIN_VALUE;
        }

        return levelCacheModel;
    }

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(15);

        sb.append("{levelId=");
        sb.append(getLevelId());
        sb.append(", name=");
        sb.append(getName());
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
        StringBundler sb = new StringBundler(25);

        sb.append("<model><model-name>");
        sb.append("vn.com.ecopharma.hrm.model.Level");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>levelId</column-name><column-value><![CDATA[");
        sb.append(getLevelId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>name</column-name><column-value><![CDATA[");
        sb.append(getName());
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
