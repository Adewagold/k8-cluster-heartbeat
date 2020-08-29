package com.delinktech.heartbeat.appheartbeat.server.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * *  Created by Adewale Adeleye on 2020-08-25
 **/
@Configuration
public class AppConfig {
    @Bean
    RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
