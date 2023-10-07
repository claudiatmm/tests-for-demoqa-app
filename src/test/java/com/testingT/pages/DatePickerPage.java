package com.testingT.pages;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.springframework.stereotype.Component;

import java.time.Month;
import java.time.YearMonth;
import java.util.Locale;


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


    public DatePickerPage clickOnButtonDatePicker() throws InterruptedException {
        datepicker1.click();
        Thread.sleep(1000);
        return this;
    }


    public DatePickerPage selectDateAndYear(String monthInputAtString, int yearInput) throws InterruptedException {
        String currentMonthAtString = month.getText();
        int currentYear = Integer.parseInt(year.getText());

        Thread.sleep(1000);

        while (!(currentMonthAtString.equals(monthInputAtString) && currentYear==yearInput)){
            if(yearInput > currentYear ){
                nextButton.click();
            }
            if (yearInput < currentYear){
                prevButton.click();
            }

            if (yearInput== currentYear){
                Month targetMonth = Month.valueOf(monthInputAtString.toUpperCase(Locale.ROOT));
                Month currentMonth = Month.valueOf(currentMonthAtString.toUpperCase(Locale.ROOT));
               int r = targetMonth.compareTo(currentMonth);
                if (r > 0){
                    nextButton.click();
                }

                if (r <0){
                    prevButton.click();
                }
            }
            Thread.sleep(1000);

            currentMonthAtString = month.getText();
            currentYear = Integer.parseInt(year.getText());
        }

//        while (!(currentMonthAtString.equals(monthInputAtString) && currentYear==yearInput)){
//            if (currentYear >= yearInput){
//                prevButton.click();
//                currentMonthAtString = month.getText();
//                currentYear = Integer.parseInt(year.getText());
//            }
//            else if (currentYear <= yearInput){
//                    nextButton.click();
//                    currentMonthAtString = month.getText();
//                    currentYear = Integer.parseInt(year.getText());
//            }
//            Thread.sleep(1000);
//        }
        Assertions.assertEquals(datepickerTitle.getText(), (monthInputAtString +" " +yearInput));
        return this;
    }


    public DatePickerPage selectDay (int day){
        String xPathWithVariable = null;
        for(int i=1; i<=day; i++) {
            xPathWithVariable = "//td[@data-handler='selectDay']/a[text()="+"'"+i +"'"+ "]";
        }
        driver.findElement(By.xpath(xPathWithVariable)).click();
        Assertions.assertEquals(day, Integer.valueOf(driver.findElement(By.xpath(xPathWithVariable)).getText()));
        return  this;
    }


}