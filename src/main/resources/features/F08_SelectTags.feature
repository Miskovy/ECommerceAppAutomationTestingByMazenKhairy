@smoke
Feature: F08_SelectTags | Logged user could select different tags
  Scenario: user could select different tags to filter items
    Given user navigates to home page
    When this user hover to Apparel category
    And this user selects Shoes subcategory
    Then this user should be redirected to subcategory page "https://demo.nopcommerce.com/shoes"
    And this user clicks on one of the popular tags
    Then the tagged item appears
    And this user clicks on a different tag
    Then the different tagged item appears

