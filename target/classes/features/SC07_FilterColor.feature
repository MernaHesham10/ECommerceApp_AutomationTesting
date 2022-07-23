@SmokeTesting
Feature: user could filter with color

  Background: user has account
    Given user had an actual account
    And open home page again

  Scenario: user could filter product with color
    When user chooses Category and hover to open sub-Category

    And user can filter sub-Category with color

    Then user will find product with the selected color