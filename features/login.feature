Feature: User Authentication

  Scenario Outline: As a user i should be able to login with valid credential
    Given I already in login page
    When I input the username field with <username>
    And I input the password field with <password>
    And I click button login
    Then I should be able to redirect to homepage

    Examples:
    |username|password|
    |standard_user| secret_sauce|
    |problem_user |secret_sauce |
    |performance_glitch_user|secret_sauce|