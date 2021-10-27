Feature: As user I should be able to login

  @smoke
  Scenario: Login with valid username and password

    Given User is on the login page
    When User enters username "petrov.vadim.qa@gmail.com" and password "123#ABC!87" on the "Log In" page
    And User clicks on the "Log in" button on the "Log In" page
    Then page title on the "Dashboard" page should be "When I Work :: Schedule, Track, Communicate"

  @smoke
  Scenario: Login with invalid username and password

    Given User is on the login page
    When User enters username "username001@gmail.com" and password "888#890?AD" on the "Log In" page
    And User clicks on the "Log in" button on the "Log In" page
    Then message should appeared on the "Log In" page
