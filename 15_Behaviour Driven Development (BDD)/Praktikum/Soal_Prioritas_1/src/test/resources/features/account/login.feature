Feature: Login
  As a user
  I want to login
  so that i can access my homepage

  Scenario: Success login
    Given I go to login page
    When I input valid username and valid password
    And click login button
    Then I go to homepage

  Scenario: Failed Login with null username and valid password
    Given I go to login page
    When I input null username and valid password
    And click login button
    Then I will get error message null username

  Scenario: Failed Login with valid username and null password
    Given I go to login page
    When I input valid username and null password
    And click login button
    Then I will get error message null password

  Scenario: Failed Login with valid username and invalid password
    Given I go to login page
    When I input valid username and invalid password
    And click login button
    Then I will get error message invalid password

  Scenario: Failed Login with invalid username and valid password
    Given I go to login page
    When I input invalid username and valid password
    And click login button
    Then I will get error message invalid username

  Scenario: Failed Login with invalid username and invalid password
    Given I go to login page
    When I input invalid username and invalid password
    And click login button
    Then I will get error message invalid username and invalid password