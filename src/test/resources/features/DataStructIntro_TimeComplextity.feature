#Author: sumathisvelayutham

Feature: Data Structure

  @TimeComplexcity
  Scenario: verify user is able to perform actions in TimeComplexcity page
    Given User logged in to the TimeComplecity page
    When User clicks on Try Here button
    Then The user should be redirected to a page having an tryEditor with a Run button to test
    	Then I validate Data Structure Content
    	And I verify the sign out 
    	And I verify Time Complexcity section