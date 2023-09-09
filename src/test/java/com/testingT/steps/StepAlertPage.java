package com.testingT.steps;

import com.testingT.pages.AlertsPage;
import com.testingT.pages.BrowserWindowsPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.springframework.beans.factory.annotation.Autowired;

public class StepAlertPage {


    @Autowired
    private AlertsPage alertsPage;


    @Given("I click on first alert button")
    public void clickOnFirstAlert() throws InterruptedException {
       alertsPage.clickOnButtonOne();
    }


    @And("I click on the second alert button with 5 seconds wait")
    public void clickOnSecondAlert() throws InterruptedException {
        alertsPage.clickOnButtonTwo();
    }

    @And("I click on the third alert button")
    public void clickOnThirdAlert() throws InterruptedException {
        alertsPage.clickOnButtonThree();
    }

    @And("I click on the fourth alert button")
    public void clickOnFourthAlert() throws InterruptedException {
        alertsPage.clickOnButtonFourth();
    }




}