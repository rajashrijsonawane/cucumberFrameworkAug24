Feature: Event functionality
  Background:
    Given user should be on login page
  @Event
  Scenario: TC11_create_New_Event_with_mandatory_fields
    When user enter the valid credentials along with theme and click on login button
    Then user should be navigated to home page
    When user click on New Event and add the mandatory fields on event page and click on save button
    Then New Event should create successfully