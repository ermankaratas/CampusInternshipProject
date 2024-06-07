Feature: Home functionality

  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login successfully
@Home @Smoke
  Scenario: Click Courses Functionality
    When Click Coures Button
    Then Should be Welcome
  @Home @Smoke
  Scenario: Click Calendar
    When User clicks on the "Calendar" menu
    Then User should see the todays Weekly Course Plan
  @Home @Smoke
  Scenario: Click Attendance
    When User clicks on the "Attendance" menu
    Then Should be Attendance word
  @Home @Smoke
  Scenario: Check Assignments Button
    When  Click Assignments button
    Then Should see Assifnments
  @Home @Smoke
  Scenario: Check Grading Button
    When Click Grading button
    Then Should see Grading
  @Home @Smoke
  Scenario: Check Hamburg Button
    When Click on the Element in Dialog Content
      | hamburgerMenu |
    Then Should see Messaging,Finance,Education,Video Conference,Surveyd
  @Home @Smoke
  Scenario: Check Chats Button
    When Click Chats button
    Then Should see Student_9_11A
  @Home @Smoke
  Scenario: Check Messages Button
    When Click Messages button
    Then Should see Messages window
  @Home @Smoke
  Scenario: Check Profile Button
    When Click Profile button
    Then Should see My Certificates,My Files,Change Password,Settings,Sign Out


