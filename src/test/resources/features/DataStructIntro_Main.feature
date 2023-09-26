#Author: sumathisvelayutham

@RegressionDataStructure
Feature: Data Structure

	Background:
	Given User logged in to the home page
	
  @DataStructure
  Scenario: verify user is able to view Data Sturcture Introduction page
    When User clicks on Get Started button below the Data Structures Introduction
    Then I verify user views the Data structure Introduction screen
    	And I validate Data Structure Content
    	And I verify the sign out 
    	And I verify Time Complexcity section

  @DataStructure
  Scenario: verify user is able to perform actions in TimeComplexcity page
    Given User is in the TimeComplecity page
    When User clicks on Try Here button
    Then I verify user able to view Assessment page
     And I verify text area and run button is displayed
    When User provide valid input in the input field and clicks on run button
    Then I verify output is displayed
    When User provide invalid input in the input field and clicks on run button
    Then I verify error message is displayed and click on ok button
    
     