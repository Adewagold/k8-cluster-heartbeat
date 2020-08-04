package com.delinktech.heartbeat.appheartbeat.client.request;

/**
 * *  Created by Adewale Adeleye on 2020-08-03
 **/
public class BaseResponse {
    private String responseCode;
    private String responseMessage;
    private int httpStatus;
    private String app_id;

    public String getResponseCode() {
        return responseCode;
    }

    public void setResponseCode(String responseCode) {
        this.responseCode = responseCode;
    }

    public String getResponseMessage() {
        return responseMessage;
    }

    public void setResponseMessage(String responseMessage) {
        this.responseMessage = responseMessage;
    }

    public int getHttpStatus() {
        return httpStatus;
    }

    public void setHttpStatus(int httpStatus) {
        this.httpStatus = httpStatus;
    }

    public String getApp_id() {
        return app_id;
    }

    public void setApp_id(String app_id) {
        this.app_id = app_id;
    }
}
