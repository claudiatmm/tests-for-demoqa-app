package com.testingT.steps;

import com.testingT.SpringBootBasicApplication;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = SpringBootBasicApplication.class)
public class CucumberSpringConfiguration {
}
