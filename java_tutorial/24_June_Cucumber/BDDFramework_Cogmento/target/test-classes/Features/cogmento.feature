Feature: Test congmento application

  Scenario: validate login functionality
    Given user is on login page
    When user enter valid username and password
    Then user click on login button

  Scenario: validate home page functionality
    Then user validte home page title
    And user validate home page logo
    And user validate home page url

  Scenario: validate contact page
    When user click on contact link
    And click on create button
    Then user enters firstname, lastname, email and select status
    And user click on save button
    Then user delete the contact

  Scenario: validate logout functionality
    Then user click on profile icon
    And user click on logout
