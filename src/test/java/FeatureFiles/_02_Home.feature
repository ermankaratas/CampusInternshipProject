Feature: Home functionality
  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login successfully

    Scenario:
    When User clicks on the "CompanyLogo" icon
      Then User should be directed to the Company page page successfully