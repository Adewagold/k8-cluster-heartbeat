package com.delinktech.heartbeat.appheartbeat.server.repository;

import com.delinktech.heartbeat.appheartbeat.server.model.App;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * *  Created by Adewale Adeleye on 2020-08-04
 **/
@Repository
public interface AppRepository extends JpaRepository<App,Long> {
    App findByAppName(String appName);
}
