@LoginNegative
Feature: Login Negative
  As user
  I want to see home page
  So that I can buy product

  @userA
  Scenario: As user, I have be able prevented to login
    Given I am on the login page
    When I input valid username
    And I input invalid password
    And I click login button
    Then I can't go to home page
