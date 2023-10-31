@Tugas
Feature: Capstone Project TEAM B
 #  Positive Case
  @Tugas
  Scenario: Get search user product with valid json
    Given user search valid json "beras mentaroy"
    When Send request get search User
    Then Status code should be 200

#  Negative Case
  @Tugas
  Scenario: Get user product with valid parameter page
    Given user search invalid json "diski"
    When Send request get invalid search User
    Then Status code should be 401
