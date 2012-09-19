package com.demo.webtest.form;

import com.demo.webtest.domain.Currency;

public class ExchangeFormBuilder {

    private Currency fromCurrency = Currency.AUD;
    private Currency toCurrency = Currency.RMB;
    private double toAmount = 0;
    private double fromAmount = 0;

    public ExchangeForm build() {
        ExchangeForm exchangeForm = new ExchangeForm();
        exchangeForm.setFromCurrency(fromCurrency.name());
        exchangeForm.setFromAmount(fromAmount);
        exchangeForm.setToCurrency(toCurrency.name());
        exchangeForm.setToAmount(toAmount);

        return exchangeForm;
    }
}
