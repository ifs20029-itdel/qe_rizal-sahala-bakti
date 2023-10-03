Feature: PUT - Changing post data based on a valid ID
  Scenario: Changing post data based on a valid ID
    Given user wants to change post data with ID 1 with valid data
    When a user makes a request with the PUT method on the endpoint with post data
    Then the system gives a response with status code 200 and post data with ID 1 which has been changed

  Scenario: Changing post data based on an invalid ID
    Given user wants to change post data with an invalid ID
    When a user makes a request with the PUT method on the endpoint Invalid
    Then the system responds with the 404 status error message