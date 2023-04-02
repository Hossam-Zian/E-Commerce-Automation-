@smoke
  Feature: homeSliders Feature
    Scenario: first slider is clickable on home page
      Given user at home page
      And first slider is clickable
      When user select the first slider
      Then page switched to product page

  Scenario: second slider is clickable on home page
    Given user at home page
    And second slider is clickable
    When user select the second slider
    Then page switched to 2nd product page