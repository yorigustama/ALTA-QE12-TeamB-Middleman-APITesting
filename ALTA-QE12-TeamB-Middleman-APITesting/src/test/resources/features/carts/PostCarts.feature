@Project
Feature: ALTA QE BATCH 12 GROUP PROJECT 1
  Scenario: Post carts with valid json
    Given Create post carts
    When Send request post create carts
    Then Status code should be 201 Created
    And Response body message "success adding a product"
