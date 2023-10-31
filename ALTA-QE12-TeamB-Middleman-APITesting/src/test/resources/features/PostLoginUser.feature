@Login
Feature: Capstone Project TEAM B
#  Positive Case
  @Login
  Scenario: Login user with registered account and all field is valid
    Given Login user with "LoginUserAccountValid.json" as request body
    When Send request login user
    Then Status code should be 200 Created

#  Negative Case
  @Login
  Scenario: Login user with registered account and all field is invalid
    Given Login user with "LoginInvaliAccount.json" as request body
    When Send request login user
    Then Status code should be 400 Badreq