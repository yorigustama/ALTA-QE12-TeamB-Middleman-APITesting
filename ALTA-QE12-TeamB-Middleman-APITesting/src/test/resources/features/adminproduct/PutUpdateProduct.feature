@Project
Feature: ALTA QE BATCH 12 GROUP PROJECT 1
  Scenario: Update product with valid json and user id
    Given Update product with valid id
    When Send request put update product
    Then Status code should be 200 OK


    Scenario: Update product admin without product name
      Given Update product without product name
      When Send request put update product
      Then Status code should be 405 Method Not Allowed
      And Request body message "Method Not Allowed"