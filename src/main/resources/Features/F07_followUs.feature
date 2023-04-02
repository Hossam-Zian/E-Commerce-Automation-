@smoke
Feature: followUs Feature
  Scenario: user opens facebook link
    Given user at home page
    When user clicks on facebook Follow us
    Then user switch  to "https://www.facebook.com/nopCommerce" page

  Scenario: user opens twitter link
    Given user at home page
    When user clicks on twitter Follow us
    Then user switch  to "https://twitter.com/nopCommerce" page

  Scenario: user opens rss link
    Given user at home page
    When user clicks on rss Follow us
    Then user switch  to "https://demo.nopcommerce.com/new-online-store-is-open" page

  Scenario: user opens youtube link
    Given user at home page
    When user clicks on youtube Follow us
    Then user switch  to "https://www.youtube.com/user/nopCommerce" page