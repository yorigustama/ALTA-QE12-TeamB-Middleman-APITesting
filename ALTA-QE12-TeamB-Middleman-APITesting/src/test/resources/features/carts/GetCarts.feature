@Project
Feature: ALTA QE BATCH 12 GROUP PROJECT 1
  Scenario Outline: Get carts with valid parameter id
    Given Get carts with id <id>
    When Send get carts request
    Then Status code should be 200 OK
    And Validate get carts json schema
    Examples:
      | id |
      | 1  |

    @Project
   Scenario Outline: Get carts with invalid parameter id
      Given Get carts with invalid id <id>
      When Send get carts request not found request
      Then Status code should be 404 Not Found
      Examples:
        | id      |
        | 1000000 |