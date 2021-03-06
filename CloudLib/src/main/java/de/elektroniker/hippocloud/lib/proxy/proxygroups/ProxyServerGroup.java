package de.elektroniker.hippocloud.lib.proxy.proxygroups;

import de.elektroniker.hippocloud.lib.CloudLib;
import de.elektroniker.hippocloud.lib.proxy.proxyserver.ProxyServer;
import de.elektroniker.hippocloud.lib.wrapper.Wrapper;

import java.io.File;
import java.util.List;
import java.util.UUID;

/******************************************************************
 *    Urheberrechtshinweis                                                       
 *    Copyright © Thomas Michaelis 2019                                    
 *    Erstellt: 22.09.2019 / 13:08        
 *    Orginal Class: ServerGroup
******************************************************************/


public interface ProxyServerGroup {

    UUID getUUID();
    String getName();
    Wrapper getWrapper();
    boolean isMaintenance();
    String getMaintenanceMessage();
    int getMinMemory();
    int getMaxMemory();
    boolean isStatic();
    int getMinOnline();
    int getMaxOnline();
    default File getTemplateDirectory(){
        return new File("./local/templates/groups/proxys/" + getName() +"/");
    }


}
