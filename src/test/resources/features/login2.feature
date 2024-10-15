Feature: Login Page
Scenario:[Android] User successfully login
Given User is on login page
  And User input name as "<name>"
  And User input email as "<email>"
  And User click button login
  Then User see homepage
