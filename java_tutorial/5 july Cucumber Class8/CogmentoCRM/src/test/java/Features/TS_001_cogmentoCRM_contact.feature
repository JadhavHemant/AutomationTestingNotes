Feature: Test Cogmento CRM Application

  Scenario: Validate login functionality
    Given user is on login Page
    When user enter valid credentails
      | prafulp1010@gmail.com | Pr@ful0812 |
    And user click on login button

  Scenario: validate home page functionality
    When user is on home page validate home page title as "Cogmento CRM"
    And user validate home page url
    And user validate home page logo

  Scenario Outline: Validate contact page functionality
    When user is on contact page and validate contact page url contains "contacts"
    And user click on create button
    And user enter contact information from Excel Sheet using "<SheetName>" and <RowNumber>
    And user click on save button
    And user delete contanct

    Examples: 
      | SheetName   | RowNumber |
      | ContactInfo |         0 |
      | ContactInfo |         1 |
      | ContactInfo |         2 |
      | ContactInfo |         3 |

  Scenario: validate logout functionality
    When user click on profile icon
    And user logout the application
    And user close the session
