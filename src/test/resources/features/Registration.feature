Feature: Feature to test Register Functionality

  Scenario: Test Register Page with all fields empty
    Given The user opens Register Page
    When The user clicks Register button with all fields empty
    Then It should display an error "Please fill out this field" below Username textbox

  Scenario Outline: Test Register Page with only username
    Given The user opens Register Page
    When The user clicks Register button after entering <username> with other fields empty
    Then It should display an error "Please fill out this field" below Password textbox

    Examples: 
      | username    |
      | SDETStudent |

  Scenario Outline: Test Register Page without confirm password
    Given The user opens Register Page
    When The user clicks Register button after entering <username> and <password> with Password Confirmation field empty
    Then It should display an error "Please fill out this field" below Password Confirmation textbox

    Examples: 
      | username    | password |
      | SDETStudent | Sted@123 |
#
  #
  # Scenario Outline: Test Register Page username with invalid  credential
  #Given The user opens Register Page
  #When The user enters with <username>
  #And Enters "password" and  confirm "password"
  #And Clicks on Register button
  #Then It should display an error message "Please enter a valid username"
  #
  #Examples:
  #|username|password|
  #|c#$#*^%|Sted@123 |
  Scenario Outline: Test Register Page username for Different passwords in password and Passward Confirmation Field
    Given The user opens Register Page
    When The user enters username "<username>"
    And Enters different password "<password>" and confirmpassword "<Confirmpassword>"
    And Clicks on Register button
    Then It should display an error message "Please enter a valid username"

    Examples: 
      | username | password | Confirmpassword |
      | Nympy    | Ninja    | NinjaSdet       |

  Scenario Outline: Test Register Page username for valid Credential
    Given The user opens Register Page
    When The user enters username "<username>"
    And Enters different password "<password>" and confirmpassword "<Confirmpassword>"
    And Clicks on Register button
    Then It should display "New Account Created. You are logged in as <username>" on Home Page.
    Examples: 
      | username | password | Confirmpassword|
      | Vnaoaitum | Qninja@94|Qninja@94|
