package com.regiewby.factories;

import org.openqa.selenium.WebDriver;

/**
 * @author regiewby on 25/02/22
 * @project at-web-boilerplate-cucumber
 */
public class DriverFactory {


    private static final DriverFactory instance  = new DriverFactory();
    ThreadLocal<WebDriver> driver = new ThreadLocal<>();

    private DriverFactory(){
    }

    public static DriverFactory getInstance() {
        return instance;
    }

    public WebDriver getDriver() {
        return driver.get();
    }

    public void setDriver(WebDriver webDriver) {
        driver.set(webDriver);
    }

    public void closeBrowser() {
        driver.get().close();
        driver.remove();
    }
}
