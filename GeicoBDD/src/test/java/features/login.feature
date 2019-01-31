@FunctionalTest @SmokeTest
Feature: Login Feature
  Scenario: Login with invalid credentials
    Given User is in Homepage
    When User click on login icon
    When User enter invalid userID and Password
    Then Unable to Login with Error Message

  Scenario: Login with valid credentials
    Given User is in Homepage
    When User click on login icon
    When User enter valid userID and Password
    Then Unable to Login with Error Message
