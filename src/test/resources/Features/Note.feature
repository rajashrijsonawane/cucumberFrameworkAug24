Feature: New Note functionality
  Background:
    Given user should be on login page
  @note
  Scenario: TC09_create_New_Note_with_mandatory_fields
    When user enter the valid credentials along with theme and click on login button
    Then user should be navigated to home page
    When user click on new note and enter mandatory fields on new note page and click on save button
    Then Note should save successfully
