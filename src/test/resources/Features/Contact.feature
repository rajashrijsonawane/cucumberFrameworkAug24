Feature: contact functionality
  Background:
    Given user should be on login page

  @contact
  Scenario: TC05_create_contact_with_mandatory_fields
    When user enter the valid credentials and click on login button
    Then user should be navigated to home page
    When user click on new contact list and enter the mandatory fields and click on save button
    Then contact should create successfully

