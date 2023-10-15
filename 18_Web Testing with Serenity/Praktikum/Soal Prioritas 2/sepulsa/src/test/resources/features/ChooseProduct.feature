@ChooseProduct
Feature: Choose Product
  As an user
  I want to be able access phone credit product
  So that I can buy phone credit

  @userA
  Scenario: As user, I have be able to access phone credit product
    Given I am on the home page
    When I click pulsa icon
    And I enter valid phone number
    And I click nominal
    Then I am on the phone credit cart page