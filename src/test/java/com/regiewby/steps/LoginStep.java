package com.regiewby.steps;

import com.regiewby.factories.DriverFactory;
import com.regiewby.pages.HomePage;
import com.regiewby.pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

/**
 * @author regiewby on 26/02/22
 * @project at-web-boilerplate-cucumber
 */
public class LoginStep {

    WebDriver webDriver = DriverFactory.getInstance().getDriver();
    LoginPage loginPage = new LoginPage(webDriver);

    @Given("I already in login page")
    public void i_already_in_login_page() {
        loginPage.expectLoginPage();
    }

    @When("I input the username field with standard_user")
    public void i_input_the_username_field_with_standard_user() {
        loginPage.inputUserName("standard_user");
    }

    @When("I input the password field with secret_sauce")
    public void i_input_the_password_field_with_secret_sauce() {
        loginPage.inputPassword("secret_sauce");
    }

    @When("I click button login")
    public void i_click_button_login() {
        loginPage.clickBtnLogin();
    }

    @When("I input the username field with problem_user")
    public void i_input_the_username_field_with_problem_user() {
        loginPage.inputUserName("problem_user");
    }

    @When("I input the username field with performance_glitch_user")
    public void i_input_the_username_field_with_performance_glitch_user() {
        loginPage.inputUserName("performance_glitch_user");
    }

    @Then("I should be able to redirect to homepage")
    public void i_should_be_able_to_redirect_to_homepage() {
        HomePage homePage = new HomePage(webDriver);
        homePage.expectHomePage();

    }
}
