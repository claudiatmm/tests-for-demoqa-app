package com.testingT.pages;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.stereotype.Component;

import java.time.Duration;

import static org.testng.Assert.assertTrue;

@Component
public class WebTablesPage extends AbstractPage {


    @FindBy(how = How.ID, using = "addNewRecordButton")
    private WebElement addNewRecordButton ;

//    Registration Form
    @FindBy(how = How.ID, using = "firstName")
    private WebElement firstName;
    @FindBy(how = How.ID, using = "lastName")
    private WebElement lastName;
    @FindBy(how = How.ID, using = "userEmail")
    private WebElement userEmail;
    @FindBy(how = How.ID, using = "age")
    private WebElement age;
    @FindBy(how = How.ID, using = "salary")
    private WebElement salary;
    @FindBy(how = How.ID, using = "department")
    private WebElement department;
    @FindBy(how = How.ID, using = "submit")
    private WebElement submit;


    @FindBy(how = How.ID, using = "searchBox")
    private WebElement searchBox ;


    public WebTablesPage clickOnAddButton() throws InterruptedException {
        addNewRecordButton.click();
        Thread.sleep(1000);
        return this;
    }

    public WebTablesPage completeRegistrationForm() throws InterruptedException {
        firstName.sendKeys("Anton");
        Thread.sleep(1000);
        lastName.sendKeys("Pop");
        userEmail.sendKeys("test@test.com");
        age.sendKeys("25");
        salary.sendKeys("100");
        department.sendKeys("IT");
        Thread.sleep(1000);
        submit.click();
        return this;
    }







}