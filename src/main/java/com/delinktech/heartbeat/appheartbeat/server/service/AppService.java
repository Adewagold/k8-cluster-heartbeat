package com.delinktech.heartbeat.appheartbeat.server.service;

import com.delinktech.heartbeat.appheartbeat.server.model.App;

import java.util.List;

/**
 * *  Created by Adewale Adeleye on 2020-08-04
 **/
public interface AppService {
    App findByAppName(String appName);
    App saveApp(App application);
    List<App> allApplications();
}
