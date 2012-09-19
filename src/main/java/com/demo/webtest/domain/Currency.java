package com.demo.webtest.domain;

public enum Currency {
    RMB(1, "Chinese Yuan"), AUD(6, "Australia Dollar");
    private int rate;
    private String description;

    Currency(int rate, String description) {
        this.rate = rate;
        this.description = description;
    }

    public double getRate(Currency to) {
        return this.getRate() * 1.0 / to.getRate();
    }

    public String getDescription() {
        return description;
    }

    public int getRate() {
        return rate;
    }
}
