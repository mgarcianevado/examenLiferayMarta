package com.telefonica.talentum.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link UsuarioService}.
 *
 * @author Brian Wing Shun Chan
 * @see UsuarioService
 * @generated
 */
public class UsuarioServiceWrapper implements UsuarioService,
    ServiceWrapper<UsuarioService> {
    private UsuarioService _usuarioService;

    public UsuarioServiceWrapper(UsuarioService usuarioService) {
        _usuarioService = usuarioService;
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _usuarioService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _usuarioService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _usuarioService.invokeMethod(name, parameterTypes, arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public UsuarioService getWrappedUsuarioService() {
        return _usuarioService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedUsuarioService(UsuarioService usuarioService) {
        _usuarioService = usuarioService;
    }

    @Override
    public UsuarioService getWrappedService() {
        return _usuarioService;
    }

    @Override
    public void setWrappedService(UsuarioService usuarioService) {
        _usuarioService = usuarioService;
    }
}
