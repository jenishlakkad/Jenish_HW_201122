Feature: As a user, I should able to register

  @regression
  Scenario: I should able to register successfully
    Given I am on homepage
    When I click on register button
    Then I redirect to the register page
    And I enter my Personal details
    And I enter my company details
    And I enter password
    When I click on register button
    Then I should able to register successfully
    And I should redirect to homepage
    When I click on Apple MacBook Pro 13-inch
    Then I should redirect to macbook pro page
    When I click on email a friend
    Then I should redirect to email a friend page
    When I enter all required details
    And I click on send email
    Then My email should be send successfully




