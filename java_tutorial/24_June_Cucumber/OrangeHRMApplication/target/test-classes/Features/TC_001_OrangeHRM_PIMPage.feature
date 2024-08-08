Feature: Test Orange HRM End to End PIM Page Functionality

  Scenario: Validate login functionality
    Given user is on login Page
    When user enter valid username and password
    Then user click on login button

  Scenario: Validate Home Page Functionality
    When user is on home page and validate home page title
    And user validate home page url

  Scenario: validate PIM Page Functionality
    When user click on pim page link
    And user click on add employee
    Then user enter first name and last name
    And user click on save button
