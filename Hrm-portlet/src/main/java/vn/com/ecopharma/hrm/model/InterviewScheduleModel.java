package vn.com.ecopharma.hrm.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the InterviewSchedule service. Represents a row in the &quot;HRM_Recruitment_InterviewSchedule&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link vn.com.ecopharma.hrm.model.impl.InterviewScheduleModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link vn.com.ecopharma.hrm.model.impl.InterviewScheduleImpl}.
 * </p>
 *
 * @author tvt
 * @see InterviewSchedule
 * @see vn.com.ecopharma.hrm.model.impl.InterviewScheduleImpl
 * @see vn.com.ecopharma.hrm.model.impl.InterviewScheduleModelImpl
 * @generated
 */
public interface InterviewScheduleModel extends BaseModel<InterviewSchedule> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. All methods that expect a interview schedule model instance should use the {@link InterviewSchedule} interface instead.
     */

    /**
     * Returns the primary key of this interview schedule.
     *
     * @return the primary key of this interview schedule
     */
    public long getPrimaryKey();

    /**
     * Sets the primary key of this interview schedule.
     *
     * @param primaryKey the primary key of this interview schedule
     */
    public void setPrimaryKey(long primaryKey);

    /**
     * Returns the interview schedule ID of this interview schedule.
     *
     * @return the interview schedule ID of this interview schedule
     */
    public long getInterviewScheduleId();

    /**
     * Sets the interview schedule ID of this interview schedule.
     *
     * @param interviewScheduleId the interview schedule ID of this interview schedule
     */
    public void setInterviewScheduleId(long interviewScheduleId);

    /**
     * Returns the vacancy candidate ID of this interview schedule.
     *
     * @return the vacancy candidate ID of this interview schedule
     */
    public long getVacancyCandidateId();

    /**
     * Sets the vacancy candidate ID of this interview schedule.
     *
     * @param vacancyCandidateId the vacancy candidate ID of this interview schedule
     */
    public void setVacancyCandidateId(long vacancyCandidateId);

    /**
     * Returns the interview ID of this interview schedule.
     *
     * @return the interview ID of this interview schedule
     */
    public long getInterviewId();

    /**
     * Sets the interview ID of this interview schedule.
     *
     * @param interviewId the interview ID of this interview schedule
     */
    public void setInterviewId(long interviewId);

    /**
     * Returns the interview date of this interview schedule.
     *
     * @return the interview date of this interview schedule
     */
    public Date getInterviewDate();

    /**
     * Sets the interview date of this interview schedule.
     *
     * @param interviewDate the interview date of this interview schedule
     */
    public void setInterviewDate(Date interviewDate);

    /**
     * Returns the interview time of this interview schedule.
     *
     * @return the interview time of this interview schedule
     */
    @AutoEscape
    public String getInterviewTime();

    /**
     * Sets the interview time of this interview schedule.
     *
     * @param interviewTime the interview time of this interview schedule
     */
    public void setInterviewTime(String interviewTime);

    /**
     * Returns the note of this interview schedule.
     *
     * @return the note of this interview schedule
     */
    @AutoEscape
    public String getNote();

    /**
     * Sets the note of this interview schedule.
     *
     * @param note the note of this interview schedule
     */
    public void setNote(String note);

    /**
     * Returns the group ID of this interview schedule.
     *
     * @return the group ID of this interview schedule
     */
    public long getGroupId();

    /**
     * Sets the group ID of this interview schedule.
     *
     * @param groupId the group ID of this interview schedule
     */
    public void setGroupId(long groupId);

    /**
     * Returns the company ID of this interview schedule.
     *
     * @return the company ID of this interview schedule
     */
    public long getCompanyId();

    /**
     * Sets the company ID of this interview schedule.
     *
     * @param companyId the company ID of this interview schedule
     */
    public void setCompanyId(long companyId);

    /**
     * Returns the user ID of this interview schedule.
     *
     * @return the user ID of this interview schedule
     */
    public long getUserId();

    /**
     * Sets the user ID of this interview schedule.
     *
     * @param userId the user ID of this interview schedule
     */
    public void setUserId(long userId);

    /**
     * Returns the user uuid of this interview schedule.
     *
     * @return the user uuid of this interview schedule
     * @throws SystemException if a system exception occurred
     */
    public String getUserUuid() throws SystemException;

    /**
     * Sets the user uuid of this interview schedule.
     *
     * @param userUuid the user uuid of this interview schedule
     */
    public void setUserUuid(String userUuid);

    /**
     * Returns the create date of this interview schedule.
     *
     * @return the create date of this interview schedule
     */
    public Date getCreateDate();

    /**
     * Sets the create date of this interview schedule.
     *
     * @param createDate the create date of this interview schedule
     */
    public void setCreateDate(Date createDate);

    /**
     * Returns the modified date of this interview schedule.
     *
     * @return the modified date of this interview schedule
     */
    public Date getModifiedDate();

    /**
     * Sets the modified date of this interview schedule.
     *
     * @param modifiedDate the modified date of this interview schedule
     */
    public void setModifiedDate(Date modifiedDate);

    @Override
    public boolean isNew();

    @Override
    public void setNew(boolean n);

    @Override
    public boolean isCachedModel();

    @Override
    public void setCachedModel(boolean cachedModel);

    @Override
    public boolean isEscapedModel();

    @Override
    public Serializable getPrimaryKeyObj();

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj);

    @Override
    public ExpandoBridge getExpandoBridge();

    @Override
    public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

    @Override
    public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

    @Override
    public void setExpandoBridgeAttributes(ServiceContext serviceContext);

    @Override
    public Object clone();

    @Override
    public int compareTo(InterviewSchedule interviewSchedule);

    @Override
    public int hashCode();

    @Override
    public CacheModel<InterviewSchedule> toCacheModel();

    @Override
    public InterviewSchedule toEscapedModel();

    @Override
    public InterviewSchedule toUnescapedModel();

    @Override
    public String toString();

    @Override
    public String toXmlString();
}