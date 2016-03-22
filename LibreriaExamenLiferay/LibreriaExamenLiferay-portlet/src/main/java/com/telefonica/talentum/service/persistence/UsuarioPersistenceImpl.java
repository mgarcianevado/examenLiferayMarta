package com.telefonica.talentum.service.persistence;

import com.liferay.portal.kernel.cache.CacheRegistryUtil;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.InstanceFactory;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.UnmodifiableList;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import com.telefonica.talentum.NoSuchUsuarioException;
import com.telefonica.talentum.model.Usuario;
import com.telefonica.talentum.model.impl.UsuarioImpl;
import com.telefonica.talentum.model.impl.UsuarioModelImpl;
import com.telefonica.talentum.service.persistence.UsuarioPersistence;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the usuario service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see UsuarioPersistence
 * @see UsuarioUtil
 * @generated
 */
public class UsuarioPersistenceImpl extends BasePersistenceImpl<Usuario>
    implements UsuarioPersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link UsuarioUtil} to access the usuario persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = UsuarioImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(UsuarioModelImpl.ENTITY_CACHE_ENABLED,
            UsuarioModelImpl.FINDER_CACHE_ENABLED, UsuarioImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(UsuarioModelImpl.ENTITY_CACHE_ENABLED,
            UsuarioModelImpl.FINDER_CACHE_ENABLED, UsuarioImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(UsuarioModelImpl.ENTITY_CACHE_ENABLED,
            UsuarioModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    private static final String _SQL_SELECT_USUARIO = "SELECT usuario FROM Usuario usuario";
    private static final String _SQL_COUNT_USUARIO = "SELECT COUNT(usuario) FROM Usuario usuario";
    private static final String _ORDER_BY_ENTITY_ALIAS = "usuario.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Usuario exists with the primary key ";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(UsuarioPersistenceImpl.class);
    private static Usuario _nullUsuario = new UsuarioImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<Usuario> toCacheModel() {
                return _nullUsuarioCacheModel;
            }
        };

    private static CacheModel<Usuario> _nullUsuarioCacheModel = new CacheModel<Usuario>() {
            @Override
            public Usuario toEntityModel() {
                return _nullUsuario;
            }
        };

    public UsuarioPersistenceImpl() {
        setModelClass(Usuario.class);
    }

    /**
     * Caches the usuario in the entity cache if it is enabled.
     *
     * @param usuario the usuario
     */
    @Override
    public void cacheResult(Usuario usuario) {
        EntityCacheUtil.putResult(UsuarioModelImpl.ENTITY_CACHE_ENABLED,
            UsuarioImpl.class, usuario.getPrimaryKey(), usuario);

        usuario.resetOriginalValues();
    }

    /**
     * Caches the usuarios in the entity cache if it is enabled.
     *
     * @param usuarios the usuarios
     */
    @Override
    public void cacheResult(List<Usuario> usuarios) {
        for (Usuario usuario : usuarios) {
            if (EntityCacheUtil.getResult(
                        UsuarioModelImpl.ENTITY_CACHE_ENABLED,
                        UsuarioImpl.class, usuario.getPrimaryKey()) == null) {
                cacheResult(usuario);
            } else {
                usuario.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all usuarios.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(UsuarioImpl.class.getName());
        }

        EntityCacheUtil.clearCache(UsuarioImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the usuario.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(Usuario usuario) {
        EntityCacheUtil.removeResult(UsuarioModelImpl.ENTITY_CACHE_ENABLED,
            UsuarioImpl.class, usuario.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    @Override
    public void clearCache(List<Usuario> usuarios) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (Usuario usuario : usuarios) {
            EntityCacheUtil.removeResult(UsuarioModelImpl.ENTITY_CACHE_ENABLED,
                UsuarioImpl.class, usuario.getPrimaryKey());
        }
    }

    /**
     * Creates a new usuario with the primary key. Does not add the usuario to the database.
     *
     * @param userId the primary key for the new usuario
     * @return the new usuario
     */
    @Override
    public Usuario create(long userId) {
        Usuario usuario = new UsuarioImpl();

        usuario.setNew(true);
        usuario.setPrimaryKey(userId);

        return usuario;
    }

    /**
     * Removes the usuario with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param userId the primary key of the usuario
     * @return the usuario that was removed
     * @throws com.telefonica.talentum.NoSuchUsuarioException if a usuario with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Usuario remove(long userId)
        throws NoSuchUsuarioException, SystemException {
        return remove((Serializable) userId);
    }

    /**
     * Removes the usuario with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the usuario
     * @return the usuario that was removed
     * @throws com.telefonica.talentum.NoSuchUsuarioException if a usuario with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Usuario remove(Serializable primaryKey)
        throws NoSuchUsuarioException, SystemException {
        Session session = null;

        try {
            session = openSession();

            Usuario usuario = (Usuario) session.get(UsuarioImpl.class,
                    primaryKey);

            if (usuario == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchUsuarioException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(usuario);
        } catch (NoSuchUsuarioException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected Usuario removeImpl(Usuario usuario) throws SystemException {
        usuario = toUnwrappedModel(usuario);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(usuario)) {
                usuario = (Usuario) session.get(UsuarioImpl.class,
                        usuario.getPrimaryKeyObj());
            }

            if (usuario != null) {
                session.delete(usuario);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (usuario != null) {
            clearCache(usuario);
        }

        return usuario;
    }

    @Override
    public Usuario updateImpl(com.telefonica.talentum.model.Usuario usuario)
        throws SystemException {
        usuario = toUnwrappedModel(usuario);

        boolean isNew = usuario.isNew();

        Session session = null;

        try {
            session = openSession();

            if (usuario.isNew()) {
                session.save(usuario);

                usuario.setNew(false);
            } else {
                session.merge(usuario);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

        if (isNew) {
            FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
        }

        EntityCacheUtil.putResult(UsuarioModelImpl.ENTITY_CACHE_ENABLED,
            UsuarioImpl.class, usuario.getPrimaryKey(), usuario);

        return usuario;
    }

    protected Usuario toUnwrappedModel(Usuario usuario) {
        if (usuario instanceof UsuarioImpl) {
            return usuario;
        }

        UsuarioImpl usuarioImpl = new UsuarioImpl();

        usuarioImpl.setNew(usuario.isNew());
        usuarioImpl.setPrimaryKey(usuario.getPrimaryKey());

        usuarioImpl.setGroupId(usuario.getGroupId());
        usuarioImpl.setCompanyId(usuario.getCompanyId());
        usuarioImpl.setUserId(usuario.getUserId());
        usuarioImpl.setUserName(usuario.getUserName());
        usuarioImpl.setCreateDate(usuario.getCreateDate());
        usuarioImpl.setModifiedDate(usuario.getModifiedDate());

        return usuarioImpl;
    }

    /**
     * Returns the usuario with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the usuario
     * @return the usuario
     * @throws com.telefonica.talentum.NoSuchUsuarioException if a usuario with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Usuario findByPrimaryKey(Serializable primaryKey)
        throws NoSuchUsuarioException, SystemException {
        Usuario usuario = fetchByPrimaryKey(primaryKey);

        if (usuario == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchUsuarioException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return usuario;
    }

    /**
     * Returns the usuario with the primary key or throws a {@link com.telefonica.talentum.NoSuchUsuarioException} if it could not be found.
     *
     * @param userId the primary key of the usuario
     * @return the usuario
     * @throws com.telefonica.talentum.NoSuchUsuarioException if a usuario with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Usuario findByPrimaryKey(long userId)
        throws NoSuchUsuarioException, SystemException {
        return findByPrimaryKey((Serializable) userId);
    }

    /**
     * Returns the usuario with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the usuario
     * @return the usuario, or <code>null</code> if a usuario with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Usuario fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        Usuario usuario = (Usuario) EntityCacheUtil.getResult(UsuarioModelImpl.ENTITY_CACHE_ENABLED,
                UsuarioImpl.class, primaryKey);

        if (usuario == _nullUsuario) {
            return null;
        }

        if (usuario == null) {
            Session session = null;

            try {
                session = openSession();

                usuario = (Usuario) session.get(UsuarioImpl.class, primaryKey);

                if (usuario != null) {
                    cacheResult(usuario);
                } else {
                    EntityCacheUtil.putResult(UsuarioModelImpl.ENTITY_CACHE_ENABLED,
                        UsuarioImpl.class, primaryKey, _nullUsuario);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(UsuarioModelImpl.ENTITY_CACHE_ENABLED,
                    UsuarioImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return usuario;
    }

    /**
     * Returns the usuario with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param userId the primary key of the usuario
     * @return the usuario, or <code>null</code> if a usuario with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Usuario fetchByPrimaryKey(long userId) throws SystemException {
        return fetchByPrimaryKey((Serializable) userId);
    }

    /**
     * Returns all the usuarios.
     *
     * @return the usuarios
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Usuario> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
    @Override
    public List<Usuario> findAll(int start, int end) throws SystemException {
        return findAll(start, end, null);
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
    @Override
    public List<Usuario> findAll(int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
            finderArgs = FINDER_ARGS_EMPTY;
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
            finderArgs = new Object[] { start, end, orderByComparator };
        }

        List<Usuario> list = (List<Usuario>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_USUARIO);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_USUARIO;

                if (pagination) {
                    sql = sql.concat(UsuarioModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<Usuario>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<Usuario>(list);
                } else {
                    list = (List<Usuario>) QueryUtil.list(q, getDialect(),
                            start, end);
                }

                cacheResult(list);

                FinderCacheUtil.putResult(finderPath, finderArgs, list);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return list;
    }

    /**
     * Removes all the usuarios from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (Usuario usuario : findAll()) {
            remove(usuario);
        }
    }

    /**
     * Returns the number of usuarios.
     *
     * @return the number of usuarios
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countAll() throws SystemException {
        Long count = (Long) FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
                FINDER_ARGS_EMPTY, this);

        if (count == null) {
            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(_SQL_COUNT_USUARIO);

                count = (Long) q.uniqueResult();

                FinderCacheUtil.putResult(FINDER_PATH_COUNT_ALL,
                    FINDER_ARGS_EMPTY, count);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_ALL,
                    FINDER_ARGS_EMPTY);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return count.intValue();
    }

    /**
     * Initializes the usuario persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.com.telefonica.talentum.model.Usuario")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<Usuario>> listenersList = new ArrayList<ModelListener<Usuario>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<Usuario>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(UsuarioImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
