Feature: Valid Login
  Background:
    Given User Open Browser Navigate the website Page login
  Scenario:
    When User Press login button
    And User input Valid Data “ name”, ”Email”
    Then User Press Login button
