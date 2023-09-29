Feature: Login
  As a user
  I want to be able to log in
  So that I can access my account

  Scenario: Login with Valid Email and Password
    Given user has opened the Sepulsa login page
    When the user enters a valid email and password
    Then the system will direct the user to the main Sepulsa account page

  Scenario: Login with Invalid Email and Password
    Given that the user has opened the Sepulsa login page
    When the user enters an invalid email and password
    Then the system will display an error message The email or password you entered is incorrect