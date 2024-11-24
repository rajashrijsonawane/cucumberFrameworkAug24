Feature: Potential functionality
  Background:
    Given user should be on login page
  @potential
  Scenario: TC06_create_account_with_mandatory_fields
    When user enter the valid credentials along with theme and click on login button
    Then user should be navigated to home page
    When user click on new potential and search the mandatory fields on potential page and click on search button
    Then Potential should search successfully
