Feature: Grading functionality
  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login successfully

  Scenario:
    Given User hover over to the Grading link on the homepage
    When User clicks on the Student Transcript

    Then User clics print button on the Student Transcript
    And User prints the opened Page
    Then User saves the File

    When User clicks on the Course Grade
    Then User clicks download button on the Course Grade
    And User prints the opened Page2
    Then User saves the File2