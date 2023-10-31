@Tugas
Feature: Capstone Project TEAM B
 #  Positive Case
  Scenario: Update product users with valid user id
    Given Update product users with valid id
    When Send request put update product users
    Then Status code should be 200

  Scenario: Update product users with invalid user id
    Given Update product users with invalid id
    When Send request put update product users
    Then Status code should be 400



