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
@home
Feature: DS Algo Portal & Home Page
  I want to use this template for my feature file

  @tag1
  Scenario: DS Algo Portal
    Given The user opens DS Algo portal link
    Then The user should land in DS Algo portal page

  @tag2
  Scenario: DS Algo Portal to Home Page & Check panes
    Given The user opens DS Algo portal link
    When The user clicks the "Get Started" button
    Then The user should be redirected to homepage
    And The user should see 7 panes with different data structires
    Then I should see 6 different data structure entries in that dropdown

  @tag5
  Scenario: Home - check error msg if clicked on any button
    Given The user opens Home Page
    When The user clicks any of the "Get Started" buttons below the data structure
    Then It should alert the user with a message "You are not logged in"
    When The user selects any data structures item from the drop down without Sign in.
    Then It should alert the user with a message "You are not logged in"
    When The user clicks "Sign in"
    Then The user should be redirected to Sign in page
    When User clicks on go back arrow in browser
    When The user clicks Register
    Then The user should be redirected to Register form

  @tag9
  Scenario: Home - You are logged in msg
    Given The user opens Home Page
    When The user is in the Home page after logged in
    Then It should alert the user with a message You are logged in
    When The user clicks  "Get Started" button below the "Data structures-Introduction"
    Then The user should land in "Data Structures- Introduction Page"
    When User clicks on go back arrow in browser
    When The user clicks the "Getting Started" button in Array Pane or select Array item from the drop down menu
    Then The user be directed to "ARRAY" Data Structure Page
