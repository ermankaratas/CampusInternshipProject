Feature: Deleting messages in the Outbox

  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login successfully

    Scenario:
      Given User clicks on Hamburger Menu>Messaging>Outbox link
      When User clicks on the trash icon
      Then User sees the Confirm pop up window
      And User clicks on the Yes button in pop up window
      Then User gets a confirmation message