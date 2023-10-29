@Tugas
Feature: ALTA QE BATCH 12 GROUP PROJECT 1

  @Tugas
  Scenario: Post Add Orders with valid json
    Given Add Orders user with json "PostAddOrders.json"
    When Send request post create new user
    Then Status code should be 200 Created