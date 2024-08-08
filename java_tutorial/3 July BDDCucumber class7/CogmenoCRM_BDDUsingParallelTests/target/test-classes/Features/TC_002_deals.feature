Feature: Test Deals Page Functionality of Cogmento CRM

 Scenario: validate login page functionality 
    Given user open url in "chrome" browser
    When user enter valid username and password
      | prafulp1010@gmail.com | Pr@ful0812 |
    Then user click on login button

  Scenario: validate home functionality 
    Then user validate home page title
    And user validate home page url
    * user validate logo

  Scenario: validate deals page functionality
    Given user verify user on deals page
    When user click on create new deal
    And user enter title, close date, description, probabilitlity, select stage and type
    Then user click on savedeals button
    And user delete deals

  Scenario: validate logout functionality 
    When user click on profile icon and click on logout menu 
