Feature: Fee functionality
  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login successfully

  Scenario:
    Given User hover over to the Finance link at the Hamburger menu on the homepage
    When User clicks on the My Finance

    Then User enters Payment page
    And User selects Provider for Payment
    Then User enters amount of paying
    And User enters data of payments
    Then User should see the Payment Verify Text successfully

    When User clicks on the Message Button
    Then User should click the last Payment
    And User click the last Payment Status
    Then User should see Verifying Text about the last Payment Status
