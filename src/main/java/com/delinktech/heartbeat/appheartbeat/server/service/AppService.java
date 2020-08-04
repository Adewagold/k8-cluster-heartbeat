package com.delinktech.heartbeat.appheartbeat.server.service;

import com.delinktech.heartbeat.appheartbeat.server.model.App;

/**
 * *  Created by Adewale Adeleye on 2020-08-04
 **/
public interface AppService {
    App findByAppName(String appName);
    void saveApp(App application);
}
