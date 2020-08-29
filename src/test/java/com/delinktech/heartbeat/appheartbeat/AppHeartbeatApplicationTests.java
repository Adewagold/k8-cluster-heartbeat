package com.delinktech.heartbeat.appheartbeat;

import com.delinktech.heartbeat.appheartbeat.server.model.App;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.http.*;
import org.springframework.web.client.RestTemplate;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;
import java.util.Set;

@SpringBootTest
@EnableJpaRepositories
class AppHeartbeatApplicationTests {

    @Autowired
    RestTemplate restTemplate;

    @Test
    void contextLoads() {
    }

    @Test
    public void whenMonitorEndpoint_is_called_return_OK(){
        HttpHeaders headers = new HttpHeaders();
        HttpEntity<String> httpEntity = new HttpEntity<>(headers);
        ResponseEntity<String> response = restTemplate.exchange(getRootUrl()+"/monitor/heartbeat", HttpMethod.GET,httpEntity, String.class);
        Assert.assertEquals(HttpStatus.OK,response.getStatusCode());
    }

    private String getRootUrl(){
        return "localhost:8080";
    }
}
