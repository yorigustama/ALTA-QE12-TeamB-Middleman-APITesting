@Project
Feature: ALTA QE BATCH 12 CAPSTONE PROJECT MIDDLEMAN


  Scenario Outline: Post Add Orders with valid json
    Given Add Orders user with json "PostAddOrders.json"
    When Send request post create new user
    Then Status code should be 201 Created
    And Response body patch productId was "<product_id>" and productName was "<product_name>"
    And Validate post create JSON schema "PostAddOrdersUserSchema.json"

    Examples:
      | product_id | product_name |  |  |
      | 1          | beras kencur |  |  |
      | 2          | chimory           |  |  |

  Scenario Outline: Post Add Orders with invalid json
    Given Add Orders user with json "PostAddOrders.json"
    When Send request post create new user
    Then Status code should be 404 not found