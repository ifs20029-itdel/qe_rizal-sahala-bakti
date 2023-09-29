Feature: Search
  As a user
  I want to find people
  so that i can see her profile

  Scenario: Success Search a profile
    Given I go to button search
    When I input a username
    And click username that i want to see
    Then I see the profile

  Scenario: Success clear history
    Given I go to button search
    When I click clear button
    And Alert displayed and click clear history button
    Then I see button search without no history

  Scenario: Success display list of username that contains to our search
    Given I go to button search
    When I input words that contains to my search
    And tap enter
    Then I will get list of username that contains to my search