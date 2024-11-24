Feature: E-mail functionality
  Background:
    Given user should be on login page
  @Email
  Scenario: TC010_create_New_Email_with_mandatory_fields
    When user enter the valid credentials along with theme and click on login button
    Then user should be navigated to home page
    When user click on New E-mail and add the mandatory fields
    Then user choosen file and description on Email page and click on save button
    Then E-mail should create successfully