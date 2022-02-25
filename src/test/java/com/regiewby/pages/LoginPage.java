package com.regiewby.pages;

import com.regiewby.factories.DriverFactory;
import com.regiewby.helpers.SeleniumHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * @author regiewby on 26/02/22
 * @project at-web-boilerplate-cucumber
 */
public class LoginPage {

    By USERNAME = By.id("user-name");
    By PASSWORD = By.id("password");
    By LOGIN_BTN = By.id("login-button");

    WebDriver webDriver = DriverFactory.getInstance().getDriver();
    SeleniumHelper seleniumHelper = new SeleniumHelper(webDriver);

    public void input_username(String userName){
        seleniumHelper.SETTEXT(USERNAME, userName);
    }

    public void input_password(String password){
        seleniumHelper.SETTEXT(PASSWORD, password);
    }

    public void click_btn_login(){
        seleniumHelper.CLICK(LOGIN_BTN);

    }

}
