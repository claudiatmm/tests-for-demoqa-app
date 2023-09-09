package com.testingT.steps;


import com.testingT.pages.AbstractPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

public class Hook extends AbstractPage {

    @Autowired
    private WebDriver driver;

//    @Value("${app.url}")
//    private String appUrl;
//
//    @Before
//    public void initializeTest() {
//        driver.navigate().to(appUrl);
//        driver.manage().window().maximize();
//    }

    @After
    public void TearDownTest() {
        driver.quit();
    }
}
