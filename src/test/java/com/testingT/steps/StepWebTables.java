package com.testingT.steps;

import com.testingT.pages.AlertsPage;
import com.testingT.pages.WebTablesPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.springframework.beans.factory.annotation.Autowired;

public class StepWebTables {


    @Autowired
    private WebTablesPage webTablesPage;


    @Given("I click on first add button")
    public void clickOnAddButton() throws InterruptedException {
        webTablesPage.clickOnAddButton();
    }

    @And("I complete the registration form")
    public void completeRForm() throws InterruptedException {
        webTablesPage.completeRegistrationForm();
    }








}