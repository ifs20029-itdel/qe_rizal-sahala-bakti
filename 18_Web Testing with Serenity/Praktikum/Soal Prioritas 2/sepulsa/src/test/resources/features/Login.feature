@Login
Feature: Login
  As user
  I want to see home page
  So that I can topup product

  @userA
  Scenario: As user, I have be able to success login
    Given I am on the non-account home page
    When I click signin home button
    And I input valid email
    And I input valid password
    And I click Masuk button
    Then I am on the my account home page
