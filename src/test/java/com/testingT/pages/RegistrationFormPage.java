package com.testingT.pages;

import com.testingT.pojo.RegistrationFormUser;
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
public class RegistrationFormPage extends AbstractPage {


    @FindBy(how = How.ID, using = "firstName")
    private WebElement firstName ;

    @FindBy(how = How.ID, using = "lastName")
    private WebElement lastName;

    @FindBy(how = How.ID, using = "userEmail")
    private WebElement userEmail;

    @FindBy(how = How.XPATH, using = "//*[@id=\"gender-radio-1\"]")
    private WebElement genderOne;

    @FindBy(how = How.ID, using = "userNumber")
    private WebElement userNumber;

//    date and time
    @FindBy(how = How.ID, using = "dateOfBirthInput")
    private WebElement dateOfBirthInput;

    @FindBy(how = How.XPATH, using = "//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[1]")
    private WebElement dateOfBirthTextCalendar;


    @FindBy(how = How.ID, using = "subjectsInput")
    private WebElement subjectsInput;

    @FindBy(how = How.ID, using = " ---------------")
    private WebElement hobbiesWrapper;

    @FindBy(how = How.ID, using = " ---------------")
    private WebElement stateCityLabel;



    public RegistrationFormPage completeName(RegistrationFormUser user) throws InterruptedException {
        firstName.sendKeys(user.getFirstName());
        lastName.sendKeys(user.getLastName());
        userEmail.sendKeys(user.getUserEmail());
        Thread.sleep(1000);
        return this;
    }

    public RegistrationFormPage clickOnCheckbox() throws InterruptedException {
//        genderOne.isSelected();
        genderOne.click();
        Thread.sleep(1000);
        return this;
    }

    public RegistrationFormPage clickDateOfBirthInput(String dateOfBirth){
        dateOfBirthInput.click();
        String dateText = dateOfBirthTextCalendar.getText();

        while (!dateText.equals(dateOfBirth)){  // ?while
//            if(dateOfBirth < dateText)
        }

        return this;
    }



}