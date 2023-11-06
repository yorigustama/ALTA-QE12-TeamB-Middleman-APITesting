@Project
Feature: ALTA QE BATCH 12 GROUP PROJECT 1
  Scenario: delete product in product admin
    Given Delete product with id
    When Send request delete product
    Then Status code should be 200 OK