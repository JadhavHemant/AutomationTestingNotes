Feature: Test User All APIs

  Scenario: Test User GET Request APIs
    Given user configure Base URI in Rest Assured
    And user get the Request Specification object
    When user select HTTP GET Request
    Then user capture status code
    And user capture status line
    And user capture response time
    And user capture response body
    And user capture response headers

  Scenario: Test User DELETE Request APIs
    Given user configure Base URI in Rest Assured
    And user get the Request Specification object
    When user select HTTP DELETE Request
    Then user capture status code
    And user capture status line
    And user capture response time
    And user capture response headers
