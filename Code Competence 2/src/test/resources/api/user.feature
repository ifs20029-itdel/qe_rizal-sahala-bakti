Feature: User Management
  As a user of the system
  I want to be able to manage users
  So that I can view, add, update, and delete users

  Scenario: View User List
    Given user is on the user page Endpoint
    When user requests the user list Endpoint
    Then user should receive the user list
    And i receive that the response code is 200

  Scenario: Add User
    Given user is on the user list page Endpoint
    When user request with the POST method on the endpoint
    Then the system responds with the status code 200 ok
    And user should receive the add user list

  Scenario: Update User
    Given user is on the user Update page Endpoint
    When user selects makes a request with the PUT method on the endpoint
    Then the user details should be updated
    And the system responds with the status code 200ok

  Scenario: Delete User
    Given user wants to delete users data with valid ID
    When user selects makes a request with the DELETE method on the endpoint
    Then the system gives a response with status code 200ok
    And Users data with ID 6 has been deleted