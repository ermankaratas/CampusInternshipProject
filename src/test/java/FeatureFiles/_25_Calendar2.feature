Feature: Play functionality


  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    Then  User should login successfully


  Scenario: As a student, I should  be able watch video on the Calendar page.
    Given As a Student  click CalendarMenu Button and Calendar
    When Student click previous button
    Then Student click on a ended course
    And Click to Recording Button and click Starting