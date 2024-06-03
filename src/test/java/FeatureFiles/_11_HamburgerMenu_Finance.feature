Feature: Finance functionality

  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login successfully
  Scenario: User should be able to make the payment amount of $235 using Stripe Infrastructure
    Given Click on the Element in Dialog Content
      | hamburgerMenu |
    When User clicks on the My Finance
    And User should be able to pay using Stripe
      | Student_image  |
      | StripeButton   |
      | payinFullRadio |
      | payRadio       |

    Then User determines as $ "235" and clicks the pay Button
    And User inputs their credit card information, and completes the payment
    Then User gets a confirmation message
