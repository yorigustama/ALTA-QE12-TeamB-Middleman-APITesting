@Project
Feature: ALTA QE BATCH 12 CAPSTONE PROJECT MIDDLEMAN


  Scenario: Get list user id with valid parameter page
    Given Get list inventory user id 1
    When Send request get list inventory user id
    Then Status code should be 200 OK
    And Validate get list user JSON schema "ListInventoryUserSchema.json"

  Scenario: Get list user id with valid parameter page
    Given Get list inventory user id 14564565765
    When Send request get list inventory user id
    Then Status code should be 404 not found