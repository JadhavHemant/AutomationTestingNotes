Feature: Test Government India Application

  @RegisterPage
  Scenario: Validate registration functionality
    Given user open register page url on browser
    When user select title, enter firstname and lastname
    And user enter address, city and select country, state and district
    And user enter nationality, pincode, email and mobilenumber
    Then user enter userId, password and confirmpassword
