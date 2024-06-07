Feature: Calendar functionality

  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    Then  User should login successfully

@Calendar
  Scenario:As a student, I should not be able to attend a course that has not yet started on the Calendar page
    Given Student click Calendar Menu button and Weekly Course Plan
    When Student click an any course and verify course name information
    Then Student click on a course that is not published and verify teacher name information
