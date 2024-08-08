Feature: Test user all API

  Scenario: Test user Post Request
    Given Configure baseURI
    When getRequestSpecification interface object
    Then Add the request header
    And Create the request body
    And Add request Body for POST request
    And select HTTP POST request
    And Capture status code
    And Capture status line
    And Capture Response time
    And Capture Response body
    And Capture Response headers
    And Capture id from response body

  Scenario: Test user for GET request
    Given Configure baseURI with id
    When getRequestSpecification interface object
    Then user select the get request
    And Capture status code
    And Capture status line
    And Capture Response time
    And Capture Response body
    And Capture Response headers

  Scenario: Test user for PUT request
    Given Configure baseURI with id
    When getRequestSpecification interface object
    And Create request body for PUT request
    And add request body for put request
    And add Select HTTP PUT request
    And Capture status code
    And Capture status line
    And Capture Response time
    And Capture Response body
    And Capture Response headers
