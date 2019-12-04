Feature: Teacher API module

  @teacherAPI
  Scenario: Creating teacher using the Create teacher API
    Given Teacher is created with values
    Examples:
          | firstName    |   John    |
          | lastName     |   Wick    |
          | batch        |   11      |
          | subject      |   Java    |
          | section      |   AP-1    |
          | birthDate    | 12/12/1987 |
          | joinDate     | 12/12/2019 |
          | emailAddress | john@gnail.com |
          | phone        | 2124445566   |
          | gender       |  Male      |
          | permenantAdd | 123. N State st |
          | salary       | 1000000         |
          |department    |  Maths          |
          |password      |  123abc         |

        When User hits the web service "http://api.cybertektraining.com/teacher/create"
        Then User verifies status code "200"
        And User verifies response with Database

