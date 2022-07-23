@SmokeTesting
Feature: Search

  Background: user has account
    Given user had an actual account
    And open home page again

  Scenario: Guest User could search for any product using name
    # Search Steps Using Name
    When user presses on search box
    And write "apple" in the search box
    And user presses on search button

    Then user will find all related products

  Scenario: Guest User could search for any product using SKU
    # Search Steps Using SKU
    When user presses on search box
    And write "N_1020_LU" in the search box
    And user presses on search button

    Then user will find "Nokia Lumia 1020"