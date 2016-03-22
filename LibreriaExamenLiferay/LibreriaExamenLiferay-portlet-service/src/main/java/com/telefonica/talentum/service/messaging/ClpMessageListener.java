package com.telefonica.talentum.service.messaging;

import com.liferay.portal.kernel.messaging.BaseMessageListener;
import com.liferay.portal.kernel.messaging.Message;

import com.telefonica.talentum.service.ClpSerializer;
import com.telefonica.talentum.service.UsuarioLocalServiceUtil;
import com.telefonica.talentum.service.UsuarioServiceUtil;


public class ClpMessageListener extends BaseMessageListener {
    public static String getServletContextName() {
        return ClpSerializer.getServletContextName();
    }

    @Override
    protected void doReceive(Message message) throws Exception {
        String command = message.getString("command");
        String servletContextName = message.getString("servletContextName");

        if (command.equals("undeploy") &&
                servletContextName.equals(getServletContextName())) {
            UsuarioLocalServiceUtil.clearService();

            UsuarioServiceUtil.clearService();
        }
    }
}
