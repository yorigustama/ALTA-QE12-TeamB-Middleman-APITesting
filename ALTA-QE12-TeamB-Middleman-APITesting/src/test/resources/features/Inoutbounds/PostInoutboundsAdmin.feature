@Tugas
Feature: Capstone Project TEAM B
#  Positive Case

  @Tugas
  Scenario Outline: Post Add inventory with valid json
    Given Add inoutbounds with json "PostInoutbounds.json"
    When Send request post inoutbounds
    Then Status code should be 200
    And Response body product was "<product_id>" and qty was "<qty>"
    And Validate post create JSON schema "PostInoutboundsSchema.json"
    Examples:
      | product_id | qty |  |  |
      | 1          | 1   |  |  |

# Negative case
  @Tugas
  Scenario Outline: Post Add inventory with invalid json
    Given Add inoutbounds with json "PostInoutbounds.json"
    When Send request post inoutbounds
    Then Status code should be 400
    And Response body product was "<product_id>" and qty was "<qty>"
    And Validate post create JSON schema "PostInoutboundsSchema.json"
    Examples:
      | product_id | qty |  |  |
      | 1          | 100  |  |  |