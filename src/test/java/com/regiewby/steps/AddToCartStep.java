package com.regiewby.steps;

import com.regiewby.factories.DriverFactory;
import com.regiewby.pages.HomePage;
import com.regiewby.pages.LoginPage;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

/**
 * @author regiewby on 28/02/22
 * @project at-web-boilerplate-cucumber
 */
public class AddToCartStep {

    WebDriver webDriver = DriverFactory.getInstance().getDriver();
    HomePage homePage = new HomePage(webDriver);
    LoginPage loginPage = new LoginPage(webDriver);


    @Given("I already in product list page")
    public void i_already_in_product_list_page() {
        loginPage.login("standard_user","secret_sauce");
        homePage.expectHomePage();
    }

    @When("I click button add to cart")
    public void i_click_button_add_to_cart() {
        homePage.clickAddToCart();
    }

    @Then("I should see the cart number increase by one")
    public void i_should_see_the_cart_number_increase_by_one() {
        homePage.expectCartNumber("1");
    }

}
