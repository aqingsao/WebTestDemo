package com.telstra.webtest.acceptance.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class BasePage {
    protected WebDriverWait wait;
    protected WebDriver webDriver;

    protected String getUrl() {
        return getHost() + getPath();
    }

    protected String getHost() {
        return "localhost:8080/WebTestDemo/";
    }

    protected abstract String getPath();

    public void setWebDriver(WebDriver webDriver) {
        this.webDriver = webDriver;
        this.wait = new WebDriverWait(webDriver, 60);
    }
}