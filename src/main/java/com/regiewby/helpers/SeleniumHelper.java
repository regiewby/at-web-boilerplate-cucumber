package com.regiewby.helpers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * @author regiewby on 26/02/22
 * @project at-web-boilerplate-cucumber
 */
public class SeleniumHelper {

    private final WebDriver webDriver;

    public SeleniumHelper(WebDriver driver) {
        this.webDriver = driver;
    }

    public void CLICK(By locator){
        webDriver.findElement(locator).click();
    }

    public void SETTEXT(By locator, String value){
        webDriver.findElement(locator).sendKeys(value);
    }


}
