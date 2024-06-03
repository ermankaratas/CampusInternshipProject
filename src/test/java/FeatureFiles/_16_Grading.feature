Feature: Grading functionality

  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login successfully

  Scenario: As a user, I should be able to see reviews about me
    Given Click on the Element in Dialog Content
      | grading           |
      | studentTranscript |
    And User should be able to see transcripts
    When Click on the Element in Dialog Content
      | transcriptBySubject |
    And User should be able to see subject
    And Click on the Element in Dialog Content
      | courseGrade |
    And User should be able to see grade
