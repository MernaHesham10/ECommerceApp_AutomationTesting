@SmokeTesting
Feature: user could Create Successful Order

  Background: User goes to homePage and do shopping
    Given open home page again
    And open shopping page

  Scenario: user could Create Successful Order

    When user agrees with terms and proceed to Checkout
    And user enters email address
    And user enters password
    And user pressed on Log-in button
    And user agrees with terms and proceed to Checkout
    And user types Billing address to Create Order
    And user confirms Billing address
    And user chooses Shipping Method to Continue
    And user chooses Payment Method to Continue
    And user fills out Payment Information

    Then user confirms his order
    And user checks order details
    And user saves invoice
    And user prints invoice