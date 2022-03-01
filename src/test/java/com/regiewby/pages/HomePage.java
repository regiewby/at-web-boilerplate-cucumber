package com.regiewby.pages;

import com.regiewby.factories.DriverFactory;
import com.regiewby.helpers.SeleniumHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * @project at-web-boilerplate-cucumber
 * @author regiewby on 28/02/22
 */

public class HomePage {

    By IMG_SHOPPING_CART = By.xpath("//a[@class='shopping_cart_link']");
    By SHOPPING_CART_BADGE = By.xpath("//span[@class='shopping_cart_badge']");
    By BTN_ADD_TO_CART = By.id("add-to-cart-sauce-labs-backpack");

    WebDriver webDriver = DriverFactory.getInstance().getDriver();
    SeleniumHelper seleniumHelper = new SeleniumHelper(webDriver);

    public void expectHomePage(){
        seleniumHelper.elementShouldBeVisible(IMG_SHOPPING_CART);
    }

    public void clickAddToCart(){
        seleniumHelper.click(BTN_ADD_TO_CART);
    }

    public void expectCartNumber(String expectedNumber){
        String value = seleniumHelper.getValue(SHOPPING_CART_BADGE);
        seleniumHelper.expectEquals(value, expectedNumber);
    }





}
