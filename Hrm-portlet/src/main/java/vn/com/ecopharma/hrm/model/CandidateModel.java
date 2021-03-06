package vn.com.ecopharma.hrm.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.trash.TrashHandler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.TrashedModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.trash.model.TrashEntry;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the Candidate service. Represents a row in the &quot;HRM_Recruitment_Candidate&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link vn.com.ecopharma.hrm.model.impl.CandidateModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link vn.com.ecopharma.hrm.model.impl.CandidateImpl}.
 * </p>
 *
 * @author tvt
 * @see Candidate
 * @see vn.com.ecopharma.hrm.model.impl.CandidateImpl
 * @see vn.com.ecopharma.hrm.model.impl.CandidateModelImpl
 * @generated
 */
public interface CandidateModel extends BaseModel<Candidate>, TrashedModel {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. All methods that expect a candidate model instance should use the {@link Candidate} interface instead.
     */

    /**
     * Returns the primary key of this candidate.
     *
     * @return the primary key of this candidate
     */
    public long getPrimaryKey();

    /**
     * Sets the primary key of this candidate.
     *
     * @param primaryKey the primary key of this candidate
     */
    public void setPrimaryKey(long primaryKey);

    /**
     * Returns the c_id of this candidate.
     *
     * @return the c_id of this candidate
     */
    public long getC_id();

    /**
     * Sets the c_id of this candidate.
     *
     * @param c_id the c_id of this candidate
     */
    public void setC_id(long c_id);

    /**
     * Returns the first_name of this candidate.
     *
     * @return the first_name of this candidate
     */
    @AutoEscape
    public String getFirst_name();

    /**
     * Sets the first_name of this candidate.
     *
     * @param first_name the first_name of this candidate
     */
    public void setFirst_name(String first_name);

    /**
     * Returns the middle_name of this candidate.
     *
     * @return the middle_name of this candidate
     */
    @AutoEscape
    public String getMiddle_name();

    /**
     * Sets the middle_name of this candidate.
     *
     * @param middle_name the middle_name of this candidate
     */
    public void setMiddle_name(String middle_name);

    /**
     * Returns the last_name of this candidate.
     *
     * @return the last_name of this candidate
     */
    @AutoEscape
    public String getLast_name();

    /**
     * Sets the last_name of this candidate.
     *
     * @param last_name the last_name of this candidate
     */
    public void setLast_name(String last_name);

    /**
     * Returns the email of this candidate.
     *
     * @return the email of this candidate
     */
    @AutoEscape
    public String getEmail();

    /**
     * Sets the email of this candidate.
     *
     * @param email the email of this candidate
     */
    public void setEmail(String email);

    /**
     * Returns the contact_number of this candidate.
     *
     * @return the contact_number of this candidate
     */
    @AutoEscape
    public String getContact_number();

    /**
     * Sets the contact_number of this candidate.
     *
     * @param contact_number the contact_number of this candidate
     */
    public void setContact_number(String contact_number);

    /**
     * Returns the comment of this candidate.
     *
     * @return the comment of this candidate
     */
    @AutoEscape
    public String getComment();

    /**
     * Sets the comment of this candidate.
     *
     * @param comment the comment of this candidate
     */
    public void setComment(String comment);

    /**
     * Returns the mode_of_application of this candidate.
     *
     * @return the mode_of_application of this candidate
     */
    public int getMode_of_application();

    /**
     * Sets the mode_of_application of this candidate.
     *
     * @param mode_of_application the mode_of_application of this candidate
     */
    public void setMode_of_application(int mode_of_application);

    /**
     * Returns the date_of_application of this candidate.
     *
     * @return the date_of_application of this candidate
     */
    public Date getDate_of_application();

    /**
     * Sets the date_of_application of this candidate.
     *
     * @param date_of_application the date_of_application of this candidate
     */
    public void setDate_of_application(Date date_of_application);

    /**
     * Returns the cv_file_id of this candidate.
     *
     * @return the cv_file_id of this candidate
     */
    public long getCv_file_id();

    /**
     * Sets the cv_file_id of this candidate.
     *
     * @param cv_file_id the cv_file_id of this candidate
     */
    public void setCv_file_id(long cv_file_id);

    /**
     * Returns the cv_text_version of this candidate.
     *
     * @return the cv_text_version of this candidate
     */
    @AutoEscape
    public String getCv_text_version();

    /**
     * Sets the cv_text_version of this candidate.
     *
     * @param cv_text_version the cv_text_version of this candidate
     */
    public void setCv_text_version(String cv_text_version);

    /**
     * Returns the keywords of this candidate.
     *
     * @return the keywords of this candidate
     */
    @AutoEscape
    public String getKeywords();

    /**
     * Sets the keywords of this candidate.
     *
     * @param keywords the keywords of this candidate
     */
    public void setKeywords(String keywords);

    /**
     * Returns the added_person of this candidate.
     *
     * @return the added_person of this candidate
     */
    public int getAdded_person();

    /**
     * Sets the added_person of this candidate.
     *
     * @param added_person the added_person of this candidate
     */
    public void setAdded_person(int added_person);

    /**
     * Returns the candidate_status of this candidate.
     *
     * @return the candidate_status of this candidate
     */
    @AutoEscape
    public String getCandidate_status();

    /**
     * Sets the candidate_status of this candidate.
     *
     * @param candidate_status the candidate_status of this candidate
     */
    public void setCandidate_status(String candidate_status);

    /**
     * Returns the user_id of this candidate.
     *
     * @return the user_id of this candidate
     */
    public long getUser_id();

    /**
     * Sets the user_id of this candidate.
     *
     * @param user_id the user_id of this candidate
     */
    public void setUser_id(long user_id);

    /**
     * Returns the group_id of this candidate.
     *
     * @return the group_id of this candidate
     */
    public long getGroup_id();

    /**
     * Sets the group_id of this candidate.
     *
     * @param group_id the group_id of this candidate
     */
    public void setGroup_id(long group_id);

    /**
     * Returns the status of this candidate.
     *
     * @return the status of this candidate
     */
    @Override
    public int getStatus();

    /**
     * Returns the trash entry created when this candidate was moved to the Recycle Bin. The trash entry may belong to one of the ancestors of this candidate.
     *
     * @return the trash entry created when this candidate was moved to the Recycle Bin
     * @throws SystemException if a system exception occurred
     */
    @Override
    public TrashEntry getTrashEntry() throws PortalException, SystemException;

    /**
     * Returns the class primary key of the trash entry for this candidate.
     *
     * @return the class primary key of the trash entry for this candidate
     */
    @Override
    public long getTrashEntryClassPK();

    /**
     * Returns the trash handler for this candidate.
     *
     * @return the trash handler for this candidate
     */
    @Override
    public TrashHandler getTrashHandler();

    /**
     * Returns <code>true</code> if this candidate is in the Recycle Bin.
     *
     * @return <code>true</code> if this candidate is in the Recycle Bin; <code>false</code> otherwise
     */
    @Override
    public boolean isInTrash();

    /**
     * Returns <code>true</code> if the parent of this candidate is in the Recycle Bin.
     *
     * @return <code>true</code> if the parent of this candidate is in the Recycle Bin; <code>false</code> otherwise
     * @throws SystemException if a system exception occurred
     */
    @Override
    public boolean isInTrashContainer();

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
    public int compareTo(Candidate candidate);

    @Override
    public int hashCode();

    @Override
    public CacheModel<Candidate> toCacheModel();

    @Override
    public Candidate toEscapedModel();

    @Override
    public Candidate toUnescapedModel();

    @Override
    public String toString();

    @Override
    public String toXmlString();
}
