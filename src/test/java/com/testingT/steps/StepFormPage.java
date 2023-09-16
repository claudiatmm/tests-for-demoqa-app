package com.testingT.steps;

import com.testingT.pages.RegistrationFormPage;
import com.testingT.pojo.RegistrationFormUser;
import com.testingT.pojo.User;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en_scouse.An;
import org.springframework.beans.factory.annotation.Autowired;

public class StepFormPage {


    RegistrationFormUser user = RegistrationFormUser.builder()
            .firstName("Andrei")
            .lastName("popescu")
            .userEmail("andrei.popescu@yahoo.com")
            .build();


    @Autowired
    private RegistrationFormPage registrationFormPage;

    @Given("I complete name and email")
    public void clickOnFirstAlert() throws InterruptedException {
       registrationFormPage.completeName(user);
    }

    @And("I click on the first checkBoox gender")
    public void clickOnBox() throws InterruptedException {
        registrationFormPage.clickOnCheckbox();
    }




}