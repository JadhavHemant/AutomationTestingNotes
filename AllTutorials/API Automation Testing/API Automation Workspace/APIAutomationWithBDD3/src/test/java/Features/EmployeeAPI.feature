Feature: Test All Employees APIs

  Scenario: Create a new Entity using POST Request
    Given user configure BaseURI in RestAssured
    And user get the RequestSpecification interface object
    And user add request header
    And user create request body for post request
    And user add request body for post request
    When user select HTTP POST Request
    Then user capture status code
    And user capture status line
    And user capture response time
    And user capture response body
    And user capture response headers
    And user capture id from response body

  Scenario: Retrive Entity using GET Request
    Given user configure BaseURI in RestAssured
    And user get the RequestSpecification interface object
    When user select HTTP GET Request
    Then user capture status code
    And user capture status line
    And user capture response time
    And user capture response body
    And user capture response headers

  Scenario: Update Whole Entity using PUT Request
    Given user configure BaseURI in RestAssured
    And user get the RequestSpecification interface object
    And user add request header
    And user create request body for put request
    And user add request body for put request
    When user select HTTP put Request
    Then user capture status code
    And user capture status line
    And user capture response time
    And user capture response body
    And user capture response headers

  Scenario: Retrive Entity using GET Request
    Given user configure BaseURI in RestAssured
    And user get the RequestSpecification interface object
    When user select HTTP GET Request
    Then user capture status code
    And user capture status line
    And user capture response time
    And user capture response body
    And user capture response headers

  Scenario: Update partial Entity using PATCH Request
    Given user configure BaseURI in RestAssured
    And user get the RequestSpecification interface object
    And user add request header
    And user create request body for patch request
    And user add request body for patch request
    When user select HTTP patch Request
    Then user capture status code
    And user capture status line
    And user capture response time
    And user capture response body
    And user capture response headers

  Scenario: Retrive Entity using GET Request
    Given user configure BaseURI in RestAssured
    And user get the RequestSpecification interface object
    When user select HTTP GET Request
    Then user capture status code
    And user capture status line
    And user capture response time
    And user capture response body
    And user capture response headers

  Scenario: delete Entity using GET Request
    Given user configure BaseURI in RestAssured
    And user get the RequestSpecification interface object
    When user select HTTP delete Request
    Then user capture status code
    And user capture status line
    And user capture response time
    And user capture response headers

  Scenario: Retrive Entity using GET Request
    Given user configure BaseURI in RestAssured
    And user get the RequestSpecification interface object
    When user select HTTP GET Request
    Then user capture status code
    And user capture status line
    And user capture response time
