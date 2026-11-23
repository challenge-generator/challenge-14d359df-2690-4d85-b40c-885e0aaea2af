package com.pragma;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import io.cucumber.spring.CucumberContextConfiguration;
import bdd.cucumber.AccountTestContext;

@SpringBootTest
@CucumberContextConfiguration
@Import({AccountTestContext.class})
class AppTest {

    @Test
    void contextLoads() {
        // This test ensures that the Spring context loads successfully
        // and is required for Cucumber to initialize the Spring context
    }
}