@Tugas
Feature: Capstone Project TEAM B
#  Positive Case

  @Tugas
  Scenario: put update user id with valid parameter page
    Given Update inoutbounds with id "PutInoutbounds.json"
    When Send request put inoutbounds
    Then Status code should be 200

# Negative case
  @Tugas
  Scenario: put update user id with invalid parameter page
    Given Update inoutbounds invalid with id "PutInoutbounds.json"
    When Send request put inoutbounds
    Then Status code should be 404 NotFound