Feature: Add To Cart

  Scenario: As a user i should be able add product to cart
    Given I already in product list page
    When I click button add to cart
    Then I should see the cart number increase by one