@Tugas
Feature: ALTA QE BATCH 12 GROUP PROJECT 1
  @Tugas
  Scenario Outline: Put update user with valid json and user id
    Given Update done user with json "PutOrdersConfirmId.json" and user id 6
    When Send request put orders done id
    Then Status code should be 200 OK
    And Response body patch productId was "<product_id>" and productName was "<product_name>"
    And Validate post create JSON schema "PostAddOrdersUserSchema.json"

    Examples:
      | product_id | product_name |  |  |
      | 1          | beras kencur |  |  |
      | 2          | chimory           |  |  |