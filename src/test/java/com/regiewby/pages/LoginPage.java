package com.regiewby.pages;

import com.regiewby.factories.DriverFactory;
import com.regiewby.helpers.SeleniumHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

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
        seleniumHelper.sendKeys(USERNAME, userName);
    }

    public void input_password(String password){
        seleniumHelper.sendKeys(PASSWORD, password);
    }

    public void click_btn_login(){
        seleniumHelper.click(LOGIN_BTN);
    }

    public void expectLoginPage(){
        seleniumHelper.elementShouldBeVisible(USERNAME);
    }

    public void loginSuccess(){
        expectLoginPage();
        input_password("standard_user");
        input_password("secret_sauce");
        click_btn_login();

        HomePage homePage = new HomePage();
        homePage.expectHomePage();
    }

}
