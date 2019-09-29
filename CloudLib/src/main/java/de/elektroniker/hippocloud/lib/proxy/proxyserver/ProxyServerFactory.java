package de.elektroniker.hippocloud.lib.proxy.proxyserver;

import de.elektroniker.hippocloud.lib.CloudLib;
import de.elektroniker.hippocloud.lib.proxy.proxygroups.ProxyServerGroup;

/******************************************************************
 *    Urheberrechtshinweis                                                       
 *    Copyright © Thomas Michaelis 2019                                    
 *    Erstellt: 22.09.2019 / 13:37        
 *    Orginal Class: GameServerFactory
 *
 *
 *    Alle Inhalte dieses Quelltextes sind urheberrechtlich geschützt.                    
 *    Das Urheberrecht liegt, soweit nicht ausdrücklich anders gekennzeichnet,       
 *    bei Thomas Michaelis. Alle Rechte vorbehalten.                      
 *
 *    Jede Art der Vervielfältigung, Verbreitung, Vermietung, Verleihung,        
 *    öffentlichen Zugänglichmachung oder andere Nutzung           
 *    bedarf der ausdrücklichen, schriftlichen Zustimmung von Thomas Michaelis.  
 ******************************************************************/


public interface ProxyServerFactory {

    void createProxyServer(CloudLib cloudLib, ProxyServerGroup proxyServerGroup, int amount);


}
