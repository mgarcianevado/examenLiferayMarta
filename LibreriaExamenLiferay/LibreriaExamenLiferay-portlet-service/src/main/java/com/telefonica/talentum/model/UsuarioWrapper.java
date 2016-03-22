package com.telefonica.talentum.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Usuario}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Usuario
 * @generated
 */
public class UsuarioWrapper implements Usuario, ModelWrapper<Usuario> {
    private Usuario _usuario;

    public UsuarioWrapper(Usuario usuario) {
        _usuario = usuario;
    }

    @Override
    public Class<?> getModelClass() {
        return Usuario.class;
    }

    @Override
    public String getModelClassName() {
        return Usuario.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("groupId", getGroupId());
        attributes.put("companyId", getCompanyId());
        attributes.put("userId", getUserId());
        attributes.put("userName", getUserName());
        attributes.put("createDate", getCreateDate());
        attributes.put("modifiedDate", getModifiedDate());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
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

        String userName = (String) attributes.get("userName");

        if (userName != null) {
            setUserName(userName);
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

    /**
    * Returns the primary key of this usuario.
    *
    * @return the primary key of this usuario
    */
    @Override
    public long getPrimaryKey() {
        return _usuario.getPrimaryKey();
    }

    /**
    * Sets the primary key of this usuario.
    *
    * @param primaryKey the primary key of this usuario
    */
    @Override
    public void setPrimaryKey(long primaryKey) {
        _usuario.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the group ID of this usuario.
    *
    * @return the group ID of this usuario
    */
    @Override
    public long getGroupId() {
        return _usuario.getGroupId();
    }

    /**
    * Sets the group ID of this usuario.
    *
    * @param groupId the group ID of this usuario
    */
    @Override
    public void setGroupId(long groupId) {
        _usuario.setGroupId(groupId);
    }

    /**
    * Returns the company ID of this usuario.
    *
    * @return the company ID of this usuario
    */
    @Override
    public long getCompanyId() {
        return _usuario.getCompanyId();
    }

    /**
    * Sets the company ID of this usuario.
    *
    * @param companyId the company ID of this usuario
    */
    @Override
    public void setCompanyId(long companyId) {
        _usuario.setCompanyId(companyId);
    }

    /**
    * Returns the user ID of this usuario.
    *
    * @return the user ID of this usuario
    */
    @Override
    public long getUserId() {
        return _usuario.getUserId();
    }

    /**
    * Sets the user ID of this usuario.
    *
    * @param userId the user ID of this usuario
    */
    @Override
    public void setUserId(long userId) {
        _usuario.setUserId(userId);
    }

    /**
    * Returns the user uuid of this usuario.
    *
    * @return the user uuid of this usuario
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.lang.String getUserUuid()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _usuario.getUserUuid();
    }

    /**
    * Sets the user uuid of this usuario.
    *
    * @param userUuid the user uuid of this usuario
    */
    @Override
    public void setUserUuid(java.lang.String userUuid) {
        _usuario.setUserUuid(userUuid);
    }

    /**
    * Returns the user name of this usuario.
    *
    * @return the user name of this usuario
    */
    @Override
    public java.lang.String getUserName() {
        return _usuario.getUserName();
    }

    /**
    * Sets the user name of this usuario.
    *
    * @param userName the user name of this usuario
    */
    @Override
    public void setUserName(java.lang.String userName) {
        _usuario.setUserName(userName);
    }

    /**
    * Returns the create date of this usuario.
    *
    * @return the create date of this usuario
    */
    @Override
    public java.util.Date getCreateDate() {
        return _usuario.getCreateDate();
    }

    /**
    * Sets the create date of this usuario.
    *
    * @param createDate the create date of this usuario
    */
    @Override
    public void setCreateDate(java.util.Date createDate) {
        _usuario.setCreateDate(createDate);
    }

    /**
    * Returns the modified date of this usuario.
    *
    * @return the modified date of this usuario
    */
    @Override
    public java.util.Date getModifiedDate() {
        return _usuario.getModifiedDate();
    }

    /**
    * Sets the modified date of this usuario.
    *
    * @param modifiedDate the modified date of this usuario
    */
    @Override
    public void setModifiedDate(java.util.Date modifiedDate) {
        _usuario.setModifiedDate(modifiedDate);
    }

    @Override
    public boolean isNew() {
        return _usuario.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _usuario.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _usuario.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _usuario.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _usuario.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _usuario.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _usuario.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _usuario.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _usuario.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _usuario.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _usuario.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new UsuarioWrapper((Usuario) _usuario.clone());
    }

    @Override
    public int compareTo(com.telefonica.talentum.model.Usuario usuario) {
        return _usuario.compareTo(usuario);
    }

    @Override
    public int hashCode() {
        return _usuario.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<com.telefonica.talentum.model.Usuario> toCacheModel() {
        return _usuario.toCacheModel();
    }

    @Override
    public com.telefonica.talentum.model.Usuario toEscapedModel() {
        return new UsuarioWrapper(_usuario.toEscapedModel());
    }

    @Override
    public com.telefonica.talentum.model.Usuario toUnescapedModel() {
        return new UsuarioWrapper(_usuario.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _usuario.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _usuario.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _usuario.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof UsuarioWrapper)) {
            return false;
        }

        UsuarioWrapper usuarioWrapper = (UsuarioWrapper) obj;

        if (Validator.equals(_usuario, usuarioWrapper._usuario)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public Usuario getWrappedUsuario() {
        return _usuario;
    }

    @Override
    public Usuario getWrappedModel() {
        return _usuario;
    }

    @Override
    public void resetOriginalValues() {
        _usuario.resetOriginalValues();
    }
}
