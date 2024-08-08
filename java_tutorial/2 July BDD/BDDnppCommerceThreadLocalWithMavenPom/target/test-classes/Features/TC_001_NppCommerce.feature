Feature: Test the npp commerce application

  Scenario: validate the customers functionality
    Given user open a url in  "chrome" browser
    Then user enters username and password and click on login button
    Then user click on Customers symbol and click on customers and click on Add New button
    Then user enters email,password,firstname,lastname
    When user select gender
    And user enter company name and select tax and select newsletter and click on save
