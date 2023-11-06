@Project
Feature: ALTA QE BATCH 12 GROUP PROJECT 1
  Scenario: Get all admin product
    Given Get all admin product
    When Send get product request
    Then Status code should be 200 OK