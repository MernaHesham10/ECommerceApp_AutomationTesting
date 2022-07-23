@SmokeTesting
Feature: user could select different tags

  Background: user has account
    Given user had an actual account
    And open home page again

  Scenario: Logged user could select different tags
    When user chooses Category and hover to open sub-Category
    And user chooses a popular tag
    And user will find products

    Then user chooses a different tag
    And user will find another different products