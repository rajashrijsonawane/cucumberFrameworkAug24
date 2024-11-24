Feature: Account functionality
  Background:
    Given user should be on login page
  @account
  Scenario: TC04_create_account_with_mandatory_fields
    When user enter the valid credentials along with theme and click on login button
    Then user should be navigated to home page
    When user click on new account and add the mandatory fields on account page and click on save button
    Then Account should create successfully



#  @accountEdit
#  Scenario: TC05_edit_account_with_new_mandatory_fields
#    When user enter the valid credentials and click on login button
#    Then user should be navigated to home page
#    When user click on new account and edit the new mandatory fields and click on save button
#      |accountname | tickersymbol |
#      |Modi     |  Narendra   |
#      |Gandhi   | Rahul  |
#      |Pawar    |Shard |
#    Then Account should edit successfully