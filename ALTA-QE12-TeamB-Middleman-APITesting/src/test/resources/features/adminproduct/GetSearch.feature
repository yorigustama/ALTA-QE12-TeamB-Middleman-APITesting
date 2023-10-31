@Project
Feature: ALTA QE BATCH 12 GROUP PROJECT 1
  Scenario: Get admin search with valid json
    Given admin search with valid json "Search.json"
    When Send request get admin search
    Then Status code should be 200 OK

