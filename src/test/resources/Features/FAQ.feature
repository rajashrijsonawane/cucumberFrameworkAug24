Feature: FAQ functionality
  Background:
    Given user should be on login page
  @FAQ
  Scenario: TC08_create_FAQ_with_mandatory_fields
    When user enter the valid credentials along with theme and click on login button
    Then user should be navigated to home page
    When user click on new FAQ and add the mandatory fields on FAQ page and click on save button
    Then FAQ should create successfully