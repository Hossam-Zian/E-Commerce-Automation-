@smoke
  Feature: F02_Login
    Scenario: user could login with valid email and password
      Given user go to login page
      When user login with valid "testt@example.com" and "P@ssw0rd"
      And user press on login button
      Then user login to the system successfully

    Scenario: user couldn't login with invalid email and password
        Given user go to login page
        When user login with invalid "wrong@example.com" and "P@ssw0rd"
        And user press on login button
        Then user couldn't login to the system successfully