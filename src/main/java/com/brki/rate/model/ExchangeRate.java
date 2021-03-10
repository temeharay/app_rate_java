package com.brki.rate.model;

public class ExchangeRate {
    private final String required;
    private final String base;
    private final int exchangeRate;

    public ExchangeRate(String required, String base, int exchangeRate) {
        this.required = required;
        this.base = base;
        this.exchangeRate = exchangeRate;
    }
}
