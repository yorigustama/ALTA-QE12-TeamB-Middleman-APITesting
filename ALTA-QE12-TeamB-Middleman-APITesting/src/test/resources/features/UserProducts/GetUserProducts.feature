@Tugas
Feature: Capstone Project TEAM B
 #  Positive Case
  Scenario: Get all product users
    Given Get all product users
    When Send get product users request
    Then Status code should be 200

#  Negative Case

  Scenario: Get user product with invalid parameter page
    Given Get all Product User Invalid
    When Send get product users request
    Then Status code should be 400 Badrequ