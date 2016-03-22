package com.telefonica.talentum.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import com.telefonica.talentum.model.Usuario;

/**
 * The persistence interface for the usuario service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see UsuarioPersistenceImpl
 * @see UsuarioUtil
 * @generated
 */
public interface UsuarioPersistence extends BasePersistence<Usuario> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link UsuarioUtil} to access the usuario persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Caches the usuario in the entity cache if it is enabled.
    *
    * @param usuario the usuario
    */
    public void cacheResult(com.telefonica.talentum.model.Usuario usuario);

    /**
    * Caches the usuarios in the entity cache if it is enabled.
    *
    * @param usuarios the usuarios
    */
    public void cacheResult(
        java.util.List<com.telefonica.talentum.model.Usuario> usuarios);

    /**
    * Creates a new usuario with the primary key. Does not add the usuario to the database.
    *
    * @param userId the primary key for the new usuario
    * @return the new usuario
    */
    public com.telefonica.talentum.model.Usuario create(long userId);

    /**
    * Removes the usuario with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param userId the primary key of the usuario
    * @return the usuario that was removed
    * @throws com.telefonica.talentum.NoSuchUsuarioException if a usuario with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.telefonica.talentum.model.Usuario remove(long userId)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.telefonica.talentum.NoSuchUsuarioException;

    public com.telefonica.talentum.model.Usuario updateImpl(
        com.telefonica.talentum.model.Usuario usuario)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the usuario with the primary key or throws a {@link com.telefonica.talentum.NoSuchUsuarioException} if it could not be found.
    *
    * @param userId the primary key of the usuario
    * @return the usuario
    * @throws com.telefonica.talentum.NoSuchUsuarioException if a usuario with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.telefonica.talentum.model.Usuario findByPrimaryKey(long userId)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.telefonica.talentum.NoSuchUsuarioException;

    /**
    * Returns the usuario with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param userId the primary key of the usuario
    * @return the usuario, or <code>null</code> if a usuario with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.telefonica.talentum.model.Usuario fetchByPrimaryKey(long userId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the usuarios.
    *
    * @return the usuarios
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.telefonica.talentum.model.Usuario> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the usuarios.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.telefonica.talentum.model.impl.UsuarioModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of usuarios
    * @param end the upper bound of the range of usuarios (not inclusive)
    * @return the range of usuarios
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.telefonica.talentum.model.Usuario> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the usuarios.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.telefonica.talentum.model.impl.UsuarioModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of usuarios
    * @param end the upper bound of the range of usuarios (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of usuarios
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.telefonica.talentum.model.Usuario> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the usuarios from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of usuarios.
    *
    * @return the number of usuarios
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}
