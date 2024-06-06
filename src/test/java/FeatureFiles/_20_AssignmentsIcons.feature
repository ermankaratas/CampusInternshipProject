Feature: Assignments icons functionality

  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    Then  User should login successfully
    When User hovers over the Assignments menu
    And User clicks on the "Assignments" menu
    Then User should go to "assignment" page successfully
    And user should see all the assignments

  Scenario:As a student, I should be able to perform my transactions faster by using shortcut buttons.
    Given User should see that each assignment has "Info" icon
    And User should see that each assignment has "Favorite" icon
    When User clicks a random "Info" icon
    Then User should go to "assignments" page successfully
    And User should return from the page
    When User clicks a random assignment
    Then User should go to "assignments" page successfully
    And User should return from the page
    And User clicks a random "Favorite" icon
    When User clicks on the "Submit" icon
    Then User should see "Submission" pop-up window
    And User should close the pop-up window
    When User clicks on the "Comment" icon
    Then User should see "Spanish" pop-up window