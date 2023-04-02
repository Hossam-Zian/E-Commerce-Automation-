@smoke
  Feature: Search function
    Scenario Outline: user could search using product name
    Given user at home page
    When user searches with "<search_word>"
    Then search shows relevant results for"<search_word>"
    Examples:
      |search_word|
      |book|
      |laptop|
      |nike|

  Scenario Outline:user could search using product SKU
  Given user at home page
  When user searches with product "<SKU>"
  Then search shows requested product "<SKU>"
  Examples:
  |SKU|
  |SCI_FAITH |
  |APPLE_CAM|
  |SF_PRO_11|