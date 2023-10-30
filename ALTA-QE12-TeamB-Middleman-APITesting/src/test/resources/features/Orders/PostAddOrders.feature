@Project
Feature: ALTA QE BATCH 12 GROUP PROJECT 1


  Scenario Outline: Post Add Orders with valid json
    Given Add Orders user with json "PostAddOrders.json"
    When Send request post create new user
    Then Status code should be 200 Created
    And Response body patch productId was "<product_id>" and productName was "<product_name>"
    And Validate post create JSON schema "PostAddOrdersUserSchema.json"

    Examples:
      | product_id | product_name |  |  |
      | 1          | beras kencur |  |  |
      | 2          | chimory           |  |  |