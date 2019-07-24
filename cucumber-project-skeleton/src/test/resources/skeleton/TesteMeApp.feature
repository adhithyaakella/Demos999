Feature: Test Me parameterisation

  Scenario Outline: Test me login for multiple users
    Given I am launchiung the test me application in chrome
    And I click on signin link
    When I provide username "<Uname>"
    And I provide password "<Paswd>"
    Then I click on login and verify the login status

    Examples: 
      | Uname    | Paswd       |
      | Srinivas | Password123 |
      | adhithya | password456 |
      | satya    | password345 |
      | mangi    | password234 |
