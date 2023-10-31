@Project
Feature: ALTA QE BATCH 12 CAPSTONE PROJECT MIDDLEMAN

  Scenario: Get list user id with valid parameter page
    Given Get list orders user id 1
    When Send request get list orders user id
    Then Status code should be 200 OK
    And Validate get list orders user JSON schema "GetOrders.json"

  Scenario: Get list user id with invalid parameter page
    Given Get list orders user id 113243254523555345
    When Send request get list orders user id
    Then Status code should be 404 not found