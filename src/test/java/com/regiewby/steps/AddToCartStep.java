package com.regiewby.steps;

import com.regiewby.pages.HomePage;
import com.regiewby.pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

/**
 * @author regiewby on 28/02/22
 * @project at-web-boilerplate-cucumber
 */
public class AddToCartStep {

    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();


    @Given("I already in product list page")
    public void i_already_in_product_list_page() {
        System.out.println("I already in product list page");
//        loginPage.loginSuccess();
    }

    @When("I click button add to cart")
    public void i_click_button_add_to_cart() {
        System.out.println("I click button add to cart");
//        homePage.clickAddToCart();
    }

    @Then("I should see the cart number increase by one")
    public void i_should_see_the_cart_number_increase_by_one() {
        System.out.println();
//        homePage.expectCartNumber("1");
    }

}
