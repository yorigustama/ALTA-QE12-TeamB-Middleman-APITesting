@Login @Project

Feature: Login As a user i want to login and do something in this web

  Scenario: Login user with registered account and all field is valid
    Given Login user with "LoginUserAccountValid.json" as request body
    When Send request login user
    Then Status code should be 200 Created