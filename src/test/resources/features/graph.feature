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
@graph
Feature: Graph

  @graph1
  Scenario: verify graph page
  Given The user opens Home Page
  And The user is in the Graph page after logged in
  When The user clicks Graph button
  Then The user should be directed to Graph Page
  
  @graph2
  Scenario Outline: verify try editor in graph page
    Given The user opens Home Page
    And The user is in the Graph page after logged in
    And The user clicks Graph button
    When The user clicks Try Here button to be redirected to a page having an tryEditor
    Then should be able to input "<print_name>"
    And clicked on Run
    And verify output with "<expected_output>"

    Examples: 
      | print_name      | expected_output |
      | print \\"Ann\\" | Ann             |
      | kdjdkddkdjdkjdd | ERROR           |

@graph3
  Scenario: verify graph Representations page
  Given The user opens Home Page
  And The user is in the Graph page after logged in
  When The user clicks Graph Representations button
  Then The user should be directed to Graph Representations Page
  
  @graph4
  Scenario Outline: verify try editor in graph page
    Given The user opens Home Page
    And The user is in the Graph page after logged in
    And The user clicks Graph Representations button
    When The user clicks Try Here button to be redirected to a page having an tryEditor
    Then should be able to input "<print_name>"
    And clicked on Run
    And verify output with "<expected_output>"

    Examples: 
      | print_name      | expected_output |
      | print \\"Ann\\" | Ann             |
      | print \\"Sam\\" | Sam             |

