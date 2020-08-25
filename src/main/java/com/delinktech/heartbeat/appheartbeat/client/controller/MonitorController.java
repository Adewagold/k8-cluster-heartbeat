package com.delinktech.heartbeat.appheartbeat.client.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * *  Created by Adewale Adeleye on 2020-08-25
 **/
@RestController
@RequestMapping("/monitor/hearbeat")
public class MonitorController {
    @GetMapping
    public ResponseEntity<?> heartLink(){
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
