Feature: Calendar Course Plan functionality

  Background: Login with valid username and password
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login successfully

  Scenario:
    When User clicks on the "Calendar" menu
    Then User should see the todays Weekly Course Plan
    And User should see icons meanings
      | P | Published |
      | S | Started   |
      | E | Ended     |
      | C | Cancelled |
    When User clicks "calendarBtn" button
    Then User should see the "Google Calendar" page
    When User clicks "Weekly Course Plan" button
    Then User should see the todays Weekly Course Plan
    When User clicks "Forward" icon 2 times
    Then User should navigate "forward" in the calendar
    When User clicks "Today" icon
    Then User should see the todays Weekly Course Plan
    When User clicks "Backward" icon 4 times
    Then User should navigate "backward" in the calendar
    When User clicks on the course in the weekly course plan
    Then User should see "Course" pop-up window
