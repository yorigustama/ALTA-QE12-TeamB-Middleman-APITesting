@Tugas
Feature: ALTA QE BATCH 12 GROUP PROJECT 1

  @Tugas
  Scenario Outline: Post Add inventory with valid json
    Given Add inventory admin with json "PostInventoryUser.json"
    When Send request post inventory admin
    Then Status code should be 200 Created
    And Response body patch qty was "<qty>" and unit was "<unit>"
    And Validate post create JSON schema "PostInventorySchema.json"
    Examples:
      | qty | unit |  |  |
      | 10  |   kg   |  |  |
      | 10   |    kg  |  |  |