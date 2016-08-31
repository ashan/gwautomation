Feature: Log in to BillingCenter

  Scenario: Try to log in to BillingCenter with INVALID credentials
    Given I am on the BillingCenter login page
    When I enter 'su' as the username
    And 'blah' as the password
    And click on Login button
    Then I should receive an error message

  Scenario: Log in to BillingCenter with VALID credentials
    Given I am on the BillingCenter login page
    When I enter 'su' as the username
    And 'gw' as the password
    And click on Login button
    Then I should be logged in to BillingCenter

