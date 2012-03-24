package com.telstra.webtest.acceptance.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class BasePage {
    protected WebDriver driver;
    protected WebDriverWait wait;
    protected PageFactory pageFactory;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 60);
    }

    public BasePage visitAndInit() {
        driver.get(getUrl());
        return this.init();
    }

    public BasePage init() {
        org.openqa.selenium.support.PageFactory.initElements(driver, this);
        return this;
    }

    protected String getUrl() {
        return getHost() + getPath();
    }

    protected abstract String getHost();

    protected abstract String getPath();

    protected void clickLink(String link) {
        WebElement retroClaim = driver.findElement(By.cssSelector(link));
        retroClaim.click();
    }
}