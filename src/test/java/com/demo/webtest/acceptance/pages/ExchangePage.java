package com.demo.webtest.acceptance.pages;

import com.demo.webtest.domain.Currency;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class ExchangePage extends BasePage {

    @CacheLookup
    private WebElement fromCurrency;

    @FindBy(name = "fromAmount")
    @CacheLookup
    private WebElement fromAmountElement;

    @CacheLookup
    private WebElement toCurrency;

    @FindBy(className = "errorMessage")
    @CacheLookup
    private WebElement errorMessage;

    @Override
    protected String getPath() {
        return "/exchange/";
    }

    public ExchangeResultPage exchange(Currency fromCurrencyValue, Currency toCurrencyValue, double fromAmount) {
        fromCurrency.findElement(By.cssSelector("option[value=" + fromCurrencyValue.name() + "]")).setSelected();

        fromAmountElement.clear();
        fromAmountElement.sendKeys(String.valueOf(fromAmount));

        toCurrency.findElement(By.cssSelector("option[value=" + toCurrencyValue.name() + "]")).setSelected();

        webDriver.findElement(By.cssSelector("form")).submit();

        return asPage(ExchangeResultPage.class);
    }

    public boolean hasErrorMessage(String message) {
        return errorMessage.getText().contains(message);
    }
}
