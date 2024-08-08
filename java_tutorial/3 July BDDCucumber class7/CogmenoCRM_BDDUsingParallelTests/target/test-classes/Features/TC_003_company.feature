Feature: Test Company Page Functionality of Cogmento CRM

  Scenario: validate login page functionality 
    Given user open url in "chrome" browser
    When user enter valid username and password
      | prafulp1010@gmail.com | Pr@ful0812 |
    Then user click on login button

  Scenario: validate home functionality 
    Then user validate home page title
    And user validate home page url
    * user validate logo

  Scenario: validate company page functionality
    Given user verify user on companies page
    When user click on create new company
    And user enter name, website, address, industry, no.ofEmployees and select priority
    Then user click on savecompany button
    And user delete company
    
 Scenario: validate logout functionality 
    When user click on profile icon and click on logout menu 
