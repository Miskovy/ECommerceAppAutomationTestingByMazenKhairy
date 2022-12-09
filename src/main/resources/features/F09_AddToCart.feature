@smoke
Feature: F09_AddToCart | Logged user could add different products to Shopping cart
  Scenario: user could add different products to Shopping cart
    Given user navigates to home page
    When the user hover to Apparel category
    And the user selects Shoes subcategory
    Then the user should be redirected to subcategory page "https://demo.nopcommerce.com/shoes"
    And the user clicks on add to cart button
    Then the total shopping cart items equals to 1



