@Tugas
Feature: Capstone Project TEAM B
#  Positive Case
  @Login
  Scenario Outline: Delete products with valid user id
    Given Delete products user valid user id <id>
    When Send request delete user products
    Then Status code should be 204 NoContent
    Examples:
      | id  |
      | 129 |


# Negative case
  @Tugas
  Scenario Outline: Delete a user with invalid parameter
    Given Delete a user with invalid user id <id>
    When Send request delete user
    Then Status code should be 400
    Examples:
      | id      |
      | kanna   |
      | @##$#%$ |