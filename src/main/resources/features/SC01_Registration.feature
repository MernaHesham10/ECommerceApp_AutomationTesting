@SmokeTesting
Feature: New User Could Create New Account By Going To Registration Page

  Scenario: Successfully, New User Could Register With Valid Data

    Given user goes to home page

    # Taking Data From User when Entering to Register Page
    When user pressed on Register link
    And user chooses gender
    And user enters first name
    And user enters last name
    And user chooses birth of date
    And user enters email address
    And user enters company name
    And user chooses Newsletter option
    And user enters password
    And user enters confirm password
    And user pressed on REGISTER button

    Then display "Your registration completed" message to user
    And user log-in successfully and log-out link appears in the header
    And user pressed on Log-out link

