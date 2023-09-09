package com.testingT.pages;

import jakarta.annotation.PostConstruct;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.springframework.beans.factory.annotation.Autowired;

public abstract class AbstractPage {

    @Autowired
    protected WebDriver driver;

    @PostConstruct
    public void InitPage() {
        PageFactory.initElements(driver, this);
    }



}
