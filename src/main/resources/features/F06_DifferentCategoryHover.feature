@smoke
Feature: F06_DifferentCategoryHover | Logged user could select different Categories
  Scenario: user could hover to Apparel category then select Shoes subcategory
    Given user navigates to home page
    When user hover to Apparel category
    And user selects Shoes subcategory
    Then user should be redirected to subcategory page "https://demo.nopcommerce.com/shoes"
