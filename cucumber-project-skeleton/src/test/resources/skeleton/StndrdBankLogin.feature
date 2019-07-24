
Feature: My Standard Charted bank account

Background: Launching of the bank landing page
Given Adhithya Has done with browser configuration
Then He launches the application in his chrome browser
  

  Scenario: Sign In for Adhithya
    Given He clicks on the sign in link
    Then He enters the valid credintials
    And He clicks on submit button
    

 
  Scenario: SignUp for the gust user
    Given Guest user clicks on the signup link
    When He provides all the mandotory data
    Then He clicks on the submint and id is generated

  Scenario: Adhithya wanted to reset his password 
    Given He clicks on the forget password link
    Then He enters mobile number
    And He recives otp and the same he provides 
    Then He will be able to reset password