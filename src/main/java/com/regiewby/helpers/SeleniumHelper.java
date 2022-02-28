package com.regiewby.helpers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * @author regiewby on 26/02/22
 * @project at-web-boilerplate-cucumber
 */
public class SeleniumHelper {

    private final WebDriver webDriver;

    public SeleniumHelper(WebDriver driver) {
        this.webDriver = driver;
    }

    public void click(By locator){
        webDriver.findElement(locator).click();
//        ExtentReportFactory.getInstance().getExtent().log(Status.PASS, "CLICK ==> "+locator);
    }

    public void sendKeys(By locator, String value){
        webDriver.findElement(locator).sendKeys(value);
//        ExtentReportFactory.getInstance().getExtent().log(Status.PASS, "SETTEXT ==> "+locator+ " || VALUES ==> "+value);
    }


}
