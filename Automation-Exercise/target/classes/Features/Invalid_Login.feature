Feature: Valid Login
  Background:
    Given User open Browser Navigate the website Page login
  Scenario:
    When User Click login button
    And User input InValid Data “ name”, ”Email”
    Then User Click Login button