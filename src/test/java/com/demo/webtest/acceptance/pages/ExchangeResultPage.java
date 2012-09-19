package com.demo.webtest.acceptance.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class ExchangeResultPage extends BasePage {
    @FindBy(className = "toAmount")
    private WebElement toAmount;

    @Override
    protected String getPath() {
        return "/exchange";
    }

    public double getToAmount() {
        return Double.valueOf(toAmount.getText());
    }
}
