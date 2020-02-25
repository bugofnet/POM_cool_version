Feature: I want to test user profile change

  Scenario: I want to check user profile fields
    Given  I go to main page
    And I login with correct credentials
    When I want to edit user profile
    Then I fill in user name with "John"
    And I fill in user surname with "Doe"
    And I select "Customer" in role
    And I save all changes