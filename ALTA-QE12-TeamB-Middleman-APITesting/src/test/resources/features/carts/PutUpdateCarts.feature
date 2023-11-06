@Project
Feature: ALTA QE BATCH 12 GROUP PROJECT 1
  Scenario Outline: Put update carts with valid json and user id
    Given Update carts with valid id "<id>"
    When Send request put update carts
    Then Status code should be 200 OK
    Examples:
      | id  |
      | 120 |