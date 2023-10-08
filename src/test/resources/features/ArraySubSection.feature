#Author: sumathisvelayutham

Feature: Array

	 Background:
	 Given User logged in to the home page
	
	 @Array
   Scenario Outline: verify user is able to perform action in "<ArraySubSection>" in Array page
   Given User is in the Array page
    When User clicks on "<ArraySubSection>" link
    Then I validate user is in "<ArraySubSection>" page
    When User clicks on Try Here button
    Then I verify user able to view Assessment page
     And I verify text area and run button is displayed
    When User provide valid input in the input field and clicks on run button
    Then I verify output is displayed
    When User provide invalid input in the input field and clicks on run button
    Then I verify error message is displayed and click on ok button

		Examples:
		|ArraySubSection          |
		|Arrays in Python         |
		|Arrays Using List        |
		|Basic Operations in Lists|
		|Applications of Array    |