Feature: End To End flow of Sauce Demo Applicatio

  Scenario: Validate login page
    Given user open url in "chrome" browser and user is on login page
    When user enter valid username and password
      | standard_user | secret_sauce |
    Then user click on login button

  Scenario: validate AddtoCart Functionality
    Given user is on home page
    When user sort product high to low price
    And user add first 3 products to cart
    Then user click on add to cart
    And user checkout

  Scenario: validate Checkout: Your Information Functionality
    Given user is on checkoutInformation page
    When user enter firstname , lastname , postal code
      | Alfiya | Sanadi | 416410 |
    Then user click on continue button
    And user click on Finish

  Scenario: validate Order Success page
    Given user is on Checkout: Complete! page
    Then user validate success message
    And user click on home button
    * user logout the application
