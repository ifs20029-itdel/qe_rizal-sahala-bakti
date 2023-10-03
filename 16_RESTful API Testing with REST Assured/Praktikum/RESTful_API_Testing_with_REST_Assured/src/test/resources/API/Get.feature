Feature:  GET ALL DATA
  Scenario: Get all post data
    Given user accesses the  endpoint
    When a user makes a request with the GET method
    Then the system responds with the status code 200 and the available post data

  Scenario: Get all post data based on an invalid ID
    Given user accesses the  endpoint based on an invalid ID
    When a user makes a request with the GET method on the Endpoint Invalid
    Then the system responds with the status code 404



