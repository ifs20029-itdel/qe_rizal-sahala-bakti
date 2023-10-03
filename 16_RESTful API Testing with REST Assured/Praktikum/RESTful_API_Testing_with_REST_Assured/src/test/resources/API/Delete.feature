Feature: Delete
  Scenario: Delete post data based on a valid ID
    Given user wants to delete post data with valid ID 1
    When a user makes a request with the DELETE method on the endpoint
    Then the system gives a response with status code 200 and post data with ID 1 has been deleted

  Scenario: Delete post data based on an invalid ID
    Given user wants to delete post data with invalid ID
    When a user makes a request with the DELETE method on the endpoint Invalid
    Then the system responds with the 404 status code