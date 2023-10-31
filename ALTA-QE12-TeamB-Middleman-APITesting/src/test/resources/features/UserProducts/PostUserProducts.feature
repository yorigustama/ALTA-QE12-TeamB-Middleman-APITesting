@Tugas
Feature: Capstone Project TEAM B
 #  Positive Case
  @Tugas
  Scenario: Post Add products with valid json
    Given Create New Product User
    When Send request post create User Products
    Then Status code should be 201 Created

# Negative case

  Scenario: Post Add products with invalid json
    Given Create New Invalid Product User
    When Send request post create User Products
    Then Status code should be 400


