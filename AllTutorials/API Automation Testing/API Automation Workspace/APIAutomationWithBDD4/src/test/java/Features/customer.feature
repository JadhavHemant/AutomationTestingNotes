Feature: Test All Customer APIs

  Scenario: Create a new Customer Entity using POST Request
    Given user configure BaseURI in RestAssured
    And user get the RequestSpecification interface object
    And user add request header
    And user create request body using json node as "createCustomer"
    And user add request body to HTTP request
    When user select HTTP POST Request
    Then user capture status code
    And user capture status line
    And user capture response time
    And user capture response body
    And user capture response headers
    And user capture id from response body

  Scenario: Create a retrieve Customer Entity using POST Request
    Given user configure BaseURI in RestAssured
    And user get the RequestSpecification interface object
    When user select HTTP GET Request
    Then user capture status code
    And user capture status line
    And user capture response time
    And user capture response body
    And user capture response headers

  Scenario: Create a update Customer Entity using POST Request
    Given user configure BaseURI in RestAssured
    And user get the RequestSpecification interface object
    And user add request header
    And user create request body using json node as "updateCustomer"
    And user add request body to HTTP request
    When user select HTTP PUT Request
    Then user capture status code
    And user capture status line
    And user capture response time
    And user capture response body
    And user capture response headers

  Scenario: Create a retrieve Customer Entity using POST Request
    Given user configure BaseURI in RestAssured
    And user get the RequestSpecification interface object
    When user select HTTP GET Request
    Then user capture status code
    And user capture status line
    And user capture response time
    And user capture response body
    And user capture response headers

  Scenario: Create a partial update Customer Entity using POST Request
    Given user configure BaseURI in RestAssured
    And user get the RequestSpecification interface object
    And user add request header
    And user create request body using json node as "partialUpdateCustomer"
    And user add request body to HTTP request
    When user select HTTP PATCH Request
    Then user capture status code
    And user capture status line
    And user capture response time
    And user capture response body
    And user capture response headers

  Scenario: Create a retrieve Customer Entity using POST Request
    Given user configure BaseURI in RestAssured
    And user get the RequestSpecification interface object
    When user select HTTP GET Request
    Then user capture status code
    And user capture status line
    And user capture response time
    And user capture response body
    And user capture response headers

  Scenario: Create a delete Customer Entity using POST Request
    Given user configure BaseURI in RestAssured
    And user get the RequestSpecification interface object
    When user select HTTP delete Request
    Then user capture status code
    And user capture status line
    And user capture response time


  Scenario: Create a retrieve Customer Entity using POST Request
    Given user configure BaseURI in RestAssured
    And user get the RequestSpecification interface object
    When user select HTTP GET Request
    Then user capture status code
    And user capture status line
    And user capture response time

