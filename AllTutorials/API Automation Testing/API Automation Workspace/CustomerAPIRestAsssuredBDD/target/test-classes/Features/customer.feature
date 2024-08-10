Feature: Test End to End all customer APIs

  Scenario: create New customer using HTTP POST Request
    Given user configure BaseURI in Rest Assured
    And user get the RequestSpecification interface object
    And user add request ContentType header
    And user create request body using jsonNode name as "createCustomer"
    And user add request body to HTTP Request
    When user select HTTP POST Request
    Then user capture status code
    And user capture status line
    And user capture response time
    And user capture response body
    And user capture response headers
    And user capture customer id from response body

  Scenario: retrieve customer using HTTP GET Request
    Given user configure BaseURI in Rest Assured
    And user get the RequestSpecification interface object
    When user select HTTP GET Request
    Then user capture status code
    And user capture status line
    And user capture response time
    And user capture response body
    And user capture response headers

  Scenario: update customer using HTTP PUT Request
    Given user configure BaseURI in Rest Assured
    And user get the RequestSpecification interface object
    And user add request ContentType header
    And user create request body using jsonNode name as "updateCustomer"
    And user add request body to HTTP Request
    When user select HTTP PUT Request
    Then user capture status code
    And user capture status line
    And user capture response time
    And user capture response body
    And user capture response headers

         Scenario: retrieve customer using HTTP GET Request
    Given user configure BaseURI in Rest Assured
    And user get the RequestSpecification interface object
    When user select HTTP GET Request
    Then user capture status code
    And user capture status line
    And user capture response time
    And user capture response body
    And user capture response headers
    
    
  Scenario: update partial customer using HTTP PATCH Request
    Given user configure BaseURI in Rest Assured
    And user get the RequestSpecification interface object
    And user add request ContentType header
    And user create request body using jsonNode name as "partialUpdateCustomer"
    And user add request body to HTTP Request
    When user select HTTP PATCH Request
    Then user capture status code
    And user capture status line
    And user capture response time
    And user capture response body
    And user capture response headers

  Scenario: retrieve customer using HTTP GET Request
    Given user configure BaseURI in Rest Assured
    And user get the RequestSpecification interface object
    When user select HTTP GET Request
    Then user capture status code
    And user capture status line
    And user capture response time
    And user capture response body
    And user capture response headers

      Scenario: delete customer using HTTP DELETE Request
    Given user configure BaseURI in Rest Assured
    And user get the RequestSpecification interface object
    When user select HTTP DELETE Request
    Then user capture status code
    And user capture status line
    And user capture response time
    And user capture response headers
    
    
      Scenario: retrieve customer using HTTP GET Request
    Given user configure BaseURI in Rest Assured
    And user get the RequestSpecification interface object
    When user select HTTP GET Request
    Then user capture status code
    And user capture status line
    And user capture response time

    
    
    
    
    
    
    
    
    
    
    
    