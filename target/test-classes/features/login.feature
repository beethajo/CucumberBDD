Feature: Login In order to perform successful login

  Scenario: In order to verify login to facebook
    Given user navigates to facebook website
    When user validates the home page title
    Then user entered the username
    And user entered the password
    Then user should be successfully logged in

  Scenario: In order to verify login to facebook  as Invalid user
    Given user navigates to facebook website
    When user validates the home page title
    Then user entered the Invalid username
    And user entered the Invalid password
    Then user should not  successfully logged in