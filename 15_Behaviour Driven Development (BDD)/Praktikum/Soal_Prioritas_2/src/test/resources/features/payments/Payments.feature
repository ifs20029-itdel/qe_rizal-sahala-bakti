Feature: Payment
  As a user
  I want to select Payment
  So that I can access my account
  Scenario: Select an Available Payment Method
    Given user has selected the product to be purchased and entered the payment page
    When the user selects an available payment method
    Then the system will display transaction information and the user can make payments

  Scenario: Choose an Unavailable Payment Method
    Given user has selected the product to be purchased and entered the payment
    When the user chooses a payment method that is not available
    Then the system will display the message The payment method you selected is not available