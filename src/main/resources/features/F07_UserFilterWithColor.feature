@smoke
Feature: F07_UserFilterWithColor | Logged user could filter with color
  Scenario: user could hover to Apparel category then select Shoes subcategory then selects Red color
    Given user navigates to home page
    When a user hover to Apparel category
    And a user selects Shoes subcategory
    Then a user should be redirected to subcategory page "https://demo.nopcommerce.com/shoes"
    And a user selects the Red color
    Then a Red color item appears
