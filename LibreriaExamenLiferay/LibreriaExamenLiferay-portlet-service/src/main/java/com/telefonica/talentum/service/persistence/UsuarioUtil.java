package com.telefonica.talentum.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import com.telefonica.talentum.model.Usuario;

import java.util.List;

/**
 * The persistence utility for the usuario service. This utility wraps {@link UsuarioPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see UsuarioPersistence
 * @see UsuarioPersistenceImpl
 * @generated
 */
public class UsuarioUtil {
    private static UsuarioPersistence _persistence;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
     */
    public static void clearCache() {
        getPersistence().clearCache();
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
     */
    public static void clearCache(Usuario usuario) {
        getPersistence().clearCache(usuario);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
     */
    public static long countWithDynamicQuery(DynamicQuery dynamicQuery)
        throws SystemException {
        return getPersistence().countWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
     */
    public static List<Usuario> findWithDynamicQuery(DynamicQuery dynamicQuery)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<Usuario> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<Usuario> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
     */
    public static Usuario update(Usuario usuario) throws SystemException {
        return getPersistence().update(usuario);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
     */
    public static Usuario update(Usuario usuario, ServiceContext serviceContext)
        throws SystemException {
        return getPersistence().update(usuario, serviceContext);
    }

    /**
    * Caches the usuario in the entity cache if it is enabled.
    *
    * @param usuario the usuario
    */
    public static void cacheResult(
        com.telefonica.talentum.model.Usuario usuario) {
        getPersistence().cacheResult(usuario);
    }

    /**
    * Caches the usuarios in the entity cache if it is enabled.
    *
    * @param usuarios the usuarios
    */
    public static void cacheResult(
        java.util.List<com.telefonica.talentum.model.Usuario> usuarios) {
        getPersistence().cacheResult(usuarios);
    }

    /**
    * Creates a new usuario with the primary key. Does not add the usuario to the database.
    *
    * @param userId the primary key for the new usuario
    * @return the new usuario
    */
    public static com.telefonica.talentum.model.Usuario create(long userId) {
        return getPersistence().create(userId);
    }

    /**
    * Removes the usuario with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param userId the primary key of the usuario
    * @return the usuario that was removed
    * @throws com.telefonica.talentum.NoSuchUsuarioException if a usuario with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.telefonica.talentum.model.Usuario remove(long userId)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.telefonica.talentum.NoSuchUsuarioException {
        return getPersistence().remove(userId);
    }

    public static com.telefonica.talentum.model.Usuario updateImpl(
        com.telefonica.talentum.model.Usuario usuario)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(usuario);
    }

    /**
    * Returns the usuario with the primary key or throws a {@link com.telefonica.talentum.NoSuchUsuarioException} if it could not be found.
    *
    * @param userId the primary key of the usuario
    * @return the usuario
    * @throws com.telefonica.talentum.NoSuchUsuarioException if a usuario with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.telefonica.talentum.model.Usuario findByPrimaryKey(
        long userId)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.telefonica.talentum.NoSuchUsuarioException {
        return getPersistence().findByPrimaryKey(userId);
    }

    /**
    * Returns the usuario with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param userId the primary key of the usuario
    * @return the usuario, or <code>null</code> if a usuario with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.telefonica.talentum.model.Usuario fetchByPrimaryKey(
        long userId) throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(userId);
    }

    /**
    * Returns all the usuarios.
    *
    * @return the usuarios
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.telefonica.talentum.model.Usuario> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
    }

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
    public static java.util.List<com.telefonica.talentum.model.Usuario> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
    }

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
    public static java.util.List<com.telefonica.talentum.model.Usuario> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the usuarios from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of usuarios.
    *
    * @return the number of usuarios
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    public static UsuarioPersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (UsuarioPersistence) PortletBeanLocatorUtil.locate(com.telefonica.talentum.service.ClpSerializer.getServletContextName(),
                    UsuarioPersistence.class.getName());

            ReferenceRegistry.registerReference(UsuarioUtil.class,
                "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setPersistence(UsuarioPersistence persistence) {
    }
}
