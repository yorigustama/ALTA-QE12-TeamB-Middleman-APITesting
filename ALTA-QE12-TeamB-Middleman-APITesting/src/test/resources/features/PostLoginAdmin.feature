@Login @Project
Feature: Login As a user i want to login and do something in this web

  Scenario: Login user with registered account and all field is valid
    Given Login admin with "LoginAdminAccountValid.json" as request body
    When Send request login admin
    Then Status code should be 200 Created