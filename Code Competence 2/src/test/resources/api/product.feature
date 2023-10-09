Feature: Product Management
  As a user of the system
  I want to be able to manage products
  So that I can view, create, update, and delete products

  Scenario: View Product
    Given user is on the product list page endpoint
    When user requests the product list endpoint
    Then user should receive a list of products
    And i receive that the response code is 200 OK

  Scenario: Add New Product
    Given user is on the product POST page endpoint
    When a user makes a request with the POST method on the endpoint with post data
    Then the system responds with the status code 200
    And the post add new prodoct that was just created

  Scenario: Update Product
    Given user is on the product PUT page Endpoint
    When a user makes a request with the PUT method on the endpoint
    Then the product information should be updated
    And The system responds with the status code 200

  Scenario: Delete Product
    Given user wants to delete post data with valid ID
    When a user makes a request with the DELETE method on the endpoint
    Then the system gives a response with status code 200
    And post data with ID 6 has been deleted
