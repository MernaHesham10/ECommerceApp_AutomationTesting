@SmokeTesting
Feature: Login Page

  Scenario: User could log in with valid email and password

    Given user had an actual account
    And user goes to home page

    When user pressed on Log-in link in the header
    And user enters email address in login page
    And user enters password
    And user pressed on Log-in button

    Then user log-in successfully
    And user pressed on Log-out link