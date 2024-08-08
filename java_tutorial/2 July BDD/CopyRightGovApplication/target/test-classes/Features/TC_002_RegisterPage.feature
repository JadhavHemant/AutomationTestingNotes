Feature: Test Copy Right Goverment WebSite

  Scenario: Validate Register Page Functionality for Copy Right Goverment WebSite
    Given user open register page url in "edge" browser
    When user select title and enter name and enter last name
    And user enter address and city and select country and select state
    And user enter nationality and enter pincode
    And user enter email id and mobile number
    And user select the user type "General User"
