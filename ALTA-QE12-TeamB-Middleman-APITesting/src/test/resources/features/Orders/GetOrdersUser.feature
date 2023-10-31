@Project
Feature: ALTA QE BATCH 12 CAPSTONE PROJECT MIDDLEMAN

  Scenario: Get list user with valid parameter page
    Given Get list orders user
    When Send request get list orders
    Then Status code should be 200 OK
    And Validate get list orders user JSON schema "GetOrders.json"