Feature: HelpDesk functionality
  Background:
    Given user should be on login page
  @HelpDesk
  Scenario: TC12_create_New_HelpDesk_with_mandatory_fields
    When user enter the valid credentials along with theme and click on login button
    Then user should be navigated to home page
    When user click on New HelpDesk and add the mandatory fields on New HelpDesk page and click on search button
    Then New HelpDesk should create successfully