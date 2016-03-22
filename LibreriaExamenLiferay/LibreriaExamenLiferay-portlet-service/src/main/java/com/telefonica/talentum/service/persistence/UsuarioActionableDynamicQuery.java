package com.telefonica.talentum.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

import com.telefonica.talentum.model.Usuario;
import com.telefonica.talentum.service.UsuarioLocalServiceUtil;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public abstract class UsuarioActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public UsuarioActionableDynamicQuery() throws SystemException {
        setBaseLocalService(UsuarioLocalServiceUtil.getService());
        setClass(Usuario.class);

        setClassLoader(com.telefonica.talentum.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("userId");
    }
}
