package com.regiewby.helpers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

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
    }

    public void sendKeys(By locator, String value){
        webDriver.findElement(locator).sendKeys(value);
    }

    public void elementShouldBeVisible(By locator){
        boolean isExist = webDriver.findElement(locator).isDisplayed();
        Assert.assertTrue(isExist);
    }

    public String getValue(By locator){
        return webDriver.findElement(locator).getText().trim();
    }

    public void expectEquals(String expected, String actual){
        Assert.assertEquals(expected,actual);
    }

    public void expectEquals(int expected, int actual){
        Assert.assertEquals(expected,actual);
    }

    public void expectEquals(boolean expected, boolean actual){
        Assert.assertEquals(expected,actual);
    }



}
