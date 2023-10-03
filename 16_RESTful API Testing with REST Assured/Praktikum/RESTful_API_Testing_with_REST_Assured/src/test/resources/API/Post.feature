Feature: POST - Create new post
  Scenario: Create new post data with valid data
    Given that the user wants to create a new post data with valid data
    When a user makes a request with the POST method on the endpoint with post data
    Then the system responds with the status code 201 and the post data that was just created

  Scenario: Create new post data with invalid data
    Given user wants to create new post data with invalid ID
    When a user makes a request with the POST method on the endpoint Invalid
    Then the system responds with the status code 404 and the appropriate error message