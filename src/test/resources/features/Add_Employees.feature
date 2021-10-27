Feature: Add an employee to the account from the Employees page and verify that the
  addition was successful

  Background: User is on the Dashboard page
    Given User is on the login page
    When User enters username "petrov.vadim.qa@gmail.com" and password "123#ABC!87" on the "Log In" page
    And User clicks on the "Log in" button on the "Log In" page

  @smoke
  Scenario: test add employee feature
    Given User clicks on the "Scheduler" button on the "Dashboard" page
    When User clicks on the "Add employees" button on the "Scheduler" page
    And User enters firstname "John", lastname "Doe", email "johndoe123@gmail.com", mobile number "7034565700", role "Supervisor" on the "Scheduler" page
    And User clicks on the "ADD EMPLOYEE" button on the "Scheduler" page
    Then successful message should appear