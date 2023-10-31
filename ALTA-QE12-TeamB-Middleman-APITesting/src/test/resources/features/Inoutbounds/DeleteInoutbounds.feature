@Tugas
Feature: Capstone Project TEAM B
#  Positive Case
  @Tugas
  Scenario Outline: Delete a user with valid json and user id
    Given Delete a inoutbounds with valid user id <id>
    When Send request delete user
    Then Status code should be 204 NoContent
    Examples:
      | id |
      | 1  |

# Negative case
  @Tugas
  Scenario Outline: Delete a user with invalid parameter
    Given Delete inbound user with invalid user id <id>
    When Send request delete inbound
    Then Status code should be 400
    Examples:
      | id      |
      | kanna   |
      | @##$#%$ |