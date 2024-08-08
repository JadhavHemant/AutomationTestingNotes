Feature: Pusha the Rise Film Search

  Scenario: validate film search
    Given user open url in "chrome"
    When user enter Pusha the Rise keyword in google search
    Then user click on search

  Scenario: validate Wikipedia link Release Date
    Given user is on  Pusha the Rise page
    When user click on Wikipedia link
    Then capture the wikipedia release date
    And go back to previous page

  Scenario: validate IMDB link  Release Date
    Given user is on  Pusha the Rise page
    When user click on IMDB link
    Then capture the IMDB release date
    And compare relasedates
