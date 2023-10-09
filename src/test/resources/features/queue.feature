
@queue
Feature: Queue
  This feature to verify queue feature

  @tag1
    Scenario: verify queue feature scenario1
  	Given The user is in the Queue  page after logged in
  	When The user clicks  the "Implementation of Queue in Python" button
  	And The user should be directed to "Implementation of Queue in Python" Page 
  	And The user clicks Try Here button
  	Then The user should be redirected to a page having an tryEditor with a Run button to test
  
  @tag2
  Scenario: verify queue feature scenario2
  	Given The user is in the Queue  page after logged in
  	When The user clicks  the "Implementation using collections.deque" button
  	And The user should be directed to "Implementation using collections.deque" Page 
  	And The user clicks Try Here button
  	Then The user should be redirected to a page having an tryEditor with a Run button to test
  @tag3	
  Scenario: verify queue feature scenario3
  	Given The user is in the Queue  page after logged in
  	When The user clicks  the "Implementation using array" button
  	And The user should be directed to "Implementation using array" Page 
  	And The user clicks Try Here button
  	Then The user should be redirected to a page having an tryEditor with a Run button to test
  	
  @tag4	
  Scenario Outline: verify queue feature with "<statements>" and "<output>"
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
		
 