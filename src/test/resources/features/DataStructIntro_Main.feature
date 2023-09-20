#Author: sumathisvelayutham

@RegressionDataStructure
Feature: Data Structure

  @DataStructure
  Scenario: verify user is able to view Data Sturcture Introduction page
    Given User logged in to the home page
    When User clicks on Get Started button below the Data Structures Introduction
    Then I verify user views the Data structure Introduction screen
    	And I validate Data Structure Content
    	And I verify the sign out 
    	And I verify Time Complexcity section