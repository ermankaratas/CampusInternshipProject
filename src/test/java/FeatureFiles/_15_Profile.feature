Feature: Theme functionality

  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login successfully

  Scenario:User at least three different color options
  should be able to use
    Given Click on the Element in Dialog Content
      | profileSettings |
      | settings        |
      | arrowButton     |
      | indigoTheme     |
      | saveButton      |
    Then User gets a confirmation message



