package com.telstra.webtest.domain;

public enum Currency {
    RMB(1, "Chinese Yuan"), USD(6, "Australia Dollar");
    private int rate;
    private String description;

    Currency(int rate, String description) {
        this.rate = rate;
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public int getRate() {
        return rate;
    }
}
