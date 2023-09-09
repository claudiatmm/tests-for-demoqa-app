package com.testingT.steps;

import com.testingT.pages.BrowserWindowsPage;
import com.testingT.pojo.User;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;

public class StepBrowserWindowPage {


    @Autowired
    private BrowserWindowsPage browserWindowsPage;


    @Given("I click on New Tab button")
    public void clickOnNewTabButton() throws InterruptedException {
        browserWindowsPage.clickOnButtonOne();
    }

    @And("I click on new Window button")
    public void clickOnNewWindowButton() throws InterruptedException {
        browserWindowsPage.clickOnButtonTwo();
    }



//    @When("I click on message button")
//    public void iClickOnMessageButton() throws InterruptedException {
//        loginPage.clickOnMessageButton();
//    }
//
//    @And("I click on person name on Messenger")
//    public void clickOnPersonName() throws InterruptedException {
//        loginPage.clickOnPersonName();
//    }
//
//    @Then("I send a message {string} for {int} times")
//    public void sendMessage(String arg1, int arg2){
//        try {
//            loginPage.sendMessage(arg1, arg2);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//    }


}