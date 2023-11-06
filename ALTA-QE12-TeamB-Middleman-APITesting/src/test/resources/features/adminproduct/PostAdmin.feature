@Project
Feature: ALTA QE BATCH 12 GROUP PROJECT 1
  Scenario: Admin input data with valid json
    Given Create new product
    When Send request post create new product
    Then Status code should be 201 Created
    And Response body message "success adding a product"

    @Project
    Scenario: Admin input data product without product name
      Given Create new product without product name
      When Send request post create new product
      Then Status code should be 404 Bad Request
      And Response body message "Not Found"