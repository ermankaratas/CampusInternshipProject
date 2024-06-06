Feature: Retrieve or permanently delete messages

  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login successfully
    When User hover over to the Messaging link at the Hamburger menu on the homepage

  Scenario:
    Then User should see the "Trash" menu
    When User clicks on the "Trash" menu
    Then User should go to "trash" page successfully
    And User should see the "trash-restore" icon on the page
    When User clicks on the "trash-restore" icon
    Then User gets a confirmation message
    When User clicks on the "garbage-box" icon
    Then User should see confirmation message on the pop-up window
    When User clicks on the "Delete" button on the pop-up window
    Then User gets a confirmation message




