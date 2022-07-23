@SmokeTesting
Feature: Switch between currencies

  Background: user has account
    Given user had an actual account
    And open home page again

  Scenario: Guest User could switch between currencies US-Euro

    When user chooses from currency dropdown list

    Then verification process from currency