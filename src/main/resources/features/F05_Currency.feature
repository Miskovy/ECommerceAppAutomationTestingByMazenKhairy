@smoke
Feature: F05_Currency | Logged User could switch between currencies US-Euro
  Scenario: user could successfully select euro currency
    Given user navigates to home page
    When user select currency from dropdown list
    Then prices of shown items should be in euro currency