Feature: Test Cogmento CRM Application

  Scenario: Validate the login page functionality
    Given User open a url in "chrome" browser
    When user enter the valid user name and valid password
      | prafulp1010@gmail.com | Pr@ful0812 |
    Then user click login button

  Scenario: validate HomePage functionality
    When user is on home page and validate home page title
    And user validate Url

  Scenario Outline: Validate Contact page Functionality
    When user click contact link
    Then user click on create button
    Then user enter "<firstName>","<lastName>" and Select as "<status>"
    And user click on save button

    Examples: 
      | firstName | lastName | status     |
      | Anjali    | Gurav    | On Hold    |
      | Roohi     | patil    | active     |
      | Komal     | pujari   | inactive   |
      | suraj     | Patil    | terminated |

  Scenario: Validate Company page functionality
    When user click on company page functinality
    And user click on Company link
    Then user enter name, Website,Address,Email
      | name       | Website       | Address | Email           |
      | persistent | www.persi.com | pune    | persi@gmail.com |
    And user click on Cmpsave button

  Scenario: validate deals page functionality
    When user click on deals link
    Then user click deals create button
    And user enter Title and user select date as 15 , monthYear as "july 2025" and time as "12:30"
    Then user click on dealsSave button
