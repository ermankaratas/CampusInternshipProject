Feature: Assignments functionality

  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    Then  User should login successfully


  Scenario:As a student,  I should be able to access all tasks assigned to me from a page.
    When User hovers over the Assignments menu
    Then User should see the total number of Assignments
    When User clicks on the "Assignments" menu
    Then User should go to "assignment" page successfully
    And user should see all the assignments
