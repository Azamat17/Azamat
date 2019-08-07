@wikipedia
Feature: Wikipedia search feature

  Background: User searched for given text
    Given User is on Wikipedia Homepage
    When User types "Steve Jobs" in the wikipedia search box
    And User clicks wikipedia search button

  Scenario: Wikipedia Search Functionality Title Verification

    Then User sees "Steve Jobs" is in the wikipedia title

    Scenario: Wikipedia header verification using search feature

      Then User sees "Steve Jobs" is in the main header

      Scenario: Wikipedia Search Functionality Image Header Verification

        Then User sees "Steve Jobs" is in the image header