@Project
Feature: ALTA QE BATCH 12 GROUP PROJECT 1
  Scenario: Delete carts
    Given Delete carts with invalid id
    When Send request delete carts
    Then Status code should be 404 Not Found