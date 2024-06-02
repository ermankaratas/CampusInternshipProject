Feature:Finance

  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login successfully


  Scenario:    Given User hover over to the Finance link at the Hamburger menu on the homepage
    When User click MyFinance button
    Then User should see the Students Fees page successfully
    When User click Username line
    Then User click Fee-Balance Detail button
    And User should see Finance table on the window