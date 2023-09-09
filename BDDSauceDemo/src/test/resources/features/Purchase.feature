@Purchase
Feature: Sales
  As a user want to purchase item from list product

  Scenario: User filter product list
  Given User open the website sauce demo
  When User input "standard_user" as a userName "secret_sauce" as a password
  Then User already on home page
  When User filter list product by "Name (Z to A)"
  And User can select item Test.allTheThings T-Shirt Red and Sauce Labs Onesie on landing page
  And User click icon shopping cart on landing page
  And User already on shopping cart page
  When The user removes 1 item from the shopping cart page
  And User click button Check Out
  When User input "Irma" as a firstName "Wahyuni" as a lastName and "123" as a postalCode
  And User click button Continue
  And User already on Checkout Overview
  Then Verify button finish
  And User already on Checkout: Complete! page