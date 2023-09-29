Feature: My network
  As a user
  I want to see my network invitation
  So that i can connect to them

  Scenario: see account profile that just connected with me
    Given I go to button my network
    When I click accept
    And I click the account profile that just connected with me
    Then I see the account profile that just connected with me

  Scenario: see account that i ignored
    Given I go to button my network
    When I click ignore
    And I click the account profile that just ignored by me
    Then i see the account profile that just ignored by me