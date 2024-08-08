Feature: Test Facebook Application

  Scenario Outline: Validate the Register Page Functionality
    Given user is on register page
    When user enter firstname and lastname from "<ExcelSheetName>" and <rownumber>

    Examples: 
      | ExcelSheetName | rownumber |
      | PersonalInfo   |         0 |
      | PersonalInfo   |         1 |
      | PersonalInfo   |         2 |
      | PersonalInfo   |         3 |
