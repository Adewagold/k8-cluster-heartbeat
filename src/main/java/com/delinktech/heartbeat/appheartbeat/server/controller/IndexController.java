package com.delinktech.heartbeat.appheartbeat.server.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * *  Created by Adewale Adeleye on 2020-08-04
 **/
@RestController
@RequestMapping("/api/v1/app-status/")
public class IndexController {

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<?> logApplicationStatus(){
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
