package com.telefonica.talentum.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.telefonica.talentum.service.http.UsuarioServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see com.telefonica.talentum.service.http.UsuarioServiceSoap
 * @generated
 */
public class UsuarioSoap implements Serializable {
    private long _groupId;
    private long _companyId;
    private long _userId;
    private String _userName;
    private Date _createDate;
    private Date _modifiedDate;

    public UsuarioSoap() {
    }

    public static UsuarioSoap toSoapModel(Usuario model) {
        UsuarioSoap soapModel = new UsuarioSoap();

        soapModel.setGroupId(model.getGroupId());
        soapModel.setCompanyId(model.getCompanyId());
        soapModel.setUserId(model.getUserId());
        soapModel.setUserName(model.getUserName());
        soapModel.setCreateDate(model.getCreateDate());
        soapModel.setModifiedDate(model.getModifiedDate());

        return soapModel;
    }

    public static UsuarioSoap[] toSoapModels(Usuario[] models) {
        UsuarioSoap[] soapModels = new UsuarioSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static UsuarioSoap[][] toSoapModels(Usuario[][] models) {
        UsuarioSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new UsuarioSoap[models.length][models[0].length];
        } else {
            soapModels = new UsuarioSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static UsuarioSoap[] toSoapModels(List<Usuario> models) {
        List<UsuarioSoap> soapModels = new ArrayList<UsuarioSoap>(models.size());

        for (Usuario model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new UsuarioSoap[soapModels.size()]);
    }

    public long getPrimaryKey() {
        return _userId;
    }

    public void setPrimaryKey(long pk) {
        setUserId(pk);
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

    public String getUserName() {
        return _userName;
    }

    public void setUserName(String userName) {
        _userName = userName;
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
}
