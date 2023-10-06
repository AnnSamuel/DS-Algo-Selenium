
@queue
Feature: Title of your feature
  I want to use this template for my feature file

  @tag1
    Scenario: Title of your scenario
  	Given The user is in the Queue  page after logged in
  	When The user clicks  the "Implementation of Queue in Python" button
  	And The user should be directed to "Implementation of Queue in Python" Page 
  	And The user clicks Try Here button
  	Then The user should be redirected to a page having an tryEditor with a Run button to test
  
  @tag2
  Scenario: Title of your scenario2
  	Given The user is in the Queue  page after logged in
  	When The user clicks  the "Implementation using collections.deque" button
  	And The user should be directed to "Implementation using collections.deque" Page 
  	And The user clicks Try Here button
  	Then The user should be redirected to a page having an tryEditor with a Run button to test
  @tag3	
  Scenario: Title of your scenario3
  	Given The user is in the Queue  page after logged in
  	When The user clicks  the "Implementation using array" button
  	And The user should be directed to "Implementation using array" Page 
  	And The user clicks Try Here button
  	Then The user should be redirected to a page having an tryEditor with a Run button to test
  	
  @tag4	
  Scenario Outline: Title of your scenario4
  	Given The user is in the Queue  page after logged in
  	When The user clicks  the "Queue Operations" button
  	And The user should be directed to "Queue Operations" Page 
  	And The user clicks Try Here button
  	Then The user should be redirected to a page having an tryEditor "<statements>" with a Run button to test	
  	And verify "<output>"
  	
		Examples: 
		|statements|							|output|
		|print (\\"Hello\\") |		|Hello|
		|print(\\"WelCome\\") |	|WelCome|
		
 