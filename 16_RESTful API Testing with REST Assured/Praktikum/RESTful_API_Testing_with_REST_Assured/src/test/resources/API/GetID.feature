Feature: GET DATA BY ID
  Scenario: Get post data based on a valid ID
    Given user wants to get post data based on a valid ID
    When a user makes a request with the GET method on the endpoint
    Then the system gives a response with status code 200 and post data with ID 1

  Scenario: Getting post data based on an invalid ID
    Given user wants to get post data based on an invalid ID
    When a user makes a request with the GET method on the endpoint Invalid
    Then the system responds with the 404 status code and the appropriate error message