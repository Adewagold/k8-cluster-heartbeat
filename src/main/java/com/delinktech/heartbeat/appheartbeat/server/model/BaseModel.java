package com.delinktech.heartbeat.appheartbeat.server.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

/**
 * *  Created by Adewale Adeleye on 2020-08-04
 **/
@MappedSuperclass
public abstract class BaseModel {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
