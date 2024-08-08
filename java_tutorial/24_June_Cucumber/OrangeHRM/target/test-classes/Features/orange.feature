@EndToEndTesting
Feature: Test the Orange HRM application

  @LoginPage @RegressionTesting
  Scenario: Validate login functionality
    Given user is on login page
    When user enter username and password
    Then user click on login button

  @HomePage @SanityTesting
  Scenario: validate Home Page Functionality
    When user is on home page and validate home page title
    And user validate home page url
    And user validate home page logo

  @PIMPage @SystemTesting
  Scenario: validate pim page functionality
    Given user is on pim page and verify the url
    When user click on add employee
    And user enter first name, middle name and last name
    And user click on save button
