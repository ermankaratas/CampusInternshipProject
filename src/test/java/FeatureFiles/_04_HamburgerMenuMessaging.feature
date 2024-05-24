Feature: Messaging functionality
  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login successfully
  Scenario:
    Given User hover over to the Messaging link at the Hamburger menu on the homepage
    When User clicks on the New Message
    Then User should see the New Message page successfully