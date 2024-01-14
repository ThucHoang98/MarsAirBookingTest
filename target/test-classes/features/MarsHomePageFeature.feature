
Feature: Mars Air Home Page Feature

  Background:
    Given I'm on Mars Air Homepage

  Scenario Outline: Check basic flow
    When I select departure date as "<departure>"
    And I select return date as "<return>"
    Then I got the result
    And I verify the seat is "<result>"
    Examples: Promotion information
      | departure | return                        | result                                    |
      | July      | December (two years from now) | Seats available!                          |
      | July      | December (next year)          | Sorry, there are no more seats available. |

  Scenario Outline: Check multiple promotion
    When I select departure date as "July"
    And I select return date as "December (two years from now)"
    When I add promotion code as "<promo_code>"
    Then I got the result
    And I verify the content is "<content>"
    Examples: Promotion information
      | promo_code  | content                                          |
      | AF3-FJK-418 | Promotional code AF3-FJK-418 used: 30% discount! |
      | AF3-FJK-417 | Sorry, code AF3-FJK-417 is not valid             |
