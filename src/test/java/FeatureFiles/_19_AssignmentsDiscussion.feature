Feature: Assignments discussion functionality

  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    Then  User should login successfully
    When User hovers over the Assignments menu
    And User clicks on the "Assignments" menu
    Then User should go to "assignment" page successfully
    And user should see all the assignments
  @Assignment @Smoke
  Scenario:As a student, I should be able to initiate a discussion related to the homework on the assignment submission page.
    When User clicks a random assignment
    Then User should see the discussion icon
    When User clicks on the "Discussion" icon
    And User clicks on the "Contacts" button on the pop-up window
    Then User should select a person to initiate the discussion
    When User clicks on the "Files" button on the pop-up window
    Then User enters the file path: "C:\Users\erman\..WORKSPACE\1_DEVOP\0_TESTER\02-PROJELER\INTERN-1\excuse1.pdf" to the computer
    When User sends the message "Hello, did you solve the homework?"
    Then User should not see any confirmation message
    And User should see the message text with date
    When User clicks on the "Discussion" icon
    And User clicks on the "Chats" button on the pop-up window
    Then User should see the previous discussions