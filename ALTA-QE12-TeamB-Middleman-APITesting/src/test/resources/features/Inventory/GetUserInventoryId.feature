@Tugas
Feature: ALTA QE BATCH 12 GROUP PROJECT 1

  @Tugas
  Scenario: Get list user id with valid parameter page
    Given Get list inventory user id 1
    When Send request get list inventory user id
    Then Status code should be 200 OK
    And Validate get list user JSON schema "ListInventoryUserSchema.json"