#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: SignIn
  I want to use this template for my feature file

  @signIn1
  Scenario: verify username textbox
    Given The user logs into "login" page
    When User clicks sign in without entering username and pswd
    Then It should display an error Please fill out this field below Username textbox

  @signIn2
  Scenario Outline: enter invalid username or pswd
    Given The user logs into "login" page
    When The user enters an invalid "<user id>" or invalid "<password>" combination
    Then It should display an error Invalid Username and Password
     
        Examples: 
      | user id     | password |
      | abcdef123   | quantumqa|
      | dsalgoproj  | wxyz789  |
      
@signIn3

    Scenario: Home - check error msg
    Given The user logs into "login" page
    When The user is in the Home page after logged in
    Then It should alert the user with a message You are logged in
    