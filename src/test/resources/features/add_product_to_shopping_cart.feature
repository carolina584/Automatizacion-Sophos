#Author: yinaa56@hotmail.com

Feature: Add product to cart
 As a user in the web application promart
 I want to add a product to the shopping cart
 To buy the product

  Scenario: add product to the shopping cart
    Given the user enters the promart application
    When user searches 'colchones' and adds the product 
    Then valid that the product is shown in the shopping cart list