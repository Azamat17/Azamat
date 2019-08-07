@back
Feature: Google Title verification
  #Gherkin

  Background: Login to Google
    When User is on Google page

  @googleTitle
  Scenario: Google Title verification
    Then User searches for apples
    And User should see apples inside of the title

    @new
  Scenario: Google title verification with preferred data
    And User searches for a word "iphone"
    Then User should see a word "iphone" inside of the title

    @dataType
    Scenario: Google Title Test
      Given User tests with words "apple" "pen" "paper"
      Then User checks numbers 12 and 55
