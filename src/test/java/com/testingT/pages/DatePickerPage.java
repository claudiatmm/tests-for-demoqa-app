package com.testingT.pages;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.springframework.stereotype.Component;


@Component
public class DatePickerPage extends AbstractPage {


    @FindBy(how = How.ID, using = "datepicker1")
    private WebElement datepicker1 ;

    @FindBy(how = How.CLASS_NAME, using = "ui-datepicker-month")
    private WebElement month;

    @FindBy(how = How.CLASS_NAME, using = "ui-datepicker-year")
    private WebElement year;

    @FindBy(how = How.XPATH, using = "//*[@id=\"ui-datepicker-div\"]/div/a[1]")
    private WebElement prevButton;

    @FindBy(how = How.XPATH, using = "//*[@id=\"ui-datepicker-div\"]/div/a[2]")
    private WebElement nextButton;

    @FindBy(how = How.CLASS_NAME, using = "ui-datepicker-title")
    private WebElement datepickerTitle;

//    @FindBy(how = How.CLASS_NAME, using = "ui-datepicker-next ui-corner-all")
//    private WebElement nextButton;


    public DatePickerPage clickOnButtonDatePicker() throws InterruptedException {
        datepicker1.click();
        Thread.sleep(1000);
        return this;
    }


    public DatePickerPage selectDateAndYear(String monthInput, int yearInput) throws InterruptedException {
        String currentMonth = month.getText();
        int currentYear = Integer.parseInt(year.getText());

        Thread.sleep(1000);
        while (!(currentMonth.equals(monthInput) && currentYear==yearInput)){
            if (currentYear >= yearInput){
                prevButton.click();
                currentMonth = month.getText();
                currentYear = Integer.parseInt(year.getText());
            }
            else if (currentYear <= yearInput){
                    nextButton.click();
                    currentMonth = month.getText();
                    currentYear = Integer.parseInt(year.getText());
            }
            Thread.sleep(1000);
        }
        Assertions.assertEquals(datepickerTitle.getText(), (monthInput +" " +yearInput));
        return this;
    }


    public DatePickerPage selectDay (int day){
        String xPathWithVariable = null;
        for(int i=1; i<=day; i++) {
            xPathWithVariable = "//td[@data-handler='selectDay']/a[text()="+"'"+i +"'"+ "]";
        }
        driver.findElement(By.xpath(xPathWithVariable)).click();
//        driver.findElement(By.xpath("//td[@data-handler='selectDay']/a[text()='23']")).click();
        Assertions.assertEquals(day, Integer.valueOf(driver.findElement(By.xpath(xPathWithVariable)).getText()));
        return  this;
    }


}