@Tugas
Feature: ALTA QE BATCH 12 GROUP PROJECT 1

  @Tugas
  Scenario: Get list user with valid parameter page
    Given Get list orders user
    When Send request get list orders
    Then Status code should be 200 OK
    And Validate get list orders user JSON schema "GetOrders.json"