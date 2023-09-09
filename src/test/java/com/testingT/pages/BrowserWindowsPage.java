package com.testingT.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.springframework.stereotype.Component;

import java.util.Set;

import static org.testng.AssertJUnit.assertEquals;

@Component
public class BrowserWindowsPage extends AbstractPage {


    @FindBy(how = How.ID, using = "tabButton")
    private WebElement newTab;

    @FindBy(how = How.ID, using = "windowButton")
    private WebElement newWindow;

    @FindBy(how = How.ID, using = "messageWindowButton")
    private WebElement newWindowMessage;


    public BrowserWindowsPage clickOnButtonOne() throws InterruptedException {
        Thread.sleep(100);
        newTab.click();
        Thread.sleep(100);
        switchTabAndClose();
        return this;
    }

    private void switchTabAndClose() {
        Set<String> windows = driver.getWindowHandles();
        String mainwindow = driver.getWindowHandle();

        for (String handle: windows) {
            driver.switchTo().window(handle);
//            System.out.println("switched to "+driver.getTitle()+" Window");
            String pagetitle = driver.getTitle();
//            System.out.println(pagetitle + "aici");
            if(pagetitle.equalsIgnoreCase("")) {
                driver.close();
                System.out.println("Closed the  '"+pagetitle+"' Tab now ...");
            }
        }
        driver.switchTo().window(mainwindow);
    }


    public BrowserWindowsPage clickOnButtonTwo() throws InterruptedException {
        Thread.sleep(1000);
        newWindow.click();
        Thread.sleep(1000);
        switchTabAndClose();
        Thread.sleep(1000);
        return this;
    }


}