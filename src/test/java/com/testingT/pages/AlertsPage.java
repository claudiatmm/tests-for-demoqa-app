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
public class AlertsPage extends AbstractPage {


    @FindBy(how = How.ID, using = "alertButton")
    private WebElement buttonAlertOne ;

    @FindBy(how = How.ID, using = "timerAlertButton")
    private WebElement buttonAlertTwo;

    @FindBy(how = How.ID, using = "confirmButton")
    private WebElement buttonAlertThree;

    @FindBy(how = How.ID, using = "promtButton")
    private WebElement buttonAlertFour;

    @FindBy(how = How.ID, using = "promptResult")
    private WebElement resultOnPageTwo;

    @FindBy(how = How.ID, using = "confirmResult")
    private WebElement resultOnPageOne;


    public AlertsPage clickOnButtonOne() throws InterruptedException {
//        Thread.sleep(100);
        buttonAlertOne.click();

        Alert alertaJs = driver.switchTo().alert();
        alertaJs.accept();
        Thread.sleep(1000);
        return this;
    }


    public AlertsPage clickOnButtonTwo() throws InterruptedException {
        Thread.sleep(100);
        buttonAlertTwo.click();
        Thread.sleep(100);

        Duration duration = Duration.ofSeconds(6);
        WebDriverWait wait  =  new WebDriverWait(driver, duration);
        wait.until(ExpectedConditions.alertIsPresent());

        Alert alertaJs = driver.switchTo().alert();
        alertaJs.accept();
        Thread.sleep(1000);
        return this;
    }


    public AlertsPage clickOnButtonThree() throws InterruptedException {
        buttonAlertThree.click();
        Alert alertaJs = driver.switchTo().alert();
        alertaJs.accept();
        Thread.sleep(1000);
        String actualAlertMessage = resultOnPageOne.getText();
        assertTrue(actualAlertMessage.contains("You selected Ok"));
        return this;
    }

    public AlertsPage clickOnButtonFourth() throws InterruptedException {
        buttonAlertFour.click();
        Alert alertaJs = driver.switchTo().alert();
        alertaJs.sendKeys("Test");
        alertaJs.accept();

        String expectedAlertMessage = "You entered Test";
        String actualAlertMessage = resultOnPageTwo.getText();
        Assertions.assertEquals(expectedAlertMessage, actualAlertMessage);
        System.out.println("here are results " + expectedAlertMessage +  actualAlertMessage);
        return this;
    }



}