Feature: Registration
  @regression
  Scenario: I should able to register successfully
    Given I am on register page
    When I enter required registration details
    Then I should able to register successfully
    And I should be logged in

    Scenario: I should able send email to friend
      Given I  click"Mackbook"