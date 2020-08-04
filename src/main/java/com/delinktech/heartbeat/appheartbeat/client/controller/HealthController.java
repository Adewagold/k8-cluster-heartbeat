package com.delinktech.heartbeat.appheartbeat.client.controller;

import com.delinktech.heartbeat.appheartbeat.client.request.BaseResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * *  Created by Adewale Adeleye on 2020-08-03
 **/
@RestController
@RequestMapping("/health/check-status")
public class HealthController {
    @Value("{heartbeat.app.id}")
    private String app_id;

    public ResponseEntity<BaseResponse> getHealthStatus(){
        BaseResponse baseResponse = new BaseResponse();
        baseResponse.setApp_id(app_id);
        baseResponse.setResponseMessage("Alive");
        baseResponse.setResponseCode("00");
        baseResponse.setHttpStatus(HttpStatus.OK.value());
        return new ResponseEntity<>(baseResponse, HttpStatus.OK);
    }
}
