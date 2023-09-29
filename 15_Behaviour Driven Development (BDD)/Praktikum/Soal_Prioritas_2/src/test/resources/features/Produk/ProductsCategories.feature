Feature: Produk
  As a user
  I want to select a product
  So that I can access my account

  Scenario: Select Products with Specific Categories
    Given user has logged in to the Sepulsa account
    When a user wants to buy a product in a certain category
    Then the system will display the products available in that category


  Scenario: Select Products with Search Keywords
    Given logged in to the Sepulsa account
    When the user wants to search for products with certain keywords
    Then the system will display products that match the search keywords