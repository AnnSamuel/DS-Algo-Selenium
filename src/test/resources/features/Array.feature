#Author: sumathisvelayutham

Feature: Array

	Background:
	Given User logged in to the home page
	
  @Array
  Scenario: verify user is able to view array page
    When User clicks on Get Started button below the Array
    Then I verify user views array screen
    	And I validate array heading
    	And I verify the four sublinks in topics covered	