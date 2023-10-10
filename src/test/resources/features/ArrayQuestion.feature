#Author: sumathisvelayutham

Feature: Array

	 Background:
	 Given User logged in to the home page

  # @Array
   Scenario: verify user is able to perform action in array in python page
    When User clicks on Get Started button below the Array
    Then I verify user views array screen
    And I validate array heading
    Given User is in the Array page 
    When User clicks on "Arrays in Python" link
    Then I validate user is in "Arrays in Python" page   
    When User clicks Practice Questions
    Then I verify user is in Practice Questions page
    When User clicks on "Search the array"
    Then I verify user able to view Assessment page
       And I verify text area submit and run button is displayed
       And I clear the text editor box
    When User clicks on go back arrow in browser
    Then I verify user is in Practice Questions page
    When User clicks on "Max Consecutive Ones"
    Then I verify user able to view Assessment page
       And I verify text area submit and run button is displayed
       And I clear the text editor box
    When User clicks on go back arrow in browser
    Then I verify user is in Practice Questions page
    When User clicks on "Find Numbers with Even Number of Digits"
    Then I verify user able to view Assessment page
       And I verify text area submit and run button is displayed
       And I clear the text editor box
    When User clicks on go back arrow in browser
    Then I verify user is in Practice Questions page
    When User clicks on "Squares of a Sorted Array"
    Then I verify user able to view Assessment page
       And I verify text area submit and run button is displayed
       And I clear the text editor box