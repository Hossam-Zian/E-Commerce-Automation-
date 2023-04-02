@smoke
  Feature: Change currency
    Scenario: user switch the currency
      Given user at home page
      When Select Euro currency from the dropdown list on the top left of home page
      Then verify that currency switched
