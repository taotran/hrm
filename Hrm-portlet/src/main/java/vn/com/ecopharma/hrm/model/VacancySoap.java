package vn.com.ecopharma.hrm.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link vn.com.ecopharma.hrm.service.http.VacancyServiceSoap}.
 *
 * @author tvt
 * @see vn.com.ecopharma.hrm.service.http.VacancyServiceSoap
 * @generated
 */
public class VacancySoap implements Serializable {
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

    public VacancySoap() {
    }

    public static VacancySoap toSoapModel(Vacancy model) {
        VacancySoap soapModel = new VacancySoap();

        soapModel.setV_id(model.getV_id());
        soapModel.setJobtitleId(model.getJobtitleId());
        soapModel.setName(model.getName());
        soapModel.setLocationId(model.getLocationId());
        soapModel.setDescription(model.getDescription());
        soapModel.setNo_of_positions(model.getNo_of_positions());
        soapModel.setVacancy_status(model.getVacancy_status());
        soapModel.setInsert_date(model.getInsert_date());
        soapModel.setUpdate_date(model.getUpdate_date());
        soapModel.setUser_id(model.getUser_id());
        soapModel.setGroup_id(model.getGroup_id());

        return soapModel;
    }

    public static VacancySoap[] toSoapModels(Vacancy[] models) {
        VacancySoap[] soapModels = new VacancySoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static VacancySoap[][] toSoapModels(Vacancy[][] models) {
        VacancySoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new VacancySoap[models.length][models[0].length];
        } else {
            soapModels = new VacancySoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static VacancySoap[] toSoapModels(List<Vacancy> models) {
        List<VacancySoap> soapModels = new ArrayList<VacancySoap>(models.size());

        for (Vacancy model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new VacancySoap[soapModels.size()]);
    }

    public long getPrimaryKey() {
        return _v_id;
    }

    public void setPrimaryKey(long pk) {
        setV_id(pk);
    }

    public long getV_id() {
        return _v_id;
    }

    public void setV_id(long v_id) {
        _v_id = v_id;
    }

    public long getJobtitleId() {
        return _jobtitleId;
    }

    public void setJobtitleId(long jobtitleId) {
        _jobtitleId = jobtitleId;
    }

    public String getName() {
        return _name;
    }

    public void setName(String name) {
        _name = name;
    }

    public long getLocationId() {
        return _locationId;
    }

    public void setLocationId(long locationId) {
        _locationId = locationId;
    }

    public String getDescription() {
        return _description;
    }

    public void setDescription(String description) {
        _description = description;
    }

    public int getNo_of_positions() {
        return _no_of_positions;
    }

    public void setNo_of_positions(int no_of_positions) {
        _no_of_positions = no_of_positions;
    }

    public String getVacancy_status() {
        return _vacancy_status;
    }

    public void setVacancy_status(String vacancy_status) {
        _vacancy_status = vacancy_status;
    }

    public Date getInsert_date() {
        return _insert_date;
    }

    public void setInsert_date(Date insert_date) {
        _insert_date = insert_date;
    }

    public Date getUpdate_date() {
        return _update_date;
    }

    public void setUpdate_date(Date update_date) {
        _update_date = update_date;
    }

    public long getUser_id() {
        return _user_id;
    }

    public void setUser_id(long user_id) {
        _user_id = user_id;
    }

    public long getGroup_id() {
        return _group_id;
    }

    public void setGroup_id(long group_id) {
        _group_id = group_id;
    }
}
