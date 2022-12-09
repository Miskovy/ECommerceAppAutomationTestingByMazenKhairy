@smoke
Feature: F03_ResetPass | User could reset his/her password successfully
  Scenario: guest user could successfully reset his/her password
    Given a user navigate to login page
    When user clicks on forgot password
    And user enter his/her login email "mazentest@example.com"
    And user clicks on recover
    Then a successful recovery message is displayed "Email with instructions has been sent to you."