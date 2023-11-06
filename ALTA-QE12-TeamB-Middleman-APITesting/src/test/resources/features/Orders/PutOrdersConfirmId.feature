@Project
Feature: ALTA QE BATCH 12 CAPSTONE PROJECT MIDDLEMAN

  Scenario Outline: Put update user with valid json and user id
    Given Update user with json "PutOrdersConfirmId.json" and user id 6
    When Send request put orders confirm id
    Then Status code should be 201 Created
    And Response body patch productId was "<product_id>" and productName was "<product_name>"
    And Validate post create JSON schema "PostAddOrdersUserSchema.json"

    Examples:
      | product_id | product_name |  |  |
      | 1          | beras kencur |  |  |
      | 2          | chimory           |  |  |

  Scenario Outline: Put update user with valid json and user id
    Given Update user with json "PutOrdersConfirmId.json" and user id 677776
    When Send request put orders confirm id
    Then Status code should be 404 not found