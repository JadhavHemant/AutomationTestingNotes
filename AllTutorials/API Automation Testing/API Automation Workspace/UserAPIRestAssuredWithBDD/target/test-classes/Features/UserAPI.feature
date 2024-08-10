Feature: Test End to End all User APIs

  Scenario: create new User using POST Request
    Given user get the Request Specification interface Object
    And user configure Base URI
    And user add request header as "Content-Type" key and "application/json" value
    And user create request body using json node as "createUser"
    And user add request body to HTTP Request
    When user select HTTP "POST" Request
    Then user capture status code
    And user capture status line
    And user capture response time
    And user capture response body
    And user capture response header
    And user capture id from Response body

  Scenario: retrieve User using GET Request
    Given user get the Request Specification interface Object
    And user configure Base URI
    When user select HTTP "GET" Request
    Then user capture status code
    And user capture status line
    And user capture response time
    And user capture response body
    And user capture response header

  Scenario: update User using PUT Request
    Given user get the Request Specification interface Object
    And user configure Base URI
    And user add request header as "Content-Type" key and "application/json" value
    And user create request body using json node as "updateUser"
    And user add request body to HTTP Request
    When user select HTTP "PUT" Request
    Then user capture status code
    And user capture status line
    And user capture response time
    And user capture response body
    And user capture response header

  Scenario: retrieve User using GET Request
    Given user get the Request Specification interface Object
    And user configure Base URI
    When user select HTTP "GET" Request
    Then user capture status code
    And user capture status line
    And user capture response time
    And user capture response body
    And user capture response header

  Scenario: partial update User using PATCH Request
    Given user get the Request Specification interface Object
    And user configure Base URI
    And user add request header as "Content-Type" key and "application/json" value
    And user create request body using json node as "PartialUpdateUser"
    And user add request body to HTTP Request
    When user select HTTP "PATCH" Request
    Then user capture status code
    And user capture status line
    And user capture response time
    And user capture response body
    And user capture response header

  Scenario: retrieve User using GET Request
    Given user get the Request Specification interface Object
    And user configure Base URI
    When user select HTTP "GET" Request
    Then user capture status code
    And user capture status line
    And user capture response time
    And user capture response body
    And user capture response header

  Scenario: delete User using DELETE Request
    Given user get the Request Specification interface Object
    And user configure Base URI
    When user select HTTP "DELETE" Request
    Then user capture status code
    And user capture status line
    And user capture response time
    And user capture response header

  Scenario: retrieve User using GET Request
    Given user get the Request Specification interface Object
    And user configure Base URI
    When user select HTTP "GET" Request
    Then user capture status code
    And user capture status line
    And user capture response time
