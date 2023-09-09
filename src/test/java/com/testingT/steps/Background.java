package com.testingT.steps;


import com.testingT.pages.AbstractPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

public class Background extends AbstractPage {

    @Autowired
    private WebDriver driver;

    @Given("I open the page with name {string}")
    public void initializeTest(String appUrl) {
        driver.navigate().to(appUrl);
        driver.manage().window().maximize();
    }

}
