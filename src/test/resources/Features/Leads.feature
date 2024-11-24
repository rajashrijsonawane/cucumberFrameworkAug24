Feature: lead functionality
  Background:
    Given user should be on login page
@leads
  Scenario: TC03_create_lead_with_mandatory_fields
    When user enter the valid credentials and click on login button
    Then user should be navigated to home page
    When user click on new lead and add the mandatory fields and click on save button
    |lastname | company |
    |Modi     |  BJP   |
    |Gandhi   | Congress  |
    |Pawar    | NCP |
    Then lead should create successfully

