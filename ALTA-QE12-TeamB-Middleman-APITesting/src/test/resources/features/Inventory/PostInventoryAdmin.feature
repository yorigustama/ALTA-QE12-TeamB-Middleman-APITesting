@Project
Feature: ALTA QE BATCH 12 CAPSTONE PROJECT MIDDLEMAN

  Scenario Outline: Post Add inventory with valid json
    Given Add inventory admin with json "PostInventoryUser.json"
    When Send request post inventory admin
    Then Status code should be 201 Created
    And Response body patch qty was "<qty>" and unit was "<unit>"
    And Validate post create JSON schema "PostInventorySchema.json"
    Examples:
      | qty | unit |  |  |
      | 10  |   kg   |  |  |
      | 10   |    kg  |  |  |

  Scenario: Post Add inventory with invalid json
    Given Add inventory admin with json "PostInventoryUser.json"
    When Send request post inventory admin
    Then Status code should be 404 not found