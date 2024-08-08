Feature: Test Copy Right Goverment Application

  Scenario: Validate Register Page Functionality
    Given user open register page url in "incognito" browser
    When user select title and enter name and enter last name
    And user enter address and city and select country and select state
    And user enter nationality and enter pincode
    And user enter email id and mobile number
    And user select the user type "Society User"
