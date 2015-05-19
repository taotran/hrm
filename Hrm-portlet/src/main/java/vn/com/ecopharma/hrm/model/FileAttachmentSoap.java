package vn.com.ecopharma.hrm.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link vn.com.ecopharma.hrm.service.http.FileAttachmentServiceSoap}.
 *
 * @author tvt
 * @see vn.com.ecopharma.hrm.service.http.FileAttachmentServiceSoap
 * @generated
 */
public class FileAttachmentSoap implements Serializable {
    private long _f_id;
    private long _groupId;
    private long _companyId;
    private long _userId;
    private Date _createDate;
    private Date _modifiedDate;
    private long _c_id;
    private String _name;
    private String _file_type;
    private long _size;
    private String _content;
    private String _attachment_type;

    public FileAttachmentSoap() {
    }

    public static FileAttachmentSoap toSoapModel(FileAttachment model) {
        FileAttachmentSoap soapModel = new FileAttachmentSoap();

        soapModel.setF_id(model.getF_id());
        soapModel.setGroupId(model.getGroupId());
        soapModel.setCompanyId(model.getCompanyId());
        soapModel.setUserId(model.getUserId());
        soapModel.setCreateDate(model.getCreateDate());
        soapModel.setModifiedDate(model.getModifiedDate());
        soapModel.setC_id(model.getC_id());
        soapModel.setName(model.getName());
        soapModel.setFile_type(model.getFile_type());
        soapModel.setSize(model.getSize());
        soapModel.setContent(model.getContent());
        soapModel.setAttachment_type(model.getAttachment_type());

        return soapModel;
    }

    public static FileAttachmentSoap[] toSoapModels(FileAttachment[] models) {
        FileAttachmentSoap[] soapModels = new FileAttachmentSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static FileAttachmentSoap[][] toSoapModels(FileAttachment[][] models) {
        FileAttachmentSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new FileAttachmentSoap[models.length][models[0].length];
        } else {
            soapModels = new FileAttachmentSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static FileAttachmentSoap[] toSoapModels(List<FileAttachment> models) {
        List<FileAttachmentSoap> soapModels = new ArrayList<FileAttachmentSoap>(models.size());

        for (FileAttachment model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new FileAttachmentSoap[soapModels.size()]);
    }

    public long getPrimaryKey() {
        return _f_id;
    }

    public void setPrimaryKey(long pk) {
        setF_id(pk);
    }

    public long getF_id() {
        return _f_id;
    }

    public void setF_id(long f_id) {
        _f_id = f_id;
    }

    public long getGroupId() {
        return _groupId;
    }

    public void setGroupId(long groupId) {
        _groupId = groupId;
    }

    public long getCompanyId() {
        return _companyId;
    }

    public void setCompanyId(long companyId) {
        _companyId = companyId;
    }

    public long getUserId() {
        return _userId;
    }

    public void setUserId(long userId) {
        _userId = userId;
    }

    public Date getCreateDate() {
        return _createDate;
    }

    public void setCreateDate(Date createDate) {
        _createDate = createDate;
    }

    public Date getModifiedDate() {
        return _modifiedDate;
    }

    public void setModifiedDate(Date modifiedDate) {
        _modifiedDate = modifiedDate;
    }

    public long getC_id() {
        return _c_id;
    }

    public void setC_id(long c_id) {
        _c_id = c_id;
    }

    public String getName() {
        return _name;
    }

    public void setName(String name) {
        _name = name;
    }

    public String getFile_type() {
        return _file_type;
    }

    public void setFile_type(String file_type) {
        _file_type = file_type;
    }

    public long getSize() {
        return _size;
    }

    public void setSize(long size) {
        _size = size;
    }

    public String getContent() {
        return _content;
    }

    public void setContent(String content) {
        _content = content;
    }

    public String getAttachment_type() {
        return _attachment_type;
    }

    public void setAttachment_type(String attachment_type) {
        _attachment_type = attachment_type;
    }
}
