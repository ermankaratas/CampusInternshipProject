Feature: Attendance functionality

  Background: Login with valid username and password
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login successfully
    Given User clicks on the "Attendance" menu
    And User clicks "Attendance Excuses" button
    When User clicks "Add Attendance Excuse" button
    Then User should see "New Attendance Excuse" pop-up window

  Scenario: Excuse with Full Day selection
    Given User choose "Date Type" and select "Full Day"
    And User choose a date 2 days later
    And User types "I cannot attend" message
    When User clicks "Attach Files" button
    And User selects "From Local"
    And User enters the file path: "excuse1.pdf" to the computer
    And User clicks "Send" button
    Then User gets a confirmation message

  Scenario: Excuse with Date Range selection
    Given User choose "Date Type" and select "Date Range"
    And User choose a date 2 days later for 3 days
    And User types "I cannot attend" message
    When User clicks "Attach Files" button
    And User selects "From Local"
    And User enters the file path: "excuse1.pdf" to the computer
    And User clicks "Send" button
    Then User gets a confirmation message
