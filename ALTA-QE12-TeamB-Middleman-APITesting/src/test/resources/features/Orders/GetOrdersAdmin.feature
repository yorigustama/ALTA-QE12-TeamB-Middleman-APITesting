@Project
Feature: ALTA QE BATCH 12 CAPSTONE PROJECT MIDDLEMAN

  Scenario: Get list admin with valid parameter page
    Given Get list orders admin
    When Send request get list orders admin
    Then Status code should be 200 OK
    And Validate get list orders user JSON schema "GetOrders.json"