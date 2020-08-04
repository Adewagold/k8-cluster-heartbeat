package com.delinktech.heartbeat.appheartbeat.server.model;

import javax.persistence.Entity;
import javax.validation.constraints.*;
import java.util.Date;

/**
 * *  Created by Adewale Adeleye on 2020-08-04
 **/
@Entity
public class App extends BaseModel {

    @Size(max = 25, message = "Application name must not be more than 25")
    private String appName;

    @Size(max = 100, message = "Provide an endpoint that is less than 100 characters or use a url shortner")
    private String endpoint;

    private String description;

    @Min(value = 5, message = "Interval must be greater or equals to 5")
    @Max(value = 3600, message = "Interval must be lesser or equals to 3600")
    private Integer retryInterval;

    @Email
    private String email;
    private Date createdAt;
    private Date modifiedAt;

    public App() {
    }

    public App(String appName, String endpoint, String description, Integer retryInterval, String email) {
        this.appName = appName;
        this.endpoint = endpoint;
        this.description = description;
        this.retryInterval = retryInterval;
        this.email = email;
    }
    public String getAppName() {
        return appName;
    }

    public String getEndpoint() {
        return endpoint;
    }

    public String getDescription() {
        return description;
    }

    public Integer getRetryInterval() {
        return retryInterval;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public Date getModifiedAt() {
        return modifiedAt;
    }

}
