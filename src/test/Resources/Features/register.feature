
Feature: User should able to register successfully,


  @test
  Scenario: User should be able to register successfully
    Given User is on homepage
    When User click on register button
    And User enter first name
    And User enter last name
    And User enter email address
    And User enter password
    And User enter confirm password
    And User click on registersubmit button
    Then User should be able to see registration successfully
