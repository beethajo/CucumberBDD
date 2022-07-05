Feature: Login In order to perform successful login

  Scenario Outline: In order to verify login to facebook
    Given user navigates to facebook website
    When user validates the home page title
    Then user entered the username "<username>"
    And user entered the password   "<password>"
    Then user should be successfully logged in

    Examples:
      |username  |password  |
      |valid     |valid     |
      |invalid   |invalid   |
