package com.demo.webtest.form;

import com.demo.webtest.domain.Currency;
import org.apache.commons.lang.builder.ToStringBuilder;

public class ExchangeForm {
    private Currency fromCurrency;
    private Currency toCurrency;
    private double fromAmount;
    private double toAmount;

    public Currency getFromCurrency() {
        return fromCurrency;
    }

    public void setFromCurrency(String fromCurrency) {
        this.fromCurrency = Currency.valueOf(fromCurrency);
    }

    public Currency getToCurrency() {
        return toCurrency;
    }

    public void setToCurrency(String toCurrency) {
        this.toCurrency = Currency.valueOf(toCurrency);
    }

    public double getFromAmount() {
        return fromAmount;
    }

    public void setFromAmount(double fromAmount) {
        this.fromAmount = fromAmount;
    }

    public double getToAmount() {
        return toAmount;
    }

    public void setToAmount(double toAmount) {
        this.toAmount = toAmount;
    }

    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}
