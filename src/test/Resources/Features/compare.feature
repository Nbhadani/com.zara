Feature: User should be able to compare two different products
@compare
  Scenario: User should be able to compare two different products successfully
    Given  User is on Home Page
    When User click on Book category
    And User Click on Add to Compare for product Fahrenheit by Ray Bradbury
    And User click on Book category
    And  User Click on Add to Compare for product First Prize Pies
    And User Click on Product comparision on Popup Bar
    Then Compare Products message should be displayed



