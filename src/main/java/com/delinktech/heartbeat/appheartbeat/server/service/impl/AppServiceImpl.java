package com.delinktech.heartbeat.appheartbeat.server.service.impl;

import com.delinktech.heartbeat.appheartbeat.server.model.App;
import com.delinktech.heartbeat.appheartbeat.server.repository.AppRepository;
import com.delinktech.heartbeat.appheartbeat.server.service.AppService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * *  Created by Adewale Adeleye on 2020-08-25
 **/
@Service
public class AppServiceImpl implements AppService {
    AppRepository appRepository;

    @Autowired
    public AppServiceImpl(AppRepository appRepository) {
        this.appRepository = appRepository;
    }

    @Override
    public App findByAppName(String appName) {
        return appRepository.findByName(appName);
    }

    @Override
    public App saveApp(App application) {
        App app = appRepository.save(application);
        return app;
    }

    @Override
    public List<App> allApplications() {
        return appRepository.findAll();
    }
}
