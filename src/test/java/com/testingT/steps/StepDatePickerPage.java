package com.testingT.steps;

import com.testingT.pages.DatePickerPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.springframework.beans.factory.annotation.Autowired;

public class StepDatePickerPage {


    @Autowired
    private DatePickerPage datePickerPage;


    @Given("I click on date picker button")
    public void clickOnFirstAlert() throws InterruptedException {
        datePickerPage.clickOnButtonDatePicker();
    }

    @And("I select month {string} and year {int}")
    public void selectYearAndMonth(String month, int year) throws InterruptedException {
        datePickerPage.selectDateAndYear(month, year);
    }

    @And("I select a day {int}")
    public void selectDay(int day){
        datePickerPage.selectDay(day);
    }

}