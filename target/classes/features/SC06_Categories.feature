@SmokeTesting
Feature: Categories
  Select Different Categories

  Background: user has account
    Given user had an actual account
    And open home page again

  Scenario: Guest user could select different Categories

    When user chooses category randomly

    Then user return to the choosed category page