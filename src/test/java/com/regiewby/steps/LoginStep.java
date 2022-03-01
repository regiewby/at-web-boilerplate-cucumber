package com.regiewby.steps;

import com.regiewby.pages.HomePage;
import com.regiewby.pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

/**
 * @author regiewby on 26/02/22
 * @project at-web-boilerplate-cucumber
 */
public class LoginStep {

    LoginPage loginPage = new LoginPage();

    @Given("I already in login page")
    public void i_already_in_login_page() {
        loginPage.expectLoginPage();
    }

    @When("I input the username field with standard_user")
    public void i_input_the_username_field_with_standard_user() {
        loginPage.input_username("standard_user");
    }

    @When("I input the password field with secret_sauce")
    public void i_input_the_password_field_with_secret_sauce() {
        loginPage.input_password("secret_sauce");
    }

    @When("I click button login")
    public void i_click_button_login() {
        loginPage.click_btn_login();
    }

    @When("I input the username field with problem_user")
    public void i_input_the_username_field_with_problem_user() {
        loginPage.input_username("problem_user");
    }

    @When("I input the username field with performance_glitch_user")
    public void i_input_the_username_field_with_performance_glitch_user() {
        loginPage.input_username("performance_glitch_user");
    }

    @Then("I should be able to redirect to homepage")
    public void i_should_be_able_to_redirect_to_homepage() {
        HomePage homePage = new HomePage();
        homePage.expectHomePage();
    }
}
