@SmokeTest
  Feature: Search Feature
    Scenario Outline: User is able to search for different insurance product
      Given User is in Homepage
      When User write on search Box "<Product>"and hit enter
      Then User is provided with list of desired products
      Examples:
        |Product|
        |Property|
        |Auto    |
        |Renters |
