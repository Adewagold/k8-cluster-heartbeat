package com.delinktech.heartbeat.appheartbeat.server.controller;

import com.delinktech.heartbeat.appheartbeat.server.model.App;
import com.delinktech.heartbeat.appheartbeat.server.service.AppService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * *  Created by Adewale Adeleye on 2020-08-29
 **/
@RestController
@RequestMapping("/api/v1/app/")
public class AppController {
    private AppService appService;


    @Autowired
    public AppController(AppService appService) {
        this.appService = appService;
    }

    @GetMapping("create")
    public ResponseEntity<App> createApp(@RequestBody App app){
        return new ResponseEntity<App>(appService.saveApp(app), HttpStatus.CREATED);
    }

    @GetMapping("all")
    public ResponseEntity<?> getAllApplications(){
        return new ResponseEntity<>(appService.allApplications(), HttpStatus.OK);
    }

}
