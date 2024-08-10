Feature: Test All Employees APIs

  Scenario: Create New Employee using POST Request
    Given user configure Base URI
    And user get the Request Specification object
    And user add content type request header
    And user create request body for post request
    And user add request body to http post request
    When user select the HTTP Post Request
    Then user capture status code
    And user capture status line
    And user capture response time
    And user capture response body
    And user capture response headers
    And user capture id from response body

  Scenario: Retrieve the Created new Entity using GET Request
    Given user configure Base URI
    And user get the Request Specification object
    When user select the HTTP GET Request
    Then user capture status code
    And user capture status line
   And user capture response time
    And user capture response body
    And user capture response headers

  Scenario: Update whole Entity using PUT Request
    Given user configure Base URI
    And user get the Request Specification object
    And user add content type request header
    And user create request body for put request
    And user add request body to http put request
    When user select the HTTP put Request
    Then user capture status code
    And user capture status line
    And user capture response time
    And user capture response body
    And user capture response headers

  Scenario: Retrieve the Created new Entity using GET Request
    Given user configure Base URI
    And user get the Request Specification object
    When user select the HTTP GET Request
    Then user capture status code
    And user capture status line
    And user capture response time
    And user capture response body
    And user capture response headers

  Scenario: Update partial Entity using PATCH Request
    Given user configure Base URI
    And user get the Request Specification object
    And user add content type request header
    And user create request body for patch request
    And user add request body to http patch request
    When user select the HTTP patch Request
    Then user capture status code
    And user capture status line
    And user capture response time
    And user capture response body
    And user capture response headers

  Scenario: Retrieve the Created new Entity using GET Request
    Given user configure Base URI
    And user get the Request Specification object
    When user select the HTTP GET Request
    Then user capture status code
    And user capture status line
    And user capture response time
    And user capture response body
    And user capture response headers

  Scenario: Delete Entity using DELETE Request
    Given user configure Base URI
    And user get the Request Specification object
    When user select the HTTP Delete Request
    Then user capture status code
    And user capture status line
    And user capture response time
    And user capture response headers

  Scenario: Retrieve the Created new Entity using GET Request
    Given user configure Base URI
    And user get the Request Specification object
    When user select the HTTP GET Request
    Then user capture status code
    And user capture status line
    And user capture response time
