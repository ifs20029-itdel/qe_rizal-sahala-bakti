Feature: Cart Management
  As a user of the system
  I want to be able to manage carts
  So that I can add, view, update, and delete items in my cart

  Scenario: View Cart
    Given user is on the cart list page endpoint
    When user requests the cart list endpoint
    Then user should receive a list of cart
    And user receive that the response code is 200 OK

  Scenario: Add Item to Cart
    Given user is on the product cart page Endpoint
    When a user makes a request with the POST method on the endpoint
    Then The system respond with the status code 200
    And the item should be added to the cart

  Scenario: Update Cart Item
    Given user is on the cart PUT page Endpoint
    When a user makes a request with the PUT method on the endpoint cart
    Then the cart should be updated
    And the system respond with the status code 200

  Scenario: Delete Cart Item
    Given user wants to delete Cart with valid ID
    When a user makes a request with the Delete method on the endpoint
    Then the system give a response with status code 200
    And cart item with ID 6 has been deleted


