Feature: OrangeHRM Application
Scenario: Validate AddCustomer functionality
Given user is on loginpage
When user enters firstname and lastname
Then user enters mobile number and address
Then user clicks on the submit button

Scenario: Validate Add Tariff plans Functionality
Then monthly rentals and Free local minutes
Then Free International minutes and Free SMS pack
Then Free local minutes charge and International and SMS minute charges
* click on submit button

Scenario: Add Tarif plan to customer
When Enter customer ID 
Then user click on submit button

Scenario: Validate Pay billing
Then user enters Customer ID
* user clicks on Submit button


