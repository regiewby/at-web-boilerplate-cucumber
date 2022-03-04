package com.regiewby.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

/**
 * @project at-web-boilerplate-cucumber
 * @author regiewby on 28/02/22
 */

public class HomePage {

    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[@class='shopping_cart_link']")
    private WebElement IMG_SHOPPING_CART;

    @FindBy(xpath = "//span[@class='shopping_cart_badge']")
    private WebElement SHOPPING_CART_BADGE;

    @FindBy(id = "add-to-cart-sauce-labs-backpack")
    private WebElement BTN_ADD_TO_CART;

    public void expectHomePage(){
        IMG_SHOPPING_CART.isDisplayed();
    }

    public void clickAddToCart(){
        BTN_ADD_TO_CART.click();
    }

    public void expectCartNumber(String expectedNumber){
        String value = SHOPPING_CART_BADGE.getText();
        Assert.assertEquals(value, expectedNumber);
    }
}
