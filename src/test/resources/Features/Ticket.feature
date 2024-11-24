Feature: Ticket functionality
  Background:
    Given user should be on login page
  @ticket
  Scenario: TC07_create_ticket_with_mandatory_fields
    When user enter the valid credentials along with theme and click on login button
    Then user should be navigated to home page
    When user click on new ticket and add the mandatory information on ticket page and click on save button
    Then Ticket should create successfully