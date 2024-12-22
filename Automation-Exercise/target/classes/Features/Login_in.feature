Feature: Register
  Background:
    Given User Open Browser Navigate the website Page Sign up
    When user Press Signup button
    And user input Valid Data “ name”, ”Email”
    Then user Press Signup button

  Scenario: User Can Fill Form with valid All Data scenario
    When user input All Valid Data “ name”, ”Email” ,”FName” ,” LName” , “Password”,”phone”

    And User click on the ”Creat Account” button

    Then Message successfully submission
  Scenario: User Can Delete Account
    When User click on the ”Delete Account” button
    Then Message successfully deleted



