package com.telefonica.talentum.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import com.telefonica.talentum.model.Usuario;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Usuario in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see Usuario
 * @generated
 */
public class UsuarioCacheModel implements CacheModel<Usuario>, Externalizable {
    public long groupId;
    public long companyId;
    public long userId;
    public String userName;
    public long createDate;
    public long modifiedDate;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(13);

        sb.append("{groupId=");
        sb.append(groupId);
        sb.append(", companyId=");
        sb.append(companyId);
        sb.append(", userId=");
        sb.append(userId);
        sb.append(", userName=");
        sb.append(userName);
        sb.append(", createDate=");
        sb.append(createDate);
        sb.append(", modifiedDate=");
        sb.append(modifiedDate);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public Usuario toEntityModel() {
        UsuarioImpl usuarioImpl = new UsuarioImpl();

        usuarioImpl.setGroupId(groupId);
        usuarioImpl.setCompanyId(companyId);
        usuarioImpl.setUserId(userId);

        if (userName == null) {
            usuarioImpl.setUserName(StringPool.BLANK);
        } else {
            usuarioImpl.setUserName(userName);
        }

        if (createDate == Long.MIN_VALUE) {
            usuarioImpl.setCreateDate(null);
        } else {
            usuarioImpl.setCreateDate(new Date(createDate));
        }

        if (modifiedDate == Long.MIN_VALUE) {
            usuarioImpl.setModifiedDate(null);
        } else {
            usuarioImpl.setModifiedDate(new Date(modifiedDate));
        }

        usuarioImpl.resetOriginalValues();

        return usuarioImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        groupId = objectInput.readLong();
        companyId = objectInput.readLong();
        userId = objectInput.readLong();
        userName = objectInput.readUTF();
        createDate = objectInput.readLong();
        modifiedDate = objectInput.readLong();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeLong(groupId);
        objectOutput.writeLong(companyId);
        objectOutput.writeLong(userId);

        if (userName == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(userName);
        }

        objectOutput.writeLong(createDate);
        objectOutput.writeLong(modifiedDate);
    }
}
