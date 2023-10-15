@LoginNegative
Feature: Login Negative
  As user
  I want to see home page
  So that I can topup product

  @userA
  Scenario: As user, I have be able prevented to login
    Given I am on the non-account home pagee
    When I click signin home buttonn
    And I input invalid email
    And I input valid passwordd
    And I click Masuk buttonn
    Then I can't go to my account home page
