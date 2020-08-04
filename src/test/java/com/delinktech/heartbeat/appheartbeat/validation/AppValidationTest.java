package com.delinktech.heartbeat.appheartbeat.validation;

import com.delinktech.heartbeat.appheartbeat.server.model.App;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import java.util.Set;

import static com.delinktech.heartbeat.appheartbeat.constants.TestConstants.*;

/**
 * *  Created by Adewale Adeleye on 2020-08-04
 **/
public class AppValidationTest {
    @Autowired
    ValidatorFactory factory = Validation.buildDefaultValidatorFactory();

    @Autowired
    private Validator validator = factory.getValidator();


    @Test
    void whenAappValidationFails(){
        App application = new App(INVALID_APPLICATION_NAME,INVALID_ENDPOINT, VALID_APP_DESCRIPTION,1,INVALID_EMAIL);
        Set<ConstraintViolation<App>> valid = validator.validate(application);
        Assertions.assertNotEquals(0,valid.size());

    }

    @Test void whenAppValidationIsSuccessful(){
        App application = new App(VALID_APPLICATION_NAME,VALID_ENDPOINT, VALID_APP_DESCRIPTION,1,VALID_EMAIL);
        Set<ConstraintViolation<App>> valid = validator.validate(application);
        Assertions.assertNotEquals(0,valid.size());
    }

}
