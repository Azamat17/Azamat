@so
Feature: Wikipedia Search functionality
  Scenario Outline: Wiki search Functionality Title Verification
    Given User is on Wikipedia page
    When User types "<searchKey>" in the wiki search box
    And User clicks search wiki button
    Then User sees "<title>" is in the wiki title

    Examples: Test data for search functionality

      | searchKey    | title        |
      | Steve Jobs   | Steve Jobs   |
      | Ricky Martin | Ricky Martin |
      | Enzo Ferrari | Enzo Ferrari |
      | Lionel Messi | Lionel Messi |
# option command L for aligning automatically ==> Mac