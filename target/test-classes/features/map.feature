@tag
Feature: Provide details using single dimensional map
  I want to use this template for my feature file

  @tag1
  Scenario: Providing data using map
    Given User should  launch the browser
    And User click the add customer button
    When User provide valid details of customer
      | fname   | kiran            |
      | lname   | kranti           |
      | gmail   | kranti@gmail.com |
      | Address | vijayawda        |
      | mob     |       8608578638 |
    Then I validate the outcomes
