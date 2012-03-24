package com.telstra.webtest.utils;

public class MathUtils {
    public static double round(double value) {
        return Math.round(value * 100) / 100.0;
    }
}
