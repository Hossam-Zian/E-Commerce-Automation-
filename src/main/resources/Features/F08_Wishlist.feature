@smoke
Feature: Wishlist Feature
  Scenario:user add product to wishlist
    Given user at home page
    When user add product to wishlist
    Then product added and success message appear

Scenario: user check wishlist tap after adding product
  Given user at home page
  And user add product to wishlist
  When product added and message disappear
  And user move to wishlist page
  Then user finds the product at wishlist basket