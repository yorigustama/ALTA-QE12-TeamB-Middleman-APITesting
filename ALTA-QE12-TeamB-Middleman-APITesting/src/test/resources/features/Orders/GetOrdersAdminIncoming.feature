@Project
Feature: ALTA QE BATCH 12 GROUP PROJECT 1

  Scenario: Get list admin with valid parameter page
    Given Get list orders admin incoming
    When Send request get list orders admin incoming
    Then Status code should be 200 OK
    And Validate get list orders user JSON schema "GetOrders.json"