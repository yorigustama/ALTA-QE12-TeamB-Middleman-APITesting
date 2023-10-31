@Login
Feature: Capstone Project TEAM B
#  Positive Case
  @Login
  Scenario: Login user with registered account and all field is valid
    Given Login admin with "LoginAdminAccountValid.json" as request body
    When Send request login admin
    Then Status code should be 200 Created

#  Negative Case
  @Login
  Scenario: Login user with registered account and all field is invalid
    Given  Login invalid admin with "LoginInvaliAccount.json" as request body
    When Send request login admin invalid
    Then Status code should be 400 BadReq