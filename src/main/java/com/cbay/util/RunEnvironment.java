package com.cbay.util;

import org.openqa.selenium.WebDriver;

public class RunEnvironment {
    private static WebDriver webDriver;

    public static WebDriver getWebDriver() {
        return webDriver;
    }

    static void setWebDriver(WebDriver addingWebDriver) {
        webDriver = addingWebDriver;
    }
}
