package com.regiewby.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

/**
 * @author regiewby on 26/02/22
 * @project at-web-boilerplate-cucumber
 */
public class LoginPage {

    private WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "user-name")
    private WebElement txtUserName;

    @FindBy(id = "password")
    private WebElement txtPassword;

    @FindBy(id = "login-button")
    private WebElement btnLogin;

    public void inputUserName(String userName){
        txtUserName.sendKeys(userName);
    }

    public void inputPassword(String password){
        txtPassword.sendKeys(password);
    }

    public void clickBtnLogin(){
        btnLogin.click();
    }

    public void expectLoginPage(){
        txtUserName.isDisplayed();
        txtPassword.isDisplayed();
        btnLogin.isDisplayed();
    }

    public void login(String userName, String password){
        txtUserName.sendKeys(userName);
        txtPassword.sendKeys(password);
        btnLogin.click();
    }
}
