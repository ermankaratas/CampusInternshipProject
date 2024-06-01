Feature: Finance functionality

  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login successfully

  Scenario: User should be able to download the payment amount and remaining balance
    Given Click on the Element in Dialog Content
      | hamburgerMenu |
    When User clicks on the My Finance
    And Click on the Element in Dialog Content
      | threePointMenu |
      | excelReport    |


