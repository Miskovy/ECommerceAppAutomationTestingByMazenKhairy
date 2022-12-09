@smoke
Feature: F12_Order | Create successful Order
  Scenario: user creates a successful order
    Given user navigates to home page
    When user click on add to cart for the item "Apple MacBook Pro 13-inch"
    And user clicks again on the second add to cart
    Then success message is shown to inform user that item has been added to cart
    And color of success message should be "#4bb07a"
    Then user click on shopping cart
    Then user is redirected to shopping cart page "https://demo.nopcommerce.com/cart"
    And user clicks on agree button
    And user clicks on checkout button
    And user clicks on checkout as guest button
    Then user is redirected to "https://demo.nopcommerce.com/onepagecheckout#opc-billing"
    When the user enter first name "Mazen" and last name "Khairy"
    And the user enter email "mazentest@gmail.com"
    And the user enter the country "Egypt"
    And the user enter the city "Alexandria"
    And the user enter the address 1 "SidiBishr"
    And the user enter the zip/postal code "21611"
    And the user enter the phone number "01000000002"
    And the user clicks on continue button
    And the user clicks again on continue button
    And the user click on continue choosing to pay by cheque
    And the user clicks on continue button again
    Then the user finally confirms his order
    Then success message is shown
