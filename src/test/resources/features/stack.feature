@stack
Feature: Title of your stack
  I want to use this template for my feature file

  @tag1
   Scenario: Title of your scenario3
   	Given  The user is in the Stack page after logged in
   	When  The user clicks "Operations in Stack" button
   	And The user should be directed "Operations in Stack" to Page
    And The user clicks Try Here button
    Then The user should be redirected to a page having an tryEditor with a Run button to test
  @tag2   
	Scenario: Title of your scenario2
		Given The user is in the Stack page after logged in
		When The user clicks "Implementation" button
		And The user should be directed "Implementation" to Page
		And The user clicks Try Here button
    Then The user should be redirected to a page having an tryEditor with a Run button to test
    
    
   @tag3 
	Scenario: Title of your scenario3
		Given The user is in the Stack page after logged in
		When The user clicks "Applications" button
		And The user should be directed "Applications" to Page
		And The user clicks Try Here button
    Then The user should be redirected to a page having an tryEditor with a Run button to test
	
	@tag4
	Scenario: Title of your scenario4
		Given The user is in the Stack page after logged in
		When The user clicks "Implementation" button 
		And The user clicks "Practice Questions" button
		Then The user should be directed "Practice Questions" to Page
		
		  
