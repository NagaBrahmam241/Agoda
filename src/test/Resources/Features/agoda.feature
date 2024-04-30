Feature: Agoda Registration and Login

  Background:
    Given launch the chrome browser

  Scenario Outline: Register multiple users on Agoda platform
    When user is on the Agoda homepage
    When the user clicks on create account
    And enters the details "<first_name>","<last_name>","<email>","<password>","<confirm_password>"
    And clicks on the signup button
    Then username "<expected_username>" should be displayed
    Examples:
      | first_name | last_name | email | password | confirm_password | expected_username |
      | Naga       | Brahmam       | Naga@example.com   | pass1234  | pass1234          |Naga B.|
