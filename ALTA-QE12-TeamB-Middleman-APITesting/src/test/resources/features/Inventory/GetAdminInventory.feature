@Project
Feature: ALTA QE BATCH 12 CAPSTONE PROJECT MIDDLEMAN


  Scenario: Get list user with valid parameter page
    Given Get list inventory admin
    When Send request get list inventory admin
    Then Status code should be 200 OK
   And Validate get list user JSON schema "ListInventoryAdminSchema.json"

