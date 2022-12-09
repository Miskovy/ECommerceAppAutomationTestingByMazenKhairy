@smoke
Feature: F11_AddToComparelist | Logged user could add different products to compare list
  Scenario: user add an item to compare list
    Given user navigates to home page
    When user click on compare button for item "HTC One M8 Android L 5.0 Lollipop"
    And user click on compare button for item "Apple MacBook Pro 13-inch"
    Then success message is shown to inform user that item has been added to compare list
    And color of comparelist success message should be "#4bb07a"
    Then user click on compare list button on the bar to show the compared items
    Then user redirected to comparelist page "https://demo.nopcommerce.com/compareproducts"




