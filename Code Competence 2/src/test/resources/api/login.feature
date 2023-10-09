Feature: User Authentication
  As a user of the system
  I want to be able to login
  So that I can access my account

  Scenario: Successful Login
    Given user is enter valid Endpoint
    When a user makes a request with the POST method on the endpoint enters valid id and password
    Then System responds with the status code 200
    And user should receive a valid JWT token