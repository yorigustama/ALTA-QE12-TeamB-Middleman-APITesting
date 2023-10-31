@Tugas
Feature: Capstone Project TEAM B
#  Positive Case
  Scenario: Get list user with valid parameter page
    Given Get list User Stock Products
    When Send request get list inbounds admin
    Then Status code should be 200

# Negative case
  @Tugas
  Scenario: Get list user with Invalid parameter page
    Given Get list User Inoutbounds Invalid
    When Send request get list inbounds invalid admin
    Then Status code should be 404