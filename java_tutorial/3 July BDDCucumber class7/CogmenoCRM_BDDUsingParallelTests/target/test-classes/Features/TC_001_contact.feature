Feature: Test Contact Page Functionality of Cogmento CRM

  Scenario: validate login page functionality 
    Given user open url in "chrome" browser
    When user enter valid username and password
      | prafulp1010@gmail.com | Pr@ful0812 |
    Then user click on login button

  Scenario: validate home functionality 
    Then user validate home page title
    And user validate home page url
    * user validate logo

  Scenario: validate contact page functionality
    When user verify user is on contact page
    And user click on create contact
    Then user enters firstname, lastname, companyName, email, select category, position and department
    And user click on savecontacts button
    * user deletes contact

  Scenario: validate logout functionality 
    When user click on profile icon and click on logout menu 
